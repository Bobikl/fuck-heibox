package androidx.compose.foundation.layout;

import android.os.Build;
import android.view.View;
import androidx.core.view.j3;
import androidx.core.view.n3;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: WindowInsets.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u000f\u0012\u0006\u0010\u001d\u001a\u00020\u0019¢\u0006\u0004\b+\u0010,J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0018\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tH\u0016J\u001e\u0010\u0010\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u000eH\u0016J\u0010\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0018\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\fH\u0016J\b\u0010\u0015\u001a\u00020\u0007H\u0016J\u0010\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J\u0010\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0012H\u0016R\u0017\u0010\u001d\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\"\u0010$\u001a\u00020\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R$\u0010*\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)¨\u0006-"}, d2 = {"Landroidx/compose/foundation/layout/y;", "Landroidx/core/view/j3$b;", "Ljava/lang/Runnable;", "Landroidx/core/view/z0;", "Landroid/view/View$OnAttachStateChangeListener;", "Landroidx/core/view/j3;", "animation", "Lkotlin/b2;", "d", "Landroidx/core/view/j3$a;", "bounds", "f", "Landroidx/core/view/n3;", "insets", "", "runningAnimations", "e", ak.aF, "Landroid/view/View;", sd.b.f139384b, ak.av, "run", "onViewAttachedToWindow", "v", "onViewDetachedFromWindow", "Landroidx/compose/foundation/layout/WindowInsetsHolder;", "Landroidx/compose/foundation/layout/WindowInsetsHolder;", "g", "()Landroidx/compose/foundation/layout/WindowInsetsHolder;", "composeInsets", "", "Z", RXScreenCaptureService.KEY_HEIGHT, "()Z", "j", "(Z)V", "prepared", "Landroidx/core/view/n3;", "i", "()Landroidx/core/view/n3;", "k", "(Landroidx/core/view/n3;)V", "savedInsets", "<init>", "(Landroidx/compose/foundation/layout/WindowInsetsHolder;)V", "foundation-layout_release"}, k = 1, mv = {1, 7, 1})
public final class y extends j3.b implements Runnable, androidx.core.view.z0, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final WindowInsetsHolder composeInsets;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private boolean prepared;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private n3 savedInsets;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(@dl.d WindowInsetsHolder composeInsets) {
        super(!composeInsets.getConsumes() ? 1 : 0);
        kotlin.jvm.internal.f0.p(composeInsets, "composeInsets");
        this.composeInsets = composeInsets;
    }

    @Override // androidx.core.view.z0
    @dl.d
    public n3 a(@dl.d View view, @dl.d n3 insets) {
        kotlin.jvm.internal.f0.p(view, "view");
        kotlin.jvm.internal.f0.p(insets, "insets");
        if (this.prepared) {
            this.savedInsets = insets;
            if (Build.VERSION.SDK_INT == 30) {
                view.post(this);
            }
            return insets;
        }
        WindowInsetsHolder.y(this.composeInsets, insets, 0, 2, null);
        if (!this.composeInsets.getConsumes()) {
            return insets;
        }
        n3 CONSUMED = n3.f21708c;
        kotlin.jvm.internal.f0.o(CONSUMED, "CONSUMED");
        return CONSUMED;
    }

    @Override // androidx.core.view.j3.b
    public void c(@dl.d j3 animation) {
        kotlin.jvm.internal.f0.p(animation, "animation");
        this.prepared = false;
        n3 n3Var = this.savedInsets;
        if (animation.b() != 0 && n3Var != null) {
            this.composeInsets.x(n3Var, animation.f());
        }
        this.savedInsets = null;
        super.c(animation);
    }

    @Override // androidx.core.view.j3.b
    public void d(@dl.d j3 animation) {
        kotlin.jvm.internal.f0.p(animation, "animation");
        this.prepared = true;
        super.d(animation);
    }

    @Override // androidx.core.view.j3.b
    @dl.d
    public n3 e(@dl.d n3 insets, @dl.d List<j3> runningAnimations) {
        kotlin.jvm.internal.f0.p(insets, "insets");
        kotlin.jvm.internal.f0.p(runningAnimations, "runningAnimations");
        WindowInsetsHolder.y(this.composeInsets, insets, 0, 2, null);
        if (!this.composeInsets.getConsumes()) {
            return insets;
        }
        n3 CONSUMED = n3.f21708c;
        kotlin.jvm.internal.f0.o(CONSUMED, "CONSUMED");
        return CONSUMED;
    }

    @Override // androidx.core.view.j3.b
    @dl.d
    public j3.a f(@dl.d j3 animation, @dl.d j3.a bounds) {
        kotlin.jvm.internal.f0.p(animation, "animation");
        kotlin.jvm.internal.f0.p(bounds, "bounds");
        this.prepared = false;
        j3.a aVarF = super.f(animation, bounds);
        kotlin.jvm.internal.f0.o(aVarF, "super.onStart(animation, bounds)");
        return aVarF;
    }

    @dl.d
    /* JADX INFO: renamed from: g, reason: from getter */
    public final WindowInsetsHolder getComposeInsets() {
        return this.composeInsets;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final boolean getPrepared() {
        return this.prepared;
    }

    @dl.e
    /* JADX INFO: renamed from: i, reason: from getter */
    public final n3 getSavedInsets() {
        return this.savedInsets;
    }

    public final void j(boolean z10) {
        this.prepared = z10;
    }

    public final void k(@dl.e n3 n3Var) {
        this.savedInsets = n3Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(@dl.d View view) {
        kotlin.jvm.internal.f0.p(view, "view");
        view.requestApplyInsets();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(@dl.d View v10) {
        kotlin.jvm.internal.f0.p(v10, "v");
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.prepared) {
            this.prepared = false;
            n3 n3Var = this.savedInsets;
            if (n3Var != null) {
                WindowInsetsHolder.y(this.composeInsets, n3Var, 0, 2, null);
                this.savedInsets = null;
            }
        }
    }
}
