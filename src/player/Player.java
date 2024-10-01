package player;

import java.util.Set;
import java.util.HashSet;
import exceptions.DuplicateExceptions;
import exceptions.ErrorMessages;
import skills.Skills;
import skills.Category;

public class Player {

    private String userName;
    private String gamerTag;
    private int myLevel;
    private int numWins;
    private Skills skills;
    public static HashSet<String> existingUsernames = new HashSet<>();
    public static HashSet<String> existingGamerTags = new HashSet<>();
    static final int NEW_MY_LEVEL = 1;
    static final int NEW_NUM_WINS = 0;

    // User Credentials validation methods
    public void checkUserCredentials(String userName, String gamerTag) throws DuplicateExceptions {

        if (userName == null || gamerTag == null) {
            throw new NullPointerException(ErrorMessages.NULL_USER_NAME.getMessage());

        }
        if (existingUsernames.contains(userName)) {
            throw new DuplicateExceptions(ErrorMessages.DUPLICATED_USER_NAME.getMessage());

        }
        if (existingGamerTags.contains(gamerTag)) {
            throw new DuplicateExceptions(ErrorMessages.DUPLICATED_GAMERTAG.getMessage());

        }
    }

    public void validateUserName(String userName) throws DuplicateExceptions {

        if (existingUsernames.contains(userName)) {
            throw new DuplicateExceptions(ErrorMessages.DUPLICATED_USER_NAME.getMessage());

        } else {
            this.userName = userName;
        }
    }

    public void validateGamerTag(String gamerTag) throws DuplicateExceptions {

        if (existingGamerTags.contains(gamerTag)) {
            throw new DuplicateExceptions(ErrorMessages.DUPLICATED_GAMERTAG.getMessage());

        } else if (this.gamerTag != null && !this.gamerTag.isEmpty()) {
            throw new IllegalStateException(ErrorMessages.UNCHANGEABLE_USERNAME.getMessage());

        } else {
            this.gamerTag = gamerTag;
        }
    }

    // Constructors
    public Player(String userName, String gamerTag, int myLevel, int numWins) throws DuplicateExceptions {
        checkUserCredentials(userName, gamerTag);
        this.userName = userName;
        this.gamerTag = gamerTag;
        this.myLevel = myLevel;
        this.numWins = numWins;
        this.skills = new Skills();
        existingUsernames.add(userName);
        existingGamerTags.add(gamerTag);
    }

    public Player(String userName, String gamerTag) throws DuplicateExceptions {
        checkUserCredentials(userName, gamerTag);
        this.userName = userName;
        this.gamerTag = gamerTag;
        this.myLevel = NEW_MY_LEVEL;
        this.numWins = NEW_NUM_WINS;
        existingUsernames.add(userName);
        existingGamerTags.add(gamerTag);
        System.out.println("Congratulations!! " + getUserName() + " you've created your user. Be Welcomed");
    }

    //Setters and Getters
    public void assignSkills(Category category) { this.skills.setCategory(category); }

    public Set<String> getSkills() { return skills.getSkills(); }

    public void setUserName(String userName) throws DuplicateExceptions {
        validateUserName(userName);
    }

    public String getUserName() { return this.userName;}

    public void setGamerTag(String gamerTag) throws DuplicateExceptions  {
        validateGamerTag(gamerTag);
    }

    public String getGamerTag() { return this.gamerTag; }

    public void setMyLevel(int myLevel) { this.myLevel = myLevel; }

    public int getMyLevel() { return this.myLevel; }

    public void setNumWins(int numWins) { this.numWins = numWins; }

    public int getNumWins() { return this.numWins; }


    @Override
    public String toString() {
        return "Username: " + getUserName() + "\n"
                + "GamerTag: " + getGamerTag() + "\n"
                + "Rank Level: " + getMyLevel() + "\n"
                + "Total Wins: " + getNumWins() + "\n";
    }
}
