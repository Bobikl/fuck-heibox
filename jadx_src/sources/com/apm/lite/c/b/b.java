package com.apm.lite.c.b;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.apm.lite.k.q;
import com.max.xiaoheihe.okflutter.containers.FlutterActivityLaunchConfigs;
import com.umeng.analytics.pro.ao;
import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
public class b extends a<p6.a> {
    public b() {
        super("duplicatelog");
    }

    @Override // com.apm.lite.c.b.a
    protected HashMap<String, String> b() {
        HashMap<String, String> map = new HashMap<>();
        map.put(FlutterActivityLaunchConfigs.EXTRA_PATH, "TEXT");
        map.put("insert_time", "INTEGER");
        map.put("ext1", "TEXT");
        map.put("ext2", "TEXT");
        return map;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.apm.lite.c.b.a
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public ContentValues a(p6.a aVar) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(FlutterActivityLaunchConfigs.EXTRA_PATH, aVar.f138167a);
        contentValues.put("insert_time", Long.valueOf(aVar.f138168b));
        return contentValues;
    }

    @Override // com.apm.lite.c.b.a
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void d(SQLiteDatabase sQLiteDatabase, p6.a aVar) {
        if (aVar == null || g(sQLiteDatabase, aVar.f138167a)) {
            return;
        }
        super.d(sQLiteDatabase, aVar);
        try {
            sQLiteDatabase.execSQL("delete from " + this.f39877b + " where " + ao.f104522d + " in (select " + ao.f104522d + " from " + this.f39877b + " order by insert_time desc limit 1000 offset 500)");
        } catch (Exception e10) {
            q.g(e10);
        }
    }

    public boolean g(SQLiteDatabase sQLiteDatabase, String str) {
        int count;
        if (sQLiteDatabase == null || TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            Cursor cursorQuery = sQLiteDatabase.query(this.f39877b, null, "path=?", new String[]{str}, null, null, null);
            count = cursorQuery.getCount();
            try {
                cursorQuery.close();
            } catch (Throwable th2) {
                th = th2;
                q.g(th);
            }
        } catch (Throwable th3) {
            th = th3;
            count = 0;
        }
        return count > 0;
    }
}
