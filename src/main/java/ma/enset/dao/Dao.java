package ma.enset.dao;

public class Dao implements Idao{

    @Override
    public double getData() {
        System.out.println("version base de donnees");
        double tem=23;
        return tem;
    }
}
