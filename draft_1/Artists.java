package draft_1;

/**
 * Enumeration of all artists being used by players
 * The multiplier value is a representation of how many players chose the artist
 * When several players choose an artist, the points are split among those who chose them
 * @author Kyle Mullen, 2022
 */
public enum Artists {
    BADBUNNY ("Bad Bunny", 1),
    LILDURK ("Lil Durk", 1),
    TWENTYONESAVAGE ("21 Savage", 1),
    DRAKE ("Drake", 1),
    ARILENNOX ("Ari Lennox", 1),
    TAYLORSWIFT ("Taylor Swift", 1),
    FIVIOFOREIGN ("Fivio Foreign", 1),
    SZA ("SZA", 1),
    MAEMULLER ("Mae Muller", 1),
    POLOG ("Polo G", 1),
    GLASSANIMALS ("Glass Animals", 1),
    KENDRICKLAMAR ("Kendrick Lamar", 1),
    SILKSONIC ("Silk Sonic", 1),
    DOJACAT ("Doja Cat", 1),
    ADELE ("Adele", 1),
    LILNASX ("Lil Nas X", 1),
    THEANXIETY ("The Anxiety", 1),
    KEITHURBAN ("Keith Urban", 1),
    BTS ("BTS", 1),
    CARRIEUNDERWOOD ("Carrie Underwood", 1),
    DANANDSHAY ("Dan + Shay", 1),
    TRAVISBARKER ("Travis Barker", 1),
    KANEBROWN ("Kane Brown", 1),
    LILBABY ("Lil Baby", 1),
    MANESKIN ("Maneskin", 1),
    MORGANWALLEN ("Morgan Wallen", 1),
    AVAMAX ("Ava Max", 1),
    TIESTO ("Tiesto", 1),
    MARSHMELLO ("Marshmello", 1),
    WEEKND ("The Weeknd", 1),
    ARIANAGRANDE ("Ariana Grande", 1),
    ANDYWILLIAMS ("Andy Williams", 1),
    FUTURE ("Future", 1),
    CARDIB ("Cardi B", 1),
    POSTMALONE ("Post Malone", 1),
    HARRYSTYLES ("Harry Styles", 1),
    LUKECOMBS ("Luke Combs", 1),
    KODAKBLACK ("Kodak Black", 1),
    CARLYPIERCE ("Carly Pierce", 1),
    KIDLAROI ("The Kid LAROI", 1),
    LILUZIVERT ("Lil Uzi Vert", 1),
    WALKERHAYES ("Walker Hayes", 1),
    YOUNGBOY ("YoungBoy Never Broke Again", 1),
    STEPHANIE ("Stephanie Beatriz", 1),
    JUSTINBIEBER ("Justin Bieber", 1),
    OLIVIARODRIGO ("Olivia Rodrigo", 1),
    DUALIPA ("Dua Lipa", 1),
    BEYONCE ("Beyonce", 1),
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
    EDSHEERAN ("Ed Sheeran", 1),
    BABYKEEM ("Baby Keem", 1),
    IMAGINEDRAGONS ("Imagine Dragons", 1),
    WILLOW ("Willow", 1),
    JBALVIN("J Balvin", 1),
    GAYLE("Gayle", 1),
    JACKHARLOW("Jack Harlow", 1),
    LATTO ("Latto", 1),
    DJKHALED("DJ Khaled", 1),
    BRENDALEE("Brenda Lee", 1),
    RIHANNA("Rihanna", 1),
    BAILEYZIMMERMAN("Bailey Zimmerman", 1),
    KAROLG("Karol G", 1),
    GABBYBARRETT("Gabby Barrett", 1),
    JORDANDAVIS("Jordan Davis",1),
    MEGHANTRAINOR("Meghan Trainor",1),
    TRAVISSCOTT("Travis Scott", 2),
    RAUW("Rauw Alejandro", 1),
    HARDY("HARDY",1),
    SAMSMITH("Sam Smith", 1),
    IVE("IVE",1),
    FRANKOCEAN("Frank Ocean", 1),
    ZACHBRYAN("Zach Bryan", 1),
    KIM("Kim Petras", 1),
    STEVELACY("Steve Lacy", 1),
    CHARLIXCX ("Charli XCX", 1),
    NICKI("Nicki Minaj", 1),
    MIKEPOSNER("Mike Posner",1),
    EMBEIHOLD("Em Beihold", 1),
    RAYE("RAYE", 1),
    ATEEZ("ATEEZ", 1),
    ROSALIA("Rosalia", 1),
    YOUNGTHUG("Young Thug", 1),
    LEWISCAPALDI("Lewis Capaldi", 1),
    SHAKIRA("Shakira",1),
    MILEY("Miley Cyrus",1),
    GUETTA("David Guetta",1),
    REXHA("Bebe Rexha", 1),
    TYLER("Tyler, the Creator", 1),
    METRO("Metro Boomin",1),
    GLORILLA("GloRilla",1),
    CHARLIE("charlieonafriday", 1),
    SHAKE("070 Shake",1),
    CHRISBROWN("Chris Brown",1),
    LAINEY("Lainey Wilson",1),
    SELENA("Selena Gomez",1),
    JOJI("Joji",1),
    GRUPO("Grupo Frontera",1),
    BILLIE("Billie Eilish",1),
    JVKE("JVKE",1),
    ELTONJOHN("Elton John",1),
    D4VD("d4vd", 1),
    SANCHEZ("Stephen Sanchez",1),
    ANDERSON("Anderson .Paak",1),
    BIZARRAP("Bizarrap",1),
    TAKEOFF("Takeoff",1),
    JCOLE("J. Cole",1),
    NEWJEANS("NewJeans",1),
    ICESPICE("Ice Spice",1),
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
