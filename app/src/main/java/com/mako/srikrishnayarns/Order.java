package com.mako.srikrishnayarns;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mako on 1/27/2017.
 */

public class Order {
    String buyer,buyerKey,seller,sellerKey,transport,transportKey,typeOfSale,typeofpayment;
    int total;
    int advanceamt;
    int billdate;
    int invoice;
    int deliveydate;
    int discount;
    int adjustments;
    int shippping;
    int grand_total;
    int remaining;
    int remaining_service;
    List<product> productList=new ArrayList<>();
    boolean isAdvance;
    boolean paid;
    boolean e1Form;
    boolean cform;
    boolean dispatched;
    boolean isserviceset;
    boolean servicePaid;

    public int getRemaining_service() {
        return remaining_service;
    }

    public void setRemaining_service(int remaining_service) {
        this.remaining_service = remaining_service;
    }

    public boolean isserviceset() {
        return isserviceset;
    }

    public void setIsserviceset(boolean isserviceset) {
        this.isserviceset = isserviceset;
    }

    public int getRemaining() {
        return remaining;
    }

    public void setRemaining(int remaining) {
        this.remaining = remaining;
    }
    public int getInvoice() {
        return invoice;
    }

    public void setInvoice(int invoice) {
        this.invoice = invoice;
    }
    public int getGrand_total() {
        return grand_total;
    }

    public void setGrand_total(int grand_total) {
        this.grand_total = grand_total;
    }
    public String getTypeofpayment() {
        return typeofpayment;
    }

    public void setTypeofpayment(String typeofpayment) {
        this.typeofpayment = typeofpayment;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public int getAdjustments() {
        return adjustments;
    }

    public void setAdjustments(int adjustments) {
        this.adjustments = adjustments;
    }

    public int getShippping() {
        return shippping;
    }

    public void setShippping(int shippping) {
        this.shippping = shippping;
    }

    public boolean isServicePaid() {
        return servicePaid;
    }

    public void setServicePaid(boolean servicePaid) {
        this.servicePaid = servicePaid;
    }

    public boolean isDispatched() {
        return dispatched;
    }

    public void setDispatched(boolean dispatched) {
        this.dispatched = dispatched;
    }

    public boolean isCform() {
        return cform;
    }

    public void setCform(boolean cform) {
        this.cform = cform;
    }

    public boolean isE1Form() {
        return e1Form;
    }

    public void setE1Form(boolean e1Form) {
        this.e1Form = e1Form;
    }

    public boolean isPaid() {
        return paid;
    }

    public void setPaid(boolean paid) {
        this.paid = paid;
    }





    public String getTransport() {
        return transport;
    }

    public void setTransport(String transport) {
        this.transport = transport;
    }

    public String getTransportKey() {
        return transportKey;
    }

    public void setTransportKey(String transportKey) {
        this.transportKey = transportKey;
    }

    public String getBuyer() {
        return buyer;
    }

    public void setBuyer(String buyer) {
        this.buyer = buyer;
    }

    public String getBuyerKey() {
        return buyerKey;
    }

    public void setBuyerKey(String buyerKey) {
        this.buyerKey = buyerKey;
    }

    public String getSeller() {
        return seller;
    }

    public void setSeller(String seller) {
        this.seller = seller;
    }

    public String getSellerKey() {
        return sellerKey;
    }

    public void setSellerKey(String sellerKey) {
        this.sellerKey = sellerKey;
    }


    public String getTypeOfSale() {
        return typeOfSale;
    }

    public void setTypeOfSale(String typeOfSale) {
        this.typeOfSale = typeOfSale;
    }

    public int getBilldate() {
        return billdate;
    }

    public void setBilldate(int billdate) {
        this.billdate = billdate;
    }

    public int getDeliveydate() {
        return deliveydate;
    }

    public void setDeliveydate(int deliveydate) {
        this.deliveydate = deliveydate;
    }

    public List<product> getProductList() {
        return productList;
    }

    public void setProductList(List<product> productList) {
        this.productList = productList;
    }


    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getAdvanceamt() {
        return advanceamt;
    }

    public void setAdvanceamt(int advanceamt) {
        this.advanceamt = advanceamt;
    }

    public boolean isAdvance() {
        return isAdvance;
    }

    public void setAdvance(boolean advance) {
        isAdvance = advance;
    }
}
