package com.huijia.principle.compositionaggregation;

/**
 * @author Admin
 */
public class MySQLConnection extends DBConnection {
    @Override
    public String getConnection() {
        return "MySQL数据库连接";
    }
}
