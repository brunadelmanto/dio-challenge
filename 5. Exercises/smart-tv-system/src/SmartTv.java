public class SmartTv {

    boolean on = false;
    int channel = 18;
    int volume = 25;

    public void turnOn(){
        on = true;
    }

    public void turnOff(){
        on = false;
    }

    public void turnUpVolume(){
        volume++;
        System.out.println("The actual volume is " + volume);
    }

    public void lowerVolume(){
        volume--;   
        System.out.println("The actual volume is " + volume);    
    }

    public void advanceChannel(){
        channel++;
        System.out.println("The actual channel is " + channel);
    }

    public void returnChannel(){
        channel--;
        System.out.println("The actual channel is " + channel);
    }

    public void changeChannel(int newChannel){
        channel = newChannel;
        System.out.println("The actual channel is " + channel);
    }

}
