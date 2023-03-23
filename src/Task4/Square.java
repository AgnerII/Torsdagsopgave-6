package Task4;

import static java.lang.Math.PI;

public class Square implements Shape {
    double leng;

    public Square(double leng){
        this.leng = leng;
    }
    @Override
    public double getArea(){
        return leng*leng;
    }

}
