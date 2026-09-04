package com.umeng.message.proguard;

import com.umeng.message.entity.UMessage;

/* JADX INFO: loaded from: classes4.dex */
public final class ac {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f105669a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final UMessage f105670b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f105671c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f105672d;

    public ac(int i10, UMessage uMessage) {
        this.f105669a = i10;
        this.f105670b = uMessage;
    }

    public final boolean equals(Object obj) {
        return obj != null && ac.class == obj.getClass() && this.f105669a == ((ac) obj).f105669a;
    }
}
