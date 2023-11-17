package edu.uc.cs3003.medava;
import java.util.ArrayList;
import java.util.List;
public class Transporter {
    public List<Medicine> goods;
    private String mTransporterName;

    public String getTransporterName() {
        return mTransporterName;
    }
    
    {
        goods = new ArrayList<Medicine>();
    }

    public void ship() {
        // Do some shipping!
    }
}