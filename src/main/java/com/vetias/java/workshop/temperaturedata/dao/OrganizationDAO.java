package com.vetias.java.workshop.temperaturedata.dao;

import java.sql.Statement;
import java.time.LocalDate;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.vetias.java.workshop.temperaturedata.beans.Oranganaization;
import com.vetias.java.workshop.temperaturedata.dao.OrganizationDAO;

public class OrganizationDAO {
    public void createTable(Connection dbConnection){
            try(Statement statement =dbConnection.createStatement()){
               statement.execute("""
                create table organization(
                id int AUTO_INCREMENT PRIMARY KEY,
                NAME VARCHAR(100),
                WEBSITE VARCHAR(100),
                EMAIL VARCHAR(100),
                CONTACT_NUMBER VARCHAR(100),
                REGISTRATION_NO INT,
                description VARCHAR(567))
                """);   
        } catch (SQLException SqlException) {
            System.out.println("Error creating Table" +SqlException);  
        }
    }
    public int save (Connection dbConnection, Oranganaization vet) {
        try (PreparedStatement preparedStatement = dbConnection.prepareStatement("""
            insert into organization (name, website, email, contact_number, 
            REGISTRATION_NO, description) values(?,?,?,?,?,?)
        """)){
            preparedStatement.setString(1, vet.name());
            preparedStatement.setString(2, vet.website());
            preparedStatement.setString(3, vet.email());
            preparedStatement.setString(4, vet.contactNumber());
            preparedStatement.setLong(5, vet.registrationNumber());
            preparedStatement.setString(6, vet.description());
            preparedStatement.executeUpdate();  
        } catch (SQLException  sqlException) {
            System.out.println("Error inserting into table:"+sqlException);
        }
        return 0;
    }
}
