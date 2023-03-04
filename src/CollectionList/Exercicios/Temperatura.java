package CollectionList.Exercicios;

public class Temperatura {
    private double graus;
    private String meses;

    public Temperatura(double graus, String meses) {
        this.graus = graus;
        this.meses = meses;
    }

    public double getGraus() {
        return graus;
    }

    public void setGraus(double graus) {
        this.graus = graus;
    }

    public String getMeses() {
        return meses;
    }

    public void setMeses(String meses) {
        this.meses = meses;
    }

    @Override
    public String toString() {
        return "{"+
                "graus=" + graus +
                ", meses='" + meses + '\'' +
                '}';
    }
}
