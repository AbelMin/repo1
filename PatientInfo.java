import java.util.*;

class PatientInfo {
    public static class Patient {
        private String firstName;
        private String middleName;
        private String lastName;
            
        private String streetAddress;
        private String city;
        private String state;
        private String zipCode;
            
        private String phone;
        private String emFirst;
        private String emMiddle;
        private String emLast;
        private String emPhone;
            
        public Patient() {
            firstName = "John";
            middleName = "Alan";
            lastName = "Smith";
            
            streetAddress = "1 Main Street";
            city = "Springfield";
            state = "CA";
            zipCode = "90000";
            
            phone = "800-000-0000";
            emFirst = "Jane";
            emMiddle = "Marie";
            emLast = "Doe";
            emPhone = "877-000-0000";
        }
        public Patient(String f, String m, String l) {
            firstName = f;
            middleName = m;
            lastName = l;
            
            streetAddress = "1 Main Street";
            city = "Springfield";
            state = "CA";
            zipCode = "90000";
            
            phone = "800-000-0000";
            emFirst = "Jane";
            emMiddle = "Marie";
            emLast = "Doe";
            emPhone = "877-000-0000";
        }
        public Patient(String f, String m, String l, String s, String c, String st, String z, String p, String ef, String em, String el, String ep) {
            firstName = f;
            middleName = m;
            lastName = l;
            
            streetAddress = s;
            city = c;
            state = st;
            zipCode = z;
            
            phone = p;
            emFirst = ef;
            emMiddle = em;
            emLast = el;
            emPhone = ep;
        }
        
        public void setFirst(String f) {
            firstName = f;
        }
        public void setMiddle(String m) {
            middleName = m;
        }
        public void setLast(String l) {
            lastName = l;
        }
        
        public void setStreet(String s) {
            streetAddress = s;
        }
        public void setCity(String c) {
            city = c;
        }
        public void setState(String s) {
            state = s;
        }
        public void setZip(String z) {
            zipCode = z;
        }
        
        public void setPhone(String p) {
            phone = p;
        }
        public void setEmFirst(String ef) {
            emFirst = ef;
        }
        public void setEmMiddle(String em) {
            emMiddle = em;
        }
        public void setEmLast(String el) {
            emLast = el;
        }
        public void setEmPhone(String ep) {
            emPhone = ep;
        }
        
        public String getFirst() {
            return firstName;
        }
        public String getMiddle() {
            return middleName;
        }
        public String getLast() {
            return lastName;
        }
        
        public String getStreet() {
            return streetAddress;
        }
        public String getCity() {
            return city;
        }
        public String getState() {
            return state;
        }
        public String getZip() {
            return zipCode;
        }
        
        public String getPhone() {
            return phone;
        }
        public String getEmFirst() {
            return emFirst;
        }
        public String getEmMiddle() {
            return emMiddle;
        }
        public String getEmLast() {
            return emLast;
        }
        public String getEmPhone() {
            return emPhone;
        }
        
        public String buildFullName() {
            return firstName + " " + middleName + " " + lastName;
        }
        public String buildAddress() {
            return streetAddress + ", " + city + ", " + state + " " + zipCode;
        }
        public String buildEmergencyContact() {
            return emFirst + " " + emMiddle + " " + emLast + ", " + emPhone;
        }
        public String toString() {
            return "Name: " + buildFullName() + "\nAddress: " + buildAddress() + "\nEmergency contact: " + buildEmergencyContact();
        }
    }
    
    public static class Procedure {
        private String procName;
        private String date;
        private String practitioner;
        private double charge;
        
        public Procedure() {
                procName = "Heart surgery";
                date = "01/01/2024";
                practitioner = "Robert Johnson";
                charge = 10000.00;
            }
        public Procedure(String p, String d) {
                procName = p;
                date = d;
                practitioner = "Robert Johnson";
                charge = 10000.00;
            }
        public Procedure(String pn, String d, String pr, double c) {
                procName = pn;
                date = d;
                practitioner = pr;
                charge = c;
            }
            
        public String getProcName() {
                return procName;
            }
        public String getDate() {
                return date;
            }
        public String getPractitioner() {
                return practitioner;
            }
        public double getCharge() {
                return charge;
            }
            
        public void setProcName(String p) {
                procName = p;
            }
        public void setDate(String d) {
                date = d;
            }
        public void setPractitioner(String p) {
                practitioner = p;
            }
        public void setCharge(double c) {
                charge = c;
            }
            
        public String toString() {
                return "Procedure name: " + procName + "\nDate: " + date + "\nPractitioner: " + practitioner + "\nCharge: $" + charge;
            }
    }
    
    public static class PatientDriverApp {
        private Procedure proc1;
        private Procedure proc2;
        private Procedure proc3;
        private Patient patient;
            
        public PatientDriverApp() {
            patient = new Patient();
            
            proc1 = new Procedure();
            proc2 = new Procedure();
            proc3 = new Procedure();
        }
        public PatientDriverApp(Procedure p1, Procedure p2, Procedure p3) {
            proc1 = p1;
            proc2 = p2;
            proc3 = p3;
            
            patient = new Patient();
        }
        public PatientDriverApp(Patient p) {
            patient = p;
            
            proc1 = new Procedure();
            proc2 = new Procedure();
            proc3 = new Procedure();
        }
        
        public void displayPatient() {
            System.out.println(patient.toString() + "\n");
        }
        public void displayProcedure() {
            System.out.println(proc1.toString() + "\n");
            System.out.println(proc2.toString() + "\n");
            System.out.println(proc3.toString() + "\n");
        }
        public double calculateTotalCharges() {
            return proc1.getCharge() + proc2.getCharge() + proc3.getCharge();
        }
    }
    
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	
    	Procedure proc1 = new Procedure();
    	Procedure proc2 = new Procedure();
    	Procedure proc3 = new Procedure();
    	
    	for(int i = 1; i <= 3; i++) {
    		System.out.print("Name of procedure: ");
    		String proc = sc.next();
    		
    		System.out.print("Practitioner: ");
    		String pract = sc.next();
    		
    		System.out.print("Date: ");
    		String date = sc.next();
    		
    		System.out.print("Total charge: $");
    		double charge = sc.nextDouble();
    		
    		if(i == 1) {
    			proc1.setProcName(proc);
    			proc1.setDate(date);
    			proc1.setPractitioner(pract);
    			proc1.setCharge(charge);
    		}
    		if(i == 2) {
    			proc2.setProcName(proc);
    			proc2.setDate(date);
    			proc2.setPractitioner(pract);
    			proc2.setCharge(charge);
    		}
    		if(i == 3) {
    			proc3.setProcName(proc);
    			proc3.setDate(date);
    			proc3.setPractitioner(pract);
    			proc3.setCharge(charge);
    		}
    			
    	}
    	
        PatientDriverApp guy = new PatientDriverApp(proc1, proc2, proc3);
        
        guy.displayPatient();
        guy.displayProcedure();
        System.out.println("Total charges: $" + guy.calculateTotalCharges());
    }
}