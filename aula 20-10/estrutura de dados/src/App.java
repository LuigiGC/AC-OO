import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Stack;

public class App {
    public static void main(String[] args) throws Exception {
        //vetores();
        //arraylist();
        //linkedList();
        //pilhas();
        //conjuntos();
        mapas();
    }


    public static void vetores(){
        int tamanhoArray = 5;
        int[] arrayInteiros = new int[tamanhoArray];

        System.out.println(arrayInteiros);
        
        String[] letras = {"a","e","f","k"};
        System.out.println(letras);
        System.out.println(letras.length);

        System.out.println(letras[2]);
        letras [2] = "r";
        System.out.println(letras[2]);
        
        //pecorrendo todos os elementos do array
        for (int i = 0; i < tamanhoArray; i++){
            System.out.println(arrayInteiros[i]);
        }

        //for letra in letra
        for (String letra : letras){
            System.out.println(letra);
        }

        System.out.println("-----------------");
        letras = aumentaVetor(letras);
        System.out.println(letras.length);
    }


    public static String[] aumentaVetor(String[] vetor){
        String[] novoVetor = new String[vetor.length + 1];

        for(int i = 0; i < vetor.length;i++){
            novoVetor[i] =vetor[i];
        }

        return novoVetor;
    }
    
    public static void arraylist(){
        ArrayList<Integer> numeros = new ArrayList<>();
        System.out.println(numeros);

        numeros.add(8);
        numeros.add(3);
        System.out.println(numeros);
        System.out.println(numeros.size());
        System.out.println(numeros.get(1));

        numeros.remove(0);
        System.out.println(numeros);

        for(Integer numero : numeros){
            System.out.println(numero);
        }

        // verifica se o elemento está contido na arrayList
        System.out.println(numeros.contains(8));
        numeros.add (1);
        numeros.add (2);
        numeros.add (3);
        System.out.println(numeros);

        // adciona um elemento novo no indice 0
        numeros.add(0,16);
        System.out.println(numeros);

        //modifica o elemento no indice 0
        numeros.set(0,999);
        System.out.println(numeros);

        // limpa o array
        numeros.clear();
        System.out.println(numeros.size());

        
    }
    public static void linkedList(){
        LinkedList<String> carros = new LinkedList<>();
        System.out.println(carros);

        carros.add("gol");
        carros.add(0,"corsa");
        System.out.println(carros);
        
        carros.remove(1);
        System.out.println(carros);

        // posição do elemento
        System.out.println(carros.indexOf("gol"));

        //pop e push são mais eficientes que o add e remove
        //remove o primeiro elemento da lista
        carros.pop();
        System.out.println(carros);

        // adciona no primeiro elemneto da lista
        carros.push("palio");
        System.out.println(carros);
          

    }
    public static void pilhas(){
        Stack<Double> notas = new Stack<>();

        //adcionar um elemento no topo
        notas.push(4.5);
        notas.push(8.8);
        System.out.println(notas.peek());

        notas.push(0.7);
        System.out.println(notas.peek());

        //remove o elemento do topo
        notas.pop();
        System.out.println(notas.peek());
        System.out.println(notas);

        for (Double nota : notas) {
            System.out.println(nota);
        }
    }
    
    public static void conjuntos(){
        HashSet<String> frutas = new HashSet<>();

        frutas.add("maça");
        frutas.add("laranja");
        frutas.add("melancia");
        System.out.println(frutas);

        frutas.add("maça");
        System.out.print(frutas);

        for (String fruta : frutas){
            System.out.println(fruta);
        }

        frutas.remove("laranja");
        System.out.println(frutas);
    }

    public static void mapas(){
        HashMap<String, String> alunos = new HashMap<>();
    
        alunos.put("1234", "joao");
        alunos.put("5678", "Aline");

        System.out.println(alunos);
        System.out.println(alunos.get("1234"));
        System.out.println(alunos.get("1235"));//null

        alunos.remove("1234");
        alunos.remove("1235"); //não vai fazer nada
        System.out.println(alunos);

        System.out.println(alunos.containsKey("1111")); // Verifica se essa chave existe
        System.out.println(alunos.containsKey("Maria")); // Verifica se essa chave existe
        System.out.println(alunos.containsKey("Aline")); // Verifica se essa chave existe

        System.out.println(alunos.size());

        for (String matricula : alunos.keySet()){ //matricula recebe as chaves do "dicionario"
            System.out.println(matricula);
            System.out.println(alunos.get(matricula));
        }

        for (String nome : alunos.values()){
            System.out.println(nome);
        }
    
    }
}
