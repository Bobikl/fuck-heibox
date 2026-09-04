package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.MutatorMutex;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.jvm.internal.f0;
import kotlinx.coroutines.r0;

/* JADX INFO: compiled from: Draggable.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00070\u0016¢\u0006\u0004\b\u001b\u0010\u001cJD\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022'\u0010\n\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0004¢\u0006\u0002\b\tH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\rH\u0016R\u0014\u0010\u0011\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R#\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00070\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001d"}, d2 = {"Landroidx/compose/foundation/gestures/DefaultDraggableState;", "Landroidx/compose/foundation/gestures/f;", "Landroidx/compose/foundation/MutatePriority;", "dragPriority", "Lkotlin/Function2;", "Landroidx/compose/foundation/gestures/d;", "Lkotlin/coroutines/c;", "Lkotlin/b2;", "", "Lkotlin/t;", "block", "b", "(Landroidx/compose/foundation/MutatePriority;Lyh/p;Lkotlin/coroutines/c;)Ljava/lang/Object;", "", "delta", ak.av, "Landroidx/compose/foundation/gestures/d;", "dragScope", "Landroidx/compose/foundation/MutatorMutex;", ak.aF, "Landroidx/compose/foundation/MutatorMutex;", "scrollMutex", "Lkotlin/Function1;", "onDelta", "Lyh/l;", "e", "()Lyh/l;", "<init>", "(Lyh/l;)V", "foundation_release"}, k = 1, mv = {1, 7, 1})
public final class DefaultDraggableState implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final yh.l<Float, b2> f5133a;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final d dragScope;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final MutatorMutex scrollMutex;

    /* JADX INFO: compiled from: Draggable.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"androidx/compose/foundation/gestures/DefaultDraggableState$a", "Landroidx/compose/foundation/gestures/d;", "", "pixels", "Lkotlin/b2;", ak.aF, "foundation_release"}, k = 1, mv = {1, 7, 1})
    public static final class a implements d {
        a() {
        }

        @Override // androidx.compose.foundation.gestures.d
        public void c(float f10) {
            DefaultDraggableState.this.e().invoke(Float.valueOf(f10));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DefaultDraggableState(@dl.d yh.l<? super Float, b2> onDelta) {
        f0.p(onDelta, "onDelta");
        this.f5133a = onDelta;
        this.dragScope = new a();
        this.scrollMutex = new MutatorMutex();
    }

    @Override // androidx.compose.foundation.gestures.f
    public void a(float f10) {
        this.f5133a.invoke(Float.valueOf(f10));
    }

    @Override // androidx.compose.foundation.gestures.f
    @dl.e
    public Object b(@dl.d MutatePriority mutatePriority, @dl.d yh.p<? super d, ? super kotlin.coroutines.c<? super b2>, ? extends Object> pVar, @dl.d kotlin.coroutines.c<? super b2> cVar) {
        Object objG = r0.g(new DefaultDraggableState$drag$2(this, mutatePriority, pVar, null), cVar);
        return objG == kotlin.coroutines.intrinsics.b.h() ? objG : b2.f124493a;
    }

    @dl.d
    public final yh.l<Float, b2> e() {
        return this.f5133a;
    }
}
