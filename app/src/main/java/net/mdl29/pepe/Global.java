package net.mdl29.pepe;

import android.graphics.Bitmap;

public class Global {
    private static  Global instance;
    private Bitmap picture;
    private Global() {}
    public void setPicture(Bitmap val) {picture = val;}
    public Bitmap getPicture() {return  picture;}
    public static synchronized Global getInstance() {
        if(instance==null) {
            instance = new Global();
        }
        return instance;
    }
}
