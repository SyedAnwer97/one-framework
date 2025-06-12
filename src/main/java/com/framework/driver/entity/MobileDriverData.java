package com.framework.driver.entity;

import com.framework.enums.MobilePlatformType;
import com.framework.enums.MobileRemoteModeType;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class MobileDriverData {
    private MobilePlatformType mobilePlatformType;
    private MobileRemoteModeType mobileRemoteModeType;
}
