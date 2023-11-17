package edu.uc.cs3003.medava;
import java.util.ArrayList;
import java.util.List;
public class Transporter {
    private List<Medicine> goods;
    private String mTransporterName;
    private double mLowTemperature, mHighTemperature;

    public String getTransporterName() {
        return mTransporterName;
    }
    
    {
        goods = new ArrayList<Medicine>();
    }

    public void ship() {
        // Do some shipping!
    }

    public Transporter(String transporterName, double lowTemp, double highTemp) {
        mTransporterName = transporterName;
        mLowTemperature = lowTemp;
        mHighTemperature = highTemp;
    }

    public boolean load(Medicine itemToLoad) {
        if (itemToLoad.isTemperatureRangeAcceptable(mLowTemperature, mHighTemperature)) {
            System.out.println(String.format("Adding a %s to the transporter.", itemToLoad.getMedicineName()));
            goods.add(itemToLoad);
            return true;
        }
        return false;
    }

    public Medicine unload() {
        return goods.remove(0);
    }
    public boolean isEmpty() {
        return goods.isEmpty();
    }
}