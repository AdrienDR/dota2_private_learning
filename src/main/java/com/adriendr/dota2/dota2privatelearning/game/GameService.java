package com.adriendr.dota2.dota2privatelearning.game;

import java.io.IOException;

public interface GameService {

    void loadAndSaveGame(String pathToReplay) throws IOException;
}
