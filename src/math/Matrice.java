package math;

public class Matrice {
    public double[][] table;

    public Matrice(int x, int y){
        this.table = new double[x][y];
    }

    // ---------------  Setteur --------------------

    /**
     * Set l'élemnent en position [x][y] a la valeur value
     * @param x ligne
     * @param y colonnes
     * @param value valeur à donner
     */
    public void setTable(int x, int y, double value){
        table[x][y] = value;
    }

    /**
     * Met tout les élements de la table à la même valeur value
     * @param value valeur pour renplir le tableau
     */
    public void setAllTable(double value){
        for(int i = 0 ; i<table.length ; i ++){
            for(int j = 0 ; j<table[0].length ; j++){
                setTable(i,j,value);
            }
        }
    }


    /**A FAIRE : GERER LE CAS OU X!=Y !
     * 
     * Set la diagonale de la matrice à la valeur value
     * @param value valeur pour la diagonale
     */
    public void setDiagonale(double value){
        for(int i=0 ; i<table.length ; i++){
            setTable(i, i, value);
        }
    }

    // ---------------  Getteur  -------------------- 

    /**
     * Renvoie la table de la matrice
     * @return table de la matrice
     */
    public double[][] getTable(){
        return this.table;
    }

    // ---------------  Maths --------------------

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

    /** A FAIRE
     * 
     * Multiplie this avec m pour donner une nouvelle fonction
     * @param m Matrice à multiplier avec this
     * @return true si multiplication possible, false sinon
     */
    public boolean multiplicationMatrice(Matrice m){
        if(this.table[0].length != m.getTable().length){
            return false;
        }

        for (int i=0 ; i<this.table.length ; i++){
            for (int j=0 ; j<m.getTable()[0].length ; j++){
                double total = 0;
                for (int k=0 ; k<table[0].length ; k++ ){
                    total += table[i][k] * m.getTable()[k][j];
                }
                this.setTable(i, j, total);
            }
        }
        return true;
    }

    /** A FAIRE
     * 
     * Pour trouver le determinant de la matrice
     * @return le determinant
     */
    public double determinant(){return 0.0;}

    // ---------------  Overrides --------------------
 
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

     /**
    * Renvoie la copie de la matrice
    * @return Matrice this
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

}
