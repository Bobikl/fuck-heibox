package io.flutter.util;

import android.content.Context;
import android.os.Build;
import androidx.annotation.n0;
import java.io.File;

/* JADX INFO: loaded from: classes4.dex */
public final class PathUtils {
    @n0
    public static String getCacheDirectory(@n0 Context context) {
        File codeCacheDir = context.getCodeCacheDir();
        if (codeCacheDir == null) {
            codeCacheDir = context.getCacheDir();
        }
        if (codeCacheDir == null) {
            codeCacheDir = new File(getDataDirPath(context), "cache");
        }
        return codeCacheDir.getPath();
    }

    private static String getDataDirPath(Context context) {
        return Build.VERSION.SDK_INT >= 24 ? context.getDataDir().getPath() : context.getApplicationInfo().dataDir;
    }

    @n0
    public static String getDataDirectory(@n0 Context context) {
        File dir = context.getDir("flutter", 0);
        if (dir == null) {
            dir = new File(getDataDirPath(context), "app_flutter");
        }
        return dir.getPath();
    }

    @n0
    public static String getFilesDir(@n0 Context context) {
        File filesDir = context.getFilesDir();
        if (filesDir == null) {
            filesDir = new File(getDataDirPath(context), "files");
        }
        return filesDir.getPath();
    }
}
