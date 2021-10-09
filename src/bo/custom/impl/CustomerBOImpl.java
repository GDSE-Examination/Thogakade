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

package bo.custom.impl;

import bo.custom.CustomerBO;
import bo.custom.ItemBO;
import dao.DAOFactory;
import dao.custom.CustomerDAO;
import dto.CustomerDTO;
import entity.Customer;

public class CustomerBOImpl implements ItemBO {

    static CustomerDAO customerDAO=(CustomerDAO) DAOFactory.getDAOFactory().getType(DAOFactory.Type.CUSTOMER);

    @Override
    public boolean addCustomer(CustomerDTO customerDTO) throws Exception {
        Customer customer=new Customer(customerDTO.getCustomerId(),customerDTO.getName(),customerDTO.getAddress(),customerDTO.getSalary());
        return customerDAO.add(customer);
    }
}
