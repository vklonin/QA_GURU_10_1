package configuration;

import org.aeonbits.owner.Config;

public interface SimpleConfig extends Config {

    @Key("baseURL")
    String getBaseURL();

}
