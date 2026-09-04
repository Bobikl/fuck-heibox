package kotlinx.coroutines.debug.internal;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: AgentInstallationType.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\t\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nR\"\u0010\b\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0003\u0010\u0007¨\u0006\u000b"}, d2 = {"Lkotlinx/coroutines/debug/internal/a;", "", "", "b", "Z", ak.av, "()Z", "(Z)V", "isInstalledStatically", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final a f129154a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static boolean isInstalledStatically;

    private a() {
    }

    public final boolean a() {
        return isInstalledStatically;
    }

    public final void b(boolean z10) {
        isInstalledStatically = z10;
    }
}
