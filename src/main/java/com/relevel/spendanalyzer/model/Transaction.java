package com.relevel.spendanalyzer.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Transaction {

    @Id
    private long transaction_id;
}
