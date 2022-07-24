/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oscarblancarte.ipd.adapter.impl;

import oscarblancarte.ipd.adapter.creditapi.bankz.ZBankCreditAPI;
import oscarblancarte.ipd.adapter.creditapi.bankz.ZBankCreditRequest;
import oscarblancarte.ipd.adapter.creditapi.bankz.ZBankCreditResponse;

/**
 *
 * @author ronny
 */
public class ZBankCreditAdapter implements IBankAdapter {
    
    @Override
    public BankCreditResponse sendCreditRequest(BankCreditRequest request) {
        
        ZBankCreditRequest zrequest = new ZBankCreditRequest();
        zrequest.setNombreCliente(request.getCustomer());
        zrequest.setMontoSolicitado(request.getAmount());
        
        ZBankCreditAPI api = new ZBankCreditAPI();
        ZBankCreditResponse zresponse = api.sendCreditRequest(zrequest);
        
        BankCreditResponse response = new BankCreditResponse();
        response.setApproved(zresponse.getRespuesta() == "VERDADERO" ? true : false);
        return response;
    }
    
}
