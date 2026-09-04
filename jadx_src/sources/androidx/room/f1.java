package androidx.room;

import com.umeng.analytics.pro.ak;
import java.util.concurrent.Executor;
import kotlin.Metadata;

/* JADX INFO: compiled from: QueryInterceptorOpenHelperFactory.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u000e\u001a\u00020\u0001\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0011"}, d2 = {"Landroidx/room/f1;", "Lj3/h$c;", "Lj3/h$b;", "configuration", "Lj3/h;", ak.av, "Ljava/util/concurrent/Executor;", "b", "Ljava/util/concurrent/Executor;", "queryCallbackExecutor", "Landroidx/room/RoomDatabase$f;", ak.aF, "Landroidx/room/RoomDatabase$f;", "queryCallback", "delegate", "<init>", "(Lj3/h$c;Ljava/util/concurrent/Executor;Landroidx/room/RoomDatabase$f;)V", "room-runtime_release"}, k = 1, mv = {1, 7, 1})
public final class f1 implements j3.h.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final j3.h.c f27178a;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final Executor queryCallbackExecutor;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final RoomDatabase.f queryCallback;

    public f1(@dl.d j3.h.c delegate, @dl.d Executor queryCallbackExecutor, @dl.d RoomDatabase.f queryCallback) {
        kotlin.jvm.internal.f0.p(delegate, "delegate");
        kotlin.jvm.internal.f0.p(queryCallbackExecutor, "queryCallbackExecutor");
        kotlin.jvm.internal.f0.p(queryCallback, "queryCallback");
        this.f27178a = delegate;
        this.queryCallbackExecutor = queryCallbackExecutor;
        this.queryCallback = queryCallback;
    }

    @Override // j3.h.c
    @dl.d
    public j3.h a(@dl.d j3.h.b configuration) {
        kotlin.jvm.internal.f0.p(configuration, "configuration");
        return new e1(this.f27178a.a(configuration), this.queryCallbackExecutor, this.queryCallback);
    }
}
