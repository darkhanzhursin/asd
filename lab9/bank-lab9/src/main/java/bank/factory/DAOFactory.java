package bank.factory;

import bank.dao.IAccountDAO;

public interface DAOFactory {
    IAccountDAO getAccountDAO();
}
