package com.utec.design.patterns;

import com.utec.design.patterns.commands.LightOffCommand;
import com.utec.design.patterns.commands.LightOnCommand;
import com.utec.design.patterns.actions.Light;
import com.utec.design.patterns.receivers.rooms.KitchenRoom;
import com.utec.design.patterns.receivers.rooms.LivingRoom;
import com.utec.design.patterns.receivers.rooms.Room;

public class Main {

    public static void main(String[] args) {
        RemoteControl rc = new RemoteControl();

        KitchenRoom kroom = new KitchenRoom("Kitchen #01");
        LivingRoom lroom = new LivingRoom("Living #01");

        Light light = new Light(kroom);

        LightOnCommand lightOn = new LightOnCommand(light);
        LightOffCommand lightOff = new LightOffCommand(light);

        rc.register("on", lightOn);
        rc.register("off", lightOff);

        rc.execute("on");
        rc.execute("off");
        rc.execute("on");
    }
}
