
package ca.sheridancollege.week1.softwarefundamentals;

/**
 ** A class to model Student Objects
 * each student has: a name (first and last name)
 * each student can: say their name (getName)

 * @author Sivagama
 */
public class StudentDemo {

    private String name;
    private int n;

    //constructor
    public StudentDemo(String givenName,int n)
    {
        name=givenName;
        int sid;
        sid = n;
    }
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param givenName
     */
    public void setName(String givenName) {
        name = givenName;
    }

    
    
}
