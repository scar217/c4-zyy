public class Task9 {
    public static void main(String[] args) {
        computer p = new computer();
        mouse m = new mouse();
        microphone m1 = new microphone();
        keyboard k = new keyboard();
        p.usb_slot(m,k,m1);
        p.com_open();
        p.usb_install(m,k,m1);
        p.com_close();
    }
}
/*所以需要在接口中定义设备启动和关闭的方法。*/
interface USB{
    void open();
    void close();
}
/*接下来就要编写接口的实现类鼠标、键盘、麦克风，在实现类中要实
现这些设备的启动和关闭方法。*/
class mouse implements USB{
    @Override
    public void open() {
        System.out.println("鼠标启动了");
    }

    @Override
    public void close() {
        System.out.println("鼠标关闭了");
    }
}
class keyboard implements USB{
    @Override
    public void open() {
        System.out.println("键盘启动了");
    }

    @Override
    public void close() {
        System.out.println("键盘关闭了");
    }
}
class microphone implements USB{
    @Override
    public void open() {
        System.out.println("麦克风启动了");
    }

    @Override
    public void close() {
        System.out.println("麦克风关闭了");
    }
}
/*由于这些设备是在计算机中使用的，所以接下来需要编写一个计算机类。计算机中有
了 USB 插槽后，才能插入 USB 接口，每次插入一个新的设备，计算机都会安装此设备的驱
动。驱动安装后，设备才能够正常使用，所以该类中还需要编写一个 USB 插槽和安装 USB
设备的方法。同时计算机要想开关机，还要定义开机和关机的方法。*/
class computer {
    public void usb_slot(USB mouse,USB keyboard,USB microphone){
        mouse.open();
        keyboard.open();
        microphone.open();
    }
    public void usb_install(USB mouse,USB keyboard,USB microphone){
        mouse.close();
        keyboard.close();
        microphone.close();
    }
    public void com_open(){
        System.out.println("电脑开机成功");
    }
    public void com_close(){
        System.out.println("电脑关机成功");
    }
}