package l26;

public abstract class TV {
    abstract void enable();
    abstract void disable();
    abstract void nextChannel();
    abstract void priviousChannel();
    abstract void soundUp();
    abstract void soundDown();

//    public static final int MAX_SOUND_VALUE = 100;
//    public void mute() {
//        for (int i = 0; i < MAX_SOUND_VALUE; i++) {
//            this.soundDown();
//        }
//    }

    protected int soundValue;

}

class SamsungTV3214 extends  TV {

    @Override
    void enable() {
        System.out.println("SamsungTV3214 enable" );
    }

    @Override
    void disable() {
        System.out.println("SamsungTV3214 disable" );


    }

    @Override
    void nextChannel() {
        System.out.println("SamsungTV3214 nextChannel" );

    }

    @Override
    void priviousChannel() {
        System.out.println("SamsungTV3214 priviousChannel" );

    }

    @Override
    void soundUp() {
        System.out.println("SamsungTV3214 soundUp" );

    }

    @Override
    void soundDown() {
        this.soundValue = this.soundValue - 1;
        soundValue = soundValue > 0 ? soundValue : 0;
        System.out.println("SamsungTV3214 soundDown" );
    }
}


class HuaweiTV954 extends  TV {

    @Override
    void enable() {
        System.out.println("HuaweiTV954 enable" );
    }

    @Override
    void disable() {
        System.out.println("HuaweiTV954 disable" );


    }

    @Override
    void nextChannel() {
        System.out.println("HuaweiTV954 nextChannel" );

    }

    @Override
    void priviousChannel() {
        System.out.println("HuaweiTV954 priviousChannel" );

    }

    @Override
    void soundUp() {
        System.out.println("HuaweiTV954 soundUp" );

    }

    @Override
    void soundDown() {
        System.out.println("HuaweiTV954 soundDown" );

    }
}


class MyFlat{
    public static void main(String[] args) {
        TV samsung = new SamsungTV3214();
        TV huawei = new HuaweiTV954();

        samsung.enable();
        huawei.enable();
        samsung.nextChannel();
        huawei.priviousChannel();
    }
}

/*
class vs interface

class - viele der Vererbungen sind nicht zugänglich
interface - Möglichkeit interagieren von Objekts.

* */
