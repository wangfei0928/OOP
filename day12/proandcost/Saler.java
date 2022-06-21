package com.lanou.day12.proandcost;

public class Saler {

    private int productCount = 10;

    public synchronized void stockGoods(){
        if (productCount < 200){
            productCount++;
            System.out.println(Thread.currentThread().getName()+"生产了一件商品，库存是："+productCount);
            this.notifyAll();
        }else {
            System.out.println("库存满了！");
            try {
                this.wait();  //库存满了
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public synchronized void sellGoods(){
        if (productCount > 0){
            productCount--;
            System.out.println(Thread.currentThread().getName()+"购买了一件产品,库存为:"+productCount);
            this.notifyAll();
        }else {
            System.out.println("库存不足！");
            try {
                this.wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
