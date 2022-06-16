
package com.demo.onepos.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity 
public class Cook{

    @Id @GeneratedValue
    Long id;

    int orderId;
    int storeId;
    int prodId;
    int qty;
    int holeflag;
    int tableNo;

    CookStatus cookStatus;
    
    public CookStatus getCookStatus() {
        return cookStatus;
    }
    public void setCookStatus(CookStatus cookStatus) {
        this.cookStatus = cookStatus;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public int getTableNo() {
        return tableNo;
    }
    public void setTableNo(int tableNo) {
        this.tableNo = tableNo;
    }
    public int getOrderId() {
        return orderId;
    }
    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }
    public int getStoreId() {
        return storeId;
    }
    public void setStoreId(int storeId) {
        this.storeId = storeId;
    }
    public int getProdId() {
        return prodId;
    }
    public void setProdId(int prodId) {
        this.prodId = prodId;
    }
    public int getQty() {
        return qty;
    }
    public void setQty(int qty) {
        this.qty = qty;
    }
    public int getHoleflag() {
        return holeflag;
    }
    public void setHoleflag(int holeflag) {
        this.holeflag = holeflag;
    }

}