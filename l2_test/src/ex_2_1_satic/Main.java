package ex_2_1_satic;

public class Main {
    public static void main(String[] args) {
        CatMy cat1 =new CatMy("Tom");
        cat1.about();
        cat1.showCatsAmount();
        CatMy cat2 =new CatMy("Murka");
        cat2.about();
        cat2.showCatsAmount();
        CatMy cat3 =new CatMy("Kitty");
        cat3.about();
        cat3.showCatsAmount();
    }
}
