public class Author{
    private String firstName;
    private String secondName;

    public Author(String firstName, String secondName){
        this.firstName = firstName;
        this.secondName = secondName;
    }

    public String getFirstName(){
        return this.firstName;
    }

    public String getSecondName(){
        return this.secondName;
    }

    @Override
    public String toString(){
        return this.firstName + " " + this.secondName;
    }

    @Override
    public boolean equals(Object other) {
        if (other == null || this.getClass() != other.getClass()) {
            return false;
        }
        Author another = (Author) other;
        if (firstName.equals(another.firstName) && secondName.equals(another.secondName)){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(firstName + secondName);
    }
}