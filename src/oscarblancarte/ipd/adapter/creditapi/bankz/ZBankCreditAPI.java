package oscarblancarte.ipd.adapter.creditapi.bankz;

/**
 *
 * @author ronny
 */
public class ZBankCreditAPI {
    
    public ZBankCreditResponse sendCreditRequest(ZBankCreditRequest request){
        ZBankCreditResponse response =new ZBankCreditResponse();
        if(request.getMontoSolicitado() <= 5000){
            response.setRespuesta("VERDADERO");
        }else{
            response.setRespuesta("MONTO SOLICITADO MAYOR A 5000");
        }
        return response;
    }
    
}
