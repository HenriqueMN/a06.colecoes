package aula.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Exemplo01_Explorando {

	public static void main(String[] args) {
		
		// Algoritmo que exemplifica a funcionalidade de ArrayLists e Sets
		
		List<Integer> minhaLista = new ArrayList<Integer>(); // ArrayList é uma interface da classe List
		
		// O método .add(x) adiciona o elemnto x no fim da lista
		minhaLista.add(2);
		minhaLista.add(4);
		minhaLista.add(1);
		minhaLista.add(2);
		minhaLista.add(1);
		minhaLista.add(7);
		minhaLista.add(5);
		
		// Forma diferenciada do For loop chamada de For Each (para cada listaElementos em minhaLista, faça: )
		for(Integer listaElementos:minhaLista) {
			System.out.println(listaElementos);
		}
		
		System.out.println("\nRemovendo um elemento da lista...");
		System.out.println();
		
		// O método .remove(x) remove o elemento x da lista
		minhaLista.remove(0);
		
		for(Integer listaElementos:minhaLista) {
			System.out.println(listaElementos);
		}
		
		// O método .get(x) retorna o elemento com índice x da lista
		int primeiroElemento = minhaLista.get(0);
		
		System.out.println("\nO primeiro elemento é: "+primeiroElemento);
		
		System.out.println();
		
		for(int i=0;i<minhaLista.size();i++) { // O método .size() retorna o tamanho da lista
			System.out.println("\nElemento: "+minhaLista.get(i));
		}
		
		// O método .sort(lista) da biblioteca Collections reordena a lista
		Collections.sort(minhaLista);
		
		System.out.println("\nDepois de ordenado...");
		System.out.println(minhaLista);
		
		System.out.println();
		
		// A estrutura Set, diferentemente da lista, não aceita elementos repetidos
		Set<Integer> meuSet = new HashSet<Integer>();
		
		meuSet.add(2);
		meuSet.add(1);
		meuSet.add(2);
		meuSet.add(1);
		meuSet.add(5);
		meuSet.add(9);
		meuSet.add(3);
		
		System.out.println(meuSet);
		
		// A classe Iterator é usada para percorrer um Set, deve ser criada após a lista ser preenchida
		Iterator<Integer> iMeuSet = meuSet.iterator();
		
		while(iMeuSet.hasNext()) { // O método .hasNext() retorna um boolean se ainda tiver elementos para percorrer
			System.out.println(iMeuSet.next()); // O método .next() retorna o próximo elemento do set
		}

	}

}
