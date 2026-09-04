package com.xiaomi.push;

/* JADX INFO: loaded from: classes4.dex */
public enum it {
    MISC_CONFIG(1),
    PLUGIN_CONFIG(2);


    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private final int f609a;

    it(int i10) {
        this.f609a = i10;
    }

    public static it a(int i10) {
        if (i10 == 1) {
            return MISC_CONFIG;
        }
        if (i10 != 2) {
            return null;
        }
        return PLUGIN_CONFIG;
    }

    public int a() {
        return this.f609a;
    }
}
