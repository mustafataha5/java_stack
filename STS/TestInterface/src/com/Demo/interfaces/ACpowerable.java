package com.Demo.interfaces;

public interface ACpowerable {

	Integer voltage = 120;
    Integer frequency = 60;
    @Deprecated
    abstract void unPlug();
    abstract boolean checkPluggedIn();
    
    public default void hasPower() {
        String message = "The device is ";
        if(!checkPluggedIn()) {
            message += "not ";
        }
        System.out.println(message + "plugged in.");
    }
}
