public class Rack {
  private int teller = 0;
  private int plassTil;
  private Node[] rackNoder;

  public Rack(int plassTil) {
    rackNoder = new Node[plassTil];
    this.plassTil = plassTil;
  }

  public void settInnNode(Node node) {
    if (teller < plassTil) {
      rackNoder[teller] = node;
      teller++;
    }
  }

  public boolean erFull() {
    if (teller == plassTil) {
      return true;
    }
    return false;
  }


  public int sjekkMinne(int paakrevdMinne) {
    int antNoder = 0;
    for (int i = 0; i < rackNoder.length; i++) {
      if (rackNoder[i] != null) {
        if (rackNoder[i].hentMinne() >= paakrevdMinne) {
          antNoder++;
        }
      }
    }
    return antNoder;
  }


  public int hentAllePros() {
    int totalAntPros = 0;
    for (int i = 0; i < rackNoder.length; i++) {
      if (rackNoder[i] != null) {
        totalAntPros += rackNoder[i].hentPros();
      }
    }
    return totalAntPros;
  }

  public int hentAntNoder() {
    return teller;
  }

  public int hentMaksPlass() {
    return plassTil;
  }


}
