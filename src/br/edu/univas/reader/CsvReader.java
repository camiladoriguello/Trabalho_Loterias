package br.edu.univas.reader;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;


class Main {

    private static final String COMMA = ","; 

    public static void main(String[] args) throws Exception {
    	
    	ArrayList<String[]> sorteios = new ArrayList<String[]>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream("mega.csv"))); 
        String comma = null; 
        
        while ((comma = reader.readLine()) != null) {
            String[] dados = comma.split(COMMA);  
            sorteios.add(dados);
//            System.out.println("Nome: " + dados[0]);
//            System.out.println("País: " + dados[1]);
//            System.out.println("Fórum: " + dados[2]);
//            System.out.println("--------------------------");
        }
        reader.close();
    }
}