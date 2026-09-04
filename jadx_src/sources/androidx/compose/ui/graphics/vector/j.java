package androidx.compose.ui.graphics.vector;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: Vector.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001B\t\b\u0004¢\u0006\u0004\b\r\u0010\u000eJ\u0006\u0010\u0003\u001a\u00020\u0002J\f\u0010\u0005\u001a\u00020\u0002*\u00020\u0004H&R*\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00068\u0010@\u0010X\u0090\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f\u0082\u0001\u0003\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/graphics/vector/j;", "", "Lkotlin/b2;", ak.aF, "Landroidx/compose/ui/graphics/drawscope/g;", ak.av, "Lkotlin/Function0;", "invalidateListener", "Lyh/a;", "b", "()Lyh/a;", "d", "(Lyh/a;)V", "<init>", "()V", "Landroidx/compose/ui/graphics/vector/b;", "Landroidx/compose/ui/graphics/vector/PathComponent;", "Landroidx/compose/ui/graphics/vector/VectorComponent;", "ui_release"}, k = 1, mv = {1, 7, 1})
public abstract class j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f14323b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.e
    private yh.a<b2> f14324a;

    private j() {
    }

    public /* synthetic */ j(u uVar) {
        this();
    }

    public abstract void a(@dl.d androidx.compose.ui.graphics.drawscope.g gVar);

    @dl.e
    public yh.a<b2> b() {
        return this.f14324a;
    }

    public final void c() {
        yh.a<b2> aVarB = b();
        if (aVarB != null) {
            aVarB.invoke();
        }
    }

    public void d(@dl.e yh.a<b2> aVar) {
        this.f14324a = aVar;
    }
}
