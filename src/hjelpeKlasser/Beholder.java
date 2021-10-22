package hjelpeKlasser;

import java.util.Iterator;
import java.util.Objects;
import java.util.function.Predicate;


public interface Beholder <T> extends Iterable <T>
{
    public boolean leggInn (T verdi);
    public boolean inneholder (T verdi);
    public boolean fjern (T verdi); // fjerner verdi fra beholderen
    public int antall();
    public boolean tom();
    public void nullstill();
    public Iterator<T> iterator();

    default boolean fjernHvis(Predicate <? super T> p) // betingelsefjerning
    {
        Objects.requireNonNull(p);                    // Kaster unntak
        boolean fjernet = false;
        for (Iterator <T> i = iterator(); i.hasNext(); )  // løkke
        {
            if (p.test(i.next())){
                i.remove(); fjernet = true;
            }
        }
        return fjernet;
    }// grensesnitt Beholder

}

