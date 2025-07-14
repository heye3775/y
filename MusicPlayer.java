class MusicPlayer {
    void play() {
        System.out.println("Playing music...");
    }
}

class Spotify extends MusicPlayer {
    @Override
    void play() {
        System.out.println("Streaming from Spotify");
    }
}

class YouTube extends MusicPlayer {
    @Override
    void play() {
        System.out.println("Streaming from YouTube");
    }
}

class LocalPlayer extends MusicPlayer {
    @Override
    void play() {
        System.out.println("Playing from local storage");
    }
}

class MusicMain {
    public static void main(String[] args) {
        MusicPlayer[] players = {
            new Spotify(),
            new YouTube(),
            new LocalPlayer()
        };

        for (MusicPlayer player : players) {
            player.play();
        }
    }
}
