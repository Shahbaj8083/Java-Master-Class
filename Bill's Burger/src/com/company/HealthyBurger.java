package com.company;

public class HealthyBurger extends Hamburger{
    private String healthyExtra1Name;
    private double healthyExtra1Price;

    private String healthyExtra2Name;
    private double healthyExtra2Price;

    public HealthyBurger(String meat, double price) {
        super("Healthy Burger",meat, price,"Brown");
    }
    public void addHealthyAddition1(String helathyExtra1Name,double healthyExtra1Price){
        this.healthyExtra1Name =helathyExtra1Name;
        this.healthyExtra1Price=healthyExtra1Price;
    }
    public void addHealthyAddition2(String helathyExtra2Name,double healthyExtra2Price) {
        this.healthyExtra2Name = helathyExtra2Name;
        this.healthyExtra2Price = healthyExtra2Price;
    }

    @Override
    public double itemizeHamburger() {
       double healtyBurgerPrice=super.itemizeHamburger();
       if(healthyExtra1Name != null){
           System.out.println("Added "+healthyExtra1Name+ " for "+healthyExtra1Price);
           healtyBurgerPrice+=healthyExtra1Price;
       }
        if(healthyExtra2Name != null){
            System.out.println("Added "+healthyExtra2Name+ " for "+healthyExtra2Price);
            healtyBurgerPrice+=healthyExtra2Price;
        }
        return healtyBurgerPrice;
    }
}
