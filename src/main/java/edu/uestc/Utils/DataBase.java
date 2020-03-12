package edu.uestc.Utils;


import edu.uestc.po.InstanceRule;
import edu.uestc.po.Request;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DataBase {
    private static DataBase dataBase = new DataBase();
    private Connection con;
    private DataBase(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://192.168.1.9:3306/autosolve_test?useUnicode=true&characterEncoding=utf-8&useSSL=false&serverTimezone = GMT" ;
            String username = "root" ;
            String password = "woaizxl" ;
            con = DriverManager.getConnection(url , username , password );
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
    public static  DataBase getInstance(){
        return dataBase;
    }
//String questionId,int request,String solveResult,int over
    public Request queryRequest(String questionId,int request,int over) throws Exception{
        String sql = "select * from t_request where question_id='"+questionId+"' and request="+
                request+" and over=" + over;
        ResultSet rs = con.createStatement().executeQuery(sql);
        Request r = null;
        if(rs.next()){
             r  = new Request(
                    rs.getString("question_id"),
                    rs.getInt("request"),
                    rs.getString("solve_result"),
                    rs.getInt("over")
            );
        }
        return r;
    }

    public List<InstanceRule> queryInstanceRule(String keyword) {
        List<InstanceRule> list = new ArrayList<>();
        String sql = String.format("SELECT * FROM instance_rule where rule_content LIKE %s;","\'%" + keyword + "%\'");
        try {
            ResultSet rs = con.createStatement().executeQuery(sql);
            while (rs.next()){
                InstanceRule instanceRule  = new InstanceRule(
                        rs.getInt("rule_id"),
                        rs.getString("rule_name"),
                        rs.getString("rule_content"),
                        rs.getInt("type")
                );
                list.add(instanceRule);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    public static void main(String[] args) throws Exception{
        DataBase dataBase = DataBase.getInstance();
        System.out.println(1);
        dataBase.queryRequest("1",1,1);
        List<InstanceRule> list = dataBase.queryInstanceRule("函数");
        System.out.println(list.size());
        System.out.println(list);
    }
}
