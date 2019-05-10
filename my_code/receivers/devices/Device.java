package com.utec.design.patterns.receivers.devices;

public class Device {
    String name;

    public Device() {
        this.name = "Device";
    }

    public Device(String name) {
        this.name = name;
    }

    public String name() {
        return this.name;
    }
}
