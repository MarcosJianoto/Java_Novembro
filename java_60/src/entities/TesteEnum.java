package entities;

import entities.Planets;

public class TesteEnum {

  Planets planeta;

  TesteEnum() {}

  TesteEnum(String planeta) {
    this.planeta = Planets.valueOf(planeta);
  }

  public void viajarPlaneta() {
    switch (planeta) {
      case MERCÚRIO:
        System.out.println("Viajar para Mercúrio");
        break;
      case VÊNUS:
        System.out.println("Viajar para Mercúrio");
        break;
      case TERRA:
        System.out.println("Viajar para Mercúrio");
        break;
      case MARTE:
        System.out.println("Viajar para Mercúrio");
        break;
      case JÚPITER:
        System.out.println("Viajar para Mercúrio");
        break;
      case SATURNO:
        System.out.println("Viajar para Mercúrio");
        break;
      case URANO:
        System.out.println("Viajar para Mercúrio");
        break;
      case NETUNO:
        System.out.println("Viajar para Mercúrio");
        break;
      default:
        System.out.println("não existe");
        break;
    }
  }
}
