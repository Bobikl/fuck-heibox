package m;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* JADX INFO: compiled from: CacheDbHelper.java */
/* JADX INFO: loaded from: classes.dex */
public class a extends SQLiteOpenHelper {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f131430c = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public SQLiteDatabase f131431b;

    public a(Context context) {
        super(context, "LookupResult.db", (SQLiteDatabase.CursorFactory) null, 1);
    }

    public final SQLiteDatabase a() {
        if (this.f131431b == null) {
            try {
                this.f131431b = getWritableDatabase();
            } catch (Exception e10) {
                f.b.e("get db error " + e10, new Object[0]);
            }
        }
        return this.f131431b;
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x00ac */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(java.lang.String[] r9) {
        /*
            r8 = this;
            int r0 = r9.length
            if (r0 <= 0) goto Laf
            java.lang.Object r0 = m.a.f131430c
            monitor-enter(r0)
            r1 = 0
            r2 = 0
            android.database.sqlite.SQLiteDatabase r1 = r8.a()     // Catch: java.lang.Throwable -> L56 java.lang.Exception -> L58
            r1.beginTransaction()     // Catch: java.lang.Throwable -> L56 java.lang.Exception -> L58
            java.lang.String r3 = "lookupDB"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L56 java.lang.Exception -> L58
            r4.<init>()     // Catch: java.lang.Throwable -> L56 java.lang.Exception -> L58
            java.lang.String r5 = "host IN ("
            r4.append(r5)     // Catch: java.lang.Throwable -> L56 java.lang.Exception -> L58
            java.lang.String r5 = ","
            int r6 = r9.length     // Catch: java.lang.Throwable -> L56 java.lang.Exception -> L58
            java.lang.String r7 = "?"
            java.util.List r6 = java.util.Collections.nCopies(r6, r7)     // Catch: java.lang.Throwable -> L56 java.lang.Exception -> L58
            java.lang.String r5 = android.text.TextUtils.join(r5, r6)     // Catch: java.lang.Throwable -> L56 java.lang.Exception -> L58
            r4.append(r5)     // Catch: java.lang.Throwable -> L56 java.lang.Exception -> L58
            java.lang.String r5 = ")"
            r4.append(r5)     // Catch: java.lang.Throwable -> L56 java.lang.Exception -> L58
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L56 java.lang.Exception -> L58
            r1.delete(r3, r4, r9)     // Catch: java.lang.Throwable -> L56 java.lang.Exception -> L58
            r1.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L56 java.lang.Exception -> L58
            r1.endTransaction()     // Catch: java.lang.Exception -> L3e java.lang.Throwable -> Lac
            goto L8c
        L3e:
            r9 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lac
            r1.<init>()     // Catch: java.lang.Throwable -> Lac
            java.lang.String r3 = "db end transaction error "
            r1.append(r3)     // Catch: java.lang.Throwable -> Lac
            r1.append(r9)     // Catch: java.lang.Throwable -> Lac
            java.lang.String r9 = r1.toString()     // Catch: java.lang.Throwable -> Lac
            java.lang.Object[] r1 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> Lac
            f.b.e(r9, r1)     // Catch: java.lang.Throwable -> Lac
            goto L8c
        L56:
            r9 = move-exception
            goto L8e
        L58:
            r9 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L56
            r3.<init>()     // Catch: java.lang.Throwable -> L56
            java.lang.String r4 = "delete by hostname fail"
            r3.append(r4)     // Catch: java.lang.Throwable -> L56
            r3.append(r9)     // Catch: java.lang.Throwable -> L56
            java.lang.String r9 = r3.toString()     // Catch: java.lang.Throwable -> L56
            java.lang.Object[] r3 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L56
            f.b.e(r9, r3)     // Catch: java.lang.Throwable -> L56
            if (r1 == 0) goto L8c
            r1.endTransaction()     // Catch: java.lang.Exception -> L75 java.lang.Throwable -> Lac
            goto L8c
        L75:
            r9 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lac
            r1.<init>()     // Catch: java.lang.Throwable -> Lac
            java.lang.String r3 = "db end transaction error "
            r1.append(r3)     // Catch: java.lang.Throwable -> Lac
            r1.append(r9)     // Catch: java.lang.Throwable -> Lac
            java.lang.String r9 = r1.toString()     // Catch: java.lang.Throwable -> Lac
            java.lang.Object[] r1 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> Lac
            f.b.e(r9, r1)     // Catch: java.lang.Throwable -> Lac
        L8c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lac
            goto Laf
        L8e:
            if (r1 == 0) goto Lab
            r1.endTransaction()     // Catch: java.lang.Exception -> L94 java.lang.Throwable -> Lac
            goto Lab
        L94:
            r1 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lac
            r3.<init>()     // Catch: java.lang.Throwable -> Lac
            java.lang.String r4 = "db end transaction error "
            r3.append(r4)     // Catch: java.lang.Throwable -> Lac
            r3.append(r1)     // Catch: java.lang.Throwable -> Lac
            java.lang.String r1 = r3.toString()     // Catch: java.lang.Throwable -> Lac
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> Lac
            f.b.e(r1, r2)     // Catch: java.lang.Throwable -> Lac
        Lab:
            throw r9     // Catch: java.lang.Throwable -> Lac
        Lac:
            r9 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lac
            throw r9
        Laf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: m.a.b(java.lang.String[]):void");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        try {
            sQLiteDatabase.execSQL("CREATE TABLE lookupDB (host TEXT PRIMARY KEY,result TEXT)");
        } catch (Exception e10) {
            f.b.e("create db fail " + e10, new Object[0]);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        if (i10 != i11) {
            try {
                sQLiteDatabase.execSQL("DROP TABLE IF EXISTS lookupDB");
                onCreate(sQLiteDatabase);
            } catch (Exception e10) {
                f.b.e("upgrade db fail " + e10, new Object[0]);
            }
        }
    }
}
