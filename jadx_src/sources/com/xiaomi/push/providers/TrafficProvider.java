package com.xiaomi.push.providers;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.sqlite.SQLiteOpenHelper;
import android.net.Uri;
import com.taobao.accs.common.Constants;
import com.umeng.analytics.pro.d;
import com.xiaomi.push.ig;

/* JADX INFO: loaded from: classes4.dex */
public class TrafficProvider extends ContentProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final UriMatcher f107823a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public static final Uri f938a = Uri.parse("content://com.xiaomi.push.providers.TrafficProvider/traffic");

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private SQLiteOpenHelper f939a;

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        f107823a = uriMatcher;
        uriMatcher.addURI("com.xiaomi.push.providers.TrafficProvider", d.F, 1);
        uriMatcher.addURI("com.xiaomi.push.providers.TrafficProvider", "update_imsi", 2);
    }

    @Override // android.content.ContentProvider
    public int bulkInsert(Uri uri, ContentValues[] contentValuesArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        if (f107823a.match(uri) == 1) {
            return "vnd.android.cursor.dir/vnd.xiaomi.push.traffic";
        }
        throw new IllegalArgumentException("Unknown URI " + uri);
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        this.f939a = new a(getContext());
        return true;
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        Cursor cursorQuery;
        synchronized (a.f940a) {
            if (f107823a.match(uri) != 1) {
                throw new IllegalArgumentException("Unknown URI " + uri);
            }
            cursorQuery = this.f939a.getReadableDatabase().query(d.F, strArr, str, strArr2, null, null, str2);
        }
        return cursorQuery;
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        if (f107823a.match(uri) != 2 || contentValues == null || !contentValues.containsKey(Constants.KEY_IMSI)) {
            return 0;
        }
        ig.m481a(contentValues.getAsString(Constants.KEY_IMSI));
        return 0;
    }
}
