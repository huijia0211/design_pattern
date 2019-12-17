package com.huijia.principle.compositionaggregation;

/**
 * @author Admin
 */
public class PostgreSQLConnection extends DBConnection {
    @Override
    public String getConnection() {
        return "PostgreSQL数据库连接";
    }
}
