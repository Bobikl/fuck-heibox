package com.alipay.deviceid.module.x;

import android.app.KeyguardManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.os.SystemClock;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import androidx.core.app.o0;
import com.tencent.thumbplayer.tcmedia.core.common.TPSystemInfo;
import com.umeng.socialize.net.utils.SocializeProtocolConstants;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: DeviceInfo.java */
/* JADX INFO: loaded from: classes6.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static k f38345a = new k();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static long f38346b = 0;

    /* JADX INFO: compiled from: DeviceInfo.java */
    public final class a implements FileFilter {
        a() {
        }

        @Override // java.io.FileFilter
        public final boolean accept(File file) {
            return Pattern.matches("cpu[0-9]+", file.getName());
        }
    }

    private k() {
    }

    public static k a() {
        return f38345a;
    }

    public static String a(Context context) {
        String deviceId = null;
        if (context != null) {
            try {
                TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService(g0.a.f118921e);
                if (telephonyManager != null) {
                    deviceId = telephonyManager.getDeviceId();
                }
            } catch (Exception unused) {
            }
        }
        return deviceId == null ? "" : deviceId;
    }

    public static String b() {
        HashSet<String> hashSet = new HashSet();
        String[] strArr = {"CPU_ABI", "CPU_ABI2", "SUPPORTED_ABIS", "SUPPORTED_32_BIT_ABIS", "SUPPORTED_64_BIT_ABIS"};
        for (int i10 = 0; i10 < 5; i10++) {
            try {
                String str = (String) Build.class.getField(strArr[i10]).get(null);
                if (str != null && str.length() > 0 && !hashSet.contains(str)) {
                    hashSet.add(str);
                }
            } catch (Exception unused) {
            }
        }
        JSONArray jSONArray = new JSONArray();
        for (String str2 : hashSet) {
            if (str2 != null) {
                try {
                    if (str2.length() > 0) {
                        jSONArray.put(str2);
                    }
                } catch (Exception unused2) {
                }
            }
        }
        try {
            return jSONArray.toString();
        } catch (Exception unused3) {
            return "";
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0013  */
    public static String b(Context context) {
        String subscriberId;
        if (context != null) {
            try {
                TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService(g0.a.f118921e);
                if (telephonyManager != null) {
                    subscriberId = telephonyManager.getSubscriberId();
                } else {
                    subscriberId = "";
                }
            } catch (Exception unused) {
            }
        } else {
            subscriberId = "";
        }
        return subscriberId == null ? "" : subscriberId;
    }

    public static String c() {
        long availableBlocks;
        try {
            StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
            availableBlocks = ((long) statFs.getAvailableBlocks()) * ((long) statFs.getBlockSize());
        } catch (Exception unused) {
            availableBlocks = 0;
        }
        return String.valueOf(availableBlocks);
    }

    public static String c(Context context) {
        int i10 = 0;
        try {
            i10 = Settings.System.getInt(context.getContentResolver(), "airplane_mode_on", 0);
        } catch (Exception unused) {
        }
        return i10 == 1 ? "1" : "0";
    }

    public static String d() {
        long blockSize = 0;
        try {
            if ("mounted".equals(Environment.getExternalStorageState())) {
                StatFs statFs = new StatFs(e.a().getPath());
                blockSize = ((long) statFs.getBlockSize()) * ((long) statFs.getAvailableBlocks());
            }
        } catch (Exception unused) {
        }
        return String.valueOf(blockSize);
    }

    public static String d(Context context) {
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
        } catch (Exception unused) {
        }
        return jSONObject.toString();
    }

    /* JADX WARN: Code duplicated, block: B:45:0x007e A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:83:? A[RETURN, SYNTHETIC] */
    public static String e() throws Throwable {
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
                        } catch (Exception unused) {
                            lineNumberReader = lineNumberReader2;
                            if (lineNumberReader != null) {
                                try {
                                    lineNumberReader.close();
                                } catch (Exception unused2) {
                                }
                            }
                            if (inputStreamReader != null) {
                                try {
                                    inputStreamReader.close();
                                } catch (Exception unused3) {
                                }
                            }
                            if (fileInputStream != null) {
                            }
                            if (strTrim == null) {
                                return "";
                            }
                            return strTrim;
                        } catch (Throwable th2) {
                            th = th2;
                            lineNumberReader = lineNumberReader2;
                            if (lineNumberReader != null) {
                                try {
                                    lineNumberReader.close();
                                } catch (Exception unused4) {
                                }
                            }
                            if (inputStreamReader != null) {
                                try {
                                    inputStreamReader.close();
                                } catch (Exception unused5) {
                                }
                            }
                            if (fileInputStream == null) {
                                throw th;
                            }
                            try {
                                fileInputStream.close();
                                throw th;
                            } catch (Exception unused6) {
                                throw th;
                            }
                        }
                    }
                    try {
                        lineNumberReader2.close();
                    } catch (Exception unused7) {
                    }
                    try {
                        inputStreamReader.close();
                    } catch (Exception unused8) {
                    }
                } catch (Exception unused9) {
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (Exception unused10) {
                inputStreamReader = null;
            } catch (Throwable th4) {
                th = th4;
                inputStreamReader = null;
            }
        } catch (Exception unused11) {
            fileInputStream = null;
            inputStreamReader = null;
        } catch (Throwable th5) {
            th = th5;
            fileInputStream = null;
            inputStreamReader = null;
        }
        try {
            fileInputStream.close();
        } catch (Exception unused12) {
        }
        if (strTrim == null) {
            return "";
        }
        return strTrim;
    }

    public static String e(Context context) {
        String networkOperatorName = null;
        if (context != null) {
            try {
                TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService(g0.a.f118921e);
                if (telephonyManager != null) {
                    networkOperatorName = telephonyManager.getNetworkOperatorName();
                }
            } catch (Exception unused) {
            }
        }
        return (networkOperatorName == null || "null".equals(networkOperatorName)) ? "" : networkOperatorName;
    }

    public static String f(Context context) {
        List<Sensor> sensorList;
        String strD = null;
        if (context != null) {
            try {
                SensorManager sensorManager = (SensorManager) context.getSystemService(com.umeng.analytics.pro.ak.f104420ac);
                if (sensorManager != null && (sensorList = sensorManager.getSensorList(-1)) != null && sensorList.size() > 0) {
                    StringBuilder sb2 = new StringBuilder();
                    for (Sensor sensor : sensorList) {
                        sb2.append(sensor.getName());
                        sb2.append(sensor.getVersion());
                        sb2.append(sensor.getVendor());
                    }
                    strD = e.d(sb2.toString());
                }
            } catch (Exception unused) {
            }
        }
        return strD == null ? "" : strD;
    }

    public static String g() {
        return "";
    }

    public static String g(Context context) {
        List<Sensor> sensorList;
        JSONArray jSONArray = new JSONArray();
        if (context != null) {
            try {
                SensorManager sensorManager = (SensorManager) context.getSystemService(com.umeng.analytics.pro.ak.f104420ac);
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
            } catch (Exception unused) {
            }
        }
        return jSONArray.toString();
    }

    public static String h() throws Throwable {
        FileReader fileReader;
        Throwable th2;
        BufferedReader bufferedReader;
        FileReader fileReader2 = null;
        long j10 = 0;
        try {
            fileReader = new FileReader("/proc/meminfo");
            try {
                bufferedReader = new BufferedReader(fileReader, 8192);
                try {
                    String line = bufferedReader.readLine();
                    j10 = line != null ? Integer.parseInt(line.split("\\s+")[1]) : 0L;
                    try {
                        fileReader.close();
                    } catch (Exception unused) {
                    }
                } catch (Exception unused2) {
                    fileReader2 = fileReader;
                    if (fileReader2 != null) {
                        try {
                            fileReader2.close();
                        } catch (Exception unused3) {
                        }
                    }
                    if (bufferedReader != null) {
                    }
                    return String.valueOf(j10);
                } catch (Throwable th3) {
                    th2 = th3;
                    if (fileReader != null) {
                        try {
                            fileReader.close();
                        } catch (Exception unused4) {
                        }
                    }
                    if (bufferedReader == null) {
                        throw th2;
                    }
                    try {
                        bufferedReader.close();
                        throw th2;
                    } catch (Exception unused5) {
                        throw th2;
                    }
                }
            } catch (Exception unused6) {
                bufferedReader = null;
            } catch (Throwable th4) {
                th2 = th4;
                bufferedReader = null;
            }
        } catch (Exception unused7) {
            bufferedReader = null;
        } catch (Throwable th5) {
            fileReader = null;
            th2 = th5;
            bufferedReader = null;
        }
        try {
            bufferedReader.close();
        } catch (Exception unused8) {
        }
        return String.valueOf(j10);
    }

    public static String h(Context context) {
        try {
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            return Integer.toString(displayMetrics.widthPixels) + androidx.webkit.b.f28327e + Integer.toString(displayMetrics.heightPixels);
        } catch (Exception unused) {
            return "";
        }
    }

    public static String i() {
        long blockCount;
        try {
            StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
            blockCount = ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize());
        } catch (Exception unused) {
            blockCount = 0;
        }
        return String.valueOf(blockCount);
    }

    public static String i(Context context) {
        try {
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(displayMetrics.widthPixels);
            return sb2.toString();
        } catch (Exception unused) {
            return "";
        }
    }

    public static String j() {
        long blockSize = 0;
        try {
            if ("mounted".equals(Environment.getExternalStorageState())) {
                StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
                blockSize = ((long) statFs.getBlockSize()) * ((long) statFs.getBlockCount());
            }
        } catch (Exception unused) {
        }
        return String.valueOf(blockSize);
    }

    public static String j(Context context) {
        try {
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(displayMetrics.heightPixels);
            return sb2.toString();
        } catch (Exception unused) {
            return "";
        }
    }

    public static String k() {
        String str;
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            str = (String) cls.getMethod("get", String.class, String.class).invoke(cls.newInstance(), "gsm.version.baseband", "no message");
        } catch (Exception unused) {
            str = "";
        }
        return str == null ? "" : str;
    }

    public static String k(Context context) {
        try {
            String macAddress = ((WifiManager) context.getSystemService("wifi")).getConnectionInfo().getMacAddress();
            if (macAddress != null) {
                try {
                    if (macAddress.length() != 0 && !"02:00:00:00:00:00".equals(macAddress)) {
                        return macAddress;
                    }
                } catch (Exception unused) {
                    return macAddress;
                }
            }
            return v();
        } catch (Exception unused2) {
            return "";
        }
    }

    public static String l() {
        String str;
        try {
            str = Build.SERIAL;
        } catch (Exception unused) {
            str = "";
        }
        return str == null ? "" : str;
    }

    public static String l(Context context) {
        try {
            String simSerialNumber = ((TelephonyManager) context.getSystemService(g0.a.f118921e)).getSimSerialNumber();
            if (simSerialNumber == null) {
                return "";
            }
            try {
                if (simSerialNumber.length() == 0) {
                    return "";
                }
            } catch (Exception unused) {
            }
            return simSerialNumber;
        } catch (Exception unused2) {
            return "";
        }
    }

    public static String m() {
        String string;
        try {
            string = Locale.getDefault().toString();
        } catch (Exception unused) {
            string = "";
        }
        return string == null ? "" : string;
    }

    public static String m(Context context) {
        String string;
        try {
            string = Settings.Secure.getString(context.getContentResolver(), SocializeProtocolConstants.PROTOCOL_KEY_ANDROID_ID);
        } catch (Exception unused) {
            string = "";
        }
        return string == null ? "" : string;
    }

    public static String n() {
        String displayName;
        try {
            displayName = TimeZone.getDefault().getDisplayName(false, 0);
        } catch (Exception unused) {
            displayName = "";
        }
        return displayName == null ? "" : displayName;
    }

    public static String n(Context context) {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService(g0.a.f118921e);
            return telephonyManager != null ? String.valueOf(telephonyManager.getNetworkType()) : "";
        } catch (Exception unused) {
            return "";
        }
    }

    public static long o() {
        try {
            if (f38346b == 0) {
                f38346b = System.currentTimeMillis() - SystemClock.elapsedRealtime();
            }
        } catch (Exception unused) {
        }
        return f38346b;
    }

    public static String o(Context context) {
        String bssid;
        try {
            WifiManager wifiManager = (WifiManager) context.getSystemService("wifi");
            bssid = wifiManager.isWifiEnabled() ? wifiManager.getConnectionInfo().getBSSID() : "";
        } catch (Throwable unused) {
        }
        return bssid == null ? "" : bssid;
    }

    public static String p() {
        try {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(SystemClock.elapsedRealtime());
            return sb2.toString();
        } catch (Exception unused) {
            return "";
        }
    }

    public static String p(Context context) {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            String str = null;
            if (activeNetworkInfo != null) {
                if (activeNetworkInfo.getType() == 1) {
                    str = "WIFI";
                } else if (activeNetworkInfo.getType() == 0) {
                    int subtype = activeNetworkInfo.getSubtype();
                    if (subtype == 4 || subtype == 1 || subtype == 2 || subtype == 7 || subtype == 11) {
                        str = d4.d.f108135c;
                    } else if (subtype == 3 || subtype == 5 || subtype == 6 || subtype == 8 || subtype == 9 || subtype == 10 || subtype == 12 || subtype == 14 || subtype == 15) {
                        str = d4.d.f108136d;
                    } else {
                        str = subtype == 13 ? d4.d.f108137e : "UNKNOW";
                    }
                }
            }
            String strW = w();
            if (!e.b(str) || !e.b(strW)) {
                return "";
            }
            return str + ":" + w();
        } catch (Exception unused) {
            return "";
        }
    }

    public static String q() {
        try {
            StringBuilder sb2 = new StringBuilder();
            String[] strArr = {"/dev/qemu_pipe", "/dev/socket/qemud", "/system/lib/libc_malloc_debug_qemu.so", "/sys/qemu_trace", "/system/bin/qemu-props", "/dev/socket/genyd", "/dev/socket/baseband_genyd"};
            sb2.append(org.apache.tools.tar.c.V + ":");
            for (int i10 = 0; i10 < 7; i10++) {
                if (new File(strArr[i10]).exists()) {
                    sb2.append("1");
                } else {
                    sb2.append("0");
                }
            }
            return sb2.toString();
        } catch (Exception unused) {
            return "";
        }
    }

    public static String q(Context context) {
        if (!((KeyguardManager) context.getSystemService("keyguard")).isKeyguardSecure()) {
            return "0:0";
        }
        String[] strArr = {"/data/system/password.key", "/data/system/gesture.key", "/data/system/gatekeeper.password.key", "/data/system/gatekeeper.gesture.key", "/data/system/gatekeeper.pattern.key"};
        long jMax = 0;
        for (int i10 = 0; i10 < 5; i10++) {
            long jLastModified = -1;
            try {
                jLastModified = new File(strArr[i10]).lastModified();
            } catch (Exception unused) {
            }
            jMax = Math.max(jLastModified, jMax);
        }
        return "1:" + jMax;
    }

    public static String r() {
        String[] strArr = {"dalvik.system.Taint"};
        StringBuilder sb2 = new StringBuilder();
        sb2.append(org.apache.tools.tar.c.V);
        sb2.append(":");
        for (int i10 = 0; i10 <= 0; i10++) {
            try {
                Class.forName(strArr[0]);
                sb2.append("1");
            } catch (Exception unused) {
                sb2.append("0");
            }
        }
        return sb2.toString();
    }

    public static String r(Context context) {
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
        } catch (Exception unused) {
            return "";
        }
    }

    public static String s() throws Throwable {
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
                    } catch (Exception unused) {
                        lineNumberReader = lineNumberReader2;
                        sb2.append('0');
                        if (lineNumberReader != null) {
                            lineNumberReader.close();
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        lineNumberReader = lineNumberReader2;
                        sb2.append('0');
                        if (lineNumberReader != null) {
                            try {
                                lineNumberReader.close();
                            } catch (Exception unused2) {
                            }
                        }
                        throw th;
                    }
                }
                sb2.append(c10);
                try {
                    lineNumberReader2.close();
                } catch (Exception unused3) {
                }
            } catch (Exception unused4) {
            } catch (Throwable th3) {
                th = th3;
            }
        }
        return sb2.toString();
    }

    public static String t() {
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
            } catch (Exception unused) {
            } finally {
                sb2.append('0');
            }
        }
        return sb2.toString();
    }

    public static String u() {
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
            String strB = e.b(str, "");
            if (strB != null && strB.contains(str2)) {
                c10 = '1';
            }
            sb2.append(c10);
        }
        return sb2.toString();
    }

    private static String v() {
        try {
            ArrayList<NetworkInterface> list = Collections.list(NetworkInterface.getNetworkInterfaces());
            if (list == null) {
                return "02:00:00:00:00:00";
            }
            for (NetworkInterface networkInterface : list) {
                if (networkInterface != null && networkInterface.getName() != null && networkInterface.getName().equalsIgnoreCase("wlan0")) {
                    byte[] hardwareAddress = networkInterface.getHardwareAddress();
                    if (hardwareAddress == null) {
                        return "02:00:00:00:00:00";
                    }
                    StringBuilder sb2 = new StringBuilder();
                    for (byte b10 : hardwareAddress) {
                        sb2.append(String.format("%02X:", Integer.valueOf(b10 & 255)));
                    }
                    if (sb2.length() > 0) {
                        sb2.deleteCharAt(sb2.length() - 1);
                    }
                    return sb2.toString();
                }
            }
            return "02:00:00:00:00:00";
        } catch (Exception unused) {
            return "02:00:00:00:00:00";
        }
    }

    private static String w() {
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                Enumeration<InetAddress> inetAddresses = networkInterfaces.nextElement().getInetAddresses();
                while (inetAddresses.hasMoreElements()) {
                    InetAddress inetAddressNextElement = inetAddresses.nextElement();
                    if (!inetAddressNextElement.isLoopbackAddress() && (inetAddressNextElement instanceof Inet4Address)) {
                        return inetAddressNextElement.getHostAddress().toString();
                    }
                }
            }
            return "";
        } catch (Exception unused) {
            return "";
        }
    }

    public final String f() {
        try {
            return String.valueOf(new File("/sys/devices/system/cpu/").listFiles(new a()).length);
        } catch (Exception unused) {
            return "1";
        }
    }
}
