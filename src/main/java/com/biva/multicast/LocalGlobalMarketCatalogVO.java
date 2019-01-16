/**
 * CENCOR - BIVA 2 ene 2019
 * This software is the confidential and proprietary information of 
 * CENCOR and Bolsa Institucional de Valores("Confidential Information").
 *
 * You shall not disclose such confidential information and shall use
 * it only within a project and/or the offices of CENCOR or Bolsa Institucional de Valores
 */
package com.biva.multicast;

import com.google.gson.annotations.SerializedName;

//import mx.com.biva.retransmission.common.Separator;

/**
 * @author ramonsalas - CENCOR
 * @version 1.0
 */
public class LocalGlobalMarketCatalogVO extends AbstractVO {

    /** The value type. */
    @SerializedName("Value Type")
    private String valueType;
    /** The emisora. */
    @SerializedName("Issuer")
    private String issuer;
    /** The serie. */
    @SerializedName("Series")
    private String serie;
    /** The reference price. */
    @SerializedName("Reference Price")
    private long referencePrice;
    /** The reference date. */
    @SerializedName("Reference Date")
    private long referenceDate;
    /** The current coupon. */
    @SerializedName("Current Coupon")
    private short currentCoupon;
    /** The bursatility. */
    @SerializedName("Bursatility")
    private char bursatility;
    /** The numeric bursatility. */
    @SerializedName("Numeric Bursatility")
    private int numericBursatility;
    /** The isin. */
    @SerializedName("ISIN")
    private String isin;
    /** The market. */
    @SerializedName("Market")
    private char market;
    /** The registered securities. */
    @SerializedName("Registered Securities")
    private long registeredSecurities;

    /**
     * @return the valueType
     */
    public String getValueType() {
        return valueType;
    }

    /**
     * @param valueType the valueType to set
     */
    public void setValueType(final String valueType) {
        this.valueType = valueType;
    }

    /**
     * @return the issuer
     */
    public String getIssuer() {
        return issuer;
    }

    /**
     * @param issuer the issuer to set
     */
    public void setIssuer(final String issuer) {
        this.issuer = issuer;
    }

    /**
     * @return the serie
     */
    public String getSerie() {
        return serie;
    }

    /**
     * @param serie the serie to set
     */
    public void setSerie(final String serie) {
        this.serie = serie;
    }

    /**
     * @return the referencePrice
     */
    public long getReferencePrice() {
        return referencePrice;
    }

    /**
     * @param referencePrice the referencePrice to set
     */
    public void setReferencePrice(final long referencePrice) {
        this.referencePrice = referencePrice;
    }

    /**
     * @return the referenceDate
     */
    public long getReferenceDate() {
        return referenceDate;
    }

    /**
     * @param referenceDate the referenceDate to set
     */
    public void setReferenceDate(final long referenceDate) {
        this.referenceDate = referenceDate;
    }

    /**
     * @return the currentCoupon
     */
    public short getCurrentCoupon() {
        return currentCoupon;
    }

    /**
     * @param currentCoupon the currentCoupon to set
     */
    public void setCurrentCoupon(final short currentCoupon) {
        this.currentCoupon = currentCoupon;
    }

    /**
     * @return the bursatility
     */
    public char getBursatility() {
        return bursatility;
    }

    /**
     * @param bursatility the bursatility to set
     */
    public void setBursatility(final char bursatility) {
        this.bursatility = bursatility;
    }

    /**
     * @return the numericBursatility
     */
    public int getNumericBursatility() {
        return numericBursatility;
    }

    /**
     * @param numericBursatility the numericBursatility to set
     */
    public void setNumericBursatility(final int numericBursatility) {
        this.numericBursatility = numericBursatility;
    }

    /**
     * @return the isin
     */
    public String getIsin() {
        return isin;
    }

    /**
     * @param isin the isin to set
     */
    public void setIsin(final String isin) {
        this.isin = isin;
    }

    /**
     * @return the market
     */
    public char getMarket() {
        return market;
    }

    /**
     * @param market the market to set
     */
    public void setMarket(final char market) {
        this.market = market;
    }

    /**
     * @return the registeredSecurities
     */
    public long getRegisteredSecurities() {
        return registeredSecurities;
    }

    /**
     * @param registeredSecurities the registeredSecurities to set
     */
    public void setRegisteredSecurities(final long registeredSecurities) {
        this.registeredSecurities = registeredSecurities;
    }

    /*
     * (non-Javadoc)
     * @see java.lang.Object#toString().
     */
    @Override
    public String toString() {
        final StringBuilder messageBuilder = new StringBuilder();
        messageBuilder.append(getType());
        messageBuilder.append(PIPE);
        messageBuilder.append(getInstrumentId());
        messageBuilder.append(PIPE);
        messageBuilder.append(valueType);
        messageBuilder.append(PIPE);
        messageBuilder.append(issuer);
        messageBuilder.append(PIPE);
        messageBuilder.append(serie);
        messageBuilder.append(PIPE);
        messageBuilder.append(referencePrice);
        messageBuilder.append(PIPE);
        messageBuilder.append(referenceDate);
        messageBuilder.append(PIPE);
        messageBuilder.append(currentCoupon);
        messageBuilder.append(PIPE);
        messageBuilder.append(bursatility);
        messageBuilder.append(PIPE);
        messageBuilder.append(numericBursatility);
        messageBuilder.append(PIPE);
        messageBuilder.append(isin);
        messageBuilder.append(PIPE);
        messageBuilder.append(market);
        messageBuilder.append(PIPE);
        messageBuilder.append(registeredSecurities);

        return messageBuilder.toString();
    }

}
