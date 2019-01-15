/**
 * CENCOR - BIVA 3 ene 2019
 * This software is the confidential and proprietary information of 
 * CENCOR and Bolsa Institucional de Valores("Confidential Information").
 *
 * You shall not disclose such confidential information and shall use
 * it only within a project and/or the offices of CENCOR or Bolsa Institucional de Valores
 */
package com.biva.multicast;



/**
 * Clase del mensaje Transaction Change Status.
 * 
 * @author ramonsalas - CENCOR
 */
public class TransactionChangeStatusVO extends AbstractVO {

    /** The change status time. */
    private long changeStatusTime;
    /** The transaction status. */
    private char transactionStatus;

    /**
     * @return the changeStatusTime
     */
    public long getChangeStatusTime() {
        return changeStatusTime;
    }

    /**
     * @param changeStatusTime the changeStatusTime to set
     */
    public void setChangeStatusTime(final long changeStatusTime) {
        this.changeStatusTime = changeStatusTime;
    }

    /**
     * @return the transactionStatus
     */
    public char getTransactionStatus() {
        return transactionStatus;
    }

    /**
     * @param transactionStatus the transactionStatus to set
     */
    public void setTransactionStatus(final char transactionStatus) {
        this.transactionStatus = transactionStatus;
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
        messageBuilder.append(changeStatusTime);
        messageBuilder.append(PIPE);
        messageBuilder.append(transactionStatus);

        return messageBuilder.toString();
    }

}
