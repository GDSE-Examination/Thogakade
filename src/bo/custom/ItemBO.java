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

package bo.custom;

import bo.SuperBO;
import dto.ItemDTO;

public interface ItemBO extends SuperBO {
    public boolean addItem(ItemDTO itemDTO) throws Exception;
}
