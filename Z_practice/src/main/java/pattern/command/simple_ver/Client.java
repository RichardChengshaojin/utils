package pattern.command.simple_ver;

/**
 * Client
 *
 * @author chengshaojin
 * @since 2017/11/2
 */
public class Client {

    public static void main(String[] args) {

        // 调用者(Invoker)
        SimpleRemoteControl remote = new SimpleRemoteControl();

        // 电灯打开命令(Command)：执行者(Receiver)以及开灯动作(Action)
        Light light = new Light();
        LightOnCommand lightOn = new LightOnCommand(light);

        // 车库门打开命令(Command)：执行者(Receiver)以及打开车库门动作(Action)
        GarageDoor garageDoor = new GarageDoor();
        GarageDoorOpenCommand garageDoorOpen = new GarageDoorOpenCommand(garageDoor);

        // 设置命令 setCommand()
//        remote.setCommand(lightOn);
        remote.setCommand(garageDoorOpen);

        // 调用者触发命令，命令对象中执行者执行动作
        remote.buttonWasPressed();
    }
}
