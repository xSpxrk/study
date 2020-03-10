package exercises.second;

public class Vectors {
    private double x;
    private double y;
    private double z;

    public Vectors(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double length(){

        return Math.sqrt((x*x)+(y*y)+(z*z));
    }

    public double dotProduct(Vectors vector){
        return ((x*vector.x)+(y*vector.y)+(z*vector.z));
    }

    public double[]  vectorProduct(Vectors vector){
        double[] result = new double[3];
        result[0] = y*vector.z-z*vector.y;
        result[1] = z*vector.x-x*vector.z;
        result[2] = x*vector.y-y*vector.x;
        return result;
    }

    public double angle(Vectors vector){
        return dotProduct(vector)/(length()+vector.length());
    }

    public Vectors add(Vectors vector){
        Vectors result = new Vectors(x+vector.x,y+vector.y,z+vector.z);
        return result;
    }
    public Vectors sub(Vectors vector){
        Vectors result = new Vectors(x-vector.x,y-vector.y,z-vector.z);
        return result;
    }
    public static  Vectors[] generate(int n){
        Vectors[] vectors = new Vectors[n];
        for (int i = 0; i<n;i++)
            vectors[i] = new Vectors(Math.random(),Math.random(),Math.random());
        return vectors;
    }

    @Override
    public String toString() {
        return "Vectors{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }
}
