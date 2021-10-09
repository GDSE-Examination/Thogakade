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
import dao.custom.ItemDAO;
import entity.Customer;
import entity.Item;

public class ItemDAOImpl implements ItemDAO {
    @Override
    public boolean add(Item item) throws Exception {
        String sql="insert into item values(?,?,?,?)";
        return CrudUtill.executeUpdate(sql,item.getItemId(),item.getName(),item.getQty(),item.getPrice());
    }
}
