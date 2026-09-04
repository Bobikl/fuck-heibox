package kotlinx.coroutines.debug.internal;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;
import kotlinx.coroutines.internal.o0;

/* JADX INFO: compiled from: ConcurrentWeakMap.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u000e\u0010\u0002\u001a\u00020\u0001*\u0004\u0018\u00010\u0000H\u0002\u001a\b\u0010\u0004\u001a\u00020\u0003H\u0002\"\u0014\u0010\b\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007\"\u0014\u0010\n\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0007\"\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r\"\u0014\u0010\u0010\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\u000f\"\u0014\u0010\u0011\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u000f¨\u0006\u0012"}, d2 = {"", "Lkotlinx/coroutines/debug/internal/h;", "d", "", "e", "", ak.av, "I", "MAGIC", "b", "MIN_CAPACITY", "Lkotlinx/coroutines/internal/o0;", ak.aF, "Lkotlinx/coroutines/internal/o0;", "REHASH", "Lkotlinx/coroutines/debug/internal/h;", "MARKED_NULL", "MARKED_TRUE", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f129156a = -1640531527;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f129157b = 16;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private static final o0 f129158c = new o0("REHASH");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private static final h f129159d = new h(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private static final h f129160e = new h(Boolean.TRUE);

    /* JADX INFO: Access modifiers changed from: private */
    public static final h d(Object obj) {
        if (obj == null) {
            return f129159d;
        }
        return f0.g(obj, Boolean.TRUE) ? f129160e : new h(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void e() {
        throw new UnsupportedOperationException("not implemented");
    }
}
