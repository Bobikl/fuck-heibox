package com.google.android.exoplayer2.offline;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.j1;
import androidx.annotation.p0;
import com.google.android.exoplayer2.database.DatabaseIOException;
import com.google.android.exoplayer2.util.u0;
import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: DefaultDownloadIndex.java */
/* JADX INFO: loaded from: classes7.dex */
public final class c implements e0 {
    private static final int A = 4;
    private static final int B = 5;
    private static final int C = 6;
    private static final int D = 7;
    private static final int E = 8;
    private static final int F = 9;
    private static final int G = 10;
    private static final int H = 11;
    private static final int I = 12;
    private static final int J = 13;
    private static final int K = 14;
    private static final String L = "id = ?";
    private static final String M = "state = 2";
    private static final String P = "(id TEXT PRIMARY KEY NOT NULL,mime_type TEXT,uri TEXT NOT NULL,stream_keys TEXT NOT NULL,custom_cache_key TEXT,data BLOB NOT NULL,state INTEGER NOT NULL,start_time_ms INTEGER NOT NULL,update_time_ms INTEGER NOT NULL,content_length INTEGER NOT NULL,stop_reason INTEGER NOT NULL,failure_reason INTEGER NOT NULL,percent_downloaded REAL NOT NULL,bytes_downloaded INTEGER NOT NULL,key_set_id BLOB NOT NULL)";
    private static final String Q = "1";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f47159f = "ExoPlayerDownloads";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @j1
    static final int f47160g = 3;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f47161h = "id";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String f47166m = "data";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String f47167n = "state";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final String f47171r = "stop_reason";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final int f47176w = 0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final int f47177x = 1;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final int f47178y = 2;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final int f47179z = 3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f47180a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f47181b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final o8.b f47182c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Object f47183d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.b0("initializationLock")
    private boolean f47184e;
    private static final String N = p(3, 4);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f47162i = "mime_type";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f47163j = "uri";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f47164k = "stream_keys";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f47165l = "custom_cache_key";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final String f47168o = "start_time_ms";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final String f47169p = "update_time_ms";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final String f47170q = "content_length";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final String f47172s = "failure_reason";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final String f47173t = "percent_downloaded";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final String f47174u = "bytes_downloaded";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final String f47175v = "key_set_id";
    private static final String[] O = {"id", f47162i, f47163j, f47164k, f47165l, "data", "state", f47168o, f47169p, f47170q, "stop_reason", f47172s, f47173t, f47174u, f47175v};

    /* JADX INFO: compiled from: DefaultDownloadIndex.java */
    public static final class b implements g {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Cursor f47185b;

        private b(Cursor cursor) {
            this.f47185b = cursor;
        }

        @Override // com.google.android.exoplayer2.offline.g
        public e H() {
            return c.n(this.f47185b);
        }

        @Override // com.google.android.exoplayer2.offline.g, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f47185b.close();
        }

        @Override // com.google.android.exoplayer2.offline.g
        public int getCount() {
            return this.f47185b.getCount();
        }

        @Override // com.google.android.exoplayer2.offline.g
        public int getPosition() {
            return this.f47185b.getPosition();
        }

        @Override // com.google.android.exoplayer2.offline.g
        public /* synthetic */ boolean isAfterLast() {
            return f.a(this);
        }

        @Override // com.google.android.exoplayer2.offline.g
        public /* synthetic */ boolean isBeforeFirst() {
            return f.b(this);
        }

        @Override // com.google.android.exoplayer2.offline.g
        public boolean isClosed() {
            return this.f47185b.isClosed();
        }

        @Override // com.google.android.exoplayer2.offline.g
        public /* synthetic */ boolean isFirst() {
            return f.c(this);
        }

        @Override // com.google.android.exoplayer2.offline.g
        public /* synthetic */ boolean isLast() {
            return f.d(this);
        }

        @Override // com.google.android.exoplayer2.offline.g
        public /* synthetic */ boolean moveToFirst() {
            return f.e(this);
        }

