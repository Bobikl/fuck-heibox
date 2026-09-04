package ka;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.webkit.CookieManager;
import com.lzy.okgo.cookie.SerializableCookie;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import okhttp3.Cookie;
import okhttp3.t;

/* JADX INFO: compiled from: SPCookieStore.java */
/* JADX INFO: loaded from: classes6.dex */
public class d implements a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f124458c = "okgo_cookie";
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f124459d = "cookie_";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<String, ConcurrentHashMap<String, Cookie>> f124460a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SharedPreferences f124461b;

    public d(Context context) {
        Cookie cookieDecodeCookie;
        SharedPreferences sharedPreferences = context.getSharedPreferences(f124458c, 0);
        this.f124461b = sharedPreferences;
        this.f124460a = new HashMap();
        for (Map.Entry<String, ?> entry : sharedPreferences.getAll().entrySet()) {
            if (entry.getValue() != null && !entry.getKey().startsWith(f124459d)) {
                for (String str : TextUtils.split((String) entry.getValue(), Constants.ACCEPT_TIME_SEPARATOR_SP)) {
                    String string = this.f124461b.getString(f124459d + str, null);
                    if (string != null && (cookieDecodeCookie = SerializableCookie.decodeCookie(string)) != null) {
                        if (!this.f124460a.containsKey(entry.getKey())) {
                            this.f124460a.put(entry.getKey(), new ConcurrentHashMap<>());
                        }
                        this.f124460a.get(entry.getKey()).put(str, cookieDecodeCookie);
                    }
                }
            }
        }
    }

    private String j(Cookie cookie) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{cookie}, this, changeQuickRedirect, false, bb.c.b.N5, new Class[]{Cookie.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return cookie.name() + "@" + cookie.domain() + cookie.path();
    }

    private static boolean l(Cookie cookie) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{cookie}, null, changeQuickRedirect, true, bb.c.b.O5, new Class[]{Cookie.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        return cookie.expiresAt() < System.currentTimeMillis();
    }

    private void m(t tVar, Cookie cookie, String str) {
        if (PatchProxy.proxy(new Object[]{tVar, cookie, str}, this, changeQuickRedirect, false, bb.c.b.R5, new Class[]{t.class, Cookie.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f124460a.get(tVar.getHost()).put(str, cookie);
        SharedPreferences.Editor editorEdit = this.f124461b.edit();
        editorEdit.putString(tVar.getHost(), TextUtils.join(Constants.ACCEPT_TIME_SEPARATOR_SP, this.f124460a.get(tVar.getHost()).keySet()));
        editorEdit.putString(f124459d + str, SerializableCookie.encodeCookie(tVar.getHost(), cookie));
        editorEdit.apply();
        CookieManager cookieManager = CookieManager.getInstance();
        cookieManager.setAcceptCookie(true);
        cookieManager.setCookie("https://" + cookie.domain() + cookie.path(), cookie.toString());
        cookieManager.flush();
    }

    @Override // ka.a
    public synchronized List<Cookie> a(t tVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{tVar}, this, changeQuickRedirect, false, bb.c.b.X5, new Class[]{t.class}, List.class);
        if (patchProxyResultProxy.isSupported) {
            return (List) patchProxyResultProxy.result;
        }
        ArrayList arrayList = new ArrayList();
        ConcurrentHashMap<String, Cookie> concurrentHashMap = this.f124460a.get(tVar.getHost());
        if (concurrentHashMap != null && !concurrentHashMap.isEmpty()) {
            for (Cookie cookie : concurrentHashMap.values()) {
                if (cookie.path().equals("/")) {
                    arrayList.add(cookie);
                } else if (tVar.a0().getPath().contains(cookie.path())) {
                    arrayList.add(cookie);
                }
            }
        }
        return arrayList;
    }

    @Override // ka.a
    public synchronized boolean b(t tVar, Cookie cookie) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{tVar, cookie}, this, changeQuickRedirect, false, bb.c.b.T5, new Class[]{t.class, Cookie.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (!this.f124460a.containsKey(tVar.getHost())) {
            return false;
        }
        String strJ = j(cookie);
        if (!this.f124460a.get(tVar.getHost()).containsKey(strJ)) {
            return false;
        }
        this.f124460a.get(tVar.getHost()).remove(strJ);
        SharedPreferences.Editor editorEdit = this.f124461b.edit();
        if (this.f124461b.contains(f124459d + strJ)) {
            editorEdit.remove(f124459d + strJ);
        }
        editorEdit.putString(tVar.getHost(), TextUtils.join(Constants.ACCEPT_TIME_SEPARATOR_SP, this.f124460a.get(tVar.getHost()).keySet()));
        editorEdit.apply();
        return true;
    }

    @Override // ka.a
    public synchronized boolean c() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.V5, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        this.f124460a.clear();
        SharedPreferences.Editor editorEdit = this.f124461b.edit();
        editorEdit.clear();
        editorEdit.apply();
        return true;
    }

    @Override // ka.a
    public synchronized boolean d(t tVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{tVar}, this, changeQuickRedirect, false, bb.c.b.U5, new Class[]{t.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (!this.f124460a.containsKey(tVar.getHost())) {
            return false;
        }
        Set<String> setKeySet = this.f124460a.remove(tVar.getHost()).keySet();
        SharedPreferences.Editor editorEdit = this.f124461b.edit();
        for (String str : setKeySet) {
            if (this.f124461b.contains(f124459d + str)) {
                editorEdit.remove(f124459d + str);
            }
        }
        editorEdit.remove(tVar.getHost());
        editorEdit.apply();
        return true;
    }

    @Override // ka.a
    public synchronized List<Cookie> e(t tVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{tVar}, this, changeQuickRedirect, false, 460, new Class[]{t.class}, List.class);
        if (patchProxyResultProxy.isSupported) {
            return (List) patchProxyResultProxy.result;
        }
        ArrayList arrayList = new ArrayList();
        if (!this.f124460a.containsKey(tVar.getHost())) {
            return arrayList;
        }
        for (Cookie cookie : this.f124460a.get(tVar.getHost()).values()) {
            if (l(cookie)) {
                b(tVar, cookie);
            } else {
                arrayList.add(cookie);
            }
        }
        return arrayList;
    }

    @Override // ka.a
    public synchronized void f(t tVar, List<Cookie> list) {
        if (PatchProxy.proxy(new Object[]{tVar, list}, this, changeQuickRedirect, false, bb.c.b.P5, new Class[]{t.class, List.class}, Void.TYPE).isSupported) {
            return;
        }
        Iterator<Cookie> it = list.iterator();
        while (it.hasNext()) {
            h(tVar, it.next());
        }
    }

    @Override // ka.a
    public synchronized List<Cookie> g() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.W5, new Class[0], List.class);
        if (patchProxyResultProxy.isSupported) {
            return (List) patchProxyResultProxy.result;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = this.f124460a.keySet().iterator();
        while (it.hasNext()) {
            arrayList.addAll(this.f124460a.get(it.next()).values());
        }
        return arrayList;
    }

    @Override // ka.a
    public synchronized void h(t tVar, Cookie cookie) {
        if (PatchProxy.proxy(new Object[]{tVar, cookie}, this, changeQuickRedirect, false, bb.c.b.Q5, new Class[]{t.class, Cookie.class}, Void.TYPE).isSupported) {
            return;
        }
        if (!this.f124460a.containsKey(tVar.getHost())) {
            this.f124460a.put(tVar.getHost(), new ConcurrentHashMap<>());
        }
        if (l(cookie)) {
            b(tVar, cookie);
        } else {
            m(tVar, cookie, j(cookie));
        }
    }

    public synchronized Map<String, List<Cookie>> i() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.Z5, new Class[0], Map.class);
        if (patchProxyResultProxy.isSupported) {
            return (Map) patchProxyResultProxy.result;
        }
        HashMap map = new HashMap();
        for (String str : this.f124460a.keySet()) {
            ConcurrentHashMap<String, Cookie> concurrentHashMap = this.f124460a.get(str);
            if (concurrentHashMap != null) {
                map.put(str, new ArrayList(concurrentHashMap.values()));
            }
        }
        return map;
    }

    public synchronized List<Cookie> k(t tVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{tVar}, this, changeQuickRedirect, false, bb.c.b.Y5, new Class[]{t.class}, List.class);
        if (patchProxyResultProxy.isSupported) {
            return (List) patchProxyResultProxy.result;
        }
        ArrayList arrayList = new ArrayList();
        ConcurrentHashMap<String, Cookie> concurrentHashMap = this.f124460a.get(tVar.getHost());
        if (concurrentHashMap != null) {
            arrayList.addAll(concurrentHashMap.values());
        }
        return arrayList;
    }
}
