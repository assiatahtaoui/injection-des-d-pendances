package ma.enset.presentation;
import ma.enset.ma.enset.ext.DaoImpV2;
import ma.enset.metier.MetierImp;

public class Prest {
    public static void main(String[] args) {
        DaoImpV2 d=new DaoImpV2();
        MetierImp metier = new MetierImp();
        metier.setDao(d);
        System.out.println(metier.calcule());
    }
}
