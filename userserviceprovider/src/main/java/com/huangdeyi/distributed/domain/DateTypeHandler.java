package com.huangdeyi.distributed.domain;

import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;
import org.apache.ibatis.type.MappedTypes;
import org.apache.ibatis.type.TypeHandler;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;

@MappedTypes({Date.class})
@MappedJdbcTypes({JdbcType.DATE})
public class DateTypeHandler implements TypeHandler<Date> {
    private static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");

    public void setParameter(PreparedStatement preparedStatement, int i, Date date, JdbcType jdbcType) throws SQLException {
        //先格式化日期
        simpleDateFormat.format(date);
        preparedStatement.setObject(i,date);
    }

    public Date getResult(ResultSet resultSet, String s) throws SQLException {
        Date date  = (Date) resultSet.getObject(s);
        simpleDateFormat.format(date);
        return date;
    }

    public Date getResult(ResultSet resultSet, int i) throws SQLException {
        Date date  = (Date) resultSet.getObject(i);
        simpleDateFormat.format(date);
        return date;
    }

    public Date getResult(CallableStatement callableStatement, int i) throws SQLException {
        Date date  = (Date) callableStatement.getObject(i);
        simpleDateFormat.format(date);
        return date;
    }
}
