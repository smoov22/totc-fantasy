/**
 * Enumeration of all artists being used by players
 * The multiplier value is a representation of how many players chose the artist
 * When several players choose an artist, the points are split among those who chose them
 * @author Kyle Mullen, 1022
 */
public enum Artists {
    TAYLORSWIFT ("Taylor Swift", 14),
    ARIANAGRANDE ("Ariana Grande", 11),
    DRAKE ("Drake", 8),
    SAVAGE ("21 Savage", 7),
    DUALIPA ("Dua Lipa", 7),
    MORGANWALLEN ("Morgan Wallen", 7),
    NOAHKAHAN ("Noah Kahan", 7),
    XAVI ("Xavi", 7),
    ZACHBRYAN ("Zach Bryan", 6),
    JACKHARLOW ("Jack Harlow", 5),
    PESOPLUMA ("Peso Pluma", 5),
    THEWEEKND ("The Weeknd", 5),
    JCOLE ("J. Cole", 4),
    JELLYROLL ("Jelly Roll", 4),
    LUKECOMBS ("Luke Combs", 4),
    DOJACAT ("Doja Cat", 3),
    KALIUCHIS ("Kali Uchis", 3),
    METROBOOMIN ("Metro Boomin", 3),
    BILLIEEILISH ("Billie Eilish", 2),
    CHRISSTAPLETON ("Chris Stapleton", 2),
    FLOMILLI ("Flo Milli", 2),
    FRANKOCEAN ("Frank Ocean", 2),
    KACEYMUSGRAVES ("Kacey Musgraves", 2),
    KANEBROWN ("Kane Brown", 2),
    NEWJEANS ("NewJeans", 2),
    PLAYBOICARTI ("Playboi Carti", 2),
    SZA ("SZA", 2),
    TRAVISSCOTT ("Travis Scott", 2),
    AESPA ("aespa", 1),
    ATEEZ("ATEEZ", 1),
    BADBUNNY ("Bad Bunny", 1),
    CARDIB ("Cardi B", 1),
    COLDPLAY ("Coldplay", 1),
    EMINEM ("Eminem", 1),
    FUERZAREGIDA ("Fuerza Regida", 1),
    GRUPOFRONTERA ("Grupo Frontera", 1),
    HARRYSTYLES ("Harry Styles", 1),
    ICESPICE ("Ice Spice", 1),
    JENNIE ("Jennie", 1),
    JESSIEMURPH ("Jessie Murph", 1),
    JID ("JID", 1),
    JUNIORH ("Junior H", 1),
    KATYPERRY ("Katy Perry", 1),
    KENYAGRACE ("Kenya Grace", 1),
    LAINEYWILSON ("Lainey Wilson", 1),
    LILBABY ("Lil Baby", 1),
    LILNASX ("Lil Nas X", 1),
    MITSKI ("Mitski", 1),
    NETTSPEND ("nettspend", 1),
    PHOEBEBRIDGERS ("Phoebe Bridgers", 1),
    RIHANNA ("Rihanna", 1),
    RILEYGREEN ("Riley Green", 1),
    SABRINACARPENTER ("Sabrina Carpenter", 1),
    SIA ("Sia", 1),
    SUMMERWALKER ("Summer Walker", 1),
    TATEMCRAE ("Tate McRae", 1),
    TEEGRIZZLY ("Tee Grizzly ", 1),
    TVGIRL ("TV Girl", 1);




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
