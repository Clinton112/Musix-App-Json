package com.stackroute.config;

import com.stackroute.repository.TrackRepository;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.slf4j.Logger;

import java.net.URL;

public class CommandLineRunnerStartup implements CommandLineRunner {

    public static final Logger logs = LoggerFactory.getLogger(CommandLineRunnerStartup.class);
    private TrackRepository trackRepository;

    @Autowired
    public CommandLineRunnerStartup(TrackRepository trackRepository) {
        this.trackRepository = trackRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        logs.info("Inserting data on start");


        logs.info("data successfully inserted");
    }
}
