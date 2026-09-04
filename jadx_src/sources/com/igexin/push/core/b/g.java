package com.igexin.push.core.b;

import android.content.ContentValues;

/* JADX INFO: loaded from: classes.dex */
public class g extends com.igexin.push.b.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ long f63520a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ e f63521b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    g(e eVar, ContentValues contentValues, long j10) {
        super(contentValues);
        this.f63521b = eVar;
        this.f63520a = j10;
    }

    @Override // com.igexin.push.b.d
    public void a() throws Exception {
        this.f63328d.delete("ral", "id=?", new String[]{String.valueOf(this.f63520a)});
    }
}
