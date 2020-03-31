package Workshop9;

public class RightTriangle {
    private double a,b,c;

    public RightTriangle() {
    }

    public RightTriangle(double a, double b, double c) 
            throws IllegalTriangleException,IllegalRightTriangleException {
        this.a = a;
        this.b= b;
        this.c = c;
        if((a>b+c)||(b>a+c)||(c>a+b))
            throw new IllegalTriangleException();
        if(2*Math.pow(findMax(),2) != (Math.pow(a, 2)+Math.pow(b, 2)+
                Math.pow(c, 2)))    
            throw  new IllegalRightTriangleException();
    }
    
    private double findMax(){
        double max = a;
        if(b>max) max = b;
        if(c>max) max = c;
        return max;
    } 
}
