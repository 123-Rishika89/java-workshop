package com.vetias.java.workshop.temperaturedata;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import com.vetias.java.workshop.temperaturedata.beans.Organaization;
import com.vetias.java.workshop.temperaturedata.dao.OrganizationDAO;
public class JDBCExample {
    public static void main(String[] args) {
        Connection dbConnection = null;
        try{
            Class.forName("org.h2.Driver");
        } catch(ClassNotFoundException e){
            e.printStackTrace();
        }
        try {
            dbConnection =DriverManager.getConnection("jdbc:h2:mem:tempdataDB", "sa", null);
        } catch (SQLException sqlException) {
            System.out.println("Error Creating table:"+sqlException);
        }
        OrganizationDAO organizationDAO = new OrganizationDAO();
        organizationDAO.createTable(dbConnection);
        Organaization vet = new Organaization("VET", "Vellar Education Trust:",
         "www.vetias.ac.in","rishikas24csa@vetias.ac.in" ,"0423345678" ,
          123, null);
        organizationDAO.save(dbConnection,vet);
        Organaization myOrganaization = organizationDAO.findByName(dbConnection, "VET");
        System.out.println("My Organization is :" + myOrganaization); 
    }

}
