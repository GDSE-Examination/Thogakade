
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

package dao;

import db.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CrudUtill {
    private static PreparedStatement getPreparedStatement(String sql, Object... prms) throws SQLException, ClassNotFoundException {
        Connection connection= DBConnection.getInstance().getConnection();
        PreparedStatement stm=connection.prepareStatement(sql);

        for(int i=0; i<prms.length; i++){
            stm.setObject((i+1),prms[i]);
        }
        return stm;
    }
    public static boolean executeUpdate(String sql,Object... prms) throws SQLException, ClassNotFoundException {
        PreparedStatement stm=getPreparedStatement(sql,prms);
        return stm.executeUpdate()>0;
    }
    public static ResultSet executeQuery(String sql, Object... prms) throws SQLException, ClassNotFoundException {
        PreparedStatement stm=getPreparedStatement(sql,prms);
        return stm.executeQuery();
    }
}
