package CollectionList;

public class Gato implements Comparable<Gato>{
    private String nome;
    private Integer idade;
    private String cor;

    public Gato(String nome, Integer idade, String cor) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    //se eu nao por toString ele me printa o endereço da memoria
    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", cor='" + cor + '\'' +
                '}';
    }

    @Override
    public int compareTo(Gato gato) {
        //ele sempre por default vem um inteiro, podemos mudar para qualqeur tipo
        //porem lembre-se ele retorna um inteiro entao devemos usar o 'compareToIgnoreCase'
        //return 0;

        //aqui eu vou quere comparar os nomes
        return this.getNome().compareToIgnoreCase(gato.getNome());

        //ele vai retornar inteiro
        //se ele retornar 0 -> gatos com nomes iguais
        //se ele retornar 1 -> o gato que to comparando é maior e  tem que fica depois
        //se ele retornar -1 -> o gato que to comparando é menor que o gato comparado

        //ou seja, ele vai ordenar por tamanho de nome, seria tipo um nome.lenght
    }
}
