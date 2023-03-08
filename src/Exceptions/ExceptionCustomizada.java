package Exceptions;

import java.io.*;

public class ExceptionCustomizada {
     
    public static void main(String[] args) {
        String nomeDoArquivo = "romances-blake-crouch.txt";
        imprimirArquivoNoConsole(nomeDoArquivo);

        System.out.println("Apesar da exception ou não, o programa continua");

    }

   
    private static void imprimirArquivoNoConsole(String nomeDoArquivo) {
        
        //foi removido o arquivo que le, porque:
        //fizemos um desacoplamento pois esse metodo estava lendo e printando esse arquivo, se seguirmos o solid o metodo precisa ter 1 uncia responsavilidade.
        //File file = new File(nomeDoArquivo);   
     
        //Tratando os erros aqui dentro do metodo
        try{
        BufferedReader br = lerArquivo(nomeDoArquivo);
   
        String line = br.readLine();
        
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
       
        do {
            bw.write(line);
            bw.newLine();
            line = br.readLine();
        } while(line != null);        
        bw.flush();
        br.close();


        //como sabemos pela hierarquia de erros o IOexception vai por ultimo
        } catch (ImpossivelAberturaDeArquivoExceptionCustomizada ex){
         //aqui eu vou tratar o erro pois o metodo lançou o erro pra quem fosse chama o metodo que tratase     
          JOptionPane.showMessageDialog(null, e.getMessage());     
         ex.printStackTrace();
        } catch (IOException e) {
         JOptionPane.showMessageDialog(null,"Ocorreu um erro inesperado entre em contato com o suporte, erro: " + e.getCause());
           e.printStackTrace();
        }
       
    }

    //aqui eu vo lança o erro para que a classe que chamar esse metodo tratar ele
    public static BufferedReader lerArquivo(String nomeDoArquivo) throws ImpossivelAberturaDeArquivoExceptionCustomizada {
        File file = new File(nomeDoArquivo);

        try{
        return new BufferedReader(new FileReader(nomeDoArquivo));   
        } catch (FileNotFoundException e) {
            //erro customizado
            throw new ImpossivelAberturaDeArquivoExceptionCustomizada(File.getName(), file,getPath());            
        } 
    }

}

