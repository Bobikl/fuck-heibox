package kotlinx.coroutines.internal;

import com.umeng.analytics.pro.ak;
import java.util.List;
import kotlin.Metadata;
import kotlinx.coroutines.n2;
import kotlinx.coroutines.z1;

/* JADX INFO: compiled from: MainDispatchers.kt */
/* JADX INFO: loaded from: classes5.dex */
@z1
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lkotlinx/coroutines/internal/f0;", "Lkotlinx/coroutines/internal/b0;", "", "allFactories", "Lkotlinx/coroutines/n2;", ak.aF, "", ak.av, "()I", "loadPriority", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class f0 implements b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final f0 f130165a = new f0();

    private f0() {
    }

    @Override // kotlinx.coroutines.internal.b0
    public int a() {
        return -1;
    }

    @Override // kotlinx.coroutines.internal.b0
    @dl.e
    public String b() {
        return b0.a.a(this);
    }

    @Override // kotlinx.coroutines.internal.b0
    @dl.d
    public n2 c(@dl.d List<? extends b0> allFactories) {
        return new e0(null, null, 2, null);
    }
}
