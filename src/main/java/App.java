public class App {
    public static void main(String[] args) {
        RegistrationOfBirthFactory rofFactory = new RegistrationOfBirthFactory();
        RegistrationOfBirth married = rofFactory.getRegistration("Married parents");
        RegistrationOfBirth establishingPaternity = rofFactory.getRegistration("Establishing paternity");
        RegistrationOfBirth singleMother = rofFactory.getRegistration("Single mother");

        married.printRegistrationOfBirthType();
        establishingPaternity.printRegistrationOfBirthType();
        singleMother.printRegistrationOfBirthType();
    }
}
