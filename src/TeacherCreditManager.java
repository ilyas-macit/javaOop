public class TeacherCreditManager implements CreditManager{

    @Override
    public void Calculate() {
        System.out.println("ogretmen kredisi hesaplandi");
    }

    @Override
    public void Save() {
        System.out.println("ogretmen kaydedildi");
    }
}
