package oscarblancarte.ipd.adapter.creditapi.bankz;

/**
 *
 * @author ronny
 */
public class ZBankCreditRequest {
    
    private String nombreCliente;
    private double montoSolicitado;

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public double getMontoSolicitado() {
        return montoSolicitado;
    }

    public void setMontoSolicitado(double montoSolicitado) {
        this.montoSolicitado = montoSolicitado;
    }
    
    
    
}
