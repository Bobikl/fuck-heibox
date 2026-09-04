package com.xiaomi.push;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import com.max.xiaoheihe.module.game.pubg.PUBGFriendRankActivity;
import com.xiaomi.mipush.sdk.Constants;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileLock;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class cb {
    public static String a() {
        return Build.VERSION.RELEASE + Constants.ACCEPT_TIME_SEPARATOR_SERVER + Build.VERSION.INCREMENTAL;
    }

    public static String a(Context context) {
        String strA = ce.a(context).a("sp_client_report_status", "sp_client_report_key", "");
        if (!TextUtils.isEmpty(strA)) {
            return strA;
        }
        String strA2 = bp.a(20);
        ce.a(context).m221a("sp_client_report_status", "sp_client_report_key", strA2);
        return strA2;
    }

    public static void a(Context context, String str) {
        Intent intent = new Intent("com.xiaomi.xmsf.push.XMSF_UPLOAD_ACTIVE");
        intent.putExtra("pkgname", context.getPackageName());
        intent.putExtra(PUBGFriendRankActivity.Y, "category_client_report_data");
        intent.putExtra("name", "quality_support");
        intent.putExtra("data", str);
        context.sendBroadcast(intent, "com.xiaomi.xmsf.permission.USE_XMSF_UPLOAD");
    }

    /* JADX WARN: Code duplicated, block: B:108:0x0121 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:86:0x011e  */
    public static void a(Context context, String str, String str2) throws Throwable {
        File file;
        RandomAccessFile randomAccessFile;
        Exception e10;
        File externalFilesDir = context.getExternalFilesDir(str2);
        if (externalFilesDir != null) {
            if (!externalFilesDir.exists()) {
                externalFilesDir.mkdirs();
            }
            File externalFilesDir2 = context.getExternalFilesDir(str);
            if (externalFilesDir2 != null) {
                if (!externalFilesDir2.exists()) {
                    externalFilesDir2.mkdirs();
                    return;
                }
                File[] fileArrListFiles = externalFilesDir2.listFiles(new cc());
                if (fileArrListFiles == null || fileArrListFiles.length <= 0) {
                    return;
                }
                long jCurrentTimeMillis = System.currentTimeMillis();
                FileLock fileLockLock = null;
                RandomAccessFile randomAccessFile2 = null;
                File file2 = null;
                for (File file3 : fileArrListFiles) {
                    if (file3 != null) {
                        try {
                            if (TextUtils.isEmpty(file3.getAbsolutePath())) {
                                if (fileLockLock != null && fileLockLock.isValid()) {
                                    try {
                                        fileLockLock.release();
                                    } catch (IOException e11) {
                                        com.xiaomi.channel.commonutils.logger.b.a(e11);
                                    }
                                }
                                x.a(randomAccessFile2);
                                if (file2 != null) {
                                    file2.delete();
                                }
                            } else {
                                file = new File(file3.getAbsolutePath() + ".lock");
                                try {
                                    x.m780a(file);
                                    randomAccessFile = new RandomAccessFile(file, "rw");
                                    try {
                                        try {
                                            fileLockLock = randomAccessFile.getChannel().lock();
                                            File file4 = new File(externalFilesDir.getAbsolutePath() + File.separator + file3.getName() + jCurrentTimeMillis);
                                            try {
                                                x.b(file3, file4);
                                            } catch (IOException e12) {
                                                e12.printStackTrace();
                                                file3.delete();
                                                file4.delete();
                                            }
                                            file3.delete();
                                            if (fileLockLock != null && fileLockLock.isValid()) {
                                                try {
                                                    fileLockLock.release();
                                                } catch (IOException e13) {
                                                    com.xiaomi.channel.commonutils.logger.b.a(e13);
                                                }
                                            }
                                            x.a(randomAccessFile);
                                        } catch (Exception e14) {
                                            e10 = e14;
                                            com.xiaomi.channel.commonutils.logger.b.a(e10);
                                            if (fileLockLock != null) {
                                                try {
                                                    fileLockLock.release();
                                                } catch (IOException e15) {
                                                    com.xiaomi.channel.commonutils.logger.b.a(e15);
                                                }
                                            }
                                            x.a(randomAccessFile);
                                            if (file != null) {
                                            }
                                            randomAccessFile2 = randomAccessFile;
                                            file2 = file;
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        randomAccessFile2 = randomAccessFile;
                                        file2 = file;
                                        if (fileLockLock != null && fileLockLock.isValid()) {
                                            try {
                                                fileLockLock.release();
                                            } catch (IOException e16) {
                                                com.xiaomi.channel.commonutils.logger.b.a(e16);
                                            }
                                        }
                                        x.a(randomAccessFile2);
                                        if (file2 == null) {
                                            throw th;
                                        }
                                        file2.delete();
                                        throw th;
                                    }
                                } catch (Exception e17) {
                                    randomAccessFile = randomAccessFile2;
                                    e10 = e17;
                                } catch (Throwable th3) {
                                    th = th3;
                                }
                                file.delete();
                                randomAccessFile2 = randomAccessFile;
                                file2 = file;
                            }
                        } catch (Exception e18) {
                            file = file2;
                            randomAccessFile = randomAccessFile2;
                            e10 = e18;
                        } catch (Throwable th4) {
                            th = th4;
                        }
                        com.xiaomi.channel.commonutils.logger.b.a(e10);
                        if (fileLockLock != null && fileLockLock.isValid()) {
                            fileLockLock.release();
                        }
                        x.a(randomAccessFile);
                        if (file != null) {
                            file.delete();
                        }
                        randomAccessFile2 = randomAccessFile;
                        file2 = file;
                    } else {
                        if (fileLockLock != null) {
                            fileLockLock.release();
                        }
                        x.a(randomAccessFile2);
                        if (file2 != null) {
                            file2.delete();
                        }
                    }
                }
            }
        }
    }

    public static void a(Context context, List<String> list) {
        if (list == null || list.size() <= 0 || !m217a(context)) {
            return;
        }
        for (String str : list) {
            if (!TextUtils.isEmpty(str)) {
                a(context, str);
            }
        }
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static boolean m217a(Context context) {
        try {
            return context.getApplicationContext().getPackageManager().getPackageInfo("com.xiaomi.xmsf", 0).versionCode >= 108;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static boolean m218a(Context context, String str) {
        File file = new File(str);
        long maxFileLength = com.xiaomi.clientreport.manager.a.a(context).m72a().getMaxFileLength();
        if (file.exists()) {
            try {
                if (file.length() > maxFileLength) {
                    return false;
                }
            } catch (Exception e10) {
                com.xiaomi.channel.commonutils.logger.b.a(e10);
                return false;
            }
        } else {
            x.m780a(file);
        }
        return true;
    }

    @TargetApi(9)
    public static byte[] a(String str) {
        byte[] bArrCopyOf = Arrays.copyOf(bm.m189a(str), 16);
        bArrCopyOf[0] = 68;
        bArrCopyOf[15] = 84;
        return bArrCopyOf;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static File[] m219a(Context context, String str) {
        File externalFilesDir = context.getExternalFilesDir(str);
        if (externalFilesDir != null) {
            return externalFilesDir.listFiles(new cd());
        }
        return null;
    }
}
