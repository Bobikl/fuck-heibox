package we;

import bb.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: BitrateInfo.kt */
/* JADX INFO: loaded from: classes8.dex */
public class a implements Comparable<a> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f141039b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f141040c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f141041d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f141042e;

    public int a(@d a other) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{other}, this, changeQuickRedirect, false, c.m.dp, new Class[]{a.class}, Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        f0.p(other, "other");
        return this.f141042e - other.f141042e;
    }

    public final int b() {
        return this.f141042e;
    }

    public final int c() {
        return this.f141041d;
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(a aVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{aVar}, this, changeQuickRedirect, false, c.m.ep, new Class[]{Object.class}, Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : a(aVar);
    }

    public final int d() {
        return this.f141039b;
    }

    public final int e() {
        return this.f141040c;
    }

    public final void f(int i10) {
        this.f141042e = i10;
    }

    public final void g(int i10) {
        this.f141041d = i10;
    }

    public final void h(int i10) {
        this.f141039b = i10;
    }

    public final void i(int i10) {
        this.f141040c = i10;
    }
}
