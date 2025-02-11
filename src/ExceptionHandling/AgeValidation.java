package ExceptionHandling;

public class AgeValidation {
    public void getValidate(int age) throws InValidAgeException
    {
        if(age>18)
        {
            System.out.println("Eligibel for Voting");
        }
        else
        {
            throw new InValidAgeException("Not Eligible for Voting");
        }
    }

}
