package control;

import model.entities.*;

import static control.ControlClientType.VALUE_CLIENT_TYPE;
import static model.entities.TableRate.TAX_EASY_ACCOUNT;
import static model.entities.TableRate.TAX_OPEN_ACCOUNT;

public class ControlFunctionInBank {

    public static void FUNCTION_DEPOSIT(Account account, double value){
        StringBuilder deposito = new StringBuilder();

        if ((account.deposit(value))) {
            deposito.append("DEPÓSITO EFETUADO COM SUCESSO!\n");
            deposito.append("VALOR DEPOSITADO: R$" + value +"\n");
            deposito.append("SALDO ATUAL: R$" + account.getAmount() + "\n");
            System.out.println(deposito.toString());
        }

        else{
            deposito.append("ERRO NA TRANFERÊNCIA!");
            if(account instanceof EasyAccount) deposito.append("\nVOCE EXCEDEU O LIMITE PERMITIDO" +
                    " NA CONTA FACIL!\n" +"SALDO ATUAL: " + account.getAmount());

            System.err.println(deposito.toString());
        }
    }

    public static void FUNCTION_WITHDRAW(Account account, double value){

        if(account instanceof Accountant){
            Accountant account1 = (Accountant) account;

            if(account1.withdraw(value)) {
                System.out.println("SAQUE EFETUADO COM SUCESSO!");
                System.out.println();
            }
            else System.err.println("TRANSACAO INDISPONIVEL!");
        }
        else System.err.println("TRANSAÇÃO INDISPONIVEL PARA ESTA CONTA!");
    }

    public static void FUNCTION_YIELD(Account account){

        //Adicionar a funcao de comparar a DATA rendimento ANUAL

        if(account instanceof SavingsAccount) {
            SavingsAccount account1 = (SavingsAccount) account;
            account1.addYield();
        }
    }

    //Funcao cobranca de TAXA da CONTA
    public static void FUNCTION_TAX_ACCOUNT(Account account){
        if(account instanceof Accountant){
            Accountant accountant = (Accountant) account;
            if (account instanceof EasyAccount) accountant.debitTax(TAX_EASY_ACCOUNT);
            else accountant.debitTax(TAX_OPEN_ACCOUNT);
        }
    }

    //TAXA COBRADA POR TIPO DE CLIENTE
    public static void FUNCTION_TAX_CLIENT_TYPE(Account account){
        account.taxClientType(VALUE_CLIENT_TYPE(account));
    }

}