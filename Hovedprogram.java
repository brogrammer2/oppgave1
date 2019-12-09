import java.util.Scanner;
import java.io.File;

class Hovedprogram {
  public static void main(String[] args) throws Exception {

    Regneklynge rk = new Regneklynge("regneklynge3.txt");

    System.out.println("Noder med minst 32 GB: " + rk.noderMedNokMinne(32));
    System.out.println("Noder med minst 64 GB: " + rk.noderMedNokMinne(64));
    System.out.println("Noder med minst 128 GB: " + rk.noderMedNokMinne(128));
    System.out.println("\nAntall prosessorer: " + rk.antProsessorer());
    System.out.println("Antall racks: " + rk.hentRacks());

    /*
    Regneklynge abel = new Regneklynge(12);
    Node node1 = new Node(1, 64);
    Node node2 = new Node(2, 1024);
    int i = 0;
    int j = 0;

    while (i < 650) {
      abel.settInnNode(node1);
      i++;
    }

    while (j < 16) {
      abel.settInnNode(node2);
      j++;
    }

    System.out.println("Noder med minst 32 GB: " + abel.noderMedNokMinne(32));
    System.out.println("Noder med minst 64 GB: " + abel.noderMedNokMinne(64));
    System.out.println("Noder med minst 128 GB: " + abel.noderMedNokMinne(128));
    System.out.println("\nAntall prosessorer: " + abel.antProsessorer());
    System.out.println("Antall racks: " + abel.hentRacks());

    */

    /*
    Node n1 = new Node(2, 16);
    Node n2 = new Node(2, 16);
    Node n3 = new Node(2, 128);
    Node n4 = new Node(2, 64);

    Regneklynge rk = new Regneklynge(2);
    rk.settInnNode(n1);
    rk.settInnNode(n2);
    rk.settInnNode(n3);
    rk.settInnNode(n4);

    System.out.println("Antall racks: " + rk.hentRacks());
    System.out.println("Antall prosessorer: " + rk.antProsessorer());
    System.out.println("Antall noder med nok minne: " + rk.noderMedNokMinne(128));
    */

    /*
    Rack r1 = new Rack(10);
    r1.settInnNode(n1);
    r1.settInnNode(n2);
    r1.settInnNode(n3);
    r1.settInnNode(n4);

    System.out.println(r1.hentAntNoder());
    */

    /*n1.info();
    n2.info();
    n3.info();*/
  }
}
