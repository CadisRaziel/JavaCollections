package CollectionSet;

import java.util.Objects;

public class Seriado implements Comparable<Seriado>{
    private String nome;
    private String genero;
    private Integer tempoEpisodio;

    public Seriado(String nome, String genero, Integer tempoEpisodio) {
        this.nome = nome;
        this.genero = genero;
        this.tempoEpisodio = tempoEpisodio;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Integer getTempoEpisodio() {
        return tempoEpisodio;
    }

    public void setTempoEpisodio(Integer tempoEpisodio) {
        this.tempoEpisodio = tempoEpisodio;
    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", genero='" + genero + '\'' +
                ", tempoEpisodio=" + tempoEpisodio +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Seriado seriado = (Seriado) o;
        return Objects.equals(nome, seriado.nome) && Objects.equals(genero, seriado.genero) && Objects.equals(tempoEpisodio, seriado.tempoEpisodio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, genero, tempoEpisodio);
    }

    @Override
    public int compareTo(Seriado seriado) {
        //caso exista tempo igual
        int tempoEpisodio = Integer.compare(this.getTempoEpisodio(), seriado.getTempoEpisodio());
        if(tempoEpisodio != 0){
            return tempoEpisodio;
        }
        return this.getGenero().compareTo(seriado.getGenero());
    }
}
