package com.framework.webtest.users;

import br.com.six2six.fixturefactory.Fixture;
import com.framework.fixtures.addusers.entity.UserData;
import com.framework.pages.pagecomponent.addusers.AddUserComponent;
import lombok.Getter;

import java.util.function.BiPredicate;

@Getter
public enum AddUserScenarioTest {

    VALID(AddUserPredicateFactory.getPredicate("valid"), Fixture.from(UserData.class).gimme("valid")),
    JUST_EMPLOYEE_NAME(AddUserPredicateFactory.getPredicate("justEmployeeName"), Fixture.from(UserData.class).gimme("just_employeename"));

    private final BiPredicate<UserData, AddUserComponent> predicate;
    private final UserData userData;

    AddUserScenarioTest(BiPredicate<UserData, AddUserComponent> predicate, UserData userData) {
        this.predicate = predicate;
        this.userData = userData;
    }
    }
