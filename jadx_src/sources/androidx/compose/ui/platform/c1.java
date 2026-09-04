package androidx.compose.ui.platform;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: compiled from: WindowRecomposer.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u000b\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000b\u0010\fR+\u0010\n\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028V@VX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Landroidx/compose/ui/platform/c1;", "Landroidx/compose/ui/q;", "", "<set-?>", "b", "Landroidx/compose/runtime/a1;", "a0", "()F", ak.aF, "(F)V", "scaleFactor", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 7, 1})
public final class c1 implements androidx.compose.ui.q {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final androidx.compose.runtime.a1 scaleFactor = androidx.compose.runtime.h2.g(Float.valueOf(1.0f), null, 2, null);

    @Override // kotlin.coroutines.CoroutineContext
    @dl.d
    public CoroutineContext I(@dl.d CoroutineContext coroutineContext) {
        return androidx.compose.ui.q.a.d(this, coroutineContext);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.ui.q
    public float a0() {
        return ((Number) this.scaleFactor.getValue()).floatValue();
    }

    public void c(float f10) {
        this.scaleFactor.setValue(Float.valueOf(f10));
    }

    @Override // kotlin.coroutines.CoroutineContext.a, kotlin.coroutines.CoroutineContext
    @dl.d
    public CoroutineContext d(@dl.d CoroutineContext.b<?> bVar) {
        return androidx.compose.ui.q.a.c(this, bVar);
    }

    @Override // kotlin.coroutines.CoroutineContext.a, kotlin.coroutines.CoroutineContext
    @dl.e
    public <E extends CoroutineContext.a> E f(@dl.d CoroutineContext.b<E> bVar) {
        return (E) androidx.compose.ui.q.a.b(this, bVar);
    }

    @Override // kotlin.coroutines.CoroutineContext.a, kotlin.coroutines.CoroutineContext
    public <R> R g(R r10, @dl.d yh.p<? super R, ? super CoroutineContext.a, ? extends R> pVar) {
        return (R) androidx.compose.ui.q.a.a(this, r10, pVar);
    }

    @Override // androidx.compose.ui.q, kotlin.coroutines.CoroutineContext.a
    public /* synthetic */ CoroutineContext.b getKey() {
        return androidx.compose.ui.p.a(this);
    }
}
