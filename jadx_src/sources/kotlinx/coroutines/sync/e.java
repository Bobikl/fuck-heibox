package kotlinx.coroutines.sync;

import com.google.common.util.concurrent.r1;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.starlightc.ucropplus.ui.UCropPlusActivity;
import com.umeng.analytics.pro.ak;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.Metadata;
import kotlinx.coroutines.internal.l0;

/* JADX INFO: compiled from: Semaphore.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0006\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B!\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0000\u0012\u0006\u0010\u001c\u001a\u00020\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0086\b¢\u0006\u0004\b\u0005\u0010\u0006J\"\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u0086\b¢\u0006\u0004\b\t\u0010\nJ,\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u0086\b¢\u0006\u0004\b\r\u0010\u000eJ$\u0010\u000f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u0086\b¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001f"}, d2 = {"Lkotlinx/coroutines/sync/e;", "Lkotlinx/coroutines/internal/l0;", "", UCropPlusActivity.ARG_INDEX, "", ak.aG, "(I)Ljava/lang/Object;", "value", "Lkotlin/b2;", RXScreenCaptureService.KEY_WIDTH, "(ILjava/lang/Object;)V", "expected", "", "t", "(ILjava/lang/Object;Ljava/lang/Object;)Z", "v", "(ILjava/lang/Object;)Ljava/lang/Object;", ak.aB, "(I)V", "", "toString", "()Ljava/lang/String;", "p", "()I", "maxSlots", "", "id", "prev", "pointers", "<init>", "(JLkotlinx/coroutines/sync/e;I)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class e extends l0<e> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    /* synthetic */ AtomicReferenceArray f130488e;

    public e(long j10, @dl.e e eVar, int i10) {
        super(j10, eVar, i10);
        this.f130488e = new AtomicReferenceArray(SemaphoreKt.f130480f);
    }

    @Override // kotlinx.coroutines.internal.l0
    public int p() {
        return SemaphoreKt.f130480f;
    }

    public final void s(int index) {
        this.f130488e.set(index, SemaphoreKt.f130479e);
        q();
    }

    public final boolean t(int index, @dl.e Object expected, @dl.e Object value) {
        return r1.a(this.f130488e, index, expected, value);
    }

    @dl.d
    public String toString() {
        return "SemaphoreSegment[id=" + getId() + ", hashCode=" + hashCode() + ']';
    }

    @dl.e
    public final Object u(int index) {
        return this.f130488e.get(index);
    }

    @dl.e
    public final Object v(int index, @dl.e Object value) {
        return this.f130488e.getAndSet(index, value);
    }

    public final void w(int index, @dl.e Object value) {
        this.f130488e.set(index, value);
    }
}
