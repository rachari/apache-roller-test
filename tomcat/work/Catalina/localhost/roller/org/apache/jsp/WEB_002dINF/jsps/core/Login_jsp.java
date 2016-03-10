package org.apache.jsp.WEB_002dINF.jsps.core;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.apache.roller.weblogger.config.WebloggerConfig;

public final class Login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


String securityCheckUrl = null;
boolean cmaEnabled = WebloggerConfig.getBooleanProperty("authentication.cma.enabled");

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/WEB-INF/jsps/taglibs-struts2.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005furl_0026_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005fif_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005ftext_0026_005fname_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fs_005furl_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005ftext_0026_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fs_005furl_0026_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.release();
    _005fjspx_005ftagPool_005fs_005ftext_0026_005fname_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!--\n");
      out.write("  Licensed to the Apache Software Foundation (ASF) under one or more\n");
      out.write("   contributor license agreements.  The ASF licenses this file to You\n");
      out.write("  under the Apache License, Version 2.0 (the \"License\"); you may not\n");
      out.write("  use this file except in compliance with the License.\n");
      out.write("  You may obtain a copy of the License at\n");
      out.write("\n");
      out.write("      http://www.apache.org/licenses/LICENSE-2.0\n");
      out.write("\n");
      out.write("  Unless required by applicable law or agreed to in writing, software\n");
      out.write("  distributed under the License is distributed on an \"AS IS\" BASIS,\n");
      out.write("  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.\n");
      out.write("  See the License for the specific language governing permissions and\n");
      out.write("  limitations under the License.  For additional information regarding\n");
      out.write("  copyright in this work, please see the NOTICE file in the top level\n");
      out.write("  directory of this distribution.\n");
      out.write("-->\n");
      out.write("\n");
      out.write('\n');
      out.write('\n');
      out.write('\n');
 response.setContentType("text/html; charset=UTF-8"); 
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href='");
      if (_jspx_meth_s_005furl_005f0(_jspx_page_context))
        return;
      out.write("'/>\n");
      out.write('\n');
      out.write('\n');
      out.write('\n');
      out.write('\n');

