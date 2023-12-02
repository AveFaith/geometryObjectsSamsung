public abstract class GeometryObject implements Comparable<GeometryObject> {
    double square, scale;
    abstract double getSquare();
    abstract void setScale(double scale);
    @Override
    public int compareTo(GeometryObject o) {
        if(this.getSquare() > o.getSquare()){
            return 1;
        } else if (this.getSquare() < o.getSquare()) {
            return -1;
        }
        return 0;
    }

}
