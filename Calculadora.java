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
        int operando1 = 0;
        int operando2 = 0;
        int resultado = 0;
                
        
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
        
        
        //ciclo que compara cada caracter para saber si hacer push o pop y que operacion realizar
        for (int x=0; x<car.length(); x++){
	        if (car.charAt(x)=='+'){					//suma los 2 ultimos valores si encuentra un "+"
	        	operando1 = data.pop();
	        	operando2 = data.pop();
	        	resultado = operando1 + operando2;
	        	data.push(resultado);
	        }

	        if (car.charAt(x)=='-'){					//resta los 2 ultimos valores si encuentra un "-"
	        	operando1 = data.pop();
	        	operando2 = data.pop();
	        	resultado = operando1 - operando2;
	        	data.push(resultado);
	        }
	       
	        if (car.charAt(x)=='*'){					//multiplica los 2 ultimos valores si encuentra un "*"
	        	operando1 = data.pop();
	        	operando2 = data.pop();
	        	resultado = operando1 * operando2;
	        	data.push(resultado);	        	
	        }
	        
	        if (car.charAt(x)=='/'){					//divide los 2 ultimos valores si encuentra un "/"
	        	operando1 = data.pop();
	        	operando2 = data.pop();
	        	resultado = operando1 / operando2;
	        	data.push(resultado);	        	
	        }	        
	        
	        if (car.charAt(x)=='0' || car.charAt(x)=='1' || car.charAt(x)=='2' || car.charAt(x)=='3' 			//si encuentra un numero lo guarda en la pila
	        		 || car.charAt(x)=='4' || car.charAt(x)=='5' || car.charAt(x)=='6' || car.charAt(x)=='7' 
	        		 || car.charAt(x)=='8' || car.charAt(x)=='9'){
	        	data.push((int)car.charAt(x));
	        }	        
        }
        
        System.out.println(data.pop());					//se imprime el resultado final
    }    
}
