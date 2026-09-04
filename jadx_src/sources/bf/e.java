package bf;

import android.view.View;
import androidx.compose.runtime.internal.o;
import androidx.core.graphics.h0;
import androidx.core.view.j1;
import androidx.core.view.j3;
import androidx.core.view.n3;
import com.max.hbutils.core.BaseApplication;
import com.max.hbutils.utils.ViewUtils;
import com.max.heybox.hblog.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.List;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: SubViewPaddingDeferringInsetsAnimationCallback.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class e extends j3.b {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @dl.d
    public static final a f35433m = new a(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f35434n = 8;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @dl.d
    private static final String f35435o = "SubDeferringPaddingCB-dbg";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    private final View f35436f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f35437g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f35438h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f35439i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f35440j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f35441k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f35442l;

    /* JADX INFO: compiled from: SubViewPaddingDeferringInsetsAnimationCallback.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(@dl.d View view, int i10, int i11, int i12) {
        super(i12);
        f0.p(view, "view");
        this.f35436f = view;
        this.f35437g = i10;
        this.f35438h = i11;
        if (!((i10 & i11) == 0)) {
            throw new IllegalArgumentException("persistentInsetTypes and deferredInsetTypes can not contain any of  same WindowInsetsCompat.Type values".toString());
        }
        this.f35439i = view.getPaddingLeft();
        this.f35440j = view.getPaddingTop();
        this.f35441k = view.getPaddingRight();
        this.f35442l = view.getPaddingBottom();
    }

    public /* synthetic */ e(View view, int i10, int i11, int i12, int i13, u uVar) {
        this(view, i10, i11, (i13 & 8) != 0 ? 0 : i12);
    }

    @Override // androidx.core.view.j3.b
    public void c(@dl.d j3 animation) {
        if (PatchProxy.proxy(new Object[]{animation}, this, changeQuickRedirect, false, bb.c.m.RE, new Class[]{j3.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(animation, "animation");
        this.f35436f.setPadding(this.f35439i, this.f35440j, this.f35441k, this.f35442l);
        int iL = ViewUtils.L(BaseApplication.a().getApplicationContext());
        int iJ = ViewUtils.J(BaseApplication.a().getApplicationContext());
        g.f74531b.M("[SubDeferringPaddingCB-dbg][onEnd] reset padding\noriginPadding: (" + this.f35439i + ", " + this.f35440j + ", " + this.f35441k + ", " + this.f35442l + ")\nscreenSize: " + iL + " * " + iJ);
    }

    @Override // androidx.core.view.j3.b
    public void d(@dl.d j3 animation) {
        if (PatchProxy.proxy(new Object[]{animation}, this, changeQuickRedirect, false, bb.c.m.PE, new Class[]{j3.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(animation, "animation");
        g.a aVar = g.f74531b;
        aVar.M("[SubDeferringPaddingCB-dbg][onPrepare] record originPadding: (" + this.f35439i + ", " + this.f35440j + ", " + this.f35441k + ", " + this.f35442l + ')');
        n3 n3VarO0 = j1.o0(this.f35436f);
        if (!(n3VarO0 != null && n3VarO0.C(this.f35438h))) {
            n3VarO0 = null;
        }
        if (n3VarO0 != null) {
            h0 h0VarF = n3VarO0.f(this.f35438h);
            f0.o(h0VarF, "insets.getInsets(deferredInsetTypes)");
            h0 h0VarF2 = n3VarO0.f(this.f35437g);
            f0.o(h0VarF2, "insets.getInsets(persistentInsetTypes)");
            h0 h0VarB = h0.b(h0.f(h0VarF, h0VarF2), h0.f20741e);
            f0.o(h0VarB, "subtract(typesInset, oth…nsets.NONE)\n            }");
            this.f35436f.setPadding(this.f35439i + h0VarB.f20742a, this.f35440j + h0VarB.f20743b, this.f35441k + h0VarB.f20744c, this.f35442l + h0VarB.f20745d);
            aVar.M("[SubDeferringPaddingCB-dbg][onPrepare] init padding with deferred inset\ndiff padding: (" + h0VarB.f20742a + ", " + h0VarB.f20743b + ", " + h0VarB.f20744c + ", " + h0VarB.f20745d + ')');
        }
    }

    @Override // androidx.core.view.j3.b
    @dl.d
    public n3 e(@dl.d n3 insets, @dl.d List<j3> runningAnimations) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{insets, runningAnimations}, this, changeQuickRedirect, false, bb.c.m.QE, new Class[]{n3.class, List.class}, n3.class);
        if (patchProxyResultProxy.isSupported) {
            return (n3) patchProxyResultProxy.result;
        }
        f0.p(insets, "insets");
        f0.p(runningAnimations, "runningAnimations");
        h0 h0VarF = insets.f(this.f35438h);
        f0.o(h0VarF, "insets.getInsets(deferredInsetTypes)");
        h0 h0VarF2 = insets.f(this.f35437g);
        f0.o(h0VarF2, "insets.getInsets(persistentInsetTypes)");
        h0 h0VarB = h0.b(h0.f(h0VarF, h0VarF2), h0.f20741e);
        f0.o(h0VarB, "subtract(typesInset, oth…t, Insets.NONE)\n        }");
        this.f35436f.setPadding(this.f35439i + h0VarB.f20742a, this.f35440j + h0VarB.f20743b, this.f35441k + h0VarB.f20744c, this.f35442l + h0VarB.f20745d);
        g.f74531b.M("[SubDeferringPaddingCB-dbg][onProgress] update padding with deferred inset\noriginPadding: (" + this.f35439i + ", " + this.f35440j + ", " + this.f35441k + ", " + this.f35442l + ")\ndiff padding: (" + h0VarB.f20742a + ", " + h0VarB.f20743b + ", " + h0VarB.f20744c + ", " + h0VarB.f20745d + ')');
        return insets;
    }

    public final int g() {
        return this.f35438h;
    }

    public final int h() {
        return this.f35437g;
    }
}
