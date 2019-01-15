/**
 * CENCOR - BIVA 3 ene 2019
 * This software is the confidential and proprietary information of 
 * CENCOR and Bolsa Institucional de Valores("Confidential Information").
 *
 * You shall not disclose such confidential information and shall use
 * it only within a project and/or the offices of CENCOR or Bolsa Institucional de Valores
 */
package com.biva.multicast;

import com.google.gson.annotations.SerializedName;

/**
 * Clase del mensaje Registry Operations.
 * 
 * @author ramonsalas - CENCOR
 */
public class RegistryOperationsVO extends AbstractVO {

    /** The offer type. */
    @SerializedName("Offer Type")
    private char offerType;
    /** The income. */
    @SerializedName("Income")
    private char income;
    /** The value type. */
    @SerializedName("Value Type")
    private String valueType;
    /** The issuer. */
    @SerializedName("Issuer")
    private String issuer;
    /** The series. */
    @SerializedName("Series")
    private String series;
    /** The maximum value. */
    @SerializedName("Maximum Volume")
    private long maximumValue;
    /** The registered value. */
    @SerializedName("Registered Volume")
    private long registeredValue;
    /** The price rate. */
    @SerializedName("Price/Rate")
    private long priceRate;
    /** The settlement. */
    @SerializedName("Settlement Date")
    private long settlementDate;
    /** The firm. */
    @SerializedName("Firm")
    private String firm;
    /** The movement. */
    @SerializedName("Movement")
    private char movement;

    /**
     * @return the offerType
     */
    public char getOfferType() {
        return offerType;
    }

    /**
     * @param offerType the offerType to set
     */
    public void setOfferType(final char offerType) {
        this.offerType = offerType;
    }

    /**
     * @return the income
     */
    public char getIncome() {
        return income;
    }

    /**
     * @param income the income to set
     */
    public void setIncome(final char income) {
        this.income = income;
    }

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
     * @return the series
     */
    public String getSeries() {
        return series;
    }

    /**
     * @param series the series to set
     */
    public void setSeries(final String series) {
        this.series = series;
    }

    /**
     * @return the maximumValue
     */
    public long getMaximumValue() {
        return maximumValue;
    }

    /**
     * @param maximumValue the maximumValue to set
     */
    public void setMaximumValue(final long maximumValue) {
        this.maximumValue = maximumValue;
    }

    /**
     * @return the registeredValue
     */
    public long getRegisteredValue() {
        return registeredValue;
    }

    /**
     * @param registeredValue the registeredValue to set
     */
    public void setRegisteredValue(final long registeredValue) {
        this.registeredValue = registeredValue;
    }

    /**
     * @return the priceRate
     */
    public long getPriceRate() {
        return priceRate;
    }

    /**
     * @param priceRate the priceRate to set
     */
    public void setPriceRate(final long priceRate) {
        this.priceRate = priceRate;
    }

    /**
     * @return the settlementDate
     */
    public long getSettlementDate() {
        return settlementDate;
    }

    /**
     * @param settlementDate the settlementDate to set
     */
    public void setSettlementDate(final long settlementDate) {
        this.settlementDate = settlementDate;
    }

    /**
     * @return the firm
     */
    public String getFirm() {
        return firm;
    }

    /**
     * @param firm the firm to set
     */
    public void setFirm(final String firm) {
        this.firm = firm;
    }

    /**
     * @return the movement
     */
    public char getMovement() {
        return movement;
    }

    /**
     * @param movement the movement to set
     */
    public void setMovement(final char movement) {
        this.movement = movement;
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
        messageBuilder.append(offerType);
        messageBuilder.append(PIPE);
        messageBuilder.append(income);
        messageBuilder.append(PIPE);
        messageBuilder.append(valueType);
        messageBuilder.append(PIPE);
        messageBuilder.append(issuer);
        messageBuilder.append(PIPE);
        messageBuilder.append(series);
        messageBuilder.append(PIPE);
        messageBuilder.append(maximumValue);
        messageBuilder.append(PIPE);
        messageBuilder.append(registeredValue);
        messageBuilder.append(PIPE);
        messageBuilder.append(priceRate);
        messageBuilder.append(PIPE);
        messageBuilder.append(settlementDate);
        messageBuilder.append(PIPE);
        messageBuilder.append(firm);
        messageBuilder.append(PIPE);
        messageBuilder.append(movement);

        return messageBuilder.toString();
    }

}
