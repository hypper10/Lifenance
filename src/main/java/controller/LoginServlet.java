
package controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import bll.UserAuth;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import models.Session;
import models.exceptions.HashGenerationException;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import util.HashGenerator;

@WebServlet(name = "Login", urlPatterns = {"/authorization/login"})
public class LoginServlet extends HttpServlet {

    private static final Logger logger = LogManager.getLogger(LoginServlet.class);
    private Map<String, Object> map = new HashMap<>();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) {
        try {
            String userCpf = request.getParameter("cpf");
            String userPassword = request.getParameter("password");
            boolean rememberMe = Boolean.parseBoolean(request.getParameter("remember"));
            System.out.println(request.getParameter("remember"));
            UserAuth authorization = new UserAuth(userCpf, userPassword);

            JsonMenssage jsonMenssage = new JsonMenssage(map);

            if (!authorization.validateLogin()) {
                map.put("error", true);
                map.put("text", "Invalid username or password!");
                jsonMenssage.returnJson(response);
            } else {
                HttpSession session = request.getSession();
                session.setAttribute("loggedUser", authorization.getUser());

                if (rememberMe) {
                    Session userSession = new Session();

                    String sessionId = RandomStringUtils.randomAlphanumeric(12);
                    String rawValidator =  RandomStringUtils.randomAlphanumeric(64);
                    String hashedValidator = HashGenerator.generateSHA256(rawValidator);

                    userSession.setSessionId(sessionId);
                    userSession.setValidator(hashedValidator);
                    userSession.setUser(authorization.getUser());

                    authorization.insertSession(userSession);

                    Cookie cookieSelector = new Cookie("session_id", sessionId);
                    Cookie cookieValidator = new Cookie("validator", rawValidator);

                    cookieSelector.setPath("/");
                    cookieValidator.setPath("/");

                    cookieSelector.setMaxAge(604800);
                    cookieValidator.setMaxAge(604800);

                    response.addCookie(cookieSelector);
                    response.addCookie(cookieValidator);
                }
                response.sendRedirect("/lifenance/index.html");
            }
        } catch (IOException | HashGenerationException error) {
            logger.error(error);
        }
    }

}