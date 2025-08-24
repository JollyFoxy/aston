package DZ5.Adapter;

public class CassetteAdapter implements MusicPlayer {

    private CassettePlayer player;

    public CassetteAdapter(CassettePlayer player) {
        this.player = player;
    }

    @Override
    public void play(String filename) {
        player.playCassette(filename);
    }

}
