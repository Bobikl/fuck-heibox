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

/* JADX INFO: compiled from: TransformableState.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0002\u0018\u00002\u00020\u0001BW\u0012K\u0010!\u001aG\u0012\u0013\u0012\u00110\u001a¢\u0006\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(\u001d\u0012\u0013\u0012\u00110\u001e¢\u0006\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(\u001f\u0012\u0013\u0012\u00110\u001a¢\u0006\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b( \u0012\u0004\u0012\u00020\u00070\u0019ø\u0001\u0000¢\u0006\u0004\b'\u0010(JD\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022'\u0010\n\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0004¢\u0006\u0002\b\tH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R_\u0010!\u001aG\u0012\u0013\u0012\u00110\u001a¢\u0006\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(\u001d\u0012\u0013\u0012\u00110\u001e¢\u0006\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(\u001f\u0012\u0013\u0012\u00110\u001a¢\u0006\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b( \u0012\u0004\u0012\u00020\u00070\u00198\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0014\u0010&\u001a\u00020\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010%\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006)"}, d2 = {"Landroidx/compose/foundation/gestures/DefaultTransformableState;", "Landroidx/compose/foundation/gestures/t;", "Landroidx/compose/foundation/MutatePriority;", "transformPriority", "Lkotlin/Function2;", "Landroidx/compose/foundation/gestures/r;", "Lkotlin/coroutines/c;", "Lkotlin/b2;", "", "Lkotlin/t;", "block", ak.av, "(Landroidx/compose/foundation/MutatePriority;Lyh/p;Lkotlin/coroutines/c;)Ljava/lang/Object;", "b", "Landroidx/compose/foundation/gestures/r;", "transformScope", "Landroidx/compose/foundation/MutatorMutex;", ak.aF, "Landroidx/compose/foundation/MutatorMutex;", "transformMutex", "Landroidx/compose/runtime/a1;", "", "d", "Landroidx/compose/runtime/a1;", "isTransformingState", "Lkotlin/Function3;", "", "Lkotlin/m0;", "name", "zoomChange", "Lb1/f;", "panChange", "rotationChange", "onTransformation", "Lyh/q;", "f", "()Lyh/q;", "()Z", "isTransformInProgress", "<init>", "(Lyh/q;)V", "foundation_release"}, k = 1, mv = {1, 7, 1})
public final class DefaultTransformableState implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final yh.q<Float, b1.f, Float, b2> f5162a;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final r transformScope;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final MutatorMutex transformMutex;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final a1<Boolean> isTransformingState;

    /* JADX INFO: compiled from: TransformableState.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J-\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\t\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\n"}, d2 = {"androidx/compose/foundation/gestures/DefaultTransformableState$a", "Landroidx/compose/foundation/gestures/r;", "", "zoomChange", "Lb1/f;", "panChange", "rotationChange", "Lkotlin/b2;", ak.av, "(FJF)V", "foundation_release"}, k = 1, mv = {1, 7, 1})
    public static final class a implements r {
        a() {
        }

        @Override // androidx.compose.foundation.gestures.r
        public void a(float zoomChange, long panChange, float rotationChange) {
            DefaultTransformableState.this.f().invoke(Float.valueOf(zoomChange), b1.f.d(panChange), Float.valueOf(rotationChange));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DefaultTransformableState(@dl.d yh.q<? super Float, ? super b1.f, ? super Float, b2> onTransformation) {
        f0.p(onTransformation, "onTransformation");
        this.f5162a = onTransformation;
        this.transformScope = new a();
        this.transformMutex = new MutatorMutex();
        this.isTransformingState = h2.g(Boolean.FALSE, null, 2, null);
    }

    @Override // androidx.compose.foundation.gestures.t
    @dl.e
    public Object a(@dl.d MutatePriority mutatePriority, @dl.d yh.p<? super r, ? super kotlin.coroutines.c<? super b2>, ? extends Object> pVar, @dl.d kotlin.coroutines.c<? super b2> cVar) {
        Object objG = r0.g(new DefaultTransformableState$transform$2(this, mutatePriority, pVar, null), cVar);
        return objG == kotlin.coroutines.intrinsics.b.h() ? objG : b2.f124493a;
    }

    @Override // androidx.compose.foundation.gestures.t
    public boolean b() {
        return this.isTransformingState.getValue().booleanValue();
    }

    @dl.d
    public final yh.q<Float, b1.f, Float, b2> f() {
        return this.f5162a;
    }
}
