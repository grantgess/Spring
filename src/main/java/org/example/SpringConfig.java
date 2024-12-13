package org.example;

import org.springframework.context.annotation.*;

import java.util.List;

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
    public List<Music> musicList() {
        return List.of(rockMusic(), classicalMusic());
    }
    @Bean
    public MusicPlayer musicPlayer() {
        return new MusicPlayer(musicList());
    }
}
