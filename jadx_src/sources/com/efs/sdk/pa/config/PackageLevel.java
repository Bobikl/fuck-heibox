package com.efs.sdk.pa.config;

/* JADX INFO: loaded from: classes6.dex */
public enum PackageLevel {
    DAILY_DEVELOP(1),
    INTERNAL_TEST(2),
    TRIAL(3),
    RELEASE(4);

    private int mLevel;

    PackageLevel(int i10) {
        this.mLevel = i10;
    }

    public final int getLevel() {
        return this.mLevel;
    }
}
