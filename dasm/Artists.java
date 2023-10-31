package dasm;

/**
 * Enumeration of all artists being used by players
 * The multiplier value is a representation of how many players chose the artist
 * When several players choose an artist, the points are split among those who chose them
 * @author Kyle Mullen, 2022
 */
public enum Artists {
    BADBUNNY ("Bad Bunny", 1),
    LILDURK ("Lil Durk", 1),
    TWENTYONESAVAGE ("21 Savage", 4),
    DRAKE ("Drake", 5),
    ARILENNOX ("Ari Lennox", 1),
    TAYLORSWIFT ("Taylor Swift", 6),
    FIVIOFOREIGN ("Fivio Foreign", 1),
    SZA ("SZA", 3),
    MAEMULLER ("Mae Muller", 1),
    POLOG ("Polo G", 1),
    GLASSANIMALS ("Glass Animals", 1),
    KENDRICKLAMAR ("Kendrick Lamar", 1),
    SILKSONIC ("Silk Sonic", 1),
    DOJACAT ("Doja Cat", 1),
    ADELE ("Adele", 1),
    LILNASX ("Lil Nas X", 3),
    THEANXIETY ("The Anxiety", 1),
    KEITHURBAN ("Keith Urban", 1),
    BTS ("BTS", 1),
    CARRIEUNDERWOOD ("Carrie Underwood", 1),
    DANANDSHAY ("Dan + Shay", 1),
    TRAVISBARKER ("Travis Barker", 1),
    KANEBROWN ("Kane Brown", 1),
    LILBABY ("Lil Baby", 2),
    MANESKIN ("Maneskin", 1),
    MORGANWALLEN ("Morgan Wallen", 6),
    AVAMAX ("Ava Max", 1),
    TIESTO ("Tiesto", 1),
    MARSHMELLO ("Marshmello", 1),
    WEEKND ("The Weeknd", 3),
    ARIANAGRANDE ("Ariana Grande", 3),
    ANDYWILLIAMS ("Andy Williams", 1),
    FUTURE ("Future", 2),
    CARDIB ("Cardi B", 1),
    POSTMALONE ("Post Malone", 2),
    HARRYSTYLES ("Harry Styles", 1),
    LUKECOMBS ("Luke Combs", 1),
    KODAKBLACK ("Kodak Black", 1),
    CARLYPIERCE ("Carly Pierce", 1),
    KIDLAROI ("The Kid LAROI", 1),
    LILUZIVERT ("Lil Uzi Vert", 1),
    WALKERHAYES ("Walker Hayes", 1),
    YOUNGBOY ("YoungBoy Never Broke Again", 2),
    STEPHANIE ("Stephanie Beatriz", 1),
    JUSTINBIEBER ("Justin Bieber", 1),
    OLIVIARODRIGO ("Olivia Rodrigo", 6),
    DUALIPA ("Dua Lipa", 3),
    BEYONCE ("Beyonce", 3),
    RINASAWAYAMA ("Rina Sawayama", 1),
    TWICE ("TWICE", 1),
    BLACKPINK ("BLACKPINK", 1),
    CHRISSTAPLETON ("Chris Stapleton", 1),
    MAROON5 ("Maroon 5", 1),
    JID ("JID", 1),
    SAWEETIE ("Saweetie", 1),
    JASONALDEAN ("Jason Aldean", 1),
    KIDCUDI ("Kid Cudi", 1),
    ERICCHURCH ("Eric Church", 1),
    MARIAHCAREY ("Mariah Carey", 1),
    MEGAN ("Megan Thee Stallion", 1),
    RODWAVE ("Rod Wave", 1),
    MARENMORRIS ("Maren Morris", 1),
    MONEYBAGG ("Moneybagg Yo", 1),
    GIVEON ("Giveon", 1),
    EDSHEERAN ("Ed Sheeran", 2),
    BABYKEEM ("Baby Keem", 1),
    IMAGINEDRAGONS ("Imagine Dragons", 1),
    WILLOW ("Willow", 1),
    DUSTIN("Dustin Lynch",1),
    JBALVIN("J Balvin", 1),
    GAYLE("Gayle", 1),
    JACKHARLOW("Jack Harlow", 1),
    LATTO ("Latto", 1),
    DJKHALED("DJ Khaled", 1),
    BRENDALEE("Brenda Lee", 1),
    RIHANNA("Rihanna", 3),
    BAILEYZIMMERMAN("Bailey Zimmerman", 1),
    KAROLG("Karol G", 2),
    GABBYBARRETT("Gabby Barrett", 1),
    JORDANDAVIS("Jordan Davis",1),
    MEGHANTRAINOR("Meghan Trainor",1),
    TRAVISSCOTT("Travis Scott", 3),
    RAUW("Rauw Alejandro", 1),
    HARDY("HARDY",1),
    SAMSMITH("Sam Smith", 2),
    IVE("IVE",1),
    FRANKOCEAN("Frank Ocean", 1),
    ZACHBRYAN("Zach Bryan", 2),
    KIM("Kim Petras", 1),
    STEVELACY("Steve Lacy", 2),
    CHARLIXCX ("Charli XCX", 1),
    NICKI("Nicki Minaj", 2),
    MIKEPOSNER("Mike Posner",1),
    EMBEIHOLD("Em Beihold", 1),
    RAYE("RAYE", 2),
    ATEEZ("ATEEZ", 1),
    ROSALIA("Rosalia", 1),
    YOUNGTHUG("Young Thug", 1),
    LEWISCAPALDI("Lewis Capaldi", 1),
    OLIVERTREE("Oliver Tree", 1);




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
