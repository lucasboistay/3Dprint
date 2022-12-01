package math;

public class Matrice {
    public double[][] table;

    public Matrice(int x, int y){
        this.table = new double[x][y];
    }
    public Matrice(int x){
        this(x,x);
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
     * Set toutes les valeurs de la matrice aléatoirement sur des int entre borneinf et bornesup
     * @param borneinf minimum que peut atteindre une valeur dans la matrice
     * @param bornesup Maximum que peut atteindre une valeur dans la matrice
     */
    public void setAleaInt(int borneinf,int bornesup){
        for(int i =0 ; i<table.length ; i++){
            for (int j=0 ; j<table[0].length ; j++){
                table[i][j] = (int) (Math.random() * (bornesup-borneinf) + borneinf);
            }
        }
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

    /**
     * Setteur de la ligne à l'index index
     * @param index index à modifier
     * @param array Ligne à mettre à la place index
     */
    public void setLigne(int index, double[] array){
        this.table[index] = array;
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

    /** 
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

    /**
     * 
     * Pour trouver le determinant de la matrice CARRE !
     * @return le determinant
     */
    public double determinantCarre(){return determinantrecursifCarre(this);}
    
    /**
     * Fonction de détermination du déterminant récursive. Privée !!
     * @param matrice matrice à trouver le determinant
     * @return determinant actuel
     */
    private double determinantrecursifCarre(Matrice matrice) {
        if(matrice.getTable().length == 2){
            return matrice.getTable()[0][0]*matrice.getTable()[1][1] - matrice.getTable()[0][1]*matrice.getTable()[1][0];
        }
        else{
            double det = 0;
            for(int i=0 ; i<matrice.getTable().length ; i++){
                det += Math.pow(-1, i)*matrice.getTable()[0][i] * determinantrecursifCarre(matriceReduite(matrice,i)); 
            }

            return det;
        }
    }

    /**
     * Méthode pour former une matrice réduite à partir de la première ligne et de i le numéro de colonne
     * @param i numéro de colonne de la matrice à réduire
     * @return La matrice réduite
     */
    private Matrice matriceReduite(Matrice matrice, int n) {
        Matrice reduite = new Matrice(matrice.getTable().length - 1);

        for(int i=1 ; i<matrice.getTable().length ; i++){
            double[] array = new double[matrice.getTable().length-1];

            for(int j=0 ; j<n ; j++){
                array[j] = matrice.getTable()[i][j];
            }

            for(int j=n ; j<matrice.getTable().length - 1 ; j++){
                array[j] = matrice.getTable()[i][j+1];
            }

            reduite.setLigne(i-1, array);
        }

        return reduite;
    }

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
