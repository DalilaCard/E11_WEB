package com.upiiz.SecurityDataBase.repository;

import com.upiiz.SecurityDataBase.entities.RolEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RolRepository extends CrudRepository<RolEntity, Long> {

}
