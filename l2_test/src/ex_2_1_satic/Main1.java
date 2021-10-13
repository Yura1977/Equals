package ex_2_1_satic;

public class Main1 {
    public static void main(String[] args) {
        CatMy cat1 = new CatMy("Tom");
        System.out.println(cat1.catsAmount);//не корректно
        System.out.println(CatMy.catsAmount);
    }
}
