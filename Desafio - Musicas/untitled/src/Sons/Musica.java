package Sons;

public class Musica extends Audio{
    private String artista;
    private String album;
    private String genero;

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public int getClassificacao() {
        if (this.getTotalDeReprodcoes() > 5000){
            return 10;
        } else if (this.getTotalDeReprodcoes() < 5000 && this.getTotalDeReprodcoes() > 3000) {
            return 8;
        } else if (this.getTotalDeReprodcoes() < 3000 && this.getTotalDeReprodcoes() > 1000) {
            return 6;
        } else if (this.getTotalDeReprodcoes() < 1000 && this.getTotalDeReprodcoes() > 500) {
            return 4;
        } else if (this.getTotalDeReprodcoes() < 500 && this.getTotalDeReprodcoes() > 100) {
            return 2;
        } else {
            return 1;
        }
    }
}
