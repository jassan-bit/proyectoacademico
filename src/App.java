import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class App {
    public static void main(String[] args) throws Exception {
        String jdbcUrl = "jdbc:sqlite:‪‪‪C:\\DB\\ProyectosConstruccion.db";
        try{
            Connection conexion = DriverManager.getConnection(jdbcUrl);
            String sql = "select * from Lider";
            Statement stm = conexion.createStatement();
            ResultSet response = stm.executeQuery(sql);
            while(response.next()){
                Integer id = response.getInt("ID_Lider");
                String nombre = response.getString("Nombre");
                String primerApellido = response.getString("Primer_Apellido");
                Integer salario = response.getInt("Salario");
                String ciudadResidencia = response.getString("Ciudad_Residencia");
                System.out.println (id+" "+nombre+" "+primerApellido+" "+salario+" "+ciudadResidencia);
            }
        }catch(Exception e){
                System.out.println("ERROR EN LA CONEXION A LA BASE DE DATOS");
                System.out.print(e.getMessage());
    
            }
        
    }
}




