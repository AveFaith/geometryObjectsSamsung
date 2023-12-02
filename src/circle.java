public class circle extends GeometryObject{
    double r;
    public circle(double r) {
        this.r = r;
        square = getSquare();
    }
    @Override
    public double getSquare() {
        return Math.PI*Math.pow(r, 2);
    }

    @Override
    void setScale(double scale){
        r *= scale;
        square = getSquare();
    }

    @Override
    public String  toString() {
        return "circle{" +
                "r=" + r +
                ", square=" + square +
                '}';
    }
}
