package exceptions;

import player.Player;

public class DuplicateExceptions extends Exception {

    public static final String DUPLICATED_USER_NAME = "User Name already exists. Try another";

    public static final String DUPLICATED_GAMERTAG = "GamerTag already exists. Try another";

    public static final String ERROR_WHILE_CREATING = "There was an error while creating your user. Try again";

    public DuplicateExceptions(String message) {
        super(message);
    }

    public DuplicateExceptions() {
        super(ERROR_WHILE_CREATING);
    }
}
