package com.framework.config;

import com.framework.converters.StringToBrowserConverter;
import com.framework.converters.StringToBrowserRemoteModeTypeConverter;
import com.framework.converters.StringToRunModeBrowserTypeConverter;
import com.framework.enums.BrowserRemoteModeType;
import com.framework.enums.BrowserType;
import com.framework.enums.RunModeBrowserType;
import org.aeonbits.owner.Config;

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
}
