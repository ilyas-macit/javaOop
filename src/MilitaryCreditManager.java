public class MilitaryCreditManager implements CreditManager{


    @Override
    public void Calculate() {
        System.out.printf("asker kredisi hesaplandi");
    }

    @Override
    public void Save() {
        System.out.println("asker kaydedildi");
    }
}
