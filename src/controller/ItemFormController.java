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

package controller;

import bo.BOFactory;
import bo.custom.CustomerBO;
import bo.custom.ItemBO;
import dto.CustomerDTO;
import dto.ItemDTO;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import com.jfoenix.controls.JFXTextField;

public class ItemFormController {
    public JFXTextField txtitemId;
    public JFXTextField txtitemName;
    public JFXTextField txtitemQty;
    public JFXTextField txtitemPrice;

    public static ItemBO bo= (CustomerBO) BOFactory.getBoFactory().getType(BOFactory.Type.ITEM);


    public void CustomerAddOnAction(ActionEvent actionEvent) {
        String id=txtitemId.getText();
        String name=txtitemName.getText();
        String qty=txtitemQty.getText();
        double price=Double.parseDouble(txtitemPrice.getText());

        ItemDTO itemDTO=new ItemDTO(id,name,qty,price);
        boolean res=bo.addItem(itemDTO);
        if (res){
            new Alert(Alert.AlertType.INFORMATION,"Item Added!", ButtonType.OK).show();
            setAllDoctor();
        }else {
            new Alert(Alert.AlertType.INFORMATION,"fail!",ButtonType.OK).show();
        }

    }


}
