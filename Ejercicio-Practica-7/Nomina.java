public class Nomina{
  private static final float pagoBase = 5000f;

  public float Pagar( String especialidad ){
    float pago = 0;

    switch( especialidad ){
      case "LiderDeProyecto":
        pago = pagoBase*1.9f;
        break;
      case "Administrador":
        pago = pagoBase*1.7f;
        break;
      case "Disenador":
      case "Desarrollador":
        pago = pagoBase*1.5f;
        break;
      case "Tester":
        pago = pagoBase;
        break;
      default:
        System.out.println("no se reconoce la labor del Empleado");
    }
    return pago;
  }
}
