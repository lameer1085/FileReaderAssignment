package com.AssignmentFilePropertiesRrader;

public class MainApp {
    public static void main (String[]args) {

       PropertyReader obj = new PropertyReader();

           if (obj.readPropData()){
               System.out.println("Property reader completed successfully");
               //obj.readPropData();
           }else{
               System.out.println("Property reader not completed, it was stuck with error ");
           }
    }
}
