package anet.channel.util;

import android.content.Context;
import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.appmonitor.AppMonitor;
import anet.channel.statist.StrategyStatObject;
import com.max.hbuikit.bean.param.UiKitSpanObj;
import com.xiaomi.mipush.sdk.Constants;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.UUID;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes6.dex */
public class SerializeHelper {
    private static final String TAG = "awcn.SerializeHelper";
    private static File cacheDir;

    public static File getCacheFiles(String str) {
        Context context;
        if (cacheDir == null && (context = GlobalAppRuntimeInfo.getContext()) != null) {
            cacheDir = context.getCacheDir();
        }
        return new File(cacheDir, str);
    }

    public static synchronized void persist(Serializable serializable, File file) {
        persist(serializable, file, null);
    }

    /* JADX WARN: Code duplicated, block: B:78:0x0105 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Not initialized variable reg: 11, insn: 0x0102: MOVE (r4 I:??[OBJECT, ARRAY]) = (r11 I:??[OBJECT, ARRAY]), block:B:60:0x0102 */
    public static synchronized void persist(Serializable serializable, File file, StrategyStatObject strategyStatObject) {
        File cacheFiles;
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2;
        boolean z10;
        boolean zRenameTo;
        FileOutputStream fileOutputStream3 = null;
        if (serializable == null || file == null) {
            ALog.e(TAG, "persist fail. Invalid parameter", null, new Object[0]);
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        int i10 = 1;
        try {
            try {
                try {
                    cacheFiles = getCacheFiles(UUID.randomUUID().toString().replace(Constants.ACCEPT_TIME_SEPARATOR_SERVER, ""));
                    try {
                        cacheFiles.createNewFile();
                        cacheFiles.setReadable(true);
                        fileOutputStream = new FileOutputStream(cacheFiles);
                        try {
                            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new BufferedOutputStream(fileOutputStream));
                            objectOutputStream.writeObject(serializable);
                            objectOutputStream.flush();
                            objectOutputStream.close();
                            try {
                                fileOutputStream.close();
                            } catch (IOException unused) {
                            }
                            z10 = true;
                        } catch (Exception e10) {
                            e = e10;
                            ALog.e(TAG, "persist fail. ", null, e, "file", file.getName());
                            if (strategyStatObject != null) {
                                strategyStatObject.appendErrorTrace("SerializeHelper.persist()", e);
                            }
                            if (fileOutputStream != null) {
                                try {
                                    fileOutputStream.close();
                                } catch (IOException unused2) {
                                }
                            }
                            z10 = false;
                        }
                    } catch (Exception e11) {
                        e = e11;
                        fileOutputStream = null;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fileOutputStream3 = fileOutputStream2;
                    if (fileOutputStream3 != null) {
                        try {
                            fileOutputStream3.close();
                        } catch (IOException unused3) {
                        }
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                if (fileOutputStream3 != null) {
                    fileOutputStream3.close();
                }
                throw th;
            }
        } catch (Exception e12) {
            e = e12;
            cacheFiles = null;
            fileOutputStream = null;
        }
        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
        if (strategyStatObject != null) {
            strategyStatObject.writeTempFilePath = String.valueOf(cacheFiles);
            strategyStatObject.writeStrategyFilePath = String.valueOf(file);
            strategyStatObject.isTempWriteSucceed = z10 ? 1 : 0;
            strategyStatObject.writeCostTime = jCurrentTimeMillis2;
        }
        if (z10) {
            zRenameTo = cacheFiles.renameTo(file);
            if (zRenameTo) {
                ALog.i(TAG, "persist end.", null, "file", file.getAbsoluteFile(), UiKitSpanObj.TYPE_SIZE, Long.valueOf(file.length()), "cost", Long.valueOf(jCurrentTimeMillis2));
            } else {
                ALog.e(TAG, "rename failed.", null, new Object[0]);
            }
            if (strategyStatObject != null) {
                strategyStatObject.isRenameSucceed = zRenameTo ? 1 : 0;
                if (!zRenameTo) {
                    i10 = 0;
                }
                strategyStatObject.isSucceed = i10;
                AppMonitor.getInstance().commitStat(strategyStatObject);
            }
        } else {
            zRenameTo = false;
        }
        if (!z10 || !zRenameTo) {
            try {
                cacheFiles.delete();
            } catch (Exception unused4) {
                ALog.e(TAG, "delete failed.", null, new Object[0]);
            }
        }
    }

    public static synchronized <T> T restore(File file) {
        return (T) restore(file, null);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x001a A[Catch: all -> 0x0095, TryCatch #4 {all -> 0x0095, blocks: (B:10:0x0012, B:12:0x001a, B:14:0x0020, B:18:0x0037, B:19:0x0039), top: B:58:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:14:0x0020 A[Catch: all -> 0x0095, TRY_LEAVE, TryCatch #4 {all -> 0x0095, blocks: (B:10:0x0012, B:12:0x001a, B:14:0x0020, B:18:0x0037, B:19:0x0039), top: B:58:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:17:0x0035 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:18:0x0037 A[Catch: all -> 0x0095, TRY_ENTER, TryCatch #4 {all -> 0x0095, blocks: (B:10:0x0012, B:12:0x001a, B:14:0x0020, B:18:0x0037, B:19:0x0039), top: B:58:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:23:0x005a A[Catch: all -> 0x0090, TryCatch #1 {all -> 0x0090, blocks: (B:21:0x0050, B:23:0x005a, B:24:0x005e), top: B:52:0x0050 }] */
    public static synchronized <T> T restore(File file, StrategyStatObject strategyStatObject) {
        FileInputStream fileInputStream;
        T t10;
        long jCurrentTimeMillis;
        if (strategyStatObject == null) {
            if (!file.exists()) {
                if (ALog.isPrintLog(3)) {
                    ALog.w(TAG, "file not exist.", null, "file", file.getName());
                }
                return null;
            }
            if (strategyStatObject != null) {
                strategyStatObject.isFileExists = 1;
            }
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            fileInputStream = new FileInputStream(file);
            ObjectInputStream objectInputStream = new ObjectInputStream(new BufferedInputStream(fileInputStream));
            t10 = (T) objectInputStream.readObject();
            objectInputStream.close();
            jCurrentTimeMillis = System.currentTimeMillis() - jCurrentTimeMillis2;
            if (strategyStatObject != null) {
                strategyStatObject.isReadObjectSucceed = 1;
                strategyStatObject.readCostTime = jCurrentTimeMillis;
            }
            ALog.i(TAG, "restore end.", null, "file", file.getAbsoluteFile(), UiKitSpanObj.TYPE_SIZE, Long.valueOf(file.length()), "cost", Long.valueOf(jCurrentTimeMillis));
            fileInputStream.close();
            return t10;
        }
        strategyStatObject.readStrategyFilePath = String.valueOf(file);
        try {
            if (!file.exists()) {
                if (ALog.isPrintLog(3)) {
                    ALog.w(TAG, "file not exist.", null, "file", file.getName());
                }
                return null;
            }
            if (strategyStatObject != null) {
                strategyStatObject.isFileExists = 1;
            }
            long jCurrentTimeMillis3 = System.currentTimeMillis();
            fileInputStream = new FileInputStream(file);
            try {
                ObjectInputStream objectInputStream2 = new ObjectInputStream(new BufferedInputStream(fileInputStream));
                t10 = (T) objectInputStream2.readObject();
                try {
                    objectInputStream2.close();
                    jCurrentTimeMillis = System.currentTimeMillis() - jCurrentTimeMillis3;
                    if (strategyStatObject != null) {
                        strategyStatObject.isReadObjectSucceed = 1;
                        strategyStatObject.readCostTime = jCurrentTimeMillis;
                    }
                    ALog.i(TAG, "restore end.", null, "file", file.getAbsoluteFile(), UiKitSpanObj.TYPE_SIZE, Long.valueOf(file.length()), "cost", Long.valueOf(jCurrentTimeMillis));
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        if (ALog.isPrintLog(3)) {
                            ALog.w(TAG, "restore file fail.", null, th, new Object[0]);
                        }
                        if (strategyStatObject != null) {
                            strategyStatObject.appendErrorTrace("SerializeHelper.restore()", th);
                        }
                        if (fileInputStream != null) {
                        }
                        return t10;
                    } catch (Throwable th3) {
                        if (fileInputStream != null) {
                            try {
                                fileInputStream.close();
                            } catch (IOException unused) {
                            }
                        }
                        throw th3;
                    }
                }
            } catch (Throwable th4) {
                th = th4;
                t10 = null;
            }
            try {
                fileInputStream.close();
            } catch (IOException unused2) {
            }
            return t10;
        } catch (Throwable th5) {
            th = th5;
            fileInputStream = null;
            t10 = null;
        }
        throw th;
    }
}
