package kotlinx.coroutines;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: JobSupport.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\f\u001a\u00020\t¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0096\u0002J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0003H\u0016R\u0014\u0010\f\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"Lkotlinx/coroutines/w;", "Lkotlinx/coroutines/e2;", "Lkotlinx/coroutines/v;", "", "cause", "Lkotlin/b2;", "j0", "", ak.aF, "Lkotlinx/coroutines/x;", "f", "Lkotlinx/coroutines/x;", "childJob", "Lkotlinx/coroutines/d2;", "getParent", "()Lkotlinx/coroutines/d2;", "parent", "<init>", "(Lkotlinx/coroutines/x;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class w extends e2 implements v {

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @dl.d
    @xh.e
    public final x childJob;

    public w(@dl.d x xVar) {
        this.childJob = xVar;
    }

    @Override // kotlinx.coroutines.v
    public boolean c(@dl.d Throwable cause) {
        return k0().A0(cause);
    }

    @Override // kotlinx.coroutines.v
    @dl.d
    public d2 getParent() {
        return k0();
    }

    @Override // yh.l
    public /* bridge */ /* synthetic */ kotlin.b2 invoke(Throwable th2) {
        j0(th2);
        return kotlin.b2.f124493a;
    }

    @Override // kotlinx.coroutines.f0
    public void j0(@dl.e Throwable th2) {
        this.childJob.q(k0());
    }
}
