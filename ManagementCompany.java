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

public class ManagementCompany {
    private String name;
    private String taxId;
    private int managementFeePercentage;
    private Property[] properties;
    private Plot plot;
    private int numberOfProperties;

    public static final int MAX_PROPERTY = 5;
    public static final int MGMT_WIDTH = 10;
    public static final int MGMT_DEPTH = 10;

    public ManagementCompany(String n, String t, int m) {
    	name = n;
    	taxId = t;
    	managementFeePercentage = m;
    }
    
    public ManagementCompany(String n, String t, int m, int x, int y, int w, int d) {
        name = n;
        taxId = t;
        managementFeePercentage = m;
        properties = new Property[MAX_PROPERTY];
        plot = new Plot(x, y, w, d);
        numberOfProperties = 0;
    }

    public int addProperty(Property property) {
    	if (numberOfProperties >= MAX_PROPERTY) {
    		return -1;
    	}

    	if (property == null) {
    		return -2;
    	}

    	if (!plot.encompasses(property.getPlot())) {
    		return -3;
    	}

    	for (int i = 0; i < numberOfProperties; i++) {
    		if (property.getPlot().overlaps(properties[i].getPlot())) {
    			return -4;
    		}
    	}

    	properties[numberOfProperties] = property;
    	numberOfProperties++;

    	return numberOfProperties - 1;
}

    public double getTotalRent() {
        double totalRent = 0.0;
        for (int i = 0; i < numberOfProperties; i++) {
            totalRent += properties[i].getRent();
        }
        return totalRent;
    }
    public Property getHighestRentProperty() {
        if (numberOfProperties == 0) {
            return null;
        }

        Property highestRentProperty = properties[0];
        for (int i = 1; i < numberOfProperties; i++) {
            if (properties[i].getRent() > highestRentProperty.getRent()) {
                highestRentProperty = properties[i];
            }
        }

        return highestRentProperty;
    }
    
    public void removeLastProperty() {
        if (numberOfProperties > 0) {
            properties[numberOfProperties - 1] = null;
            numberOfProperties--;
        }
    }
    public boolean isPropertiesFull() {
        return numberOfProperties >= MAX_PROPERTY;
    }
    public int getPropertiesCount() {
        return numberOfProperties;
    }
    
    public boolean isManagementFeeValid() {
        return managementFeePercentage >= 0.0 && managementFeePercentage <= 100.0;
    }
    public String toString() {
        StringBuilder result = new StringBuilder();
    
        result.append("List of the properties for ").append(name).append(", taxID: ").append(taxId).append("\n");
        result.append("______________________________________________________\n");
    
        for (int i = 0; i < numberOfProperties; i++) {
            result.append(properties[i].toString()).append("\n");
        }
    
        result.append("______________________________________________________\n");
        result.append("\nTotal management Fee: ").append(String.format("%.2f", getTotalRent() * (managementFeePercentage / 100.0)));

        return result.toString();
    }
}