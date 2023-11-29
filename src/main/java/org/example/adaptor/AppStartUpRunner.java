package org.example.adaptor;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class AppStartUpRunner implements CommandLineRunner {
    private final TableCreatorClass tableCreatorClass;

    public AppStartUpRunner(TableCreatorClass tableCreatorClass) {
        this.tableCreatorClass = tableCreatorClass;
    }

    @Override
    public void run(String... args) throws Exception {
        tableCreatorClass.tableCreator();

    }
}
