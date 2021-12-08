package com.pbp.uas_pchop.DB;

import java.util.ArrayList;

public class DaftarSport {
    public ArrayList<DataSport> DataSport;
    public DaftarSport(){
        DataSport = new ArrayList<>();
        DataSport.add(BolaBasket);
        DataSport.add(BolaFutsal);
        DataSport.add(Raket);
        DataSport.add(Kok);
        DataSport.add(KacamataRenang);
        DataSport.add(GawangBola);
    }
    public static final DataSport BolaBasket = new DataSport("Bola Basket", "Kualitas NBA harga merakyat dan awet tahan banting",
            "Rp 130.000", "https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.freepnglogos.com%2Fpics%2Fbasketball&psig=AOvVaw13okSuD3kAL9k5Neh3Ct3O&ust=1635173081588000&source=images&cd=vfe&ved=0CAsQjRxqFwoTCLiNn8ik4_MCFQAAAAAdAAAAABAD");
    public static final DataSport BolaFutsal = new DataSport("Bola Futsal", "Kualitas Internasional harga merakyat dan awet tahan tendangan madun",
            "Rp 130.000", "https://www.google.com/url?sa=i&url=https%3A%2F%2Fsiplah.pesonaedu.id%2Fproduct%2F125333%2Fbola-futsal&psig=AOvVaw0IP_mCGPpBhb9LnmJ8dnGD&ust=1635173171949000&source=images&cd=vfe&ved=0CAsQjRxqFwoTCMjjv_Sk4_MCFQAAAAAdAAAAABAD");
    public static final DataSport Raket = new DataSport("Raket", "Kualitas teratas harga murah dan tahan smash juara dunia bahkan smash yang sudah bubar",
            "Rp 150.000", "https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.lazada.co.id%2Fproducts%2Fbadminton-raket-108-olahraga-sport-racket-2-pcs-berkualitas-ww-i926312932.html&psig=AOvVaw01cNJ3vF6l7s744ADYxt1L&ust=1635173216026000&source=images&cd=vfe&ved=0CAsQjRxqFwoTCJjP35el4_MCFQAAAAAdAAAAABAJ");
    public static final DataSport Kok = new DataSport("Kok", "Kok ya Kok terbuat dari bulu angsa angsa terbang dan mendarat",
            "Rp 80.000", "https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.sehatq.com%2Freview%2Fmerek-shuttlecock-terbaik&psig=AOvVaw0Y7KF6qLjUTFNlRNWdUohU&ust=1635173289146000&source=images&cd=vfe&ved=0CAsQjRxqFwoTCOjYn62l4_MCFQAAAAAdAAAAABAD");
    public static final DataSport KacamataRenang = new DataSport("Kacamata Renang", "Kualitas terbaik, tahan air dan tekanan hingga 1000psi",
            "Rp 150.000", "https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.lazada.co.id%2Fproducts%2Fkacamata-renang-anak-antifog-1600-i5194676736.html&psig=AOvVaw2Ced-dX4Zx3LZpVe5rrA5_&ust=1635173332540000&source=images&cd=vfe&ved=0CAsQjRxqFwoTCMDMpsCl4_MCFQAAAAAdAAAAABAD");
    public static final DataSport GawangBola = new DataSport("Gawang Bola", "Kulaitas terbaik dari dunia dan tahan akan gol dari tendangan musuh dan madun",
            "Rp 400.000", "https://www.google.com/url?sa=i&url=https%3A%2F%2Findonesian.alibaba.com%2Fproduct-detail%2Fsports-replacement-soccer-net-for-12-x6-soccer-goal-black-mesh-nylon-kinting-1600052815682.html&psig=AOvVaw1-6zoI1kjNa2N_JSK_QJg3&ust=1635173362865000&source=images&cd=vfe&ved=0CAsQjRxqFwoTCOjGudCl4_MCFQAAAAAdAAAAABAD");
}
