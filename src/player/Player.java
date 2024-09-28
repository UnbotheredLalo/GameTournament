package player;

import java.util.Set;
import java.util.HashSet;
import exceptions.DuplicateExceptions;
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

    // Constructor
    public Player(String userName, String gamerTag, int myLevel, int numWins) throws DuplicateExceptions {

        if (userName == null || gamerTag == null) {
            throw new NullPointerException("Username or Gamertag cannot be null");

            if (existingUsernames.contains(userName)) {
                throw new DuplicateExceptions(DuplicateExceptions.DUPLICATED_USER_NAME);

            }
            if (existingGamerTags.contains(gamerTag)) {
                throw new DuplicateExceptions(DuplicateExceptions.DUPLICATED_GAMERTAG);
            }
            this.userName = userName;
            this.gamerTag = gamerTag;
            this.myLevel = myLevel;
            this.numWins = numWins;
            this.skills = new Skills();
            existingUsernames.add(userName);
            existingGamerTags.add(gamerTag);
        }
    }

    public Player(String userName, String gamerTag) throws DuplicateExceptions {

        if (existingUsernames.contains(userName)) {
            throw new DuplicateExceptions(DuplicateExceptions.DUPLICATED_USER_NAME);

        } if (existingGamerTags.contains(gamerTag)) {
            throw new DuplicateExceptions(DuplicateExceptions.DUPLICATED_GAMERTAG);
        }
        this.userName = userName;
        this.gamerTag = gamerTag;
        this.myLevel = 1;
        this.numWins = 0;
        existingUsernames.add(userName);
        existingGamerTags.add(gamerTag);
        System.out.println("Congratulations!! " + getUserName() + " you've created your user. Be Welcomed");
    }

    public void assignSkills(Category category) { this.skills.setCategory(category); }

    public Set<String> getSkills() { return skills.getSkills(); }

    public void setUserName(String userName) throws DuplicateExceptions {

        if (existingUsernames.contains(userName)) {
            throw new DuplicateExceptions(DuplicateExceptions.DUPLICATED_USER_NAME);
        } else {
            this.userName = userName;
        }
    }

    public String getUserName() { return this.userName;}

    public void setGamerTag(String gamerTag) throws DuplicateExceptions {

        if (existingGamerTags.contains(gamerTag)) {
            throw new DuplicateExceptions(DuplicateExceptions.DUPLICATED_GAMERTAG);

        } else if (this.gamerTag != null && !this.gamerTag.isEmpty()) {
            throw new IllegalStateException("Cannot change gamertag once it's created");

        } else {
            this.gamerTag = gamerTag;
        }
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
