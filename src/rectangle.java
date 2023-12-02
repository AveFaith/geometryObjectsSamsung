public class rectangle extends GeometryObject{
    double a, b;

    public rectangle(double a, double b) {
        this.a = a;
        this.b = b;
        square = getSquare();
    }

    public double getSquare() {
        return a * b;
    }

    @Override
    void setScale(double scale){
        a *= scale;
        b *= scale;
        square = getSquare();
    }

    @Override
    public String toString() {
        return "rectangle{" +
                "a=" + a +
                ", b=" + b +
                ", square=" + square +
                '}';
    }
}
