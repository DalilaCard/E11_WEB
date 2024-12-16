package com.upiiz.SecurityDataBase.repository;

import com.upiiz.SecurityDataBase.entities.PermissionEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PermissionRepository extends CrudRepository<PermissionEntity, Long> {
}