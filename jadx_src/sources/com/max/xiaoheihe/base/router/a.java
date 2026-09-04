package com.max.xiaoheihe.base.router;

import android.content.Context;
import android.webkit.WebView;
import bb.c;
import com.google.gson.JsonObject;
import com.max.hbminiprogram.h;
import com.max.hbutils.utils.k;
import com.max.xiaoheihe.module.bbs.post.PostPageFactory;
import com.max.xiaoheihe.module.bbs.post_edit.PostTabActivity;
import com.max.xiaoheihe.module.webview.t;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.tencent.qcloud.core.util.IOUtils;
import dl.d;
import dl.e;
import java.util.HashMap;
import kotlin.jvm.internal.f0;
import kotlin.text.u;

/* JADX INFO: compiled from: RouterPathActionManager.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class a {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static final void a(@d Context context, @e WebView webView, @e String str, @d HashMap<String, Object> params, @e t tVar) {
        String url;
        if (PatchProxy.proxy(new Object[]{context, webView, str, params, tVar}, null, changeQuickRedirect, true, c.m.DJ, new Class[]{Context.class, WebView.class, String.class, HashMap.class, t.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(context, "context");
        f0.p(params, "params");
        if (str != null) {
            if (!u.v2(str, "/", false, 2, null)) {
                str = IOUtils.DIR_SEPARATOR_UNIX + str;
            }
            if (!f0.g(str, lb.d.A0)) {
                if (f0.g(str, lb.d.S)) {
                    params.put(PostPageFactory.f81485u, Boolean.TRUE);
                    return;
                }
                return;
            }
            if (tVar != null) {
                Object obj = params.get("post_success_js_callback");
                String str2 = obj instanceof String ? (String) obj : null;
                if (str2 != null) {
                    tVar.V0(str2);
                }
            }
            h hVar = context instanceof h ? (h) context : null;
            if (hVar != null) {
                params.put("source", ob.b.f132259k);
                JsonObject jsonObject = new JsonObject();
                jsonObject.addProperty("mini_program_id", hVar.B());
                if (webView != null && (url = webView.getUrl()) != null) {
                    jsonObject.addProperty("mini_program_url", url);
                }
                String strP = k.p(jsonObject);
                if (strP == null) {
                    strP = "";
                } else {
                    f0.o(strP, "JsonUtils.serialize(reportExtra) ?: \"\"");
                }
                params.put(PostTabActivity.J3, strP);
            }
        }
    }
}
