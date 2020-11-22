import java.util.Random;

abstract class Empleado{
  private String nombre;
  private String especialidad;

  private int id;
  private float salario;

  public Nomina nomina = new Nomina();
  public Random ran = new Random();

  public Empleado(){
    String[] nombres = {"Salazar","Ely","Mariana","Kevin","Fernando","Arturo","Jimmy","Luis","Jose"};
    set_id( ran.nextInt( 400 ) );
    set_nombre( nombres[ ran.nextInt( 9 ) ] );
  }

  public String toString(){
    return
      "Empleado: " + get_nombre() +
      " ID: " + get_id() +
      " Puesto: " + get_especialidad() +
      " Salario: " + get_salario()
    ;
  }

  public void set_especialidad(String especialidad){
    this.especialidad = especialidad;
  }
  public void set_nombre(String nombre){
    this.nombre = nombre;
  }
  public void set_id(int id){
    this.id = id;
  }
  public void set_salario(float salario){
    this.salario = salario;
  }

  public String get_especialidad(){
    return especialidad;
  }
  public String get_nombre(){
    return nombre;
  }
  public int get_id(){
    return id;
  }
  public float get_salario(){
    return salario;
  }
  public void Trabajar(){

  }
}
