class Computer{
    public void playMusic(){
        System.out.println("Playing Music");
    }
    public String getMeAPen(int cost) {
        if (cost >= 10) {
            return "Pen";
        } else {
            return "Nothing";
        }
    }
}
public class Methods {
    public static void main (String args[]){

        Computer obj = new Computer();
        obj.playMusic();
        System.out.println(obj.getMeAPen(1));
    }
}
