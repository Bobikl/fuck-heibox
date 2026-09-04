package bf;

import androidx.annotation.x;
import androidx.compose.runtime.internal.o;
import androidx.core.view.j3;
import androidx.core.view.n3;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: AbsProgressFractionInsetsAnimationCallback.kt */
/* JADX INFO: loaded from: classes3.dex */
@t0({"SMAP\nAbsProgressFractionInsetsAnimationCallback.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbsProgressFractionInsetsAnimationCallback.kt\ncom/max/xiaoheihe/accelworld/windowinsets/AbsProgressFractionInsetsAnimationCallback\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,27:1\n1#2:28\n*E\n"})
@o(parameters = 0)
public abstract class a extends j3.b {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f35410g = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f35411f;

    public a(int i10, int i11) {
        super(i11);
        this.f35411f = i10;
    }

    public /* synthetic */ a(int i10, int i11, int i12, u uVar) {
        this(i10, (i12 & 2) != 0 ? 0 : i11);
    }

    @Override // androidx.core.view.j3.b
    @dl.d
    public n3 e(@dl.d n3 insets, @dl.d List<j3> runningAnimations) {
        Object next;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{insets, runningAnimations}, this, changeQuickRedirect, false, bb.c.m.zE, new Class[]{n3.class, List.class}, n3.class);
        if (patchProxyResultProxy.isSupported) {
            return (n3) patchProxyResultProxy.result;
        }
        f0.p(insets, "insets");
        f0.p(runningAnimations, "runningAnimations");
        Iterator<T> it = runningAnimations.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((((j3) next).f() & this.f35411f) != 0));
        j3 j3Var = (j3) next;
        if (j3Var != null) {
            h(j3Var.c());
        }
        return insets;
    }

    public final int g() {
        return this.f35411f;
    }

    public abstract void h(@x(from = 0.0d, to = com.google.android.material.color.utilities.d.f53848a) float f10);
}