if (cmaEnabled) {
    securityCheckUrl = "/j_security_check";
} else {
    securityCheckUrl = "/roller_j_security_check";
}

      out.write('\n');
      out.write('\n');
      out.write('\n');
      if (_jspx_meth_s_005fif_005f0(_jspx_page_context))
        return;
      out.write('\n');
      out.write('\n');
      //  s:if
      org.apache.struts2.views.jsp.IfTag _jspx_th_s_005fif_005f1 = (org.apache.struts2.views.jsp.IfTag) _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.get(org.apache.struts2.views.jsp.IfTag.class);
      _jspx_th_s_005fif_005f1.setPageContext(_jspx_page_context);
      _jspx_th_s_005fif_005f1.setParent(null);
      // /WEB-INF/jsps/core/Login.jsp(62,0) name = test type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_s_005fif_005f1.setTest("openIdConfiguration != 'only'");
      int _jspx_eval_s_005fif_005f1 = _jspx_th_s_005fif_005f1.doStartTag();
      if (_jspx_eval_s_005fif_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_s_005fif_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_s_005fif_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_s_005fif_005f1.doInitBody();
        }
        do {
          out.write("\n");
          out.write("\n");
          out.write("    ");
          if (_jspx_meth_s_005fif_005f2(_jspx_th_s_005fif_005f1, _jspx_page_context))
            return;
          out.write("\n");
          out.write("    \n");
          out.write("    ");
          if (_jspx_meth_s_005fif_005f3(_jspx_th_s_005fif_005f1, _jspx_page_context))
            return;
          out.write("\n");
          out.write("    \n");
          out.write("    <form method=\"post\" id=\"loginForm\" \n");
          out.write("          action=\"");
          //  c:url
          org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f1 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
          _jspx_th_c_005furl_005f1.setPageContext(_jspx_page_context);
          _jspx_th_c_005furl_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fif_005f1);
          // /WEB-INF/jsps/core/Login.jsp(73,18) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_c_005furl_005f1.setValue( securityCheckUrl );
          int _jspx_eval_c_005furl_005f1 = _jspx_th_c_005furl_005f1.doStartTag();
          if (_jspx_th_c_005furl_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f1);
            return;
          }
          _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f1);
          out.write("\"\n");
          out.write("          onsubmit=\"saveUsername(this)\">\n");
          out.write("\n");
          out.write("        <table width=\"80%\">\n");
          out.write("\n");
          out.write("            <tr>\n");
          out.write("                <td width=\"20%\" align=\"right\">");
          if (_jspx_meth_s_005ftext_005f5(_jspx_th_s_005fif_005f1, _jspx_page_context))
            return;
          out.write("</td>\n");
          out.write("                <td width=\"80%\">\n");
          out.write("                    <input type=\"text\" name=\"j_username\" id=\"j_username\" size=\"25\" />\n");
          out.write("                </td>\n");
          out.write("            </tr>\n");
          out.write("\n");
          out.write("            <tr>\n");
          out.write("                <td width=\"20%\" align=\"right\">");
          if (_jspx_meth_s_005ftext_005f6(_jspx_th_s_005fif_005f1, _jspx_page_context))
            return;
          out.write("</td>\n");
          out.write("                <td width=\"80%\">\n");
          out.write("                    <input type=\"password\" name=\"j_password\" id=\"j_password\" size=\"20\" />\n");
          out.write("                </td>\n");
          out.write("            </tr>\n");
          out.write("\n");
          out.write("            ");
          if (_jspx_meth_c_005fif_005f0(_jspx_th_s_005fif_005f1, _jspx_page_context))
            return;
          out.write("\n");
          out.write("\n");
          out.write("            <tr>\n");
          out.write("                <td width=\"20%\"></td>\n");
          out.write("                <td width=\"80%\">\n");
          out.write("                    <input type=\"submit\" name=\"login\" id=\"login\" value=\"");
          if (_jspx_meth_s_005ftext_005f8(_jspx_th_s_005fif_005f1, _jspx_page_context))
            return;
          out.write("\" />\n");
          out.write("                    <input type=\"reset\" name=\"reset\" id=\"reset\" value=\"");
          if (_jspx_meth_s_005ftext_005f9(_jspx_th_s_005fif_005f1, _jspx_page_context))
            return;
          out.write("\" \n");
          out.write("                        onclick=\"document.getElementById('j_username').focus()\" />\n");
          out.write("                </td>\n");
          out.write("            </tr>        \n");
          out.write("\n");
          out.write("        </table>    \n");
          out.write("    </form>\n");
          int evalDoAfterBody = _jspx_th_s_005fif_005f1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_s_005fif_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.popBody();
        }
      }
      if (_jspx_th_s_005fif_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.reuse(_jspx_th_s_005fif_005f1);
        return;
      }
      _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.reuse(_jspx_th_s_005fif_005f1);
      out.write("\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("<!--\n");
      if (_jspx_meth_s_005fif_005f4(_jspx_page_context))
        return;
      out.write('\n');
      out.write('\n');
      if (_jspx_meth_s_005fif_005f5(_jspx_page_context))
        return;
      out.write("\n");
      out.write("//-->\n");
      out.write("</script>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_s_005furl_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_005furl_005f0 = (org.apache.struts2.views.jsp.URLTag) _005fjspx_005ftagPool_005fs_005furl_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_005furl_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005furl_005f0.setParent(null);
    // /WEB-INF/jsps/taglibs-struts2.jsp(26,45) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005furl_005f0.setValue("/roller-ui/yui/tabview/assets/skins/sam/tabview.css");
    int _jspx_eval_s_005furl_005f0 = _jspx_th_s_005furl_005f0.doStartTag();
    if (_jspx_th_s_005furl_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005furl_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005furl_005f0);
    return false;
  }

  private boolean _jspx_meth_s_005fif_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:if
    org.apache.struts2.views.jsp.IfTag _jspx_th_s_005fif_005f0 = (org.apache.struts2.views.jsp.IfTag) _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.get(org.apache.struts2.views.jsp.IfTag.class);
    _jspx_th_s_005fif_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005fif_005f0.setParent(null);
    // /WEB-INF/jsps/core/Login.jsp(37,0) name = test type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fif_005f0.setTest("openIdConfiguration != 'disabled'");
    int _jspx_eval_s_005fif_005f0 = _jspx_th_s_005fif_005f0.doStartTag();
    if (_jspx_eval_s_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fif_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fif_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fif_005f0.doInitBody();
      }
      do {
        out.write("\n");
        out.write("    \n");
        out.write("    <p>");
        if (_jspx_meth_s_005ftext_005f0(_jspx_th_s_005fif_005f0, _jspx_page_context))
          return true;
        out.write("</p>\n");
        out.write("    \n");
        out.write("    <form method=\"post\" id=\"loginOpenIDForm\"       \n");
        out.write("          action=\"/roller/roller_j_openid_security_check\"      \n");
        out.write("          onsubmit=\"saveOpenidIdentifier(this)\">      \n");
        out.write("        <!-- action=\"");
        if (_jspx_meth_c_005furl_005f0(_jspx_th_s_005fif_005f0, _jspx_page_context))
          return true;
        out.write("\"  -->\n");
        out.write("        <table width=\"80%\">\n");
        out.write("            <tr>\n");
        out.write("                <td width=\"20%\" align=\"right\">");
        if (_jspx_meth_s_005ftext_005f1(_jspx_th_s_005fif_005f0, _jspx_page_context))
          return true;
        out.write("</td>\n");
        out.write("                <td width=\"80%\">\n");
        out.write("                    <input type=\"text\" name=\"openid_identifier\" id=\"openid_identifier\" class=\"f_openid_identifier\" size=\"40\" maxlength=\"255\" />\n");
        out.write("                </td>\n");
        out.write("            </tr>    \n");
        out.write("            <tr>\n");
        out.write("                <td width=\"20%\"></td>\n");
        out.write("                <td width=\"80%\">\n");
        out.write("                    <input type=\"submit\" name=\"submit\" id=\"submit\" value=\"");
        if (_jspx_meth_s_005ftext_005f2(_jspx_th_s_005fif_005f0, _jspx_page_context))
          return true;
        out.write("\" />\n");
        out.write("                </td>\n");
        out.write("            </tr>\n");
        out.write("        </table> \n");
        out.write("    </form>\n");
        int evalDoAfterBody = _jspx_th_s_005fif_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005fif_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.reuse(_jspx_th_s_005fif_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.reuse(_jspx_th_s_005fif_005f0);
    return false;
  }

  private boolean _jspx_meth_s_005ftext_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fif_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:text
    org.apache.struts2.views.jsp.TextTag _jspx_th_s_005ftext_005f0 = (org.apache.struts2.views.jsp.TextTag) _005fjspx_005ftagPool_005fs_005ftext_0026_005fname_005fnobody.get(org.apache.struts2.views.jsp.TextTag.class);
    _jspx_th_s_005ftext_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005ftext_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fif_005f0);
    // /WEB-INF/jsps/core/Login.jsp(39,7) name = name type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftext_005f0.setName("loginPage.openIdPrompt");
    int _jspx_eval_s_005ftext_005f0 = _jspx_th_s_005ftext_005f0.doStartTag();
    if (_jspx_th_s_005ftext_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ftext_0026_005fname_005fnobody.reuse(_jspx_th_s_005ftext_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ftext_0026_005fname_005fnobody.reuse(_jspx_th_s_005ftext_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fif_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f0 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fif_005f0);
    // /WEB-INF/jsps/core/Login.jsp(44,21) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f0.setValue("roller_j_openid_security_check");
    int _jspx_eval_c_005furl_005f0 = _jspx_th_c_005furl_005f0.doStartTag();
    if (_jspx_th_c_005furl_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f0);
    return false;
  }

  private boolean _jspx_meth_s_005ftext_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fif_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:text
    org.apache.struts2.views.jsp.TextTag _jspx_th_s_005ftext_005f1 = (org.apache.struts2.views.jsp.TextTag) _005fjspx_005ftagPool_005fs_005ftext_0026_005fname_005fnobody.get(org.apache.struts2.views.jsp.TextTag.class);
    _jspx_th_s_005ftext_005f1.setPageContext(_jspx_page_context);
    _jspx_th_s_005ftext_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fif_005f0);
    // /WEB-INF/jsps/core/Login.jsp(47,46) name = name type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftext_005f1.setName("loginPage.openID");
    int _jspx_eval_s_005ftext_005f1 = _jspx_th_s_005ftext_005f1.doStartTag();
    if (_jspx_th_s_005ftext_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ftext_0026_005fname_005fnobody.reuse(_jspx_th_s_005ftext_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ftext_0026_005fname_005fnobody.reuse(_jspx_th_s_005ftext_005f1);
    return false;
  }

  private boolean _jspx_meth_s_005ftext_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fif_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:text
    org.apache.struts2.views.jsp.TextTag _jspx_th_s_005ftext_005f2 = (org.apache.struts2.views.jsp.TextTag) _005fjspx_005ftagPool_005fs_005ftext_0026_005fname_005fnobody.get(org.apache.struts2.views.jsp.TextTag.class);
    _jspx_th_s_005ftext_005f2.setPageContext(_jspx_page_context);
    _jspx_th_s_005ftext_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fif_005f0);
    // /WEB-INF/jsps/core/Login.jsp(55,74) name = name type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftext_005f2.setName("loginPage.loginOpenID");
    int _jspx_eval_s_005ftext_005f2 = _jspx_th_s_005ftext_005f2.doStartTag();
    if (_jspx_th_s_005ftext_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ftext_0026_005fname_005fnobody.reuse(_jspx_th_s_005ftext_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ftext_0026_005fname_005fnobody.reuse(_jspx_th_s_005ftext_005f2);
    return false;
  }

  private boolean _jspx_meth_s_005fif_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fif_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:if
    org.apache.struts2.views.jsp.IfTag _jspx_th_s_005fif_005f2 = (org.apache.struts2.views.jsp.IfTag) _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.get(org.apache.struts2.views.jsp.IfTag.class);
    _jspx_th_s_005fif_005f2.setPageContext(_jspx_page_context);
    _jspx_th_s_005fif_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fif_005f1);
    // /WEB-INF/jsps/core/Login.jsp(64,4) name = test type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fif_005f2.setTest("openIdConfiguration == 'hybrid'");
    int _jspx_eval_s_005fif_005f2 = _jspx_th_s_005fif_005f2.doStartTag();
    if (_jspx_eval_s_005fif_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fif_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fif_005f2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fif_005f2.doInitBody();
      }
      do {
        out.write("\n");
        out.write("        <p>");
        if (_jspx_meth_s_005ftext_005f3(_jspx_th_s_005fif_005f2, _jspx_page_context))
          return true;
        out.write("</p>\n");
        out.write("    ");
        int evalDoAfterBody = _jspx_th_s_005fif_005f2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005fif_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005fif_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.reuse(_jspx_th_s_005fif_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.reuse(_jspx_th_s_005fif_005f2);
    return false;
  }

  private boolean _jspx_meth_s_005ftext_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fif_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:text
    org.apache.struts2.views.jsp.TextTag _jspx_th_s_005ftext_005f3 = (org.apache.struts2.views.jsp.TextTag) _005fjspx_005ftagPool_005fs_005ftext_0026_005fname_005fnobody.get(org.apache.struts2.views.jsp.TextTag.class);
    _jspx_th_s_005ftext_005f3.setPageContext(_jspx_page_context);
    _jspx_th_s_005ftext_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fif_005f2);
    // /WEB-INF/jsps/core/Login.jsp(65,11) name = name type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftext_005f3.setName("loginPage.openIdHybridPrompt");
    int _jspx_eval_s_005ftext_005f3 = _jspx_th_s_005ftext_005f3.doStartTag();
    if (_jspx_th_s_005ftext_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ftext_0026_005fname_005fnobody.reuse(_jspx_th_s_005ftext_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ftext_0026_005fname_005fnobody.reuse(_jspx_th_s_005ftext_005f3);
    return false;
  }

  private boolean _jspx_meth_s_005fif_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fif_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:if
    org.apache.struts2.views.jsp.IfTag _jspx_th_s_005fif_005f3 = (org.apache.struts2.views.jsp.IfTag) _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.get(org.apache.struts2.views.jsp.IfTag.class);
    _jspx_th_s_005fif_005f3.setPageContext(_jspx_page_context);
    _jspx_th_s_005fif_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fif_005f1);
    // /WEB-INF/jsps/core/Login.jsp(68,4) name = test type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fif_005f3.setTest("openIdConfiguration == 'disabled'");
    int _jspx_eval_s_005fif_005f3 = _jspx_th_s_005fif_005f3.doStartTag();
    if (_jspx_eval_s_005fif_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fif_005f3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fif_005f3.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fif_005f3.doInitBody();
      }
      do {
        out.write("\n");
        out.write("        <p>");
        if (_jspx_meth_s_005ftext_005f4(_jspx_th_s_005fif_005f3, _jspx_page_context))
          return true;
        out.write("</p>\n");
        out.write("    ");
        int evalDoAfterBody = _jspx_th_s_005fif_005f3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005fif_005f3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005fif_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.reuse(_jspx_th_s_005fif_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.reuse(_jspx_th_s_005fif_005f3);
    return false;
  }

  private boolean _jspx_meth_s_005ftext_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fif_005f3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:text
    org.apache.struts2.views.jsp.TextTag _jspx_th_s_005ftext_005f4 = (org.apache.struts2.views.jsp.TextTag) _005fjspx_005ftagPool_005fs_005ftext_0026_005fname_005fnobody.get(org.apache.struts2.views.jsp.TextTag.class);
    _jspx_th_s_005ftext_005f4.setPageContext(_jspx_page_context);
    _jspx_th_s_005ftext_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fif_005f3);
    // /WEB-INF/jsps/core/Login.jsp(69,11) name = name type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftext_005f4.setName("loginPage.prompt");
    int _jspx_eval_s_005ftext_005f4 = _jspx_th_s_005ftext_005f4.doStartTag();
    if (_jspx_th_s_005ftext_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ftext_0026_005fname_005fnobody.reuse(_jspx_th_s_005ftext_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ftext_0026_005fname_005fnobody.reuse(_jspx_th_s_005ftext_005f4);
    return false;
  }

  private boolean _jspx_meth_s_005ftext_005f5(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fif_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:text
    org.apache.struts2.views.jsp.TextTag _jspx_th_s_005ftext_005f5 = (org.apache.struts2.views.jsp.TextTag) _005fjspx_005ftagPool_005fs_005ftext_0026_005fname_005fnobody.get(org.apache.struts2.views.jsp.TextTag.class);
    _jspx_th_s_005ftext_005f5.setPageContext(_jspx_page_context);
    _jspx_th_s_005ftext_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fif_005f1);
    // /WEB-INF/jsps/core/Login.jsp(79,46) name = name type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftext_005f5.setName("loginPage.userName");
    int _jspx_eval_s_005ftext_005f5 = _jspx_th_s_005ftext_005f5.doStartTag();
    if (_jspx_th_s_005ftext_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ftext_0026_005fname_005fnobody.reuse(_jspx_th_s_005ftext_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ftext_0026_005fname_005fnobody.reuse(_jspx_th_s_005ftext_005f5);
    return false;
  }

  private boolean _jspx_meth_s_005ftext_005f6(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fif_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:text
    org.apache.struts2.views.jsp.TextTag _jspx_th_s_005ftext_005f6 = (org.apache.struts2.views.jsp.TextTag) _005fjspx_005ftagPool_005fs_005ftext_0026_005fname_005fnobody.get(org.apache.struts2.views.jsp.TextTag.class);
    _jspx_th_s_005ftext_005f6.setPageContext(_jspx_page_context);
    _jspx_th_s_005ftext_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fif_005f1);
    // /WEB-INF/jsps/core/Login.jsp(86,46) name = name type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftext_005f6.setName("loginPage.password");
    int _jspx_eval_s_005ftext_005f6 = _jspx_th_s_005ftext_005f6.doStartTag();
    if (_jspx_th_s_005ftext_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ftext_0026_005fname_005fnobody.reuse(_jspx_th_s_005ftext_005f6);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ftext_0026_005fname_005fnobody.reuse(_jspx_th_s_005ftext_005f6);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fif_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fif_005f1);
    // /WEB-INF/jsps/core/Login.jsp(92,12) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${rememberMeEnabled}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
    if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("            <tr>\n");
        out.write("                <td width=\"20%\"></td>\n");
        out.write("                <td width=\"80%\">\n");
        out.write("                    <input type=\"checkbox\" name=\"_spring_security_remember_me\" id=\"_spring_security_remember_me\" />\n");
        out.write("                    <label for=\"rememberMe\">\n");
        out.write("                        ");
        if (_jspx_meth_s_005ftext_005f7(_jspx_th_c_005fif_005f0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                    </label>\n");
        out.write("                </td>\n");
        out.write("            </tr>\n");
        out.write("            ");
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

  private boolean _jspx_meth_s_005ftext_005f7(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:text
    org.apache.struts2.views.jsp.TextTag _jspx_th_s_005ftext_005f7 = (org.apache.struts2.views.jsp.TextTag) _005fjspx_005ftagPool_005fs_005ftext_0026_005fname_005fnobody.get(org.apache.struts2.views.jsp.TextTag.class);
    _jspx_th_s_005ftext_005f7.setPageContext(_jspx_page_context);
    _jspx_th_s_005ftext_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f0);
    // /WEB-INF/jsps/core/Login.jsp(98,24) name = name type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftext_005f7.setName("loginPage.rememberMe");
    int _jspx_eval_s_005ftext_005f7 = _jspx_th_s_005ftext_005f7.doStartTag();
    if (_jspx_th_s_005ftext_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ftext_0026_005fname_005fnobody.reuse(_jspx_th_s_005ftext_005f7);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ftext_0026_005fname_005fnobody.reuse(_jspx_th_s_005ftext_005f7);
    return false;
  }

  private boolean _jspx_meth_s_005ftext_005f8(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fif_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:text
    org.apache.struts2.views.jsp.TextTag _jspx_th_s_005ftext_005f8 = (org.apache.struts2.views.jsp.TextTag) _005fjspx_005ftagPool_005fs_005ftext_0026_005fname_005fnobody.get(org.apache.struts2.views.jsp.TextTag.class);
    _jspx_th_s_005ftext_005f8.setPageContext(_jspx_page_context);
    _jspx_th_s_005ftext_005f8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fif_005f1);
    // /WEB-INF/jsps/core/Login.jsp(107,72) name = name type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftext_005f8.setName("loginPage.login");
    int _jspx_eval_s_005ftext_005f8 = _jspx_th_s_005ftext_005f8.doStartTag();
    if (_jspx_th_s_005ftext_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ftext_0026_005fname_005fnobody.reuse(_jspx_th_s_005ftext_005f8);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ftext_0026_005fname_005fnobody.reuse(_jspx_th_s_005ftext_005f8);
    return false;
  }

  private boolean _jspx_meth_s_005ftext_005f9(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fif_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:text
    org.apache.struts2.views.jsp.TextTag _jspx_th_s_005ftext_005f9 = (org.apache.struts2.views.jsp.TextTag) _005fjspx_005ftagPool_005fs_005ftext_0026_005fname_005fnobody.get(org.apache.struts2.views.jsp.TextTag.class);
    _jspx_th_s_005ftext_005f9.setPageContext(_jspx_page_context);
    _jspx_th_s_005ftext_005f9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fif_005f1);
    // /WEB-INF/jsps/core/Login.jsp(108,71) name = name type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftext_005f9.setName("loginPage.reset");
    int _jspx_eval_s_005ftext_005f9 = _jspx_th_s_005ftext_005f9.doStartTag();
    if (_jspx_th_s_005ftext_005f9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ftext_0026_005fname_005fnobody.reuse(_jspx_th_s_005ftext_005f9);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ftext_0026_005fname_005fnobody.reuse(_jspx_th_s_005ftext_005f9);
    return false;
  }

  private boolean _jspx_meth_s_005fif_005f4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:if
    org.apache.struts2.views.jsp.IfTag _jspx_th_s_005fif_005f4 = (org.apache.struts2.views.jsp.IfTag) _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.get(org.apache.struts2.views.jsp.IfTag.class);
    _jspx_th_s_005fif_005f4.setPageContext(_jspx_page_context);
    _jspx_th_s_005fif_005f4.setParent(null);
    // /WEB-INF/jsps/core/Login.jsp(119,0) name = test type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fif_005f4.setTest("openIdConfiguration != 'disabled'");
    int _jspx_eval_s_005fif_005f4 = _jspx_th_s_005fif_005f4.doStartTag();
    if (_jspx_eval_s_005fif_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fif_005f4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fif_005f4.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fif_005f4.doInitBody();
      }
      do {
        out.write("\n");
        out.write("function focusToOpenidForm() {\n");
        out.write("    return (document.getElementById && document.getElementById(\"j_username\") === null) ||\n");
        out.write("        getCookie(\"favorite_authentication_method\") !== \"username\";\n");
        out.write("}\n");
        out.write("\n");
        out.write("if (document.getElementById) {\n");
        out.write("    if (document.getElementById && getCookie(\"openid_identifier\") !== null) {\n");
        out.write("        document.getElementById(\"openid_identifier\").value = getCookie(\"openid_identifier\");\n");
        out.write("    }\n");
        out.write("    if (focusToOpenidForm()) {\n");
        out.write("        document.getElementById(\"openid_identifier\").focus();\n");
        out.write("    }\n");
        out.write("}\n");
        out.write("\n");
        out.write("function saveOpenidIdentifier(theForm) {\n");
        out.write("    var expires = new Date();\n");
        out.write("    expires.setTime(expires.getTime() + 24 * 30 * 60 * 60 * 1000); // sets it for approx 30 days.\n");
        out.write("    setCookie(\"openid_identifier\",theForm.openid_identifier.value,expires);\n");
        out.write("    setCookie(\"favorite_authentication_method\", \"openid\");\n");
        out.write("}\n");
        int evalDoAfterBody = _jspx_th_s_005fif_005f4.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005fif_005f4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005fif_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.reuse(_jspx_th_s_005fif_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.reuse(_jspx_th_s_005fif_005f4);
    return false;
  }

  private boolean _jspx_meth_s_005fif_005f5(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:if
    org.apache.struts2.views.jsp.IfTag _jspx_th_s_005fif_005f5 = (org.apache.struts2.views.jsp.IfTag) _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.get(org.apache.struts2.views.jsp.IfTag.class);
    _jspx_th_s_005fif_005f5.setPageContext(_jspx_page_context);
    _jspx_th_s_005fif_005f5.setParent(null);
    // /WEB-INF/jsps/core/Login.jsp(142,0) name = test type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fif_005f5.setTest("openIdConfiguration != 'only'");
    int _jspx_eval_s_005fif_005f5 = _jspx_th_s_005fif_005f5.doStartTag();
    if (_jspx_eval_s_005fif_005f5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fif_005f5 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fif_005f5.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fif_005f5.doInitBody();
      }
      do {
        out.write("\n");
        out.write("function focusToUsernamePasswordForm() {\n");
        out.write("    return (document.getElementById && document.getElementById(\"openid_identifier\") === null) ||\n");
        out.write("        getCookie(\"favorite_authentication_method\") === \"username\";\n");
        out.write("}\n");
        out.write("\n");
        out.write("if (document.getElementById) {\n");
        out.write("    if (getCookie(\"username\") != null) {\n");
        out.write("        if (document.getElementById) {\n");
        out.write("            document.getElementById(\"j_username\").value = getCookie(\"username\");\n");
        out.write("            if (focusToUsernamePasswordForm()) {\n");
        out.write("                document.getElementById(\"j_password\").focus();\n");
        out.write("            }\n");
        out.write("        }\n");
        out.write("    } else if (focusToUsernamePasswordForm()) {\n");
        out.write("        document.getElementById(\"j_username\").focus();\n");
        out.write("    }\n");
        out.write("}\n");
        out.write("\n");
        out.write("function saveUsername(theForm) {\n");
        out.write("    var expires = new Date();\n");
        out.write("    expires.setTime(expires.getTime() + 24 * 30 * 60 * 60 * 1000); // sets it for approx 30 days.\n");
        out.write("    setCookie(\"username\",theForm.j_username.value,expires);\n");
        out.write("    setCookie(\"favorite_authentication_method\", \"username\");\n");
        out.write("}\n");
        int evalDoAfterBody = _jspx_th_s_005fif_005f5.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005fif_005f5 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005fif_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.reuse(_jspx_th_s_005fif_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.reuse(_jspx_th_s_005fif_005f5);
    return false;
  }
}
