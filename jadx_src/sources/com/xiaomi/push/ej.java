package com.xiaomi.push;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.xiaomi.channel.commonutils.logger.LoggerInterface;
import com.xiaomi.mipush.sdk.Constants;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.RandomAccessFile;
import java.nio.channels.FileLock;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class ej implements LoggerInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile ej f107036a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private Context f332a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private Handler f333a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f107037b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f107038c = "";

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static final SimpleDateFormat f330a = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss aaa");

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public static String f329a = "/MiPushLog";

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static List<Pair<String, Throwable>> f331a = Collections.synchronizedList(new ArrayList());

    private ej(Context context) {
        this.f332a = context;
        if (context.getApplicationContext() != null) {
            this.f332a = context.getApplicationContext();
        }
        this.f107037b = this.f332a.getPackageName() + Constants.ACCEPT_TIME_SEPARATOR_SERVER + Process.myPid();
        HandlerThread handlerThread = new HandlerThread("Log2FileHandlerThread");
        handlerThread.start();
        this.f333a = new Handler(handlerThread.getLooper());
    }

    public static ej a(Context context) {
        if (f107036a == null) {
            synchronized (ej.class) {
                if (f107036a == null) {
                    f107036a = new ej(context);
                }
            }
        }
        return f107036a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public void m281a() throws Throwable {
        FileLock fileLockLock;
        RandomAccessFile randomAccessFile;
        File externalFilesDir;
        BufferedWriter bufferedWriter = null;
        try {
            try {
                if (TextUtils.isEmpty(this.f107038c) && (externalFilesDir = this.f332a.getExternalFilesDir(null)) != null) {
                    this.f107038c = externalFilesDir.getAbsolutePath() + "";
                }
                File file = new File(this.f107038c + f329a);
                if ((!file.exists() || !file.isDirectory()) && !file.mkdirs()) {
                    Log.w(this.f107037b, "Create mipushlog directory fail.");
                    return;
                }
                File file2 = new File(file, "log.lock");
                if (!file2.exists() || file2.isDirectory()) {
                    file2.createNewFile();
                }
                randomAccessFile = new RandomAccessFile(file2, "rw");
                try {
                    fileLockLock = randomAccessFile.getChannel().lock();
                    try {
                        try {
                            BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(new File(file, "log1.txt"), true)));
                            while (!f331a.isEmpty()) {
                                try {
                                    Pair<String, Throwable> pairRemove = f331a.remove(0);
                                    String str = (String) pairRemove.first;
                                    if (pairRemove.second != null) {
                                        str = (str + "\n") + Log.getStackTraceString((Throwable) pairRemove.second);
                                    }
                                    bufferedWriter2.write(str + "\n");
                                } catch (Exception e10) {
                                    e = e10;
                                    bufferedWriter = bufferedWriter2;
                                    Log.e(this.f107037b, "", e);
                                    if (bufferedWriter != null) {
                                        try {
                                            bufferedWriter.close();
                                        } catch (IOException e11) {
                                            Log.e(this.f107037b, "", e11);
                                        }
                                    }
                                    if (fileLockLock != null && fileLockLock.isValid()) {
                                        try {
                                            fileLockLock.release();
                                        } catch (IOException e12) {
                                            Log.e(this.f107037b, "", e12);
                                        }
                                    }
                                    if (randomAccessFile == null) {
                                        return;
                                    } else {
                                        randomAccessFile.close();
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    bufferedWriter = bufferedWriter2;
                                    if (bufferedWriter != null) {
                                        try {
                                            bufferedWriter.close();
                                        } catch (IOException e13) {
                                            Log.e(this.f107037b, "", e13);
                                        }
                                    }
                                    if (fileLockLock != null && fileLockLock.isValid()) {
                                        try {
                                            fileLockLock.release();
                                        } catch (IOException e14) {
                                            Log.e(this.f107037b, "", e14);
                                        }
                                    }
                                    if (randomAccessFile == null) {
                                        throw th;
                                    }
                                    try {
                                        randomAccessFile.close();
                                        throw th;
                                    } catch (IOException e15) {
                                        Log.e(this.f107037b, "", e15);
                                        throw th;
                                    }
                                }
                            }
                            bufferedWriter2.flush();
                            bufferedWriter2.close();
                            File file3 = new File(file, "log1.txt");
                            if (file3.length() >= 1048576) {
                                File file4 = new File(file, "log0.txt");
                                if (file4.exists() && file4.isFile()) {
                                    file4.delete();
                                }
                                file3.renameTo(file4);
                            }
                            if (fileLockLock != null && fileLockLock.isValid()) {
                                try {
                                    fileLockLock.release();
                                } catch (IOException e16) {
                                    Log.e(this.f107037b, "", e16);
                                }
                            }
                            randomAccessFile.close();
                        } catch (Exception e17) {
                            e = e17;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                    }
                } catch (Exception e18) {
                    e = e18;
                    fileLockLock = null;
                } catch (Throwable th4) {
                    th = th4;
                    fileLockLock = null;
                }
            } catch (IOException e19) {
                Log.e(this.f107037b, "", e19);
            }
        } catch (Exception e20) {
            e = e20;
            fileLockLock = null;
            randomAccessFile = null;
        } catch (Throwable th5) {
            th = th5;
            fileLockLock = null;
            randomAccessFile = null;
        }
    }

    @Override // com.xiaomi.channel.commonutils.logger.LoggerInterface
    public final void log(String str) {
        log(str, null);
    }

    @Override // com.xiaomi.channel.commonutils.logger.LoggerInterface
    public final void log(String str, Throwable th2) {
        this.f333a.post(new ek(this, str, th2));
    }

    @Override // com.xiaomi.channel.commonutils.logger.LoggerInterface
    public final void setTag(String str) {
        this.f107037b = str;
    }
}
