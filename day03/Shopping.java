package com.lanou.day03;

public class Shopping {
    /*
     * 定义一个商品类,包含商品编号,商品名称,商品原价,商品折扣价,商品描述等信息,并提供一个打印商品信息的方法.
     * */

    private Integer shoppingId;
    private String shoppingName;
    private double oldPrice;
    private double newPrice;
    private String description;

    public void printShopping(){
        System.out.println("商品编号:"+shoppingId);
        System.out.println("商品名称:"+shoppingName);
        System.out.println("商品原价:"+oldPrice);
        System.out.println("商品折扣价:"+newPrice);
        System.out.println("商品描述:"+description);
    }

    public Integer getShoppingId() {
        return shoppingId;
    }

    public void setShoppingId(Integer shoppingId) {
        this.shoppingId = shoppingId;
    }


    public String getShoppingName() {
        return shoppingName;
    }

    public void setShoppingName(String shoppingName) {
        this.shoppingName = shoppingName;
    }

    public double getOldPrice() {
        return oldPrice;
    }

    public void setOldPrice(double oldPrice) {
        this.oldPrice = oldPrice;
    }

    public double getNewPrice() {
        return newPrice;
    }

    public void setNewPrice(double newPrice) {
        this.newPrice = newPrice;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
