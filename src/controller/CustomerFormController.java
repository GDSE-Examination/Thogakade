/*
 * ----------------------------------------------------------------------------------------
 * Copyright (c)  Thogakade. All rights reserved.
 * License under the  SriLanka.See License but in the project root for license information.
 * ----------------------------------------------------------------------------------------
 */

package controller;

import bo.BOFactory;
import bo.custom.CustomerBO;
import dto.CustomerDTO;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;

/**
 * @autor shiran sandaruwan <sadaruwanshiran101@gmail.com>
 * @since 10/09/2021
 */
public class CustomerFormController {
    public JFXTextField txtcusId;
    public JFXTextField txtcusName;
    public JFXTextField txtcusAddress;
    public JFXTextField txtcusSalary;

    public static CustomerBO bo= (CustomerBO) BOFactory.getBoFactory().getType(BOFactory.Type.CUSTOMER);

    public void CustomerAddOnAction(ActionEvent actionEvent) {
        String id=txtcusId.getText();
        String name=txtcusName.getText();
        String address=txtcusAddress.getText();
        double salary=Double.parseDouble(txtcusSalary.getText());

        CustomerDTO customerDTO=new CustomerDTO(id,name,address,salary);
        boolean res=bo.addCustomer(customerDTO);
        if (res){
            new Alert(Alert.AlertType.INFORMATION,"Customer Added!", ButtonType.OK).show();
        }else {
            new Alert(Alert.AlertType.INFORMATION,"fail!",ButtonType.OK).show();
        }

    }
}
