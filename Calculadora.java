/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.*;
/**
 *
 * @author Javier Bucaro
 */
public class Calculadora {
    private static Stack<Integer> data;
    public static void main(String[] args){
        data = new StackVector<Integer>();
        File file = new File("Datos.txt");
        String car=null;
                
        
        if(!file.exists()){
            try{
                file.createNewFile();
                System.out.println(file.getName()+" Ha sido creado");
            }catch(IOException ex){
                ex.printStackTrace();
            }       
        }
        
        try{
            FileReader fr = new FileReader("C:\\Users\\Samuel\\git\\HojadeTrabajo2\\Datos.txt");
            BufferedReader br = new BufferedReader(fr); 
            
            car = br.readLine();
        }catch(Exception ex){
            
        }
        
        for (int x=0; x<car.length(); x++){
	        if (car.charAt(x)=='+'){
	        	
	        }

	        if (car.charAt(x)=='-'){
	        	
	        }
	       
	        if (car.charAt(x)=='*'){
	        	
	        }
	        
	        if (car.charAt(x)=='/'){
	        	
	        }	        
	        
	        if (car.charAt(x)=='0' || car.charAt(x)=='1' || car.charAt(x)=='2' || car.charAt(x)=='3' 
	        		 || car.charAt(x)=='4' || car.charAt(x)=='5' || car.charAt(x)=='6' || car.charAt(x)=='7' 
	        		 || car.charAt(x)=='8' || car.charAt(x)=='9'){
	        	data.push(car.charAt(x));
	        }	        
        }
    }    
}
