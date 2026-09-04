package com.uc.crashsdk.export;

import java.io.File;

/* JADX INFO: compiled from: ProGuard */
/* JADX INFO: loaded from: classes4.dex */
public interface ICrashClient {
    public static final int EVENT_TYPE_ADD_CRASH_STATS = 3;
    public static final int EVENT_TYPE_CLIENT_PROCESS_LOG_GENERATED = 4;
    public static final int EVENT_TYPE_CRASH_RESTARTING = 2;
    public static final int EVENT_TYPE_LOG_GENERATED = 1;

    void onAddCrashStats(String str, int i10, int i11);

    File onBeforeUploadLog(File file);

    void onClientProcessLogGenerated(String str, File file, String str2);

    void onCrashRestarting(boolean z10);

    String onGetCallbackInfo(String str, boolean z10);

    void onLogGenerated(File file, String str);
}
