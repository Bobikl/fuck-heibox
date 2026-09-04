package bf;

import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.compose.runtime.internal.o;
import androidx.core.graphics.h0;
import androidx.core.view.g3;
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

/* JADX INFO: compiled from: FragmentDialogImeInsetsCallback.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class b extends j3.b implements z0 {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @dl.d
    public static final a f35412i = new a(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f35413j = 8;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @dl.d
    private static final String f35414k = "FragmentDialogImeInsetsCallback-dbg";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.e
    private View f35415f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f35416g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @dl.e
    private n3 f35417h;

    /* JADX INFO: compiled from: FragmentDialogImeInsetsCallback.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }
    }

    public b(@dl.e Window window, int i10) {
        super(i10);
        if (window != null) {
            g3.c(window, false);
            window.setSoftInputMode(48);
        }
    }

    public /* synthetic */ b(Window window, int i10, int i11, u uVar) {
        this(window, (i11 & 2) != 0 ? 0 : i10);
    }

    private final void g(View view, n3 n3Var) {
        if (PatchProxy.proxy(new Object[]{view, n3Var}, this, changeQuickRedirect, false, bb.c.m.CE, new Class[]{View.class, n3.class}, Void.TYPE).isSupported) {
            return;
        }
        h0 h0VarF = n3Var.f(n3.m.i() | n3.m.d());
        f0.o(h0VarF, "windowInsets.getInsets(\n…mpat.Type.ime()\n        )");
        h(view, h0VarF);
    }

    private final void h(View view, h0 h0Var) {
        if (PatchProxy.proxy(new Object[]{view, h0Var}, this, changeQuickRedirect, false, bb.c.m.DE, new Class[]{View.class, h0.class}, Void.TYPE).isSupported) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.LayoutParams layoutParams2 = null;
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            marginLayoutParams.bottomMargin = h0Var.f20745d;
            layoutParams2 = marginLayoutParams;
        }
        view.setLayoutParams(layoutParams2);
    }

    @Override // androidx.core.view.z0
    @dl.d
    public n3 a(@dl.d View v10, @dl.d n3 windowInsets) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{v10, windowInsets}, this, changeQuickRedirect, false, bb.c.m.BE, new Class[]{View.class, n3.class}, n3.class);
        if (patchProxyResultProxy.isSupported) {
            return (n3) patchProxyResultProxy.result;
        }
        f0.p(v10, "v");
        f0.p(windowInsets, "windowInsets");
        if (this.f35416g) {
            this.f35415f = v10;
            this.f35417h = windowInsets;
            this.f35416g = false;
        } else {
            g(v10, windowInsets);
        }
        n3 CONSUMED = n3.f21708c;
        f0.o(CONSUMED, "CONSUMED");
        return CONSUMED;
    }

    @Override // androidx.core.view.j3.b
    public void c(@dl.d j3 animation) {
        if (PatchProxy.proxy(new Object[]{animation}, this, changeQuickRedirect, false, bb.c.m.FE, new Class[]{j3.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(animation, "animation");
        if ((animation.f() & n3.m.d()) == 0) {
            return;
        }
        View view = this.f35415f;
        n3 n3Var = this.f35417h;
        if (view == null || n3Var == null) {
            return;
        }
        g(view, n3Var);
        g.f74531b.M("[FragmentDialogImeInsetsCallback-dbg][onEnd]\nisImeAnimating: " + this.f35416g + ", view: " + this.f35415f + "\nwindowInsets: " + n3Var + "\nanimation: " + animation);
    }

    @Override // androidx.core.view.j3.b
    public void d(@dl.d j3 animation) {
        if (PatchProxy.proxy(new Object[]{animation}, this, changeQuickRedirect, false, bb.c.m.AE, new Class[]{j3.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(animation, "animation");
        this.f35416g = (animation.f() & n3.m.d()) != 0;
        g.f74531b.M("[FragmentDialogImeInsetsCallback-dbg][onProgress]\nisImeAnimating: " + this.f35416g);
    }

    @Override // androidx.core.view.j3.b
    @dl.d
    public n3 e(@dl.d n3 insets, @dl.d List<j3> runningAnims) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{insets, runningAnims}, this, changeQuickRedirect, false, bb.c.m.EE, new Class[]{n3.class, List.class}, n3.class);
        if (patchProxyResultProxy.isSupported) {
            return (n3) patchProxyResultProxy.result;
        }
        f0.p(insets, "insets");
        f0.p(runningAnims, "runningAnims");
        h0 h0VarF = insets.f(n3.m.i() | n3.m.d());
        f0.o(h0VarF, "insets.getInsets(\n      …mpat.Type.ime()\n        )");
        View view = this.f35415f;
        if (view != null) {
            h(view, h0VarF);
        }
        g.f74531b.M("[FragmentDialogImeInsetsCallback-dbg][onProgress]\nisImeAnimating: " + this.f35416g + ", view: " + this.f35415f + "\nanimatingInsets: " + h0VarF + "\nrunningAnims: " + runningAnims);
        return insets;
    }
}
