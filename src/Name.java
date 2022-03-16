public class Name {

    private String firstName;
    private String lastName;

    public Name(String first, String last){

        this.firstName = first;
        this.lastName = last;

    }

    public String toString(){

        return firstName + " " + lastName;

    }

    public boolean equals(Object obj){

        Name n = (Name)obj;

        return n.firstName.equals(firstName) && n.lastName.equals(lastName);

    }

    public int CompareTo(Name n){

        if(lastName.equals(n.lastName)){
            return firstName.compareTo(n.firstName);
        }else
            return 0;

    }
}
