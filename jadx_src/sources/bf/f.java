package bf;

import android.view.View;
import androidx.compose.runtime.internal.o;
import androidx.core.graphics.h0;
import androidx.core.view.j3;
import androidx.core.view.n3;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.List;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: TranslateDeferringInsetsAnimationCallback.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class f extends j3.b {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f35443i = 8;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    private final View f35444f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f35445g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f35446h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(@dl.d View view, int i10, int i11, int i12) {
        super(i12);
        f0.p(view, "view");
        this.f35444f = view;
        this.f35445g = i10;
        this.f35446h = i11;
        if (!((i10 & i11) == 0)) {
            throw new IllegalArgumentException("persistentInsetTypes and deferredInsetTypes can not contain any of  same WindowInsetsCompat.Type values".toString());
        }
    }

    public /* synthetic */ f(View view, int i10, int i11, int i12, int i13, u uVar) {
        this(view, i10, i11, (i13 & 8) != 0 ? 0 : i12);
    }

    @Override // androidx.core.view.j3.b
    public void c(@dl.d j3 animation) {
        if (PatchProxy.proxy(new Object[]{animation}, this, changeQuickRedirect, false, bb.c.m.TE, new Class[]{j3.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(animation, "animation");
        this.f35444f.setTranslationX(0.0f);
        this.f35444f.setTranslationY(0.0f);
    }

    @Override // androidx.core.view.j3.b
    @dl.d
    public n3 e(@dl.d n3 insets, @dl.d List<j3> runningAnimations) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{insets, runningAnimations}, this, changeQuickRedirect, false, bb.c.m.SE, new Class[]{n3.class, List.class}, n3.class);
        if (patchProxyResultProxy.isSupported) {
            return (n3) patchProxyResultProxy.result;
        }
        f0.p(insets, "insets");
        f0.p(runningAnimations, "runningAnimations");
        h0 h0VarF = insets.f(this.f35446h);
        f0.o(h0VarF, "insets.getInsets(deferredInsetTypes)");
        h0 h0VarF2 = insets.f(this.f35445g);
        f0.o(h0VarF2, "insets.getInsets(persistentInsetTypes)");
        h0 h0VarB = h0.b(h0.f(h0VarF, h0VarF2), h0.f20741e);
        f0.o(h0VarB, "subtract(typesInset, oth…t, Insets.NONE)\n        }");
        this.f35444f.setTranslationX(h0VarB.f20742a - h0VarB.f20744c);
        this.f35444f.setTranslationY(h0VarB.f20743b - h0VarB.f20745d);
        return insets;
    }

    public final int g() {
        return this.f35446h;
    }

    public final int h() {
        return this.f35445g;
    }
}
