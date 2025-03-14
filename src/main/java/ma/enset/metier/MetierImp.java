package ma.enset.metier;

import ma.enset.dao.Idao;

public class MetierImp implements IMetier {
    // couplage faible
    private Idao dao;
    @Override
    public double calcule() {
        double t =dao.getData();
        double res=t*23;

        return res;
    }

    public MetierImp() {
    }

    public MetierImp(Idao dao) {
        this.dao = dao;
    }
    /* pour injecter dans la varibale dao un objet
    d'une class qui implemente l'interface idao
     */

    public void setDao(Idao dao) {
        this.dao = dao;
    }
}
