package com.max.xiaoheihe.module.webview.interceptrequest;

import android.webkit.JavascriptInterface;
import com.max.xiaoheihe.bean.webintercept.IpDirectObj;
import com.max.xiaoheihe.bean.webintercept.TagJsObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.xiaomi.mipush.sdk.Constants;
import java.io.IOException;
import java.util.Map;
import org.jsoup.nodes.Document;

/* JADX INFO: compiled from: AjaxInterceptJavascriptInterface.java */
/* JADX INFO: loaded from: classes12.dex */
public class a {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private d f94704a;

    public a(d dVar) {
        this.f94704a = dVar;
    }

    public static String a(IpDirectObj ipDirectObj, byte[] bArr) throws IOException {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{ipDirectObj, bArr}, null, changeQuickRedirect, true, 47572, new Class[]{IpDirectObj.class, byte[].class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        Document documentJ = el.a.j(new String(bArr));
        documentJ.Z1().l(true);
        if (ipDirectObj != null && !com.max.hbcommon.utils.c.w(ipDirectObj.getIntercept_request_js_list())) {
            for (TagJsObj tagJsObj : ipDirectObj.getIntercept_request_js_list()) {
                if (tagJsObj.getTag() != null && tagJsObj.getJs() != null) {
                    org.jsoup.select.c cVarU0 = documentJ.U0(tagJsObj.getTag());
                    if (cVarU0.size() > 0) {
                        cVarU0.get(0).h0(tagJsObj.getJs());
                    }
                }
            }
        }
        return documentJ.toString();
    }

    @JavascriptInterface
    public void customAjax(String str, String str2) {
        d dVar;
        if (PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, 47573, new Class[]{String.class, String.class}, Void.TYPE).isSupported || (dVar = this.f94704a) == null) {
            return;
        }
        dVar.a(str, str2);
    }

    @JavascriptInterface
    public String getHostList() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47574, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        if (this.f94704a.f() == null || this.f94704a.f().getDomain_ip_list() == null || this.f94704a.f().getDomain_ip_list() == null) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        for (Map.Entry<String, String> entry : this.f94704a.f().getDomain_ip_list().entrySet()) {
            if (sb2.length() > 0) {
                sb2.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
            }
            sb2.append(entry.getKey());
        }
        return sb2.toString();
    }
}
