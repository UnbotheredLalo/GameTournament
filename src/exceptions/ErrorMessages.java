package exceptions;

public enum ErrorMessages {

    DUPLICATED_USER_NAME {
        public String toString() {
            return "User Name already exists. Try another";
        }
    },
    DUPLICATED_GAMERTAG {
        public String toString () {
            return "GamerTag already exists. Try another";
        }
    },
    ERROR_WHILE_CREATING {
        public String toString() {
            return "There was an error while creating your user. Try again";
        }
    },
    NULL_USER_NAME {
        public String toString() {
            return "Username or Gamertag cannot be null";
        }
    },
    UNCHANGEABLE_USERNAME {
        public String toString() {
            return "Cannot change gamertag once it's created";
        }
    };

    private String message;

    private void ErrorMessage(String message) { this.message = message; }

    public String getMessage() { return message; }
}
