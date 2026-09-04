package o4;

import android.app.KeyguardManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.os.SystemClock;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import androidx.core.app.o0;
import com.tencent.thumbplayer.tcmedia.core.common.TPSystemInfo;
import com.umeng.analytics.pro.ak;
import com.umeng.socialize.net.utils.SocializeProtocolConstants;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.Enumeration;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static c f132180j = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f132181a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f132182b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f132183c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f132184d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f132185e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f132186f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f132187g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f132188h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f132189i;

    public static String A() {
        String displayName;
        try {
            displayName = TimeZone.getDefault().getDisplayName(false, 0);
        } catch (Throwable unused) {
            displayName = "";
        }
        return displayName == null ? "" : displayName;
    }

    public static String B(Context context) {
        String string;
        try {
            string = Settings.Secure.getString(context.getContentResolver(), SocializeProtocolConstants.PROTOCOL_KEY_ANDROID_ID);
        } catch (Throwable unused) {
            string = "";
        }
        return string == null ? "" : string;
    }

    public static String C() {
        try {
            long jCurrentTimeMillis = System.currentTimeMillis() - SystemClock.elapsedRealtime();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(jCurrentTimeMillis - (jCurrentTimeMillis % 1000));
            return sb2.toString();
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String D(Context context) {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService(g0.a.f118921e);
            return telephonyManager != null ? String.valueOf(telephonyManager.getNetworkType()) : "";
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String E() {
        try {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(SystemClock.elapsedRealtime());
            return sb2.toString();
        } catch (Throwable unused) {
            return "";
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:18:0x001f
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1478)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    public static java.lang.String F(android.content.Context r3) {
        /*
            java.lang.String r0 = ""
            android.content.pm.ApplicationInfo r3 = r3.getApplicationInfo()
            int r3 = r3.targetSdkVersion
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L1f
            r2 = 29
            if (r1 < r2) goto Lf
            goto L1f
        Lf:
            r2 = 26
            if (r1 < r2) goto L1c
            r1 = 28
            if (r3 < r1) goto L1c
            java.lang.String r3 = o4.b.a()     // Catch: java.lang.Throwable -> L1f
            goto L20
        L1c:
            java.lang.String r3 = android.os.Build.SERIAL     // Catch: java.lang.Throwable -> L1f
            goto L20
        L1f:
            r3 = r0
        L20:
            if (r3 != 0) goto L23
            goto L24
        L23:
            r0 = r3
        L24:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o4.c.F(android.content.Context):java.lang.String");
    }

    public static String G() {
        try {
            StringBuilder sb2 = new StringBuilder();
            String[] strArr = {"/dev/qemu_pipe", "/dev/socket/qemud", "/system/lib/libc_malloc_debug_qemu.so", "/sys/qemu_trace", "/system/bin/qemu-props", "/dev/socket/genyd", "/dev/socket/baseband_genyd"};
            sb2.append(org.apache.tools.tar.c.V + ":");
            for (int i10 = 0; i10 < 7; i10++) {
                sb2.append(new File(strArr[i10]).exists() ? "1" : "0");
            }
            return sb2.toString();
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String H(Context context) {
        try {
            long jMax = 0;
            if (!((KeyguardManager) context.getSystemService("keyguard")).isKeyguardSecure()) {
                return "0:0";
            }
            String[] strArr = {"/data/system/password.key", "/data/system/gesture.key", "/data/system/gatekeeper.password.key", "/data/system/gatekeeper.gesture.key", "/data/system/gatekeeper.pattern.key"};
            for (int i10 = 0; i10 < 5; i10++) {
                long jLastModified = -1;
                try {
                    jLastModified = new File(strArr[i10]).lastModified();
                } catch (Throwable unused) {
                }
                jMax = Math.max(jLastModified, jMax);
            }
            return "1:" + jMax;
        } catch (Throwable unused2) {
            return "";
        }
    }

    public static String I() {
        String[] strArr = {"dalvik.system.Taint"};
        StringBuilder sb2 = new StringBuilder();
        sb2.append(org.apache.tools.tar.c.V);
        sb2.append(":");
        for (int i10 = 0; i10 <= 0; i10++) {
            try {
                Class.forName(strArr[0]);
                sb2.append("1");
            } catch (Throwable unused) {
                sb2.append("0");
            }
        }
        return sb2.toString();
    }

    public static String J(Context context) {
        try {
            Intent intentRegisterReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            int intExtra = intentRegisterReceiver.getIntExtra("level", -1);
            int intExtra2 = intentRegisterReceiver.getIntExtra("status", -1);
            boolean z10 = intExtra2 == 2 || intExtra2 == 5;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(z10 ? "1" : "0");
            sb2.append(":");
            sb2.append(intExtra);
            return sb2.toString();
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String K() {
        StringBuilder sb2 = new StringBuilder();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("/system/build.prop", "ro.product.name=sdk");
        linkedHashMap.put("/proc/tty/drivers", "goldfish");
        linkedHashMap.put("/proc/cpuinfo", "goldfish");
        sb2.append(org.apache.tools.tar.c.V + ":");
        for (String str : linkedHashMap.keySet()) {
            LineNumberReader lineNumberReader = null;
            char c10 = '0';
            try {
                LineNumberReader lineNumberReader2 = new LineNumberReader(new InputStreamReader(new FileInputStream(str)));
                while (true) {
                    try {
                        String line = lineNumberReader2.readLine();
                        if (line == null) {
                            break;
                        }
                        if (line.toLowerCase().contains((CharSequence) linkedHashMap.get(str))) {
                            c10 = '1';
                            break;
                        }
                    } catch (Throwable unused) {
                        lineNumberReader = lineNumberReader2;
                        sb2.append('0');
                        if (lineNumberReader != null) {
                            lineNumberReader.close();
                        }
                    }
                }
                sb2.append(c10);
                try {
                    lineNumberReader2.close();
                } catch (Throwable unused2) {
                }
            } catch (Throwable unused3) {
            }
        }
        return sb2.toString();
    }

    public static String L(Context context) {
        if (d(context, "android.permission.ACCESS_NETWORK_STATE")) {
            return "";
        }
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo == null) {
                return null;
            }
            if (activeNetworkInfo.getType() == 1) {
                return "WIFI";
            }
            if (activeNetworkInfo.getType() != 0) {
                return null;
            }
            int subtype = activeNetworkInfo.getSubtype();
            if (subtype == 4 || subtype == 1 || subtype == 2 || subtype == 7 || subtype == 11) {
                return d4.d.f108135c;
            }
            if (subtype == 3 || subtype == 5 || subtype == 6 || subtype == 8 || subtype == 9 || subtype == 10 || subtype == 12 || subtype == 14 || subtype == 15) {
                return d4.d.f108136d;
            }
            return subtype == 13 ? d4.d.f108137e : "UNKNOW";
        } catch (Throwable unused) {
            return null;
        }
    }

    public static String M() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(org.apache.tools.tar.c.V + ":");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("BRAND", "generic");
        linkedHashMap.put("BOARD", "unknown");
        linkedHashMap.put("DEVICE", "generic");
        linkedHashMap.put("HARDWARE", "goldfish");
        linkedHashMap.put("PRODUCT", "sdk");
        linkedHashMap.put("MODEL", "sdk");
        for (String str : linkedHashMap.keySet()) {
            char c10 = '0';
            try {
                String str2 = (String) Build.class.getField(str).get(null);
                String str3 = (String) linkedHashMap.get(str);
                String lowerCase = str2 != null ? str2.toLowerCase() : null;
                if (lowerCase != null && lowerCase.contains(str3)) {
                    c10 = '1';
                }
            } catch (Throwable unused) {
            }
            sb2.append(c10);
        }
        return sb2.toString();
    }

    public static String N() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(org.apache.tools.tar.c.V + ":");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("ro.hardware", "goldfish");
        linkedHashMap.put("ro.kernel.qemu", "1");
        linkedHashMap.put(TPSystemInfo.KEY_PROPERTY_DEVICE, "generic");
        linkedHashMap.put(TPSystemInfo.KEY_PROPERTY_MODEL, "sdk");
        linkedHashMap.put("ro.product.brand", "generic");
        linkedHashMap.put("ro.product.name", "sdk");
        linkedHashMap.put("ro.build.fingerprint", "test-keys");
        linkedHashMap.put(TPSystemInfo.KEY_PROPERTY_MANUFACTURER, "unknow");
        for (String str : linkedHashMap.keySet()) {
            char c10 = '0';
            String str2 = (String) linkedHashMap.get(str);
            String strE = e6.a.e(str, "");
            if (strE != null && strE.contains(str2)) {
                c10 = '1';
            }
            sb2.append(c10);
        }
        return sb2.toString();
    }

    public static String O() {
        FileReader fileReader;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader("/sys/devices/system/cpu/cpu0/cpufreq/cpuinfo_max_freq");
            try {
                BufferedReader bufferedReader2 = new BufferedReader(fileReader, 8192);
                try {
                    String line = bufferedReader2.readLine();
                    if (!e6.a.c(line)) {
                        String strTrim = line.trim();
                        try {
                            bufferedReader2.close();
                        } catch (Throwable unused) {
                        }
                        try {
                            fileReader.close();
                        } catch (Throwable unused2) {
                        }
                        return strTrim;
                    }
                    try {
                        bufferedReader2.close();
                    } catch (Throwable unused3) {
                    }
                } catch (Throwable unused4) {
                    bufferedReader = bufferedReader2;
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (Throwable unused5) {
                        }
                    }
                    if (fileReader == null) {
                        return "";
                    }
                }
            } catch (Throwable unused6) {
            }
        } catch (Throwable unused7) {
            fileReader = null;
        }
        try {
            fileReader.close();
            return "";
        } catch (Throwable unused8) {
            return "";
        }
    }

    public static String P() {
        BufferedReader bufferedReader;
        String[] strArrSplit;
        String strTrim = "";
        FileReader fileReader = null;
        try {
            FileReader fileReader2 = new FileReader("/proc/cpuinfo");
            try {
                bufferedReader = new BufferedReader(fileReader2, 8192);
                while (true) {
                    try {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            break;
                        }
                        if (!e6.a.c(line) && (strArrSplit = line.split(":")) != null && strArrSplit.length > 1 && strArrSplit[0].contains("BogoMIPS")) {
                            strTrim = strArrSplit[1].trim();
                            break;
                        }
                    } catch (Throwable unused) {
                        fileReader = fileReader2;
                        if (fileReader != null) {
                            try {
                                fileReader.close();
                            } catch (Throwable unused2) {
                            }
                        }
                        if (bufferedReader != null) {
                        }
                        return strTrim;
                    }
                }
                try {
                    fileReader2.close();
                } catch (Throwable unused3) {
                }
            } catch (Throwable unused4) {
                bufferedReader = null;
            }
        } catch (Throwable unused5) {
            bufferedReader = null;
        }
        try {
            bufferedReader.close();
        } catch (Throwable unused6) {
        }
        return strTrim;
    }

    private String Q() {
        String str;
        if (c(this.f132185e) && (str = this.f132189i) != null) {
            return str;
        }
        this.f132189i = null;
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements() && this.f132189i == null) {
                Enumeration<InetAddress> inetAddresses = networkInterfaces.nextElement().getInetAddresses();
                while (inetAddresses.hasMoreElements()) {
                    InetAddress inetAddressNextElement = inetAddresses.nextElement();
                    if (!inetAddressNextElement.isLoopbackAddress() && (inetAddressNextElement instanceof Inet4Address)) {
                        this.f132189i = inetAddressNextElement.getHostAddress().toString();
                        break;
                    }
                }
            }
        } catch (Throwable unused) {
        }
        if (this.f132189i == null) {
            this.f132189i = "";
        }
        this.f132185e = System.currentTimeMillis();
        return this.f132189i;
    }

    public static boolean c(long j10) {
        return System.currentTimeMillis() - j10 < 3600000;
    }

    public static boolean d(Context context, String str) {
        return !(context.getPackageManager().checkPermission(str, context.getPackageName()) == 0);
    }

    public static c f() {
        return f132180j;
    }

    public static String g() {
        long availableBlocks;
        try {
            StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
            availableBlocks = ((long) statFs.getAvailableBlocks()) * ((long) statFs.getBlockSize());
        } catch (Throwable unused) {
            availableBlocks = 0;
        }
        return String.valueOf(availableBlocks);
    }

    public static String i() {
        long blockSize;
        try {
            if ("mounted".equals(Environment.getExternalStorageState())) {
                StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
                blockSize = ((long) statFs.getBlockSize()) * ((long) statFs.getAvailableBlocks());
            } else {
                blockSize = 0;
            }
        } catch (Throwable unused) {
        }
        return String.valueOf(blockSize);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0062 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:56:? A[RETURN, SYNTHETIC] */
    public static String k() {
        FileInputStream fileInputStream;
        InputStreamReader inputStreamReader;
        String strTrim = "0000000000000000";
        LineNumberReader lineNumberReader = null;
        try {
            fileInputStream = new FileInputStream(new File("/proc/cpuinfo"));
            try {
                inputStreamReader = new InputStreamReader(fileInputStream);
                try {
                    LineNumberReader lineNumberReader2 = new LineNumberReader(inputStreamReader);
                    for (int i10 = 1; i10 < 100; i10++) {
                        try {
                            String line = lineNumberReader2.readLine();
                            if (line == null) {
                                break;
                            }
                            if (line.indexOf("Serial") >= 0) {
                                strTrim = line.substring(line.indexOf(":") + 1, line.length()).trim();
                                break;
                            }
                        } catch (Throwable unused) {
                            lineNumberReader = lineNumberReader2;
                            if (lineNumberReader != null) {
                                try {
                                    lineNumberReader.close();
                                } catch (Throwable unused2) {
                                }
                            }
                            if (inputStreamReader != null) {
                                try {
                                    inputStreamReader.close();
                                } catch (Throwable unused3) {
                                }
                            }
                            if (fileInputStream != null) {
                            }
                            if (strTrim == null) {
                                return "";
                            }
                            return strTrim;
                        }
                    }
                    try {
                        lineNumberReader2.close();
                    } catch (Throwable unused4) {
                    }
                    try {
                        inputStreamReader.close();
                    } catch (Throwable unused5) {
                    }
                } catch (Throwable unused6) {
                }
            } catch (Throwable unused7) {
                inputStreamReader = null;
            }
        } catch (Throwable unused8) {
            fileInputStream = null;
            inputStreamReader = null;
        }
        try {
            fileInputStream.close();
        } catch (Throwable unused9) {
        }
        if (strTrim == null) {
            return "";
        }
        return strTrim;
    }

    public static String l(Context context) {
        int i10 = 0;
        try {
            i10 = Settings.System.getInt(context.getContentResolver(), "airplane_mode_on", 0);
        } catch (Throwable unused) {
        }
        return i10 == 1 ? "1" : "0";
    }

    public static String m() {
        String strO = O();
        return !e6.a.c(strO) ? strO : P();
    }

    public static String n(Context context) {
        JSONObject jSONObject = new JSONObject();
        try {
            AudioManager audioManager = (AudioManager) context.getSystemService("audio");
            int i10 = audioManager.getRingerMode() == 0 ? 1 : 0;
            int streamVolume = audioManager.getStreamVolume(0);
            int streamVolume2 = audioManager.getStreamVolume(1);
            int streamVolume3 = audioManager.getStreamVolume(2);
            int streamVolume4 = audioManager.getStreamVolume(3);
            int streamVolume5 = audioManager.getStreamVolume(4);
            jSONObject.put("ringermode", String.valueOf(i10));
            jSONObject.put("call", String.valueOf(streamVolume));
            jSONObject.put("system", String.valueOf(streamVolume2));
            jSONObject.put("ring", String.valueOf(streamVolume3));
            jSONObject.put("music", String.valueOf(streamVolume4));
            jSONObject.put(o0.K0, String.valueOf(streamVolume5));
        } catch (Throwable unused) {
        }
        return jSONObject.toString();
    }

    public static String o() {
        BufferedReader bufferedReader;
        FileReader fileReader = null;
        try {
            FileReader fileReader2 = new FileReader("/proc/cpuinfo");
            try {
                bufferedReader = new BufferedReader(fileReader2);
                try {
                    String[] strArrSplit = bufferedReader.readLine().split(":\\s+", 2);
                    if (strArrSplit != null && strArrSplit.length > 1) {
                        String str = strArrSplit[1];
                        try {
                            fileReader2.close();
                        } catch (Throwable unused) {
                        }
                        try {
                            bufferedReader.close();
                        } catch (Throwable unused2) {
                        }
                        return str;
                    }
                    try {
                        fileReader2.close();
                    } catch (Throwable unused3) {
                    }
                } catch (Throwable unused4) {
                    fileReader = fileReader2;
                    if (fileReader != null) {
                        try {
                            fileReader.close();
                        } catch (Throwable unused5) {
                        }
                    }
                    if (bufferedReader == null) {
                        return "";
                    }
                }
            } catch (Throwable unused6) {
                bufferedReader = null;
            }
        } catch (Throwable unused7) {
            bufferedReader = null;
        }
        try {
            bufferedReader.close();
            return "";
        } catch (Throwable unused8) {
            return "";
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0011  */
    public static String p(Context context) {
        String networkOperatorName;
        if (context != null) {
            try {
                TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService(g0.a.f118921e);
                if (telephonyManager != null) {
                    networkOperatorName = telephonyManager.getNetworkOperatorName();
                } else {
                    networkOperatorName = null;
                }
            } catch (Throwable unused) {
            }
        } else {
            networkOperatorName = null;
        }
        return (networkOperatorName == null || "null".equals(networkOperatorName)) ? "" : networkOperatorName;
    }

    public static String q() {
        BufferedReader bufferedReader;
        FileReader fileReader = null;
        long j10 = 0;
        try {
            FileReader fileReader2 = new FileReader("/proc/meminfo");
            try {
                bufferedReader = new BufferedReader(fileReader2, 8192);
                try {
                    String line = bufferedReader.readLine();
                    j10 = line != null ? Integer.parseInt(line.split("\\s+")[1]) : 0L;
                    try {
                        fileReader2.close();
                    } catch (Throwable unused) {
                    }
                } catch (Throwable unused2) {
                    fileReader = fileReader2;
                    if (fileReader != null) {
                        try {
                            fileReader.close();
                        } catch (Throwable unused3) {
                        }
                    }
                    if (bufferedReader != null) {
                    }
                    return String.valueOf(j10);
                }
            } catch (Throwable unused4) {
                bufferedReader = null;
            }
        } catch (Throwable unused5) {
            bufferedReader = null;
        }
        try {
            bufferedReader.close();
        } catch (Throwable unused6) {
        }
        return String.valueOf(j10);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x004d  */
    public static String r(Context context) {
        List<Sensor> sensorList;
        String strI;
        if (context != null) {
            try {
                SensorManager sensorManager = (SensorManager) context.getSystemService(ak.f104420ac);
                if (sensorManager == null || (sensorList = sensorManager.getSensorList(-1)) == null || sensorList.size() <= 0) {
                    strI = null;
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    for (Sensor sensor : sensorList) {
                        sb2.append(sensor.getName());
                        sb2.append(sensor.getVersion());
                        sb2.append(sensor.getVendor());
                    }
                    strI = e6.a.i(sb2.toString());
                }
            } catch (Throwable unused) {
            }
        } else {
            strI = null;
        }
        return strI == null ? "" : strI;
    }

    public static String s() {
        long blockCount;
        try {
            StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
            blockCount = ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize());
        } catch (Throwable unused) {
            blockCount = 0;
        }
        return String.valueOf(blockCount);
    }

    public static String t(Context context) {
        List<Sensor> sensorList;
        JSONArray jSONArray = new JSONArray();
        if (context != null) {
            try {
                SensorManager sensorManager = (SensorManager) context.getSystemService(ak.f104420ac);
                if (sensorManager != null && (sensorList = sensorManager.getSensorList(-1)) != null && sensorList.size() > 0) {
                    for (Sensor sensor : sensorList) {
                        if (sensor != null) {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("name", sensor.getName());
                            jSONObject.put("version", sensor.getVersion());
                            jSONObject.put("vendor", sensor.getVendor());
                            jSONArray.put(jSONObject);
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return jSONArray.toString();
    }

    public static String u() {
        long blockSize;
        try {
            if ("mounted".equals(Environment.getExternalStorageState())) {
                StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
                blockSize = ((long) statFs.getBlockSize()) * ((long) statFs.getBlockCount());
            } else {
                blockSize = 0;
            }
        } catch (Throwable unused) {
        }
        return String.valueOf(blockSize);
    }

    public static String v(Context context) {
        try {
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            return Integer.toString(displayMetrics.widthPixels) + androidx.webkit.b.f28327e + Integer.toString(displayMetrics.heightPixels);
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String w() {
        String str;
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            str = (String) cls.getMethod("get", String.class, String.class).invoke(cls.newInstance(), "gsm.version.baseband", "no message");
        } catch (Throwable unused) {
            str = "";
        }
        return str == null ? "" : str;
    }

    public static String x(Context context) {
        try {
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(displayMetrics.widthPixels);
            return sb2.toString();
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String y() {
        String string;
        try {
            string = Locale.getDefault().toString();
        } catch (Throwable unused) {
            string = "";
        }
        return string == null ? "" : string;
    }

    public static String z(Context context) {
        try {
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(displayMetrics.heightPixels);
            return sb2.toString();
        } catch (Throwable unused) {
            return "";
        }
    }

    public final String a() {
        try {
            return String.valueOf(new File("/sys/devices/system/cpu/").listFiles(new d(this)).length);
        } catch (Throwable unused) {
            return "1";
        }
    }

    public final synchronized String b(Context context) {
        String str;
        if (c(this.f132182b) && (str = this.f132187g) != null) {
            return str;
        }
        if (d(context, "android.permission.READ_PHONE_STATE")) {
            return "";
        }
        if (context != null) {
            try {
                TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService(g0.a.f118921e);
                if (telephonyManager != null) {
                    this.f132187g = telephonyManager.getDeviceId();
                }
            } catch (Throwable unused) {
            }
        }
        if (this.f132187g == null) {
            this.f132187g = "";
        }
        this.f132182b = System.currentTimeMillis();
        return this.f132187g;
    }

    public final synchronized String e(Context context) {
        String str;
        if (c(this.f132181a) && (str = this.f132186f) != null) {
            return str;
        }
        if (d(context, "android.permission.READ_PHONE_STATE")) {
            return "";
        }
        if (context != null) {
            try {
                TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService(g0.a.f118921e);
                if (telephonyManager != null) {
                    this.f132186f = telephonyManager.getSubscriberId();
                }
            } catch (Throwable unused) {
            }
        }
        if (this.f132186f == null) {
            this.f132186f = "";
        }
        this.f132181a = System.currentTimeMillis();
        return this.f132186f;
    }

    public final synchronized String h(Context context) {
        String str;
        if (c(this.f132183c) && (str = this.f132188h) != null) {
            return str;
        }
        if (d(context, "android.permission.READ_PHONE_STATE")) {
            return "";
        }
        try {
            String simSerialNumber = ((TelephonyManager) context.getSystemService(g0.a.f118921e)).getSimSerialNumber();
            this.f132188h = simSerialNumber;
            if (simSerialNumber == null || simSerialNumber.length() == 0) {
                this.f132188h = "";
            }
        } catch (Throwable unused) {
        }
        this.f132183c = System.currentTimeMillis();
        return this.f132188h;
    }

    public final String j(Context context) {
        try {
            String strL = L(context);
            String strQ = Q();
            if (e6.a.f(strL) && e6.a.f(strQ)) {
                return strL + ":" + Q();
            }
        } catch (Throwable unused) {
        }
        return "";
    }
}
