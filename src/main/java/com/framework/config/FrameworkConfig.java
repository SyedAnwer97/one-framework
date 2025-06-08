package com.framework.config;

import com.framework.converters.StringToBrowserConverter;
import com.framework.converters.StringToBrowserRemoteModeTypeConverter;
import com.framework.converters.StringToRunModeBrowserTypeConverter;
import com.framework.converters.StringToURLConverter;
import com.framework.enums.BrowserRemoteModeType;
import com.framework.enums.BrowserType;
import com.framework.enums.RunModeBrowserType;
import org.aeonbits.owner.Config;

import java.net.URL;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "system:properties",
        "system:env",
        "file:${user.dir}/src/test/resources/config.properties"
})

public interface FrameworkConfig extends Config {

    @DefaultValue("CHROME")
    @ConverterClass(StringToBrowserConverter.class)
    BrowserType browser();

    @Key("runModeBrowser")
    @ConverterClass(StringToRunModeBrowserTypeConverter.class)
    RunModeBrowserType browserRunMode();

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
    @ConverterClass(StringToBrowserRemoteModeTypeConverter.class)
    BrowserRemoteModeType mobileRemoteMode();

    @Key("runModeMobile")
    @ConverterClass(StringToRunModeBrowserTypeConverter.class)
    RunModeBrowserType runModeMobile();
}
