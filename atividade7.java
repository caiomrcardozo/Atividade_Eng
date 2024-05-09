import java.util.Scanner;

class Sanduiche {

private String nome;

public Sanduiche(String nome) {

this.nome = nome;

}

public String getNome() {

return nome;

}

}

class Sobremesa {

private String nome;

public Sobremesa(String nome) {

this.nome = nome;

}

public String getNome() {

return nome;

}

}

class Bebida {

private String nome;

public Bebida(String nome) {

this.nome = nome;

}

public String getNome() {

return nome;

}

}

class Combo {

private Sanduiche sanduiche;

private Sobremesa sobremesa;

private Bebida bebida;

public void criarComboMaster() {

sanduiche = new Sanduiche("Burger Supremo");

sobremesa = new Sobremesa("Sundae de Morango");

bebida = new Bebida("Refrigerante Grande");

}

public void criarSuperCombo() {

sanduiche = new Sanduiche("Burger Cheddar");

sobremesa = new Sobremesa("Milkshake de Ovomaltine");

bebida = new Bebida("Suco Natural");

}

public void mostrarItens() {

System.out.println("Sanduíche: " + sanduiche.getNome());

System.out.println("Sobremesa: " + sobremesa.getNome());

System.out.println("Bebida: " + bebida.getNome());

}

}

public class Main {

public static void main(String[] args) {

System.out.println("Selecione seu combo:");

System.out.println("1. Combo Master");

System.out.println("2. Super Combo");

System.out.print("Sua escolha: ");

Scanner input = new Scanner(System.in);

int tipo = input.nextInt();

Combo combo = new Combo();

if (tipo == 1) {

combo.criarComboMaster();

} else if (tipo == 2) {

combo.criarSuperCombo();

} else {

System.out.println("Opção inválida.");

return;

}

System.out.println("Itens do combo:");

combo.mostrarItens();

}

}