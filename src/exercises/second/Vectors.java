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

    public Vectors sum(Vectors vector){
        Vectors result = new Vectors(x+vector.x,y+vector.y,z+vector.z);

        return result;
    }
    public Vectors dif(Vectors vector){
        Vectors result = new Vectors(x-vector.x,y-vector.y,z-vector.z);

        return result;
    }
}
