package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.MutatorMutex;
import androidx.compose.runtime.a1;
import androidx.compose.runtime.h2;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.jvm.internal.f0;
import kotlinx.coroutines.r0;

/* JADX INFO: compiled from: ScrollableState.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\u001b¢\u0006\u0004\b\"\u0010#JD\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022'\u0010\n\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0004¢\u0006\u0002\b\tH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0016R\u0014\u0010\u0012\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0014R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R#\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\u001b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010 \u0082\u0002\u0004\n\u0002\b\u0019¨\u0006$"}, d2 = {"Landroidx/compose/foundation/gestures/DefaultScrollableState;", "Landroidx/compose/foundation/gestures/p;", "Landroidx/compose/foundation/MutatePriority;", "scrollPriority", "Lkotlin/Function2;", "Landroidx/compose/foundation/gestures/m;", "Lkotlin/coroutines/c;", "Lkotlin/b2;", "", "Lkotlin/t;", "block", ak.aF, "(Landroidx/compose/foundation/MutatePriority;Lyh/p;Lkotlin/coroutines/c;)Ljava/lang/Object;", "", "delta", ak.av, "b", "Landroidx/compose/foundation/gestures/m;", "scrollScope", "Landroidx/compose/foundation/MutatorMutex;", "Landroidx/compose/foundation/MutatorMutex;", "scrollMutex", "Landroidx/compose/runtime/a1;", "", "d", "Landroidx/compose/runtime/a1;", "isScrollingState", "Lkotlin/Function1;", "onDelta", "Lyh/l;", "g", "()Lyh/l;", "()Z", "isScrollInProgress", "<init>", "(Lyh/l;)V", "foundation_release"}, k = 1, mv = {1, 7, 1})
public final class DefaultScrollableState implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final yh.l<Float, Float> f5149a;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final m scrollScope;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final MutatorMutex scrollMutex;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final a1<Boolean> isScrollingState;

    /* JADX INFO: compiled from: ScrollableState.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0005"}, d2 = {"androidx/compose/foundation/gestures/DefaultScrollableState$a", "Landroidx/compose/foundation/gestures/m;", "", "pixels", ak.av, "foundation_release"}, k = 1, mv = {1, 7, 1})
    public static final class a implements m {
        a() {
        }

        @Override // androidx.compose.foundation.gestures.m
        public float a(float pixels) {
            return DefaultScrollableState.this.g().invoke(Float.valueOf(pixels)).floatValue();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DefaultScrollableState(@dl.d yh.l<? super Float, Float> onDelta) {
        f0.p(onDelta, "onDelta");
        this.f5149a = onDelta;
        this.scrollScope = new a();
        this.scrollMutex = new MutatorMutex();
        this.isScrollingState = h2.g(Boolean.FALSE, null, 2, null);
    }

    @Override // androidx.compose.foundation.gestures.p
    public float a(float delta) {
        return this.f5149a.invoke(Float.valueOf(delta)).floatValue();
    }

    @Override // androidx.compose.foundation.gestures.p
    public boolean b() {
        return this.isScrollingState.getValue().booleanValue();
    }

    @Override // androidx.compose.foundation.gestures.p
    @dl.e
    public Object c(@dl.d MutatePriority mutatePriority, @dl.d yh.p<? super m, ? super kotlin.coroutines.c<? super b2>, ? extends Object> pVar, @dl.d kotlin.coroutines.c<? super b2> cVar) {
        Object objG = r0.g(new DefaultScrollableState$scroll$2(this, mutatePriority, pVar, null), cVar);
        return objG == kotlin.coroutines.intrinsics.b.h() ? objG : b2.f124493a;
    }

    @dl.d
    public final yh.l<Float, Float> g() {
        return this.f5149a;
    }
}
