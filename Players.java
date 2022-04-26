/**
 * Enumeration of all players in the game
 * Each player is a member of the Talk of the Charts Discord server who sent 5 artists 
 * without knowing who else was chosen by other players
 * @author Kyle Mullen, 2022
 */
public enum Players {
    HIDBIDBONUS,
    IVY,
    FANSTAR,
    LUIS,
    ACEOFHEARTS,
    RAZOR,
    KIKA,
    KHAIWEE,
    TREX,
    RICKICKER,
    OCEANIC,
    REKWIEM,
    ZACH,
    LIGHTNINGMATT,
    SKELLEZ,
    ROADRUNNER,
    JEROME,
    ARG,
    REBORN,
    MERRILYPUTRID,
    JUSTALECKS,
    MONA,
    SCRUBS,
    GONZA,
    SMOOV22,
    KEATON,
    CAMERONCARDINAL,
    BIGG0320,
    BACON;

    public int points;
    /**
     * Creates a new player object
     */
    private Players() {
        this.points = 0;
    }
    /**
     * Creates a new player object with preset point amount
     * @param points amount
     */
    private Players(int points) {
        this.points = points;
    }
    /**
     * Changes the number of points a player has
     * @param points number of points a player has
     */
    public void setPoints(int points) {
        this.points = points;
    }
    /**
     * returns the number of points a player has
     * @return number of points a player has
     */
    public int getPoints() {
        return points;
    }

    
}
