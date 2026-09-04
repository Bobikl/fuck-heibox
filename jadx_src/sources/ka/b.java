package ka;

import android.content.Context;
import com.lzy.okgo.cookie.SerializableCookie;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import okhttp3.Cookie;
import okhttp3.t;

/* JADX INFO: compiled from: DBCookieStore.java */
/* JADX INFO: loaded from: classes6.dex */
public class b implements a {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<String, ConcurrentHashMap<String, Cookie>> f124456a;

    public b(Context context) {
        com.lzy.okgo.db.d.L(context);
        this.f124456a = new HashMap();
        for (SerializableCookie serializableCookie : com.lzy.okgo.db.d.K().t()) {
            if (!this.f124456a.containsKey(serializableCookie.host)) {
                this.f124456a.put(serializableCookie.host, new ConcurrentHashMap<>());
            }
            Cookie cookie = serializableCookie.getCookie();
            this.f124456a.get(serializableCookie.host).put(i(cookie), cookie);
        }
    }

    private String i(Cookie cookie) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{cookie}, this, changeQuickRedirect, false, bb.c.b.f30989v5, new Class[]{Cookie.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return cookie.name() + "@" + cookie.domain();
    }

    private static boolean j(Cookie cookie) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{cookie}, null, changeQuickRedirect, true, bb.c.b.f31011w5, new Class[]{Cookie.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        return cookie.expiresAt() < System.currentTimeMillis();
    }

    @Override // ka.a
    public synchronized List<Cookie> a(t tVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{tVar}, this, changeQuickRedirect, false, bb.c.b.E5, new Class[]{t.class}, List.class);
        if (patchProxyResultProxy.isSupported) {
            return (List) patchProxyResultProxy.result;
        }
        ArrayList arrayList = new ArrayList();
        ConcurrentHashMap<String, Cookie> concurrentHashMap = this.f124456a.get(tVar.getHost());
        if (concurrentHashMap != null) {
            arrayList.addAll(concurrentHashMap.values());
        }
        return arrayList;
    }

    @Override // ka.a
    public synchronized boolean b(t tVar, Cookie cookie) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{tVar, cookie}, this, changeQuickRedirect, false, bb.c.b.A5, new Class[]{t.class, Cookie.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (!this.f124456a.containsKey(tVar.getHost())) {
            return false;
        }
        String strI = i(cookie);
        if (!this.f124456a.get(tVar.getHost()).containsKey(strI)) {
            return false;
        }
        this.f124456a.get(tVar.getHost()).remove(strI);
        com.lzy.okgo.db.d.K().c("host=? and name=? and domain=?", new String[]{tVar.getHost(), cookie.name(), cookie.domain()});
        return true;
    }

    @Override // ka.a
    public synchronized boolean c() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 444, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        this.f124456a.clear();
        com.lzy.okgo.db.d.K().e();
        return true;
    }

    @Override // ka.a
    public synchronized boolean d(t tVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{tVar}, this, changeQuickRedirect, false, 443, new Class[]{t.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (!this.f124456a.containsKey(tVar.getHost())) {
            return false;
        }
        this.f124456a.remove(tVar.getHost());
        com.lzy.okgo.db.d.K().c("host=?", new String[]{tVar.getHost()});
        return true;
    }

    @Override // ka.a
    public synchronized List<Cookie> e(t tVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{tVar}, this, changeQuickRedirect, false, bb.c.b.f31077z5, new Class[]{t.class}, List.class);
        if (patchProxyResultProxy.isSupported) {
            return (List) patchProxyResultProxy.result;
        }
        ArrayList arrayList = new ArrayList();
        if (!this.f124456a.containsKey(tVar.getHost())) {
            return arrayList;
        }
        Iterator<SerializableCookie> it = com.lzy.okgo.db.d.K().r("host=?", new String[]{tVar.getHost()}).iterator();
        while (it.hasNext()) {
            Cookie cookie = it.next().getCookie();
            if (j(cookie)) {
                b(tVar, cookie);
            } else {
                arrayList.add(cookie);
            }
        }
        return arrayList;
    }

    @Override // ka.a
    public synchronized void f(t tVar, List<Cookie> list) {
        if (PatchProxy.proxy(new Object[]{tVar, list}, this, changeQuickRedirect, false, bb.c.b.f31033x5, new Class[]{t.class, List.class}, Void.TYPE).isSupported) {
            return;
        }
        Iterator<Cookie> it = list.iterator();
        while (it.hasNext()) {
            h(tVar, it.next());
        }
    }

    @Override // ka.a
    public synchronized List<Cookie> g() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.D5, new Class[0], List.class);
        if (patchProxyResultProxy.isSupported) {
            return (List) patchProxyResultProxy.result;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = this.f124456a.keySet().iterator();
        while (it.hasNext()) {
            arrayList.addAll(this.f124456a.get(it.next()).values());
        }
        return arrayList;
    }

    @Override // ka.a
    public synchronized void h(t tVar, Cookie cookie) {
        if (PatchProxy.proxy(new Object[]{tVar, cookie}, this, changeQuickRedirect, false, bb.c.b.f31055y5, new Class[]{t.class, Cookie.class}, Void.TYPE).isSupported) {
            return;
        }
        if (!this.f124456a.containsKey(tVar.getHost())) {
            this.f124456a.put(tVar.getHost(), new ConcurrentHashMap<>());
        }
        if (j(cookie)) {
            b(tVar, cookie);
        } else {
            this.f124456a.get(tVar.getHost()).put(i(cookie), cookie);
            com.lzy.okgo.db.d.K().B(new SerializableCookie(tVar.getHost(), cookie));
        }
    }
}
