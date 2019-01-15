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
 * Clase del mensaje Issuer Suspension.
 * 
 * @author ramonsalas - CENCOR
 */
public class IssuerSuspensionVO extends AbstractVO {

    /** The suspension time. */
    @SerializedName("Date for Suspension")
    private long suspensionTime;
    /** The trading status. */
    @SerializedName("Negotiation State")
    private char tradingStatus;
    /** The cause. */
    @SerializedName("Reason")
    private char cause;

    /**
     * @return the suspensionTime
     */
    public long getSuspensionTime() {
        return suspensionTime;
    }

    /**
     * @param suspensionTime the suspensionTime to set
     */
    public void setSuspensionTime(final long suspensionTime) {
        this.suspensionTime = suspensionTime;
    }

    /**
     * @return the tradingStatus
     */
    public char getTradingStatus() {
        return tradingStatus;
    }

    /**
     * @param tradingStatus the tradingStatus to set
     */
    public void setTradingStatus(final char tradingStatus) {
        this.tradingStatus = tradingStatus;
    }

    /**
     * @return the cause
     */
    public char getCause() {
        return cause;
    }

    /**
     * @param cause the cause to set
     */
    public void setCause(final char cause) {
        this.cause = cause;
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
        messageBuilder.append(suspensionTime);
        messageBuilder.append(PIPE);
        messageBuilder.append(tradingStatus);
        messageBuilder.append(PIPE);
        messageBuilder.append(cause);

        return messageBuilder.toString();
    }

}
