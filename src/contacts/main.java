package contacts;

import contacts.ContactManager;
import org.junit.runner.JUnitCore;
import org.junit.runner.notification.Failure;
import tests.ContactTest;

import javax.xml.transform.Result;

class Main {
    public static void main(String [] args){


        Result result = (Result) JUnitCore.runClasses(ContactTest.class);
        for (Failure failure : ((org.junit.runner.Result) result).getFailures()) {
            System.out.println(failure.toString());
        }


    }


}
