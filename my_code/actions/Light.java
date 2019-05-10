package com.utec.design.patterns.actions;

import com.utec.design.patterns.receivers.rooms.Room;

public class Light {
    private boolean isOn = false;
    private Room room;

    public Light(Room room) {
        this.room = room;
    }

    public void on() {
        isOn = true;
        System.out.println("Light is " + isOn + " in the " + this.room.name());
    }

    public void off() {
        isOn = false;
        System.out.println("Light is " + isOn + " in the " + this.room.name());
    }

}
