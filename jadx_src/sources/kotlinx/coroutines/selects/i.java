package kotlinx.coroutines.selects;

import com.umeng.analytics.pro.ak;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import kotlin.Metadata;

/* JADX INFO: compiled from: Select.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lkotlinx/coroutines/selects/i;", "", "", ak.av, "()J", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ AtomicLongFieldUpdater f130435a = AtomicLongFieldUpdater.newUpdater(i.class, "number");

    @dl.d
    private volatile /* synthetic */ long number = 1;

    public final long a() {
        return f130435a.incrementAndGet(this);
    }
}
