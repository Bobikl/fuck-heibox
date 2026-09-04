package ka;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import okhttp3.Cookie;
import okhttp3.t;

/* JADX INFO: compiled from: MemoryCookieStore.java */
/* JADX INFO: loaded from: classes6.dex */
public class c implements a {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<String, List<Cookie>> f124457a = new HashMap();

    @Override // ka.a
    public List<Cookie> a(t tVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{tVar}, this, changeQuickRedirect, false, bb.c.b.J5, new Class[]{t.class}, List.class);
        if (patchProxyResultProxy.isSupported) {
            return (List) patchProxyResultProxy.result;
        }
        ArrayList arrayList = new ArrayList();
        List<Cookie> list = this.f124457a.get(tVar.getHost());
        if (list != null) {
            arrayList.addAll(list);
        }
        return arrayList;
    }

    @Override // ka.a
    public synchronized boolean b(t tVar, Cookie cookie) {
        boolean z10 = false;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{tVar, cookie}, this, changeQuickRedirect, false, bb.c.b.K5, new Class[]{t.class, Cookie.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        List<Cookie> list = this.f124457a.get(tVar.getHost());
        if (cookie != null && list.remove(cookie)) {
            z10 = true;
        }
        return z10;
    }

    @Override // ka.a
    public synchronized boolean c() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.M5, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        this.f124457a.clear();
        return true;
    }

    @Override // ka.a
    public synchronized boolean d(t tVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{tVar}, this, changeQuickRedirect, false, bb.c.b.L5, new Class[]{t.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        return this.f124457a.remove(tVar.getHost()) != null;
    }

    @Override // ka.a
    public synchronized List<Cookie> e(t tVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{tVar}, this, changeQuickRedirect, false, bb.c.b.H5, new Class[]{t.class}, List.class);
        if (patchProxyResultProxy.isSupported) {
            return (List) patchProxyResultProxy.result;
        }
        List<Cookie> arrayList = this.f124457a.get(tVar.getHost());
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            this.f124457a.put(tVar.getHost(), arrayList);
        }
        return arrayList;
    }

    @Override // ka.a
    public synchronized void f(t tVar, List<Cookie> list) {
        if (PatchProxy.proxy(new Object[]{tVar, list}, this, changeQuickRedirect, false, bb.c.b.F5, new Class[]{t.class, List.class}, Void.TYPE).isSupported) {
            return;
        }
        List<Cookie> list2 = this.f124457a.get(tVar.getHost());
        ArrayList arrayList = new ArrayList();
        for (Cookie cookie : list) {
            for (Cookie cookie2 : list2) {
                if (cookie.name().equals(cookie2.name())) {
                    arrayList.add(cookie2);
                }
            }
        }
        list2.removeAll(arrayList);
        list2.addAll(list);
    }

    @Override // ka.a
    public synchronized List<Cookie> g() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 450, new Class[0], List.class);
        if (patchProxyResultProxy.isSupported) {
            return (List) patchProxyResultProxy.result;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = this.f124457a.keySet().iterator();
        while (it.hasNext()) {
            arrayList.addAll(this.f124457a.get(it.next()));
        }
        return arrayList;
    }

    @Override // ka.a
    public synchronized void h(t tVar, Cookie cookie) {
        if (PatchProxy.proxy(new Object[]{tVar, cookie}, this, changeQuickRedirect, false, bb.c.b.G5, new Class[]{t.class, Cookie.class}, Void.TYPE).isSupported) {
            return;
        }
        List<Cookie> list = this.f124457a.get(tVar.getHost());
        ArrayList arrayList = new ArrayList();
        for (Cookie cookie2 : list) {
            if (cookie.name().equals(cookie2.name())) {
                arrayList.add(cookie2);
            }
        }
        list.removeAll(arrayList);
        list.add(cookie);
    }
}
