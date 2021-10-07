import dao.VendedorPersistence;
import entity.Vendedor;
import service.VendedorService;

public class Main {


    public static void main(String[] args) {
        cadastraVendedor();

    }

    private static void cadastraVendedor() {
        VendedorPersistence vendedorPersistence = new VendedorPersistence();
        VendedorService service = new VendedorService(vendedorPersistence);
        Vendedor vendedor = new Vendedor("741.258.963-15", "ISMAEL", "RUA F", "SC", "FLORIANOPOLIS");
        service.salva(vendedor);
    }
}
