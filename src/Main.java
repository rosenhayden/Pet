import java.time.LocalDate;
import java.time.Month;

public class Main {

    public static void main(String[] args) {
	Pet p1 = new Pet(Pet.Type.Dog, LocalDate.of(2003, Month.AUGUST, 2), "Jonas", true, "alwyn");
        System.out.println(p1.getAge(p1.getDateOfBirth()));
        System.out.println(p1.getDateOfBirth());
        System.out.println(p1.getAnimalType());
        System.out.println(p1.getName());
        System.out.println(p1.getBreed());
        System.out.println(p1.isNeedsRestraint());
    }
}
