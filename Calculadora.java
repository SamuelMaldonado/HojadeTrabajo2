<<<<<<< HEAD
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Main;

/**
 *
 * @author Javier Bucaro
 */
public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
=======
import java.io.*;

 /**
   * @Calculadora.java  1.0 18/07/2014
   *
   * Universidad del Valle de Guatemala.
   * Seccion: 21 P.O.O.
   * @author Brandon Mendez Carnet: 13087
   * @author Javier Bucaro: 13033
   * @author Samuel Maldonado: 13153
   * Calculadora: Lee un archivo.txt una expresion en un formato postfix y lo calcula
   * 
   *
   */
public class Calculadora {
	private StackVector<> stackvector;
	private static String stringDatos;
	
	public static void main(String [] arg) {
	      File text = null;													//Objeto de tipo File
	      FileReader fr = null;												//Se crea objeto lector de objetos File
	      BufferedReader br = null;											//Objeto que me carga en el buffer
	 
	      try {
	         text = new File ("Datos.txt");									//Se abre el fichero
	         fr = new FileReader (text);									//Lector del archivo
	         br = new BufferedReader(fr);									//Se carga el archivo
	
	         stringDatos=br.readLine();										//Se guarda lo leido en stringDatos
 
	      }
	      catch(Exception e){
	         e.printStackTrace();
	      }finally{															//Se asegura que se cierre el fichero
	         try{                    
	            if( null != fr ){   
	               fr.close();     
	            }                  
	         }catch (Exception e2){ 
	            e2.printStackTrace();
	         }
	      }
	      
	      //stackvector.
	      
	      
	      
	}
}

>>>>>>> origin/master
