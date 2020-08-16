
package tipos.de.comida;

import java.util.Scanner;

public class TiposDeComida {

    
    public static void main(String[] args) {
        
        Scanner Teclado =new Scanner(System.in);
        
        int opc;
        {            
           
    double  Vegetariana, Novegetariana, Rapida, Costodelosplatos, Iva, Descuento, Sv,Ens,Jg,Bc,Bp,Pc,Hb;
    double  Precio1,Precio2,Precio3, Preciototal;
               
    
    System.out.println("Seleccione el tipo de Comida que desea consumir:");
    System.out. println("1.Vegetarina");
    System.out. println("2.No vegetariana");
    System.out. println("3. Rápida");
    
    opc= Teclado.nextInt();
    
    switch(opc){
        
        case 1: 
            opc =1;
            System.out. println("Ingrese la cantidad Sopas de vegetales Consumidas");
            Sv = Teclado.nextInt();
            Costodelosplatos =Sv*10000;
            Iva = Costodelosplatos*0.19;
            Descuento = (Costodelosplatos +Iva)*0.20;
            Precio1 = (Costodelosplatos + Iva)-Descuento;
            System.out.print("El costo de las sopas de vegetales es"+Costodelosplatos);
            System.out.println("pesos");
            System.out.print("El impuesto a pagar por las sopas de vegetales es"+Iva);
            System.out.println("pesos");
            System.out.print("El descento en las sopas de vegetales es"+Descuento);
            System.out.println("pesos");
            
            
            System.out. println("Ingrese la cantidad Ensaladas Consumidas");
            Ens = Teclado.nextInt();
            Costodelosplatos =Ens*25000;
            Iva = Costodelosplatos*0.19;
            Descuento =(Costodelosplatos +Iva)*0.20;
            Precio2 =(Costodelosplatos + Iva)-Descuento;
            System.out.print("El costo de las Ensaladas es"+Costodelosplatos);
            System.out.println("pesos");
            System.out.print("El impuesto a pagar por las Ensaladas es"+Iva);
            System.out.println("pesos");
            System.out.print("El descento en las Ensaladas es"+Descuento);
            System.out.println("pesos");
                        
            System.out. println("Ingrese la cantidad de Jugos Consumidos");
            Jg = Teclado.nextInt();
            Costodelosplatos =Jg*5000;
            Iva = Costodelosplatos*0.19;
            Descuento =(Costodelosplatos +Iva)*0.20;
            Precio3 =(Costodelosplatos + Iva)-Descuento;
            Preciototal =Precio1+Precio2+Precio3;
            System.out.print("El costo de los Jugos es"+Costodelosplatos);
            System.out.println("pesos");
            System.out.print("El impuesto a pagar por los Jugos es"+Iva);
            System.out.println("pesos");
            System.out.print("El descento en los Jugos es"+Descuento);
            System.out.println("pesos");
            System.out.print("El Precio total de la comida vegetariana es"+Preciototal);
            System.out.println("pesos");
         break;
            
        case 2: 
            opc =2;
            System.out. println("Ingrese la cantidad de Bandejas de carne Consumidas");
            Bc = Teclado.nextInt();
            Costodelosplatos =Bc*30000;
            Iva = Costodelosplatos*0.19;
            Descuento =(Costodelosplatos +Iva)*0.10;
            Precio1 =(Costodelosplatos + Iva)-Descuento;
            System.out.print("El costo de las Bandejas de Carne es"+Costodelosplatos);
            System.out.println("pesos");
            System.out.print("El impuesto a pagar por Bandejas de Carne es"+Iva);
            System.out.println("pesos");
            System.out.print("El descento en las Bandejas de carne es"+Descuento);
            System.out.println("pesos");
                       
            System.out. println("Ingrese la cantidad de Bandejas de Pollo Consumidas");
            Bp = Teclado.nextInt();
            Costodelosplatos =Bp*28000;
            Iva = Costodelosplatos*0.19;
            Descuento =(Costodelosplatos +Iva)*0.10;
            Precio2 =(Costodelosplatos + Iva)-Descuento;
            System.out.print("El costo de las Bandejas de pollo es"+Costodelosplatos);
            System.out.println("pesos");
            System.out.print("El impuesto a pagar por las Bandejas de pollo es"+Iva);
            System.out.println("pesos");
            System.out.print("El descento en las Bandejas de pollo es"+Descuento);
            System.out.println("pesos");
                        
            System.out. println("Ingrese la cantidad de Jugos Consumidos");
            Jg = Teclado.nextInt();
            Costodelosplatos =Jg*5000;
            Iva = Costodelosplatos*0.19;
            Descuento =(Costodelosplatos +Iva)*0.10;
            Precio3 =(Costodelosplatos + Iva)-Descuento;
            Preciototal =Precio1+Precio2+Precio3;
            System.out.print("El costo de los Jugos es"+Costodelosplatos);
            System.out.println("pesos");
            System.out.print("El impuesto a pagar por los Jugos es"+Iva);
            System.out.println("pesos");
            System.out.print("El descento en los Jugos es"+Descuento);
            System.out.println("pesos");
            System.out.print("El Precio total de la comida No Vegetariana es"+Preciototal);
            System.out.println("pesos");
         break;
            
        case 3: 
            opc =3;
            System.out. println("Ingrese la cantidad de Perros Calientes Consumidos");
            Pc = Teclado.nextInt();
            Costodelosplatos =Pc*5000;
            Iva = Costodelosplatos*0.19;
            Precio1 =(Costodelosplatos + Iva);
            System.out.print("El costo de los perros caliente es"+Costodelosplatos);
            System.out.println("pesos");
            System.out.print("El impuesto a pagar por los Perros Calientes es"+Iva);
            System.out.println("pesos");
                       
            System.out. println("Ingrese la cantidad de Hambuergesas Consumidas");
            Hb = Teclado.nextInt();
            Costodelosplatos =Hb*7000;
            Iva = Costodelosplatos*0.19;
            Precio2 =(Costodelosplatos + Iva);
            System.out.print("El costo de las hamburgesas es"+Costodelosplatos);
            System.out.println("pesos");
            System.out.print("El impuesto a pagar por las hamburgesas es Calientes es"+Iva);
            System.out.println("pesos");
                        
            System.out. println("Ingrese la cantidad de Jugos Consumidos");
            Jg = Teclado.nextInt();
            Costodelosplatos =Jg*5000;
            Iva = Costodelosplatos*0.19;
            Precio3 =(Costodelosplatos + Iva);
            Preciototal =Precio1+Precio2+Precio3;
            System.out.print("El costo de los Jugos es"+Costodelosplatos);
            System.out.println("pesos");
            System.out.print("El impuesto a pagar por los Jugos es"+Iva);
            System.out.println("pesos");
            System.out.print("El Precio total de la comida Rápida es"+Preciototal);
            System.out.println("pesos");
                                     
            break;
      default:
            System.out. println("La opción seleccionada no es válida");
    }
        }
    }
}

        
   
