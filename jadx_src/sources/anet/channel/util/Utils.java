package anet.channel.util;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import anet.channel.appmonitor.AppMonitor;
import anet.channel.monitor.NetworkSpeed;
import anet.channel.statist.ExceptionStatistic;
import anet.channel.status.NetworkStatusHelper;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.ta.utdid2.device.UTDevice;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.util.List;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes6.dex */
public class Utils {
    private static final String TAG = "awcn.Utils";
    public static Context context;

    public static Context getAppContext() {
        Context context2 = context;
        if (context2 != null) {
            return context2;
        }
        synchronized (Utils.class) {
            Context context3 = context;
            if (context3 != null) {
                return context3;
            }
            try {
                Class<?> cls = Class.forName("android.app.ActivityThread");
                Object objInvoke = cls.getMethod("currentActivityThread", new Class[0]).invoke(cls, new Object[0]);
                context = (Context) objInvoke.getClass().getMethod("getApplication", new Class[0]).invoke(objInvoke, new Object[0]);
            } catch (Exception e10) {
                ALog.w(TAG, "getAppContext", null, e10, new Object[0]);
            }
            return context;
        }
    }

    public static String getDeviceId(Context context2) {
        return UTDevice.getUtdid(context2);
    }

    public static String getMainProcessName(Context context2) {
        if (context2 == null) {
            return "";
        }
        try {
            return context2.getPackageManager().getPackageInfo(context2.getPackageName(), 0).applicationInfo.processName;
        } catch (PackageManager.NameNotFoundException unused) {
            return "";
        }
    }

    public static float getNetworkTimeFactor() {
        NetworkStatusHelper.NetworkStatus status = NetworkStatusHelper.getStatus();
        float f10 = (status == NetworkStatusHelper.NetworkStatus.G4 || status == NetworkStatusHelper.NetworkStatus.WIFI) ? 0.8f : 1.0f;
        return anet.channel.monitor.b.a().b() == NetworkSpeed.Fast.getCode() ? f10 * 0.75f : f10;
    }

    public static String getProcessName(Context context2, int i10) {
        String str = "";
        try {
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context2.getSystemService(RXScreenCaptureService.KEY_LAUNCH_ACTIVITY)).getRunningAppProcesses();
            if (runningAppProcesses != null && runningAppProcesses.size() > 0) {
                for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                    if (runningAppProcessInfo.pid == i10) {
                        str = runningAppProcessInfo.processName;
                        break;
                    }
                }
            } else {
                AppMonitor.getInstance().commitStat(new ExceptionStatistic(-108, ErrorConstant.formatMsg(-108, "BuildVersion=" + String.valueOf(Build.VERSION.SDK_INT)), "rt"));
            }
        } catch (Exception e10) {
            AppMonitor.getInstance().commitStat(new ExceptionStatistic(-108, e10.toString(), "rt"));
        }
        return TextUtils.isEmpty(str) ? getProcessNameNew(i10) : str;
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00dc A[Catch: IOException -> 0x00d8, TRY_LEAVE, TryCatch #1 {IOException -> 0x00d8, blocks: (B:47:0x00d4, B:51:0x00dc), top: B:56:0x00d4 }] */
    private static String getProcessNameNew(int i10) throws Throwable {
        BufferedReader bufferedReader;
        OutputStream outputStream;
        DataOutputStream dataOutputStream;
        String str = "ps  |  grep  " + i10;
        try {
            try {
                Process processExec = Runtime.getRuntime().exec("sh");
                bufferedReader = new BufferedReader(new InputStreamReader(processExec.getInputStream()));
                try {
                    dataOutputStream = new DataOutputStream(processExec.getOutputStream());
                    try {
                        dataOutputStream.writeBytes(str + "  &\n");
                        dataOutputStream.flush();
                        dataOutputStream.writeBytes("exit\n");
                        processExec.waitFor();
                        while (true) {
                            String line = bufferedReader.readLine();
                            if (line == null) {
                                try {
                                    bufferedReader.close();
                                    dataOutputStream.close();
                                    return "";
                                } catch (IOException e10) {
                                    ALog.e(TAG, "getProcessNameNew ", null, e10, new Object[0]);
                                    return "";
                                }
                            }
                            String[] strArrSplit = line.replaceAll("\\s+", "  ").split("  ");
                            if (strArrSplit.length >= 9 && !TextUtils.isEmpty(strArrSplit[1]) && strArrSplit[1].trim().equals(String.valueOf(i10))) {
                                String str2 = strArrSplit[8];
                                try {
                                    bufferedReader.close();
                                    dataOutputStream.close();
                                } catch (IOException e11) {
                                    ALog.e(TAG, "getProcessNameNew ", null, e11, new Object[0]);
                                }
                                return str2;
                            }
                        }
                    } catch (Exception e12) {
                        e = e12;
                        ALog.e(TAG, "getProcessNameNew ", null, e, new Object[0]);
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (IOException e13) {
                                ALog.e(TAG, "getProcessNameNew ", null, e13, new Object[0]);
                                return "";
                            }
                        }
                        if (dataOutputStream == null) {
                            return "";
                        }
                        dataOutputStream.close();
                        return "";
                    }
                } catch (Exception e14) {
                    e = e14;
                    dataOutputStream = null;
                } catch (Throwable th2) {
                    th = th2;
                    outputStream = null;
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                            if (outputStream != null) {
                                outputStream.close();
                            }
                        } catch (IOException e15) {
                            ALog.e(TAG, "getProcessNameNew ", null, e15, new Object[0]);
                            throw th;
                        }
                    } else if (outputStream != null) {
                        outputStream.close();
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Exception e16) {
            e = e16;
            bufferedReader = null;
            dataOutputStream = null;
        } catch (Throwable th4) {
            th = th4;
            bufferedReader = null;
            outputStream = null;
        }
    }

    public static String getStackMsg(Throwable th2) {
        StringBuffer stringBuffer = new StringBuffer();
        try {
            StackTraceElement[] stackTrace = th2.getStackTrace();
            if (stackTrace != null && stackTrace.length > 0) {
                for (StackTraceElement stackTraceElement : stackTrace) {
                    stringBuffer.append(stackTraceElement.toString() + "\n");
                }
            }
        } catch (Exception e10) {
            ALog.e(TAG, "getStackMsg", null, e10, new Object[0]);
        }
        return stringBuffer.toString();
    }

    public static Object invokeStaticMethodThrowException(String str, String str2, Class<?>[] clsArr, Object... objArr) throws Exception {
        if (str == null || str2 == null) {
            return null;
        }
        Class<?> cls = Class.forName(str);
        Method declaredMethod = clsArr != null ? cls.getDeclaredMethod(str2, clsArr) : cls.getDeclaredMethod(str2, new Class[0]);
        if (declaredMethod == null) {
            return null;
        }
        declaredMethod.setAccessible(true);
        return objArr != null ? declaredMethod.invoke(cls, objArr) : declaredMethod.invoke(cls, new Object[0]);
    }
}
