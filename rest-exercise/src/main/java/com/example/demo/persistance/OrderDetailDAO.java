package com.example.demo.persistance;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.OrderDetailDO;

@Repository
public interface OrderDetailDAO extends JpaRepository<OrderDetailDO, Long>{

	@Query("SELECT o FROM OrderDetailDO o WHERE o.order.id= :id")
	List<OrderDetailDO> findDetailsByOrderId(Long id);
}
