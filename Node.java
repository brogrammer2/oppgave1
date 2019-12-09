public class Node {
  private int antPros;
  private int minne;

  public Node(int antPros, int minne) {
    this.antPros = antPros;
    this.minne = minne;
  }

  public int hentPros() {
    return antPros;
  }

  public int hentMinne() {
    return minne;
  }

  public void info() {
    System.out.println("AntPros: " + antPros);
    System.out.println("Minne: " + minne);
  }
}
