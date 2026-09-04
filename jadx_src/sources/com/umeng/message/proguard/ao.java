package com.umeng.message.proguard;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import com.umeng.message.common.UPLog;

/* JADX INFO: loaded from: classes4.dex */
public final class ao {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static ao f105738b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f105739a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f105740a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f105741b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f105742c;

        public a(Cursor cursor) {
            this.f105740a = cursor.getString(cursor.getColumnIndex("MsgId"));
            this.f105741b = cursor.getLong(cursor.getColumnIndex("Time"));
            this.f105742c = cursor.getInt(cursor.getColumnIndex("ActionType"));
        }

        public a(String str, int i10, long j10) {
            this.f105740a = str;
            this.f105742c = i10;
            this.f105741b = j10;
        }

        public final ContentValues a() {
            ContentValues contentValues = new ContentValues();
            contentValues.put("MsgId", this.f105740a);
            contentValues.put("Time", Long.valueOf(this.f105741b));
            contentValues.put("ActionType", Integer.valueOf(this.f105742c));
            return contentValues;
        }
    }

    private ao(Context context) {
        this.f105739a = context.getApplicationContext();
    }

    public static ao a(Context context) {
        if (f105738b == null) {
            f105738b = new ao(context);
        }
        return f105738b;
    }

    public final void a(String str, int i10, long j10) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            this.f105739a.getContentResolver().insert(h.d(this.f105739a), new a(str, i10, j10).a());
        } catch (Exception e10) {
            UPLog.e("MsgLog", e10);
        }
    }
}
