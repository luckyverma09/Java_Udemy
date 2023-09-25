public class Point {
    private int x ;
    private int y;

    public Point(){
        this(0,0);
    }
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance() {
        return Math.sqrt(x*x + y*y);
    }
    public double distance(int x,int y){
       int xDiff = this.x - x;
       int yDiff = this.y - y;
       return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }
    public double distance(Point another){
        int xDiff = this.x - another.getX();
        int yDiff = this.y - another.getY();
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }
}
