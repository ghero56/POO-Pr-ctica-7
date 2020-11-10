public class PersonalMedico{
  private int id;
  private String nombre,areaDeTrabajo;
  public void setNumeroDeEmpleado(int newID){ id = newID; }
  public void setNombre(String name){ nombre = name; }
  public void setAreaDeTrabajo(String area){ areaDeTrabajo = area; }
  public int getNumeroDeEmpleado(){ return id; }
  public String getAreaDeTrabajo(){ return areaDeTrabajo; }
  public String getNombre(){ return nombre; }
  public String trabajar(){ return "Trabajando ando"; }
}
