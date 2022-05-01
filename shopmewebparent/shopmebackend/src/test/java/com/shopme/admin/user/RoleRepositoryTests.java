package com.shopme.admin.user;

import com.shopme.common.entity.Role;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class RoleRepositoryTests {

    @Autowired
    private RoleRepository repository;

    @Test
    public void testCreateFirstRole(){
        FakeRole roleAdmin = new FakeRole("Admin");
        FakeRole saveRole = repository.save(roleAdmin);


    }
}
