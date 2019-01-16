package com.biva.multicast;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang.ArrayUtils;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import mx.com.biva.codec.api.IEncoder;
import mx.com.biva.codec.core.impl.EncoderImpl;
import mx.com.biva.codec.core.sbe.ClosingPriceEncoder;
import mx.com.biva.codec.core.sbe.DebtMetalsMoneyInstrumentCatalogEncoder;
import mx.com.biva.codec.core.sbe.IssuerOperativityEncoder;
import mx.com.biva.codec.core.sbe.IssuersLiftingEncoder;
import mx.com.biva.codec.core.sbe.LocalGlobalMarketCatalogEncoder;
import mx.com.biva.codec.core.sbe.RegistryOperationsEncoder;
import mx.com.biva.codec.core.sbe.StatusChangesEncoder;
import mx.com.biva.codec.core.sbe.SystemEventEncoder;
import mx.com.biva.codec.core.sbe.TransactionChangeStatusEncoder;
import mx.com.biva.codec.core.sbe.WarrantsInstrumentCatalogEncoder;
import mx.com.biva.codec.core.sbe.WeightedAveragePriceEncoder;
import mx.com.biva.codec.core.vo.ClosingPriceVO;

public class ConsumeJson {
    private static DatagramSocket socket = null;
    private static final short HEADER_LENGTH = 17;
    private static final int TOTAL_MESSAGE = 1;
    
    private static final int SESSION = 14;
    private static final String CLOSING_PRICE_TYPE = "N";
    private static final String DEBT_METALS_MMARKET_TYPE = "b";
    private static final String WARRANTS_INSTRUMENT_CATALOG_TYPE = "c";
    private static final String STATUS_CHANGES_TYPE = "4";
    private static final String LOCAL_GLOBAL_MARKET_CATALOG_TYPE = "J";
    private static final String TRADE_CANCELLATION_TYPE = "H";
    private static final String WEIGHTED_AVERAGE_PRICE_TYPE = "M";
    private static final String CAPITAL_TRADES_TYPE = "P";
    private static final String REGISTRY_OPERATIONS_TYPE = "Z";
    private static final String ISSUER_SUSPENSION_TYPE = "K";
    private static final String ISSUERS_LIFTING_TYPE = "l";
    private static final String TRANSACTION_CHANGE_STATUS_TYPE = "L";
    private static final String ISSUER_OPERATIVITY_TYPE = "o";
    private static final String SYSTEM_EVENT_TYPE = "S";
    private static int MARKET_DATA_GROUP;
    
