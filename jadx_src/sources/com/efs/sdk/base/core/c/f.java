package com.efs.sdk.base.core.c;

import android.content.Context;
import com.efs.sdk.base.core.controller.ControllerCenter;
import com.efs.sdk.base.core.util.Log;
import com.efs.sdk.base.core.util.ProcessUtil;
import java.io.File;
import java.io.FileOutputStream;
import java.nio.channels.FileLock;

/* JADX INFO: loaded from: classes6.dex */
public final class f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static FileLock f42458b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    volatile int f42459a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final f f42462a = new f(0);
    }

    private f() {
        this.f42459a = 0;
        a(ControllerCenter.getGlobalEnvStruct().mAppContext);
    }

    /* synthetic */ f(byte b10) {
        this();
    }

    private synchronized void a(final Context context) {
        Log.w("efs.send_log", "tryFileLock start! ");
        this.f42459a = 1;
        new Thread(new Runnable() { // from class: com.efs.sdk.base.core.c.f.1
            @Override // java.lang.Runnable
            public final void run() {
                FileLock fileLockLock;
                try {
                    File fileA = com.efs.sdk.base.core.util.a.a(context);
                    if (!fileA.exists()) {
                        fileA.mkdirs();
                    }
                    File file = new File(fileA.getPath() + File.separator + "sendlock");
                    if (!file.exists()) {
                        file.createNewFile();
                    }
                    do {
                        fileLockLock = new FileOutputStream(file).getChannel().lock();
                        f.f42458b = fileLockLock;
                    } while (!fileLockLock.isValid());
                    Log.w("efs.send_log", "tryFileLock sendlock sucess! processname: " + ProcessUtil.getCurrentProcessName());
                    f.this.f42459a = 2;
                } catch (Exception e10) {
                    Log.w("efs.send_log", "tryFileLock fail! " + e10.getMessage());
                    f.this.f42459a = 0;
                }
            }
        }).start();
    }

    public final boolean a() {
        if (this.f42459a == 2) {
            return true;
        }
        if (this.f42459a != 0) {
            return false;
        }
        a(ControllerCenter.getGlobalEnvStruct().mAppContext);
        return false;
    }
}
