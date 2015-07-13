package javaapplication1;

import java.math.*;
import javax.swing.JOptionPane;

public class Algoritmo {
    public int m=10000;
    public int n=100;
    public int c=10000;
    public long sumaPI;
    public long sumaPH;    
    public long sumaBandera;    
    public int torneo[] = new int[c];
    public int pobIni[][] = new int[m][n+1];
    double prob_cruce;
    double prob_mutacion;
    double conver;
    
     public int pobIni_mantener[][] = new int[m][n+1];

    public void setPobIni(int[][] pobIni) {
        this.pobIni = pobIni;
    }
    public int hijo[][] = new int[m][n+1];
    public double funcionAdaptacion[] = new double[m];
    public int hijoMutado[][] = new int[m][n+1];
    public int parejaA[][]=new int[m/2][n+2];
    public int parejaB[][]=new int[m/2][n+2];
    public float cruce[][]=new float[m/2][2];
    public float mutacion[][]=new float[m/2][2];
    
    

    public long getSumaBandera() {
        return sumaBandera;
    }
    public long getSumaPI() {
        return sumaPI;
    }
    public long getSumaPH() {
        return sumaPH;
    }
    
    public int getM() {
        return m;
    }
    public void setM(int m) {
        this.m = m;
    }
    public int getN() {
        return n;
    }
    public void setN(int n) {
        this.n = n;
    }
    public int[][] getPobIni() {
        
        return pobIni;
    }

    public int[][] getHijoMutado() {
        return hijoMutado;
    }
    
