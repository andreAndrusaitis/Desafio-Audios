package Sons;

public class Audio {
    private double duracao;
    private String titulo;
    private int totalDeReprodcoes;
    private int totalDeCurtidas;
    private int classificacao;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getDuracao() {
        return duracao;
    }

    public int getTotalDeReprodcoes() {
        return totalDeReprodcoes;
    }

    public int getTotalDeCurtidas() {
        return totalDeCurtidas;
    }

    public int getClassificacao() {
        return classificacao;
    }

    public void curte (){
        this.totalDeCurtidas++;
    }

    public void visualiza(){
        this.totalDeReprodcoes++;
    }
}
