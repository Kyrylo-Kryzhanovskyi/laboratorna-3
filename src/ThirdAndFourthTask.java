public class ThirdAndFourthTask {
    public int publicField;
    private int privateField;
    ThirdAndFourthTask(){ // Значення за замовченням
        publicField = 42;
        privateField = 42;
    }
    ThirdAndFourthTask(ThirdAndFourthTask task){ // Конструктор копія
        publicField = task.publicField;
        privateField = task.privateField;
    }
    ThirdAndFourthTask(int a, int b){ // Конструктор з параметрами
        publicField = a;
        privateField = b;
    }
    public int getPrivateField() {
        return privateField;
    }

    public void setPrivateField(int privateField) {
        this.privateField = privateField;
    }

}
