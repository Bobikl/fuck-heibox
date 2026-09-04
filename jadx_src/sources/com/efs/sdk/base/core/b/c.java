package com.efs.sdk.base.core.b;

import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import com.efs.sdk.base.core.controller.ControllerCenter;
import com.efs.sdk.base.core.util.Log;
import com.efs.sdk.base.core.util.concurrent.WorkThreadUtil;
import java.io.File;

/* JADX INFO: loaded from: classes6.dex */
public final class c extends Handler implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f42433a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final c f42434a = new c(0);
    }

    private c() {
        super(com.efs.sdk.base.core.util.concurrent.a.f42576a.getLooper());
        this.f42433a = true;
        sendEmptyMessageDelayed(2, 60000L);
    }

    /* synthetic */ c(byte b10) {
        this();
    }

    public static c a() {
        return a.f42434a;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (message.what == 2) {
            WorkThreadUtil.submit(this);
            return;
        }
        Log.w("efs.cache", "disk listener not support command: " + message.what);
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.efs.sdk.base.core.b.a unused = com.efs.sdk.base.core.b.a.b.f42431a;
        File fileF = com.efs.sdk.base.core.util.a.f(ControllerCenter.getGlobalEnvStruct().mAppContext, ControllerCenter.getGlobalEnvStruct().getAppid());
        if (fileF.exists()) {
            for (File file : com.efs.sdk.base.core.util.b.d(fileF)) {
                if (com.efs.sdk.base.core.b.a.a(file.getName())) {
                    com.efs.sdk.base.core.b.a.c(file);
                }
            }
        }
        com.efs.sdk.base.core.config.a.c cVarA = com.efs.sdk.base.core.config.a.c.a();
        String str = cVarA.f42493d.f42488f.containsKey("disk_bytes") ? cVarA.f42493d.f42488f.get("disk_bytes") : "4194304";
        long j10 = Long.parseLong(TextUtils.isEmpty(str) ? "4194304" : str);
        long jC = com.efs.sdk.base.core.util.b.c(com.efs.sdk.base.core.util.a.f(ControllerCenter.getGlobalEnvStruct().mAppContext, ControllerCenter.getGlobalEnvStruct().getAppid())) + com.efs.sdk.base.core.util.b.c(com.efs.sdk.base.core.util.a.d(ControllerCenter.getGlobalEnvStruct().mAppContext, ControllerCenter.getGlobalEnvStruct().getAppid()));
        boolean z10 = jC < j10;
        this.f42433a = z10;
        if (!z10) {
            Log.w("efs.cache", "Cache Limited! curr " + jC + "byte, max " + j10 + " byte.");
        }
        sendEmptyMessageDelayed(2, 600000L);
    }
}
