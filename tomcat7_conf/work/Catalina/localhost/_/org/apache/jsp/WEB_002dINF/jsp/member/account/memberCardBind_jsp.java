/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.64
 * Generated at: 2017-02-15 08:40:01 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp.member.account;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.ms.framework.util.Config;
import java.util.*;

public final class memberCardBind_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(5);
    _jspx_dependants.put("/WEB-INF/tags/base.tld", Long.valueOf(1471439204000L));
    _jspx_dependants.put("/WEB-INF/jsp/member/account/../../pub/tags.inc", Long.valueOf(1471439204000L));
    _jspx_dependants.put("/WEB-INF/tags/h5.tld", Long.valueOf(1471439204000L));
    _jspx_dependants.put("/WEB-INF/tags/c.tld", Long.valueOf(1471439204000L));
    _jspx_dependants.put("/WEB-INF/jsp/member/account/../../pub/head.inc", Long.valueOf(1486632866000L));
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fh5_005fnavigation_0026_005ftitle_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fh5_005fnavigation_0026_005ftitle_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fh5_005fnavigation_0026_005ftitle_005fnobody.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<head>\r\n");
      out.write("  ");
      out.write('\r');
      out.write('\n');

    request.setAttribute("version","2.5");
    request.setAttribute("STATIC_SERVER", Config.getValue("uploadDomain"));
    request.setAttribute("DOMAIN",Config.getValue("domain"));

      out.write("\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width,initial-scale=1.0,user-scalable=0\"/>\r\n");
      out.write("<meta name=\"apple-mobile-web-app-capable\" content=\"yes\"/>\r\n");
      out.write("<meta name=\"apple-mobile-web-app-status-bar-style\" content=\"black\">\r\n");
      out.write("<meta name=\"format-detection\" content=\"telephone=no\"/>\r\n");
      out.write("<meta name=\"format-detection\" content=\"email=no\"/>\r\n");
      out.write("<link href=\"/css/effect.css?v=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${version}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" rel=\"stylesheet\">\r\n");
      out.write("<link href=\"/css/base.css?v=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${version}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" rel=\"stylesheet\"/>\r\n");
      out.write("<link href=\"/css/xhw.css?v=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${version}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" rel=\"stylesheet\"/>\r\n");
      out.write("<link href=\"/css/mycenter.css?v=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${version}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" rel=\"stylesheet\"/>\r\n");
      out.write("<script src=\"/js/jquery.js?v=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${version}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\"></script>\r\n");
      out.write("<script src=\"/js/base-util.js?v=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${version}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("  <title>会员卡绑定</title>\r\n");
      out.write("\r\n");
      out.write("  <script>\r\n");
      out.write("    $(function(){\r\n");
      out.write("      $(\"#bindSubmit\").click(function(){\r\n");
      out.write("          if(isEmpty($(\"#vmember_card_id\").val())){\r\n");
      out.write("            $.messager.alert(\"提示\",\"会员卡号不能为空!\");\r\n");
      out.write("            return false;\r\n");
      out.write("          }\r\n");
      out.write("          if(isEmpty($(\"#passwaord\").val())){\r\n");
      out.write("            $.messager.alert(\"提示\",\"会员卡密码不能为空!\");\r\n");
      out.write("            return false;\r\n");
      out.write("          }\r\n");
      out.write("\r\n");
      out.write("          Tools.ajax(\"/member/card/bind.do\",\"memberBindFrom\",function(data){\r\n");
      out.write("              if(data.result){\r\n");
      out.write("                  $.messager.alert(\"提示\",\"会员卡绑定成功!\",function(){\r\n");
      out.write("                      Tools.forward(\"/member/center.do\");\r\n");
      out.write("                  });\r\n");
      out.write("              } else {\r\n");
      out.write("                  if(data.msgCode == \"MER0001\") {\r\n");
      out.write("                      $.messager.alert(\"提示\",\"会员卡号或密码不对，请核实! 错误代码[\"+data.msgCode+\"]\");\r\n");
      out.write("                  } else if(data.msgCode == \"MER0002\") {\r\n");
      out.write("                      $.messager.alert(\"提示\",\"不允许进行降级操作! 错误代码[\"+data.msgCode+\"]\");\r\n");
      out.write("                  } else if(data.msgCode == \"MER0003\") {\r\n");
      out.write("                      $.messager.alert(\"提示\",\"新注册用户不允许绑定新注册用户级别的会员卡! 错误代码[\"+data.msgCode+\"]\");\r\n");
      out.write("                  } else if(data.msgCode == \"MER0004\") {\r\n");
      out.write("                      $.messager.alert(\"提示\",\"该用户已绑定相对应等级的会员卡! 错误代码[\"+data.msgCode+\"]\");\r\n");
      out.write("                  } else if(data.msgCode == \"MER0005\") {\r\n");
      out.write("                      $.messager.alert(\"提示\",\"该会员卡未绑定合作伙伴，请绑定! 错误代码[\"+data.msgCode+\"]\");\r\n");
      out.write("                  }else if(data.msgCode == \"MER0006\") {\r\n");
      out.write("                      $.messager.alert(\"提示\",\"该卡已绑定成功，无法重新绑定! 错误代码[\"+data.msgCode+\"]\");\r\n");
      out.write("                  } else {\r\n");
      out.write("                      $.messager.alert(\"提示\",\"绑定失败，未知错误代码[\"+data.msgCode+\"]\");\r\n");
      out.write("                  }\r\n");
      out.write("              }\r\n");
      out.write("          });\r\n");
      out.write("      });\r\n");
      out.write("    });\r\n");
      out.write("  </script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<!--头部-->\r\n");
      if (_jspx_meth_h5_005fnavigation_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("<!--头部-->\r\n");
      out.write("<form id=\"memberBindFrom\">\r\n");
      out.write("<!--主体开始-->\r\n");
      out.write("<div class=\"main jihuo_page\">\r\n");
      out.write("  <div class=\"tishi_box\">会员卡只需绑定一次，绑定成功后立即享受会员卡服务。请将会员卡上的编号以及位于灰色图层下的密码输入在下面的信息框中，完成绑定。</div>\r\n");
      out.write("  <div class=\"binding_box\">\r\n");
      out.write("    <ul>\r\n");
      out.write("      <li><span class=\"ico card_ico\"></span> <input id=\"vmember_card_id\" type=\"text\" class=\"text\" name=\"vmember_card_id\" autofocus placeholder=\"会员卡编号\"></li>\r\n");
      out.write("      <li style=\" border:none;\"><span class=\"ico suo_ico\"></span>   <input id=\"passwaord\" type=\"text\" class=\"text\" name=\"passwaord\" placeholder=\"密码\"></li>\r\n");
      out.write("    </ul>\r\n");
      out.write("  </div>\r\n");
      out.write("  <div class=\"btnbox\"><a href=\"#\" class=\"logout\" id=\"bindSubmit\">绑定</a></div>\r\n");
      out.write("</div>\r\n");
      out.write("</form>\r\n");
      out.write("<!--主体结束-->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_h5_005fnavigation_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  h5:navigation
    com.hxh.shop.common.tags.NavigationTag _jspx_th_h5_005fnavigation_005f0 = (com.hxh.shop.common.tags.NavigationTag) _005fjspx_005ftagPool_005fh5_005fnavigation_0026_005ftitle_005fnobody.get(com.hxh.shop.common.tags.NavigationTag.class);
    _jspx_th_h5_005fnavigation_005f0.setPageContext(_jspx_page_context);
    _jspx_th_h5_005fnavigation_005f0.setParent(null);
    // /WEB-INF/jsp/member/account/memberCardBind.jsp(58,0) name = title type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_h5_005fnavigation_005f0.setTitle("会员卡绑定");
    int _jspx_eval_h5_005fnavigation_005f0 = _jspx_th_h5_005fnavigation_005f0.doStartTag();
    if (_jspx_th_h5_005fnavigation_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fh5_005fnavigation_0026_005ftitle_005fnobody.reuse(_jspx_th_h5_005fnavigation_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fh5_005fnavigation_0026_005ftitle_005fnobody.reuse(_jspx_th_h5_005fnavigation_005f0);
    return false;
  }
}
