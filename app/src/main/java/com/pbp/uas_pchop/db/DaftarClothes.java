package com.pbp.uas_pchop.db;

import java.util.ArrayList;

public class DaftarClothes {
    public ArrayList<DataClothes> DataClothes;
    public DaftarClothes(){
        DataClothes = new ArrayList<>();
        DataClothes.add(Kemeja);
        DataClothes.add(KaosPolos);
        DataClothes.add(Jaket);
        DataClothes.add(CelanaPendek);
        DataClothes.add(Jeans);
        DataClothes.add(Sepatu);
    }
    public static final DataClothes Kemeja = new DataClothes("Kemeja Pria", "Lengan panjang dengan bahan halus, tersedia ukurna M-XL",
            "Rp 150.000", "https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.tokopedia.com%2Fsupplierkemeja-1%2Fkemeja-pria-lengan-panjang-peter-slim-fit-hitam-l&psig=AOvVaw1ftDb_S184tSsu995K5M4x&ust=1635173776176000&source=images&cd=vfe&ved=0CAsQjRxqFwoTCMDDoZOn4_MCFQAAAAAdAAAAABAD");
    public static final DataClothes KaosPolos = new DataClothes("Kaos Polos", "Kaos polos dengan bahan adem dan warna warni, tersedia ukurna M-XL",
            "Rp 80.000", "https://www.google.com/url?sa=i&url=https%3A%2F%2Fberkahkonveksi.com%2Fgrosir-kaos-polos-semarang%2F&psig=AOvVaw0kjHm5hfiGGjxy1GtE_GMm&ust=1635173812949000&source=images&cd=vfe&ved=0CAsQjRxqFwoTCLj0oaWn4_MCFQAAAAAdAAAAABAD");
    public static final DataClothes Jaket = new DataClothes("Jaket", "Jaket dengan bahan agak tebal dan anti air, tersedia ukurna M-XL",
            "Rp 200.000", "https://www.google.com/url?sa=i&url=https%3A%2F%2Findonesian.alibaba.com%2Fproduct-detail%2Fwaterproof-rain-jacket-windbreaker-designed-for-taining-in-rainy-windy-and-cold-weather-1600105966340.html&psig=AOvVaw2KwH_psuknHukUI2yPTptM&ust=1635173841560000&source=images&cd=vfe&ved=0CAsQjRxqFwoTCIDonbOn4_MCFQAAAAAdAAAAABAD");
    public static final DataClothes CelanaPendek = new DataClothes("Celana Pedek", "Celana pendek dengan bahan awet anti sobek, tersedia ukurna M-XL",
            "Rp 80.000", "https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.lazada.co.id%2Fproducts%2Fcelana-pendek-pria-celana-cargo-pendek-cargo-dickies-cargo-pendek-pendek-cargo-dickies-i1605560939.html&psig=AOvVaw0uM4qlYjI-3MNNEC1WKwPK&ust=1635173873271000&source=images&cd=vfe&ved=0CAsQjRxqFwoTCOjO-8Gn4_MCFQAAAAAdAAAAABAD");
    public static final DataClothes Jeans = new DataClothes("Jeans", "Jeans dengan bahan awet tidak perlu cuci, tersedia ukurna M-XL",
            "Rp 130.000", "https://www.google.com/url?sa=i&url=https%3A%2F%2Fstylenandaen.com%2Fcategory%2Fjeans%2F129%2F&psig=AOvVaw1u1bczrItVDKLAd_J5DEsC&ust=1635173898072000&source=images&cd=vfe&ved=0CAsQjRxqFwoTCIC43M2n4_MCFQAAAAAdAAAAABAD");
    public static final DataClothes Sepatu = new DataClothes("Sepatu", "Sepatu premium buatan Tanggerang, tersedia ukurna 35-43",
            "Rp 200.000", "https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.lazada.co.id%2Fproducts%2Frh-super-sale-sepatu-original-import-sepatu-pria-sepatu-sneaker-murah-sepatu-pria-casual-sepatu-pria-kasual-sepatu-pria-murah-i4124256657.html&psig=AOvVaw3BAQS0cv09_16rrzzDECNe&ust=1635173925745000&source=images&cd=vfe&ved=0CAsQjRxqFwoTCOibu9yn4_MCFQAAAAAdAAAAABAD");
}
