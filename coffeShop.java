public class coffeShop {
    private String item1 = "Iced Coffee";
    private String item2 = "Mocha Expresso";
    private String item3 = "Cappucino";
    private String item4 = "Muffin";

    public String getItem1(){
        return item1;
    }

    public String getItem2(){
        return item2;
    }

    public String getItem3(){
        return item3;
    }

    public String getItem4(){
        return item4;
    }

}

class Starbucks extends coffeShop{
    String item5 ="Pumpkin spice latte";
    String item6 ="Chocolaty Minty Frappe";
    String item7 ="Scone"; 

    public String getItem5(){
        return item5;
    }

    public String getItem6(){
        return item6;
    }

    public String getItem7(){
        return item7;
    }
}

class Petes extends coffeShop{
    String item8 = "Niner miner macchiato";
    String item9 = "Dark roasted expresso";

    public String getItem8(){
        return item8;
    }

    public String getItem9(){
        return item9;
    }
}

class DunkinDonuts extends coffeShop{
    String item10 = "Doughnut";
    String item11 = "Scone";

    public String getItem10(){
        return item10;
    }

    public String getItem11(){
        return item11;
    }
}