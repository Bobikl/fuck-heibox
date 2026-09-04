package com.tencent.open;

import android.net.Uri;
import android.webkit.WebView;
import com.tencent.open.log.SLog;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: ProGuard */
/* JADX INFO: loaded from: classes4.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected HashMap<String, C0975b> f101029a = new HashMap<>();

    /* JADX INFO: compiled from: ProGuard */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected WeakReference<WebView> f101030a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        protected long f101031b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        protected String f101032c;

        public a(WebView webView, long j10, String str) {
            this.f101030a = new WeakReference<>(webView);
            this.f101031b = j10;
            this.f101032c = str;
        }

        public void a() {
            WebView webView = this.f101030a.get();
            if (webView == null) {
                return;
            }
            webView.loadUrl("javascript:window.JsBridge&&JsBridge.callback(" + this.f101031b + ",{'r':1,'result':'no such method'})");
        }

        public void a(Object obj) {
            String string;
            WebView webView = this.f101030a.get();
            if (webView == null) {
                return;
            }
            if (obj instanceof String) {
                string = "'" + ((Object) ((String) obj).replace("\\", "\\\\").replace("'", "\\'")) + "'";
            } else {
                string = ((obj instanceof Number) || (obj instanceof Long) || (obj instanceof Integer) || (obj instanceof Double) || (obj instanceof Float) || (obj instanceof Boolean)) ? obj.toString() : "'undefined'";
            }
            webView.loadUrl("javascript:window.JsBridge&&JsBridge.callback(" + this.f101031b + ",{'r':0,'result':" + string + "});");
        }

        public void a(String str) {
            WebView webView = this.f101030a.get();
            if (webView != null) {
                webView.loadUrl("javascript:" + str);
            }
        }
    }

    /* JADX INFO: renamed from: com.tencent.open.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ProGuard */
    public static class C0975b {
        public void call(String str, List<String> list, a aVar) {
            Method method;
            Object objInvoke;
            Method[] declaredMethods = getClass().getDeclaredMethods();
            int length = declaredMethods.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    method = null;
                    break;
                }
                method = declaredMethods[i10];
                if (method.getName().equals(str) && method.getParameterTypes().length == list.size()) {
                    break;
                } else {
                    i10++;
                }
            }
            if (method == null) {
                if (aVar != null) {
                    aVar.a();
                    return;
                }
                return;
            }
            try {
                int size = list.size();
                if (size == 0) {
                    objInvoke = method.invoke(this, new Object[0]);
                } else if (size == 1) {
                    objInvoke = method.invoke(this, list.get(0));
                } else if (size == 2) {
                    objInvoke = method.invoke(this, list.get(0), list.get(1));
                } else if (size == 3) {
                    objInvoke = method.invoke(this, list.get(0), list.get(1), list.get(2));
                } else if (size != 4) {
                    objInvoke = size != 5 ? method.invoke(this, list.get(0), list.get(1), list.get(2), list.get(3), list.get(4), list.get(5)) : method.invoke(this, list.get(0), list.get(1), list.get(2), list.get(3), list.get(4));
                } else {
                    objInvoke = method.invoke(this, list.get(0), list.get(1), list.get(2), list.get(3));
                }
                Class<?> returnType = method.getReturnType();
                SLog.d("openSDK_LOG.JsBridge", "-->call, result: " + objInvoke + " | ReturnType: " + returnType.getName());
                if (!"void".equals(returnType.getName()) && returnType != Void.class) {
                    if (aVar == null || !customCallback()) {
                        return;
                    }
                    aVar.a(objInvoke != null ? objInvoke.toString() : null);
                    return;
                }
                if (aVar != null) {
                    aVar.a((Object) null);
                }
            } catch (Exception e10) {
                SLog.e("openSDK_LOG.JsBridge", "-->handler call mehtod ex. targetMethod: " + method, e10);
                if (aVar != null) {
                    aVar.a();
                }
            }
        }

        public boolean customCallback() {
            return false;
        }
    }

    public void a(C0975b c0975b, String str) {
        this.f101029a.put(str, c0975b);
    }

    public void a(String str, String str2, List<String> list, a aVar) {
        SLog.v("openSDK_LOG.JsBridge", "getResult---objName = " + str + " methodName = " + str2);
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            try {
                list.set(i10, URLDecoder.decode(list.get(i10), "UTF-8"));
            } catch (UnsupportedEncodingException e10) {
                e10.printStackTrace();
            }
        }
        C0975b c0975b = this.f101029a.get(str);
        if (c0975b != null) {
            SLog.d("openSDK_LOG.JsBridge", "call----");
            c0975b.call(str2, list, aVar);
        } else {
            SLog.d("openSDK_LOG.JsBridge", "not call----objName NOT FIND");
            if (aVar != null) {
                aVar.a();
            }
        }
    }

    public boolean a(WebView webView, String str) {
        SLog.v("openSDK_LOG.JsBridge", "-->canHandleUrl---url = " + str);
        if (str == null || !Uri.parse(str).getScheme().equals("jsbridge")) {
            return false;
        }
        ArrayList arrayList = new ArrayList(Arrays.asList((str + "/#").split("/")));
        if (arrayList.size() < 6) {
            return false;
        }
        String str2 = (String) arrayList.get(2);
        String str3 = (String) arrayList.get(3);
        List<String> listSubList = arrayList.subList(4, arrayList.size() - 1);
        a aVar = new a(webView, 4L, str);
        webView.getUrl();
        a(str2, str3, listSubList, aVar);
        return true;
    }
}
