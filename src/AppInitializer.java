/*
 * ----------------------------------------------------------------------------------------
 * Copyright (c)  Thogakade. All rights reserved.
 * License under the  SriLanka.See License but in the project root for license information.
 * ----------------------------------------------------------------------------------------
 */

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;

/**
 * @autor shiran sandaruwan <sadaruwanshiran101@gmail.com>
 * @since 10/09/2021
 */
public class AppInitializer {
    Parent parent=(FXMLLoader.load(this.getClass().getResource("/view/CustomerForm.fxml")));
        primaryStage.setScene(new Scene(parent));
        primaryStage.show();
        new SlideInLeft(parent).play();
}
