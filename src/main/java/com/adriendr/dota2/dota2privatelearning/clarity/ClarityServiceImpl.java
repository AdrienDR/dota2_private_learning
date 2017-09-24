package com.adriendr.dota2.dota2privatelearning.clarity;

import com.adriendr.dota2.dota2privatelearning.clarity.metier.Game;
import com.adriendr.dota2.dota2privatelearning.clarity.processors.ChatProcessor;
import org.springframework.stereotype.Service;
import skadistats.clarity.processor.runner.SimpleRunner;
import skadistats.clarity.source.MappedFileSource;
import skadistats.clarity.source.Source;

import java.io.File;
import java.io.IOException;

@Service
public class ClarityServiceImpl implements ClarityService {

    @Override
    public Game processGame(File replayFile) throws IOException {

        Game game = new Game();
        game.setId(fileNameWithoutExtension(replayFile));

        // Runner to analyse replay
        Source replaySource = new MappedFileSource(replayFile);
        SimpleRunner runner = new SimpleRunner(replaySource);

        // Add processors here
        runner.runWith(new ChatProcessor(game));

        return game;

    }

    private String fileNameWithoutExtension(File file){
        String fileNameWithoutExt = "";
        String fileName = file.getName();
        String[] splittedFileName = fileName.split("\\.");
        for (int i = 0; i < splittedFileName.length - 1; i++) {
            fileNameWithoutExt += (i!=0 ? "." : "") + splittedFileName[i];
        }
        return fileNameWithoutExt;
    }
}
