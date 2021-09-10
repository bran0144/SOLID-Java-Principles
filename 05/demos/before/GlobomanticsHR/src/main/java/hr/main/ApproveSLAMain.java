package hr.main;

import hr.logging.ConsoleLogger;
import hr.persistence.EmployeeFileSerializer;
import hr.persistence.EmployeeRepository;
import hr.personnel.Employee;
import hr.personnel.ServiceLicenseAgreement;
import hr.personnel.Subcontractor;

import java.util.Arrays;
import java.util.List;

public class ApproveSLAMain {
    public static void main(String[] args) {
        int minTimeOffPerfect = 98;
        int maxResolutionDays = 2;
        ServiceLicenseAgreement companySla = new ServiceLicenseAgreement(minTimeOffPerfect, maxResolutionDays);

        Subcontractor subcontractor1 = new Subcontractor(
                "Rebekah Jackson",
                "rebekah-jackson@abc.com",
                3000,
                15);
        Subcontractor subcontractor2 = new Subcontractor(
                "Harry Smith",
                "harry-smith@abc.com",
                3000,
                15);
        List<Subcontractor> collaborators = Arrays.asList(subcontractor1, subcontractor2);
        for (Subcontractor s : collaborators) {
            s.approveSLA(companySla);
        }
    }
}
