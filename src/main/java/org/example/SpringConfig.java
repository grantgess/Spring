package org.example;

import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("org.example")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {
    @Bean
    @Scope("prototype")
    public ClassicalMusic classicalMusic() {
        return new ClassicalMusic();
    }
    @Bean
    public RockMusic rockMusic() {
        return new RockMusic();
    }
    @Bean
    public MusicPlayer musicPlayer() {
        return new MusicPlayer(classicalMusic(),rockMusic());
    }
}
