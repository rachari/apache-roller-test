package org.apache.jsp.roller_002dui.authoring.editors;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class editor_002dtext_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/WEB-INF/jsps/taglibs-struts2.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005furl_0026_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005furl_0026_005fnamespace_005fid_005faction;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005fparam_0026_005fvalue_005fname_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005ftext_0026_005fname_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005ftextarea_0026_005ftabindex_005frows_005fname_005fcssStyle_005fcols_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fs_005furl_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005furl_0026_005fnamespace_005fid_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005fparam_0026_005fvalue_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005ftext_0026_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005ftextarea_0026_005ftabindex_005frows_005fname_005fcssStyle_005fcols_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fs_005furl_0026_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fs_005furl_0026_005fnamespace_005fid_005faction.release();
    _005fjspx_005ftagPool_005fs_005fparam_0026_005fvalue_005fname_005fnobody.release();
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fs_005ftext_0026_005fname_005fnobody.release();
    _005fjspx_005ftagPool_005fs_005ftextarea_0026_005ftabindex_005frows_005fname_005fcssStyle_005fcols_005fnobody.release();
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
      out.write("<link rel=\"stylesheet\" type=\"text/css\" \n");
      out.write("   href='");
      if (_jspx_meth_s_005furl_005f0(_jspx_page_context))
        return;
      out.write("'</link>\n");
      out.write("\n");
      out.write("\n");
      out.write("<style>\n");
      out.write("    a:link, a:visited, a:hover, a:active     { text-decoration:underline; }\n");
      out.write("    body        {\n");
      out.write("        margin:0;\n");
      out.write("        padding:0;\n");
      out.write("        text-align:left;\n");
      out.write("    }\n");
      out.write("    h1          {\n");
      out.write("        font-size:20px;\n");
      out.write("        font-weight:bold;\n");
      out.write("    }\n");
      out.write("    .yui-overlay {\n");
      out.write("        position:fixed;\n");
      out.write("        background: #ffffff;\n");
      out.write("        z-index: 112;\n");
      out.write("        color:#000000;\n");
      out.write("        border: 4px solid #525252;\n");
      out.write("        text-align:left;\n");
      out.write("        top: 50%;\n");
      out.write("        left: 50%;\n");
      out.write("    }\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("<!--\n");
      out.write("    YAHOO.namespace(\"mediaFileEditor\");\n");
      out.write("\n");
      out.write("    function init() {\n");
      out.write("\n");
      out.write("        if (getCookie(\"editorSize1\") != null) {\n");
      out.write("            document.getElementById('entry_bean_text').rows = getCookie(\"editorSize1\");\n");
      out.write("        }\n");
      out.write("        if (getCookie(\"editorSize\") != null) {\n");
      out.write("            document.getElementById('entry_bean_summary').rows = getCookie(\"editorSize\");\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        YAHOO.mediaFileEditor.lightbox = new YAHOO.widget.Panel(\n");
      out.write("            \"mediafile_edit_lightbox\", {\n");
      out.write("                modal:    true,\n");
      out.write("                width:   \"600px\",\n");
      out.write("                height:  \"600px\",\n");
      out.write("                visible: false,\n");
      out.write("                fixedcenter: true,\n");
      out.write("                constraintoviewport: true\n");
      out.write("            }\n");
      out.write("        );\n");
      out.write("        YAHOO.mediaFileEditor.lightbox.render(document.body);\n");
      out.write("    }\n");
      out.write("    YAHOO.util.Event.addListener(window, \"load\", init);\n");
      out.write("\n");
      out.write("    function onClose(textForInsertion)\n");
      out.write("    {\n");
      out.write("        document.getElementById('overlay').style.display = 'none';\n");
      out.write("        document.getElementById('overlay_img').style.visibility = 'hidden';\n");
      out.write("        if (textForInsertion && textForInsertion.length > 0) {\n");
      out.write("            insertAtCursor(document.getElementById('entry_bean_text'), textForInsertion);\n");
      out.write("        }\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    function insertAtCursor(textAreaElement, valueForInsertion) {\n");
      out.write("        if (document.selection) {\n");
      out.write("            textAreaElement.focus();\n");
      out.write("            var range = document.selection.createRange();\n");
      out.write("            range.text = valueForInsertion;\n");
      out.write("        }\n");
      out.write("        else if (textAreaElement.selectionStart || textAreaElement.selectionStart == '0') {\n");
      out.write("\n");
      out.write("            var preText;\n");
      out.write("            var postText;\n");
      out.write("            if (textAreaElement.selectionStart == 0) {\n");
      out.write("                preText = '';\n");
      out.write("                postText = '';\n");
      out.write("            }\n");
      out.write("            else {\n");
      out.write("                preText = textAreaElement.value.substring(0, textAreaElement.selectionStart);\n");
      out.write("                postText = textAreaElement.value.substring(textAreaElement.selectionEnd, textAreaElement.value.length);\n");
      out.write("            }\n");
      out.write("            textAreaElement.value =  preText + valueForInsertion + postText;\n");
      out.write("            textAreaElement.selectionStart = preText.length + valueForInsertion.length;\n");
      out.write("            textAreaElement.selectionEnd = textAreaElement.selectionStart;\n");
      out.write("            textAreaElement.focus();\n");
      out.write("        } else {\n");
      out.write("            textAreaElement.value += valueForInsertion;\n");
      out.write("            textAreaElement.focus();\n");
      out.write("        }\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    function onClickAddImage(){\n");
      out.write("        ");
      if (_jspx_meth_s_005furl_005f1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("        $(\"#mediaFileEditor\").attr('src','");
      if (_jspx_meth_s_005fproperty_005f0(_jspx_page_context))
        return;
      out.write("');\n");
      out.write("        YAHOO.mediaFileEditor.lightbox.show();\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    function onClose() {\n");
      out.write("        $(\"#mediaFileEditor\").attr('src','about:blank');\n");
      out.write("        YAHOO.mediaFileEditor.lightbox.hide();\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    function onSelectImage(name, url) {\n");
      out.write("        $(\"#mediaFileEditor\").attr('src','about:blank');\n");
      out.write("        YAHOO.mediaFileEditor.lightbox.hide();\n");
      out.write("        insertAtCursor(document.getElementById('entry_bean_text'),\n");
      out.write("            '<a href=\"' + url + '\"><img src=\"' + url + '?t=true\" alt=\"' + name+ '\"></img></a>');\n");
      out.write("    }\n");
      out.write("-->\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("    <!--\n");
      out.write("    function editorCleanup() {\n");
      out.write("        // no-op\n");
      out.write("    }\n");
      out.write("    function changeSize(e, num) {\n");
      out.write("        a = e.rows + num;\n");
      out.write("        if (a > 0) e.rows = a;\n");
      out.write("        var expires = new Date();\n");
      out.write("        expires.setTime(expires.getTime() + 24 * 90 * 60 * 60 * 1000); // sets it for approx 90 days.\n");
      out.write("        setCookie(\"editorSize\",e.rows,expires);\n");
      out.write("    }\n");
      out.write("    function changeSize1(e, num) {\n");
      out.write("        a = e.rows + num;\n");
      out.write("        if (a > 0) e.rows = a;\n");
      out.write("        var expires = new Date();\n");
      out.write("        expires.setTime(expires.getTime() + 24 * 90 * 60 * 60 * 1000); // sets it for approx 90 days.\n");
      out.write("        setCookie(\"editorSize1\",e.rows,expires);\n");
      out.write("    }\n");
      out.write("    // -->\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<p class=\"toplabel\">\n");
      out.write("    <span style=\"float:left;\">");
      if (_jspx_meth_s_005ftext_005f0(_jspx_page_context))
        return;
      out.write("</span>\n");
      out.write("    <span style=\"font-weight:normal;float:right;\">\n");
      out.write("        <a href=\"#\" onClick=\"onClickAddImage();\">Add Image</a>&nbsp;\n");
      out.write("    </span>\n");
      out.write("</p>\n");
      out.write("\n");
      if (_jspx_meth_s_005ftextarea_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("<table style=\"width:100%\"><tr><td align=\"right\">\n");
      out.write("    <!-- Add buttons to make this textarea taller or shorter -->\n");
      out.write("    <input type=\"button\" name=\"taller\" value=\" &darr; \"\n");
      out.write("           onclick=\"changeSize1(document.getElementById('entry_bean_text'), 5)\" />\n");
      out.write("    <input type=\"button\" name=\"shorter\" value=\" &uarr; \"\n");
      out.write("           onclick=\"changeSize1(document.getElementById('entry_bean_text'), -5)\" />\n");
      out.write("</td></tr></table>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<p class=\"toplabel\">");
      if (_jspx_meth_s_005ftext_005f1(_jspx_page_context))
        return;
      out.write("</p>\n");
      out.write("\n");
      if (_jspx_meth_s_005ftextarea_005f1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("<table style=\"width:100%\"><tr><td align=\"right\">\n");
      out.write("    <!-- Add buttons to make this textarea taller or shorter -->\n");
      out.write("    <input type=\"button\" name=\"taller\" value=\" &darr; \"\n");
      out.write("           onclick=\"changeSize(document.getElementById('entry_bean_summary'), 5)\" />\n");
      out.write("    <input type=\"button\" name=\"shorter\" value=\" &uarr; \"\n");
      out.write("           onclick=\"changeSize(document.getElementById('entry_bean_summary'), -5)\" />\n");
      out.write("</td></tr></table>\n");
      out.write("\n");
      out.write("\n");
      out.write("<div id=\"mediafile_edit_lightbox\" style=\"visibility:hidden\">\n");
      out.write("    <div class=\"hd\">");
      if (_jspx_meth_s_005ftext_005f2(_jspx_page_context))
        return;
      out.write("</div>\n");
      out.write("    <div class=\"bd\">\n");
      out.write("        <iframe id=\"mediaFileEditor\"\n");
      out.write("                style=\"visibility:inherit\"\n");
      out.write("                height=\"100%\"\n");
      out.write("                width=\"100%\"\n");
      out.write("                frameborder=\"no\"\n");
      out.write("                scrolling=\"auto\">\n");
      out.write("        </iframe>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"ft\"></div>\n");
      out.write("</div>\n");
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
    // /WEB-INF/jsps/taglibs-struts2.jsp(27,9) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005furl_005f0.setValue("/roller-ui/yui/tabview/assets/skins/sam/tabview.css");
    int _jspx_eval_s_005furl_005f0 = _jspx_th_s_005furl_005f0.doStartTag();
    if (_jspx_th_s_005furl_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005furl_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005furl_005f0);
    return false;
  }

  private boolean _jspx_meth_s_005furl_005f1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:url
    org.apache.struts2.views.jsp.URLTag _jspx_th_s_005furl_005f1 = (org.apache.struts2.views.jsp.URLTag) _005fjspx_005ftagPool_005fs_005furl_0026_005fnamespace_005fid_005faction.get(org.apache.struts2.views.jsp.URLTag.class);
    _jspx_th_s_005furl_005f1.setPageContext(_jspx_page_context);
    _jspx_th_s_005furl_005f1.setParent(null);
    // /roller-ui/authoring/editors/editor-text.jsp(109,8) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005furl_005f1.setId("mediaFileImageChooser");
    // /roller-ui/authoring/editors/editor-text.jsp(109,8) name = action type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005furl_005f1.setAction("mediaFileImageChooser");
    // /roller-ui/authoring/editors/editor-text.jsp(109,8) name = namespace type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005furl_005f1.setNamespace("overlay");
    int _jspx_eval_s_005furl_005f1 = _jspx_th_s_005furl_005f1.doStartTag();
    if (_jspx_eval_s_005furl_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005furl_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005furl_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005furl_005f1.doInitBody();
      }
      do {
        out.write("\n");
        out.write("            ");
        if (_jspx_meth_s_005fparam_005f0(_jspx_th_s_005furl_005f1, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("        ");
        int evalDoAfterBody = _jspx_th_s_005furl_005f1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005furl_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005furl_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005furl_0026_005fnamespace_005fid_005faction.reuse(_jspx_th_s_005furl_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005furl_0026_005fnamespace_005fid_005faction.reuse(_jspx_th_s_005furl_005f1);
    return false;
  }

  private boolean _jspx_meth_s_005fparam_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005furl_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:param
    org.apache.struts2.views.jsp.ParamTag _jspx_th_s_005fparam_005f0 = (org.apache.struts2.views.jsp.ParamTag) _005fjspx_005ftagPool_005fs_005fparam_0026_005fvalue_005fname_005fnobody.get(org.apache.struts2.views.jsp.ParamTag.class);
    _jspx_th_s_005fparam_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005fparam_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005furl_005f1);
    // /roller-ui/authoring/editors/editor-text.jsp(110,12) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fparam_005f0.setName("weblog");
    // /roller-ui/authoring/editors/editor-text.jsp(110,12) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fparam_005f0.setValue("%{actionWeblog.handle}");
    int _jspx_eval_s_005fparam_005f0 = _jspx_th_s_005fparam_005f0.doStartTag();
    if (_jspx_th_s_005fparam_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fparam_0026_005fvalue_005fname_005fnobody.reuse(_jspx_th_s_005fparam_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fparam_0026_005fvalue_005fname_005fnobody.reuse(_jspx_th_s_005fparam_005f0);
    return false;
  }

  private boolean _jspx_meth_s_005fproperty_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f0 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f0.setParent(null);
    // /roller-ui/authoring/editors/editor-text.jsp(112,42) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fproperty_005f0.setValue("%{mediaFileImageChooser}");
    int _jspx_eval_s_005fproperty_005f0 = _jspx_th_s_005fproperty_005f0.doStartTag();
    if (_jspx_th_s_005fproperty_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f0);
    return false;
  }

  private boolean _jspx_meth_s_005ftext_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:text
    org.apache.struts2.views.jsp.TextTag _jspx_th_s_005ftext_005f0 = (org.apache.struts2.views.jsp.TextTag) _005fjspx_005ftagPool_005fs_005ftext_0026_005fname_005fnobody.get(org.apache.struts2.views.jsp.TextTag.class);
    _jspx_th_s_005ftext_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005ftext_005f0.setParent(null);
    // /roller-ui/authoring/editors/editor-text.jsp(156,30) name = name type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftext_005f0.setName("weblogEdit.content");
    int _jspx_eval_s_005ftext_005f0 = _jspx_th_s_005ftext_005f0.doStartTag();
    if (_jspx_th_s_005ftext_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ftext_0026_005fname_005fnobody.reuse(_jspx_th_s_005ftext_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ftext_0026_005fname_005fnobody.reuse(_jspx_th_s_005ftext_005f0);
    return false;
  }

  private boolean _jspx_meth_s_005ftextarea_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:textarea
    org.apache.struts2.views.jsp.ui.TextareaTag _jspx_th_s_005ftextarea_005f0 = (org.apache.struts2.views.jsp.ui.TextareaTag) _005fjspx_005ftagPool_005fs_005ftextarea_0026_005ftabindex_005frows_005fname_005fcssStyle_005fcols_005fnobody.get(org.apache.struts2.views.jsp.ui.TextareaTag.class);
    _jspx_th_s_005ftextarea_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005ftextarea_005f0.setParent(null);
    // /roller-ui/authoring/editors/editor-text.jsp(162,0) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextarea_005f0.setName("bean.text");
    // /roller-ui/authoring/editors/editor-text.jsp(162,0) name = cols type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextarea_005f0.setCols("75");
    // /roller-ui/authoring/editors/editor-text.jsp(162,0) name = rows type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextarea_005f0.setRows("25");
    // /roller-ui/authoring/editors/editor-text.jsp(162,0) name = cssStyle type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextarea_005f0.setCssStyle("width: 100%");
    // /roller-ui/authoring/editors/editor-text.jsp(162,0) name = tabindex type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextarea_005f0.setTabindex("5");
    int _jspx_eval_s_005ftextarea_005f0 = _jspx_th_s_005ftextarea_005f0.doStartTag();
    if (_jspx_th_s_005ftextarea_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ftextarea_0026_005ftabindex_005frows_005fname_005fcssStyle_005fcols_005fnobody.reuse(_jspx_th_s_005ftextarea_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ftextarea_0026_005ftabindex_005frows_005fname_005fcssStyle_005fcols_005fnobody.reuse(_jspx_th_s_005ftextarea_005f0);
    return false;
  }

  private boolean _jspx_meth_s_005ftext_005f1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:text
    org.apache.struts2.views.jsp.TextTag _jspx_th_s_005ftext_005f1 = (org.apache.struts2.views.jsp.TextTag) _005fjspx_005ftagPool_005fs_005ftext_0026_005fname_005fnobody.get(org.apache.struts2.views.jsp.TextTag.class);
    _jspx_th_s_005ftext_005f1.setPageContext(_jspx_page_context);
    _jspx_th_s_005ftext_005f1.setParent(null);
    // /roller-ui/authoring/editors/editor-text.jsp(174,20) name = name type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftext_005f1.setName("weblogEdit.summary");
    int _jspx_eval_s_005ftext_005f1 = _jspx_th_s_005ftext_005f1.doStartTag();
    if (_jspx_th_s_005ftext_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ftext_0026_005fname_005fnobody.reuse(_jspx_th_s_005ftext_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ftext_0026_005fname_005fnobody.reuse(_jspx_th_s_005ftext_005f1);
    return false;
  }

  private boolean _jspx_meth_s_005ftextarea_005f1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:textarea
    org.apache.struts2.views.jsp.ui.TextareaTag _jspx_th_s_005ftextarea_005f1 = (org.apache.struts2.views.jsp.ui.TextareaTag) _005fjspx_005ftagPool_005fs_005ftextarea_0026_005ftabindex_005frows_005fname_005fcssStyle_005fcols_005fnobody.get(org.apache.struts2.views.jsp.ui.TextareaTag.class);
    _jspx_th_s_005ftextarea_005f1.setPageContext(_jspx_page_context);
    _jspx_th_s_005ftextarea_005f1.setParent(null);
    // /roller-ui/authoring/editors/editor-text.jsp(176,0) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextarea_005f1.setName("bean.summary");
    // /roller-ui/authoring/editors/editor-text.jsp(176,0) name = cols type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextarea_005f1.setCols("75");
    // /roller-ui/authoring/editors/editor-text.jsp(176,0) name = rows type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextarea_005f1.setRows("5");
    // /roller-ui/authoring/editors/editor-text.jsp(176,0) name = cssStyle type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextarea_005f1.setCssStyle("width: 100%");
    // /roller-ui/authoring/editors/editor-text.jsp(176,0) name = tabindex type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextarea_005f1.setTabindex("6");
    int _jspx_eval_s_005ftextarea_005f1 = _jspx_th_s_005ftextarea_005f1.doStartTag();
    if (_jspx_th_s_005ftextarea_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ftextarea_0026_005ftabindex_005frows_005fname_005fcssStyle_005fcols_005fnobody.reuse(_jspx_th_s_005ftextarea_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ftextarea_0026_005ftabindex_005frows_005fname_005fcssStyle_005fcols_005fnobody.reuse(_jspx_th_s_005ftextarea_005f1);
    return false;
  }

  private boolean _jspx_meth_s_005ftext_005f2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:text
    org.apache.struts2.views.jsp.TextTag _jspx_th_s_005ftext_005f2 = (org.apache.struts2.views.jsp.TextTag) _005fjspx_005ftagPool_005fs_005ftext_0026_005fname_005fnobody.get(org.apache.struts2.views.jsp.TextTag.class);
    _jspx_th_s_005ftext_005f2.setPageContext(_jspx_page_context);
    _jspx_th_s_005ftext_005f2.setParent(null);
    // /roller-ui/authoring/editors/editor-text.jsp(188,20) name = name type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftext_005f2.setName("mediaFileChooser.popupTitle");
    int _jspx_eval_s_005ftext_005f2 = _jspx_th_s_005ftext_005f2.doStartTag();
    if (_jspx_th_s_005ftext_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ftext_0026_005fname_005fnobody.reuse(_jspx_th_s_005ftext_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ftext_0026_005fname_005fnobody.reuse(_jspx_th_s_005ftext_005f2);
    return false;
  }
}
