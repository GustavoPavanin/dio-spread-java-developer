import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExemploList {
    public static void main(String[] args){
        //dada uma lista com 7 notas de um aluno [7, 8.5, 9.3, 5, 7, 0, 3.6]

        //List notas = new ArrayList();
        //List<Double> notas = new ArrayList<Double>() //Generics(jdk 5)
        //ArrayList<Double> notas = new ArrayList<>(); //Não recomendado
        List<Double> notas = new ArrayList<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
        /*
            List<Double> notas = new Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6);
            notas.add(10d);
            System.out.println(notas);
        */

    }
}
