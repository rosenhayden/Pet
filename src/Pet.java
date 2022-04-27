import java.time.LocalDate;


public class Pet {
    Type type;
    LocalDate dateOfBirth;
    String name;
    boolean needsRestraint;
    String breed;
public enum Type {
    Dog, 
    Cat,
    Chicken
}

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public Pet(Pet.Type type, LocalDate dateOfBirth, String name, boolean needsRestraint, String breed) {
        this.type = type;
        this.dateOfBirth = dateOfBirth;
        this.name = name;
        this.needsRestraint = needsRestraint;
        this.breed = breed;
    }

    public Pet.Type getAnimalType() {
        return type;
    }

    public void setAnimalType(Pet.Type animalType) {
        this.type = type;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isNeedsRestraint() {
        if(getAge(getDateOfBirth()) >= 13) {
            return false;
        }
    return needsRestraint;
    }

    public void setNeedsRestraint(boolean needsRestraint) {
        this.needsRestraint = needsRestraint;
    }

    public static int getAge(LocalDate dateOfBirth)
    {
        if(LocalDate.now().getMonthValue() - dateOfBirth.getMonthValue() >= 0) {
            return (LocalDate.now().getYear() - dateOfBirth.getYear());
        }
        return (LocalDate.now().getYear() - dateOfBirth.getYear()) - 1;
    }

}
