package TD1;

public class Entier implements Sommable<Entier>{

    private int val;

    Entier(int val){
        this.val = val;
    }

    int getEntier(){ 
        return this.val;
    }

    @Override
    public Entier sommer(Entier other) {
        // TODO Auto-generated method stub
        return null;
    }
}
