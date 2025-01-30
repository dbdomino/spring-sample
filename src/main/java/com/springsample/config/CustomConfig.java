/** @Date 25.01.30
 * @Auth minod
 *  CustomConfig   프로필에 맞춰 Custom 에 들어있는 값을 가져옴.
 */
package com.springsample.config;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.context.properties.bind.ConstructorBinding;
import org.springframework.context.annotation.Configuration;

@ConfigurationProperties(prefix = "custom")  // main에 @ConfigurationPropertiesScan  있어야 허용
@Getter
@RequiredArgsConstructor  // setter주입 안하기위해 이거사용
public class CustomConfig {
    private final String appName;
    private final String apiKey;
    private final boolean featureFlag;
}
