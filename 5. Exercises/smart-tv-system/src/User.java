public class User {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        System.out.println("Is the TV on? " + smartTv.on);

        smartTv.turnOn();
        System.out.println("Is the TV on now? " + smartTv.on);
        
        System.out.println("What is the actual channel? " + smartTv.channel);
        System.out.println("What is the actual volume? " + smartTv.volume);

        smartTv.lowerVolume();
        smartTv.lowerVolume();
        smartTv.lowerVolume();
        smartTv.turnUpVolume();
        System.out.println("What is the actual volume? " + smartTv.volume);

        smartTv.returnChannel();
        smartTv.returnChannel();
        smartTv.advanceChannel();
        System.out.println("What is the actual channel? " + smartTv.channel);

        smartTv.changeChannel(13);
        System.out.println("What is the actual channel? " + smartTv.channel);

        smartTv.turnOff();
        System.out.println("Is the TV on? " + smartTv.on);
    }
}
