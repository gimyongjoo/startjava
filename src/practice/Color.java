package practice;

public class Color {


    private int red;
    private int green;
    private int blue;

    public Color(){

    }

    public Color(int red){
        this.red = red;
    }

    public Color(int green, int blue){
        this.green = green;
        this.blue = blue;
    }

    public Color(int red, int green, int blue){
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

    public void setRed(int red){
        this.red = red;
    }

    public int getRed() {
        return red;
    }

    public void setGreen(int green){
        this.green = green;
    }

    public int getGreen() {
        return green;
    }

    public void setBlue(int blue){
        this.blue = blue;
    }

    public int getBlue() {
        return blue;
    }

    // return을 color생성자 사용
    public static Color mixColor(Color a, Color b){
        Color newColor = new Color(a.getRed() + b.getRed(), a.getGreen() + b.getGreen(), a.getBlue() + b.getBlue());
        return newColor;
    }



    int[] num = new int[10];

}
