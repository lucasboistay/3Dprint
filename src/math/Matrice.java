package math;

public class Matrice {
    public double[][] table;

    public Matrice(int x, int y){
        this.table = new double[x][y];
    }

    // Setteur
    public void setTable(int x, int y, double value){
        table[x][y] = value;
    }

    public void setAllTable(double value){
        for(int i = 0 ; i<table.length ; i ++){
            for(int j = 0 ; j<table[0].length ; j++){
                setTable(i,j,value);
            }
        }
    }
}
