package androidx.room;

import com.starlightc.ucropplus.ui.UCropPlusActivity;
import com.umeng.analytics.pro.ak;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.Metadata;

/* JADX INFO: compiled from: QueryInterceptorStatement.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010(\u001a\u00020\u0001\u0012\u0006\u0010\u001b\u001a\u00020\u000e\u0012\u0006\u0010\u001f\u001a\u00020\u001c\u0012\u0006\u0010#\u001a\u00020 ¢\u0006\u0004\b)\u0010*J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002J\t\u0010\b\u001a\u00020\u0006H\u0096\u0001J\b\u0010\t\u001a\u00020\u0006H\u0016J\b\u0010\n\u001a\u00020\u0002H\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016J\b\u0010\r\u001a\u00020\u000bH\u0016J\n\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016J\u0010\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0002H\u0016J\u0018\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u000bH\u0016J\u0018\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0013H\u0016J\u0018\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u000eH\u0016J\u0018\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0016H\u0016J\b\u0010\u0018\u001a\u00020\u0006H\u0016R\u0014\u0010\u001b\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010#\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u001c\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006+"}, d2 = {"Landroidx/room/m1;", "Lj3/l;", "", "bindIndex", "", "value", "Lkotlin/b2;", "k", "close", com.tekartik.sqflite.b.f98590i, "y", "", "k1", androidx.exifinterface.media.a.f23244d5, "", "S0", UCropPlusActivity.ARG_INDEX, "r0", "d0", "", "F0", "X", "", "l0", "R1", ak.aF, "Ljava/lang/String;", "sqlStatement", "Ljava/util/concurrent/Executor;", "d", "Ljava/util/concurrent/Executor;", "queryCallbackExecutor", "Landroidx/room/RoomDatabase$f;", "e", "Landroidx/room/RoomDatabase$f;", "queryCallback", "", "f", "Ljava/util/List;", "bindArgsCache", "delegate", "<init>", "(Lj3/l;Ljava/lang/String;Ljava/util/concurrent/Executor;Landroidx/room/RoomDatabase$f;)V", "room-runtime_release"}, k = 1, mv = {1, 7, 1})
public final class m1 implements j3.l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final j3.l f27243b;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final String sqlStatement;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final Executor queryCallbackExecutor;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final RoomDatabase.f queryCallback;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final List<Object> bindArgsCache;

    public m1(@dl.d j3.l delegate, @dl.d String sqlStatement, @dl.d Executor queryCallbackExecutor, @dl.d RoomDatabase.f queryCallback) {
        kotlin.jvm.internal.f0.p(delegate, "delegate");
        kotlin.jvm.internal.f0.p(sqlStatement, "sqlStatement");
        kotlin.jvm.internal.f0.p(queryCallbackExecutor, "queryCallbackExecutor");
        kotlin.jvm.internal.f0.p(queryCallback, "queryCallback");
        this.f27243b = delegate;
        this.sqlStatement = sqlStatement;
        this.queryCallbackExecutor = queryCallbackExecutor;
        this.queryCallback = queryCallback;
        this.bindArgsCache = new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(m1 this$0) {
        kotlin.jvm.internal.f0.p(this$0, "this$0");
        this$0.queryCallback.a(this$0.sqlStatement, this$0.bindArgsCache);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(m1 this$0) {
        kotlin.jvm.internal.f0.p(this$0, "this$0");
        this$0.queryCallback.a(this$0.sqlStatement, this$0.bindArgsCache);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(m1 this$0) {
        kotlin.jvm.internal.f0.p(this$0, "this$0");
        this$0.queryCallback.a(this$0.sqlStatement, this$0.bindArgsCache);
    }

    private final void k(int i10, Object obj) {
        int i11 = i10 - 1;
        if (i11 >= this.bindArgsCache.size()) {
            int size = (i11 - this.bindArgsCache.size()) + 1;
            for (int i12 = 0; i12 < size; i12++) {
                this.bindArgsCache.add(null);
            }
        }
        this.bindArgsCache.set(i11, obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(m1 this$0) {
        kotlin.jvm.internal.f0.p(this$0, "this$0");
        this$0.queryCallback.a(this$0.sqlStatement, this$0.bindArgsCache);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(m1 this$0) {
        kotlin.jvm.internal.f0.p(this$0, "this$0");
        this$0.queryCallback.a(this$0.sqlStatement, this$0.bindArgsCache);
    }

    @Override // j3.i
    public void F0(int i10, double d10) {
        k(i10, Double.valueOf(d10));
        this.f27243b.F0(i10, d10);
    }

    @Override // j3.i
    public void R1() {
        this.bindArgsCache.clear();
        this.f27243b.R1();
    }

    @Override // j3.l
    @dl.e
    public String S0() {
        this.queryCallbackExecutor.execute(new Runnable() { // from class: androidx.room.k1
            @Override // java.lang.Runnable
            public final void run() {
                m1.n(this.f27232b);
            }
        });
        return this.f27243b.S0();
    }

    @Override // j3.l
    public long T() {
        this.queryCallbackExecutor.execute(new Runnable() { // from class: androidx.room.l1
            @Override // java.lang.Runnable
            public final void run() {
                m1.m(this.f27235b);
            }
        });
        return this.f27243b.T();
    }

    @Override // j3.i
    public void X(int i10, @dl.d String value) {
        kotlin.jvm.internal.f0.p(value, "value");
        k(i10, value);
        this.f27243b.X(i10, value);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f27243b.close();
    }

    @Override // j3.i
    public void d0(int i10, long j10) {
        k(i10, Long.valueOf(j10));
        this.f27243b.d0(i10, j10);
    }

    @Override // j3.l
    public void execute() {
        this.queryCallbackExecutor.execute(new Runnable() { // from class: androidx.room.i1
            @Override // java.lang.Runnable
            public final void run() {
                m1.f(this.f27190b);
            }
        });
        this.f27243b.execute();
    }

    @Override // j3.l
    public long k1() {
        this.queryCallbackExecutor.execute(new Runnable() { // from class: androidx.room.j1
            @Override // java.lang.Runnable
            public final void run() {
                m1.g(this.f27216b);
            }
        });
        return this.f27243b.k1();
    }

    @Override // j3.i
    public void l0(int i10, @dl.d byte[] value) {
        kotlin.jvm.internal.f0.p(value, "value");
        k(i10, value);
        this.f27243b.l0(i10, value);
    }

    @Override // j3.i
    public void r0(int i10) {
        Object[] array = this.bindArgsCache.toArray(new Object[0]);
        kotlin.jvm.internal.f0.n(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        k(i10, Arrays.copyOf(array, array.length));
        this.f27243b.r0(i10);
    }

    @Override // j3.l
    public int y() {
        this.queryCallbackExecutor.execute(new Runnable() { // from class: androidx.room.h1
            @Override // java.lang.Runnable
            public final void run() {
                m1.i(this.f27186b);
            }
        });
        return this.f27243b.y();
    }
}
