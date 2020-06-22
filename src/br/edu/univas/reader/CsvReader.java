package br.edu.univas.reader;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import br.edu.univas.vo.*;

public class CsvReader {
    private static final String COMMA = ","; 
    
    public ArrayList<Mega> readMegaCsv() throws Exception {
    	ArrayList<Mega> sorteadosDaMega = new ArrayList<Mega>();
    	BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream("mega.csv")));
        String comma = null; 
        
        while ((comma = reader.readLine()) != null) {
            String[] dados = comma.split(COMMA); 
            int[] numerosSorteados = new int[6];
            Mega jogoMega = new Mega();
            jogoMega.setId(stringToInt(dados[0])); //adicionando o "ID" do jogo
            jogoMega.setData(dados[1]);
            numerosSorteados[0] = stringToInt(dados[2]);
            numerosSorteados[1] = stringToInt(dados[3]);
            numerosSorteados[2] = stringToInt(dados[4]);
            numerosSorteados[3] = stringToInt(dados[5]);
            numerosSorteados[4] = stringToInt(dados[6]);
            numerosSorteados[5] = stringToInt(dados[7]);
            
            jogoMega.setNumerosSorteados(numerosSorteados);
            sorteadosDaMega.add(jogoMega); 
        }
        reader.close();
        return sorteadosDaMega;
    }
    
    public void readQuinaCsv() throws Exception {
    	ArrayList<Quina> sorteadosDaQuina = new ArrayList<Quina>();
    	BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream("quina.csv")));
        String comma = null; 
        
        while ((comma = reader.readLine()) != null) {
            String[] dados = comma.split(COMMA); 
            int[] numerosSorteados = new int[5];
            Quina jogoQuina = new Quina();
            jogoQuina.setId(stringToInt(dados[0])); //adicionando o "ID" do jogo
            jogoQuina.setData(dados[1]);
            numerosSorteados[0] = stringToInt(dados[2]);
            numerosSorteados[1] = stringToInt(dados[3]);
            numerosSorteados[2] = stringToInt(dados[4]);
            numerosSorteados[3] = stringToInt(dados[5]);
            numerosSorteados[4] = stringToInt(dados[6]);
            
            jogoQuina.setNumerosSorteados(numerosSorteados);
            sorteadosDaQuina.add(jogoQuina); 
        }
        reader.close();
    }

    public void readLotofacilCsv() throws Exception {
    	ArrayList<Lotofacil> sorteadosDaLotofacil = new ArrayList<Lotofacil>();
    	BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream("lotofacil.csv")));
        String comma = null; 
        
        while ((comma = reader.readLine()) != null) {
            String[] dados = comma.split(COMMA); 
            int[] numerosSorteados = new int[15];
            Lotofacil jogoLotofacil = new Lotofacil();
            jogoLotofacil.setId(stringToInt(dados[0])); //adicionando o "ID" do jogo
            jogoLotofacil.setData(dados[1]);
            numerosSorteados[0] = stringToInt(dados[2]);
            numerosSorteados[1] = stringToInt(dados[3]);
            numerosSorteados[2] = stringToInt(dados[4]);
            numerosSorteados[3] = stringToInt(dados[5]);
            numerosSorteados[4] = stringToInt(dados[6]);
            numerosSorteados[5] = stringToInt(dados[7]);
            numerosSorteados[6] = stringToInt(dados[8]);
            numerosSorteados[7] = stringToInt(dados[9]);
            numerosSorteados[8] = stringToInt(dados[10]);
            numerosSorteados[9] = stringToInt(dados[11]);
            numerosSorteados[10] = stringToInt(dados[12]);
            numerosSorteados[11] = stringToInt(dados[13]);
            numerosSorteados[12] = stringToInt(dados[14]);
            numerosSorteados[13] = stringToInt(dados[15]);
            numerosSorteados[14] = stringToInt(dados[16]);
            
            jogoLotofacil.setNumerosSorteados(numerosSorteados);
            sorteadosDaLotofacil.add(jogoLotofacil); 
        }
        reader.close();
    }
    
    public static int stringToInt (String stringDados) {
    	int inteiro = Integer.parseInt(stringDados);
    	return inteiro;
    }
}