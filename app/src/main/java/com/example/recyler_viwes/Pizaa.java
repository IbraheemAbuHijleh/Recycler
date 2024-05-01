package com.example.recyler_viwes;

public class Pizaa {

    private String name ;

    private int ImageID ;

    public static final Pizaa [] pizaas ={
            new Pizaa("Diavolo", R.drawable.ibraheem),
            new Pizaa("Funghi", R.drawable.ibraheem4),
            new Pizaa("Diavolo2", R.drawable.ibraheem),
            new Pizaa("Funghi2", R.drawable.ibraheem4),
            new Pizaa("Diavolo3", R.drawable.ibraheem),
            new Pizaa("Funghi3", R.drawable.ibraheem4),
    };

    public Pizaa() {

    }

    public Pizaa(String name , int imageID) {
        this.name = name;
        this.ImageID=imageID;
    }

    public String getName() {
        return name;
    }

    public int getImageID() {
        return ImageID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setImageID(int imageID) {
        ImageID = imageID;
    }

    @Override
    public String toString() {
        return "Pizaa{" +
                "name='" + name + '\'' +
                ", ImageID=" + ImageID +
                '}';
    }
}
