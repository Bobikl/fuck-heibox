package com.umeng.message.component;

import android.content.ContentProvider;
import android.content.ContentProviderOperation;
import android.content.ContentProviderResult;
import android.content.ContentValues;
import android.content.Context;
import android.content.OperationApplicationException;
import android.content.SharedPreferences;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.net.Uri;
import android.text.TextUtils;
import com.umeng.message.common.UPLog;
import com.umeng.message.proguard.ap;
import com.umeng.message.proguard.h;
import com.umeng.message.proguard.x;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class UmengMessageProvider extends ContentProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final UriMatcher f105577a = new UriMatcher(-1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile a f105578b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile b f105579c;

    public static class a extends SQLiteOpenHelper {
        public a(Context context) {
            super(context, "MessageStore.db", (SQLiteDatabase.CursorFactory) null, 5);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            try {
                sQLiteDatabase.execSQL(String.format("create table if not exists %s (time long, type varchar default NULL, alias varchar default NULL, exclusive int, ttl long, PRIMARY KEY(time))", "MsgAlias"));
            } catch (Throwable th2) {
                UPLog.e("MessageProvider", th2);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
            try {
                if (UmengMessageProvider.b(sQLiteDatabase, "MsgAlias")) {
                    sQLiteDatabase.execSQL("drop table MsgAlias");
                }
                onCreate(sQLiteDatabase);
            } catch (Throwable th2) {
                UPLog.e("MessageProvider", th2);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
            if (i10 <= 3) {
                try {
                    if (UmengMessageProvider.b(sQLiteDatabase, "MsgTemp")) {
                        sQLiteDatabase.execSQL("drop table MsgTemp");
                    }
                    if (UmengMessageProvider.b(sQLiteDatabase, "MessageStore")) {
                        sQLiteDatabase.execSQL("drop table MessageStore");
                    }
                } catch (Throwable th2) {
                    UPLog.e("MessageProvider", th2);
                    return;
                }
            }
            if (i10 <= 4 && UmengMessageProvider.b(sQLiteDatabase, "MsgAlias")) {
                sQLiteDatabase.execSQL("drop table MsgAlias");
            }
            onCreate(sQLiteDatabase);
        }
    }

    public static class b extends SQLiteOpenHelper {
        public b(Context context) {
            super(context, "MsgLogStore.db", (SQLiteDatabase.CursorFactory) null, 8);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            try {
                sQLiteDatabase.execSQL(String.format("create table if not exists MsgLogStore (MsgId varchar, ActionType Integer, Time long, %s varchar, PRIMARY KEY(MsgId, ActionType))", j5.b.f124286k));
                sQLiteDatabase.execSQL("create table if not exists InAppLogStore (Time long, MsgId varchar, MsgType Integer, NumDisplay Integer, NumOpenFull Integer, NumOpenTop Integer, NumOpenBottom Integer, NumClose Integer, NumDuration Integer, NumCustom Integer, PRIMARY KEY(Time))");
            } catch (Throwable th2) {
                UPLog.e("MessageProvider", th2);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
            try {
                if (UmengMessageProvider.b(sQLiteDatabase, "MsgLogStore")) {
                    sQLiteDatabase.execSQL("drop table MsgLogStore");
                }
                if (UmengMessageProvider.b(sQLiteDatabase, "InAppLogStore")) {
                    sQLiteDatabase.execSQL("drop table InAppLogStore");
                }
                onCreate(sQLiteDatabase);
            } catch (Throwable th2) {
                UPLog.e("MessageProvider", th2);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
            if (i10 <= 5) {
                try {
                    if (UmengMessageProvider.b(sQLiteDatabase, "MsgLogStore")) {
                        sQLiteDatabase.execSQL(String.format("ALTER TABLE MsgLogStore ADD COLUMN %s varchar", j5.b.f124286k));
                    }
                } catch (Throwable th2) {
                    UPLog.e("MessageProvider", th2);
                    return;
                }
            }
            if (i10 <= 6 && UmengMessageProvider.b(sQLiteDatabase, "InAppLogStore")) {
                sQLiteDatabase.execSQL(String.format("ALTER TABLE InAppLogStore ADD COLUMN %s Integer", "NumCustom"));
            }
            if (i10 <= 7) {
                if (UmengMessageProvider.b(sQLiteDatabase, "MsgLogStoreForAgoo")) {
                    sQLiteDatabase.execSQL("drop table MsgLogStoreForAgoo");
                }
                if (UmengMessageProvider.b(sQLiteDatabase, "MsgLogIdTypeStore")) {
                    sQLiteDatabase.execSQL("drop table MsgLogIdTypeStore");
                }
                if (UmengMessageProvider.b(sQLiteDatabase, "MsgLogIdTypeStoreForAgoo")) {
                    sQLiteDatabase.execSQL("drop table MsgLogIdTypeStoreForAgoo");
                }
                if (UmengMessageProvider.b(sQLiteDatabase, "MsgConfigInfo")) {
                    sQLiteDatabase.execSQL("drop table MsgConfigInfo");
                }
            }
            onCreate(sQLiteDatabase);
        }
    }

    private a a() {
        if (this.f105578b == null) {
            synchronized (a.class) {
                if (this.f105578b == null) {
                    this.f105578b = new a(getContext());
                }
            }
        }
        return this.f105578b;
    }

    private b b() {
        if (this.f105579c == null) {
            synchronized (b.class) {
                if (this.f105579c == null) {
                    this.f105579c = new b(getContext());
                }
            }
        }
        return this.f105579c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean b(SQLiteDatabase sQLiteDatabase, String str) {
        boolean z10 = false;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            Cursor cursorRawQuery = sQLiteDatabase.rawQuery(String.format("select count(*) as c from sqlite_master where type = 'table' and name = '%s'", str.trim()), null);
            if (cursorRawQuery != null) {
                if (cursorRawQuery.moveToNext() && cursorRawQuery.getInt(0) > 0) {
                    z10 = true;
                }
                cursorRawQuery.close();
            }
        } catch (Throwable th2) {
            UPLog.e("MessageProvider", th2);
        }
        return z10;
    }

    @Override // android.content.ContentProvider
    public ContentProviderResult[] applyBatch(ArrayList<ContentProviderOperation> arrayList) throws OperationApplicationException {
        SQLiteDatabase writableDatabase = b().getWritableDatabase();
        try {
            if (writableDatabase == null) {
                return super.applyBatch(arrayList);
            }
            try {
                writableDatabase.beginTransaction();
                ContentProviderResult[] contentProviderResultArrApplyBatch = super.applyBatch(arrayList);
                writableDatabase.setTransactionSuccessful();
                return contentProviderResultArrApplyBatch;
            } finally {
                writableDatabase.endTransaction();
            }
        } catch (Throwable unused) {
            return super.applyBatch(arrayList);
        }
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        SQLiteDatabase writableDatabase;
        try {
            int iMatch = this.f105577a.match(uri);
            if (iMatch != 2) {
                if (iMatch == 3) {
                    SQLiteDatabase writableDatabase2 = a().getWritableDatabase();
                    if (writableDatabase2 != null) {
                        return writableDatabase2.delete("MsgAlias", str, strArr);
                    }
                } else if (iMatch == 4) {
                    SQLiteDatabase writableDatabase3 = a().getWritableDatabase();
                    if (writableDatabase3 != null) {
                        return writableDatabase3.delete("MsgAlias", null, null);
                    }
                } else if (iMatch == 5) {
                    SQLiteDatabase writableDatabase4 = b().getWritableDatabase();
                    if (writableDatabase4 != null) {
                        return writableDatabase4.delete("MsgLogStore", str, strArr);
                    }
                } else if (iMatch == 10 && (writableDatabase = b().getWritableDatabase()) != null) {
                    return writableDatabase.delete("InAppLogStore", str, strArr);
                }
            } else if (strArr != null && strArr.length != 0) {
                ap apVarA = ap.a();
                if (strArr.length == 0) {
                    return 0;
                }
                SharedPreferences.Editor editorEdit = apVarA.f105744a.edit();
                int i10 = 0;
                for (String str2 : strArr) {
                    if (apVarA.f105744a.contains(str2)) {
                        editorEdit.remove(str2);
                        i10++;
                    }
                }
                if (i10 > 0) {
                    editorEdit.apply();
                }
                return i10;
            }
        } catch (Throwable th2) {
            UPLog.e("MessageProvider", th2);
        }
        return 0;
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        int iMatch = this.f105577a.match(uri);
        if (iMatch == 2 || iMatch == 3 || iMatch == 5) {
            return "vnd.android.cursor.dir/vnd.umeng.message";
        }
        return null;
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        try {
            int iMatch = this.f105577a.match(uri);
            if (iMatch != 2) {
                if (iMatch == 3) {
                    SQLiteDatabase writableDatabase = a().getWritableDatabase();
                    if (writableDatabase == null) {
                        return null;
                    }
                    writableDatabase.insertWithOnConflict("MsgAlias", null, contentValues, 5);
                } else if (iMatch == 5) {
                    SQLiteDatabase writableDatabase2 = b().getWritableDatabase();
                    if (writableDatabase2 == null) {
                        return null;
                    }
                    writableDatabase2.insertWithOnConflict("MsgLogStore", null, contentValues, 5);
                } else if (iMatch == 10) {
                    SQLiteDatabase writableDatabase3 = b().getWritableDatabase();
                    if (writableDatabase3 == null) {
                        return null;
                    }
                    writableDatabase3.insertWithOnConflict("InAppLogStore", null, contentValues, 5);
                }
            } else {
                if (contentValues == null) {
                    return null;
                }
                String asString = contentValues.getAsString("k");
                String asString2 = contentValues.getAsString("v");
                if (!TextUtils.isEmpty(asString)) {
                    ap.a().a(asString, asString2);
                }
            }
        } catch (Throwable th2) {
            UPLog.e("MessageProvider", th2);
        }
        return null;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        try {
            Context context = getContext();
            x.a(context);
            Uri uriA = h.a(context);
            this.f105577a.addURI(uriA.getAuthority(), uriA.getPath(), 3);
            Uri uriB = h.b(context);
            this.f105577a.addURI(uriB.getAuthority(), uriB.getPath(), 4);
            Uri uriD = h.d(context);
            this.f105577a.addURI(uriD.getAuthority(), uriD.getPath(), 5);
            Uri uriE = h.e(context);
            this.f105577a.addURI(uriE.getAuthority(), uriE.getPath(), 10);
            Uri uriC = h.c(context);
            this.f105577a.addURI(uriC.getAuthority(), uriC.getPath(), 2);
            return true;
        } catch (Throwable th2) {
            UPLog.e("MessageProvider", th2);
            return true;
        }
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        SQLiteDatabase readableDatabase;
        try {
            int iMatch = this.f105577a.match(uri);
            if (iMatch != 2) {
                if (iMatch == 3) {
                    SQLiteDatabase readableDatabase2 = a().getReadableDatabase();
                    if (readableDatabase2 == null) {
                        return null;
                    }
                    return readableDatabase2.query("MsgAlias", strArr, str, strArr2, null, null, str2);
                }
                if (iMatch != 5) {
                    if (iMatch == 10 && (readableDatabase = b().getReadableDatabase()) != null) {
                        return readableDatabase.query("InAppLogStore", strArr, str, strArr2, null, null, str2);
                    }
                    return null;
                }
                SQLiteDatabase readableDatabase3 = b().getReadableDatabase();
                if (readableDatabase3 == null) {
                    return null;
                }
                return readableDatabase3.query("MsgLogStore", strArr, str, strArr2, null, null, str2);
            }
            MatrixCursor matrixCursor = new MatrixCursor(new String[]{"k", "v"});
            Map<String, ?> all = ap.a().f105744a.getAll();
            if (strArr2 != null && strArr2.length != 0) {
                for (String str3 : strArr2) {
                    Object obj = all.get(str3);
                    if (obj instanceof String) {
                        matrixCursor.addRow(new Object[]{str3, obj});
                    }
                }
                return matrixCursor;
            }
            for (String str4 : all.keySet()) {
                Object obj2 = all.get(str4);
                if (obj2 instanceof String) {
                    matrixCursor.addRow(new Object[]{str4, obj2});
                }
            }
            return matrixCursor;
        } catch (Throwable th2) {
            UPLog.e("MessageProvider", th2);
        }
        return null;
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        SQLiteDatabase writableDatabase;
        try {
            int iMatch = this.f105577a.match(uri);
            if (iMatch != 2) {
                if (iMatch == 3) {
                    SQLiteDatabase writableDatabase2 = a().getWritableDatabase();
                    if (writableDatabase2 != null) {
                        return writableDatabase2.updateWithOnConflict("MsgAlias", contentValues, str, strArr, 5);
                    }
                } else if (iMatch == 10 && (writableDatabase = b().getWritableDatabase()) != null) {
                    return writableDatabase.updateWithOnConflict("InAppLogStore", contentValues, str, strArr, 5);
                }
            } else if (contentValues != null && strArr != null && strArr.length != 0) {
                String str2 = strArr[0];
                String asString = contentValues.getAsString("v");
                if (!TextUtils.isEmpty(str2)) {
                    ap.a().a(str2, asString);
                    return 1;
                }
            }
        } catch (Throwable th2) {
            UPLog.e("MessageProvider", th2);
        }
        return 0;
    }
}
