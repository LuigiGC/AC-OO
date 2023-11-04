/*package Arquivo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

import Alunos.Aluno;

public class AquivoHash {
    public static HashMap <String,Aluno> ler(String caminho,Aluno alunos) throws IOException{
        File arquivo = new File(caminho);
        BufferedReader buffRead;
        HashMap<String,Aluno> linhas = new HashMap<>();
        String linha = "";

        if (!arquivo.exists() || arquivo.isDirectory()){
            return linhas;
        }
        buffRead = new BufferedReader(new FileReader(caminho));
        while (true) {
            if(linha != null){
                if(!linha.equals("")){
                    linhas.put(linha,alunos);
                }else{
                    break;
                }
                linha = buffRead.readLine();
            }
            buffRead.close();
            return linhas;
        }
    }
    
}
*/
