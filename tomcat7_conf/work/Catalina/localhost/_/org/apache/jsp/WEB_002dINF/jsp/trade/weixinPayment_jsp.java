/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.64
 * Generated at: 2017-02-13 02:55:48 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp.trade;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class weixinPayment_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
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
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width,initial-scale=1.0,user-scalable=0\"/>\r\n");
      out.write("  <meta name=\"apple-mobile-web-app-capable\" content=\"yes\"/>\r\n");
      out.write("  <meta name=\"apple-mobile-web-app-status-bar-style\" content=\"black\">\r\n");
      out.write("  <meta name=\"format-detection\" content=\"telephone=no\"/>\r\n");
      out.write("  <meta name=\"format-detection\" content=\"email=no\"/>\r\n");
      out.write("    <title>微信支付</title>\r\n");
      out.write("  <script src=\"/js/jquery.js?v=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${version}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\"></script>\r\n");
      out.write("    <script>\r\n");
      out.write("      //调用微信JS api 支付\r\n");
      out.write("      function jsApiCall(){\r\n");
      out.write("        WeixinJSBridge.invoke(\r\n");
      out.write("                'getBrandWCPayRequest',\r\n");
      out.write("                {\r\n");
      out.write("                  \"appId\" : \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${appId}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\",     //公众号名称，由商户传入\r\n");
      out.write("                  \"timeStamp\":\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${paytimestamp}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\",         //时间戳，自1970年以来的秒数\r\n");
      out.write("                  \"nonceStr\" : \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${paynonceStr}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\", //随机串\r\n");
      out.write("                  \"package\" : \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${paypackage}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\",\r\n");
      out.write("                  \"signType\" : \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${paysignType}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\",         //微信签名方式:\r\n");
      out.write("                  \"paySign\" : \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${paySign}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" //微信签名\r\n");
      out.write("                },\r\n");
      out.write("        function(res){\r\n");
      out.write("          //alert(res.err_code+\"|\"+res.err_desc+\"|\"+res.err_msg);\r\n");
      out.write("          //WeixinJSBridge.log(res.err_msg);\r\n");
      out.write("          if (res.err_msg == \"get_brand_wcpay_request:ok\") {\r\n");
      out.write("              document.location.href='/payment/weixin/return.do?billId=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${billId}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("&status=ok';\r\n");
      out.write("          }else if(res.err_msg==\"get_brand_wcpay_request:cancel\"||res.err_msg=='get_brand_wcpay_request:fail'){\r\n");
      out.write("            document.location.href='/payment/weixin/return.do?billId=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${billId}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("&status=fail';\r\n");
      out.write("          }\r\n");
      out.write("        }\r\n");
      out.write("      );\r\n");
      out.write("      }\r\n");
      out.write("\r\n");
      out.write("      function callpay(){\r\n");
      out.write("        if (typeof WeixinJSBridge == \"undefined\"){\r\n");
      out.write("          if( document.addEventListener ){\r\n");
      out.write("            document.addEventListener('WeixinJSBridgeReady', jsApiCall, false);\r\n");
      out.write("          }else if (document.attachEvent){\r\n");
      out.write("            document.attachEvent('WeixinJSBridgeReady', jsApiCall);\r\n");
      out.write("            document.attachEvent('onWeixinJSBridgeReady', jsApiCall);\r\n");
      out.write("          }\r\n");
      out.write("        }else{\r\n");
      out.write("          jsApiCall();\r\n");
      out.write("        }\r\n");
      out.write("      }\r\n");
      out.write("      $(function(){\r\n");
      out.write("        callpay();\r\n");
      out.write("      });\r\n");
      out.write("    </script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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
}
