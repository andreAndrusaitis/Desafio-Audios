package Sons;

public class MaisCurtidas {

    public void incluiMaisCurtidas (Audio audio){
        if(audio.getClassificacao() >= 8){
            System.out.println(audio.getTitulo() + "é umas das mais curtidas da sua Playlist");
        } else if (audio.getClassificacao() >= 6) {
            System.out.println(audio.getTitulo() + " Um dos mais ouvidos no momento!");

        } else {
            System.out.println("coloque " + audio.getTitulo() + " na sua Playlist para escutar mais!");
        }
    }
}