    public int[][] getParejaA() {
        
        return parejaA;
    }
    public int[][] getParejaB() {
        
        return parejaB;
    }
    public Algoritmo(int m, int n, int c, double cruce, double mutacion, double conver) {
        this.m = m;
        this.n = n;
        this.c = c;
        this.prob_cruce=cruce;
        this.prob_mutacion=mutacion;
        this.conver=conver;
    }

    
    public void Genera() {
        generarPoblacionInicial();
    }
    public void Mantener(int[][] pobla) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n+2; j++) {
                pobIni[i][j]=pobla[i][j];
            }
        }
        sumaPI=generarValor(pobIni);
        
        sumaBandera=sumaPI;
        probabilidadSeleccion(pobIni);
    }
    
    public void Procesar() {

        llenarParejas();
        probabilidadCruce();
        Cruce();
        probabilidadMutaacion();
        Mutacion();
        //JOptionPane.showMessageDialog(null, "Proceso");
    }
    public void Reemplazar(){
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n+2; j++) {
                pobIni[i][j]=hijoMutado[i][j];
            }
        }
        sumaPI=sumaPH;
        probabilidadSeleccion(pobIni);
    }

    
    public void generarPoblacionInicial(){
            for (int i = 0; i < m; i++) {
            
            for (int j = 0; j < n; j++) {
                pobIni[i][j] = (int)(Math.random()*10)%2;
            }      
            }
        sumaPI=generarValor(pobIni);
        sumaBandera=sumaPI;
        probabilidadSeleccion(pobIni);
        //JOptionPane.showMessageDialog(null, "Genero poblacion inicial");
    }
    public int funcionprincipal(int valor){
        return (int)Math.pow(valor, 2);
    }
    public int generarValor(int poblacion[][]){
        int suma, x, j;
        int sumap=0;
        for (int i = 0; i < m; i++) {
            suma=0; x=0; 
            for ( j = n-1 ; j >= 0; j--) {
                suma+=poblacion[i][j]*(Math.pow(2, x));
                x++;
            }
            poblacion[i][n]=suma;
            //
            poblacion[i][n+1]=funcionprincipal(suma);//funcion principal
            //
            sumap=sumap+poblacion[i][n+1];
            
        }
        return sumap;
    }
    public void probabilidadSeleccion(int poblacion[][]){
        for (int i = 0; i < m; i++) {
            funcionAdaptacion[i]=(double)poblacion[i][n+1]/(double)sumaBandera;
        }
    }
    public void llenarParejas(){
       int bandera=0;
       int bandera1=0;
       int p=0;
        for (int i = 0; i < m/2; i++) {
            p=0;
            while(p==0){
                bandera=Torneo();
                bandera1=Torneo();
                if (bandera!=bandera1) {
                    for (int j = 0; j < n+2; j++) {

                    parejaA[i][j]=pobIni[bandera][j];
                    parejaB[i][j]=pobIni[bandera1][j];

                    }
                    p=1;
                }
                else {
                    p=0;
                }
            }
        }
    }
    public int Torneo(){
        
        int i=0,j; 
        int mayor=0;
        int ganador=0;
        torneo[i]=(int)(Math.random()*(m));
        for(i=1;i<c;i++) 
        { 
            torneo[i]=(int)(Math.random()*(m)); 
            for(j=0;j<i;j++) 
            { 
                if(torneo[i]==torneo[j]) 
                { 
                    i--; 
                } 
            } 
            
        }

        mayor=pobIni[torneo[0]][n+1];
        ganador=torneo[0];
        for (int k = 1; k < c; k++) {
            
            if (pobIni[torneo[k]][n+1]>mayor) {
                mayor=pobIni[torneo[k]][n+1];
                ganador=torneo[k];
            }
        }
        return ganador;
    }
    
    
    public void probabilidadCruce(){
        for (int i = 0; i < m/2; i++) {
            cruce[i][0]=((float)Math.random()*10+1)/10;
            if (cruce[i][0]>=prob_cruce) {cruce[i][1]=(int)(Math.random()*n-1)+1;}
            else{cruce[i][1]=0;}
            
        }
    }
    
    
    public void Cruce(){
        int i=0;
        int k=0;
        
        while (i < m-1 )  {
            if (cruce[k][0]>=prob_cruce) {
                for (int j = 0; j < n; j++) {
                    if (j<cruce[i][1]) {
                        hijo[i][j]=parejaA[k][j];
                        hijo[i+1][j]=parejaB[k][j];
                    }else{
                        hijo[i][j]=parejaB[k][j];
                        hijo[i+1][j]=parejaA[k][j];
                    }
                } 
            }else{
                for (int j = 0; j < n; j++) {
                    hijo[i][j]=parejaA[k][j];
                    hijo[i+1][j]=parejaB[k][j];
                }
            }
            k++;
            i=i+2;
        }
    }
    public void probabilidadMutaacion(){
        int suma=0;
        for (int i = 0; i < m; i++) {
            mutacion[i][0]=((float)Math.random()*10+1)/10;
            if (mutacion[i][0]>=prob_mutacion) {
                mutacion[i][1]=(int)(Math.random()*n);
                suma++;
            }
            else{mutacion[i][1]=-1;}
        }
            
        
    }
    public void Mutacion(){
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                hijoMutado[i][j]=hijo[i][j];
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (j==mutacion[i][1]) {
                    if (hijoMutado[i][j]==0) {
                        hijoMutado[i][j]=1;
                    }else
                    if (hijoMutado[i][j]==1) {
                        hijoMutado[i][j]=0;
                    }
                }
            }
        }
        sumaPH=generarValor(hijoMutado);
        
    }
    public boolean convergio(){
        double suma[]=new double[n];
        double sum=0;
        for (int j = 0; j < m; j++) {
                for (int k = 0; k < n; k++) {
                    suma[k]+=hijoMutado[j][k];
                }
            }
            for (int k = 0; k < n; k++) {
                if (suma[k]/m>=conver||suma[k]/m<=(1-conver)) {
                    sum++;
                }
            }
            if (sum==n) {
                JOptionPane.showMessageDialog(null, "La población convergio");
                return true;
            }else{ //JOptionPane.showMessageDialog(null, "NO convergio");
              return false;  
            }
            
    }
    public String imprimir(){
        String mensaje = " Poblacion generada y computada: \n\n";
        String individuo = " ";
        String mensaje2 = " Poblacion dividida A: \n\n";
        String mensaje3 = " Poblacion dividida B: \n\n";
        String mensaje4 = " Probabilidad de punto de cruce: \n\n";
        String mensaje5 = " Hijos cruzados(Sin mutar): \n\n";
        String mensaje6 = " Hijos mutados: \n\n";
        String division="____________________________________________________|";
        int j=0;
        for (int i = 0; i < m; i++) {
            individuo = " ";
            String a=".";

            for (j = 0; j < n; j++) {
                if (j==n-1) {a="";}
                else {a=".";}
                individuo += pobIni[i][j]+a ;
            }

            mensaje += " "+(i+1)+".\t"+individuo+" = \t"+pobIni[i][j]+"\t FA : \t"+pobIni[i][j+1]+"\t PS : \t"+funcionAdaptacion[i]+"\n";
        }
        mensaje+="---> Valor de población inicial : "+sumaPI;
        for (int i = 0; i < m/2; i++) {
            individuo = " ";
            for (j = 0; j < n; j++) {
                individuo += parejaA[i][j]+"" ;
            }
            mensaje2 += individuo+" = "+parejaA[i][j]+"\n";
        }
        for (int i = 0; i < m/2; i++) {
            individuo = " ";
            for (j = 0; j < n; j++) {
                individuo += parejaB[i][j]+"" ;
            }
            mensaje3 += individuo+" = "+parejaB[i][j]+"\n";
        }
        for (int i = 0; i < m/2; i++) {
            mensaje4 += " Pareja ["+i+"] \t: "+cruce[i][0]+" \t- Punto de cruce : "+cruce[i][1]+"\n";
        }
        for (int i = 0; i < m; i++) {
            individuo = " ";
            String a=".";
            for (j = 0; j < n; j++) {
                if (j==n-1) {a="";}
                else {a=".";}
                individuo += hijo[i][j]+a ;
            }

            mensaje5 += " "+(i+1)+".\t"+individuo+"\n";
        }
        for (int i = 0; i < m; i++) {
            individuo = " ";
            String a=".";
            String c=" ";
            for (j = 0; j < n; j++) {
                if (j==n-1) {a="";}
                else {a=".";}
                individuo += hijoMutado[i][j]+a ;
            }

            if (mutacion[i][1]>=0) {
                c="  ";
            }
            mensaje6 += " "+(i+1)+".\t"+individuo+" - Gen mutado :"+c+mutacion[i][1]+" = "+hijoMutado[i][j]+"\t FA : "+hijoMutado[i][j+1]+"\n";
        }
        mensaje6+="---> Valor de población Hija : "+sumaPH+"\n";
        return mensaje+"\n"+division+"\n"+mensaje2+"\n"+mensaje3+division+"\n"+mensaje4+division+"\n"+mensaje5+division+"\n"+mensaje6+division+"\n";
    }
}