/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.64
 * Generated at: 2017-02-15 13:00:02 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp.trade;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.ms.framework.util.Config;
import java.util.*;
import com.ms.framework.util.Config;
import com.hxh.shop.common.util.UserContext;

public final class logistics_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(7);
    _jspx_dependants.put("/WEB-INF/tags/base.tld", Long.valueOf(1471439204000L));
    _jspx_dependants.put("/WEB-INF/jsp/trade/../pub/head.inc", Long.valueOf(1486632866000L));
    _jspx_dependants.put("/WEB-INF/tags/h5.tld", Long.valueOf(1471439204000L));
    _jspx_dependants.put("/WEB-INF/tags/c.tld", Long.valueOf(1471439204000L));
    _jspx_dependants.put("/WEB-INF/jsp/trade/../pub/footerNavigation.jsp", Long.valueOf(1477994420000L));
    _jspx_dependants.put("/WEB-INF/jsp/trade/../pub/quickNavigation.jsp", Long.valueOf(1471439204000L));
    _jspx_dependants.put("/WEB-INF/jsp/trade/../pub/tags.inc", Long.valueOf(1471439204000L));
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fh5_005fnavigation_0026_005ftitle_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbs_005fCacheLable_0026_005fcode_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fh5_005fnavigation_0026_005ftitle_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbs_005fCacheLable_0026_005fcode_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fh5_005fnavigation_0026_005ftitle_005fnobody.release();
    _005fjspx_005ftagPool_005fbs_005fCacheLable_0026_005fcode_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.release();
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
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
      out.write("<!DOCTYPE html>\r\n");
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
      out.write("  <title>查看物流</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<!--头部-->\r\n");
      if (_jspx_meth_h5_005fnavigation_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("<!--头部-->\r\n");
      out.write("\r\n");
      out.write("<!--主体开始-->\r\n");
      out.write("<div class=\"main wuliu_page\">\r\n");
      out.write("  <div class=\"ddh_box\">订单号：<span class=\"ddh\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${resultMap.vbill_id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</span> <br> <span class=\"zt\">订单状态：<strong>");
      if (_jspx_meth_bs_005fCacheLable_005f0(_jspx_page_context))
        return;
      out.write("</strong></span></div>\r\n");
      out.write("  <div class=\"h10\"></div>\r\n");
      out.write("  <div class=\"wuliu_ing\">\r\n");
      out.write("    <span class=\"mask1\"></span><span class=\"mask2\"></span>\r\n");
      out.write("    ");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<!--弹出层二级菜单-->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!--弹出层二级菜单-->\r\n");
      out.write("\r\n");
      out.write("<div class=\"dialog tanchu_menu\" id=\"quick_navigation\">\r\n");
      out.write("  <a href=\"javascript:void(0)\" class=\"closebtn\" id=\"quick_navigation_Closebtn\"></a>\r\n");
      out.write("  <nav class=\"qiuck_nav2\">\r\n");
      out.write("    <ul>\r\n");
      out.write("      <li>\r\n");
      out.write("        <a href=\"/shop/home.do\">\r\n");
      out.write("          <dl>\r\n");
      out.write("            <dt class=\"ico_out1\"><span class=\"ico ico1\"></span></dt>\r\n");
      out.write("            <dd>首页</dd>\r\n");
      out.write("          </dl>\r\n");
      out.write("        </a>\r\n");
      out.write("      </li>\r\n");
      out.write("      <li>\r\n");
      out.write("        <a href=\"/goods/category/type.do\">\r\n");
      out.write("          <dl>\r\n");
      out.write("            <dt class=\"ico_out2\"><span class=\"ico ico2\"></span></dt>\r\n");
      out.write("            <dd>分类搜索</dd>\r\n");
      out.write("          </dl>\r\n");
      out.write("        </a>\r\n");
      out.write("      </li>\r\n");
      out.write("      <li>\r\n");
      out.write("        <a href=\"/trade/shopcart/show.do\">\r\n");
      out.write("          <dl>\r\n");
      out.write("            <dt class=\"ico_out3\" ><span class=\"ico ico3\"></span></dt>\r\n");
      out.write("            <dd>购物车</dd>\r\n");
      out.write("          </dl>\r\n");
      out.write("        </a>\r\n");
      out.write("      </li>\r\n");
      out.write("      <li>\r\n");
      out.write("        <a href=\"/member/center.do\">\r\n");
      out.write("          <dl>\r\n");
      out.write("            <dt class=\"ico_out4\"><span class=\"ico ico4\"></span></dt>\r\n");
      out.write("            <dd>我的乡货</dd>\r\n");
      out.write("          </dl>\r\n");
      out.write("        </a>\r\n");
      out.write("      </li>\r\n");
      out.write("    </ul>\r\n");
      out.write("  </nav>\r\n");
      out.write("  <div class=\"clear\"></div>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"black_overlay\" id='window_black'></div>");
      out.write("\r\n");
      out.write("<!--弹出层二级菜单-->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!--主体结束-->\r\n");
      out.write("<div class=\"h10\"></div>\r\n");
      out.write("<!--底部-->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!--弹出层二级菜单-->\r\n");
      out.write("\r\n");
      out.write("\r\n");

  String m_domain= Config.getValue("js-cross-domain");
  request.setAttribute("m_domain",m_domain);
  request.setAttribute("shopId", UserContext.getSellShopId());
  if("10000001".equals(UserContext.getSellShopId())){
    request.setAttribute("shopId", "m");
  }

      out.write("\r\n");
      out.write("<!--主体结束-->\r\n");
      out.write("<div class=\"h10\"></div>\r\n");
      out.write("<!--底部-->\r\n");
      out.write("<footer id=\"footer\">\r\n");
      out.write("  ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("  <a ");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write(" href=\"http://");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${shopId}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write('.');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${m_domain}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/shop/home.do?t=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${version}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("&scene=4#wechat_redirect\">\r\n");
      out.write("    <dl >\r\n");
      out.write("      <dt class=\"ico ico_mall\"></dt>\r\n");
      out.write("      <dd>平价商城</dd>\r\n");
      out.write("    </dl></a>\r\n");
      out.write("\r\n");
      out.write("    <a ");
      if (_jspx_meth_c_005fif_005f1(_jspx_page_context))
        return;
      out.write("  href=\"http://");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${shopId}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write('.');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${m_domain}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/home/country.do?t=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${version}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("&scene=4#wechat_redirect\">\r\n");
      out.write("      <dl>\r\n");
      out.write("        <dt class=\"ico ico_home\"></dt>\r\n");
      out.write("        <dd>乡间直供</dd>\r\n");
      out.write("      </dl></a>\r\n");
      out.write("\r\n");
      out.write("  <a  ");
      if (_jspx_meth_c_005fif_005f2(_jspx_page_context))
        return;
      out.write(" href=\"http://");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${shopId}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write('.');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${m_domain}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/showMyNear.do?t=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${version}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("&scene=4#wechat_redirect\">\r\n");
      out.write("    <dl>\r\n");
      out.write("      <dt class=\"ico ico_fujin\"></dt>\r\n");
      out.write("      <dd>线下门店</dd>\r\n");
      out.write("    </dl></a>\r\n");
      out.write("\r\n");
      out.write("  <a  ");
      if (_jspx_meth_c_005fif_005f3(_jspx_page_context))
        return;
      out.write(" href=\"http://");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${shopId}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write('.');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${m_domain}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/member/center.do?t=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${version}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("&scene=4#wechat_redirect\" >");
      out.write("\r\n");
      out.write("    <dl>\r\n");
      out.write("      <dt class=\"ico ico_wo\"></dt>\r\n");
      out.write("      <dd>我的乡货</dd>\r\n");
      out.write("    </dl></a>\r\n");
      out.write("</footer>\r\n");
      out.write("<script type=\"text/javascript\" src=\"http://pingjs.qq.com/h5/stats.js\" name=\"MTAH5\" sid=\"500001265\" ></script>\r\n");
      out.write("<!--底部-->\r\n");
      out.write("\r\n");
      out.write("<!--底部-->\r\n");
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

  private boolean _jspx_meth_h5_005fnavigation_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  h5:navigation
    com.hxh.shop.common.tags.NavigationTag _jspx_th_h5_005fnavigation_005f0 = (com.hxh.shop.common.tags.NavigationTag) _005fjspx_005ftagPool_005fh5_005fnavigation_0026_005ftitle_005fnobody.get(com.hxh.shop.common.tags.NavigationTag.class);
    _jspx_th_h5_005fnavigation_005f0.setPageContext(_jspx_page_context);
    _jspx_th_h5_005fnavigation_005f0.setParent(null);
    // /WEB-INF/jsp/trade/logistics.jsp(18,0) name = title type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_h5_005fnavigation_005f0.setTitle("查看物流");
    int _jspx_eval_h5_005fnavigation_005f0 = _jspx_th_h5_005fnavigation_005f0.doStartTag();
    if (_jspx_th_h5_005fnavigation_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fh5_005fnavigation_0026_005ftitle_005fnobody.reuse(_jspx_th_h5_005fnavigation_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fh5_005fnavigation_0026_005ftitle_005fnobody.reuse(_jspx_th_h5_005fnavigation_005f0);
    return false;
  }

  private boolean _jspx_meth_bs_005fCacheLable_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  bs:CacheLable
    com.ms.framework.web.tags.CacheCodeLableTag _jspx_th_bs_005fCacheLable_005f0 = (com.ms.framework.web.tags.CacheCodeLableTag) _005fjspx_005ftagPool_005fbs_005fCacheLable_0026_005fcode_005fnobody.get(com.ms.framework.web.tags.CacheCodeLableTag.class);
    _jspx_th_bs_005fCacheLable_005f0.setPageContext(_jspx_page_context);
    _jspx_th_bs_005fCacheLable_005f0.setParent(null);
    // /WEB-INF/jsp/trade/logistics.jsp(23,109) name = code type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_bs_005fCacheLable_005f0.setCode((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${resultMap.vstatus}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
    int _jspx_eval_bs_005fCacheLable_005f0 = _jspx_th_bs_005fCacheLable_005f0.doStartTag();
    if (_jspx_th_bs_005fCacheLable_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbs_005fCacheLable_0026_005fcode_005fnobody.reuse(_jspx_th_bs_005fCacheLable_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbs_005fCacheLable_0026_005fcode_005fnobody.reuse(_jspx_th_bs_005fCacheLable_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent(null);
    // /WEB-INF/jsp/trade/logistics.jsp(27,4) name = items type = java.lang.Object reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${resultwuliu}", java.lang.Object.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
    // /WEB-INF/jsp/trade/logistics.jsp(27,4) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("result1");
    // /WEB-INF/jsp/trade/logistics.jsp(27,4) name = varStatus type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVarStatus("status");
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("      <div class=\"list list_act\">\r\n");
          out.write("        <div class=\"point fl\"><span class=\"ico\"></span></div>\r\n");
          out.write("        <dl class=\"fr\">\r\n");
          out.write("          <dt class=\"zt\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${result1.processInfo}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</dt>\r\n");
          out.write("          <dd class=\"time\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${result1.datetime}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</dd>\r\n");
          out.write("        </dl>\r\n");
          out.write("      </div>\r\n");
          out.write("    ");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f0.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f0.setParent(null);
    // /WEB-INF/jsp/trade/../pub/footerNavigation.jsp(28,5) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.homeFooterAtc=='2'}", java.lang.Boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
    if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("class=\"act\"");
        int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f1.setParent(null);
    // /WEB-INF/jsp/trade/../pub/footerNavigation.jsp(34,7) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.homeFooterAtc=='1'}", java.lang.Boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f1 = _jspx_th_c_005fif_005f1.doStartTag();
    if (_jspx_eval_c_005fif_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("class=\"act\"");
        int evalDoAfterBody = _jspx_th_c_005fif_005f1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f1);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f2(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f2.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f2.setParent(null);
    // /WEB-INF/jsp/trade/../pub/footerNavigation.jsp(40,6) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.homeFooterAtc=='3'}", java.lang.Boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f2 = _jspx_th_c_005fif_005f2.doStartTag();
    if (_jspx_eval_c_005fif_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("class=\"act\"");
        int evalDoAfterBody = _jspx_th_c_005fif_005f2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f2);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f3(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f3 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f3.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f3.setParent(null);
    // /WEB-INF/jsp/trade/../pub/footerNavigation.jsp(46,6) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.homeFooterAtc=='4'}", java.lang.Boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f3 = _jspx_th_c_005fif_005f3.doStartTag();
    if (_jspx_eval_c_005fif_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("class=\"act\"");
        int evalDoAfterBody = _jspx_th_c_005fif_005f3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f3);
    return false;
  }
}
