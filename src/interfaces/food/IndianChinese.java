package interfaces.food;

public class IndianChinese implements IndianFood, ChineseFood {
    @Override
    public void spoon() {
        System.out.println("Eating Food");
    }
}
