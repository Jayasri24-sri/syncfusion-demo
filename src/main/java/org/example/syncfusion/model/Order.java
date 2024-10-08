package org.example.syncfusion.model;

public class Order
{
    private int orderId;
    private String customerName;
    private double freight;
    private String shipCountry;

    public Order(int orderId, String customerName, double freight, String shipCountry)
    {
        this.orderId = orderId;
        this.customerName = customerName;
        this.freight = freight;
        this.shipCountry = shipCountry;
    }

    public int getOrderId()
    {
        return orderId;
    }

    public void setOrderId(int orderId)
    {
        this.orderId = orderId;
    }

    public String getCustomerName()
    {
        return customerName;
    }

    public void setCustomerName(String customerName)
    {
        this.customerName = customerName;
    }

    public double getFreight()
    {
        return freight;
    }

    public void setFreight(double freight)
    {
        this.freight = freight;
    }

    public String getShipCountry()
    {
        return shipCountry;
    }

    public void setShipCountry(String shipCountry)
    {
        this.shipCountry = shipCountry;
    }
}

