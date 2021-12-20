import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapExercicios {
	public static void main(String[] args) {
		
		
		/*
		 * Dada a população estimada de alguns estados do NE brasileiro, faça:
		 * Estado = PE - População = 9616621
		 * Estado = AL - População = 3351543
		 * Estado = CE - População = 9187103
		 * Estado = RN - População = 3534265
		 */
		
		System.out.println("Crie um dicionário e relacione os estados e as populações");
		Map<String, Integer> populacaoEstadosNE = new HashMap<>() {{
			put("PE", 9616621);
			put("AL", 3351543);
			put("CE", 9187103);
			put("RN", 3534265);
		}};
		System.out.println(populacaoEstadosNE);
		
		System.out.println("Substitua a população do estado do RN por 3534165");
		populacaoEstadosNE.put("RN", 3534165); //quando map encontra a chave, atualiza o valor
		System.out.println(populacaoEstadosNE);
		
		System.out.println("Confira se o sestador PB está no dicionário, caso não, adicione: PB - 4039277");
		populacaoEstadosNE.put("PB", 4039277);
		
		System.out.println("Exiba a população do estado PE: " + populacaoEstadosNE.get("PE"));
		
		//Exiba todos os estado e suas populações na orgem que foi informado;
		System.out.println("Exiba todos os estado e suas populações na orgem que foi informado");
		Map<String, Integer> populacaoEstadosNE2 = new LinkedHashMap<>() {{
				put("PE", 9616621);
				put("AL", 3351543);
				put("CE", 9187103);
				put("RN", 3534265);	
				put("PB", 4039277);
			}};
		System.out.println(populacaoEstadosNE2);
		
		System.out.println("Exiba os estados e suas populações em ordem alfabética;");
		Map<String, Integer> populacaoEstadosNE3 = new TreeMap<>(populacaoEstadosNE);
		System.out.println(populacaoEstadosNE3);
		
		//Exiba o estado com a menor população e sua quantidade;
		//Exiba o estado com a maior população e sua quantidade;
		
		Collection<Integer> populacao = populacaoEstadosNE.values();
        String estadoMaiorPopulacao = "";
        String estadoMenorPopulacao = "";
        for (Map.Entry<String, Integer> entry : populacaoEstadosNE.entrySet()) {
            if (entry.getValue().equals(Collections.max(populacao))) estadoMaiorPopulacao = entry.getKey();
            if (entry.getValue().equals(Collections.min(populacao))) estadoMenorPopulacao = entry.getKey();
        }
        System.out.printf("Exiba o estado com o menor população (%s) e seu respectivo valor (%d)\n",
                estadoMenorPopulacao, Collections.min(populacao));
        System.out.printf("Exiba o estado com a maior população (%s) e seu respectivo valor (%d)\n",
                estadoMaiorPopulacao, Collections.max(populacao));
        
		//Exiba a soma da população dos estados
		int soma = 0;
		Iterator<Integer> iterator = populacaoEstadosNE.values().iterator();
		while(iterator.hasNext()) {
			soma += iterator.next();
		}
		System.out.println("Exiba a soma da população dos estados: " + soma);
		
		//Exiba a média da população por estado
		System.out.println("Exiba a média da população por estado: " + soma/populacaoEstadosNE.size());
		
		//Remova os estados com a população menor que 4000000
		Iterator<Integer> iterator1 = populacaoEstadosNE.values().iterator();
		while(iterator1.hasNext()) {
			if (iterator1.next() <= 4000000) iterator1.remove();
		}
		
		System.out.println(populacaoEstadosNE);
		
		//apague o dicionário
		populacaoEstadosNE.clear();
        System.out.println(populacaoEstadosNE);
		//confira se o dicionário está vazio
		System.out.println("O dicionário está vazio: " + populacaoEstadosNE.isEmpty());
	}
	
}
