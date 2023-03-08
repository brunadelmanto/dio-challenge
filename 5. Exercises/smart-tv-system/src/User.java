public class User {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        System.out.println("Is the TV on? " + smartTv.on);
        System.out.println("What is the actual channel? " + smartTv.channel);
        System.out.println("What is the actual volume? " + smartTv.volume);

    }
}
