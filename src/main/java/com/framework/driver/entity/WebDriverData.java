package com.framework.driver.entity;

import com.framework.enums.BrowserRemoteModeType;
import com.framework.enums.BrowserType;
import com.framework.enums.RunModeType;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class WebDriverData {

    private BrowserType browserType;
    private BrowserRemoteModeType browserRemoteModeType;
    private RunModeType runModeType;
}
