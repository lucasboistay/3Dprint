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

    public void setDiagonale(double value){
        for(int i=0 ; i<table.length ; i++){
            setTable(i, i, value);
        }
    }

    // Getteur 

    public double[][] getTable(){
        return this.table;
    }

   /**
    * Renvoie la copie de la matrice
    * @return Matrice
    */
    public Matrice copy(){
        Matrice m = new Matrice(table.length,table[0].length);

        for(int i=0 ; i<table.length ; i++){
            for (int j=0 ; j<table[0].length ; j++){
                m.setTable(i, j, this.table[i][j]);
            }
        }

        return m;
    }

    // Fonctions Mathématiques

    /**
     * Transform this en une matrice d'addition avec m
     * @param m Matrice de même taille que this
     * @return true si addition possible, false sinon
     */
    public boolean additionMatrice(Matrice m){

        if(m.getTable().length != table.length || m.getTable()[0].length != table[0].length){
            System.out.println("Matrice de tailles différentes!");
            return false;
        }

        for(int i=0 ; i<table.length ; i++){
            for (int j=0 ; j<table[0].length ; j++){
                this.setTable(i, j, table[i][j] + m.getTable()[i][j]);
            }
        }

        return true;
    }

    //Multiplication

    //Déterminant
 
    @Override
    public String toString() {
        String texte = "[ ";

        for(int i=0 ; i<table.length ; i++){
            if(i>0){
                texte += "  ";
            }
            for(int j=0 ; j<table[0].length ; j++){
                texte += Math.round(table[i][j]*10.0)/10.0 + " , ";
            }
            texte += "\n";
        }

        texte += "]";
        return texte;
    }
}
