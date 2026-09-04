package kotlinx.coroutines.sync;

import com.starlightc.ucropplus.ui.UCropPlusActivity;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.b2;
import kotlinx.coroutines.n;

/* JADX INFO: compiled from: Semaphore.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lkotlinx/coroutines/sync/a;", "Lkotlinx/coroutines/n;", "", "cause", "Lkotlin/b2;", ak.av, "", "toString", "Lkotlinx/coroutines/sync/e;", "b", "Lkotlinx/coroutines/sync/e;", "segment", "", ak.aF, "I", UCropPlusActivity.ARG_INDEX, "<init>", "(Lkotlinx/coroutines/sync/e;I)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class a extends n {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final e segment;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int index;

    public a(@dl.d e eVar, int i10) {
        this.segment = eVar;
        this.index = i10;
    }

    @Override // kotlinx.coroutines.o
    public void a(@dl.e Throwable th2) {
        this.segment.s(this.index);
    }

    @Override // yh.l
    public /* bridge */ /* synthetic */ b2 invoke(Throwable th2) {
        a(th2);
        return b2.f124493a;
    }

    @dl.d
    public String toString() {
        return "CancelSemaphoreAcquisitionHandler[" + this.segment + ", " + this.index + ']';
    }
}
