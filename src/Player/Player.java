package Player;

public class Player {

    private String userName;
    private String gamerTag;
    private int myLevel;
    private int numWins;

    // Constructor
    public Player(String userName, String gamerTag, int myLevel, int numWins) {
        this.userName = userName;
        this.gamerTag = gamerTag;
        this.myLevel = myLevel;
        this.numWins = numWins;
    }
    public void setUserName(String userName) { this.userName = userName;}

    public String getUserName() { return this.userName;}

    public void setGamerTag(String gamerTag) { this.gamerTag = gamerTag; }

    public String getGamerTag() { return this.gamerTag; }

    public void setMyLevel(int myLevel) { this.myLevel = myLevel; }

    public int getMyLevel() { return this.myLevel; }

    public void setNumWins(int numWins) { this.numWins = numWins; }

    public int getNumWins() { return this.numWins; }
}
