package eg;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: RequestChain.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Leg/t;", "", "Leg/a;", "task", "Lkotlin/b2;", ak.av, "(Leg/a;)V", "b", "()V", "<init>", "permissionx_release"}, k = 1, mv = {1, 5, 1})
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.e
    private a f118680a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.e
    private a f118681b;

    public final void a(@dl.d a task) {
        f0.p(task, "task");
        if (this.f118680a == null) {
            this.f118680a = task;
        }
        a aVar = this.f118681b;
        if (aVar != null) {
            aVar.f118618b = task;
        }
        this.f118681b = task;
    }

    public final void b() {
        a aVar = this.f118680a;
        if (aVar == null) {
            return;
        }
        aVar.request();
    }
}
