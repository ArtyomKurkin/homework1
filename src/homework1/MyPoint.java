package homework1;

public class MyPoint {
    private int x;
    private int y;

    public MyPoint() {
    }

    public MyPoint(int x, int y) {
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

    public int[] getXY(){
        int[] result = new int[2];
        result[0]=this.x;
        result[1]=this.y;
        return result;
    }

    public void setXY(int x, int y){
        this.x=x;
        this.y=y;
    }

    @Override
    public String toString() {
        return "(" +
                x +
                ","+ y +
                ')';
    }

    public double distance(int x, int y){
        double dist=Math.sqrt(Math.pow(x-this.x,2)+Math.pow(y-this.y,2));
        return dist;
    }

    public double distance(MyPoint mp1){
        double dist=Math.sqrt(Math.pow(mp1.x-this.x,2)+Math.pow(mp1.y-this.y,2));
        return dist;
    }

    public double distance(){
        double dist=Math.sqrt(Math.pow(this.x,2)+Math.pow(this.y,2));
        return dist;
    }


}
