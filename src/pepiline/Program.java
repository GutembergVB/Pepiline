package pepiline;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Program {

	public static void main(String[] args) {
	
		//PEPILINE
		
		List<Integer> list = Arrays.asList(3,4,5,10,7);/* .asList(), tamanho fixo, não pode ser alterado,
                                                       mas seus elementos podem ser modificados.
                                                       */
		Stream<Integer> st1 = list.stream().map(x -> x*10);/* list.stream(): Converte uma lista em um 
		        Stream<Integer>. Um stream é uma sequência de elementos suportando operações sequenciais e 
		        paralelas de agregação.
		        .map(x -> x * 10): aplica a função lambda (x -> x * 10)a cada elemento 
		        do stream. A função multiplica cada elemento por 10. Isso cria um novo stream onde cada elemento 
		        é o resultado da multiplicação
		        */
		System.out.println( Arrays.toString(st1.toArray())); /*Arrays.toString(): Converte o array em uma string 
		                     formatada para impressão st1.toArray(): Converte o stream em um array de Integer.*/
		
		int sum = list.stream().reduce(0,(x,y) -> x+y);  /* .reduce(), aplica uma função de acumulação sobre os elementos.
		        o (0) é o elemento neutro que irá iniciar a operção,(X,Y) são os argumentos,
		        ou seja, se mudar o elemento neutro(0) para (2), irá somar os elementos da lista e acrescentar mais (2): */
		
		System.out.println("Sum " + sum);
		
		List<Integer> newList = list.stream()
		     
				.filter(x -> x % 2 == 0) // filtrar todo elemento que dividido por 2 é igual a zero(par)
		     
				.map(x -> x*10) // todo elemento par irá multiplicar por 10
		    
		        .collect(Collectors.toList()); // trasformando a stream em lista
		    
	   System.out.println( Arrays.toString(newList.toArray())); // trasformando a stream em lista
		     
		
	}

}
