package org.noear.solon.web.servlet;

import org.noear.solon.Solon;
import org.noear.solon.core.handle.Context;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

/**
 * Servlet Handler，适配为 Solon 入口
 *
 * @author noear
 * @since 1.2
 * */
public class SolonServletHandler extends HttpServlet {

    protected void preHandle(Context ctx) {

    }

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        SolonServletContext ctx = new SolonServletContext(request, response);
        ctx.contentType("text/plain;charset=UTF-8");

        preHandle(ctx);

        Solon.app().tryHandle(ctx);

        if(ctx.innerIsAsync() == false){
            ctx.innerCommit();
        }
    }
}
