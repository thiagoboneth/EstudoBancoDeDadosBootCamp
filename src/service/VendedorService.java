package service;

import dao.VendedorPersistence;
import entity.Vendedor;

import java.util.concurrent.ThreadLocalRandom;

public class VendedorService {

    private VendedorPersistence vendedorPersistence;

    public VendedorService(VendedorPersistence vendedorPersistence) {
        this.vendedorPersistence = vendedorPersistence;
    }

    private String codigoUnico(){
        return "MLB" + ThreadLocalRandom.current().nextInt(100,999);
    }

    public void salva(Vendedor vendedor){
        if (vendedor.getCodigo()==null || vendedor.getCodigo().isEmpty()){
            vendedor.setCodigo(codigoUnico());
            vendedorPersistence.cadastraVendedor(vendedor);
        }else {
            Vendedor vendedorExistente = vendedorPersistence.get(vendedor.getCodigo());
            if(vendedorExistente == null){
                throw new RuntimeException("Algo de muito errado aconteceu");
            }
            vendedorExistente.setCidade(vendedor.getCidade());
            vendedorExistente.setCpf(vendedor.getCpf());
            vendedorExistente.setEndereco(vendedor.getEndereco());
            vendedorExistente.setNome(vendedor.getNome());
            vendedorExistente.setUf(vendedor.getUf());
            vendedorPersistence.atualiza(vendedorExistente);
        }
    }
}
