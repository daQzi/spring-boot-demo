package com.xkcoding.websocket.handler;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.WebSocketHandler;
import org.springframework.web.socket.WebSocketMessage;
import org.springframework.web.socket.WebSocketSession;

/**
 * <p>
 * 消息事件处理
 * </p>
 *
 * @package: com.xkcoding.websocket.socketio.handler
 * @description: 消息事件处理
 * @author: wangzw
 * @date: Created in 2018-12-18 18:57
 * @copyright: Copyright (c) 2018
 * @version: V1.0
 * @modified: wangzw
 */
@Component
@Slf4j
public class MessageEventHandler implements WebSocketHandler {

    /**
     * 建立连接后触发的回调
     * @param webSocketSession
     * @throws Exception
     */
    @Override
    public void afterConnectionEstablished(WebSocketSession webSocketSession) throws Exception {
        log.info("建立 连接");
    }

    /**
     * 收到消息时触发的回调
     * @param webSocketSession
     * @param webSocketMessage
     * @throws Exception
     */
    @Override
    public void handleMessage(WebSocketSession webSocketSession, WebSocketMessage<?> webSocketMessage) throws Exception {
        log.info("触发 消息");
    }

    /**
     *
     * @param webSocketSession
     * @param throwable
     * @throws Exception
     */
    @Override
    public void handleTransportError(WebSocketSession webSocketSession, Throwable throwable) throws Exception {
        log.info("处理 错误");
    }

    @Override
    public void afterConnectionClosed(WebSocketSession webSocketSession, CloseStatus closeStatus) throws Exception {
        log.info("关闭 连接");
    }

    @Override
    public boolean supportsPartialMessages() {
        log.info("支持 分片 发送");
        return false;
    }
}
