package Sons;

public class Podcast extends Audio{
    private int numeroDoEpisodio;
    private String host;
    private String descricao;

    public int getNumeroDoEpisodio() {
        return numeroDoEpisodio;
    }

    public void setNumeroDoEpisodio(int numeroDoEpisodio) {
        this.numeroDoEpisodio = numeroDoEpisodio;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public int getClassificacao() {
        if (this.getTotalDeCurtidas() > 1000){
            return 10;
        } else if (this.getTotalDeCurtidas() < 1000 && this.getTotalDeCurtidas() > 800) {
            return 8;
        } else if (this.getTotalDeCurtidas() < 800 && this.getTotalDeCurtidas() > 600) {
            return 6;
        } else if (this.getTotalDeCurtidas() < 600 && this.getTotalDeCurtidas() > 400) {
            return 4;
        } else if (this.getTotalDeCurtidas() < 400 && this.getTotalDeCurtidas() > 200) {
            return 2;
        } else {
            return 1;
        }

    }
}
