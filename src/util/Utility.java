/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;


import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Profesor Lic. Gilberth Chaves Avila
 */
public class Utility {

    public static int random(){
        return 1+(int) Math.floor(Math.random()*99); 
    }
    
    public static int random(int bound){
        //return 1+random.nextInt(bound);
        return 1+(int) Math.floor(Math.random()*bound); 
    }
    
    public static int random(int boundLow, int boundMax){
        //return 1+random.nextInt(bound);
        return (int) ((Math.random() * (boundMax+1 - boundLow)) + boundLow); 
    }
    
    public static String format(double value){
        return new DecimalFormat("###,###,###,###.##")
                .format(value);
    }
    
    public static String $format(double value){
        return new DecimalFormat("$###,###,###,###.##")
                .format(value);
    }
     public static String perFormat(double value){
         //#,##0.00 '%'
        return new DecimalFormat("#,##0.00'%'")
                .format(value);
    }
    //Puede funcionar para estudiante y curso
    public static boolean equals(Object a, Object b) {
        switch(instanceOf(a,b)){//Devuelve String
            case "integer":
                Integer x = (Integer)a; Integer y = (Integer)b;
                return x.equals(b);
            case "string":
                String s1 = (String)a; String s2 = (String)b;
               // return s1.compareTo(s2)==0; Op1
                return s1.equalsIgnoreCase(s2); //Op2
//            case "Employee":
//                Employee emplo1 = (Employee)a; Employee emplo2 = (Employee)b;
//                return emplo1.getId()==emplo2.getId();//Comparo el id de 2 empleados
//            case "JobPosition":
//                JobPosition job1 = (JobPosition)a; JobPosition job2 = (JobPosition)b;
//                return job1.getDescription().equalsIgnoreCase(job2.getDescription());//Comparo la descripción de 2 puestos de trabajo
        }
        return false;//En cualquier otro caso retorne false;
    }

    private static String instanceOf(Object a, Object b) {
        if(a instanceof Integer && b instanceof Integer){return "integer";}
        if(a instanceof String && b instanceof String){return "string";}
//        if(a instanceof Employee && b instanceof Employee){return "Employee";}//Comparo 2 empleados
//        if(a instanceof JobPosition && b instanceof JobPosition){return "JobPosition";}//Comparo 2 empleados
        return "unknown";
    }

    public static boolean lessT(Object a, Object b) {
        switch(instanceOf(a,b)){//Devuelve String
            case "integer":
                Integer x = (Integer)a; Integer y = (Integer)b;
                return x<y;
            case "string":
                String s1 = (String)a; String s2 = (String)b;
                return s1.compareTo(s2)<0;//Primero mayor que segundo
               
        }
        return false;//En cualquier otro caso retorne false;
    }
    
    
    public static boolean greaterT(Object a, Object b) {
        switch(instanceOf(a,b)){//Devuelve String
            case "integer":
                Integer x = (Integer)a; Integer y = (Integer)b;
                return x>y;
            case "string":
                String s1 = (String)a; String s2 = (String)b;
                return s1.compareTo(s2)>0;//Primero mayor que segundo
        }
        return false;//En cualquier otro caso retorne false;
    }

    public static String dateFormat(Date date) {
        return new SimpleDateFormat("dd/MM/yyyy").format(date);
    }
}

