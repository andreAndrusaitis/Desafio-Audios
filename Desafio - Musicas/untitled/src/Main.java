import Sons.MaisCurtidas;
import Sons.Musica;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        for (int i = 0; i < 2000; i++) {

        }


        Musica musica1 = new Musica();
        musica1.setAlbum("From Zero");
        musica1.setArtista("Zelda in Park");
        musica1.setTitulo("Heavy is the crown");
        musica1.setGenero("Rock");

        Musica musica2 = new Musica();
        musica2.setAlbum("Living Things");
        musica2.setArtista("Linkin Park");
        musica2.setTitulo("Castle of glass");
        musica2.setGenero("Chora boy");

        MaisCurtidas maisCurtidas = new MaisCurtidas();
        maisCurtidas.incluiMaisCurtidas(musica1);
        maisCurtidas.incluiMaisCurtidas(musica2);
    }
}