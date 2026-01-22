package section16.usingMoreThanOneInterface.application;

import section16.usingMoreThanOneInterface.devices.Hybrid;
import section16.usingMoreThanOneInterface.devices.Printer;
import section16.usingMoreThanOneInterface.devices.Scanner;

public class Program {
    public static void main(String[] args) {

        Printer p = new Printer(100);
        p.processDoc("My letter");
        p.print("My letter");

        Scanner s = new Scanner(200);
        s.processDoc("Something");
        s.scan("Something");

        Hybrid h = new Hybrid(300);
        h.processDoc("Bla bla");
        h.print("Bla bla");
        h.scan("Bla bla");


    }
}
