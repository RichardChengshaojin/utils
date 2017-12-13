package pattern.command.completed_ver;

/**
 * DEC
 *
 * @author chengshaojin
 * @since 2017/11/2
 */
public class Client {

    public static void main(String[] args) {
        RemoteControl remoteControl = initRemoteControl();
        System.out.println(remoteControl);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);

        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);

        remoteControl.onButtonWasPushed(2);
        remoteControl.offButtonWasPushed(2);

        remoteControl.onButtonWasPushed(3);
        remoteControl.offButtonWasPushed(3);

        remoteControl.onButtonWasPushed(4);
        remoteControl.offButtonWasPushed(4);

        System.out.println("\n undo:");
        remoteControl.undoButtonWasPushed();

        System.out.println("\n----- Push Macro On---\n");
        remoteControl.onButtonWasPushed(5);
        System.out.println("\n----- Push Macro Off---\n");
        remoteControl.offButtonWasPushed(5);
    }

    private static RemoteControl initRemoteControl() {
        RemoteControl remoteControl = new RemoteControl();
        // living room light
        Light livingRLight = new Light("Living Room");
        LightOnCommand lRLightOnC = new LightOnCommand(livingRLight);
        LightOffCommand lRLightOffC = new LightOffCommand(livingRLight);
        remoteControl.setCommand(0, lRLightOnC, lRLightOffC);

        // Kitchen light
        Light kitchenLight = new Light("Kitchen");
        LightOnCommand kitchenLightOnC = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOffC = new LightOffCommand(kitchenLight);
        remoteControl.setCommand(1, kitchenLightOnC, kitchenLightOffC);

        // Living room ceiling fan
        CeilingFan ceilingFan = new CeilingFan("Living room");
        CeilingFanLowCommand ceilingFanOn = new CeilingFanLowCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);
        remoteControl.setCommand(2, ceilingFanOn, ceilingFanOff);

        // garage door
        GarageDoor garageDoor = new GarageDoor("");
        GarageDoorUpCommand garageDoorUp = new GarageDoorUpCommand(garageDoor);
        GarageDoorDownCommand garageDoorDown = new GarageDoorDownCommand(garageDoor);
        remoteControl.setCommand(3, garageDoorUp, garageDoorDown);

        // living room stereo
        Stereo livingRStereo = new Stereo("Living Room");
        StereoOnWithCDCommand stereoOnWithCDCommand = new StereoOnWithCDCommand(livingRStereo);
        StereoOffCommand stereoOffCommand = new StereoOffCommand(livingRStereo);
        remoteControl.setCommand(4, stereoOnWithCDCommand, stereoOffCommand);

        // party 模式
        Command[] partyOn = {lRLightOnC, kitchenLightOnC, stereoOnWithCDCommand, garageDoorUp};
        Command[] partyOff = {lRLightOffC, kitchenLightOffC, stereoOffCommand, garageDoorDown};

        MacroCommand partyOnMacro = new MacroCommand(partyOn);
        MacroCommand partyOffMacro = new MacroCommand(partyOff);
        remoteControl.setCommand(5, partyOnMacro, partyOffMacro);

        return remoteControl;
    }
}
