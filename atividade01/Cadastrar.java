import javax.swing.*;

import java.io.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;



public class Cadastrar {
	
	public static void main(String[] args) throws Exception{
	
     	String nome;
		int idade;
		int quantidade = 0;
		Alunos cadastro = null;
		
	    quantidade = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantos alunos você deseja cadastrar ? : "));

	    for(int i=0; i < qtde; i++){
	    	
			nome = JOptionPane.showInputDialog(null,"Nome do aluno: ");
		    idade = Integer.parseInt(JOptionPane.showInputDialog(null,"Idade do aluno: "));
		
		    cadastro = new Alunos(quantidade,nome,idade);
		    cadastro.incluirRegistro(cadastro);
		    
		    List<Alunos> cadastrar = new ArrayList<Alunos>();
		    Alunos novos = cadastro;
		    cadastrar.add(novos);
		    
		   Alunos ver;
			
			for (int j = 0; j < cadastrar.size(); j++){
			
				ver = cadastrar.get(j);
				
				System.out.Println("Alunos Cadastrados:  ("+(j+1)+")" +ver);
				ver.exibirDados();
			   	ver.salvarDados();
				}
			
			cadastrar.clear();
		    
		  }
	

	  }	
		
}
