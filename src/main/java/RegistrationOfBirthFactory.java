public class RegistrationOfBirthFactory {
    final String MARRIAGE = "Married parents";
    final String ESTABLISHING_PATERNITY = "Establishing paternity";
    final String SINGLE_MOTHER = "Single mother";

    public RegistrationOfBirth getRegistration(String registrationType) {
        switch (registrationType){
            case (MARRIAGE) : return  new RegistrationOfBirthInMarriage();

            case  (ESTABLISHING_PATERNITY) : return new RegistrationOfBirthWithEstablishingPaternity();

            case (SINGLE_MOTHER) : return new RegistrationOfBirthWithSingleMother();

            default:
                return null;

        }
    }
}
