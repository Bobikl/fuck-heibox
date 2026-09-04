package com.igexin.push.core.b;

import android.content.ContentValues;

/* JADX INFO: loaded from: classes.dex */
public class h extends com.igexin.push.b.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ long f63522a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ e f63523b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    h(e eVar, ContentValues contentValues, long j10) {
        super(contentValues);
        this.f63523b = eVar;
        this.f63522a = j10;
    }

    @Override // com.igexin.push.b.d
    public void a() throws Exception {
        this.f63328d.update("ral", this.f63330f, "id=?", new String[]{String.valueOf(this.f63522a)});
    }
}
