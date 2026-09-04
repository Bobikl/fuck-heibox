package o8;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.exoplayer2.database.DatabaseIOException;
import com.google.android.exoplayer2.util.u0;
import com.google.android.exoplayer2.y1;

/* JADX INFO: compiled from: VersionTable.java */
/* JADX INFO: loaded from: classes7.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f132226a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f132227b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f132228c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f132229d = 2;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f132230e = 1000;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f132231f = "ExoPlayerVersions";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f132232g = "feature";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f132233h = "instance_uid";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f132234i = "version";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f132235j = "feature = ? AND instance_uid = ?";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f132236k = "PRIMARY KEY (feature, instance_uid)";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f132237l = "CREATE TABLE IF NOT EXISTS ExoPlayerVersions (feature INTEGER NOT NULL,instance_uid TEXT NOT NULL,version INTEGER NOT NULL,PRIMARY KEY (feature, instance_uid))";

    static {
        y1.a("goog.exo.database");
    }

    private g() {
    }

    private static String[] a(int i10, String str) {
        return new String[]{Integer.toString(i10), str};
    }

    public static int b(SQLiteDatabase sQLiteDatabase, int i10, String str) throws DatabaseIOException {
        try {
            if (!u0.u1(sQLiteDatabase, f132231f)) {
                return -1;
            }
            Cursor cursorQuery = sQLiteDatabase.query(f132231f, new String[]{"version"}, f132235j, a(i10, str), null, null, null);
            try {
                if (cursorQuery.getCount() == 0) {
                    cursorQuery.close();
                    return -1;
                }
                cursorQuery.moveToNext();
                int i11 = cursorQuery.getInt(0);
                cursorQuery.close();
                return i11;
            } catch (Throwable th2) {
                if (cursorQuery != null) {
                    try {
                        cursorQuery.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
                throw th2;
            }
            throw new DatabaseIOException(e);
        } catch (SQLException e10) {
            throw new DatabaseIOException(e10);
        }
    }

    public static void c(SQLiteDatabase sQLiteDatabase, int i10, String str) throws DatabaseIOException {
        try {
            if (u0.u1(sQLiteDatabase, f132231f)) {
                sQLiteDatabase.delete(f132231f, f132235j, a(i10, str));
            }
        } catch (SQLException e10) {
            throw new DatabaseIOException(e10);
        }
    }

    public static void d(SQLiteDatabase sQLiteDatabase, int i10, String str, int i11) throws DatabaseIOException {
        try {
            sQLiteDatabase.execSQL(f132237l);
            ContentValues contentValues = new ContentValues();
            contentValues.put("feature", Integer.valueOf(i10));
            contentValues.put(f132233h, str);
            contentValues.put("version", Integer.valueOf(i11));
            sQLiteDatabase.replaceOrThrow(f132231f, null, contentValues);
        } catch (SQLException e10) {
            throw new DatabaseIOException(e10);
        }
    }
}
