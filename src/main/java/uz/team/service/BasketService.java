package uz.team.service;

import uz.team.dao.BasketDAO;
import uz.team.domain.Basket;

public class BasketService extends Service<BasketDAO>{

    protected BasketService(BasketDAO dao) {
        super(dao);
    }
}
