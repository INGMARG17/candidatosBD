package co.edu.itc.programacion2.PruebaBD.negocio;

import co.edu.itc.programacion2.PruebaBD.vo.CandidatoVO;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CandidatoDAO {

    public Connection conexion;
    /**
     * nombre del usuario para conectarse a la base de datos.
     */
    private String usuario;
    /**
     * clave de conexi?n a la base de datos.
     */
    private String clave;
    /**
     * URL al cual se debe conectar para acceder a la base de datos.
     */
    private String cadenaConexion;

    public CandidatoDAO() {
        inicializar();
    }

    public void inicializar() {
        try {
            cadenaConexion = "jdbc:mysql://localhost:3306/itc";
            usuario = "root";
            clave = "admin";
            final String driver = "com.mysql.cj.jdbc.Driver";
            Class.forName(driver);

        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }

    public void establecerConexion() {
        try {
            conexion = DriverManager.getConnection(cadenaConexion, usuario, clave);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void cerrarConexion() {
        try {
            conexion.close();
            conexion = null;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public CandidatoVO ingresarCandidato(CandidatoVO e) {
        CandidatoVO objEst = null;
        establecerConexion();
        PreparedStatement ps = null;
        try {
            ps = conexion.prepareStatement("INSERT INTO itc.candidato VALUES(?, ?, ?, ?, ?, ?)");
            ps.setInt(1, e.getCodigoCandidato());
            ps.setString(2, e.getNombre());
            ps.setString(3, e.getApellidos());
            ps.setString(4, e.getNombreAcudiente());
            ps.setString(5, e.getTelefonoAcudiente());
            ps.setString(6, e.getGradoAIngresar());

            ps.executeUpdate();
            objEst = e;
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                ps.close();
                cerrarConexion();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }

        return objEst;
    }

    public List<CandidatoVO> listarCandidatos() {
        List<CandidatoVO> misCandidatos = new ArrayList<CandidatoVO>();
        CandidatoVO objCandidato;
        ResultSet resultados = null;
        establecerConexion();
        try {

            resultados = conexion.createStatement().executeQuery("SELECT * FROM itc.candidato");

            while (resultados.next()) {
                Integer codigo = resultados.getInt(1);
                String nombre = resultados.getString(2);
                String apellido = resultados.getString(3);
                String nomAcudiente = resultados.getString(4);
                String telAcudiente = resultados.getString(5);
                String gradoIn = resultados.getString(6);
                objCandidato = new CandidatoVO(codigo, nombre, apellido, nomAcudiente, telAcudiente, gradoIn);
                misCandidatos.add(objCandidato);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                resultados.close();
                cerrarConexion();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        return misCandidatos;

    }

    public CandidatoVO candidatoFindByCodigo(int codigo) {

        CandidatoVO objCandidato = null;
        ResultSet resultados = null;
        establecerConexion();
        try {

            resultados = conexion.createStatement().executeQuery("SELECT * FROM itc.candidato WHERE codigoCandidato =" + codigo);

            while (resultados.next()) {
                Integer cod = resultados.getInt(1);
                String nombre = resultados.getString(2);
                String apellido = resultados.getString(3);
                String nomAcudiente = resultados.getString(4);
                String telAcudiente = resultados.getString(5);
                String gradoIn = resultados.getString(6);
                objCandidato = new CandidatoVO(cod, nombre, apellido, nomAcudiente, telAcudiente, gradoIn);

            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                resultados.close();
                cerrarConexion();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        return objCandidato;
    }

    public void actualizarCandidato(CandidatoVO e) {
        establecerConexion();
        PreparedStatement stm = null;

        try {
            stm = conexion.prepareStatement("UPDATE candidato SET codigoCandidato=?, "
                    + "nombre=?, apellidos=?, nombreAcudiente=?, telefonoAcudiente=?, gradoAIngresar=? WHERE codigoCandidato=?");
            stm.setInt(1, e.getCodigoCandidato());
            stm.setString(2, e.getNombre());
            stm.setString(3, e.getApellidos());
            stm.setString(4, e.getNombreAcudiente());
            stm.setString(5, e.getTelefonoAcudiente());
            stm.setString(6, e.getGradoAIngresar());
            stm.setInt(7, e.getCodigoCandidato());
            stm.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            if (conexion != null) {
                try {
                    cerrarConexion();
                    stm.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        }
    }
    
    public void eliminiarEstudiante (CandidatoVO e) {
        establecerConexion();
        PreparedStatement stm = null;

        try {
            stm = conexion.prepareStatement("DELETE FROM itc.candidato WHERE codigoCandidato = ?");
            stm.setInt(1, e.getCodigoCandidato());
            stm.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            if (conexion != null) {
                try {
                    cerrarConexion();
                    stm.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        }
    }
}
