package com.pbp.uas_pchop.db;

import java.util.ArrayList;

public class DaftarKitchen {
    public ArrayList<DataKitchen> DataKitchen;
    public DaftarKitchen(){
        DataKitchen = new ArrayList<>();
        DataKitchen.add(Panci);
        DataKitchen.add(Penggorengan);
        DataKitchen.add(PisauBuah);
        DataKitchen.add(PisauDaging);
        DataKitchen.add(Talenan);
        DataKitchen.add(Kompor);
    }
    public static final DataKitchen Panci = new DataKitchen("Panci", "Terbuah dari bahan anti lengket dan cepat panas",
            "Rp 250.000", "https://www.google.com/url?sa=i&url=https%3A%2F%2Fkumparan.com%2Fkumparannews%2Fdiduga-gara-gara-kredit-panci-suami-di-pangandaran-aniaya-istri-hingga-tewas-1wcNvxYsaqn&psig=AOvVaw3i_Dm3VJJEdQLSHD1AMPVK&ust=1635173468992000&source=images&cd=vfe&ved=0CAsQjRxqFwoTCKiEyIOm4_MCFQAAAAAdAAAAABAK");
    public static final DataKitchen Penggorengan = new DataKitchen("Penggorengan", "Terbuah dari bahan anti lengket dan ringan plus cepat panas",
            "Rp 200.000", "https://www.google.com/url?sa=i&url=https%3A%2F%2Fceklist.id%2F6060%2Fwajan-penggorengan-terbaik%2F&psig=AOvVaw37YMV2KB6rjx49RcTxTj15&ust=1635173504369000&source=images&cd=vfe&ved=0CAsQjRxqFwoTCLCy7JKm4_MCFQAAAAAdAAAAABAD");
    public static final DataKitchen PisauBuah = new DataKitchen("Pisau Buah", "Pisau selalu tajam dan rasa buah tidak menempel di mata pisau",
            "Rp 125.000", "https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.bukalapak.com%2Fproducts%2Fs%2Fpisau-buah-sayur-dapur-gagang&psig=AOvVaw2GiuSCxSzpC7iweDKR3xAa&ust=1635173545360000&source=images&cd=vfe&ved=0CAsQjRxqFwoTCKjeuKim4_MCFQAAAAAdAAAAABAD");
    public static final DataKitchen PisauDaging = new DataKitchen("Pisau Daging", "Pisau selalu tajam dan tidak meninggalkan bau amis daging",
            "Rp 125.000", "https://www.google.com/url?sa=i&url=https%3A%2F%2Fid.aliexpress.com%2Fi%2F1005002229880587.html%23!&psig=AOvVaw2DHPjofZdqXw1pVMdO-vr_&ust=1635173580540000&source=images&cd=vfe&ved=0CAsQjRxqFwoTCIDSy7em4_MCFQAAAAAdAAAAABAD");
    public static final DataKitchen Talenan = new DataKitchen("Talenan", "Terbuah dari bahan anti lecet dan tahan besetan katana",
            "Rp 100.000", "https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.lazada.co.id%2Fproducts%2Ftalenan-kayu-model-bat-pingpong-alas-pemotong-i4654310287.html&psig=AOvVaw2dTs2O8ZmBe41GO4Vf63ZN&ust=1635173615151000&source=images&cd=vfe&ved=0CAsQjRxqFwoTCJjMuMum4_MCFQAAAAAdAAAAABAD");
    public static final DataKitchen Kompor = new DataKitchen("Kompor", "Bahan ringan dan dapat menggunakan gas dan listrik sekaligus",
            "Rp 800.000", "https://www.google.com/url?sa=i&url=https%3A%2F%2Fmy-best.id%2F138075&psig=AOvVaw2rjm8ODosn9uZpH1mlgaue&ust=1635173660222000&source=images&cd=vfe&ved=0CAsQjRxqFwoTCPib3tym4_MCFQAAAAAdAAAAABAD");
}
