package homework1;

public class MyTriangle {
    private MyPoint v1;
    private MyPoint v2;
    private MyPoint v3;


    public MyTriangle(int x1,int y1, int x2, int y2, int x3, int y3) {

        this.v1=new MyPoint(x1,y1);
        this.v2=new MyPoint(x2,y2);
        this.v3=new MyPoint(x3,y3);

    }

    public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    @Override
    public String toString() {
        return "MyTriangle[" +
                "v1=" + v1.toString() +
                ", v2=" + v2.toString() +
                ", v3=" + v3.toString() +
                ')';
    }

    public double getPerimeter(){
        double result=v1.distance(v2)+v2.distance(v3)+v3.distance(v1);
        return result;
    }

    public String getType(){
        double a=v1.distance(v2);
        double b=v2.distance(v3);
        double c=v3.distance(v1);
        String result;
        if (((a+b)==c)||((a+c)==b)||((b+c)==a)) {
            result = "Error";
        }
        else{
            if ((a==b)&&(a==c)){
              result="Equilateral";
            }
            else{
                if ((a==b)||(a==c)||(b==c)){
                    result="Isosceles";
                }
                else result = "Scalene";
            }
        }
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MyTriangle)) { return false;}

        MyTriangle that = (MyTriangle) o;


        return this.v1.equals(that.v1) && this.v2.equals(that.v2) && this.v3.equals(that.v3);
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + v1.hashCode();
        result = 31 * result + v2.hashCode();
        result = 31 * result + v3.hashCode();
        return result;
    }
}