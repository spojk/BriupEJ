package com.briup.apps.briupej.bean.extend;

import com.briup.apps.briupej.bean.Address;
import com.briup.apps.briupej.bean.Customer;
import com.briup.apps.briupej.bean.Order;
import com.briup.apps.briupej.bean.Waiter;

public class orderExtend extends Order {

    private Customer customer_ids;
    private Waiter waiter_id;
    private Address address_id;

    public Customer getCustomer_ids() {
        return customer_ids;
    }

    public void setCustomer_ids(Customer customer_ids) {
        this.customer_ids = customer_ids;
    }

    public Waiter getWaiter_id() {
        return waiter_id;
    }

    public void setWaiter_id(Waiter waiter_id) {
        this.waiter_id = waiter_id;
    }

    public Address getAddress_id() {
        return address_id;
    }

    public void setAddress_id(Address address_id) {
        this.address_id = address_id;
    }
}
