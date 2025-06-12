package com.framework.config;

import com.framework.config.converters.*;
import com.framework.enums.BrowserRemoteModeType;
import com.framework.enums.BrowserType;
import com.framework.enums.MobileRemoteModeType;
import com.framework.enums.RunModeType;
import org.aeonbits.owner.Config;

import java.net.URL;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "system:properties",
        "system:env",
        "file:${user.dir}/src/test/resources/config.properties",
        "file:${user.dir}/src/test/resources/staging.properties",
        "file:${user.dir}/src/test/resources/dev.properties"
})

public interface FrameworkConfig extends Config {

    @DefaultValue("dev")
    String environment();

    @Key("${environment}.webUrl")
    String webUrl();

    @DefaultValue("CHROME")
    @ConverterClass(StringToBrowserConverter.class)
    BrowserType browser();

    @Key("runModeBrowser")
    @ConverterClass(StringToRunModeBrowserTypeConverter.class)
    RunModeType browserRunMode();

    @Key("browserRemoteMode")
    @ConverterClass(StringToBrowserRemoteModeTypeConverter.class)
    BrowserRemoteModeType browserRemoteMode();

    @ConverterClass(StringToURLConverter.class)
    URL seleniumGridURL();

    @ConverterClass(StringToURLConverter.class)
    URL selenoidURL();

    @ConverterClass(StringToURLConverter.class)
    @DefaultValue("http://127.0.0.1:4723")
    URL LocalAppiumServerURL();

    @Key("mobileRemoteMode")
    @ConverterClass(StringToMobileRemoteTypeConverter.class)
    MobileRemoteModeType mobileRemoteMode();

    @Key("runModeMobile")
    @ConverterClass(StringToRunModeBrowserTypeConverter.class)
    RunModeType runModeMobile();
}
