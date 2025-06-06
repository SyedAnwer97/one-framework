package com.framework.config;

import com.framework.converters.StringToURLConverter;
import org.aeonbits.owner.Config;

import java.net.URL;

public interface BrowserStackConfig extends Config {

    @Key("username")
    String userName();

    String key();

    @DefaultValue("https://${userName}:$key@hub-cloud.browserstack.com/wd/hub")
    @ConverterClass(StringToURLConverter.class)
    URL browserStackURL();
}