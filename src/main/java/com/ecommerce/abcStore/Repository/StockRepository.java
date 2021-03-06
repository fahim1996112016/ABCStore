package com.ecommerce.abcStore.Repository;

import com.ecommerce.abcStore.Model.Stock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface StockRepository extends JpaRepository<Stock,Long> {
    Stock findStockByProductId(long id);
}
