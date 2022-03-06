
public enum Artists {
    BADBUNNY ("Bad Bunny"),
    LILDURK ("Lil Durk"),
    TWENTYONESAVAGE ("21 Savage"),
    DRAKE ("Drake"),
    ARILENNOX ("Ari Lennox"),
    TAYLORSWIFT ("Taylor Swift"),
    FIVIOFOREIGN ("Fivio Foreign"),
    SZA ("SZA"),
    MAEMULLER ("Mae Muller"),
    POLOG ("Polo G"),
    GLASSANIMALS ("Glass Animals"),
    KENDRICKLAMAR ("Kendrick Lamar"),
    SILKSONIC ("Silk Sonic"),
    DOJACAT ("Doja Cat"),
    ADELE ("Adele"),
    LILNASX ("Lil Nas X"),
    THEANXIETY ("The Anxiety"),
    KEITHURBAN ("Keith Urban"),
    BTS ("BTS"),
    CARRIEUNDERWOOD ("Carrie Underwood"),
    DANANDSHAY ("Dan + Shay"),
    TRAVISBARKER ("Travis Barker"),
    KANEBROWN ("Kane Brown"),
    LILBABY ("Lil Baby"),
    MANESKIN ("Maneskin"),
    MORGANWALLEN ("Morgan Wallen"),
    AVAMAX ("Ava Max"),
    TIESTO ("Tiesto"),
    MARSHMELLO ("Marshmello"),
    WEEKND ("The Weeknd"),
    ARIANAGRANDE ("Ariana Grande"),
    ANDYWILLIAMS ("Andy Williams"),
    FUTURE ("Future"),
    CARDIB ("Cardi B"),
    POSTMALONE ("Post Malone"),
    HARRYSTYLES ("Harry Styles"),
    LUKECOMBS ("Luke Combs"),
    KODAKBLACK ("Kodak Black"),
    CARLYPIERCE ("Carly Pierce"),
    KIDLAROI ("The Kid LAROI"),
    LILUZIVERT ("Lil Uzi Vert"),
    WALKERHAYES ("Walker Hayes"),
    YOUNGBOY ("YoungBoy Never Broke Again"),
    STEPHANIE ("Stephanie Beatriz"),
    JUSTINBIEBER ("Justin Bieber"),
    OLIVIARODRIGO ("Olivia Rodrigo"),
    DUALIPA ("Dua Lipa"),
    BEYONCE ("Beyonce"),
    RINASAWAYAMA ("Rina Sawayama"),
    TWICE ("TWICE"),
    BLACKPINK ("BLACKPINK"),
    CHRISSTAPLETON ("Chris Stapleton"),
    MAROON5 ("Maroon 5"),
    JID ("JID"),
    SAWEETIE ("Saweetie"),
    JASONALDEAN ("Jason Aldean"),
    KIDCUDI ("Kid Cudi"),
    ERICCHURCH ("Eric Church"),
    MARIAHCAREY ("Mariah Carey"),
    MEGAN ("Megan Thee Stallion"),
    RODWAVE ("Rod Wave"),
    MARENMORRIS ("Maren Morris"),
    MONEYBAGG ("Moneybagg Yo"),
    GIVEON ("Giveon"),
    EDSHEERAN ("Ed Sheeran"),
    BABYKEEM ("Baby Keem"),
    IMAGINEDRAGONS ("Imagine Dragons"),
    WILLOW ("Willow"),
    CHARLIXCX ("Charli XCX");




    private String name;
    private Artists (String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return name;
    }

}
