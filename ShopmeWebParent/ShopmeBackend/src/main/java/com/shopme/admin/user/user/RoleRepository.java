package com.shopme.admin.user.user;

import org.springframework.data.repository.CrudRepository;
import com.shopme.common.entity.Role;
import org.springframework.stereotype.Repository;


@Repository
public interface RoleRepository extends CrudRepository<Role,Integer>{

}
