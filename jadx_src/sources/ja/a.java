package ja;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.List;
import okhttp3.Cookie;
import okhttp3.l;
import okhttp3.t;

/* JADX INFO: compiled from: CookieJarImpl.java */
/* JADX INFO: loaded from: classes6.dex */
public class a implements l {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ka.a f124312c;

    public a(ka.a aVar) {
        if (aVar == null) {
            throw new IllegalArgumentException("cookieStore can not be null!");
        }
        this.f124312c = aVar;
    }

    @Override // okhttp3.l
    public synchronized List<Cookie> a(t tVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{tVar}, this, changeQuickRedirect, false, 424, new Class[]{t.class}, List.class);
        if (patchProxyResultProxy.isSupported) {
            return (List) patchProxyResultProxy.result;
        }
        return this.f124312c.e(tVar);
    }

    @Override // okhttp3.l
    public synchronized void b(t tVar, List<Cookie> list) {
        if (PatchProxy.proxy(new Object[]{tVar, list}, this, changeQuickRedirect, false, 423, new Class[]{t.class, List.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f124312c.f(tVar, list);
    }

    public ka.a c() {
        return this.f124312c;
    }
}
