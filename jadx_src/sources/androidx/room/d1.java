package androidx.room;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteTransactionListener;
import android.os.CancellationSignal;
import android.util.Pair;
import com.max.xiaoheihe.okflutter.containers.FlutterActivityLaunchConfigs;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* JADX INFO: compiled from: QueryInterceptorDatabase.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b!\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010g\u001a\u00020\u0001\u0012\u0006\u0010C\u001a\u00020@\u0012\u0006\u0010G\u001a\u00020D¢\u0006\u0004\bh\u0010iJ\t\u0010\u0003\u001a\u00020\u0002H\u0096\u0001J6\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0012\u0010\t\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\b\u0018\u00010\u0007H\u0096\u0001¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\r\u001a\u00020\u0002H\u0097\u0001J\t\u0010\u000f\u001a\u00020\u000eH\u0096\u0001J.\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00042\u0014\b\u0001\u0010\u0011\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\b\u0018\u00010\u0007H\u0096\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0014\u001a\u00020\u000eH\u0096\u0001J!\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0016H\u0096\u0001J\u0011\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\nH\u0096\u0001J\u0011\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u000eH\u0097\u0001J\u0011\u0010 \u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u001eH\u0096\u0001J\u0011\u0010\"\u001a\u00020\u00022\u0006\u0010!\u001a\u00020\nH\u0096\u0001J\u0011\u0010$\u001a\u00020\u00182\u0006\u0010#\u001a\u00020\u0018H\u0096\u0001JF\u0010%\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0012\u0010\t\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\b\u0018\u00010\u0007H\u0096\u0001¢\u0006\u0004\b%\u0010&J\t\u0010'\u001a\u00020\u000eH\u0096\u0001J\u0011\u0010)\u001a\u00020\u000e2\u0006\u0010(\u001a\u00020\u0018H\u0096\u0001J\u0010\u0010+\u001a\u00020*2\u0006\u0010\u0010\u001a\u00020\u0004H\u0016J\b\u0010,\u001a\u00020\u0002H\u0016J\b\u0010-\u001a\u00020\u0002H\u0016J\u0010\u00100\u001a\u00020\u00022\u0006\u0010/\u001a\u00020.H\u0016J\u0010\u00101\u001a\u00020\u00022\u0006\u0010/\u001a\u00020.H\u0016J\b\u00102\u001a\u00020\u0002H\u0016J\b\u00103\u001a\u00020\u0002H\u0016J\u0010\u00106\u001a\u0002052\u0006\u00104\u001a\u00020\u0004H\u0016J)\u00107\u001a\u0002052\u0006\u00104\u001a\u00020\u00042\u0010\u0010\u0011\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\b0\u0007H\u0016¢\u0006\u0004\b7\u00108J\u0010\u0010:\u001a\u0002052\u0006\u00104\u001a\u000209H\u0016J\u001a\u0010=\u001a\u0002052\u0006\u00104\u001a\u0002092\b\u0010<\u001a\u0004\u0018\u00010;H\u0016J\u0010\u0010>\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0004H\u0016J)\u0010?\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00042\u0010\u0010\u0011\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\b0\u0007H\u0016¢\u0006\u0004\b?\u0010\u0013R\u0014\u0010C\u001a\u00020@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010G\u001a\u00020D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR(\u0010L\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040I\u0018\u00010H8VX\u0096\u0005¢\u0006\u0006\u001a\u0004\bJ\u0010KR\u0014\u0010O\u001a\u00020\u000e8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bM\u0010NR\u0014\u0010Q\u001a\u00020\u000e8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bP\u0010NR\u0014\u0010S\u001a\u00020\u000e8VX\u0096\u0005¢\u0006\u0006\u001a\u0004\bR\u0010NR\u0014\u0010T\u001a\u00020\u000e8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bT\u0010NR\u0014\u0010U\u001a\u00020\u000e8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bU\u0010NR\u0014\u0010W\u001a\u00020\u000e8WX\u0096\u0005¢\u0006\u0006\u001a\u0004\bV\u0010NR\u0014\u0010Z\u001a\u00020\u00188\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bX\u0010YR\u001c\u0010^\u001a\u00020\u00188\u0016@\u0016X\u0096\u000f¢\u0006\f\u001a\u0004\b[\u0010Y\"\u0004\b\\\u0010]R\u0016\u0010a\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b_\u0010`R\u001c\u0010f\u001a\u00020\n8\u0016@\u0016X\u0096\u000f¢\u0006\f\u001a\u0004\bb\u0010c\"\u0004\bd\u0010e¨\u0006j"}, d2 = {"Landroidx/room/d1;", "Lj3/g;", "Lkotlin/b2;", "close", "", "table", "whereClause", "", "", "whereArgs", "", "l", "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)I", RXScreenCaptureService.KEY_WIDTH, "", "N0", com.tekartik.sqflite.b.f98602u, "bindArgs", "g1", "(Ljava/lang/String;[Ljava/lang/Object;)V", "I1", "conflictAlgorithm", "Landroid/content/ContentValues;", "values", "", "n0", "newVersion", "G", "enabled", "b0", "Ljava/util/Locale;", "locale", "setLocale", "cacheSize", "O1", "numBytes", "Q0", "x1", "(Ljava/lang/String;ILandroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/Object;)I", "B1", "sleepAfterYieldDelayMillis", "o1", "Lj3/l;", "s1", ak.aG, "D", "Landroid/database/sqlite/SQLiteTransactionListener;", "transactionListener", "T0", "H1", "U0", "O0", "query", "Landroid/database/Cursor;", "D1", "U", "(Ljava/lang/String;[Ljava/lang/Object;)Landroid/database/Cursor;", "Lj3/j;", "u1", "Landroid/os/CancellationSignal;", "cancellationSignal", "B", "y0", "P0", "Ljava/util/concurrent/Executor;", ak.aF, "Ljava/util/concurrent/Executor;", "queryCallbackExecutor", "Landroidx/room/RoomDatabase$f;", "d", "Landroidx/room/RoomDatabase$f;", "queryCallback", "", "Landroid/util/Pair;", "v", "()Ljava/util/List;", "attachedDbs", "A0", "()Z", "isDatabaseIntegrityOk", "F", "isDbLockedByCurrentThread", androidx.exifinterface.media.a.S4, "isExecPerConnectionSQLSupported", "isOpen", "isReadOnly", "N1", "isWriteAheadLoggingEnabled", "k0", "()J", "maximumSize", "L0", "Q1", "(J)V", "pageSize", "getPath", "()Ljava/lang/String;", FlutterActivityLaunchConfigs.EXTRA_PATH, "getVersion", "()I", "p1", "(I)V", "version", "delegate", "<init>", "(Lj3/g;Ljava/util/concurrent/Executor;Landroidx/room/RoomDatabase$f;)V", "room-runtime_release"}, k = 1, mv = {1, 7, 1})
public final class d1 implements j3.g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final j3.g f27099b;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final Executor queryCallbackExecutor;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final RoomDatabase.f queryCallback;

    public d1(@dl.d j3.g delegate, @dl.d Executor queryCallbackExecutor, @dl.d RoomDatabase.f queryCallback) {
        kotlin.jvm.internal.f0.p(delegate, "delegate");
        kotlin.jvm.internal.f0.p(queryCallbackExecutor, "queryCallbackExecutor");
        kotlin.jvm.internal.f0.p(queryCallback, "queryCallback");
        this.f27099b = delegate;
        this.queryCallbackExecutor = queryCallbackExecutor;
        this.queryCallback = queryCallback;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void A(d1 this$0, String query) {
        kotlin.jvm.internal.f0.p(this$0, "this$0");
        kotlin.jvm.internal.f0.p(query, "$query");
        this$0.queryCallback.a(query, CollectionsKt__CollectionsKt.E());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void C(d1 this$0, String query, Object[] bindArgs) {
        kotlin.jvm.internal.f0.p(this$0, "this$0");
        kotlin.jvm.internal.f0.p(query, "$query");
        kotlin.jvm.internal.f0.p(bindArgs, "$bindArgs");
        this$0.queryCallback.a(query, ArraysKt___ArraysKt.kz(bindArgs));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void I(d1 this$0, j3.j query, g1 queryInterceptorProgram) {
        kotlin.jvm.internal.f0.p(this$0, "this$0");
        kotlin.jvm.internal.f0.p(query, "$query");
        kotlin.jvm.internal.f0.p(queryInterceptorProgram, "$queryInterceptorProgram");
        this$0.queryCallback.a(query.getF124204b(), queryInterceptorProgram.a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void J(d1 this$0, j3.j query, g1 queryInterceptorProgram) {
        kotlin.jvm.internal.f0.p(this$0, "this$0");
        kotlin.jvm.internal.f0.p(query, "$query");
        kotlin.jvm.internal.f0.p(queryInterceptorProgram, "$queryInterceptorProgram");
        this$0.queryCallback.a(query.getF124204b(), queryInterceptorProgram.a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void K(d1 this$0) {
        kotlin.jvm.internal.f0.p(this$0, "this$0");
        this$0.queryCallback.a("TRANSACTION SUCCESSFUL", CollectionsKt__CollectionsKt.E());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(d1 this$0) {
        kotlin.jvm.internal.f0.p(this$0, "this$0");
        this$0.queryCallback.a("BEGIN EXCLUSIVE TRANSACTION", CollectionsKt__CollectionsKt.E());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q(d1 this$0) {
        kotlin.jvm.internal.f0.p(this$0, "this$0");
        this$0.queryCallback.a("BEGIN DEFERRED TRANSACTION", CollectionsKt__CollectionsKt.E());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(d1 this$0) {
        kotlin.jvm.internal.f0.p(this$0, "this$0");
        this$0.queryCallback.a("BEGIN EXCLUSIVE TRANSACTION", CollectionsKt__CollectionsKt.E());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s(d1 this$0) {
        kotlin.jvm.internal.f0.p(this$0, "this$0");
        this$0.queryCallback.a("BEGIN DEFERRED TRANSACTION", CollectionsKt__CollectionsKt.E());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t(d1 this$0) {
        kotlin.jvm.internal.f0.p(this$0, "this$0");
        this$0.queryCallback.a("END TRANSACTION", CollectionsKt__CollectionsKt.E());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x(d1 this$0, String sql) {
        kotlin.jvm.internal.f0.p(this$0, "this$0");
        kotlin.jvm.internal.f0.p(sql, "$sql");
        this$0.queryCallback.a(sql, CollectionsKt__CollectionsKt.E());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void z(d1 this$0, String sql, List inputArguments) {
        kotlin.jvm.internal.f0.p(this$0, "this$0");
        kotlin.jvm.internal.f0.p(sql, "$sql");
        kotlin.jvm.internal.f0.p(inputArguments, "$inputArguments");
        this$0.queryCallback.a(sql, inputArguments);
    }

    @Override // j3.g
    public boolean A0() {
        return this.f27099b.A0();
    }

    @Override // j3.g
    @dl.d
    public Cursor B(@dl.d final j3.j query, @dl.e CancellationSignal cancellationSignal) {
        kotlin.jvm.internal.f0.p(query, "query");
        final g1 g1Var = new g1();
        query.b(g1Var);
        this.queryCallbackExecutor.execute(new Runnable() { // from class: androidx.room.u0
            @Override // java.lang.Runnable
            public final void run() {
                d1.J(this.f27268b, query, g1Var);
            }
        });
        return this.f27099b.u1(query);
    }

    @Override // j3.g
    public boolean B1() {
        return this.f27099b.B1();
    }

    @Override // j3.g
    public void D() {
        this.queryCallbackExecutor.execute(new Runnable() { // from class: androidx.room.r0
            @Override // java.lang.Runnable
            public final void run() {
                d1.q(this.f27256b);
            }
        });
        this.f27099b.D();
    }

    @Override // j3.g
    @dl.d
    public Cursor D1(@dl.d final String query) {
        kotlin.jvm.internal.f0.p(query, "query");
        this.queryCallbackExecutor.execute(new Runnable() { // from class: androidx.room.a1
            @Override // java.lang.Runnable
            public final void run() {
                d1.A(this.f27030b, query);
            }
        });
        return this.f27099b.D1(query);
    }

    @Override // j3.g
    public boolean E() {
        return this.f27099b.E();
    }

    @Override // j3.g
    public boolean F() {
        return this.f27099b.F();
    }

    @Override // j3.g
    public boolean G(int newVersion) {
        return this.f27099b.G(newVersion);
    }

    @Override // j3.g
    public void H1(@dl.d SQLiteTransactionListener transactionListener) {
        kotlin.jvm.internal.f0.p(transactionListener, "transactionListener");
        this.queryCallbackExecutor.execute(new Runnable() { // from class: androidx.room.x0
            @Override // java.lang.Runnable
            public final void run() {
                d1.s(this.f27360b);
            }
        });
        this.f27099b.H1(transactionListener);
    }

    @Override // j3.g
    public boolean I1() {
        return this.f27099b.I1();
    }

    @Override // j3.g
    public long L0() {
        return this.f27099b.L0();
    }

    @Override // j3.g
    public boolean N0() {
        return this.f27099b.N0();
    }

    @Override // j3.g
    @androidx.annotation.w0(api = 16)
    public boolean N1() {
        return this.f27099b.N1();
    }

    @Override // j3.g
    public void O0() {
        this.queryCallbackExecutor.execute(new Runnable() { // from class: androidx.room.w0
            @Override // java.lang.Runnable
            public final void run() {
                d1.K(this.f27341b);
            }
        });
        this.f27099b.O0();
    }

    @Override // j3.g
    public void O1(int i10) {
        this.f27099b.O1(i10);
    }

    @Override // j3.g
    public void P0(@dl.d final String sql, @dl.d Object[] bindArgs) {
        kotlin.jvm.internal.f0.p(sql, "sql");
        kotlin.jvm.internal.f0.p(bindArgs, "bindArgs");
        final ArrayList arrayList = new ArrayList();
        arrayList.addAll(kotlin.collections.s.k(bindArgs));
        this.queryCallbackExecutor.execute(new Runnable() { // from class: androidx.room.c1
            @Override // java.lang.Runnable
            public final void run() {
                d1.z(this.f27083b, sql, arrayList);
            }
        });
        this.f27099b.P0(sql, new List[]{arrayList});
    }

    @Override // j3.g
    public long Q0(long numBytes) {
        return this.f27099b.Q0(numBytes);
    }

    @Override // j3.g
    public void Q1(long j10) {
        this.f27099b.Q1(j10);
    }

    @Override // j3.g
    public void T0(@dl.d SQLiteTransactionListener transactionListener) {
        kotlin.jvm.internal.f0.p(transactionListener, "transactionListener");
        this.queryCallbackExecutor.execute(new Runnable() { // from class: androidx.room.t0
            @Override // java.lang.Runnable
            public final void run() {
                d1.r(this.f27261b);
            }
        });
        this.f27099b.T0(transactionListener);
    }

    @Override // j3.g
    @dl.d
    public Cursor U(@dl.d final String query, @dl.d final Object[] bindArgs) {
        kotlin.jvm.internal.f0.p(query, "query");
        kotlin.jvm.internal.f0.p(bindArgs, "bindArgs");
        this.queryCallbackExecutor.execute(new Runnable() { // from class: androidx.room.v0
            @Override // java.lang.Runnable
            public final void run() {
                d1.C(this.f27321b, query, bindArgs);
            }
        });
        return this.f27099b.U(query, bindArgs);
    }

    @Override // j3.g
    public void U0() {
        this.queryCallbackExecutor.execute(new Runnable() { // from class: androidx.room.b1
            @Override // java.lang.Runnable
            public final void run() {
                d1.t(this.f27052b);
            }
        });
        this.f27099b.U0();
    }

    @Override // j3.g
    @androidx.annotation.w0(api = 16)
    public void b0(boolean z10) {
        this.f27099b.b0(z10);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f27099b.close();
    }

    @Override // j3.g
    public void g1(@dl.d String sql, @dl.e @SuppressLint({"ArrayReturn"}) Object[] bindArgs) {
        kotlin.jvm.internal.f0.p(sql, "sql");
        this.f27099b.g1(sql, bindArgs);
    }

    @Override // j3.g
    @dl.e
    public String getPath() {
        return this.f27099b.getPath();
    }

    @Override // j3.g
    public int getVersion() {
        return this.f27099b.getVersion();
    }

    @Override // j3.g
    public boolean isOpen() {
        return this.f27099b.isOpen();
    }

    @Override // j3.g
    public boolean isReadOnly() {
        return this.f27099b.isReadOnly();
    }

    @Override // j3.g
    public long k0() {
        return this.f27099b.k0();
    }

    @Override // j3.g
    public int l(@dl.d String table, @dl.e String whereClause, @dl.e Object[] whereArgs) {
        kotlin.jvm.internal.f0.p(table, "table");
        return this.f27099b.l(table, whereClause, whereArgs);
    }

    @Override // j3.g
    public long n0(@dl.d String table, int conflictAlgorithm, @dl.d ContentValues values) {
        kotlin.jvm.internal.f0.p(table, "table");
        kotlin.jvm.internal.f0.p(values, "values");
        return this.f27099b.n0(table, conflictAlgorithm, values);
    }

    @Override // j3.g
    public boolean o1(long sleepAfterYieldDelayMillis) {
        return this.f27099b.o1(sleepAfterYieldDelayMillis);
    }

    @Override // j3.g
    public void p1(int i10) {
        this.f27099b.p1(i10);
    }

    @Override // j3.g
    @dl.d
    public j3.l s1(@dl.d String sql) {
        kotlin.jvm.internal.f0.p(sql, "sql");
        return new m1(this.f27099b.s1(sql), sql, this.queryCallbackExecutor, this.queryCallback);
    }

    @Override // j3.g
    public void setLocale(@dl.d Locale locale) {
        kotlin.jvm.internal.f0.p(locale, "locale");
        this.f27099b.setLocale(locale);
    }

    @Override // j3.g
    public void u() {
        this.queryCallbackExecutor.execute(new Runnable() { // from class: androidx.room.z0
            @Override // java.lang.Runnable
            public final void run() {
                d1.p(this.f27369b);
            }
        });
        this.f27099b.u();
    }

    @Override // j3.g
    @dl.d
    public Cursor u1(@dl.d final j3.j query) {
        kotlin.jvm.internal.f0.p(query, "query");
        final g1 g1Var = new g1();
        query.b(g1Var);
        this.queryCallbackExecutor.execute(new Runnable() { // from class: androidx.room.y0
            @Override // java.lang.Runnable
            public final void run() {
                d1.I(this.f27362b, query, g1Var);
            }
        });
        return this.f27099b.u1(query);
    }

    @Override // j3.g
    @dl.e
    public List<Pair<String, String>> v() {
        return this.f27099b.v();
    }

    @Override // j3.g
    @androidx.annotation.w0(api = 16)
    public void w() {
        this.f27099b.w();
    }

    @Override // j3.g
    public int x1(@dl.d String table, int conflictAlgorithm, @dl.d ContentValues values, @dl.e String whereClause, @dl.e Object[] whereArgs) {
        kotlin.jvm.internal.f0.p(table, "table");
        kotlin.jvm.internal.f0.p(values, "values");
        return this.f27099b.x1(table, conflictAlgorithm, values, whereClause, whereArgs);
    }

    @Override // j3.g
    public void y0(@dl.d final String sql) {
        kotlin.jvm.internal.f0.p(sql, "sql");
        this.queryCallbackExecutor.execute(new Runnable() { // from class: androidx.room.s0
            @Override // java.lang.Runnable
            public final void run() {
                d1.x(this.f27257b, sql);
            }
        });
        this.f27099b.y0(sql);
    }
}
