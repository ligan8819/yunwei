/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.64
 * Generated at: 2017-02-09 10:42:28 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp.goods;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.ms.framework.util.Config;
import java.util.*;

public final class goodsList_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(6);
    _jspx_dependants.put("/WEB-INF/tags/base.tld", Long.valueOf(1471439204000L));
    _jspx_dependants.put("/WEB-INF/tags/h5.tld", Long.valueOf(1471439204000L));
    _jspx_dependants.put("/WEB-INF/jsp/goods/../pub/head.inc", Long.valueOf(1486632866000L));
    _jspx_dependants.put("/WEB-INF/tags/c.tld", Long.valueOf(1471439204000L));
    _jspx_dependants.put("/WEB-INF/jsp/goods/../pub/quickNavigation.jsp", Long.valueOf(1471439204000L));
    _jspx_dependants.put("/WEB-INF/jsp/goods/../pub/tags.inc", Long.valueOf(1471439204000L));
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fh5_005fnavigation_0026_005ftitle_005fdefaultUrl_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fh5_005fnavigation_0026_005ftitle_005fdefaultUrl_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fh5_005fnavigation_0026_005ftitle_005fdefaultUrl_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.release();
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
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
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("    ");
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
      out.write("    <title>产品列表</title>\r\n");
      out.write("    <style>\r\n");
      out.write("        @media screen and (max-width:479px) { html { font-size:14px; line-height:28px; } }\r\n");
      out.write("        @media screen and (min-width:480px){ html { font-size:16px; line-height:36px; } }\r\n");
      out.write("    </style>\r\n");
      out.write("    <script src=\"../js/jquery.js\"></script>\r\n");
      out.write("    <script src=\"../js/h5base.js\"></script>\r\n");
      out.write("    <script src=\"../js/goodsScroll.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\">\r\n");
      out.write("        var oldOrderByflag = \"0\";       //老的排序方式，用于与新的排序方式比较是否发生变化\r\n");
      out.write("        var pageSize = 10;\r\n");
      out.write("        var categoryArr = new Array();\r\n");
      out.write("        var categoryAllArr = new Array();\r\n");
      out.write("        var urlIndex = -1;       //当前图片加载的个数\r\n");
      out.write("        $(document).ready(function() {\r\n");
      out.write("            changeOrderBy(\"1\", '1');\r\n");
      out.write("        });\r\n");
      out.write("\r\n");
      out.write("        function onBackFun(data) {\r\n");
      out.write("            var goodsObj = eval(\"(\" + data + \")\");\r\n");
      out.write("            if(goodsObj[0].goodsList.length > 0) {\r\n");
      out.write("                var godObj = goodsObj[0].goodsList;\r\n");
      out.write("                for(var i in godObj) {\r\n");
      out.write("                    var oneGoodInfo = $(\"#oneGoodInfoDiv\").html();\r\n");
      out.write("                    oneGoodInfo = oneGoodInfo.replace(\"vname\", godObj[i].vname);\r\n");
      out.write("                    if(godObj[i].ndiscuss_nums == null || godObj[i].ndiscuss_nums == 0) {       //如果库存为空或为0，则好评为0\r\n");
      out.write("                        oneGoodInfo = oneGoodInfo.replace(\"goodComment\", \"0\");\r\n");
      out.write("                    } else {\r\n");
      out.write("                        var goodComment = parseInt(godObj[i].nfavourable_nums) / parseInt(godObj[i].ndiscuss_nums);\r\n");
      out.write("                        goodComment = goodComment * 100;\r\n");
      out.write("                        oneGoodInfo = oneGoodInfo.replace(\"goodComment\", goodComment.toFixed(2));\r\n");
      out.write("                    }\r\n");
      out.write("                    if(godObj[i].nbill_nums == null) {\r\n");
      out.write("                        oneGoodInfo = oneGoodInfo.replace(\"outNum\", \"0\");\r\n");
      out.write("                    } else {\r\n");
      out.write("                        oneGoodInfo = oneGoodInfo.replace(\"outNum\", godObj[i].nbill_nums);\r\n");
      out.write("                    }\r\n");
      out.write("                    oneGoodInfo = oneGoodInfo.replace(\"ngoodsIdCheck\", godObj[i].ngoods_id);\r\n");
      out.write("                    oneGoodInfo = oneGoodInfo.replace(\"ngoodsIdCheckName\", godObj[i].ngoods_id);\r\n");
      out.write("                    var nowPic = godObj[i].nowpic==null?0:godObj[i].nowpic;\r\n");
      out.write("                    nowPic = parseFloat(nowPic);\r\n");
      out.write("                    var nowActNum=godObj[i].ngoods_nums==null?0:godObj[i].ngoods_nums;\r\n");
      out.write("                    if(nowActNum>0){\r\n");
      out.write("                        oneGoodInfo = oneGoodInfo.replace(\"nowpic\", formatNumber(godObj[i].nprice, \"0.00\"));\r\n");
      out.write("                    }else{\r\n");
      out.write("                        oneGoodInfo = oneGoodInfo.replace(\"nowpic\", formatNumber(nowPic, \"0.00\"));\r\n");
      out.write("                    }\r\n");
      out.write("                    oneGoodInfo = oneGoodInfo.replace(\"oldpic\", formatNumber(nowPic, \"0.00\"));\r\n");
      out.write("                    urlIndex = urlIndex + 1;\r\n");
      out.write("                    oneGoodInfo = oneGoodInfo.replace(\"goodsImgUrl\", \"goodsImgUrl\" + urlIndex);\r\n");
      out.write("                    $(\"#goodsListDiv\").html($(\"#goodsListDiv\").html() + oneGoodInfo);\r\n");
      out.write("                    $(\"#goodsImgUrl\" + urlIndex).css(\"height\", $(\"#goodsImg\").css(\"height\"));\r\n");
      out.write("                    $(\"#goodsImgUrl\" + urlIndex).attr(\"src\", godObj[i].vmaster_product_image_id==null?\"../images/more_indextm.jpg\":\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${STATIC_SERVER}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\"+godObj[i].vmaster_product_image_id);\r\n");
      out.write("                }\r\n");
      out.write("                if(curPage * pageSize >= goodsObj[0].goodCount) {\r\n");
      out.write("                    $(\"#upGetMoreDiv\").css(\"display\", \"none\");\r\n");
      out.write("                } else {\r\n");
      out.write("                    $(\"#upGetMoreDiv\").css(\"display\", \"block\");\r\n");
      out.write("                }\r\n");
      out.write("                curPage = curPage + 1;\r\n");
      out.write("                $(\"#noSeach\").html(\"\");\r\n");
      out.write("            }else{\r\n");
      out.write("                if($(\"#goodsListDiv\").children().size()==0) {\r\n");
      out.write("                    $(\"#noSeach\").html(\"未找到您要的乡货\");\r\n");
      out.write("                }\r\n");
      out.write("            }\r\n");
      out.write("            $(\"#lookMore\").css(\"display\", \"none\");\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        function changeOrderBy(orderByFlag, click, type) {\r\n");
      out.write("            $(\"#goodsListDiv\").html('');\r\n");
      out.write("            if(isrun){\r\n");
      out.write("                isrun=false;\r\n");
      out.write("                if(click == \"1\") {\r\n");
      out.write("                    if(type == undefined) {\r\n");
      out.write("                        if (oldOrderByflag != orderByFlag) {\r\n");
      out.write("                            oldOrderByflag = orderByFlag;\r\n");
      out.write("                        } else {\r\n");
      out.write("                            orderByFlag = parseInt(orderByFlag) + 1;\r\n");
      out.write("                            oldOrderByflag = orderByFlag;\r\n");
      out.write("                        }\r\n");
      out.write("                    }\r\n");
      out.write("                    if(oldOrderByflag == 1) {\r\n");
      out.write("                        $(\"#goodSpanId\").removeClass().addClass(\"sanjiao\");\r\n");
      out.write("                    } else if(oldOrderByflag == 2) {\r\n");
      out.write("                        $(\"#goodSpanId\").removeClass().addClass(\"sanjiao2\");\r\n");
      out.write("                    } else if(oldOrderByflag == 3) {\r\n");
      out.write("                        $(\"#saleSpanId\").removeClass().addClass(\"sanjiao\");\r\n");
      out.write("                    } else if(oldOrderByflag == 4) {\r\n");
      out.write("                        $(\"#saleSpanId\").removeClass().addClass(\"sanjiao2\");\r\n");
      out.write("                    } else if(oldOrderByflag == 5) {\r\n");
      out.write("                        $(\"#picSpanId\").removeClass().addClass(\"sanjiao\");\r\n");
      out.write("                    } else if(oldOrderByflag == 6) {\r\n");
      out.write("                        $(\"#picSpanId\").removeClass().addClass(\"sanjiao2\");\r\n");
      out.write("                    }\r\n");
      out.write("                }\r\n");
      out.write("                url = \"/searchGoodsListForJson.do?nsell_category_id=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${goodsCategoryNexus.nsell_category_id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("&orderByFlag=\" + oldOrderByflag + \"&categoryArr=\" + categoryArr;\r\n");
      out.write("                upScrollLoadData(onBackFun, false);\r\n");
      out.write("            }\r\n");
      out.write("        }\r\n");
      out.write("        function categoryButtonClick(buttonId, index) {\r\n");
      out.write("            var buttonId1 = buttonId.replace(\":\", \"\");\r\n");
      out.write("            var categoryArrs = categoryAllArr[index];\r\n");
      out.write("            if(categoryArrs != undefined) {\r\n");
      out.write("                var flag = 0;\r\n");
      out.write("                for(var i=0;i<categoryArrs.length;i++) {\r\n");
      out.write("                    if(categoryArrs[i] == buttonId) {\r\n");
      out.write("                        flag = 1;\r\n");
      out.write("                        categoryArrs.splice(i, 1);\r\n");
      out.write("                        $(\"#\" + buttonId1).removeClass();\r\n");
      out.write("                    }\r\n");
      out.write("                }\r\n");
      out.write("                if(flag == 0) {\r\n");
      out.write("                    categoryArrs.push(buttonId);\r\n");
      out.write("                    $(\"#\" + buttonId1).addClass(\"act\");\r\n");
      out.write("                }\r\n");
      out.write("            } else {\r\n");
      out.write("                categoryArrs = new Array();\r\n");
      out.write("                categoryArrs.push(buttonId);\r\n");
      out.write("                $(\"#\" + buttonId1).addClass(\"act\");\r\n");
      out.write("            }\r\n");
      out.write("            categoryAllArr[index] = categoryArrs;\r\n");
      out.write("        }\r\n");
      out.write("        function generateTrRow(specItemList){\r\n");
      out.write("            var specValueList = [];\r\n");
      out.write("            for(var i in specItemList){\r\n");
      out.write("                var s = specItemList[i];\r\n");
      out.write("                if(s != undefined) {\r\n");
      out.write("                    specValueList.push(s);\r\n");
      out.write("                }\r\n");
      out.write("            }\r\n");
      out.write("            var arrGroup = [], tempGroup = [];\r\n");
      out.write("            if(specValueList.length > 0){\r\n");
      out.write("                var firstSpecValueList = specValueList[0];\r\n");
      out.write("                for(var i in firstSpecValueList){\r\n");
      out.write("                    tempGroup.push([firstSpecValueList[i]]);\r\n");
      out.write("                }\r\n");
      out.write("                specValueList.splice(0, 1);\r\n");
      out.write("                arrGroup = generateGroup(specValueList, tempGroup);\r\n");
      out.write("            }\r\n");
      out.write("            return arrGroup;\r\n");
      out.write("        }\r\n");
      out.write("        /**\r\n");
      out.write("         * 生成规格值组合的方法\r\n");
      out.write("         */\r\n");
      out.write("        function generateGroup(arrSpecValueList, tempGroup){\r\n");
      out.write("            for(var i in arrSpecValueList){\r\n");
      out.write("                var s = arrSpecValueList[i];\r\n");
      out.write("                var newTempGroup = [];\r\n");
      out.write("                for(var j in tempGroup){\r\n");
      out.write("                    for(var k in s){\r\n");
      out.write("                        var tempOne = [];\r\n");
      out.write("                        for(var x in tempGroup[j]){\r\n");
      out.write("                            tempOne.push(tempGroup[j][x]);\r\n");
      out.write("                        }\r\n");
      out.write("                        tempOne.push(s[k]);\r\n");
      out.write("                        newTempGroup.push(tempOne);\r\n");
      out.write("                    }\r\n");
      out.write("                }\r\n");
      out.write("                if(newTempGroup.length > 0){\r\n");
      out.write("                    tempGroup = newTempGroup;\r\n");
      out.write("                }\r\n");
      out.write("            }\r\n");
      out.write("            return tempGroup;\r\n");
      out.write("        }\r\n");
      out.write("        function clearCategoryButtonClick() {\r\n");
      out.write("            if(categoryAllArr.length > 0) {\r\n");
      out.write("                for(var j=0;j<categoryAllArr.length;j++) {\r\n");
      out.write("                    var categoryArrs = categoryAllArr[j];\r\n");
      out.write("                    if (categoryArrs != undefined) {\r\n");
      out.write("                        for (var i = 0; i < categoryArrs.length; i++) {\r\n");
      out.write("                            var buttonId = \"\" + categoryArrs[i];\r\n");
      out.write("                            buttonId = buttonId.replace(\":\", \"\");\r\n");
      out.write("                            $(\"#\" + buttonId).removeClass();\r\n");
      out.write("                            categoryArrs.splice(i, 1);\r\n");
      out.write("                            i = i - 1;\r\n");
      out.write("                        }\r\n");
      out.write("                    }\r\n");
      out.write("                }\r\n");
      out.write("            }\r\n");
      out.write("        }\r\n");
      out.write("        function submitCategoryButtom() {\r\n");
      out.write("            categoryArr = new Array;\r\n");
      out.write("            categoryArr = generateTrRow(categoryAllArr);\r\n");
      out.write("            for(var i in categoryArr) {\r\n");
      out.write("                var value = \"\" + categoryArr[i];\r\n");
      out.write("                categoryArr[i] = value.replace(/[,]/g, \"::\");\r\n");
      out.write("            }\r\n");
      out.write("            changeOrderBy(oldOrderByflag, '1', '0');\r\n");
      out.write("            $(\"#openBackButtom\").click();\r\n");
      out.write("            $(\"#noSeach\").html(\"\");\r\n");
      out.write("        }\r\n");
      out.write("        window.onresize = function() {\r\n");
      out.write("            for(var i=0;i<urlIndex;i++) {\r\n");
      out.write("                $(\"#goodsImgUrl\" + i).css(\"height\", $(\"#goodsImg\").css(\"height\"));\r\n");
      out.write("            }\r\n");
      out.write("        }\r\n");
      out.write("    </script>\r\n");
      out.write("</head>\r\n");
      out.write("<body class=\"White\">\r\n");
      out.write("\r\n");
      out.write("<!--头部-->\r\n");
      if (_jspx_meth_h5_005fnavigation_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("<!--头部-->\r\n");
      out.write("\r\n");
      out.write("<!--主体开始-->\r\n");
      out.write("<div class=\"cplist_page\">\r\n");
      out.write("    <!-- 每一个商品信息-->\r\n");
      out.write("    <div id=\"oneGoodInfoDiv\" style=\"display: none\">\r\n");
      out.write("        <dl style=\"border:none;\">\r\n");
      out.write("            <dt><a href=\"/goods.do?ngoods_id=ngoodsIdCheck\"><img id=\"goodsImgUrl\" src=\"../images/more_indextm.jpg\" width=\"100%\" alt=\"\"/></a></dt>\r\n");
      out.write("            <dd class=\"tit\"><a href=\"/goods.do?ngoods_id=ngoodsIdCheckName\">vname</a></dd>\r\n");
      out.write("            <dd class=\"pricess\"><span class=\"price1\">￥<strong>nowpic</strong></span><span class=\"price2\">￥oldpic</span></dd>\r\n");
      out.write("            <dd><span class=\"xiaol\">goodComment%好评 &nbsp; 已售outNum件</span></dd>\r\n");
      out.write("        </dl>\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- 每一个商品信息-->\r\n");
      out.write("    <div class=\"cplist_box\">\r\n");
      out.write("        <span class=\"shaixuanbtn\">筛选<span class=\"fliter\"></span></span>\r\n");
      out.write("        <ul class=\"tab_tit\">\r\n");
      out.write("            <li class=\"act\" onclick=\"changeOrderBy('1', '1');\"><a href=\"#\">产品<span id=\"goodSpanId\" class=\"sanjiao\"></span></a></li>\r\n");
      out.write("            <li onclick=\"changeOrderBy('3', '1');\"><a href=\"#\">销量<span id=\"saleSpanId\" class=\"sanjiao\"></span></a></li>\r\n");
      out.write("            <li onclick=\"changeOrderBy('5', '1');\"><a href=\"#\">价格<span id=\"picSpanId\" class=\"sanjiao\"></span></a></li>\r\n");
      out.write("        </ul>\r\n");
      out.write("        <div class=\"tab_cont\">\r\n");
      out.write("            <div id=\"goodsListDiv\"></div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div id=\"upGetMoreDiv\" style=\"display:none\">\r\n");
      out.write("            <div class=\"viewbox\" id=\"lookMore\"><a href=\"#\" class=\"viewmore\">上拉查看更多</a></div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div id=\"noSeach\" style=\"text-align:center;color:red\"></div>\r\n");
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
      out.write("<!--筛选-->\r\n");
      out.write("<div class=\"black_overlay2\"></div>\r\n");
      out.write("<div class=\"shaixuan_boxs\">\r\n");
      out.write("    <p class=\"biaoti\"><span class=\"fanhuibtn back fl\" id=\"openBackButtom\"></span><span class=\"bt_title fl\"><span class=\"tit\">筛选</span></span></p>\r\n");
      out.write("    <div class=\"dl_listbox\">\r\n");
      out.write("        ");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"operate_box7\">\r\n");
      out.write("        <a class=\"cart\" href=\"#\" onclick=\"clearCategoryButtonClick()\">清除选项</a>\r\n");
      out.write("        <a class=\"buy\" href=\"#\" onclick=\"submitCategoryButtom()\">完成筛选</a>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("<!--筛选-->\r\n");
      out.write("<div style=\" position: absolute; top: -999em;width: 100%;\">\r\n");
      out.write("    <div class=\"cplist_page\">\r\n");
      out.write("        <div class=\"cplist_box\">\r\n");
      out.write("            <div class=\"tab_cont\">\r\n");
      out.write("                <div> <dl style=\"border:none;\">\r\n");
      out.write("                    <dt><a href=\"#\"><img id=\"goodsImg\" src=\"../images/more_indextm.jpg\" width=\"100%\" alt=\"\" /></a></dt>\r\n");
      out.write("                    <dd class=\"tit\"><a href=\"#\">放心给家人食用的小黑碗木耳</a></dd>\r\n");
      out.write("                    <dd class=\"pricess\"><span class=\"price1\">￥<strong>158.8</strong></span><span class=\"price2\">￥228.8</span></dd>\r\n");
      out.write("                    <dd><span class=\"xiaol\">95%好评 &nbsp; 已售216件</span></dd>\r\n");
      out.write("                </dl>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("<!--主体结束-->\r\n");
      out.write("    <script type=\"text/javascript\" src=\"http://pingjs.qq.com/h5/stats.js\" name=\"MTAH5\" sid=\"500001265\" ></script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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
    com.hxh.shop.common.tags.NavigationTag _jspx_th_h5_005fnavigation_005f0 = (com.hxh.shop.common.tags.NavigationTag) _005fjspx_005ftagPool_005fh5_005fnavigation_0026_005ftitle_005fdefaultUrl_005fnobody.get(com.hxh.shop.common.tags.NavigationTag.class);
    _jspx_th_h5_005fnavigation_005f0.setPageContext(_jspx_page_context);
    _jspx_th_h5_005fnavigation_005f0.setParent(null);
    // /WEB-INF/jsp/goods/goodsList.jsp(216,0) name = defaultUrl type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_h5_005fnavigation_005f0.setDefaultUrl((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("/goods/category/type.do?nsell_category_id=${nsell_father_category_id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
    // /WEB-INF/jsp/goods/goodsList.jsp(216,0) name = title type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_h5_005fnavigation_005f0.setTitle((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${goods.vname}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
    int _jspx_eval_h5_005fnavigation_005f0 = _jspx_th_h5_005fnavigation_005f0.doStartTag();
    if (_jspx_th_h5_005fnavigation_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fh5_005fnavigation_0026_005ftitle_005fdefaultUrl_005fnobody.reuse(_jspx_th_h5_005fnavigation_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fh5_005fnavigation_0026_005ftitle_005fdefaultUrl_005fnobody.reuse(_jspx_th_h5_005fnavigation_005f0);
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
    // /WEB-INF/jsp/goods/goodsList.jsp(257,8) name = items type = java.lang.Object reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${result}", java.lang.Object.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
    // /WEB-INF/jsp/goods/goodsList.jsp(257,8) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("result1");
    // /WEB-INF/jsp/goods/goodsList.jsp(257,8) name = varStatus type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVarStatus("status");
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("            <dl>\r\n");
          out.write("                <dt>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${result1.vname}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</dt>\r\n");
          out.write("                <dd>\r\n");
          out.write("                    ");
          if (_jspx_meth_c_005fforEach_005f1(_jspx_th_c_005fforEach_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
            return true;
          out.write("\r\n");
          out.write("                </dd>\r\n");
          out.write("            </dl>\r\n");
          out.write("        ");
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

  private boolean _jspx_meth_c_005fforEach_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f0, javax.servlet.jsp.PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f0);
    // /WEB-INF/jsp/goods/goodsList.jsp(261,20) name = items type = java.lang.Object reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${result1.buttonName}", java.lang.Object.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
    // /WEB-INF/jsp/goods/goodsList.jsp(261,20) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f1.setVar("result2");
    int[] _jspx_push_body_count_c_005fforEach_005f1 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f1 = _jspx_th_c_005fforEach_005f1.doStartTag();
      if (_jspx_eval_c_005fforEach_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                        <a href=\"#\" id=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${result1.nattribute_id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${result2.nattr_val_id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("\" onclick=\"categoryButtonClick('");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${result1.nattribute_id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write(':');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${result2.nattr_val_id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write('\'');
          out.write(',');
          out.write('\'');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${status.count}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("')\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${result2.vval}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</a>\r\n");
          out.write("                    ");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f1.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f1);
    }
    return false;
  }
}
