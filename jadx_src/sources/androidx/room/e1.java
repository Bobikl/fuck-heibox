package androidx.room;

import com.umeng.analytics.pro.ak;
import java.util.concurrent.Executor;
import kotlin.Metadata;

/* JADX INFO: compiled from: QueryInterceptorOpenHelper.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0010\u001a\u00020\u0001\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u001e\u0010\u001fJ\t\u0010\u0004\u001a\u00020\u0003H\u0096\u0001J\u0011\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0097\u0001R\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001a\u0010\u0010\u001a\u00020\u00018\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u00148\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001a¨\u0006 "}, d2 = {"Landroidx/room/e1;", "Lj3/h;", "Landroidx/room/l;", "Lkotlin/b2;", "close", "", "enabled", "setWriteAheadLoggingEnabled", "Ljava/util/concurrent/Executor;", ak.aF, "Ljava/util/concurrent/Executor;", "queryCallbackExecutor", "Landroidx/room/RoomDatabase$f;", "d", "Landroidx/room/RoomDatabase$f;", "queryCallback", "delegate", "Lj3/h;", "getDelegate", "()Lj3/h;", "", "getDatabaseName", "()Ljava/lang/String;", "databaseName", "Lj3/g;", "getWritableDatabase", "()Lj3/g;", "writableDatabase", "getReadableDatabase", "readableDatabase", "<init>", "(Lj3/h;Ljava/util/concurrent/Executor;Landroidx/room/RoomDatabase$f;)V", "room-runtime_release"}, k = 1, mv = {1, 7, 1})
public final class e1 implements j3.h, l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final j3.h f27107b;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final Executor queryCallbackExecutor;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final RoomDatabase.f queryCallback;

    public e1(@dl.d j3.h delegate, @dl.d Executor queryCallbackExecutor, @dl.d RoomDatabase.f queryCallback) {
        kotlin.jvm.internal.f0.p(delegate, "delegate");
        kotlin.jvm.internal.f0.p(queryCallbackExecutor, "queryCallbackExecutor");
        kotlin.jvm.internal.f0.p(queryCallback, "queryCallback");
        this.f27107b = delegate;
        this.queryCallbackExecutor = queryCallbackExecutor;
        this.queryCallback = queryCallback;
    }

    @Override // j3.h, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f27107b.close();
    }

    @Override // j3.h
    @dl.e
    /* JADX INFO: renamed from: getDatabaseName */
    public String getName() {
        return this.f27107b.getName();
    }

    @Override // androidx.room.l
    @dl.d
    /* JADX INFO: renamed from: getDelegate, reason: from getter */
    public j3.h getF27107b() {
        return this.f27107b;
    }

    @Override // j3.h
    @dl.d
    public j3.g getReadableDatabase() {
        return new d1(getF27107b().getReadableDatabase(), this.queryCallbackExecutor, this.queryCallback);
    }

    @Override // j3.h
    @dl.d
    public j3.g getWritableDatabase() {
        return new d1(getF27107b().getWritableDatabase(), this.queryCallbackExecutor, this.queryCallback);
    }

    @Override // j3.h
    @androidx.annotation.w0(api = 16)
    public void setWriteAheadLoggingEnabled(boolean z10) {
        this.f27107b.setWriteAheadLoggingEnabled(z10);
    }
}
