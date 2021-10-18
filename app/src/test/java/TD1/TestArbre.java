package TD1;

public class TestArbre {
    Entier e1 = new Entier(1);
    Entier e2 = new Entier(8);
    Arbre<Entier> a1 = new Feuille<>(e1);
    Arbre<Entier> a2 = new Feuille<>(e2);
    //Arbre<Entier> a3 = new Noeud<>(List.of(e1, e2));

    Chaine c1 = new Chaine("a");
    Chaine c2 = new Chaine("coucou");
    Arbre<Chaine> ac1 = new Feuille<>(c1);
    Arbre<Chaine> ac2 = new Feuille<>(c2);
    //Arbre<Entier> ac3 = new Noeud<>(List.of(c1, c2));
}
