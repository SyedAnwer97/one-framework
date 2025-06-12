package com.framework.config.converters;

import com.framework.enums.MobileRemoteModeType;
import org.aeonbits.owner.Converter;

import java.lang.reflect.Method;

public class StringToMobileRemoteTypeConverter implements Converter<MobileRemoteModeType> {
    @Override
    public MobileRemoteModeType convert(Method method, String runMode) {
        return MobileRemoteModeType.valueOf(runMode.toUpperCase());
    }
}
