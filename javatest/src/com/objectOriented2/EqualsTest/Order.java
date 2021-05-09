package com.objectOriented2.EqualsTest;

import com.sun.org.apache.xpath.internal.operations.Or;

import java.util.Objects;

public class Order {
    private int orderId;
    private String orderName;
//    private Object Order;


    public Order(int orderId, String orderName) {
        this.orderId = orderId;
        this.orderName = orderName;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    @Override
    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Order order = (Order) o;
//        return orderId == order.orderId && Objects.equals(orderName, order.orderName);
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
//        if (o instanceof Order){
        Order order = (Order) o;
        return this.orderId == ((Order) o).orderId &&
                this.orderName.equals(((Order) o).orderName);
//        }
//        return false;

    }

}

class OrderTest{
    public static void main(String[] args) {
        Order order1 = new Order(1001, "msx");
        Order order2 = new Order(1001, "msx");
        Order order3 = new Order(1001, "msx");
        Order order4 = order1;

        System.out.println(order1.equals(order2));

        System.out.println(order1.equals(order4));
    }
}
