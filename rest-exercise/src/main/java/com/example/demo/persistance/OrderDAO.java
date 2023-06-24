package com.example.demo.persistance;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.OrderDO;

@Repository
public interface OrderDAO extends JpaRepository<OrderDO, Long>{

}
