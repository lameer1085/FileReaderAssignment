package com.AssignmentFilePropertiesRrader;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyReader {
    public boolean readPropData(){
        FileInputStream input = null;
        Properties prop= new Properties();

        try{
            input = new FileInputStream("C:\\Users\\lamee\\OneDrive\\Desktop\\Selenium Recording\\File_IO\\New folder\\studentsdetails.properties");
            prop.load(input);

            propertyModel set= new propertyModel();
            set.setStudentName(prop.getProperty("studentname"));
            set.setStudentAge(prop.getProperty("studentage"));
            set.setStudentLocation(prop.getProperty("studentlocation"));

            //String SName = prop.getProperty("studentname");
            //String SAge = prop.getProperty("studentage");
            //String SLocation = prop.getProperty("studnetlocation");
            //System.out.println(SName+" "+SAge+" "+SLocation);

            System.out.println((set.getStudentName())+"\n"+(set.getStudentAge())+"\n"+(set.getStudentLocation()));
                    return true;

        }catch(IOException e){
            e.printStackTrace();
            return false;
        }finally {
            if(input !=null){
                try{
                    input.close();
                }catch(IOException e2){
                    e2.printStackTrace();
                }

            }
        }
    }
}
