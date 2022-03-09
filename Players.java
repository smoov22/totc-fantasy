public enum Players {
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
    REALHOTBOYSHIT,
    SMOOV22,
    KEATON,
    CAMERONCARDINAL,
    BIGG0320;

    public int points;

    private Players() {
        this.points = 0;
    }

    private Players(int points) {
        this.points = points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public int getPoints() {
        return points;
    }
}
