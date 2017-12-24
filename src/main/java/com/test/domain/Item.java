package com.test.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * Created by Ekaterina Pyataeva
 */
@Entity
@Table(name = "item")
public class Item implements Serializable{

    @Id
    @Column(nullable = false, name = "item_id")
    private String itemId;

    @Column(name = "item_value")
    private String itemValue;

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getItemValue() {
        return itemValue;
    }

    public void setItemValue(String itemValue) {
        this.itemValue = itemValue;
    }
}
