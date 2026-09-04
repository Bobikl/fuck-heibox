package sb;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.k0;
import androidx.core.view.ViewGroupKt;
import bb.c;
import com.max.hbcommon.base.adapter.p;
import com.max.heybox.hblog.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import dl.d;
import dl.e;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;

/* JADX INFO: compiled from: LayoutChildWatcher.kt */
/* JADX INFO: loaded from: classes9.dex */
@t0({"SMAP\nLayoutChildWatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutChildWatcher.kt\ncom/max/hbcommon/track/LayoutChildWatcher\n+ 2 Extensions.kt\ncom/max/heybox/hblog/ExtensionsKt\n+ 3 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,61:1\n29#2:62\n5#2,2:63\n22#2:65\n7#2:66\n29#2:70\n5#2,2:71\n22#2:73\n7#2:74\n1324#3,3:67\n*S KotlinDebug\n*F\n+ 1 LayoutChildWatcher.kt\ncom/max/hbcommon/track/LayoutChildWatcher\n*L\n24#1:62\n24#1:63,2\n24#1:65\n24#1:66\n54#1:70\n54#1:71,2\n54#1:73\n54#1:74\n29#1:67,3\n*E\n"})
public final class a implements View.OnLayoutChangeListener {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @d
    private final ViewGroup f139378b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @d
    private final InterfaceC1267a f139379c;

    /* JADX INFO: renamed from: sb.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: LayoutChildWatcher.kt */
    public interface InterfaceC1267a {
        void a(int i10, @d View view);
    }

    public a(@d ViewGroup layout, @d InterfaceC1267a listener) {
        f0.p(layout, "layout");
        f0.p(listener, "listener");
        this.f139378b = layout;
        this.f139379c = listener;
        layout.addOnLayoutChangeListener(this);
    }

    private final void d() {
        int i10 = 0;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.e.Ff, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        for (View view : ViewGroupKt.e(this.f139378b)) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                CollectionsKt__CollectionsKt.W();
            }
            e(i10, view);
            i10 = i11;
        }
    }

    private final void e(int i10, View view) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10), view}, this, changeQuickRedirect, false, c.e.Gf, new Class[]{Integer.TYPE, View.class}, Void.TYPE).isSupported) {
            return;
        }
        p pVar = new p(Integer.valueOf(i10));
        if (pVar.g(view, this.f139378b, false) && pVar.c(0).e().booleanValue()) {
            this.f139379c.a(i10, view);
        }
    }

    @d
    public final ViewGroup a() {
        return this.f139378b;
    }

    @d
    public final InterfaceC1267a b() {
        return this.f139379c;
    }

    public final void c() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.e.Df, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f139378b.removeOnLayoutChangeListener(this);
    }

    @k0
    public final void f() {
        String name;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.e.Ef, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        g.a aVar = g.f74531b;
        StringBuilder sb2 = new StringBuilder();
        if (a.class.isAnonymousClass()) {
            name = a.class.getName();
            f0.m(name);
        } else {
            name = a.class.getSimpleName();
            f0.m(name);
        }
        sb2.append(name);
        sb2.append(", ");
        sb2.append("requestCheck");
        aVar.q(sb2.toString());
        d();
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(@e View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        String name;
        Object[] objArr = {view, new Integer(i10), new Integer(i11), new Integer(i12), new Integer(i13), new Integer(i14), new Integer(i15), new Integer(i16), new Integer(i17)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, c.e.Hf, new Class[]{View.class, cls, cls, cls, cls, cls, cls, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        String str = "onLayoutChange, v = " + view;
        g.a aVar = g.f74531b;
        StringBuilder sb2 = new StringBuilder();
        if (a.class.isAnonymousClass()) {
            name = a.class.getName();
            f0.m(name);
        } else {
            name = a.class.getSimpleName();
            f0.m(name);
        }
        sb2.append(name);
        sb2.append(", ");
        sb2.append(str);
        aVar.q(sb2.toString());
        d();
    }
}
