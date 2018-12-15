package com.punith.singleton;

public class Singleton {

    static Singleton singleton = null;

    public String getMyname() {
        return Myname;
    }

    public void setMyname(String myname) {
        Myname = myname;
    }

    private String Myname = "punith";
    public static Singleton  getInstances() {
        if (singleton == null){
            singleton = new Singleton();
         }
        return singleton;
    }
    public Singleton getSingleton() {
        return singleton;
    }

    public void setSingleton(Singleton singleton) {
        this.singleton = singleton;
    }
}
