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
 * Clase del mensaje Official Closing Price.
 * 
 * @author ramonsalas - CENCOR
 */
public class ClosingPriceVO extends AbstractVO {

    /** The closing price. */
    @SerializedName("Closing Price")
    private long closingPrice;

    /**
     * @return the closingPrice
     */
    public long getClosingPrice() {
        return closingPrice;
    }

    /**
     * @param closingPrice the closingPrice to set
     */
    public void setClosingPrice(final long closingPrice) {
        this.closingPrice = closingPrice;
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
        messageBuilder.append(closingPrice);

        return messageBuilder.toString();
    }

}
