package outerClasses;

import mainLogic.server.Server;

import java.io.PrintWriter;
import java.util.List;

public class AcDepartment {
    private static AcDepartment acDepartment;

    private AcDepartment(){}

    public static void printResults(List<Data> receivedData){
        PrintWriter pw = new PrintWriter(System.out);

        for (var d : receivedData){
            pw.printf("Name: %s; ", d.getEmployee().getName());
            pw.printf("Role: %s; ", d.getEmployee().getRole());
            pw.printf("Experience: %d; ", d.getEmployee().getExperience());

            pw.printf("Lunch break: %d; ", d.getLunchBreak());
            pw.printf("Surcharge: %d; ", d.getSurcharge());
            pw.printf("Additional Experience: %d; ", d.getExperience());
            pw.println();
        }
        pw.flush();
    }
}
