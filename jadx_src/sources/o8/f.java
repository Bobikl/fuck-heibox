package o8;

import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.google.android.exoplayer2.util.u;

/* JADX INFO: compiled from: StandaloneDatabaseProvider.java */
/* JADX INFO: loaded from: classes7.dex */
public class f extends SQLiteOpenHelper implements b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f132223b = "exoplayer_internal.db";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f132224c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f132225d = "SADatabaseProvider";

    public f(Context context) {
        super(context.getApplicationContext(), f132223b, (SQLiteDatabase.CursorFactory) null, 1);
    }

    private static void a(SQLiteDatabase sQLiteDatabase) {
        Cursor cursorQuery = sQLiteDatabase.query("sqlite_master", new String[]{"type", "name"}, null, null, null, null, null);
        while (cursorQuery.moveToNext()) {
            try {
                String string = cursorQuery.getString(0);
                String string2 = cursorQuery.getString(1);
                if (!"sqlite_sequence".equals(string2)) {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(string).length() + 16 + String.valueOf(string2).length());
                    sb2.append("DROP ");
                    sb2.append(string);
                    sb2.append(" IF EXISTS ");
                    sb2.append(string2);
                    String string3 = sb2.toString();
                    try {
                        sQLiteDatabase.execSQL(string3);
                    } catch (SQLException e10) {
                        String strValueOf = String.valueOf(string3);
                        u.e(f132225d, strValueOf.length() != 0 ? "Error executing ".concat(strValueOf) : new String("Error executing "), e10);
                    }
                }
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
        }
        cursorQuery.close();
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        a(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
    }
}
