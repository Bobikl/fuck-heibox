package com.apm.lite;

import com.uc.crashsdk.export.LogType;

/* JADX INFO: loaded from: classes6.dex */
public enum CrashType {
    LAUNCH("launch"),
    JAVA(LogType.JAVA_TYPE),
    NATIVE("native"),
    ANR(LogType.ANR_TYPE),
    ENSURE("ensure"),
    DART("dart"),
    OOM("oom"),
    ALL("all");

    private String mName;

    CrashType(String str) {
        this.mName = str;
    }

    public String getName() {
        return this.mName;
    }

    @Override // java.lang.Enum
    public String toString() {
        return getName();
    }
}
