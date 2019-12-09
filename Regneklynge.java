import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;

public class Regneklynge {
  private int antNoderPerRack;
  private ArrayList<Rack> antRacks = new ArrayList<Rack>();

  /*
  public Regneklynge(int antNoderPerRack) {
    this.antNoderPerRack = antNoderPerRack;
  }
  */

  public Regneklynge(String filnavn) throws Exception {
    lesKlyngeFraFil(filnavn);
  }

  public void lesKlyngeFraFil(String filnavn) throws Exception {
    Scanner fil = new Scanner(new File(filnavn));
    String linje = "";

    linje = fil.nextLine();
    int maxAntNoderPerRack = Integer.parseInt(linje);
    this.antNoderPerRack = maxAntNoderPerRack;
    //Rack rack = new Rack(maxAntNoderPerRack);
    //antRacks.add(rack);

    while (fil.hasNextLine()) {
      linje = fil.nextLine();
      String[] ord = linje.split(" ");
      int antNoder = Integer.parseInt(ord[0]);
      int minnePrNode = Integer.parseInt(ord[1]);
      int antProsPrNode = Integer.parseInt(ord[2]);
      lagOgSettInnNoder(antNoder, antProsPrNode, minnePrNode);
    }
  }

  public void lagOgSettInnNoder(int antNoder, int antPros, int minne) {
    int i = 0;
    while (i < antNoder) {
      Node node = new Node(antPros, minne);
      settInnNode(node);
      i++;
    }
  }

  public int hentRacks() {
    return antRacks.size();
  }

  public int noderMedNokMinne(int paakrevdMinne) {
    int antNoder = 0;
    for (Rack r : antRacks) {
      if (r != null) {
        antNoder += r.sjekkMinne(paakrevdMinne);
      }
    }
    return antNoder;
  }

  public int antProsessorer() {
    int antPros = 0;
    for (Rack r : antRacks) {
      if (r != null) {
        antPros += r.hentAllePros();
      }
    }
    return antPros;
  }

  public void settInnNode(Node node) {
    for (Rack r : antRacks) {
      if (!r.erFull()) {
        r.settInnNode(node);
        return;
      }
    }

    Rack nyRack = new Rack(antNoderPerRack);
    nyRack.settInnNode(node);
    antRacks.add(nyRack);

    /*
    if (antRacks.isEmpty()) {
      //System.out.println("Er inne i isEmpty!");
      Rack firstRack = new Rack(antNoderPerRack);
      firstRack.settInnNode(node);
      antRacks.add(firstRack);
      return;
    }

    for (Rack r : antRacks) {
      if (!r.erFull()) {
        System.out.println("Er inne i if (!erFull())!");
        r.settInnNode(node);
        return;
      } else {
        Rack nyRack = new Rack(antNoderPerRack);
        nyRack.settInnNode(node);
        antRacks.add(nyRack);
        return;
      }

    }*/

  }

}
