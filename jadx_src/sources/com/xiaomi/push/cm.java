package com.xiaomi.push;

import android.content.Context;
import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class cm extends cr.b<Long> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f106916a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private String f241a;

    public cm(String str, List<String> list, String str2, String[] strArr, String str3, String str4, String str5, int i10, String str6) {
        super(str, list, str2, strArr, str3, str4, str5, i10);
        this.f106916a = 0L;
        this.f241a = str6;
    }

    public static cm a(String str) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("count(*)");
        return new cm(str, arrayList, null, null, null, null, null, 0, "job to get count of all message");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.xiaomi.push.cr.b
    public Long a(Context context, Cursor cursor) {
        return Long.valueOf(cursor.getLong(0));
    }

    @Override // com.xiaomi.push.cr.a
    /* JADX INFO: renamed from: a */
    public Object mo226a() {
        return Long.valueOf(this.f106916a);
    }

    @Override // com.xiaomi.push.cr.b
    public void a(Context context, List<Long> list) {
        if (context == null || list == null || list.size() <= 0) {
            return;
        }
        this.f106916a = list.get(0).longValue();
    }
}
