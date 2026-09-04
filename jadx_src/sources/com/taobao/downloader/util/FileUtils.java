package com.taobao.downloader.util;

import android.content.Context;
import android.text.TextUtils;
import com.taobao.downloader.request.Item;
import java.io.File;
import java.net.URL;

/* JADX INFO: loaded from: classes4.dex */
public class FileUtils {
    private static final String TAG = "FileUtils";
    private static final String TEMP_SUFFIX = ".download";

    public static String getFileName(Item item) {
        if (!TextUtils.isEmpty(item.name)) {
            return item.name;
        }
        try {
            return new File(new URL(item.url).getFile()).getName();
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String getLocalFile(String str, Item item) {
        String fileName = getFileName(item);
        if (TextUtils.isEmpty(fileName)) {
            return "";
        }
        File file = new File(str, fileName);
        File file2 = new File(str, fileName + TEMP_SUFFIX);
        String absolutePath = file.getAbsolutePath();
        if (file.exists()) {
            long j10 = item.size;
            if ((0 == j10 || j10 == file.length()) && Md5Util.isMd5Same(item.md5, absolutePath)) {
                return file.getAbsolutePath();
            }
        }
        if (file2.exists()) {
            long j11 = item.size;
            if ((0 == j11 || j11 == file2.length()) && Md5Util.isMd5Same(item.md5, file2.getAbsolutePath())) {
                file2.renameTo(file);
                return file.getAbsolutePath();
            }
        }
        return "";
    }

    public static String getStorePath(Context context, String str) {
        return getStorePath(context, str, true);
    }

    public static String getStorePath(Context context, String str, boolean z10) {
        File externalCacheDir = z10 ? context.getExternalCacheDir() : null;
        if (externalCacheDir == null) {
            externalCacheDir = context.getCacheDir();
        }
        StringBuilder sb2 = new StringBuilder();
        String str2 = File.separator;
        sb2.append(str2);
        sb2.append("downloadsdk");
        sb2.append(str2);
        sb2.append(str);
        File file = new File(externalCacheDir, sb2.toString());
        if (!file.exists()) {
            file.mkdirs();
        }
        return file.getAbsolutePath();
    }

    public static boolean mvFile(File file, File file2) {
        if (!file.exists()) {
            return false;
        }
        if (file2.exists() && !file2.delete()) {
            return false;
        }
        if (!file2.getParentFile().exists() && !file2.getParentFile().mkdirs()) {
            return false;
        }
        if (!file2.getParentFile().canWrite()) {
            file2.getParentFile().setWritable(true);
        }
        if (file.renameTo(file2)) {
            return true;
        }
        Dlog.e(TAG, "mvFile", "rename fail", file.getName());
        return false;
    }
}
