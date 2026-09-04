package com.umeng.message.proguard;

import android.content.ContentValues;
import android.database.Cursor;

/* JADX INFO: loaded from: classes4.dex */
public final class ae {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    long f105673a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    String f105674b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f105675c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f105676d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f105677e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f105678f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f105679g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f105680h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f105681i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f105682j;

    public ae(Cursor cursor) {
        this.f105674b = cursor.getString(cursor.getColumnIndex("MsgId"));
        this.f105675c = cursor.getInt(cursor.getColumnIndex("MsgType"));
        this.f105676d = cursor.getInt(cursor.getColumnIndex("NumDisplay"));
        this.f105677e = cursor.getInt(cursor.getColumnIndex("NumOpenFull"));
        this.f105678f = cursor.getInt(cursor.getColumnIndex("NumOpenTop"));
        this.f105679g = cursor.getInt(cursor.getColumnIndex("NumOpenBottom"));
        this.f105680h = cursor.getInt(cursor.getColumnIndex("NumClose"));
        this.f105681i = cursor.getInt(cursor.getColumnIndex("NumDuration"));
        this.f105682j = cursor.getInt(cursor.getColumnIndex("NumCustom"));
    }

    public ae(String str, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        this.f105673a = System.currentTimeMillis();
        this.f105674b = str;
        this.f105675c = i10;
        this.f105676d = i11;
        this.f105677e = i12;
        this.f105678f = i13;
        this.f105679g = i14;
        this.f105680h = i15;
        this.f105681i = i16;
        this.f105682j = i17;
    }

    public final ContentValues a() {
        ContentValues contentValues = new ContentValues();
        contentValues.put("Time", Long.valueOf(this.f105673a));
        contentValues.put("MsgId", this.f105674b);
        contentValues.put("MsgType", Integer.valueOf(this.f105675c));
        contentValues.put("NumDisplay", Integer.valueOf(this.f105676d));
        contentValues.put("NumOpenFull", Integer.valueOf(this.f105677e));
        contentValues.put("NumOpenTop", Integer.valueOf(this.f105678f));
        contentValues.put("NumOpenBottom", Integer.valueOf(this.f105679g));
        contentValues.put("NumClose", Integer.valueOf(this.f105680h));
        contentValues.put("NumDuration", Integer.valueOf(this.f105681i));
        contentValues.put("NumCustom", Integer.valueOf(this.f105682j));
        return contentValues;
    }
}
