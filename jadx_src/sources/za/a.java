package za;

import androidx.room.n0;
import androidx.room.q;
import bb.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: ClassNameData.kt */
/* JADX INFO: loaded from: classes9.dex */
@q
public final class a {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @d
    @n0
    private final String f141956a;

    public a(@d String name) {
        f0.p(name, "name");
        this.f141956a = name;
    }

    public static /* synthetic */ a c(a aVar, String str, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{aVar, str, new Integer(i10), obj}, null, changeQuickRedirect, true, c.b.Gq, new Class[]{a.class, String.class, Integer.TYPE, Object.class}, a.class);
        if (patchProxyResultProxy.isSupported) {
            return (a) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            str = aVar.f141956a;
        }
        return aVar.b(str);
    }

    @d
    public final String a() {
        return this.f141956a;
    }

    @d
    public final a b(@d String name) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{name}, this, changeQuickRedirect, false, c.b.Fq, new Class[]{String.class}, a.class);
        if (patchProxyResultProxy.isSupported) {
            return (a) patchProxyResultProxy.result;
        }
        f0.p(name, "name");
        return new a(name);
    }

    @d
    public final String d() {
        return this.f141956a;
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, c.b.Jq, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && f0.g(this.f141956a, ((a) obj).f141956a);
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.b.Iq, new Class[0], Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : this.f141956a.hashCode();
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.b.Hq, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "ClassNameData(name=" + this.f141956a + ')';
    }
}
