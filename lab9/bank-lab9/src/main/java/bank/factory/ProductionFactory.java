package bank.factory;

import bank.dao.AccountDAO;
import bank.dao.IAccountDAO;

public class ProductionFactory implements DAOFactory {

    @Override
    public IAccountDAO getAccountDAO() {
        return new AccountDAO();
    }
}
