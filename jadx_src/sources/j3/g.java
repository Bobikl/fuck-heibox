package j3;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteTransactionListener;
import android.os.CancellationSignal;
import android.util.Pair;
import androidx.annotation.w0;
import com.max.xiaoheihe.okflutter.containers.FlutterActivityLaunchConfigs;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import java.io.Closeable;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;

/* JADX INFO: compiled from: SupportSQLiteDatabase.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0007\u001a\u00020\u0006H&J\b\u0010\b\u001a\u00020\u0006H&J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH&J\u0010\u0010\f\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH&J\b\u0010\r\u001a\u00020\u0006H&J\b\u0010\u000e\u001a\u00020\u0006H&J\b\u0010\u0010\u001a\u00020\u000fH&J\b\u0010\u0011\u001a\u00020\u000fH&J\u0010\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012H&J-\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0014\b\u0001\u0010\u0017\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0016\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u0012H&J\u0010\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u0002H&J)\u0010\u001f\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u00022\u0010\u0010\u0017\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00160\u0015H&¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\"\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020!H&J\u001a\u0010%\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020!2\b\u0010$\u001a\u0004\u0018\u00010#H'J \u0010+\u001a\u00020\u00122\u0006\u0010&\u001a\u00020\u00022\u0006\u0010(\u001a\u00020'2\u0006\u0010*\u001a\u00020)H&J5\u0010.\u001a\u00020'2\u0006\u0010&\u001a\u00020\u00022\b\u0010,\u001a\u0004\u0018\u00010\u00022\u0012\u0010-\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0016\u0018\u00010\u0015H&¢\u0006\u0004\b.\u0010/JE\u00100\u001a\u00020'2\u0006\u0010&\u001a\u00020\u00022\u0006\u0010(\u001a\u00020'2\u0006\u0010*\u001a\u00020)2\b\u0010,\u001a\u0004\u0018\u00010\u00022\u0012\u0010-\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0016\u0018\u00010\u0015H&¢\u0006\u0004\b0\u00101J\u0010\u00102\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&J)\u00103\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0010\u0010\u0017\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00160\u0015H&¢\u0006\u0004\b3\u0010\u0019J\u0010\u00105\u001a\u00020\u000f2\u0006\u00104\u001a\u00020'H&J\u0010\u00108\u001a\u00020\u00062\u0006\u00107\u001a\u000206H&J\u0010\u0010:\u001a\u00020\u00062\u0006\u00109\u001a\u00020'H&J\u0010\u0010<\u001a\u00020\u00062\u0006\u0010;\u001a\u00020\u000fH'J\b\u0010=\u001a\u00020\u000fH&J\b\u0010>\u001a\u00020\u0006H'R\u0014\u0010A\u001a\u00020\u000f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b?\u0010@R\u0014\u0010C\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bB\u0010@R\u001c\u0010H\u001a\u00020'8&@&X¦\u000e¢\u0006\f\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR\u0014\u0010K\u001a\u00020\u00128&X¦\u0004¢\u0006\u0006\u001a\u0004\bI\u0010JR\u001c\u0010O\u001a\u00020\u00128&@&X¦\u000e¢\u0006\f\u001a\u0004\bL\u0010J\"\u0004\bM\u0010NR\u0014\u0010P\u001a\u00020\u000f8&X¦\u0004¢\u0006\u0006\u001a\u0004\bP\u0010@R\u0014\u0010Q\u001a\u00020\u000f8&X¦\u0004¢\u0006\u0006\u001a\u0004\bQ\u0010@R\u0016\u0010T\u001a\u0004\u0018\u00010\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\bR\u0010SR\u0014\u0010V\u001a\u00020\u000f8gX¦\u0004¢\u0006\u0006\u001a\u0004\bU\u0010@R(\u0010[\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020X\u0018\u00010W8fX¦\u0004¢\u0006\u0006\u001a\u0004\bY\u0010ZR\u0014\u0010]\u001a\u00020\u000f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\\\u0010@ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006^À\u0006\u0001"}, d2 = {"Lj3/g;", "Ljava/io/Closeable;", "", com.tekartik.sqflite.b.f98602u, "Lj3/l;", "s1", "Lkotlin/b2;", ak.aG, "D", "Landroid/database/sqlite/SQLiteTransactionListener;", "transactionListener", "T0", "H1", "U0", "O0", "", "I1", "B1", "", "sleepAfterYieldDelayMillis", "o1", "", "", "bindArgs", "g1", "(Ljava/lang/String;[Ljava/lang/Object;)V", "numBytes", "Q0", "query", "Landroid/database/Cursor;", "D1", "U", "(Ljava/lang/String;[Ljava/lang/Object;)Landroid/database/Cursor;", "Lj3/j;", "u1", "Landroid/os/CancellationSignal;", "cancellationSignal", "B", "table", "", "conflictAlgorithm", "Landroid/content/ContentValues;", "values", "n0", "whereClause", "whereArgs", "l", "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)I", "x1", "(Ljava/lang/String;ILandroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/Object;)I", "y0", "P0", "newVersion", "G", "Ljava/util/Locale;", "locale", "setLocale", "cacheSize", "O1", "enabled", "b0", "N0", RXScreenCaptureService.KEY_WIDTH, "F", "()Z", "isDbLockedByCurrentThread", androidx.exifinterface.media.a.S4, "isExecPerConnectionSQLSupported", "getVersion", "()I", "p1", "(I)V", "version", "k0", "()J", "maximumSize", "L0", "Q1", "(J)V", "pageSize", "isReadOnly", "isOpen", "getPath", "()Ljava/lang/String;", FlutterActivityLaunchConfigs.EXTRA_PATH, "N1", "isWriteAheadLoggingEnabled", "", "Landroid/util/Pair;", "v", "()Ljava/util/List;", "attachedDbs", "A0", "isDatabaseIntegrityOk", "sqlite_release"}, k = 1, mv = {1, 7, 1})
public interface g extends Closeable {
    boolean A0();

    @dl.d
    @w0(api = 16)
    Cursor B(@dl.d j query, @dl.e CancellationSignal cancellationSignal);

    boolean B1();

    void D();

    @dl.d
    Cursor D1(@dl.d String query);

    boolean E();

    boolean F();

    boolean G(int newVersion);

    void H1(@dl.d SQLiteTransactionListener sQLiteTransactionListener);

    boolean I1();

    long L0();

    boolean N0();

    @w0(api = 16)
    boolean N1();

    void O0();

    void O1(int i10);

    void P0(@dl.d String sql, @dl.d Object[] bindArgs) throws SQLException;

    long Q0(long numBytes);

    void Q1(long j10);

    void T0(@dl.d SQLiteTransactionListener sQLiteTransactionListener);

    @dl.d
    Cursor U(@dl.d String query, @dl.d Object[] bindArgs);

    void U0();

    @w0(api = 16)
    void b0(boolean z10);

    void g1(@dl.d String sql, @dl.e @SuppressLint({"ArrayReturn"}) Object[] bindArgs);

    @dl.e
    String getPath();

    int getVersion();

    boolean isOpen();

    boolean isReadOnly();

    long k0();

    int l(@dl.d String table, @dl.e String whereClause, @dl.e Object[] whereArgs);

    long n0(@dl.d String table, int conflictAlgorithm, @dl.d ContentValues values) throws SQLException;

    boolean o1(long sleepAfterYieldDelayMillis);

    void p1(int i10);

    @dl.d
    l s1(@dl.d String sql);

    void setLocale(@dl.d Locale locale);

    void u();

    @dl.d
    Cursor u1(@dl.d j query);

    @dl.e
    List<Pair<String, String>> v();

    @w0(api = 16)
    void w();

    int x1(@dl.d String table, int conflictAlgorithm, @dl.d ContentValues values, @dl.e String whereClause, @dl.e Object[] whereArgs);

    void y0(@dl.d String str) throws SQLException;
}