    public static void main(String[] args) throws IOException {
        
        
            
            /**Creamos un Objeto de tipo Properties*/
               Properties propiedades = new Properties();
                
               /**Cargamos el archivo desde la ruta especificada*/
               propiedades
                 .load(new FileInputStream(
                   "settings.properties"));
             
               /**Obtenemos los parametros definidos en el archivo*/
        
        final String path = propiedades.getProperty("PATH");
        final String ip = propiedades.getProperty("IP_BROADCAST");
        final String strPort = propiedades.getProperty("PORT_BROADCAST");
        final String group = propiedades.getProperty("GROUP");
        final String strTotalMessages = propiedades.getProperty("TOTAL_MESSAGES");
        final String strSecondsWaiting = propiedades.getProperty("MILLISECONDS_WAITING");
        MARKET_DATA_GROUP = Integer.parseInt(group);     
        Integer port = Integer.parseInt(strPort);
        Integer totalDeMensajes = Integer.parseInt(strTotalMessages);
        Integer tiempoDeEspera = Integer.parseInt(strSecondsWaiting);
                        
             
        BufferedReader br = new BufferedReader(
                new FileReader(path));
        String line = null;
        Short messageLenght;
        
        Integer conteoDeMensajes = 0;
        
        
        while ((line = br.readLine()) != null) {

            try {
                JsonParser parser = new JsonParser();
                JsonObject rootObj = parser.parse(line).getAsJsonObject();
                JsonObject locObj = rootObj.getAsJsonObject("Message");
                String type = locObj.get("Type").getAsString();
                final String messageString;
                final IEncoder encoder = new EncoderImpl();
                final byte[] byteResult;
                final byte[] message;
                
                switch (type.toString()) {
                case CLOSING_PRICE_TYPE:
                    messageString = new Gson().fromJson(locObj, ClosingPriceVO.class).toString();
                    System.out.println(messageString);
                    messageLenght = ClosingPriceEncoder.BLOCK_LENGTH + HEADER_LENGTH+2;
                    byteResult = encoder.encode(messageString);
                    
                    message = ArrayUtils.addAll(createHeader(rootObj.get("SeqNum").getAsInt(),messageLenght,(short)ClosingPriceEncoder.BLOCK_LENGTH),byteResult);
                    
                    //System.out.println(Arrays.toString(message));
                    broadcast(message, InetAddress.getByName(ip),port);
                    
                break;

                case DEBT_METALS_MMARKET_TYPE:
                   
                    messageString = new Gson().fromJson(locObj, DebtMetalsMoneyInstrumentCatalogVO.class).toString();
                    System.out.println(messageString);
                    messageLenght = DebtMetalsMoneyInstrumentCatalogEncoder.BLOCK_LENGTH + HEADER_LENGTH+2;
                    byteResult = encoder.encode(messageString);
                    message = ArrayUtils.addAll(createHeader(rootObj.get("SeqNum").getAsInt(),messageLenght,(short)DebtMetalsMoneyInstrumentCatalogEncoder.BLOCK_LENGTH),byteResult);
                    //System.out.println(Arrays.toString(message));
                    broadcast(message, InetAddress.getByName(ip),port);
                    break;
                    
                case WARRANTS_INSTRUMENT_CATALOG_TYPE:
                    
                    messageString = new Gson().fromJson(locObj, WarrantsInstrumentCatalogVO.class).toString();
                    System.out.println(messageString);
                    messageLenght = WarrantsInstrumentCatalogEncoder.BLOCK_LENGTH + HEADER_LENGTH+2;
                    byteResult = encoder.encode(messageString);
                    message = ArrayUtils.addAll(createHeader(rootObj.get("SeqNum").getAsInt(),messageLenght,(short)WarrantsInstrumentCatalogEncoder.BLOCK_LENGTH),byteResult);
                    //System.out.println(Arrays.toString(message));
                    broadcast(message, InetAddress.getByName(ip),port);
                    
                break;
                
                case STATUS_CHANGES_TYPE:
                    messageString = new Gson().fromJson(locObj, StatusChangesVO.class).toString();
                    System.out.println(messageString);
                    messageLenght = StatusChangesEncoder.BLOCK_LENGTH + HEADER_LENGTH+2;
                    byteResult = encoder.encode(messageString);
                    message = ArrayUtils.addAll(createHeader(rootObj.get("SeqNum").getAsInt(),messageLenght,(short)StatusChangesEncoder.BLOCK_LENGTH),byteResult);
                    //System.out.println(Arrays.toString(message));
                    broadcast(message, InetAddress.getByName(ip),port);
                break; 
                
                case LOCAL_GLOBAL_MARKET_CATALOG_TYPE:
                    messageString = new Gson().fromJson(locObj, LocalGlobalMarketCatalogVO.class).toString();
                    System.out.println(messageString);
                    messageLenght = LocalGlobalMarketCatalogEncoder.BLOCK_LENGTH + HEADER_LENGTH+2;
                    byteResult = encoder.encode(messageString);
                    message = ArrayUtils.addAll(createHeader(rootObj.get("SeqNum").getAsInt(),messageLenght,(short)LocalGlobalMarketCatalogEncoder.BLOCK_LENGTH),byteResult);
                    //System.out.println(Arrays.toString(message));
                    broadcast(message, InetAddress.getByName(ip),port);
                break;
                
                case REGISTRY_OPERATIONS_TYPE:
                    messageString = new Gson().fromJson(locObj, RegistryOperationsVO.class).toString();
                    System.out.println(messageString);
                    messageLenght = RegistryOperationsEncoder.BLOCK_LENGTH + HEADER_LENGTH+2;
                    byteResult = encoder.encode(messageString);
                    message = ArrayUtils.addAll(createHeader(rootObj.get("SeqNum").getAsInt(),messageLenght,(short)RegistryOperationsEncoder.BLOCK_LENGTH),byteResult);
                    //System.out.println(Arrays.toString(message));
                    broadcast(message, InetAddress.getByName(ip),port);
                break;
                
                case ISSUER_SUSPENSION_TYPE:
                    messageString = new Gson().fromJson(locObj, IssuerSuspensionVO.class).toString();
                    System.out.println(messageString);
                    messageLenght = IssuerOperativityEncoder.BLOCK_LENGTH + HEADER_LENGTH+2;
                    byteResult = encoder.encode(messageString);
                    message = ArrayUtils.addAll(createHeader(rootObj.get("SeqNum").getAsInt(),messageLenght,(short)IssuerOperativityEncoder.BLOCK_LENGTH),byteResult);
                    //System.out.println(Arrays.toString(message));
                    broadcast(message, InetAddress.getByName(ip),port);
                break;
                
                case ISSUERS_LIFTING_TYPE:
                    messageString = new Gson().fromJson(locObj, IssuersLiftingVO.class).toString();
                    System.out.println(messageString);
                    messageLenght = IssuersLiftingEncoder.BLOCK_LENGTH + HEADER_LENGTH+2;
                    byteResult = encoder.encode(messageString);
                    message = ArrayUtils.addAll(createHeader(rootObj.get("SeqNum").getAsInt(),messageLenght,(short)IssuersLiftingEncoder.BLOCK_LENGTH),byteResult);
                    //System.out.println(Arrays.toString(message));
                    broadcast(message, InetAddress.getByName(ip),port);
                break;
                
                case TRANSACTION_CHANGE_STATUS_TYPE:
                    messageString = new Gson().fromJson(locObj, TransactionChangeStatusVO.class).toString();
                    System.out.println(messageString);
                    messageLenght = TransactionChangeStatusEncoder.BLOCK_LENGTH + HEADER_LENGTH+2;
                    byteResult = encoder.encode(messageString);
                    message = ArrayUtils.addAll(createHeader(rootObj.get("SeqNum").getAsInt(),messageLenght,(short)TransactionChangeStatusEncoder.BLOCK_LENGTH ),byteResult);
                    //System.out.println(Arrays.toString(message));
                    broadcast(message, InetAddress.getByName(ip),port);
                break;
                
                case ISSUER_OPERATIVITY_TYPE:
                    messageString = new Gson().fromJson(locObj, IssuerOperativityVO.class).toString();
                    System.out.println(messageString);
                    messageLenght = IssuerOperativityEncoder.BLOCK_LENGTH + HEADER_LENGTH+2;
                    byteResult = encoder.encode(messageString);
                    message = ArrayUtils.addAll(createHeader(rootObj.get("SeqNum").getAsInt(),messageLenght,(short)IssuerOperativityEncoder.BLOCK_LENGTH ),byteResult);
                    //System.out.println(Arrays.toString(message));
                    broadcast(message, InetAddress.getByName(ip),port);
                break;
                
                case SYSTEM_EVENT_TYPE:
                    messageString = new Gson().fromJson(locObj, SystemEventVO.class).toString();
                    System.out.println(messageString);
                    messageLenght = SystemEventEncoder.BLOCK_LENGTH + HEADER_LENGTH+2;
                    byteResult = encoder.encode(messageString);
                    message = ArrayUtils.addAll(createHeader(rootObj.get("SeqNum").getAsInt(),messageLenght,(short)SystemEventEncoder.BLOCK_LENGTH ),byteResult);
                    //System.out.println(Arrays.toString(message));
                    broadcast(message, InetAddress.getByName(ip),port); 
                break;
                
                case WEIGHTED_AVERAGE_PRICE_TYPE:
                    messageString = new Gson().fromJson(locObj, WeightedAveragePriceVO.class).toString();
                    System.out.println(messageString);
                    messageLenght = WeightedAveragePriceEncoder.BLOCK_LENGTH + HEADER_LENGTH+2;
                    byteResult = encoder.encode(messageString);
                    message = ArrayUtils.addAll(createHeader(rootObj.get("SeqNum").getAsInt(),messageLenght,(short)WeightedAveragePriceEncoder.BLOCK_LENGTH ),byteResult);
                    //System.out.println(Arrays.toString(message));
                    broadcast(message, InetAddress.getByName(ip),port);
                break;
                }
                if (totalDeMensajes!=0 && totalDeMensajes.equals(conteoDeMensajes)) {
                    if (tiempoDeEspera > 0) {
                        TimeUnit.MILLISECONDS.sleep(tiempoDeEspera);
                        conteoDeMensajes = 0;
                    }
  
                }
                conteoDeMensajes=conteoDeMensajes+1;
            } catch (Exception e) {

                System.out.println(e);
            }
        }
        br.close();

    }

    /**
     * @param broadcastMessage
     * @param address
     * @throws IOException
     */
    public static void broadcast(byte[] broadcastMessage, InetAddress address,Integer port)
            throws IOException {
        socket = new DatagramSocket();
        socket.setBroadcast(true);

        // byte[] buffer = broadcastMessage.getBytes();

        DatagramPacket packet = new DatagramPacket(broadcastMessage,
                broadcastMessage.length, address, port);
        socket.send(packet);
        socket.close();

    }

    private static byte[] createHeader(Integer sequence, Short length, Short blockLenght) {
        ByteBuffer byteBuffer = ByteBuffer.allocate(HEADER_LENGTH+2);
        byteBuffer.clear();
        byteBuffer.putShort(length);
        byteBuffer.put((byte) TOTAL_MESSAGE);
        byteBuffer.put((byte) MARKET_DATA_GROUP);
        byteBuffer.put((byte) SESSION);
        byteBuffer.putInt(sequence);
        byteBuffer.putLong(System.currentTimeMillis());
        byteBuffer.putShort(blockLenght);
        byteBuffer.flip();

        final byte[] headerBytes = new byte[byteBuffer.remaining()];
        byteBuffer.get(headerBytes);

        return headerBytes;

    }
    
   
}
