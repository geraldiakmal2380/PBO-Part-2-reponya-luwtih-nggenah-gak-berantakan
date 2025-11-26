package PBOMinggu10;

import jdk.jfr.Category;

import java.util.Calendar;
import java.util.spi.AbstractResourceBundleProvider;

class ElectricityBill implements Payable{
    private int kwh;

    private String category;

    //Konstruktor
    public ElectricityBill(int kwh, String category){
        this.category = category;
        this.kwh = kwh;

    }

    //getter dan setter
    public int getKwh() {
        return kwh;
    }

    public void setKwh(int kwh) {
        this.kwh = kwh;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public int getPaymentAmmount(){//override dari Payable
        return kwh*getBasePrice();
    }

    //hitung base price
    public int getBasePrice(){
        int bPrice = 0;
        switch (category){
        case "R-1" : bPrice = 100;break;
        case "R-2" : bPrice = 200;break;
        }
        return bPrice;
    }

    public String getBillInfo(){
        return "KWH = "+kwh+"\n"+
                "Category = "+ category + "(" + getBasePrice()+" per KWH) \n";
    }
}
