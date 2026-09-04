package com.tencent.liteav.base;

import android.content.Context;
import android.system.Os;
import java.io.File;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes4.dex */
public abstract class PathUtils {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final int CACHE_DIRECTORY = 2;
    private static final int DATA_DIRECTORY = 0;
    private static final int LOG_DIRECTORY = 3;
    private static final int NUM_DIRECTORIES = 4;
    private static final String TAG = "PathUtils";
    private static final int THUMBNAIL_DIRECTORY = 1;
    private static final String THUMBNAIL_DIRECTORY_NAME = "textures";
    private static String sCacheSubDirectory;
    private static String sDataDirectorySuffix;
    private static FutureTask<String[]> sDirPathFetchTask;
    private static final AtomicBoolean sInitializationStarted = new AtomicBoolean();

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final String[] f99558a = PathUtils.getOrComputeDirectoryPaths();
    }

    private PathUtils() {
    }

    private static void chmod(String str, int i10) {
        try {
            Os.chmod(str, i10);
        } catch (Exception unused) {
            Log.e(TAG, "Failed to set permissions for path \"" + str + "\"", new Object[0]);
        }
    }

    public static String getCacheDirectory() {
        return getDirectoryPath(2);
    }

    public static String getDataDirectory() {
        return getDirectoryPath(0);
    }

    private static String getDirectoryPath(int i10) {
        return a.f99558a[i10];
    }

    public static String getLogDirectory() {
        return getDirectoryPath(3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String[] getOrComputeDirectoryPaths() {
        try {
            if (!sDirPathFetchTask.cancel(false)) {
                return sDirPathFetchTask.get();
            }
            b bVarA = b.a();
            try {
                String[] privateDataDirectorySuffixInternal = setPrivateDataDirectorySuffixInternal();
                bVarA.close();
                return privateDataDirectorySuffixInternal;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    try {
                        bVarA.close();
                    } catch (Throwable unused) {
                    }
                    throw th3;
                }
            }
        } catch (InterruptedException | ExecutionException unused2) {
            return null;
        }
    }

    public static String getThumbnailCacheDirectory() {
        return getDirectoryPath(1);
    }

    public static void setPrivateDataDirectorySuffix(String str) {
        setPrivateDataDirectorySuffix(str, null);
    }

    public static synchronized void setPrivateDataDirectorySuffix(String str, String str2) {
        if (!sInitializationStarted.getAndSet(true)) {
            sDataDirectorySuffix = str;
            sCacheSubDirectory = str2;
            sDirPathFetchTask = new FutureTask<>(com.tencent.liteav.base.a.a());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String[] setPrivateDataDirectorySuffixInternal() {
        String[] strArr = new String[4];
        Context applicationContext = ContextUtils.getApplicationContext();
        String path = applicationContext.getDir(sDataDirectorySuffix, 0).getPath();
        strArr[0] = path;
        chmod(path, bb.c.b.G5);
        strArr[1] = applicationContext.getDir(THUMBNAIL_DIRECTORY_NAME, 0).getPath();
        if (applicationContext.getCacheDir() != null) {
            if (sCacheSubDirectory == null) {
                strArr[2] = applicationContext.getCacheDir().getPath();
            } else {
                strArr[2] = new File(applicationContext.getCacheDir(), sCacheSubDirectory).getPath();
            }
        }
        File externalFilesDir = applicationContext.getExternalFilesDir(null);
        if (externalFilesDir != null) {
            strArr[3] = externalFilesDir.getAbsolutePath() + "/log/liteav";
        }
        return strArr;
    }
}
