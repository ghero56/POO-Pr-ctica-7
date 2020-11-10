/*
Jerarquía de clases

  implemetar herencia
  super clase -> generalizacion
  subclase -> especializacion
*/

/*
existen lenguajes que aceptan multiherencia pero Java no, solo simple
*/

/*
las clases mas externas solo pueden ser o public o predeterminados
*/

class subClase /*extends superClase*/{
  public static class Empleado{
    private static String nombre;
    private static int id,sueldo;
    /*setters*/
    public static void setNombre(String name){ nombre = name; }
    public static void setSueldo(int newSueldo){ sueldo = newSueldo; }
    public static void setID(int newID){ id = newID; }
    /*getters*/
    public static int getSueldo(){
      return sueldo;
    }
    public static String getNombre(){
      return nombre;
    }
    public static int getID(){
      return id;
    }

    public static void aumentarSueldo(int novo){ sueldo += novo; }
  }

  public static class Gerente extends Empleado{
    private static int presupuesto;
    public static void asignarPresupuesto(int pre){
      presupuesto = pre;
    }
  }

  public static void main(String[] args) {
    Gerente gerente = new Gerente();
    if(gerente instanceof Empleado){
      System.out.println("El gerente es un empleado");
    }
  }
}
