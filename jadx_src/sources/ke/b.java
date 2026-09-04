package ke;

import android.content.Context;
import bb.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import me.e;

/* JADX INFO: compiled from: PictureAppMaster.java */
/* JADX INFO: loaded from: classes2.dex */
public class b implements a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static b f124467b;
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a f124468a;

    private b() {
    }

    public static b d() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, c.l.Zh, new Class[0], b.class);
        if (patchProxyResultProxy.isSupported) {
            return (b) patchProxyResultProxy.result;
        }
        if (f124467b == null) {
            synchronized (b.class) {
                if (f124467b == null) {
                    f124467b = new b();
                }
            }
        }
        return f124467b;
    }

    @Override // ke.a
    public e a() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.l.Yh, new Class[0], e.class);
        if (patchProxyResultProxy.isSupported) {
            return (e) patchProxyResultProxy.result;
        }
        a aVar = this.f124468a;
        if (aVar == null) {
            return null;
        }
        return aVar.a();
    }

    @Override // ke.a
    public Context b() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.l.Xh, new Class[0], Context.class);
        if (patchProxyResultProxy.isSupported) {
            return (Context) patchProxyResultProxy.result;
        }
        a aVar = this.f124468a;
        if (aVar == null) {
            return null;
        }
        return aVar.b();
    }

    public a c() {
        return this.f124468a;
    }

    public void e(a aVar) {
        this.f124468a = aVar;
    }
}
