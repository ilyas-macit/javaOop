public class Main {
    public static void main(String[] args) {
//        reference type
/*
        int[] numbers1 = {1,2,3,4,5};
        int[] numbers2 = {3,4,5,6,7,8};
        numbers1 = numbers2;
        numbers2[0] = 1000;
        System.out.println(numbers1[0]);
*/

//        class
/*
        CreditManager creditManager = new CreditManager();
        creditManager.Calculate();
        Person person = new Person();
        person.firstName = "ilyas";
        person.lastName = "macit";
        person.NationalIdentity = "123455677";
        CustomerManager customerManager = new CustomerManager(person);
        customerManager.Save();

        Customer customer_person = new Person(2, "ilyas", "macit", "12345");
*/
        CustomerManager customerManager = new CustomerManager(new Customer(), new MilitaryCreditManager());
        customerManager.GiveCredit();
    }
}