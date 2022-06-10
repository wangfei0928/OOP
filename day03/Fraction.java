package com.lanou.day03;

public class Fraction {

    /*
    * :做一个分数类(五分之二,七分之三这样的分数). 包含分子和分母2个属性, 提供如下方法:
    * 计算当前分数与另外一个分数的和, 计算当前分数和另外一个分数的差,
    * 计算当前分数和另外一个分数的乘积,
    * 计算当前分数和另外一个分数的商.
    * 实现分数的约分功能.
    * */
    private int fenzi;
    private int fenmu;

    public void printFraction(int fenzi,int fenmu){
        System.out.println(fenzi + "/" + fenmu);
    }
    public String sum(Fraction fraction,Fraction fraction2){
        int resultfenmu =  fraction.getFenmu() * fraction2.getFenmu();
        int fraction1fenzi = fraction.fenzi * fraction2.getFenmu();
        int fraction2fenzi = fraction2.fenzi * fraction.getFenmu();
        int resultfenzi = fraction1fenzi + fraction2fenzi;
        return resultfenzi + "/" + resultfenmu;
    }

    public String jianfa(Fraction fraction,Fraction fraction2){
        int resultfenmu =  fraction.getFenmu() * fraction2.getFenmu();
        int fraction1fenzi = fraction.fenzi * fraction2.getFenmu();
        int fraction2fenzi = fraction2.fenzi * fraction.getFenmu();
        int resultfenzi = fraction1fenzi - fraction2fenzi;
        return resultfenzi + "/" + resultfenmu;
    }

    public String chengfa(Fraction fraction,Fraction fraction2){
        int resultfenmu =  fraction.getFenmu() * fraction2.getFenmu();
        int resultfenzi = fraction.getFenzi() * fraction2.getFenzi();
        return resultfenzi + "/" + resultfenmu;
    }

    public String chufa(Fraction fraction,Fraction fraction2){
        int resultfenmu =  fraction.getFenmu() * fraction2.getFenzi();
        int resultfenzi =  fraction.getFenmu() * fraction2.getFenmu();
        return resultfenzi + "/" + resultfenmu;
    }



    public int getFenzi() {
        return fenzi;
    }

    public void setFenzi(int fenzi) {
        this.fenzi = fenzi;
    }

    public int getFenmu() {
        return fenmu;
    }

    public void setFenmu(int fenmu) {
        this.fenmu = fenmu;
    }
}
