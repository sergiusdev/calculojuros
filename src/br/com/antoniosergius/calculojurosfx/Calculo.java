package br.com.antoniosergius.calculojurosfx;

public class Calculo {
   public static double calculaMontante(double principal, double taxa, int periodo){
     return principal * Math.pow(1+taxa,periodo);
   }
  
   public static double calculaPrincipal(double montante, double taxa, int periodo){
     return montante / Math.pow(1+taxa,periodo);
   }

   public static double calculaTaxa(double montante, double principal, int periodo){
     return (Math.pow(montante/principal, 1.0/periodo) - 1.0) * 100;
   }
  
   public static double calculaPeriodo(double montante, double principal, double taxa){
     return Math.log(montante/principal)/ Math.log(1+taxa);
   }
}
