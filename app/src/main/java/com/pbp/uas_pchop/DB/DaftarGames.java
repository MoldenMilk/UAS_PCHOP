package com.pbp.uas_pchop.DB;

import java.util.ArrayList;

public class DaftarGames {
    public ArrayList<DataGames> DataGames;
    public DaftarGames(){
        DataGames = new ArrayList<>();
        DataGames.add(RDR2);
        DataGames.add(GTA5);
        DataGames.add(Halo);
        DataGames.add(Dota2);
        DataGames.add(Doom);
        DataGames.add(Valorant);
    }
    public static final DataGames RDR2 = new DataGames("Red Dead Redemption 2", "Games adventure buatan Rockstar tapi bukan GTA ini KOBOI",
            "Rp 450.000", "https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.vg247.com%2Fred-dead-redemption-2-ps4-xbox-one-cover-art-revealed&psig=AOvVaw3RWlDjIP-Lzvf9sP6fv2dB&ust=1635173971358000&source=images&cd=vfe&ved=0CAsQjRxqFwoTCMC84omo4_MCFQAAAAAdAAAAABAD");
    public static final DataGames GTA5 = new DataGames("Grand Theft Auto 5", "Games adventure buatan Rockstar yang udah lama ga keluar yang baru (LAMA)",
            "Rp 150.000", "https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.digitalspy.com%2Fvideogames%2Fgrand-theft-auto%2Fa469960%2Fgta-5-cover-art-revealed-by-rockstar-games-image%2F&psig=AOvVaw2DQ5omb0shEqTD0r-_LNGr&ust=1635174049835000&source=images&cd=vfe&ved=0CAsQjRxqFwoTCPiw_KCo4_MCFQAAAAAdAAAAABAD");
    public static final DataGames Halo = new DataGames("Halo", "Games adventure shooter melawan alien dengan karakter utama Chief (pake helm)",
            "Rp 500.000", "https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.denofgeek.com%2Fgames%2Fhalo-infinite-box-art-combat-evolved-cover%2F&psig=AOvVaw2HmQ2IdBKba8gsAnVUC-wI&ust=1635174108268000&source=images&cd=vfe&ved=0CAsQjRxqFwoTCMiH3LGo4_MCFQAAAAAdAAAAABAD");
    public static final DataGames Dota2 = new DataGames("Dota 2", "Game gratis tapi banyak yang mainin karena gameplay asik parah",
            "Rp FREE", "https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.ubuntufree.com%2Fdownload-dota-2-game%2Fdota-2-cover-2017%2F&psig=AOvVaw15YZ3C4zXNGlLtaCo0K2a-&ust=1635174126520000&source=images&cd=vfe&ved=0CAsQjRxqFwoTCOj5q8ao4_MCFQAAAAAdAAAAABAD");
    public static final DataGames Doom = new DataGames("DOOM", "Games adventure memburu iblis dengan cara yang keren dan berdarah-darah (18+)",
            "Rp 400.000", "https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.instant-gaming.com%2Fpl%2F2669-buy-game-bethesda-doom-eternal%2F&psig=AOvVaw1R7UiZ3kIwIxLhstvqrdXN&ust=1635174187048000&source=images&cd=vfe&ved=0CAsQjRxqFwoTCJjZ0deo4_MCFQAAAAAdAAAAABAD");
    public static final DataGames Valorant = new DataGames("Valorant", "Games first person shooter seprti CS:GO tapi punya skill",
            "Rp FREE", "https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.reddit.com%2Fr%2FVALORANT%2Fcomments%2Fhhqjwl%2Fvalorant_steam_cover_art%2F&psig=AOvVaw3ZFlVFTyNQJuVldC96bO9L&ust=1635174216334000&source=images&cd=vfe&ved=0CAsQjRxqFwoTCIijn-Wo4_MCFQAAAAAdAAAAABAQ");
}
