package main;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@FunctionalInterface
public interface MainHandler {
    public String action(HttpServletRequest request, HttpServletResponse response, String cmd);
}
