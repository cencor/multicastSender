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
 * Clase del mensaje Issuer Operativity.
 * 
 * @author ramonsalas - CENCOR
 */
public class IssuerOperativityVO extends AbstractVO {

    /** The send date. */
    private long sendDate;
    /** The operations number. */
    private int operationsNumber;
    /** The operated volumen. */
    private long operatedVolume;
    /** The int operated amount. */
    private long intOperatedAmount;
    /** The decimal operated amount. */
    private int decimalOperatedAmount;

    /**
     * @return the sendDate
     */
    public long getSendDate() {
        return sendDate;
    }

    /**
     * @param sendDate the sendDate to set
     */
    public void setSendDate(final long sendDate) {
        this.sendDate = sendDate;
    }

    /**
     * @return the operationsNumber
     */
    public int getOperationsNumber() {
        return operationsNumber;
    }

    /**
     * @param operationsNumber the operationsNumber to set
     */
    public void setOperationsNumber(final int operationsNumber) {
        this.operationsNumber = operationsNumber;
    }

    /**
     * @return the operatedVolume
     */
    public long getOperatedVolume() {
        return operatedVolume;
    }

    /**
     * @param operatedVolume the operatedVolume to set
     */
    public void setOperatedVolume(final long operatedVolume) {
        this.operatedVolume = operatedVolume;
    }

    /**
     * @return the intOperatedAmount
     */
    public long getIntOperatedAmount() {
        return intOperatedAmount;
    }

    /**
     * @param intOperatedAmount the intOperatedAmount to set
     */
    public void setIntOperatedAmount(final long intOperatedAmount) {
        this.intOperatedAmount = intOperatedAmount;
    }

    /**
     * @return the decimalOperatedAmount
     */
    public int getDecimalOperatedAmount() {
        return decimalOperatedAmount;
    }

    /**
     * @param decimalOperatedAmount the decimalOperatedAmount to set
     */
    public void setDecimalOperatedAmount(final int decimalOperatedAmount) {
        this.decimalOperatedAmount = decimalOperatedAmount;
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
        messageBuilder.append(sendDate);
        messageBuilder.append(PIPE);
        messageBuilder.append(operationsNumber);
        messageBuilder.append(PIPE);
        messageBuilder.append(operatedVolume);
        messageBuilder.append(PIPE);
        messageBuilder.append(intOperatedAmount);
        messageBuilder.append(PIPE);
        messageBuilder.append(decimalOperatedAmount);

        return messageBuilder.toString();
    }

}