        @Override // com.google.android.exoplayer2.offline.g
        public /* synthetic */ boolean moveToLast() {
            return f.f(this);
        }

        @Override // com.google.android.exoplayer2.offline.g
        public /* synthetic */ boolean moveToNext() {
            return f.g(this);
        }

        @Override // com.google.android.exoplayer2.offline.g
        public boolean moveToPosition(int i10) {
            return this.f47185b.moveToPosition(i10);
        }

        @Override // com.google.android.exoplayer2.offline.g
        public /* synthetic */ boolean moveToPrevious() {
            return f.h(this);
        }
    }

    public c(o8.b bVar) {
        this(bVar, "");
    }

    public c(o8.b bVar, String str) {
        this.f47180a = str;
        this.f47182c = bVar;
        String strValueOf = String.valueOf(str);
        this.f47181b = strValueOf.length() != 0 ? f47159f.concat(strValueOf) : new String(f47159f);
        this.f47183d = new Object();
    }

    private static List<StreamKey> j(@p0 String str) {
        ArrayList arrayList = new ArrayList();
        if (TextUtils.isEmpty(str)) {
            return arrayList;
        }
        for (String str2 : u0.p1(str, Constants.ACCEPT_TIME_SEPARATOR_SP)) {
            String[] strArrP1 = u0.p1(str2, "\\.");
            com.google.android.exoplayer2.util.a.i(strArrP1.length == 3);
            arrayList.add(new StreamKey(Integer.parseInt(strArrP1[0]), Integer.parseInt(strArrP1[1]), Integer.parseInt(strArrP1[2])));
        }
        return arrayList;
    }

    @j1
    static String k(List<StreamKey> list) {
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < list.size(); i10++) {
            StreamKey streamKey = list.get(i10);
            sb2.append(streamKey.f47146b);
            sb2.append(lg.a.f131414g);
            sb2.append(streamKey.f47147c);
            sb2.append(lg.a.f131414g);
            sb2.append(streamKey.f47148d);
            sb2.append(',');
        }
        if (sb2.length() > 0) {
            sb2.setLength(sb2.length() - 1);
        }
        return sb2.toString();
    }

    private void l() throws DatabaseIOException {
        synchronized (this.f47183d) {
            if (this.f47184e) {
                return;
            }
            try {
                int iB = o8.g.b(this.f47182c.getReadableDatabase(), 0, this.f47180a);
                if (iB != 3) {
                    SQLiteDatabase writableDatabase = this.f47182c.getWritableDatabase();
                    writableDatabase.beginTransactionNonExclusive();
                    try {
                        o8.g.d(writableDatabase, 0, this.f47180a, 3);
                        List<e> listR = iB == 2 ? r(writableDatabase) : new ArrayList<>();
                        String strValueOf = String.valueOf(this.f47181b);
                        writableDatabase.execSQL(strValueOf.length() != 0 ? "DROP TABLE IF EXISTS ".concat(strValueOf) : new String("DROP TABLE IF EXISTS "));
                        String str = this.f47181b;
                        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + bb.c.b.Z4);
                        sb2.append("CREATE TABLE ");
                        sb2.append(str);
                        sb2.append(" ");
                        sb2.append(P);
                        writableDatabase.execSQL(sb2.toString());
                        Iterator<e> it = listR.iterator();
                        while (it.hasNext()) {
                            s(it.next(), writableDatabase);
                        }
                        writableDatabase.setTransactionSuccessful();
                        writableDatabase.endTransaction();
                    } catch (Throwable th2) {
                        writableDatabase.endTransaction();
                        throw th2;
                    }
                }
                this.f47184e = true;
            } catch (SQLException e10) {
                throw new DatabaseIOException(e10);
            }
        }
    }

    private Cursor m(String str, @p0 String[] strArr) throws DatabaseIOException {
        try {
            return this.f47182c.getReadableDatabase().query(this.f47181b, O, str, strArr, null, null, "start_time_ms ASC");
        } catch (SQLiteException e10) {
            throw new DatabaseIOException(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static e n(Cursor cursor) {
        byte[] blob = cursor.getBlob(14);
        DownloadRequest.b bVarF = new DownloadRequest.b((String) com.google.android.exoplayer2.util.a.g(cursor.getString(0)), Uri.parse((String) com.google.android.exoplayer2.util.a.g(cursor.getString(2)))).e(cursor.getString(1)).f(j(cursor.getString(3)));
        if (blob.length <= 0) {
            blob = null;
        }
        DownloadRequest downloadRequestA = bVarF.d(blob).b(cursor.getString(4)).c(cursor.getBlob(5)).a();
        u uVar = new u();
        uVar.f47303a = cursor.getLong(13);
        uVar.f47304b = cursor.getFloat(12);
        int i10 = cursor.getInt(6);
        return new e(downloadRequestA, i10, cursor.getLong(7), cursor.getLong(8), cursor.getLong(9), cursor.getInt(10), i10 == 4 ? cursor.getInt(11) : 0, uVar);
    }

    private static e o(Cursor cursor) {
        DownloadRequest downloadRequestA = new DownloadRequest.b((String) com.google.android.exoplayer2.util.a.g(cursor.getString(0)), Uri.parse((String) com.google.android.exoplayer2.util.a.g(cursor.getString(2)))).e(q(cursor.getString(1))).f(j(cursor.getString(3))).b(cursor.getString(4)).c(cursor.getBlob(5)).a();
        u uVar = new u();
        uVar.f47303a = cursor.getLong(13);
        uVar.f47304b = cursor.getFloat(12);
        int i10 = cursor.getInt(6);
        return new e(downloadRequestA, i10, cursor.getLong(7), cursor.getLong(8), cursor.getLong(9), cursor.getInt(10), i10 == 4 ? cursor.getInt(11) : 0, uVar);
    }

    private static String p(int... iArr) {
        if (iArr.length == 0) {
            return "1";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("state");
        sb2.append(" IN (");
        for (int i10 = 0; i10 < iArr.length; i10++) {
            if (i10 > 0) {
                sb2.append(',');
            }
            sb2.append(iArr[i10]);
        }
        sb2.append(')');
        return sb2.toString();
    }

    private static String q(@p0 String str) {
        if ("dash".equals(str)) {
            return com.google.android.exoplayer2.util.y.f51585m0;
        }
        if ("hls".equals(str)) {
            return com.google.android.exoplayer2.util.y.f51587n0;
        }
        return org.apache.tools.ant.taskdefs.optional.vss.g.f135467q2.equals(str) ? com.google.android.exoplayer2.util.y.f51589o0 : com.google.android.exoplayer2.util.y.f51608y;
    }

    private List<e> r(SQLiteDatabase sQLiteDatabase) {
        ArrayList arrayList = new ArrayList();
        if (!u0.u1(sQLiteDatabase, this.f47181b)) {
            return arrayList;
        }
        Cursor cursorQuery = sQLiteDatabase.query(this.f47181b, new String[]{"id", "title", f47163j, f47164k, f47165l, "data", "state", f47168o, f47169p, f47170q, "stop_reason", f47172s, f47173t, f47174u}, null, null, null, null, null);
        while (cursorQuery.moveToNext()) {
            try {
                arrayList.add(o(cursorQuery));
            } catch (Throwable th2) {
                if (cursorQuery == null) {
                    throw th2;
                }
                try {
                    cursorQuery.close();
                    throw th2;
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                    throw th2;
                }
            }
        }
        cursorQuery.close();
        return arrayList;
    }

    private void s(e eVar, SQLiteDatabase sQLiteDatabase) {
        byte[] bArr = eVar.f47235a.f47098f;
        if (bArr == null) {
            bArr = u0.f51541f;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", eVar.f47235a.f47094b);
        contentValues.put(f47162i, eVar.f47235a.f47096d);
        contentValues.put(f47163j, eVar.f47235a.f47095c.toString());
        contentValues.put(f47164k, k(eVar.f47235a.f47097e));
        contentValues.put(f47165l, eVar.f47235a.f47099g);
        contentValues.put("data", eVar.f47235a.f47100h);
        contentValues.put("state", Integer.valueOf(eVar.f47236b));
        contentValues.put(f47168o, Long.valueOf(eVar.f47237c));
        contentValues.put(f47169p, Long.valueOf(eVar.f47238d));
        contentValues.put(f47170q, Long.valueOf(eVar.f47239e));
        contentValues.put("stop_reason", Integer.valueOf(eVar.f47240f));
        contentValues.put(f47172s, Integer.valueOf(eVar.f47241g));
        contentValues.put(f47173t, Float.valueOf(eVar.b()));
        contentValues.put(f47174u, Long.valueOf(eVar.a()));
        contentValues.put(f47175v, bArr);
        sQLiteDatabase.replaceOrThrow(this.f47181b, null, contentValues);
    }

    @Override // com.google.android.exoplayer2.offline.e0
    public void a(String str, int i10) throws DatabaseIOException {
        l();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("stop_reason", Integer.valueOf(i10));
            SQLiteDatabase writableDatabase = this.f47182c.getWritableDatabase();
            String str2 = this.f47181b;
            String str3 = N;
            StringBuilder sb2 = new StringBuilder(String.valueOf(str3).length() + 11);
            sb2.append(str3);
            sb2.append(" AND ");
            sb2.append(L);
            writableDatabase.update(str2, contentValues, sb2.toString(), new String[]{str});
        } catch (SQLException e10) {
            throw new DatabaseIOException(e10);
        }
    }

    @Override // com.google.android.exoplayer2.offline.e0
    public void b(String str) throws DatabaseIOException {
        l();
        try {
            this.f47182c.getWritableDatabase().delete(this.f47181b, L, new String[]{str});
        } catch (SQLiteException e10) {
            throw new DatabaseIOException(e10);
        }
    }

    @Override // com.google.android.exoplayer2.offline.o
    public g c(int... iArr) throws DatabaseIOException {
        l();
        return new b(m(p(iArr), null));
    }

    @Override // com.google.android.exoplayer2.offline.o
    @p0
    public e d(String str) throws DatabaseIOException {
        l();
        try {
            Cursor cursorM = m(L, new String[]{str});
            try {
                if (cursorM.getCount() == 0) {
                    cursorM.close();
                    return null;
                }
                cursorM.moveToNext();
                e eVarN = n(cursorM);
                cursorM.close();
                return eVarN;
            } catch (Throwable th2) {
                if (cursorM != null) {
                    try {
                        cursorM.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        } catch (SQLiteException e10) {
            throw new DatabaseIOException(e10);
        }
        throw new DatabaseIOException(e10);
    }

    @Override // com.google.android.exoplayer2.offline.e0
    public void e(e eVar) throws DatabaseIOException {
        l();
        try {
            s(eVar, this.f47182c.getWritableDatabase());
        } catch (SQLiteException e10) {
            throw new DatabaseIOException(e10);
        }
    }

    @Override // com.google.android.exoplayer2.offline.e0
    public void f(int i10) throws DatabaseIOException {
        l();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("stop_reason", Integer.valueOf(i10));
            this.f47182c.getWritableDatabase().update(this.f47181b, contentValues, N, null);
        } catch (SQLException e10) {
            throw new DatabaseIOException(e10);
        }
    }

    @Override // com.google.android.exoplayer2.offline.e0
    public void g() throws DatabaseIOException {
        l();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("state", (Integer) 5);
            contentValues.put(f47172s, (Integer) 0);
            this.f47182c.getWritableDatabase().update(this.f47181b, contentValues, null, null);
        } catch (SQLException e10) {
            throw new DatabaseIOException(e10);
        }
    }

    @Override // com.google.android.exoplayer2.offline.e0
    public void h() throws DatabaseIOException {
        l();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("state", (Integer) 0);
            this.f47182c.getWritableDatabase().update(this.f47181b, contentValues, M, null);
        } catch (SQLException e10) {
            throw new DatabaseIOException(e10);
        }
    }
}
