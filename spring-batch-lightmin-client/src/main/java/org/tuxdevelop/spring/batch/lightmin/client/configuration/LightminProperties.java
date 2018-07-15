package org.tuxdevelop.spring.batch.lightmin.client.configuration;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties(prefix = "spring.batch.lightmin.server")
public class LightminProperties {

    private String[] url;
    private String apiApplicationsPath = "api/applications";
    private Long period = 10000L;
    private String username;
    private String password;
    private boolean autoDeregistration;
    private boolean autoRegistration = true;
    private boolean registerOnce = true;

    public String[] getLightminUrl() {
        final String[] adminUrls;
        if (this.url != null) {
            adminUrls = this.url.clone();
        } else {
            adminUrls = new String[]{};
        }
        return adminUrls;
    }
}
