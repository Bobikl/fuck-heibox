package com.igexin.push.extension.distribution.basic.e;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* JADX INFO: loaded from: classes6.dex */
public class b extends SQLiteOpenHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    SQLiteDatabase f63980a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f63981b;

    public b(Context context) {
        super(context, "pushsdk.db", (SQLiteDatabase.CursorFactory) null, 4);
        this.f63980a = null;
        this.f63981b = true;
    }

    private String a(String str, String str2) {
        return "delete from " + str + " where " + str2;
    }

    private String a(String[] strArr, String[] strArr2, int i10) {
        StringBuilder sb2 = new StringBuilder(" ");
        if (strArr.length == 1) {
            for (int i11 = 0; i11 < i10; i11++) {
                sb2.append(strArr[0]);
                sb2.append(" = '");
                sb2.append(strArr2[i11]);
                sb2.append("'");
                if (i11 < i10 - 1) {
                    sb2.append(" or ");
                }
            }
        } else {
            for (int i12 = 0; i12 < i10; i12++) {
                sb2.append(strArr[i12]);
                sb2.append(" = '");
                sb2.append(strArr2[i12]);
                sb2.append("'");
                if (i12 < i10 - 1) {
                    sb2.append(" and ");
                }
            }
        }
        return sb2.toString();
    }

    public void a(String str, String str2, ContentValues contentValues) {
        SQLiteDatabase writableDatabase = getWritableDatabase();
        this.f63980a = writableDatabase;
        try {
            writableDatabase.replace(str, str2, contentValues);
        } catch (Exception unused) {
        }
    }

    public void a(String str, String[] strArr, String[] strArr2) {
        SQLiteDatabase sQLiteDatabase;
        String strA;
        SQLiteDatabase writableDatabase = getWritableDatabase();
        this.f63980a = writableDatabase;
        writableDatabase.beginTransaction();
        try {
            if (strArr == null) {
                this.f63980a.delete(str, null, null);
            } else {
                if (strArr.length != 1) {
                    sQLiteDatabase = this.f63980a;
                    strA = a(str, a(strArr, strArr2, strArr.length));
                } else if (strArr2.length == 1) {
                    this.f63980a.delete(str, strArr[0] + " = ?", strArr2);
                } else {
                    sQLiteDatabase = this.f63980a;
                    strA = a(str, a(strArr, strArr2, strArr2.length));
                }
                sQLiteDatabase.execSQL(strA);
            }
            this.f63980a.setTransactionSuccessful();
        } catch (Exception unused) {
        } finally {
            this.f63980a.endTransaction();
        }
    }

    public boolean a() {
        return this.f63981b;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        this.f63981b = false;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        this.f63981b = false;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        this.f63981b = false;
    }
}
