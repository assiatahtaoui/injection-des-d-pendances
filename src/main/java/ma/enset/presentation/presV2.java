package ma.enset.presentation;

import ma.enset.dao.Idao;
import ma.enset.metier.IMetier;

import java.io.File;
import java.util.Scanner;

public class presV2 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("config.txt"));
        String daoClassName = sc.nextLine();
        Class cDao= Class.forName(daoClassName);
        Idao dao=(Idao) cDao.newInstance();

        String metierClassName = sc.nextLine();
        Class cMetier= Class.forName(metierClassName);
        IMetier metier=(IMetier) cMetier.getConstructor(Idao.class).newInstance(dao);
        System.out.println(metier.calcule());

    }
}
