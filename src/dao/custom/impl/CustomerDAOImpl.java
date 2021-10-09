
/*
 * ----------------------------------------------------------------------------------------
 * Copyright (c)  Thogakade. All rights reserved.
 * License under the  SriLanka.See License but in the project root for license information.
 * ----------------------------------------------------------------------------------------
 */

/**
 * @autor shiran sandaruwan <sadaruwanshiran101@gmail.com>
 * @since 10/09/2021
 */
package dao.custom.impl;

import dao.CrudUtill;
import dao.custom.CustomerDAO;
import entity.Customer;

public class CustomerDAOImpl implements CustomerDAO {
    @Override
    public boolean add(Customer customer) throws Exception {
            String sql="insert into customer values(?,?,?,?)";
            return CrudUtill.executeUpdate(sql,customer.getCustomerId(),customer.getName(),customer.getAddress(),customer.getSalary());
    }

}
