package pl.edu.ur.oopl7.zaddom.zad2;

import java.util.Random;

class Punkt3D extends Punkt2D {

    private int z;

    public Punkt3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    public Punkt3D() {

    }

    public int getZ() {
       return z;
    }

    @Override
    public Punkt3D LPunkt() {
        Random r = new Random();
        Punkt3D p = new Punkt3D(r.nextInt(21) - 10, r.nextInt(21) - 10, r.nextInt(21) - 10);
        return p;
    }

    @Override
    public String toString() {
        return super.toString() + "," + z;
    }
}