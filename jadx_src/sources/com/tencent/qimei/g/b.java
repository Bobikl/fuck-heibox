package com.tencent.qimei.g;

import com.tencent.qimei.i.c;
import com.tencent.qimei.i.e;

/* JADX INFO: compiled from: ResponseApi.java */
/* JADX INFO: loaded from: classes4.dex */
public enum b implements a<String> {
    KEY_CODE("code"),
    KEY_DATA("data");


    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c<String> f101249c = new e(new a[0]);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f101251e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f101252f;

    b(String str) {
        this.f101251e = str;
    }

    public b a(String str) {
        this.f101252f = str;
        return this;
    }

    @Override // com.tencent.qimei.g.a
    public String a() {
        return "0";
    }

    @Override // com.tencent.qimei.g.a
    public String b() {
        return this.f101251e;
    }

    public String b(@Deprecated String str) {
        String str2 = this.f101252f;
        if (str2 != null) {
            return f101249c.a(this, str2);
        }
        throw new RuntimeException("Please set json first: KEY_CODE.json(json).value()");
    }
}
