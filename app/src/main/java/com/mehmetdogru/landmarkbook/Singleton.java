package com.mehmetdogru.landmarkbook;

import android.graphics.Bitmap;

public class Singleton {

    private Bitmap chosenImage;
    private static Singleton singleton;

    private Singleton() {

    }

    public void setChosenImage(Bitmap chosenImage) {
        this.chosenImage = chosenImage;
    }

    public Bitmap getChosenImage() {
        return chosenImage;
    }

    public static Singleton getInstance(){
        if (singleton == null){
            singleton = new Singleton();
        }

        return singleton;
    }
}
