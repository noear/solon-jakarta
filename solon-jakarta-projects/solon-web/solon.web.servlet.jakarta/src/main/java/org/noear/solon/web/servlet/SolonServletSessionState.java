package org.noear.solon.web.servlet;

import org.noear.solon.core.handle.SessionState;

import jakarta.servlet.http.HttpServletRequest;

import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;

/**
 * Servlet，适配为 SessionState 接口
 *
 * @author noear
 * @since 1.6
 */
public class SolonServletSessionState implements SessionState {
    private HttpServletRequest _request;
    public SolonServletSessionState(HttpServletRequest request){
        _request = request;
    }

    @Override
    public String sessionId() {
        return _request.getRequestedSessionId();
    }

    @Override
    public String sessionChangeId() {
        return _request.changeSessionId();
    }

    @Override
    public Collection<String> sessionKeys() {
        return Collections.list(_request.getSession().getAttributeNames());
    }

    @Override
    public <T> T sessionGet(String key, Class<T> clz) {
        return (T)_request.getSession().getAttribute(key);
    }

    @Override
    public void sessionSet(String key, Object val) {
        if (val == null) {
            sessionRemove(key);
        } else {
            _request.getSession().setAttribute(key, val);
        }
    }

    @Override
    public void sessionRemove(String key) {
        _request.getSession().removeAttribute(key);
    }

    @Override
    public void sessionClear() {
        Enumeration<String> names = _request.getSession().getAttributeNames();
        while (names.hasMoreElements()) {
            _request.getSession().removeAttribute(names.nextElement());
        }
    }

    @Override
    public void sessionReset() {
        _request.getSession().invalidate();
    }
}
