package TD1;

public class Chaine implements Sommable<Chaine> {
    
    private String chaine;

    Chaine(String chaine){
        this.chaine = chaine;
    }

    String getChaine(){
        return this.chaine;
    }

    @Override
    public Chaine sommer(Chaine other) {
        // TODO Auto-generated method stub
        return null;
    }
}
