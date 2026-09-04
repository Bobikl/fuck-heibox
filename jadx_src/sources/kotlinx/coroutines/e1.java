package kotlinx.coroutines;

import com.umeng.analytics.pro.ak;
import com.umeng.message.common.UPushNotificationChannel;
import kotlin.Metadata;

/* JADX INFO: compiled from: Dispatchers.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0018\u0010\nJ\b\u0010\u0003\u001a\u00020\u0002H\u0007R \u0010\u000b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR \u0010\u000f\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010\u0006\u0012\u0004\b\u000e\u0010\n\u001a\u0004\b\r\u0010\bR \u0010\u0012\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010\u0006\u0012\u0004\b\u0011\u0010\n\u001a\u0004\b\f\u0010\bR\u001a\u0010\u0017\u001a\u00020\u00138FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0016\u0010\n\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, d2 = {"Lkotlinx/coroutines/e1;", "", "Lkotlin/b2;", "i", "Lkotlinx/coroutines/CoroutineDispatcher;", "b", "Lkotlinx/coroutines/CoroutineDispatcher;", ak.av, "()Lkotlinx/coroutines/CoroutineDispatcher;", "getDefault$annotations", "()V", UPushNotificationChannel.DEFAULT_NOTIFICATION_CHANNEL_NAME, ak.aF, "g", "getUnconfined$annotations", "Unconfined", "d", "getIO$annotations", "IO", "Lkotlinx/coroutines/n2;", "e", "()Lkotlinx/coroutines/n2;", "getMain$annotations", "Main", "<init>", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class e1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final e1 f129185a = new e1();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private static final CoroutineDispatcher Default = kotlinx.coroutines.scheduling.c.f130358j;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private static final CoroutineDispatcher Unconfined = n3.f130283d;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private static final CoroutineDispatcher IO = kotlinx.coroutines.scheduling.b.f130356e;

    private e1() {
    }

    @dl.d
    public static final CoroutineDispatcher a() {
        return Default;
    }

    @xh.m
    public static /* synthetic */ void b() {
    }

    @dl.d
    public static final CoroutineDispatcher c() {
        return IO;
    }

    @xh.m
    public static /* synthetic */ void d() {
    }

    @dl.d
    public static final n2 e() {
        return kotlinx.coroutines.internal.c0.dispatcher;
    }

    @xh.m
    public static /* synthetic */ void f() {
    }

    @dl.d
    public static final CoroutineDispatcher g() {
        return Unconfined;
    }

    @xh.m
    public static /* synthetic */ void h() {
    }

    @z0
    public final void i() {
        u0.f130491i.shutdown();
        kotlinx.coroutines.scheduling.c.f130358j.x0();
    }
}
