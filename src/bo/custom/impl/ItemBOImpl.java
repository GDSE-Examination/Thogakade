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

import bo.custom.ItemBO;
import dao.DAOFactory;
import dao.custom.CustomerDAO;
import dao.custom.ItemDAO;
import dto.ItemDTO;
import entity.Item;

public class ItemBOImpl implements ItemBO {

    static ItemDAO itemDAO=(ItemDAO) DAOFactory.getDAOFactory().getType(DAOFactory.Type.ITEM);

    @Override
    public boolean addItem(ItemDTO itemDTO) throws Exception{
        Item item=new Item(itemDTO.getItemId(),itemDTO.getName(),itemDTO.getQty(),itemDTO.getPrice());
        return itemDAO.add(item);
    }
}
