package TD1;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Noeud <T> implements Arbre <T>{

    private final List<Arbre <T>> fils;

    public Noeud(final List<Arbre <T>> fils) {
        this.fils = fils;
    }

    @Override
    public int taille() {
        int rtr = 0;
        for (final Arbre <T> a : fils) {
            rtr += a.taille();
        }
        return rtr;
    }

    @Override
    public boolean contient(final T val) {
        boolean rtr = false;
        for (final Arbre <T> a : fils) {
            if (a.contient(val)) return true;
        }
        return rtr;
    }

    @Override
    public Set<T> valeurs() {
        Set<T> rtr = new HashSet<>();
        for (final Arbre <T> a : fils) {
            rtr.addAll(a.valeurs());
        }
        return rtr;
    }

   /* @Override
    public T somme() {
        if (fils == null || fils.size() == 0)
            return null; // should it be 0 ? no because nothing to sum
        // alternative without 0 initialization
        // int rtr = fils.get(0).somme();
        // for (int i = 1; i<fils.size(); i++) {
        //     rtr += fils.get(i).somme();
        // }
        T rtr = 0;
        for (Arbre <T> a : fils) {
            rtr += a.somme();
        }
        return rtr;
    } */

   /* @Override
    public Integer min() {
        if (fils == null || fils.size() == 0)
            return null;
        int rtr = fils.get(0).min();
        for (int i = 1; i < fils.size(); i++) {
            int min = fils.get(i).min();
            if (min < rtr) {
                rtr = min;
            }
        }
        return rtr;
    } */

    public boolean estTrie(){
        return false;
    }

    public T somme(){
        return null;
    }

    public T min(){
        return null;
    }

    public T max(){
        return null;
    }
   /* @Override
    public Integer max() {
        if (fils == null || fils.size() == 0)
            return null;
        int rtr = fils.get(0).max();
        for (int i = 1; i < fils.size(); i++) {
            int max = fils.get(i).max();
            if (max > rtr) {
                rtr = max;
            }
        }
        return rtr;
    } */

    /**
     * un noeud de fils f1 ... fi ... fn est trié ssi
     * <ol>
     * <li>&forall; i &in; 1..n, fi est trié</li>
     * <li>&forall; i &in; 1..n-1, max(fi)<= min(fi+1)</li>
     * </ol>
     */
   /* @Override
    public boolean estTrie() {
        return conditionTrie1() && conditionTrie2();
    }*/

   /* private boolean conditionTrie1() {
        boolean rtr = true;
        for (int i = 0; i < fils.size() - 1; i++) {
            final Arbre <T> fi = fils.get(i);
            if (!fi.estTrie())
                return false;
        }
        return rtr;
    } */

  /*  private boolean conditionTrie2() {
        boolean rtr = true;
        for (int i = 0; i < fils.size() - 1; i++) {
            final Arbre <T> fi = fils.get(i);
            final Arbre <T> fj = fils.get(i+1);
                if (fi.max() > fj.min())
                    return false;
        }
        return rtr;
    } */
    
}