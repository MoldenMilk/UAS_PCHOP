package com.pbp.uas_pchop.db;

import android.widget.ImageView;

import androidx.databinding.BindingAdapter;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class DataKitchen {
    public String nama_item;
    public String Desc;
    public String Harga;
    public String imgUrl;

    public DataKitchen(String nama_item, String Desc, String Harga, String imgUrl){
        this.nama_item = nama_item;
        this.Desc = Desc;
        this.Harga = Harga;
        this.imgUrl = imgUrl;
    }

    public String getnama_item() {
        return nama_item;
    }
    public void setnama_item(String nama_item) {
        this.nama_item = nama_item;
    }

    public String getDesc() {
        return Desc;
    }
    public void setDesc(String Desc) {
        this.Desc = Desc;
    }

    public String getHarga() { return Harga; }
    public void setHarga(String Harga) {
        this.Harga = Harga;
    }

    @BindingAdapter("Pic")
    public static void loadImage(ImageView view, String img){
        Glide.with(view.getContext())
                .load(img).apply(new RequestOptions()).into(view);
    }
}
