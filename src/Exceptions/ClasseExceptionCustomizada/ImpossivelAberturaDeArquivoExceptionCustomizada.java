//Criando classe para tratamento de exceção personalizado

package Exceptions.ClasseExceptionCustomizada;

import java.io.*;

public class ImpossivelAberturaDeArquivoExceptionCustomizada extends Exception {
     private String nomeDoArquivo;
     private String diretorio;


     public ImpossivelAberturaDeArquivoExceptionCustomizada ( String nomeDoArquivo, String diretorio) {
     	super("O arquivo " + nomeDoArquivo + "Não foi encontrado no diretorio" + diretorio);
     	this.nomeDoArquivo = nomeDoArquivo;
     	this.diretorio = diretorio;

     }
    

     @Override
    public String toString() {
        return "ImpossivelAberturaDeArquivoExceptionCustomizada{" +
                "nomeDoArquivo='" + nomeDoArquivo + '\'' +
                ", diretorio=" + diretorio + '\'' +
                '}';
    }

    //posso fazer um Override do getCause... de tudo que uma exception tem

}

