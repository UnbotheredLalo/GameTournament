package player;

import java.time.ZonedDateTime;
import java.util.Set;
import skills.Skill;
import skills.Category;
import utils.DateTimeUtils;

public class Player {

    private String userName;
    private String gamerTag;
    private int myLevel;
    private int numWins;
    private Skill skill;
    private ZonedDateTime createdAt; // TODO: Create getters and setters

    // Constructor
    public Player(String userName, String gamerTag, int myLevel, int numWins) {
        this.userName = userName;
        this.gamerTag = gamerTag;
        this.myLevel = myLevel;
        this.numWins = numWins;
        this.skill = new Skill();
        createdAt = DateTimeUtils.getCurrentZonedDateTime();
    }

    public Player(String userName, String gamerTag) {
        this.userName = userName;
        this.gamerTag = gamerTag;
        this.myLevel = 1;
        this.numWins = 0;
        System.out.println("Felicidades!! " + getUserName() + " Has creado tu usuario");
    }

    public void assignSkills(Category category) { this.skill.setCategory(category); }

    public Set<String> getSkill() { return skill.getSkills(); }

    public void setUserName(String userName) { this.userName = userName;}

    public String getUserName() { return this.userName;}

    public void setGamerTag(String gamerTag) { this.gamerTag = gamerTag; }

    public String getGamerTag() { return this.gamerTag; }

    public void setMyLevel(int myLevel) { this.myLevel = myLevel; }

    public int getMyLevel() { return this.myLevel; }

    public void setNumWins(int numWins) { this.numWins = numWins; }

    public int getNumWins() { return this.numWins; }

    // TODO: Add created at to method
    @Override
    public String toString() {
        return "Username: " + getUserName() + "\n"
                + "GamerTag: " + getGamerTag() + "\n"
                + "Rank Level: " + getMyLevel() + "\n"
                + "Total Wins: " + getNumWins() + "\n";
    }
}
