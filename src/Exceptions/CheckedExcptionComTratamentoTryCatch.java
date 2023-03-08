package Exceptions;

import java.io.*;

public class CheckedExcptionComTratamento {

    
    public static void main(String[] args) {
        String nomeDoArquivo = "romances-blake-crouch.txt";

        //lembrando a gente escolheu tratar o erro direto aqui na chamada do metodo, porém o certo seria tratar la na criação do metodo
        //o exemplo aqui foi pra gente ve que podemos lançar o erro na criaçao do metodo, e na chamada dele a gente pode tratar

        //repare que o main esta chamando esse metodo, mais se nao fosse o main e fosse outro metodo, eu podia lança o erro e pro outro metodo que chamr ele pode tratar o erro, e assim podemos ficar nessa cascata, porém não é o correto

        //tratando com try catch (tanto o metodo aqui em cima, quanto o metodo la em baixo)
        //lembrando que existe hierarquia de erros, o 'IOException' esta segundo, pois ela é a classe mae dos erros, se eu coloco ela antes o compilador vai fala pra min tirar o catch 'FileNotFoundException'
        //coloque o mouse em cima do erro e sempre veja se tem 'more actions', a propria ide da dicas
        try {
            imprimirArquivoNoConsole(nomeDoArquivo);
        } catch (FileNotFoundException e){
            //e.printStackTrace();
            JOptionPane.showMessageDialog(null,"Revise o nome do arquivo enviado" + e.getCause());
        } catch (IOException e) {            
            JOptionPane.showMessageDialog(null,"Ocorreu um erro inesperado entre em contato com o suporte, erro: " + e.getCause());
            e.printStackTrace();
        }
        

        System.out.println("Apesar da exception ou não, o programa continua");

    }

    //throws IOException -> Lançando o throws aqui em cima no metodo, eu to falando que quem chamar esse metodo vai ter que tratar esse erro
    private static void imprimirArquivoNoConsole(String nomeDoArquivo) throws IOException {
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
}
