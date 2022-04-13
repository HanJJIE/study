package top.hanjie.security.jwt;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties(prefix = "jwt")
public class JwtProperties {

    /**
     * 密匙
     */
    private String secretKey = "SECRET_KEY";

    /**
     * 过期时间（默认一天）
     */
    private Long expirationTime = 3600L * 24;

    /**
     * 令牌前缀
     */
    private String prefix = "secret=";

}