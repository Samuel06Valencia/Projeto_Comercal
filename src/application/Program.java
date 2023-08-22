package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Produto;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//Enfeite de de identificação loja.
		System.out.println("-----------------------------------------------");
		System.out.println("Bem-vindo a Loja Valencia!Escolha seu produto: ");
		System.out.println("-----------------------------------------------");
		
		//Entre com os atributos do Produto:
		System.out.println("Entre com nome do Produto: ");
		String name = sc.next();
		System.out.println("Entre com o preço: ");
		double price = sc.nextDouble();
		
		//Construtor e chamada ao método toString() sobreescrito.
		Produto product = new Produto(name,price);
		System.out.println(product);
		
		//Entrada no console da quantidade no carrinho de compras!
		System.out.println("-----------------------------------");
		System.out.println("Entre com a quantidade do produto: ");
		int quantity = sc.nextInt();
		
		//Construtor com sobrecarga
		Produto prod = new Produto(name,price,quantity);
		System.out.println(prod);
		
		char resp;
		
		//Decisão
		System.out.println("----------------------------------------------------------");
		System.out.println("Deseja aumentar a quantidade do produto no carrinho(s/n)? ");
		resp = sc.next().charAt(0);
		System.out.println("----------------------------------------------------------");
		//Estrutura de decisão sobre aumentar quantidade no carrinho!!
		while (resp == 's') {
			
		//Aumenta quantidade no estoque.
		System.out.println("Quanto deseja aumentar: ");
		quantity = sc.nextInt();
		prod.addQuantity(quantity);
		System.out.println("----------------------------------------------");
		
		//Atualiza a apresentação do estoque.
		System.out.println(prod);
		
		//Decisão
		System.out.println("-----------------------------------------------");
		System.out.println("Deseja diminuir a quantidade no carrinho(s/n)? ");
		resp = sc.next().charAt(0);
		System.out.println("-----------------------------------------------");
		break;
		}
		//Estrutura de decisão sobre diminuir quantidade no carrinho!!
		while(resp == 's') {
		
		//Diminui quantidade no carrinho.
		System.out.println("Quanto deseja diminuir? ");
		quantity = sc.nextInt();
		prod.removeQuantity(quantity);
		System.out.println("-----------------------------------------------");

		break;
		}
		//Final,saida dos loops de compra
		System.out.println("Carrinho Final: ");
		System.out.println(prod);
		System.out.println("Programa Encerrado!!!");
		System.out.println("---------------------------------------------------------------------");
	}

}
