package com.team.cobi.purchase.repository;

import com.team.cobi.sales.entity.Client;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PurchaseClientRepository extends JpaRepository<Client, String> {

    Page<Client> findByDeleteFlagFalse(Pageable pageable);

    List<Client> findByDeleteFlagFalse();

    List<Client> findByDeleteFlagFalseAndType(String type);


}