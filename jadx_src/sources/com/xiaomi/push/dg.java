package com.xiaomi.push;

import android.content.Context;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class dg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f106955a;

    public dg(int i10) {
        this.f106955a = i10;
    }

    public int a() {
        return this.f106955a;
    }

    public abstract String a(Context context, String str, List<bf> list);

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public boolean m251a(Context context, String str, List<bf> list) {
        return true;
    }
}
