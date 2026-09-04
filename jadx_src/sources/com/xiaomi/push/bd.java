package com.xiaomi.push;

/* JADX INFO: loaded from: classes4.dex */
public class bd implements bf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f106864a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f106865b;

    public bd(String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("Name may not be null");
        }
        this.f106864a = str;
        this.f106865b = str2;
    }

    @Override // com.xiaomi.push.bf
    public String a() {
        return this.f106864a;
    }

    @Override // com.xiaomi.push.bf
    public String b() {
        return this.f106865b;
    }
}
