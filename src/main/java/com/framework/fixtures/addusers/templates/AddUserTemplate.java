package com.framework.fixtures.addusers.templates;

import br.com.six2six.fixturefactory.Fixture;
import br.com.six2six.fixturefactory.Rule;
import br.com.six2six.fixturefactory.loader.TemplateLoader;
import com.framework.fixtures.addusers.entity.UserData;
import com.github.javafaker.Faker;

public class AddUserTemplate implements TemplateLoader {

    @Override
    public void load() {
        Fixture.of(UserData.class).addTemplate("valid", new Rule() {{
            add("userRole", random("ESS", "Admin"));
            add("employeeName", uniqueRandom("Ravi M B", "Ranga  Akunuri", "Thomas Kutty Benny"));
            add("roleStatus" , random("Enabled", "Disabled"));
            add("userName", new Faker().name().username());
            add("password", "Str0ngPa55W0rd!!");
            add("message", "success message is not displayed");
        }});

        Fixture.of(UserData.class).addTemplate("just_employeename", new Rule() {{
            add("employeeName", new Faker().name().username());
            add("message", "error message is not displayed");
        }});
    }

}
