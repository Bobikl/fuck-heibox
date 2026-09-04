package anet.channel.strategy;

import android.content.Context;
import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.statist.StrategyStatObject;
import anet.channel.util.ALog;
import anet.channel.util.SerializeHelper;
import com.max.xiaoheihe.okflutter.containers.FlutterActivityLaunchConfigs;
import java.io.File;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes6.dex */
public class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static File f29977a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile boolean f29978b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Comparator<File> f29979c = new n();

    m() {
    }

    public static File a(String str) {
        a(f29977a);
        return new File(f29977a, str);
    }

    static synchronized <T> T a(String str, StrategyStatObject strategyStatObject) {
        return (T) SerializeHelper.restore(a(str), strategyStatObject);
    }

    static synchronized void a() {
        ALog.i("awcn.StrategySerializeHelper", "clear start.", null, new Object[0]);
        File file = f29977a;
        if (file == null) {
            ALog.w("awcn.StrategySerializeHelper", "folder path not initialized, wait to clear", null, new Object[0]);
            f29978b = true;
            return;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return;
        }
        for (File file2 : fileArrListFiles) {
            if (file2.isFile()) {
                file2.delete();
            }
        }
        ALog.i("awcn.StrategySerializeHelper", "clear end.", null, new Object[0]);
    }

    public static void a(Context context) {
        if (context != null) {
            try {
                File file = new File(context.getFilesDir(), "awcn_strategy");
                f29977a = file;
                if (!a(file)) {
                    ALog.e("awcn.StrategySerializeHelper", "create directory failed!!!", null, "dir", f29977a.getAbsolutePath());
                }
                if (!GlobalAppRuntimeInfo.isTargetProcess()) {
                    String currentProcess = GlobalAppRuntimeInfo.getCurrentProcess();
                    File file2 = new File(f29977a, currentProcess.substring(currentProcess.indexOf(58) + 1));
                    f29977a = file2;
                    if (!a(file2)) {
                        ALog.e("awcn.StrategySerializeHelper", "create directory failed!!!", null, "dir", f29977a.getAbsolutePath());
                    }
                }
                ALog.i("awcn.StrategySerializeHelper", "StrateyFolder", null, FlutterActivityLaunchConfigs.EXTRA_PATH, f29977a.getAbsolutePath());
                if (!f29978b) {
                    c();
                } else {
                    a();
                    f29978b = false;
                }
            } catch (Throwable th2) {
                ALog.e("awcn.StrategySerializeHelper", "StrategySerializeHelper initialize failed!!!", null, th2, new Object[0]);
            }
        }
    }

    static synchronized void a(Serializable serializable, String str, StrategyStatObject strategyStatObject) {
        SerializeHelper.persist(serializable, a(str), strategyStatObject);
    }

    private static boolean a(File file) {
        if (file == null || file.exists()) {
            return true;
        }
        return file.mkdir();
    }

    static synchronized File[] b() {
        File file = f29977a;
        if (file == null) {
            return null;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            Arrays.sort(fileArrListFiles, f29979c);
        }
        return fileArrListFiles;
    }

    static synchronized void c() {
        File[] fileArrB = b();
        if (fileArrB == null) {
            return;
        }
        int i10 = 0;
        for (File file : fileArrB) {
            if (!file.isDirectory()) {
                if (System.currentTimeMillis() - file.lastModified() > 172800000) {
                    file.delete();
                } else if (file.getName().startsWith("WIFI")) {
                    int i11 = i10 + 1;
                    if (i10 > 10) {
                        file.delete();
                    }
                    i10 = i11;
                }
            }
        }
    }
}
