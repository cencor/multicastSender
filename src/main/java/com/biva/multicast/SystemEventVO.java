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
 * Clase del mensaje Events System.
 * 
 * @author ramonsalas - CENCOR
 */
public class SystemEventVO extends AbstractVO {

    /** The event code. */
    @SerializedName("Event Code")
    private char eventCode;
    /** The market. */
    @SerializedName("Market")
    private char market;
    /** The sending time. */
    @SerializedName("Sending Time")
    private long sendingTime;
    /** The ending time. */
    @SerializedName("Ending Time")
    private long endingTime;

    /**
     * @return the eventCode
     */
    public char getEventCode() {
        return eventCode;
    }

    /**
     * @param eventCode the eventCode to set
     */
    public void setEventCode(final char eventCode) {
        this.eventCode = eventCode;
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
     * @return the sendingTime
     */
    public long getSendingTime() {
        return sendingTime;
    }

    /**
     * @param sendingTime the sendingTime to set
     */
    public void setSendingTime(final long sendingTime) {
        this.sendingTime = sendingTime;
    }

    /**
     * @return the endingTime
     */
    public long getEndingTime() {
        return endingTime;
    }

    /**
     * @param endingTime the endingTime to set
     */
    public void setEndingTime(final long endingTime) {
        this.endingTime = endingTime;
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
        messageBuilder.append(eventCode);
        messageBuilder.append(PIPE);
        messageBuilder.append(market);
        messageBuilder.append(PIPE);
        messageBuilder.append(sendingTime);
        messageBuilder.append(PIPE);
        messageBuilder.append(endingTime);

        return messageBuilder.toString();
    }

}
