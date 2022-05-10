package summersnakes;

/**
 * Enumeration of all artists being used by players
 * The multiplier value is a representation of how many players chose the artist
 * When several players choose an artist, the points are split among those who chose them
 * @author Kyle Mullen, 2022
 */
public enum Artists {
    BADBUNNY ("Bad Bunny", 3),
    LILDURK ("Lil Durk", 9),
    TWENTYONESAVAGE ("21 Savage", 2),
    DRAKE ("Drake", 1),
    ARILENNOX ("Ari Lennox", 2),
    TAYLORSWIFT ("Taylor Swift", 7),
    FIVIOFOREIGN ("Fivio Foreign", 1),
    SZA ("SZA", 5),
    MAEMULLER ("Mae Muller", 1),
    POLOG ("Polo G", 2),
    GLASSANIMALS ("Glass Animals", 2),
    KENDRICKLAMAR ("Kendrick Lamar", 4),
    SILKSONIC ("Silk Sonic", 1),
    DOJACAT ("Doja Cat", 5),
    ADELE ("Adele", 4),
    LILNASX ("Lil Nas X", 4),
    THEANXIETY ("The Anxiety", 1),
    KEITHURBAN ("Keith Urban", 1),
    BTS ("BTS", 3),
    CARRIEUNDERWOOD ("Carrie Underwood", 1),
    DANANDSHAY ("Dan + Shay", 1),
    TRAVISBARKER ("Travis Barker", 1),
    KANEBROWN ("Kane Brown", 4),
    LILBABY ("Lil Baby", 3),
    MANESKIN ("Maneskin", 1),
    MORGANWALLEN ("Morgan Wallen", 4),
    AVAMAX ("Ava Max", 2),
    TIESTO ("Tiesto", 1),
    MARSHMELLO ("Marshmello", 1),
    WEEKND ("The Weeknd", 7),
    ARIANAGRANDE ("Ariana Grande", 2),
    ANDYWILLIAMS ("Andy Williams", 1),
    FUTURE ("Future", 2),
    CARDIB ("Cardi B", 2),
    POSTMALONE ("Post Malone", 3),
    HARRYSTYLES ("Harry Styles", 2),
    LUKECOMBS ("Luke Combs", 3),
    KODAKBLACK ("Kodak Black", 2),
    CARLYPIERCE ("Carly Pierce", 1),
    KIDLAROI ("The Kid LAROI", 2),
    LILUZIVERT ("Lil Uzi Vert", 1),
    WALKERHAYES ("Walker Hayes", 1),
    YOUNGBOY ("YoungBoy Never Broke Again", 2),
    STEPHANIE ("Stephanie Beatriz", 1),
    JUSTINBIEBER ("Justin Bieber", 2),
    OLIVIARODRIGO ("Olivia Rodrigo", 2),
    DUALIPA ("Dua Lipa", 2),
    BEYONCE ("Beyonce", 2),
    RINASAWAYAMA ("Rina Sawayama", 1),
    TWICE ("TWICE", 1),
    BLACKPINK ("BLACKPINK", 1),
    CHRISSTAPLETON ("Chris Stapleton", 1),
    MAROON5 ("Maroon 5", 2),
    JID ("JID", 1),
    SAWEETIE ("Saweetie", 1),
    JASONALDEAN ("Jason Aldean", 1),
    KIDCUDI ("Kid Cudi", 1),
    ERICCHURCH ("Eric Church", 1),
    MARIAHCAREY ("Mariah Carey", 1),
    MEGAN ("Megan Thee Stallion", 2),
    RODWAVE ("Rod Wave", 1),
    MARENMORRIS ("Maren Morris", 1),
    MONEYBAGG ("Moneybagg Yo", 2),
    GIVEON ("Giveon", 2),
    EDSHEERAN ("Ed Sheeran", 2),
    BABYKEEM ("Baby Keem", 1),
    IMAGINEDRAGONS ("Imagine Dragons", 1),
    WILLOW ("Willow", 1),
    JBALVIN("J Balvin", 1),
    GAYLE("Gayle", 1),
    JACKHARLOW("Jack Harlow", 1),
    LATTO ("Latto", 1),
    DJKHALED("DJ Khaled", 1),
    BRENDALEE("Brenda Lee", 1),
    CHARLIXCX ("Charli XCX", 1);




    private String name;
    private int multiplier;
    /**
     * Creates an artist object
     * @param name the name of the artist
     * @param multiplier artist multiplier value
     */
    private Artists (String name, int multiplier) {
        this.name = name;
        this.multiplier = multiplier;
    }
    /**
     * Returns artist name
     * @return artist name
     */
    public String toName() {
        return name;
    }
    /**
     * Returns artist multiplier 
     * @return artist multiplier
     */
    public int getMultiplier() {
        return multiplier;
    }

}
