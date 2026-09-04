package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.h0;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.g3;

/* JADX INFO: compiled from: SnapshotContextElement.kt */
/* JADX INFO: loaded from: classes.dex */
@h0
@Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002B\u000f\u0012\u0006\u0010\f\u001a\u00020\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u001a\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003H\u0016R\u0014\u0010\f\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0018\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"Landroidx/compose/runtime/snapshots/i;", "Landroidx/compose/runtime/snapshots/h;", "Lkotlinx/coroutines/g3;", "Landroidx/compose/runtime/snapshots/f;", "Lkotlin/coroutines/CoroutineContext;", com.umeng.analytics.pro.d.R, RXScreenCaptureService.KEY_HEIGHT, "oldState", "Lkotlin/b2;", ak.aF, "b", "Landroidx/compose/runtime/snapshots/f;", "snapshot", "Lkotlin/coroutines/CoroutineContext$b;", "getKey", "()Lkotlin/coroutines/CoroutineContext$b;", "key", "<init>", "(Landroidx/compose/runtime/snapshots/f;)V", "runtime_release"}, k = 1, mv = {1, 7, 1})
public final class i implements h, g3<f> {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final f snapshot;

    public i(@dl.d f snapshot) {
        kotlin.jvm.internal.f0.p(snapshot, "snapshot");
        this.snapshot = snapshot;
    }

    @Override // kotlin.coroutines.CoroutineContext
    @dl.d
    public CoroutineContext I(@dl.d CoroutineContext coroutineContext) {
        return h.a.d(this, coroutineContext);
    }

    @Override // kotlinx.coroutines.g3
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void z(@dl.d CoroutineContext context, @dl.e f fVar) {
        kotlin.jvm.internal.f0.p(context, "context");
        this.snapshot.E(fVar);
    }

    @Override // kotlin.coroutines.CoroutineContext.a, kotlin.coroutines.CoroutineContext
    @dl.d
    public CoroutineContext d(@dl.d CoroutineContext.b<?> bVar) {
        return h.a.c(this, bVar);
    }

    @Override // kotlin.coroutines.CoroutineContext.a, kotlin.coroutines.CoroutineContext
    @dl.e
    public <E extends CoroutineContext.a> E f(@dl.d CoroutineContext.b<E> bVar) {
        return (E) h.a.b(this, bVar);
    }

    @Override // kotlin.coroutines.CoroutineContext.a, kotlin.coroutines.CoroutineContext
    public <R> R g(R r10, @dl.d yh.p<? super R, ? super CoroutineContext.a, ? extends R> pVar) {
        return (R) h.a.a(this, r10, pVar);
    }

    @Override // kotlin.coroutines.CoroutineContext.a
    @dl.d
    public CoroutineContext.b<?> getKey() {
        return h.INSTANCE;
    }

    @Override // kotlinx.coroutines.g3
    @dl.e
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public f o0(@dl.d CoroutineContext context) {
        kotlin.jvm.internal.f0.p(context, "context");
        return this.snapshot.D();
    }
}
