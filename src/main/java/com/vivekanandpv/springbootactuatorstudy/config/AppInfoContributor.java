package com.vivekanandpv.springbootactuatorstudy.config;

import org.springframework.boot.actuate.info.Info;
import org.springframework.boot.actuate.info.InfoContributor;
import org.springframework.stereotype.Component;

@Component
public class AppInfoContributor implements InfoContributor {
    @Override
    public void contribute(Info.Builder builder) {
        builder
                .withDetail("project_maintained_by_team", "ABC")
                .withDetail("project_maintained_by_person", "John Doe")
                .withDetail("project_contact_person_email", "john@gmail.com");
    }
}
