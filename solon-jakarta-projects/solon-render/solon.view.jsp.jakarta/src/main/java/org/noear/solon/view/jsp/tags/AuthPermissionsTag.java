package org.noear.solon.view.jsp.tags;

import org.noear.solon.Utils;
import org.noear.solon.auth.AuthUtil;
import org.noear.solon.auth.annotation.Logical;

import jakarta.servlet.jsp.JspException;
import jakarta.servlet.jsp.tagext.TagSupport;

/**
 * @author noear
 * @since 1.4
 */
public class AuthPermissionsTag extends TagSupport {
    @Override
    public int doStartTag() throws JspException {
        String nameStr = name;
        String logicalStr = logical;

        if (Utils.isEmpty(nameStr)) {
            return super.doStartTag();
        }

        String[] names = nameStr.split(",");

        if (names.length == 0) {
            return super.doStartTag();
        }


        if (AuthUtil.verifyPermissions(names, Logical.of(logicalStr))) {
            return TagSupport.EVAL_BODY_INCLUDE;
        } else {
            return super.doStartTag();
        }
    }


    String name;
    String logical;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogical() {
        return logical;
    }

    public void setLogical(String logical) {
        this.logical = logical;
    }
}
