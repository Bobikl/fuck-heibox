package com.tencent.beacon.a.c;

import android.app.ActivityManager;
import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.hardware.SensorManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.ss.android.ttvecamera.TECameraSettings;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Locale;

/* JADX INFO: compiled from: DeviceInfo.java */
/* JADX INFO: loaded from: classes4.dex */
public class e implements com.tencent.beacon.base.net.c.e.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile e f98804a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f98805b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f98806c = "";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f98807d = "";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f98808e = "";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f98809f = "";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f98810g = "";

    private e() {
        Context contextC = c.d().c();
        this.f98805b = contextC;
        com.tencent.beacon.base.net.c.e.a(contextC, this);
        F();
    }

    private void F() {
        this.f98809f = G();
    }

    private String G() {
        NetworkInfo activeNetworkInfo;
        TelephonyManager telephonyManager;
        String string = "unknown";
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) this.f98805b.getSystemService("connectivity");
            if (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null) {
                return "unknown";
            }
            if (activeNetworkInfo.getType() == 1) {
                string = "wifi";
            } else if (activeNetworkInfo.getType() == 0 && (telephonyManager = (TelephonyManager) this.f98805b.getSystemService(g0.a.f118921e)) != null) {
                int networkType = telephonyManager.getNetworkType();
                if (networkType != 20) {
                    switch (networkType) {
                        case 1:
                        case 2:
                        case 4:
                        case 7:
                        case 11:
                            string = d4.d.f108135c;
                            break;
                        case 3:
                        case 5:
                        case 6:
                        case 8:
                        case 9:
                        case 10:
                        case 12:
                        case 14:
                        case 15:
                            string = d4.d.f108136d;
                            break;
                        case 13:
                            string = d4.d.f108137e;
                            break;
                        default:
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("unknown_");
                            sb2.append(telephonyManager.getNetworkType());
                            string = sb2.toString();
                            break;
                    }
                } else {
                    string = "5G";
                }
            }
        } catch (Exception e10) {
            com.tencent.beacon.base.util.c.a(e10);
        }
        com.tencent.beacon.base.util.c.a("[DeviceInfo] NetWork Type:" + string, new Object[0]);
        return string;
    }

    public static e l() {
        if (f98804a == null) {
            synchronized (e.class) {
                if (f98804a == null) {
                    f98804a = new e();
                }
            }
        }
        return f98804a;
    }

    public String A() {
        String str;
        String str2;
        String str3;
        com.tencent.beacon.base.util.c.a("[model] getSensor2 start", new Object[0]);
        String str4 = "Y";
        String str5 = B() ? "Y" : "N";
        String str6 = "X";
        if (Integer.parseInt(Build.VERSION.SDK) >= 10) {
            try {
                SensorManager sensorManager = (SensorManager) this.f98805b.getSystemService(ak.f104420ac);
                str2 = sensorManager.getDefaultSensor(1) != null ? "Y" : "N";
                try {
                    str = sensorManager.getDefaultSensor(5) != null ? "Y" : "N";
                    try {
                        str3 = BluetoothAdapter.getDefaultAdapter() == null ? "N" : "Y";
                        try {
                            if (!this.f98805b.getPackageManager().hasSystemFeature("android.hardware.nfc")) {
                                str4 = "N";
                            }
                        } catch (Throwable unused) {
                            com.tencent.beacon.base.util.c.b("[model] getSensor2 error!", new Object[0]);
                            str4 = "X";
                        }
                    } catch (Throwable unused2) {
                        str3 = "X";
                    }
                } catch (Throwable unused3) {
                    str = "X";
                    str3 = str;
                }
            } catch (Throwable unused4) {
                str = "X";
                str2 = str;
                str3 = str2;
            }
            str6 = str2;
        } else {
            str4 = "X";
            str = str4;
            str3 = str;
        }
        return str5 + str6 + str + str3 + str4;
    }

    public boolean B() {
        return ((WifiManager) this.f98805b.getSystemService("wifi")) != null;
    }

    public void C() {
        String string = com.tencent.beacon.a.d.a.a().getString("BEACON_ANDROID_ID_DENGTA", "");
        this.f98806c = string;
        if (TextUtils.isEmpty(string)) {
            this.f98806c = com.tencent.beacon.base.util.b.a();
            com.tencent.beacon.a.d.a.SharedPreferencesEditorC0949a sharedPreferencesEditorC0949aEdit = com.tencent.beacon.a.d.a.a().edit();
            if (com.tencent.beacon.base.util.b.a((SharedPreferences.Editor) sharedPreferencesEditorC0949aEdit)) {
                sharedPreferencesEditorC0949aEdit.putString("BEACON_ANDROID_ID_DENGTA", this.f98806c);
            }
        }
    }

    public boolean D() {
        BufferedReader bufferedReader;
        String line;
        boolean z10;
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec(new String[]{"/system/bin/cat", "/proc/cpuinfo"}).getInputStream(), Charset.defaultCharset()));
            do {
                try {
                    line = bufferedReader.readLine();
                    if (line == null) {
                        z10 = false;
                    }
                    com.tencent.beacon.base.util.b.a(bufferedReader);
                    return z10;
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        com.tencent.beacon.base.util.c.a(th);
                        com.tencent.beacon.base.util.b.a(bufferedReader);
                        return false;
                    } catch (Throwable th3) {
                        com.tencent.beacon.base.util.b.a(bufferedReader);
                        throw th3;
                    }
                }
            } while (-1 == line.toLowerCase().indexOf("armv7"));
            z10 = true;
            com.tencent.beacon.base.util.b.a(bufferedReader);
            return z10;
        } catch (Throwable th4) {
            th = th4;
            bufferedReader = null;
        }
    }

    public String E() {
        if (TextUtils.isEmpty(this.f98810g)) {
            try {
                Class<?> cls = Class.forName("com.huawei.system.BuildEx");
                String str = "harmony".equals(cls.getMethod("getOsBrand", new Class[0]).invoke(cls, new Object[0])) ? "Y" : "N";
                this.f98810g = str;
                return str;
            } catch (Throwable unused) {
                this.f98810g = "N";
            }
        }
        return this.f98810g;
    }

    public String a(Context context) {
        try {
            if (Integer.parseInt(Build.VERSION.SDK) < 9) {
                com.tencent.beacon.base.util.c.b("[audit] Api level < 9;return null!", new Object[0]);
                return "";
            }
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("[audit] get app_last_updated_time:");
            sb2.append(String.valueOf(packageInfo.lastUpdateTime));
            com.tencent.beacon.base.util.c.a(sb2.toString(), new Object[0]);
            return String.valueOf(packageInfo.lastUpdateTime);
        } catch (Throwable th2) {
            com.tencent.beacon.base.util.c.a(th2);
            com.tencent.beacon.base.util.c.b("[audit] get app_last_updated_time failed!", new Object[0]);
            return "";
        }
    }

    @Override // com.tencent.beacon.base.net.c.e.a
    public void a() {
        F();
    }

    @Override // com.tencent.beacon.base.net.c.e.a
    public void b() {
        F();
    }

    public boolean c() {
        return Environment.getExternalStorageState().equals("mounted");
    }

    public String d() {
        return this.f98806c;
    }

    public int e() {
        BufferedReader bufferedReader;
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec(new String[]{"/system/bin/cat", "/sys/devices/system/cpu/cpu0/cpufreq/cpuinfo_max_freq"}).getInputStream(), Charset.forName("UTF-8")));
            try {
                String line = bufferedReader.readLine();
                int i10 = line != null ? Integer.parseInt(line.trim()) / 1000 : 0;
                com.tencent.beacon.base.util.b.a(bufferedReader);
                return i10;
            } catch (Throwable th2) {
                th = th2;
                try {
                    com.tencent.beacon.base.util.c.a(th);
                    com.tencent.beacon.base.util.b.a(bufferedReader);
                    return 0;
                } catch (Throwable th3) {
                    com.tencent.beacon.base.util.b.a(bufferedReader);
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            th = th4;
            bufferedReader = null;
        }
    }

    public String f() {
        BufferedReader bufferedReader;
        String line;
        String strTrim = "";
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec(new String[]{"/system/bin/cat", "/proc/cpuinfo"}).getInputStream(), Charset.forName("UTF-8")));
            do {
                try {
                    line = bufferedReader.readLine();
                    if (line != null) {
                    }
                    com.tencent.beacon.base.util.b.a(bufferedReader);
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        com.tencent.beacon.base.util.c.a(th);
                        com.tencent.beacon.base.util.b.a(bufferedReader);
                    } catch (Throwable th3) {
                        com.tencent.beacon.base.util.b.a(bufferedReader);
                        throw th3;
                    }
                }
                return strTrim;
            } while (!line.contains("Processor"));
            strTrim = line.substring(line.indexOf(":") + 1).trim();
            com.tencent.beacon.base.util.b.a(bufferedReader);
        } catch (Throwable th4) {
            th = th4;
            bufferedReader = null;
        }
        return strTrim;
    }

    public String g() {
        return Locale.getDefault().getCountry();
    }

    public String h() {
        return Build.HARDWARE;
    }

    public DisplayMetrics i() {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        WindowManager windowManager = (WindowManager) this.f98805b.getSystemService("window");
        if (windowManager != null) {
            windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        }
        return displayMetrics;
    }

    public long j() {
        ActivityManager activityManager = (ActivityManager) this.f98805b.getSystemService(RXScreenCaptureService.KEY_LAUNCH_ACTIVITY);
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        if (activityManager == null) {
            return -1L;
        }
        activityManager.getMemoryInfo(memoryInfo);
        return memoryInfo.availMem;
    }

    public String k() {
        long j10 = j();
        if (j10 <= 0) {
            return "0";
        }
        return ((j10 / 1024) / 1024) + "";
    }

    public boolean m() {
        return com.tencent.beacon.base.util.d.d();
    }

    public String n() {
        return Locale.getDefault().getLanguage();
    }

    public String o() {
        return Build.MANUFACTURER;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: SSATransform
        jadx.core.utils.exceptions.JadxRuntimeException: PHI empty after try-catch fix!
        	at jadx.core.dex.visitors.ssa.SSATransform.fixPhiInTryCatch(SSATransform.java:222)
        	at jadx.core.dex.visitors.ssa.SSATransform.fixLastAssignInTry(SSATransform.java:202)
        	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:58)
        	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:44)
        */
    public java.lang.String p() {
        /*
            Method dump skipped, instruction units count: 217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.beacon.a.c.e.p():java.lang.String");
    }

    public String q() {
        return this.f98809f;
    }

    public int r() {
        try {
            File[] fileArrListFiles = new File("/sys/devices/system/cpu/").listFiles(new d(this));
            if (fileArrListFiles == null) {
                return 1;
            }
            return fileArrListFiles.length;
        } catch (Exception e10) {
            com.tencent.beacon.base.util.c.b("[model] CPU Count: Failed.", new Object[0]);
            com.tencent.beacon.base.util.c.a(e10);
            return 1;
        }
    }

    public String s() {
        if (!TextUtils.isEmpty(this.f98807d)) {
            return this.f98807d;
        }
        String str = "Android " + Build.VERSION.RELEASE + ",level " + Build.VERSION.SDK;
        this.f98807d = str;
        com.tencent.beacon.base.util.c.a("[DeviceInfo] os version: %s", str);
        return this.f98807d;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0086 A[Catch: all -> 0x0082, DONT_GENERATE, TRY_LEAVE, TryCatch #1 {all -> 0x0082, blocks: (B:29:0x007e, B:33:0x0086), top: B:49:0x007e }] */
    /* JADX WARN: Code duplicated, block: B:43:0x009e A[Catch: all -> 0x009a, FINALLY_INSNS, TRY_LEAVE, TryCatch #3 {all -> 0x009a, blocks: (B:39:0x0096, B:43:0x009e), top: B:53:0x0096 }] */
    public String t() {
        BufferedReader bufferedReader;
        FileReader fileReader;
        try {
            fileReader = new FileReader("/proc/meminfo");
            try {
                bufferedReader = new BufferedReader(fileReader, 8192);
                try {
                    String line = bufferedReader.readLine();
                    if (line != null) {
                        String str = (Long.parseLong(line.split(":\\s+", 2)[1].toLowerCase().replace("kb", "").trim()) / 1024) + "";
                        try {
                            bufferedReader.close();
                            fileReader.close();
                        } catch (Throwable th2) {
                            com.tencent.beacon.base.util.c.b("[model] IO close error!", new Object[0]);
                            com.tencent.beacon.base.util.c.a(th2);
                        }
                        return str;
                    }
                    try {
                        bufferedReader.close();
                        fileReader.close();
                    } catch (Throwable th3) {
                        com.tencent.beacon.base.util.c.b("[model] IO close error!", new Object[0]);
                        com.tencent.beacon.base.util.c.a(th3);
                    }
                } catch (Throwable th4) {
                    th = th4;
                    try {
                        com.tencent.beacon.base.util.c.b("[model] get free RAM error!", new Object[0]);
                        com.tencent.beacon.base.util.c.a(th);
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                                if (fileReader != null) {
                                }
                            } catch (Throwable th5) {
                                com.tencent.beacon.base.util.c.b("[model] IO close error!", new Object[0]);
                            }
                        } else if (fileReader != null) {
                        }
                    } finally {
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                                if (fileReader != null) {
                                    fileReader.close();
                                }
                            } catch (Throwable th6) {
                                com.tencent.beacon.base.util.c.b("[model] IO close error!", new Object[0]);
                                com.tencent.beacon.base.util.c.a(th6);
                            }
                        } else if (fileReader != null) {
                            fileReader.close();
                        }
                    }
                }
            } catch (Throwable th7) {
                th = th7;
                bufferedReader = null;
            }
        } catch (Throwable th8) {
            th = th8;
            bufferedReader = null;
            fileReader = null;
        }
        return null;
    }

    public String u() {
        DisplayMetrics displayMetricsI = i();
        if (displayMetricsI == null) {
            return "";
        }
        return displayMetricsI.widthPixels + androidx.webkit.b.f28327e + displayMetricsI.heightPixels;
    }

    public String v() {
        ArrayList<String> arrayListA = com.tencent.beacon.base.util.b.a(new String[]{"/system/bin/sh", "-c", "getprop ro.build.fingerprint"});
        return (arrayListA == null || arrayListA.size() <= 0) ? "" : arrayListA.get(0);
    }

    public String w() {
        if (!TextUtils.isEmpty(this.f98808e)) {
            return this.f98808e;
        }
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        long blockSize = statFs.getBlockSize();
        this.f98808e = (((statFs.getBlockCount() * blockSize) / 1024) / 1024) + "";
        com.tencent.beacon.base.util.c.a("[DeviceInfo] Rom Size:" + this.f98808e, new Object[0]);
        return this.f98808e;
    }

    public long x() {
        if (!c()) {
            return 0L;
        }
        try {
            StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
            return ((((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize())) / 1024) / 1024;
        } catch (Throwable th2) {
            com.tencent.beacon.base.util.c.a(th2);
            return 0L;
        }
    }

    public int y() {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        WindowManager windowManager = (WindowManager) this.f98805b.getSystemService("window");
        if (windowManager != null) {
            windowManager.getDefaultDisplay().getMetrics(displayMetrics);
            double d10 = displayMetrics.density;
            if (d10 - 0.75d <= 1.0E-6d) {
                return 120;
            }
            if (d10 - 1.5d <= 1.0E-6d) {
                return 240;
            }
            if (d10 - 2.0d <= 1.0E-6d) {
                return bb.c.b.f30693i3;
            }
            if (d10 - 3.0d <= 1.0E-6d) {
                return 480;
            }
        }
        return 160;
    }

    /* JADX WARN: Code duplicated, block: B:57:0x00d6 A[Catch: all -> 0x00f0, TRY_LEAVE, TryCatch #0 {all -> 0x00f0, blocks: (B:53:0x00c9, B:55:0x00ce, B:57:0x00d6), top: B:79:0x00c9 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x00de  */
    /* JADX WARN: Code duplicated, block: B:60:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:65:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:68:0x00ed  */
    public String z() {
        String str;
        String str2;
        String str3;
        int i10;
        SensorManager sensorManager;
        int i11 = 0;
        com.tencent.beacon.base.util.c.a("[DeviceInfo] getSensor start", new Object[0]);
        StringBuilder sb2 = new StringBuilder();
        String str4 = "Y";
        String str5 = "X";
        if (Integer.parseInt(Build.VERSION.SDK) >= 10) {
            try {
                Class<?> cls = Class.forName("android.hardware.Camera");
                int iIntValue = ((Integer) cls.getMethod("getNumberOfCameras", new Class[0]).invoke(cls, new Object[0])).intValue();
                try {
                    if (iIntValue == 0) {
                        str3 = "N";
                    } else {
                        Class<?> cls2 = Class.forName("android.hardware.Camera$CameraInfo");
                        Object objNewInstance = cls2.newInstance();
                        Method method = null;
                        for (Method method2 : cls.getMethods()) {
                            try {
                                if (method2.getName().equals("getCameraInfo")) {
                                    method = method2;
                                    break;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                i10 = 0;
                                str = "X";
                                str3 = str;
                                str2 = str3;
                                com.tencent.beacon.base.util.c.b("[model] getSensor error!", new Object[i10]);
                                com.tencent.beacon.base.util.c.a(th);
                                str4 = "X";
                                str5 = str3;
                                sb2.append(str5);
                                sb2.append(str2);
                                sb2.append(str);
                                sb2.append(str4);
                                return sb2.toString();
                            }
                        }
                        Field field = cls2.getField(TECameraSettings.k.f97135a);
                        Field field2 = cls2.getField("CAMERA_FACING_BACK");
                        Field field3 = cls2.getField("CAMERA_FACING_FRONT");
                        if (method != null) {
                            int i12 = 0;
                            str3 = "X";
                            str2 = str3;
                            while (i12 < iIntValue) {
                                try {
                                    Object[] objArr = new Object[2];
                                    objArr[i11] = Integer.valueOf(i12);
                                    try {
                                        objArr[1] = objNewInstance;
                                        method.invoke(cls, objArr);
                                        int i13 = field.getInt(objNewInstance);
                                        int i14 = field2.getInt(objNewInstance);
                                        Class<?> cls3 = cls;
                                        int i15 = field3.getInt(objNewInstance);
                                        if (i13 == i14) {
                                            str3 = "Y";
                                            if (iIntValue == 1) {
                                                str2 = "N";
                                            }
                                        } else if (i13 == i15) {
                                            str2 = "Y";
                                            if (iIntValue == 1) {
                                                str3 = "N";
                                            }
                                        }
                                        i12++;
                                        cls = cls3;
                                        i11 = 0;
                                    } catch (Throwable th3) {
                                        th = th3;
                                        str = "X";
                                        i10 = 0;
                                        com.tencent.beacon.base.util.c.b("[model] getSensor error!", new Object[i10]);
                                        com.tencent.beacon.base.util.c.a(th);
                                        str4 = "X";
                                        str5 = str3;
                                        sb2.append(str5);
                                        sb2.append(str2);
                                        sb2.append(str);
                                        sb2.append(str4);
                                        return sb2.toString();
                                    }
                                } catch (Throwable th4) {
                                    th = th4;
                                    i10 = i11;
                                    str = "X";
                                    com.tencent.beacon.base.util.c.b("[model] getSensor error!", new Object[i10]);
                                    com.tencent.beacon.base.util.c.a(th);
                                    str4 = "X";
                                    str5 = str3;
                                    sb2.append(str5);
                                    sb2.append(str2);
                                    sb2.append(str);
                                    sb2.append(str4);
                                    return sb2.toString();
                                }
                            }
                            this = this;
                            sensorManager = (SensorManager) this.f98805b.getSystemService(ak.f104420ac);
                            if (sensorManager != null) {
                                if (sensorManager.getDefaultSensor(9) != null) {
                                    str = "Y";
                                } else {
                                    str = "N";
                                }
                                try {
                                    if (sensorManager.getDefaultSensor(4) == null) {
                                        str4 = "N";
                                    }
                                } catch (Throwable th5) {
                                    th = th5;
                                    i10 = 0;
                                    com.tencent.beacon.base.util.c.b("[model] getSensor error!", new Object[i10]);
                                    com.tencent.beacon.base.util.c.a(th);
                                    str4 = "X";
                                }
                            } else {
                                str4 = "X";
                                str = str4;
                            }
                            str5 = str3;
                        } else {
                            str3 = "X";
                        }
                    }
                    sensorManager = (SensorManager) this.f98805b.getSystemService(ak.f104420ac);
                    if (sensorManager != null) {
                        if (sensorManager.getDefaultSensor(9) != null) {
                            str = "Y";
                        } else {
                            str = "N";
                        }
                        if (sensorManager.getDefaultSensor(4) == null) {
                            str4 = "N";
                        }
                    } else {
                        str4 = "X";
                        str = str4;
                    }
                } catch (Throwable th6) {
                    th = th6;
                    str = "X";
                    i10 = 0;
                    com.tencent.beacon.base.util.c.b("[model] getSensor error!", new Object[i10]);
                    com.tencent.beacon.base.util.c.a(th);
                    str4 = "X";
                    str5 = str3;
                    sb2.append(str5);
                    sb2.append(str2);
                    sb2.append(str);
                    sb2.append(str4);
                    return sb2.toString();
                }
                str2 = str3;
            } catch (Throwable th7) {
                th = th7;
                str = "X";
                str3 = str;
                str2 = str3;
            }
            str5 = str3;
        } else {
            str4 = "X";
            str = str4;
            str2 = str;
        }
        sb2.append(str5);
        sb2.append(str2);
        sb2.append(str);
        sb2.append(str4);
        return sb2.toString();
    }
}
