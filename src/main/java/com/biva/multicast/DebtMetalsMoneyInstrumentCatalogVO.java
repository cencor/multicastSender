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

/**
 * Clase del mensaje Catalog for Instruments Belonging to the Local and Global
 * Stock Market.
 * 
 * @author ramonsalas - CENCOR
 */
public class DebtMetalsMoneyInstrumentCatalogVO extends AbstractVO {

    /** The value type. */
    @SerializedName("Value Type")
    private String valueType;
    /** The issuer. */
    @SerializedName("Issuer")
    private String issuer;
    /** The issue. */
    @SerializedName("Series")
    private String issue;
    /** The issue date. */
    @SerializedName("Issue Date")
    private long issueDate;
    /** The maturity date. */
    @SerializedName("Maturity date")
    private long maturityDate;
    /** The reference price rate. */
    @SerializedName("Reference Price")
    private long referencePriceRate;
    /** The reference date. */
    @SerializedName("Reference Date")
    private long referenceDate;
    /** The reference. */
    @SerializedName("Reference")
    private char reference;
    /** The term days. */
    @SerializedName("Current Cupon Days")
    private short termDays;
    /** The current coupon. */
    @SerializedName("Current Cupon Period")
    private short currentCoupon;
    /** The ISIN. */
    @SerializedName("ISIN")
    private String isin;
    /** The market. */
    @SerializedName("Market")
    private char market;
    /** The current nominal value. */
    @SerializedName("Current Nominal Value")
    private long currentNominalValue;
    /** The original nominal value. */
    @SerializedName("Original Nominal Value")
    private long originalNominalValue;
    /** The outstanding shares. */
    @SerializedName("Outstanding Shares")
    private long outstandingShares;
    /** The amount placed. */
    @SerializedName("Amont Placed")
    private long amountPlaced;
    /** The operate price rate. */
    @SerializedName("Operate Price/Rate")
    private char operatePriceRate;

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
     * @return the issue
     */
    public String getIssue() {
        return issue;
    }

    /**
     * @param issue the issue to set
     */
    public void setIssue(final String issue) {
        this.issue = issue;
    }

    /**
     * @return the issueDate
     */
    public long getIssueDate() {
        return issueDate;
    }

    /**
     * @param issueDate the issueDate to set
     */
    public void setIssueDate(final long issueDate) {
        this.issueDate = issueDate;
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
     * @return the referencePriceRate
     */
    public long getReferencePriceRate() {
        return referencePriceRate;
    }

    /**
     * @param referencePriceRate the referencePriceRate to set
     */
    public void setReferencePriceRate(final long referencePriceRate) {
        this.referencePriceRate = referencePriceRate;
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
     * @return the termDays
     */
    public short getTermDays() {
        return termDays;
    }

    /**
     * @param termDays the termDays to set
     */
    public void setTermDays(final short termDays) {
        this.termDays = termDays;
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
     * @return the currentNominalValue
     */
    public long getCurrentNominalValue() {
        return currentNominalValue;
    }

    /**
     * @param currentNominalValue the currentNominalValue to set
     */
    public void setCurrentNominalValue(final long currentNominalValue) {
        this.currentNominalValue = currentNominalValue;
    }

    /**
     * @return the originalNominalValue
     */
    public long getOriginalNominalValue() {
        return originalNominalValue;
    }

    /**
     * @param originalNominalValue the originalNominalValue to set
     */
    public void setOriginalNominalValue(final long originalNominalValue) {
        this.originalNominalValue = originalNominalValue;
    }

    /**
     * @return the outstandingShares
     */
    public long getOutstandingShares() {
        return outstandingShares;
    }

    /**
     * @param outstandingShares the outstandingShares to set
     */
    public void setOutstandingShares(final long outstandingShares) {
        this.outstandingShares = outstandingShares;
    }

    /**
     * @return the amountPlaced
     */
    public long getAmountPlaced() {
        return amountPlaced;
    }

    /**
     * @param amountPlaced the amountPlaced to set
     */
    public void setAmountPlaced(final long amountPlaced) {
        this.amountPlaced = amountPlaced;
    }

    /**
     * @return the operatePriceRate
     */
    public char getOperatePriceRate() {
        return operatePriceRate;
    }

    /**
     * @param operatePriceRate the operatePriceRate to set
     */
    public void setOperatePriceRate(final char operatePriceRate) {
        this.operatePriceRate = operatePriceRate;
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
        messageBuilder.append(issue);
        messageBuilder.append(PIPE);
        messageBuilder.append(issueDate);
        messageBuilder.append(PIPE);
        messageBuilder.append(maturityDate);
        messageBuilder.append(PIPE);
        messageBuilder.append(referencePriceRate);
        messageBuilder.append(PIPE);
        messageBuilder.append(referenceDate);
        messageBuilder.append(PIPE);
        messageBuilder.append(reference);
        messageBuilder.append(PIPE);
        messageBuilder.append(termDays);
        messageBuilder.append(PIPE);
        messageBuilder.append(currentCoupon);
        messageBuilder.append(PIPE);
        messageBuilder.append(isin);
        messageBuilder.append(PIPE);
        messageBuilder.append(market);
        messageBuilder.append(PIPE);
        messageBuilder.append(currentNominalValue);
        messageBuilder.append(PIPE);
        messageBuilder.append(originalNominalValue);
        messageBuilder.append(PIPE);
        messageBuilder.append(outstandingShares);
        messageBuilder.append(PIPE);
        messageBuilder.append(amountPlaced);
        messageBuilder.append(PIPE);
        messageBuilder.append(operatePriceRate);

        return messageBuilder.toString();
    }

}
