import java.util.ArrayList;

public class Main
{
    private static ArrayList<Info> list = new ArrayList<Info>();

    public Main(){
        Window w = new Window(1200, 900, "Space Travel Inquiry");
    }

    public void addToList(Info i){
        list.add(i);
    }

    public static void main(String[] args){
        Main m = new Main();
    }
}