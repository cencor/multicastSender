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
 * Clase del mensaje Status Changes.
 * 
 * @author ramonsalas - CENCOR
 */
public class StatusChangesVO extends AbstractVO {

    /** The instrument status. */
    @SerializedName("Instrument Status")
    private char instrumentStatus;

    /**
     * @return the instrumentStatus
     */
    public char getInstrumentStatus() {
        return instrumentStatus;
    }

    /**
     * @param instrumentStatus the instrumentStatus to set
     */
    public void setInstrumentStatus(final char instrumentStatus) {
        this.instrumentStatus = instrumentStatus;
    }

    /*
     * (non-Javadoc)
     * @see java.lang.Object#toString().
     */
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(getType());
        builder.append(PIPE);
        builder.append(getInstrumentId());
        builder.append(PIPE);
        builder.append(instrumentStatus);

        return builder.toString();
    }

}
