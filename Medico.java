public class Medico extends PersonalMedico{
  private String especialidad;

  public void setEspecialidad(String especial){ especialidad = especial; }
  public String getEspecialidad(){
    return especialidad;
  }
  public String trabajar(){
    return super.trabajar() + "\nAtendiendo pacientes en: " + getAreaDeTrabajo();
  }
  /**
  * Sobrecargando el metodo heredado de la super clase Object
  */
  public String toString(){
    return "Medico: "+getNombre()+
           "\nID: "+getNumeroDeEmpleado()+
           "\nArea de trabajo: "+getAreaDeTrabajo()+
           "\nEspecialidad: " + getEspecialidad();
  }
}

class PruebaMedico{
  public static void main(String[] args) {
    Medico m = new Medico();
    m.setNombre("Jhon Piers");
    m.setNumeroDeEmpleado(4);
    m.setEspecialidad("Medico Cirujano");
    m.setAreaDeTrabajo("Quirofano");

    System.out.println(m.toString()); // pidiendolo
    System.out.println(m); // toString sin pedir

    System.out.println(m.trabajar());

    if (m instanceof Medico)
      System.out.println("Es un medico");
    if (m instanceof PersonalMedico)
      System.out.println("Es Personal Medico");
    if (m instanceof Object)
      System.out.println("Es una instancia de la clase Object");

  }
}
