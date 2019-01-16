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
 * Clase del mensaje Catalog for Instruments Belonging to the Capital Warrants
 * Market.
 * 
 * @author ramonsalas - CENCOR
 */
public class WarrantsInstrumentCatalogVO extends AbstractVO {

    /** The value type. */
    @SerializedName("Value Type")
    private String valueType;
    /** The issuer. */
    @SerializedName("Issuer")
    private String issuer;
    /** The serie. */
    @SerializedName("Series")
    private String serie;
    /** The warrant type. */
    @SerializedName("Warrant Type")
    private char warrantType;
    /** The maturity date. */
    @SerializedName("Maturity date")
    private long maturityDate;
    /** The excercise price. */
    @SerializedName("Exercise Price")
    private long excercisePrice;
    /** The reference price. */
    @SerializedName("Reference Price")
    private long referencePrice;
    /** The reference date. */
    @SerializedName("Reference Date")
    private long referenceDate;
    /** The reference. */
    @SerializedName("Reference")
    private char reference;
    /** The isin. */
    @SerializedName("ISIN")
    private String isin;

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
     * @return the warrantType
     */
    public char getWarrantType() {
        return warrantType;
    }

    /**
     * @param warrantType the warrantType to set
     */
    public void setWarrantType(final char warrantType) {
        this.warrantType = warrantType;
    }

    /**
     * @return the maturityDate
     */
    public long getMaturityDate() {
        return maturityDate;
    }

    /**
     * @param maturityDate the maturityDate to set
     */
    public void setMaturityDate(final long maturityDate) {
        this.maturityDate = maturityDate;
    }

    /**
     * @return the excercisePrice
     */
    public long getExcercisePrice() {
        return excercisePrice;
    }

    /**
     * @param excercisePrice the excercisePrice to set
     */
    public void setExcercisePrice(final long excercisePrice) {
        this.excercisePrice = excercisePrice;
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
     * @return the reference
     */
    public char getReference() {
        return reference;
    }

    /**
     * @param reference the reference to set
     */
    public void setReference(final char reference) {
        this.reference = reference;
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
        messageBuilder.append(warrantType);
        messageBuilder.append(PIPE);
        messageBuilder.append(maturityDate);
        messageBuilder.append(PIPE);
        messageBuilder.append(excercisePrice);
        messageBuilder.append(PIPE);
        messageBuilder.append(referencePrice);
        messageBuilder.append(PIPE);
        messageBuilder.append(referenceDate);
        messageBuilder.append(PIPE);
        messageBuilder.append(reference);
        messageBuilder.append(PIPE);
        messageBuilder.append(isin);

        return messageBuilder.toString();
    }

}
