package ex_2_1_satic;

public class CatMy {
    String name;
    int age;
    static int catsAmount;
    {//Блок инициализации
        age=88;
        catsAmount =100;
    }

    public CatMy(String name) {
        this.name = name;
        catsAmount++;
    }
    void about(){
        System.out.println(name);
    }
    void showCatsAmount(){
        System.out.println(catsAmount);
    }
}
