package com.adriendr.dota2.dota2privatelearning.clarity;

import com.adriendr.dota2.dota2privatelearning.clarity.metier.Game;

import java.io.File;
import java.io.IOException;

public interface ClarityService {

    Game processGame(File replayFile) throws IOException;

}
