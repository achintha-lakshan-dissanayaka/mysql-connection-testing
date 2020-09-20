package com.example;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DbImpl {

    private static final String URL = "jdbc:mysql://localhost:3306/person_details";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "1234";

    private Connection connection;
    private PreparedStatement selectAllPeople;

    public DbImpl() {

        try {
            connection =
                    DriverManager.getConnection(URL , USERNAME , PASSWORD);

            selectAllPeople =
                    connection.prepareStatement("SELECT * FROM p_details");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public List<Person> getAllPeople(){
        List<Person> results = null;
        ResultSet resultSet = null;

        try {
            resultSet = selectAllPeople.executeQuery();
            results = new ArrayList<>();

            while (resultSet.next()){
                results.add(new Person(resultSet.getString("fname"),
                        resultSet.getString("lname"),
                        resultSet.getString("address"),
                        resultSet.getString("email")));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            try {
                resultSet.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
                close();
            }
        }

        return results;
    }

    public void close(){
        try {
            connection.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
