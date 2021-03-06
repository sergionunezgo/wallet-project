package com.sergio.wallet.server.data.entity;

import javax.persistence.*;
import java.time.LocalDateTime;

/**
 * Entity bean to describe the Balance table, referenced by the repository
 * BalanceRepository for all corresponding interactions with the DB.
 */
@Entity
@Table(name = "BALANCE")
public class Balance {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", updatable = false, nullable = false)
    private long id;

    @Column(name = "USER_ID")
    private String userId;

    @Column(name = "BALANCE")
    private long balance;

    @Column(name = "CURRENCY")
    private String currency;

    @Column(name = "MODIFIED")
    private LocalDateTime modified;

    @Column(name = "LAST_TRANSACTION_ID")
    private long lastTransactionId;

    //region PUBLIC METHODS

    /**
     * Simple method to help modify the balance amount when depositing or withdrawing.
     * @param amount
     * @param isDeposit
     */
    public void modifyBalance(long amount, boolean isDeposit) {
        if (isDeposit) {
            balance += amount;
        } else {
            balance -= amount;
        }
    }

    @Override
    public String toString() {
        return "Balance{" +
                "id=" + id +
                ", userId='" + userId + '\'' +
                ", balance=" + balance +
                ", currency='" + currency + '\'' +
                ", modified=" + modified +
                ", lastTransactionId=" + lastTransactionId +
                '}';
    }

    //region GETTERS & SETTERS

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public LocalDateTime getModified() {
        return modified;
    }

    public void setModified(LocalDateTime modified) {
        this.modified = modified;
    }

    public long getLastTransactionId() {
        return lastTransactionId;
    }

    public void setLastTransactionId(long lastTransactionId) {
        this.lastTransactionId = lastTransactionId;
    }

    //endregion

    //endregion

}
