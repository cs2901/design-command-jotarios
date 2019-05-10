package com.utec.design.patterns.receivers.rooms;

public class Room {
    String name;

    public Room() {
        this.name = "Room";
    }

    public Room(String name) {
        this.name = name;
    }

    public String name() {
        return this.name;
    }
}
