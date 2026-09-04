package bf;

import android.view.View;
import androidx.compose.runtime.internal.o;
import androidx.core.view.j1;
import androidx.core.view.j3;
import androidx.core.view.n3;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import kotlin.b2;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import yh.l;
import yh.p;

/* JADX INFO: compiled from: ShowOrHideInsetsAnimationCallback.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class d extends a {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f35427m = 8;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @dl.d
    private final View f35428h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @dl.e
    private final l<Boolean, b2> f35429i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @dl.e
    private final p<Boolean, Float, b2> f35430j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @dl.e
    private final l<Boolean, b2> f35431k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @dl.e
    private Boolean f35432l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public d(int i10, @dl.d View attachedView, @dl.e l<? super Boolean, b2> lVar, @dl.e p<? super Boolean, ? super Float, b2> pVar, @dl.e l<? super Boolean, b2> lVar2) {
        super(i10, 0, 2, null);
        f0.p(attachedView, "attachedView");
        this.f35428h = attachedView;
        this.f35429i = lVar;
        this.f35430j = pVar;
        this.f35431k = lVar2;
    }

    public /* synthetic */ d(int i10, View view, l lVar, p pVar, l lVar2, int i11, u uVar) {
        this(i10, view, (i11 & 4) != 0 ? null : lVar, (i11 & 8) != 0 ? null : pVar, (i11 & 16) != 0 ? null : lVar2);
    }

    @Override // androidx.core.view.j3.b
    public void c(@dl.d j3 animation) {
        if (PatchProxy.proxy(new Object[]{animation}, this, changeQuickRedirect, false, bb.c.m.OE, new Class[]{j3.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(animation, "animation");
        l<Boolean, b2> lVar = this.f35431k;
        if (lVar != null) {
            lVar.invoke(this.f35432l);
        }
    }

    @Override // androidx.core.view.j3.b
    public void d(@dl.d j3 animation) {
        if (PatchProxy.proxy(new Object[]{animation}, this, changeQuickRedirect, false, bb.c.m.LE, new Class[]{j3.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(animation, "animation");
        n3 n3VarO0 = j1.o0(this.f35428h);
        this.f35432l = n3VarO0 != null ? Boolean.valueOf(!n3VarO0.C(g())) : null;
    }

    @Override // androidx.core.view.j3.b
    @dl.d
    public j3.a f(@dl.d j3 animation, @dl.d j3.a bounds) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{animation, bounds}, this, changeQuickRedirect, false, bb.c.m.ME, new Class[]{j3.class, j3.a.class}, j3.a.class);
        if (patchProxyResultProxy.isSupported) {
            return (j3.a) patchProxyResultProxy.result;
        }
        f0.p(animation, "animation");
        f0.p(bounds, "bounds");
        l<Boolean, b2> lVar = this.f35429i;
        if (lVar != null) {
            lVar.invoke(this.f35432l);
        }
        j3.a aVarF = super.f(animation, bounds);
        f0.o(aVarF, "super.onStart(animation, bounds)");
        return aVarF;
    }

    @Override // bf.a
    public void h(float f10) {
        p<Boolean, Float, b2> pVar;
        if (PatchProxy.proxy(new Object[]{new Float(f10)}, this, changeQuickRedirect, false, bb.c.m.NE, new Class[]{Float.TYPE}, Void.TYPE).isSupported || (pVar = this.f35430j) == null) {
            return;
        }
        pVar.invoke(this.f35432l, Float.valueOf(f10));
    }
}
