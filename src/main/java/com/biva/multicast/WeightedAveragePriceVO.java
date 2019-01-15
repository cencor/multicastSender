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
 * Clase del mensaje Weighted Average Price.
 * 
 * @author ramonsalas - CENCOR
 */
public class WeightedAveragePriceVO extends AbstractVO {

    /** The wighted average price. */
    @SerializedName("Weighted Average Price")
    private long ppp;
    /** The volatility. */
    @SerializedName("Volatility")
    private long volatility;

    /**
     * @return the ppp
     */
    public long getPpp() {
        return ppp;
    }

    /**
     * @param ppp the ppp to set
     */
    public void setPpp(final long ppp) {
        this.ppp = ppp;
    }

    /**
     * @return the volatility
     */
    public long getVolatility() {
        return volatility;
    }

    /**
     * @param volatility the volatility to set
     */
    public void setVolatility(final long volatility) {
        this.volatility = volatility;
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
        messageBuilder.append(ppp);
        messageBuilder.append(PIPE);
        messageBuilder.append(volatility);

        return messageBuilder.toString();
    }

}
