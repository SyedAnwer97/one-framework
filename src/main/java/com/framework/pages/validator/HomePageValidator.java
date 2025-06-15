package com.framework.pages.validator;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class HomePageValidator {
    private String headerName;
    private Boolean isUpgradeDisplayed;
    private String logoSourceString;
}
