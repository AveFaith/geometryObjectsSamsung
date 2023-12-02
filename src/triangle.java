public class triangle extends GeometryObject {
    double a, b, c;

    public triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
        square = getSquare();
    }

    public double getSquare() {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    @Override
    void setScale(double scale){
        a *= scale;
        b *= scale;
        c *= scale;
        square = getSquare();
    }

    @Override
    public String toString() {
        return "triangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }
}
