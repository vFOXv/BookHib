package com.rw.repository;


import com.rw.models.Owner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OwnerJPA extends JpaRepository<Owner, Integer> {
    Owner getOwnerById(Integer id);
}
