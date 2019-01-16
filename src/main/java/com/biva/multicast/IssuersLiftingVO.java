/**
 * CENCOR - BIVA 2 ene 2019
 * This software is the confidential and proprietary information of 
 * CENCOR and Bolsa Institucional de Valores("Confidential Information").
 *
 * You shall not disclose such confidential information and shall use
 * it only within a project and/or the offices of CENCOR or Bolsa Institucional de Valores
 */
package com.biva.multicast;



/**
 * Clase del mensaje Issuers Lifting.
 * 
 * @author ramonsalas - CENCOR
 */
public class IssuersLiftingVO extends AbstractVO {

    /** The lifting time. */
    private long liftingTime;
    /** The lifting type. */
    private char liftingType;
    /** The auction duration. */
    private short auctionDuration;

    /**
     * @return the liftingTime
     */
    public long getLiftingTime() {
        return liftingTime;
    }

    /**
     * @param liftingTime the liftingTime to set
     */
    public void setLiftingTime(final long liftingTime) {
        this.liftingTime = liftingTime;
    }

    /**
     * @return the liftingType
     */
    public char getLiftingType() {
        return liftingType;
    }

    /**
     * @param liftingType the liftingType to set
     */
    public void setLiftingType(final char liftingType) {
        this.liftingType = liftingType;
    }

    /**
     * @return the auctionDuration
     */
    public short getAuctionDuration() {
        return auctionDuration;
    }

    /**
     * @param auctionDuration the auctionDuration to set
     */
    public void setAuctionDuration(final short auctionDuration) {
        this.auctionDuration = auctionDuration;
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
        messageBuilder.append(liftingTime);
        messageBuilder.append(PIPE);
        messageBuilder.append(liftingType);
        messageBuilder.append(PIPE);
        messageBuilder.append(auctionDuration);

        return messageBuilder.toString();
    }

}
