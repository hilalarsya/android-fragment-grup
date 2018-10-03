package com.example.user.fragmentkita;

public class Resep {
    private String nama_makanan;
    private String deskripsi;
    private int gambar;

    public static final Resep[] resepmakanan = {
            new Resep("Tretan Muslim", "Lelaki dengan panggilan Muslim ini adalah asli Madura, Lelaki dengan selera humor yang sarkasme", R.drawable.tretan),
            new Resep("Coki Pardede", "Lelaki yang termasuk dalam Stand Up Comedy Depok ini adalah partner Tretan Muslim dalam acara Debat Kusir", R.drawable.coki),
            new Resep("Afif Xavi", "Lelaki muda yang penuh bakat, yang merupakan lulusan Stand Up Comedy Indonesia", R.drawable.afif),
    };

    private Resep (String name, String description, int gambar){
        this.nama_makanan = name;
        this.deskripsi = description;
        this.gambar = gambar;
    }

    public String getDescription() {
        return deskripsi;
    }

    public String getName() {
        return nama_makanan;
    }

    public int getGambar() {
        return gambar;
    }

    public String toString(){
        return this.nama_makanan;
    }
}
