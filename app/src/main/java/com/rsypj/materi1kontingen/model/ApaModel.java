package com.rsypj.materi1kontingen.model;

/**
 * Created by dhadotid on 21/11/2017.
 */

public class ApaModel {

    int id;
    String judul;
    String isi;

    public ApaModel(int id, String judul, String isi) {
        this.id = id;
        this.judul = judul;
        this.isi = isi;
    }

    public int getId() {
        return id;
    }

    public String getJudul() {
        return judul;
    }

    public String getIsi() {
        return isi;
    }
}
