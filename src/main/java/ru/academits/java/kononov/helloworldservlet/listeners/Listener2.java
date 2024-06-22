package ru.academits.java.kononov.helloworldservlet.listeners;

import jakarta.servlet.ServletRequestEvent;
import jakarta.servlet.ServletRequestListener;

public class Listener2 implements ServletRequestListener {
    @Override
    public void requestDestroyed(ServletRequestEvent sre) {
        System.out.println("Request has been processed");
    }

    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        System.out.println("Request has come");
    }
}
