package org.fasttrackit.curs20homework;

import lombok.RequiredArgsConstructor;
import org.fasttrackit.curs20homework.repository.MovieRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class CommandRunner implements CommandLineRunner {
    private final MovieRepository repository;

    @Override
    public void run(String... args) throws Exception {

    }
}
