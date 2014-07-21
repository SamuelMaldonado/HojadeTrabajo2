/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Main;

import java.io.*;
/**
 *
 * @author Javier Bucaro
 */
public class Calculadora {
    public static void main(String[] args){
        String data;
        File file = new File("Archivo.txt");
        
        if(!file.exists()){
            try{
                file.createNewFile();
                System.out.println(file.getName()+" Ha sido creado");
            }catch(IOException ex){
                ex.printStackTrace();
            }       
        }
        
        try{
            FileReader fr = new FileReader("C:\\Users\\Javier Bucaro\\Documents\\NetBeansProjects\\Calculadora\\Archivo.txt");
            BufferedReader br = new BufferedReader(fr);
            
            while((data=br.readLine())!=null){
                System.out.println(""+data);
            }
        }catch(Exception ex){
            
        }
    }    
}
