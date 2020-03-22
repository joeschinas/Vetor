package appproduto;

import java.util.Locale;
import java.util.Scanner;
import Entidade.Produto;

public class programaAp{

    
    public static void main(String[] args) {
       Locale.setDefault(Locale.US);
       
       Scanner read= new Scanner (System.in);
       
       
       int x = read.nextInt();
       Produto[] vetorProduto= new Produto[x];
       
       for (int i=0; i<x; i++){
           
        String nomeProduto = read.nextLine();
        double price= read.nextDouble();
        vetorProduto[i] = new Produto(nomeProduto, price);
       
       }
       double soma=0;
        for (Produto vetorProduto1 : vetorProduto) {
            soma += vetorProduto1.getPrice();
        }
             
       
       read.close();      
    }
    
}
