public class Point {

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    private int x;

    private int y;

    public  Point(int xcoord, int ycoord){
        this.x = xcoord;
        this.y = ycoord;

    }
    public void setPoint(int new_x, int new_y){
        x= new_x;
        y= new_y;
    }


}
