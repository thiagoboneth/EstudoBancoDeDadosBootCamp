package dao;

import entity.Vendedor;
import util.BancoDeDados;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class VendedorPersistence {

    private Connection cnx;

    public VendedorPersistence(){
        try {
        cnx = BancoDeDados.getConnection();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    public void cadastraVendedor(Vendedor vendedor){
        try {
            PreparedStatement ps = cnx.prepareStatement("insert into vendedores (codigo, cpf , nome, endereco, uf, cidade)" + "values (?,?,?,?,?,?)");
            ps.setString(1, vendedor.getCodigo());
            ps.setString(2, vendedor.getCpf());
            ps.setString(3, vendedor.getNome());
            ps.setString(4, vendedor.getEndereco());
            ps.setString(5, vendedor.getUf());
            ps.setString(6, vendedor.getCidade());
            ps.execute();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public Vendedor get(String codigo) {

        try {
            PreparedStatement ps = cnx.prepareStatement("select * from vendedores where codigo = ?");
            ps.setString(1, codigo);
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                return new Vendedor(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void atualiza(Vendedor vendedor) {
        try {
            PreparedStatement ps = cnx.prepareStatement("update vendedores set cpf = ?, nome = ?, endereco = ?, uf = ?, cidade = ? where codigo = ?");
            ps.setString(1, vendedor.getCpf());
            ps.setString(2, vendedor.getNome());
            ps.setString(3, vendedor.getEndereco());
            ps.setString(4, vendedor.getUf());
            ps.setString(5, vendedor.getCidade());
            ps.setString(6, vendedor.getCodigo());
            ps.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
