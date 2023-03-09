package Exceptions;

import java.io.*;

public class CheckedExcptionSemTratamento {
    public static void main(String[] args) {
        /*

        String nomeDoArquivo = "romances-blake-crouch.txt";
        imprimirArquivoNoConsole(nomeDoArquivo);

        System.out.println("Apesar da exception ou não, o programa continua");

    }

    private static void imprimirArquivoNoConsole(String nomeDoArquivo) {
        //File -> especificar que arquivo eu quero abrir
        File file = new File(nomeDoArquivo);

        //Porque esta com erro abaixo? se eu passar o mouse em cima do 'FileReader' ele fala o tipo de exception que temos que tratar
        //e o java só vai deixar eu rodar o programa se a gente tratar os erros
        //lembre-se se ler a exception que os parametros que tao em vermelho lançam para por no catch


        //BufferedReader -> ler o documento
        //Aqui no FileReader podemos passar o caminho todo do documento txt se quisermos
        BufferedReader br = new BufferedReader((new FileReader(file.getName())));

        //line -> vai ler linha por linha
        String line = br.readLine();


        //BufferedWriter -> imprime no console
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        //Laço que vai ler cada linha do BufferedReader (o documento txt)
        //o laço continua até ele nao achar mais nada para ler
        do {
            bw.write(line);
            bw.newLine();
            line = br.readLine();
        } while(line != null);
        //flush -> descarregar
        bw.flush();
        br.close();
    }

     */

    }
}
