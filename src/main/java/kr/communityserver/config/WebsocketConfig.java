package kr.communityserver.config;

import kr.communityserver.Handler.WebsocketHandler;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.WebSocketHandler;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;

@RequiredArgsConstructor
@Configuration
@EnableWebSocket
public class WebsocketConfig  implements WebSocketConfigurer {
    private final WebsocketHandler websocketHandler;
    @Override
    public void registerWebSocketHandlers(WebSocketHandlerRegistry registry) {
      //  registry.addHandler((WebSocketHandler) websocketHandler, "/ws/chat").setAllowedOrigins("*");
        // handler 등록,   js에서 new Websocket할 때 경로 지정
        //다른 url에서도 접속할 수있게(CORS방지)
        registry.addHandler(websocketHandler, "/chattings").setAllowedOrigins("*");
    }
}
