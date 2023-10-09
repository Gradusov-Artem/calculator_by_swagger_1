package com.github.gradusovartem.listeners;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;

/**
 * class OperationListener - слушатель для событий, который считает количество обращений к сервлету
 */

public class OperationListener implements ServletRequestListener {
    private static int requestCount = 0;

    /**
     * method requestDestroyed() вызывается при завершении обработки запроса
     * @param servletRequestEvent
     */
    @Override
    public void requestDestroyed(ServletRequestEvent servletRequestEvent) {

    }

    /**
     * method requestInitialized() вызывается при отправке запроса
     * @param servletRequestEvent
     */
    @Override
    public void requestInitialized(ServletRequestEvent servletRequestEvent) {
        requestCount++;
    }

    /**
     * method getRequestCount() возвращает количество обращений к сервлету
     * @return
     */
    public static int getRequestCount() {
        return requestCount;
    }
}
