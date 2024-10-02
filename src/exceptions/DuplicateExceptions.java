package exceptions;

import player.Player;

public class DuplicateExceptions extends Exception {

    public DuplicateExceptions(String message) {
        super(message);
    }

    public DuplicateExceptions() {
        super(ErrorMessages.ERROR_WHILE_CREATING.getMessage());
    }
}
