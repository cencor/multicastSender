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
 * @author ramonsalas - CENCOR
 * @version 1.0
 */
public abstract class AbstractVO {

	protected static final String PIPE = "|";
    /** The type. */
    @SerializedName("Type")
    private char type;
    /** The instrumentId. */
    @SerializedName("Instrument Number")
    private int instrumentId;

    /**
     * @return the type
     */
    public char getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(final char type) {
        this.type = type;
    }

    /**
     * @return the instrumentId
     */
    public int getInstrumentId() {
        return instrumentId;
    }

    /**
     * @param instrumentId the instrumentId to set
     */
    public void setInstrumentId(final int instrumentId) {
        this.instrumentId = instrumentId;
    }

}
