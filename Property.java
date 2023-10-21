/*
 * Class: CMSC203
 * Instructor: Professor Kuijt
 * Description: plot creation
 * Due: 10/22/2023
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
 * Print your Name here: Abel Mintesnot
*/

public class Property {
    private String propertyName;
    private String city;
    private double rentalAmount;
    private String owner;
    private Plot plot;
    
    public Property() {
        propertyName = "Property";
        city = "Townsville";
        rentalAmount = 1000.00;
        owner = "John";
    }
    public Property(String pn, String c, double ra, String o) {
        propertyName = pn;
        city = c;
        rentalAmount = ra;
        owner = o;
    }
    public Property(String pn, String c, double ra, String o, int x, int y, int w, int d) {
        propertyName = pn;
        city = c;
        rentalAmount = ra;
        owner = o;
        plot = new Plot(x, y, w, d);
    }
    
    public void setPropertyName(String pn) {
        propertyName = pn;
    }
    public void setCity(String c) {
        city = c;
    }
    public void setRentAmount(double ra) {
        rentalAmount = ra;
    }
    public void setRent(double ra) {
        rentalAmount = ra;
    }
    public void setOwner(String o) {
        owner = o;
    }
    public void setPlot(int x, int y, int w, int d) {
        plot = new Plot(x, y, w, d);
    }
    
    public String getPropertyName() {
        return propertyName;
    }
    public String getCity() {
        return city;
    }
    public double getRentAmount() {
        return rentalAmount;
    }
    public double getRent() {
        return rentalAmount;
    }
    public String getOwner() {
        return owner;
    }
    public Plot getPlot() {
    	return plot;
    }
    
    public String toString() {
        return String.format("%s,%s,%s,%.2f,%s", propertyName, city, owner, rentalAmount, plot.toString());
    }
}