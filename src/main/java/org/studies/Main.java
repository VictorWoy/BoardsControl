package org.studies;

import org.studies.persistance.migration.MigrationStrategy;
import org.studies.ui.MainMenu;

import java.sql.SQLException;

import static org.studies.persistance.config.ConnectionConfig.getConnection;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) throws  SQLException {
        try(var connection = getConnection()){
            new MigrationStrategy(connection).executeMigration();
        }
        new MainMenu().execute();
    }

}