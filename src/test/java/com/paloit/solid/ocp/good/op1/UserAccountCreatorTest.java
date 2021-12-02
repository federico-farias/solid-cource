package com.paloit.solid.ocp.good.op1;

import com.paloit.solid.ocp.good.op1.impl.UserAccountRepositoryMongoImpl;
import com.paloit.solid.ocp.good.op1.impl.UserAccountRepositoryMySqlImpl;
import org.junit.jupiter.api.Test;

class UserAccountCreatorTest {

    @Test
    void create() {
        //UserAccountCreator creator = new UserAccountCreator(new UserAccountRepositoryMySqlImpl());
        UserAccountCreator creator = new UserAccountCreator(new UserAccountRepositoryMongoImpl());
        creator.create(new ClassDummy());
    }
}