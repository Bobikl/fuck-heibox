package bf;

import android.view.View;
import androidx.compose.runtime.internal.o;
import androidx.core.graphics.h0;
import androidx.core.view.j1;
import androidx.core.view.j3;
import androidx.core.view.n3;
import androidx.core.view.z0;
import com.max.heybox.hblog.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.List;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: RootViewPaddingDeferringInsetsCallback.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class c extends j3.b implements z0 {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @dl.d
    public static final a f35418l = new a(null);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f35419m = 8;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @dl.d
    private static final String f35420n = "RootDeferringPaddingCB-dbg";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f35421f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f35422g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @dl.e
    private final yh.a<Boolean> f35423h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @dl.e
    private View f35424i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @dl.e
    private n3 f35425j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f35426k;

    /* JADX INFO: compiled from: RootViewPaddingDeferringInsetsCallback.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }
    }

    public c(int i10, int i11, @dl.e yh.a<Boolean> aVar) {
        super(1);
        this.f35421f = i10;
        this.f35422g = i11;
        this.f35423h = aVar;
        if (!((i10 & i11) == 0)) {
            throw new IllegalArgumentException("persistentInsetTypes and deferredInsetTypes can not contain any of  same WindowInsetsCompat.Type values".toString());
        }
    }

    public /* synthetic */ c(int i10, int i11, yh.a aVar, int i12, u uVar) {
        this(i10, i11, (i12 & 4) != 0 ? null : aVar);
    }

    @Override // androidx.core.view.z0
    @dl.d
    public n3 a(@dl.d View v10, @dl.d n3 windowInsets) {
        int i10;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{v10, windowInsets}, this, changeQuickRedirect, false, bb.c.m.GE, new Class[]{View.class, n3.class}, n3.class);
        if (patchProxyResultProxy.isSupported) {
            return (n3) patchProxyResultProxy.result;
        }
        f0.p(v10, "v");
        f0.p(windowInsets, "windowInsets");
        this.f35424i = v10;
        this.f35425j = windowInsets;
        if (this.f35426k) {
            i10 = this.f35421f;
        } else {
            yh.a<Boolean> aVar = this.f35423h;
            i10 = aVar != null ? f0.g(aVar.invoke(), Boolean.TRUE) : false ? this.f35421f : this.f35421f | this.f35422g;
        }
        h0 h0VarF = windowInsets.f(i10);
        f0.o(h0VarF, "windowInsets.getInsets(types)");
        v10.setPadding(h0VarF.f20742a, h0VarF.f20743b, h0VarF.f20744c, h0VarF.f20745d);
        g.a aVar2 = g.f74531b;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[RootDeferringPaddingCB-dbg][onApplyWindowInsets]\ndeferredInsets: ");
        sb2.append(this.f35426k);
        sb2.append(", forceDeferred: ");
        yh.a<Boolean> aVar3 = this.f35423h;
        sb2.append(aVar3 != null ? aVar3.invoke() : null);
        sb2.append(", types: ");
        sb2.append(i10);
        sb2.append("\nrootViewPadding: (");
        sb2.append(h0VarF.f20742a);
        sb2.append(", ");
        sb2.append(h0VarF.f20743b);
        sb2.append(", ");
        sb2.append(h0VarF.f20744c);
        sb2.append(", ");
        sb2.append(h0VarF.f20745d);
        sb2.append(')');
        aVar2.M(sb2.toString());
        n3 CONSUMED = n3.f21708c;
        f0.o(CONSUMED, "CONSUMED");
        return CONSUMED;
    }

    @Override // androidx.core.view.j3.b
    public void c(@dl.d j3 animation) {
        View view;
        if (PatchProxy.proxy(new Object[]{animation}, this, changeQuickRedirect, false, bb.c.m.KE, new Class[]{j3.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(animation, "animation");
        if (!this.f35426k || (animation.f() & this.f35422g) == 0) {
            return;
        }
        this.f35426k = false;
        if (this.f35425j == null || (view = this.f35424i) == null) {
            return;
        }
        f0.m(view);
        n3 n3Var = this.f35425j;
        f0.m(n3Var);
        j1.p(view, n3Var);
    }

    @Override // androidx.core.view.j3.b
    public void d(@dl.d j3 animation) {
        if (PatchProxy.proxy(new Object[]{animation}, this, changeQuickRedirect, false, bb.c.m.HE, new Class[]{j3.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(animation, "animation");
        if ((animation.f() & this.f35422g) != 0) {
            this.f35426k = true;
        }
    }

    @Override // androidx.core.view.j3.b
    @dl.d
    public n3 e(@dl.d n3 insets, @dl.d List<j3> runningAnims) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{insets, runningAnims}, this, changeQuickRedirect, false, bb.c.m.JE, new Class[]{n3.class, List.class}, n3.class);
        if (patchProxyResultProxy.isSupported) {
            return (n3) patchProxyResultProxy.result;
        }
        f0.p(insets, "insets");
        f0.p(runningAnims, "runningAnims");
        return insets;
    }

    @Override // androidx.core.view.j3.b
    @dl.d
    public j3.a f(@dl.d j3 animation, @dl.d j3.a bounds) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{animation, bounds}, this, changeQuickRedirect, false, bb.c.m.IE, new Class[]{j3.class, j3.a.class}, j3.a.class);
        if (patchProxyResultProxy.isSupported) {
            return (j3.a) patchProxyResultProxy.result;
        }
        f0.p(animation, "animation");
        f0.p(bounds, "bounds");
        return bounds;
    }

    public final int g() {
        return this.f35422g;
    }

    @dl.e
    public final yh.a<Boolean> h() {
        return this.f35423h;
    }

    public final int i() {
        return this.f35421f;
    }
}
