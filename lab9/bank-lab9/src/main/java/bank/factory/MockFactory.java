package bank.factory;

import bank.dao.IAccountDAO;
import bank.dao.MockAccountDAO;

public class MockFactory implements DAOFactory {

    @Override
    public IAccountDAO getAccountDAO() {
        return new MockAccountDAO();
    }
}
