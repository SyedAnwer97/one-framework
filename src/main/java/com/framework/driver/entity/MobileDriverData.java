package com.framework.driver.entity;

import com.framework.enums.MobilePlatformType;
import com.framework.enums.MobileRemoteModeType;
import com.framework.enums.RunModeType;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class MobileDriverData {
    private MobilePlatformType mobilePlatformType;
    private MobileRemoteModeType mobileRemoteModeType;
    private RunModeType runModeType;
}
