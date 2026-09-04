package androidx.sqlite.db.framework;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.database.sqlite.SQLiteStatement;
import android.database.sqlite.SQLiteTransactionListener;
import android.os.Build;
import android.os.CancellationSignal;
import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.u;
import androidx.annotation.w0;
import com.max.xiaoheihe.okflutter.containers.FlutterActivityLaunchConfigs;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import com.xiaomi.mipush.sdk.Constants;
import j3.j;
import j3.l;
import java.io.IOException;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;
import yh.r;

/* JADX INFO: compiled from: FrameworkSQLiteDatabase.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b%\b\u0000\u0018\u0000 j2\u00020\u0001:\u0002kCB\u000f\u0012\u0006\u0010E\u001a\u00020@¢\u0006\u0004\bh\u0010iJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\b\u001a\u00020\u0006H\u0016J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016J\u0010\u0010\f\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016J\b\u0010\r\u001a\u00020\u0006H\u0016J\b\u0010\u000e\u001a\u00020\u0006H\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016J\b\u0010\u0011\u001a\u00020\u000fH\u0016J\u0010\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J\u0010\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0012H\u0016J+\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0019\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0018\u0018\u00010\u0017H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u0002H\u0016J)\u0010\u001f\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u00022\u0010\u0010\u0019\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00180\u0017H\u0016¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\"\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020!H\u0016J\u001a\u0010%\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020!2\b\u0010$\u001a\u0004\u0018\u00010#H\u0017J \u0010+\u001a\u00020\u00122\u0006\u0010&\u001a\u00020\u00022\u0006\u0010(\u001a\u00020'2\u0006\u0010*\u001a\u00020)H\u0016J5\u0010.\u001a\u00020'2\u0006\u0010&\u001a\u00020\u00022\b\u0010,\u001a\u0004\u0018\u00010\u00022\u0012\u0010-\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0018\u0018\u00010\u0017H\u0016¢\u0006\u0004\b.\u0010/JE\u00100\u001a\u00020'2\u0006\u0010&\u001a\u00020\u00022\u0006\u0010(\u001a\u00020'2\u0006\u0010*\u001a\u00020)2\b\u0010,\u001a\u0004\u0018\u00010\u00022\u0012\u0010-\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0018\u0018\u00010\u0017H\u0016¢\u0006\u0004\b0\u00101J\u0010\u00102\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J)\u00103\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0010\u0010\u0019\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00180\u0017H\u0016¢\u0006\u0004\b3\u0010\u001bJ\u0010\u00105\u001a\u00020\u000f2\u0006\u00104\u001a\u00020'H\u0016J\u0010\u00108\u001a\u00020\u00062\u0006\u00107\u001a\u000206H\u0016J\u0010\u0010:\u001a\u00020\u00062\u0006\u00109\u001a\u00020'H\u0016J\u0010\u0010<\u001a\u00020\u00062\u0006\u0010;\u001a\u00020\u000fH\u0017J\b\u0010=\u001a\u00020\u000fH\u0016J\b\u0010>\u001a\u00020\u0006H\u0017J\b\u0010?\u001a\u00020\u0006H\u0016J\u000e\u0010B\u001a\u00020\u000f2\u0006\u0010A\u001a\u00020@R\u0014\u0010E\u001a\u00020@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR.\u0010K\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020G\u0018\u00010F8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bB\u0010H\u001a\u0004\bI\u0010JR\u0014\u0010N\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bL\u0010MR$\u0010T\u001a\u00020'2\u0006\u0010O\u001a\u00020'8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR$\u0010Y\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00128V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR\u0014\u0010[\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bZ\u0010MR$\u0010^\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00128V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\\\u0010V\"\u0004\b]\u0010XR\u0014\u0010_\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b_\u0010MR\u0014\u0010`\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b`\u0010MR\u0016\u0010c\u001a\u0004\u0018\u00010\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\ba\u0010bR\u0014\u0010e\u001a\u00020\u000f8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bd\u0010MR\u0014\u0010g\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bf\u0010M¨\u0006l"}, d2 = {"Landroidx/sqlite/db/framework/FrameworkSQLiteDatabase;", "Lj3/g;", "", com.tekartik.sqflite.b.f98602u, "Lj3/l;", "s1", "Lkotlin/b2;", ak.aG, "D", "Landroid/database/sqlite/SQLiteTransactionListener;", "transactionListener", "T0", "H1", "U0", "O0", "", "I1", "B1", "", "sleepAfterYieldDelayMillis", "o1", "numBytes", "Q0", "", "", "bindArgs", "g1", "(Ljava/lang/String;[Ljava/lang/Object;)V", "query", "Landroid/database/Cursor;", "D1", "U", "(Ljava/lang/String;[Ljava/lang/Object;)Landroid/database/Cursor;", "Lj3/j;", "u1", "Landroid/os/CancellationSignal;", "cancellationSignal", "B", "table", "", "conflictAlgorithm", "Landroid/content/ContentValues;", "values", "n0", "whereClause", "whereArgs", "l", "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)I", "x1", "(Ljava/lang/String;ILandroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/Object;)I", "y0", "P0", "newVersion", "G", "Ljava/util/Locale;", "locale", "setLocale", "cacheSize", "O1", "enabled", "b0", "N0", RXScreenCaptureService.KEY_WIDTH, "close", "Landroid/database/sqlite/SQLiteDatabase;", "sqLiteDatabase", ak.aF, "b", "Landroid/database/sqlite/SQLiteDatabase;", "delegate", "", "Landroid/util/Pair;", "Ljava/util/List;", "v", "()Ljava/util/List;", "attachedDbs", "F", "()Z", "isDbLockedByCurrentThread", "value", "getVersion", "()I", "p1", "(I)V", "version", "k0", "()J", "f", "(J)V", "maximumSize", androidx.exifinterface.media.a.S4, "isExecPerConnectionSQLSupported", "L0", "Q1", "pageSize", "isReadOnly", "isOpen", "getPath", "()Ljava/lang/String;", FlutterActivityLaunchConfigs.EXTRA_PATH, "N1", "isWriteAheadLoggingEnabled", "A0", "isDatabaseIntegrityOk", "<init>", "(Landroid/database/sqlite/SQLiteDatabase;)V", "d", ak.av, "sqlite-framework_release"}, k = 1, mv = {1, 7, 1})
public final class FrameworkSQLiteDatabase implements j3.g {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private static final String[] f27456e = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    private static final String[] f27457f = new String[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final SQLiteDatabase delegate;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private final List<Pair<String, String>> attachedDbs;

    /* JADX INFO: compiled from: FrameworkSQLiteDatabase.kt */
    @w0(30)
    @Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ3\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0007\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Landroidx/sqlite/db/framework/FrameworkSQLiteDatabase$a;", "", "Landroid/database/sqlite/SQLiteDatabase;", "sQLiteDatabase", "", com.tekartik.sqflite.b.f98602u, "", "bindArgs", "Lkotlin/b2;", ak.av, "(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;[Ljava/lang/Object;)V", "<init>", "()V", "sqlite-framework_release"}, k = 1, mv = {1, 7, 1})
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @dl.d
        public static final a f27460a = new a();

        private a() {
        }

        @u
        public final void a(@dl.d SQLiteDatabase sQLiteDatabase, @dl.d String sql, @dl.e Object[] bindArgs) {
            f0.p(sQLiteDatabase, "sQLiteDatabase");
            f0.p(sql, "sql");
            sQLiteDatabase.execPerConnectionSQL(sql, bindArgs);
        }
    }

    public FrameworkSQLiteDatabase(@dl.d SQLiteDatabase delegate) {
        f0.p(delegate, "delegate");
        this.delegate = delegate;
        this.attachedDbs = delegate.getAttachedDbs();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Cursor d(r tmp0, SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        f0.p(tmp0, "$tmp0");
        return (Cursor) tmp0.U0(sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Cursor e(j query, SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        f0.p(query, "$query");
        f0.m(sQLiteQuery);
        query.b(new f(sQLiteQuery));
        return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
    }

    @Override // j3.g
    public boolean A0() {
        return this.delegate.isDatabaseIntegrityOk();
    }

    @Override // j3.g
    @dl.d
    @w0(16)
    public Cursor B(@dl.d final j query, @dl.e CancellationSignal cancellationSignal) {
        f0.p(query, "query");
        SQLiteDatabase sQLiteDatabase = this.delegate;
        String f124204b = query.getF124204b();
        String[] strArr = f27457f;
        f0.m(cancellationSignal);
        return j3.c.a.f(sQLiteDatabase, f124204b, strArr, null, cancellationSignal, new SQLiteDatabase.CursorFactory() { // from class: androidx.sqlite.db.framework.a
            @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
            public final Cursor newCursor(SQLiteDatabase sQLiteDatabase2, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                return FrameworkSQLiteDatabase.e(query, sQLiteDatabase2, sQLiteCursorDriver, str, sQLiteQuery);
            }
        });
    }

    @Override // j3.g
    public boolean B1() {
        return this.delegate.yieldIfContendedSafely();
    }

    @Override // j3.g
    public void D() {
        this.delegate.beginTransactionNonExclusive();
    }

    @Override // j3.g
    @dl.d
    public Cursor D1(@dl.d String query) {
        f0.p(query, "query");
        return u1(new j3.b(query));
    }

    @Override // j3.g
    public boolean E() {
        return Build.VERSION.SDK_INT >= 30;
    }

    @Override // j3.g
    public boolean F() {
        return this.delegate.isDbLockedByCurrentThread();
    }

    @Override // j3.g
    public boolean G(int newVersion) {
        return this.delegate.needUpgrade(newVersion);
    }

    @Override // j3.g
    public void H1(@dl.d SQLiteTransactionListener transactionListener) {
        f0.p(transactionListener, "transactionListener");
        this.delegate.beginTransactionWithListenerNonExclusive(transactionListener);
    }

    @Override // j3.g
    public boolean I1() {
        return this.delegate.inTransaction();
    }

    @Override // j3.g
    public long L0() {
        return this.delegate.getPageSize();
    }

    @Override // j3.g
    public boolean N0() {
        return this.delegate.enableWriteAheadLogging();
    }

    @Override // j3.g
    @w0(api = 16)
    public boolean N1() {
        return j3.c.a.e(this.delegate);
    }

    @Override // j3.g
    public void O0() {
        this.delegate.setTransactionSuccessful();
    }

    @Override // j3.g
    public void O1(int i10) {
        this.delegate.setMaxSqlCacheSize(i10);
    }

    @Override // j3.g
    public void P0(@dl.d String sql, @dl.d Object[] bindArgs) throws SQLException {
        f0.p(sql, "sql");
        f0.p(bindArgs, "bindArgs");
        this.delegate.execSQL(sql, bindArgs);
    }

    @Override // j3.g
    public long Q0(long numBytes) {
        this.delegate.setMaximumSize(numBytes);
        return this.delegate.getMaximumSize();
    }

    @Override // j3.g
    public void Q1(long j10) {
        this.delegate.setPageSize(j10);
    }

    @Override // j3.g
    public void T0(@dl.d SQLiteTransactionListener transactionListener) {
        f0.p(transactionListener, "transactionListener");
        this.delegate.beginTransactionWithListener(transactionListener);
    }

    @Override // j3.g
    @dl.d
    public Cursor U(@dl.d String query, @dl.d Object[] bindArgs) {
        f0.p(query, "query");
        f0.p(bindArgs, "bindArgs");
        return u1(new j3.b(query, bindArgs));
    }

    @Override // j3.g
    public void U0() {
        this.delegate.endTransaction();
    }

    @Override // j3.g
    @w0(api = 16)
    public void b0(boolean z10) {
        j3.c.a.g(this.delegate, z10);
    }

    public final boolean c(@dl.d SQLiteDatabase sqLiteDatabase) {
        f0.p(sqLiteDatabase, "sqLiteDatabase");
        return f0.g(this.delegate, sqLiteDatabase);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.delegate.close();
    }

    public void f(long j10) {
        this.delegate.setMaximumSize(j10);
    }

    @Override // j3.g
    public void g1(@dl.d String sql, @dl.e Object[] bindArgs) {
        f0.p(sql, "sql");
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30) {
            a.f27460a.a(this.delegate, sql, bindArgs);
            return;
        }
        throw new UnsupportedOperationException("execPerConnectionSQL is not supported on a SDK version lower than 30, current version is: " + i10);
    }

    @Override // j3.g
    @dl.e
    public String getPath() {
        return this.delegate.getPath();
    }

    @Override // j3.g
    public int getVersion() {
        return this.delegate.getVersion();
    }

    @Override // j3.g
    public boolean isOpen() {
        return this.delegate.isOpen();
    }

    @Override // j3.g
    public boolean isReadOnly() {
        return this.delegate.isReadOnly();
    }

    @Override // j3.g
    public long k0() {
        return this.delegate.getMaximumSize();
    }

    @Override // j3.g
    public int l(@dl.d String table, @dl.e String whereClause, @dl.e Object[] whereArgs) {
        f0.p(table, "table");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("DELETE FROM ");
        sb2.append(table);
        if (!(whereClause == null || whereClause.length() == 0)) {
            sb2.append(" WHERE ");
            sb2.append(whereClause);
        }
        String string = sb2.toString();
        f0.o(string, "StringBuilder().apply(builderAction).toString()");
        l lVarS1 = s1(string);
        j3.b.f124203d.b(lVarS1, whereArgs);
        return lVarS1.y();
    }

    @Override // j3.g
    public long n0(@dl.d String table, int conflictAlgorithm, @dl.d ContentValues values) throws SQLException {
        f0.p(table, "table");
        f0.p(values, "values");
        return this.delegate.insertWithOnConflict(table, null, values, conflictAlgorithm);
    }

    @Override // j3.g
    public boolean o1(long sleepAfterYieldDelayMillis) {
        return this.delegate.yieldIfContendedSafely(sleepAfterYieldDelayMillis);
    }

    @Override // j3.g
    public void p1(int i10) {
        this.delegate.setVersion(i10);
    }

    @Override // j3.g
    @dl.d
    public l s1(@dl.d String sql) {
        f0.p(sql, "sql");
        SQLiteStatement sQLiteStatementCompileStatement = this.delegate.compileStatement(sql);
        f0.o(sQLiteStatementCompileStatement, "delegate.compileStatement(sql)");
        return new g(sQLiteStatementCompileStatement);
    }

    @Override // j3.g
    public void setLocale(@dl.d Locale locale) {
        f0.p(locale, "locale");
        this.delegate.setLocale(locale);
    }

    @Override // j3.g
    public void u() {
        this.delegate.beginTransaction();
    }

    @Override // j3.g
    @dl.d
    public Cursor u1(@dl.d final j query) {
        f0.p(query, "query");
        final r<SQLiteDatabase, SQLiteCursorDriver, String, SQLiteQuery, SQLiteCursor> rVar = new r<SQLiteDatabase, SQLiteCursorDriver, String, SQLiteQuery, SQLiteCursor>() { // from class: androidx.sqlite.db.framework.FrameworkSQLiteDatabase$query$cursorFactory$1
            {
                super(4);
            }

            @Override // yh.r
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final SQLiteCursor U0(@dl.e SQLiteDatabase sQLiteDatabase, @dl.e SQLiteCursorDriver sQLiteCursorDriver, @dl.e String str, @dl.e SQLiteQuery sQLiteQuery) {
                j jVar = query;
                f0.m(sQLiteQuery);
                jVar.b(new f(sQLiteQuery));
                return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
            }
        };
        Cursor cursorRawQueryWithFactory = this.delegate.rawQueryWithFactory(new SQLiteDatabase.CursorFactory() { // from class: androidx.sqlite.db.framework.b
            @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
            public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                return FrameworkSQLiteDatabase.d(rVar, sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
            }
        }, query.getF124204b(), f27457f, null);
        f0.o(cursorRawQueryWithFactory, "delegate.rawQueryWithFac…EMPTY_STRING_ARRAY, null)");
        return cursorRawQueryWithFactory;
    }

    @Override // j3.g
    @dl.e
    public List<Pair<String, String>> v() {
        return this.attachedDbs;
    }

    @Override // j3.g
    @w0(api = 16)
    public void w() {
        j3.c.a.d(this.delegate);
    }

    @Override // j3.g
    public int x1(@dl.d String table, int conflictAlgorithm, @dl.d ContentValues values, @dl.e String whereClause, @dl.e Object[] whereArgs) {
        f0.p(table, "table");
        f0.p(values, "values");
        int i10 = 0;
        if (!(values.size() != 0)) {
            throw new IllegalArgumentException("Empty values".toString());
        }
        int size = values.size();
        int length = whereArgs == null ? size : whereArgs.length + size;
        Object[] objArr = new Object[length];
        StringBuilder sb2 = new StringBuilder();
        sb2.append("UPDATE ");
        sb2.append(f27456e[conflictAlgorithm]);
        sb2.append(table);
        sb2.append(" SET ");
        for (String str : values.keySet()) {
            sb2.append(i10 > 0 ? Constants.ACCEPT_TIME_SEPARATOR_SP : "");
            sb2.append(str);
            objArr[i10] = values.get(str);
            sb2.append("=?");
            i10++;
        }
        if (whereArgs != null) {
            for (int i11 = size; i11 < length; i11++) {
                objArr[i11] = whereArgs[i11 - size];
            }
        }
        if (!TextUtils.isEmpty(whereClause)) {
            sb2.append(" WHERE ");
            sb2.append(whereClause);
        }
        String string = sb2.toString();
        f0.o(string, "StringBuilder().apply(builderAction).toString()");
        l lVarS1 = s1(string);
        j3.b.f124203d.b(lVarS1, objArr);
        return lVarS1.y();
    }

    @Override // j3.g
    public void y0(@dl.d String sql) throws SQLException {
        f0.p(sql, "sql");
        this.delegate.execSQL(sql);
    }
}
