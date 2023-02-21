package Proxy_Design_Pattern;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/* Customer DataBase */
interface customerServiceDatabase {
    public Customer getCustomerDetails(String ID) throws IOException;
}

class Customer {
    private String custID, custName, custEmail, custCity;

    /* Constructor */
    public Customer(String custID, String custName, String custEmail, String custCity) {
        this.custID = custID;
        this.custName = custName;
        this.custEmail = custEmail;
        this.custCity = custCity;
    }

    /* getters and setters */
    public String getCustID() {
        return custID;
    }

    public void setCustID(String custID) {
        this.custID = custID;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getCustEmail() {
        return custEmail;
    }

    public void setCustEmail(String custEmail) {
        this.custEmail = custEmail;
    }

    public String getCustCity() {
        return custCity;
    }

    public void setCustCity(String custCity) {
        this.custCity = custCity;
    }

}

class customerService implements customerServiceDatabase {

    public Customer getCustomerDetails(String custID) throws IOException {

        // read the file customerInfo.txt
        // Search for the custID , if exists , return customerDetails ,
        // else "Record Not Found"

        FileReader fr = new FileReader("customerInfo.txt");
        FileWriter fw = new FileWriter("customerInfo.txt", true);
        BufferedReader sbf = new BufferedReader(fr);
        Boolean flag = false;

        try {

            String line = sbf.readLine();
            while (line != null) {

                String substr = line.substring(0, 4);

                if (custID.equalsIgnoreCase(substr)) {

                    System.out.println("\nUser Found !! Welcome ... \n");
                    System.out.println("Details of Person with ID = " + custID + " are as follows : ");
                    System.out.println(line + "\n");
                    flag = true;
                    break;
                }
                line = sbf.readLine();

            }
        }

        catch (Exception e) {
            e.printStackTrace();
        }

        if (flag) {
            fw.write("\nUser with User ID = " + custID + " accessed the DataBase ...");
        }

        if (!flag)
            System.out.println("Record Not Found :( ... ");

        fw.close();
        fr.close();
        sbf.close();

        return null;
    }
}

class customerServiceProxy implements customerServiceDatabase {
    customerService cs = new customerService();

    public Customer getCustomerDetails(String custID) throws IOException {
        
        // if admin allow access , else access denied
        String role = "admin";
        if (role.equals("admin")) {
            Customer c = cs.getCustomerDetails(custID);
        } else {

            System.out.println("Access Denied");
        }
        return null;
    }
}

public class proxyDesignPattern {

    public static void main(String[] args) throws IOException {
        customerServiceDatabase csdb = new customerServiceProxy();
        Customer c = csdb.getCustomerDetails("C002");
    }
}
