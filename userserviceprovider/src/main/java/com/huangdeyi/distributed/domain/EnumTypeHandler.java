package com.huangdeyi.distributed.domain;

import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;
import org.apache.ibatis.type.MappedTypes;
import org.apache.ibatis.type.TypeHandler;

import javax.naming.Name;
import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@MappedTypes({Gender.class})
@MappedJdbcTypes({JdbcType.INTEGER})
public class EnumTypeHandler implements TypeHandler<Gender> {
    //设置参数时转换
    public void setParameter(PreparedStatement preparedStatement, int i, Gender gender, JdbcType jdbcType) throws SQLException {
        if(Gender.MAN.equals(gender)){
            preparedStatement.setString(i,"男");
        }
        else{
            preparedStatement.setString(i,"女");
        }
    }

    //得到结果时转换
    public Gender getResult(ResultSet resultSet, String s) throws SQLException {
        //resultSet是返回的结果集，s是对应的列名
        String gender = resultSet.getString(s);
        if("男".equals(gender)){
            return Gender.MAN;
        }
        else{
            return Gender.FEMALE;
        }
    }

    public Gender getResult(ResultSet resultSet, int i) throws SQLException {

        //resultSet是返回的结果集，i是对应的列的在结果集中的索引
        String gender = resultSet.getString(i);
        if("男".equals(gender)){
            return Gender.MAN;
        }
        else{
            return Gender.FEMALE;
        }
    }

    public Gender getResult(CallableStatement callableStatement, int i) throws SQLException {
        //i是对应的列的在结果集中的索引
        String gender = callableStatement.getString(i);
        if("男".equals(gender)){
            return Gender.MAN;
        }
        else{
            return Gender.FEMALE;
        }
    }
}
