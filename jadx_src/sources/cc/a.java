package cc;

import bb.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import dl.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.b2;
import kotlin.jvm.internal.f0;
import yh.l;

/* JADX INFO: compiled from: FloatObservable.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class a {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f35636a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @d
    private final List<l<Float, b2>> f35637b = new ArrayList();

    private final void d() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.f.tl, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        Iterator<l<Float, b2>> it = this.f35637b.iterator();
        while (it.hasNext()) {
            it.next().invoke(Float.valueOf(this.f35636a));
        }
    }

    public final void a(@d l<? super Float, b2> observer) {
        if (PatchProxy.proxy(new Object[]{observer}, this, changeQuickRedirect, false, c.f.ql, new Class[]{l.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(observer, "observer");
        this.f35637b.add(observer);
    }

    public final void b() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.f.sl, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f35637b.clear();
    }

    public final float c() {
        return this.f35636a;
    }

    public final void e(@d l<? super Float, b2> observer) {
        if (PatchProxy.proxy(new Object[]{observer}, this, changeQuickRedirect, false, c.f.rl, new Class[]{l.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(observer, "observer");
        this.f35637b.remove(observer);
    }

    public final void f(float f10) {
        if (PatchProxy.proxy(new Object[]{new Float(f10)}, this, changeQuickRedirect, false, c.f.f32501pl, new Class[]{Float.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f35636a = f10;
        d();
    }
}
