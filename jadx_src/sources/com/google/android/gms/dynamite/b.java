package com.google.android.gms.dynamite;

import android.os.Looper;
import android.util.Log;
import androidx.annotation.b0;
import androidx.annotation.p0;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* JADX INFO: loaded from: classes7.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @b0("DynamiteLoaderV2ClassLoader.class")
    @p0
    private static volatile ClassLoader f52700a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @b0("DynamiteLoaderV2ClassLoader.class")
    @p0
    private static volatile Thread f52701b;

    @p0
    public static synchronized ClassLoader a() {
        if (f52700a == null) {
            f52700a = b();
        }
        return f52700a;
    }

    @p0
    private static synchronized ClassLoader b() {
        ClassLoader contextClassLoader = null;
        if (f52701b == null) {
            f52701b = c();
            if (f52701b == null) {
                return null;
            }
        }
        synchronized (f52701b) {
            try {
                contextClassLoader = f52701b.getContextClassLoader();
            } catch (SecurityException e10) {
                Log.w("DynamiteLoaderV2CL", "Failed to get thread context classloader " + e10.getMessage());
            }
        }
        return contextClassLoader;
    }

    @p0
    private static synchronized Thread c() {
        SecurityException e10;
        Thread aVar;
        Thread thread;
        ThreadGroup threadGroup;
        ThreadGroup threadGroup2 = Looper.getMainLooper().getThread().getThreadGroup();
        if (threadGroup2 == null) {
            return null;
        }
        synchronized (Void.class) {
            try {
                int iActiveGroupCount = threadGroup2.activeGroupCount();
                ThreadGroup[] threadGroupArr = new ThreadGroup[iActiveGroupCount];
                threadGroup2.enumerate(threadGroupArr);
                int i10 = 0;
                int i11 = 0;
                while (true) {
                    if (i11 >= iActiveGroupCount) {
                        threadGroup = null;
                        break;
                    }
                    threadGroup = threadGroupArr[i11];
                    if ("dynamiteLoader".equals(threadGroup.getName())) {
                        break;
                    }
                    i11++;
                }
                if (threadGroup == null) {
                    threadGroup = new ThreadGroup(threadGroup2, "dynamiteLoader");
                }
                int iActiveCount = threadGroup.activeCount();
                Thread[] threadArr = new Thread[iActiveCount];
                threadGroup.enumerate(threadArr);
                while (true) {
                    if (i10 >= iActiveCount) {
                        thread = null;
                        break;
                    }
                    thread = threadArr[i10];
                    if ("GmsDynamite".equals(thread.getName())) {
                        break;
                    }
                    i10++;
                }
                if (thread == null) {
                    try {
                        aVar = new a(threadGroup, "GmsDynamite");
                        try {
                            aVar.setContextClassLoader(null);
                            aVar.start();
                        } catch (SecurityException e11) {
                            e10 = e11;
                            Log.w("DynamiteLoaderV2CL", "Failed to enumerate thread/threadgroup " + e10.getMessage());
                        }
                    } catch (SecurityException e12) {
                        e10 = e12;
                        aVar = thread;
                    }
                    thread = aVar;
                }
            } catch (SecurityException e13) {
                e10 = e13;
                aVar = null;
            }
        }
        return thread;
    }
}
