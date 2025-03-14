package ma.enset.ma.enset.ext;

import ma.enset.dao.Dao;
import ma.enset.dao.Idao;

public class DaoImpV2 implements Idao {

    @Override
    public double getData() {
        System.out.println("Version capteurs");
        double t=12;
        return t;
    }
}
