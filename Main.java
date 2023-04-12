public class Main {
    public static void main(String[] args) throws Exception {
        
        Cliente cliente = new Cliente();
        cliente.edad = 43;
        cliente.name ="Nicolas";
        cliente.tel = 2944;
        cliente.credito = 10000;
        System.out.println("Edad: " + cliente.edad + " Nombre: " + cliente.name + " Telefono: " + cliente.tel + " Credito: " + cliente.credito );
        
        Trabajador trabajador = new Trabajador();
        trabajador.salario = 985;
        System.out.println("Salario: " + trabajador.salario);

    }


}

class Persona{
    int edad; 
    int tel;
    String name;    

}

class Cliente extends Persona {
    int credito;
}

class Trabajador extends Persona {
    int salario;
}
