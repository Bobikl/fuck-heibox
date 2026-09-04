package com.bytedance.realx.base;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.Locale;
import java.util.Scanner;
import java.util.regex.MatchResult;

/* JADX INFO: loaded from: classes6.dex */
public class RXDeviceInfoAndroid {
    public static final int BUFFER_SIZE = 8192;
    private static final FileFilter CPU_FILTER = new FileFilter() { // from class: com.bytedance.realx.base.RXDeviceInfoAndroid.1
        @Override // java.io.FileFilter
        public boolean accept(File file) {
            String name = file.getName();
            if (!name.startsWith(ak.f104463w)) {
                return false;
            }
            for (int i10 = 3; i10 < name.length(); i10++) {
                if (!Character.isDigit(name.charAt(i10))) {
                    return false;
                }
            }
            return true;
        }
    };
    private static final String CPU_MANUFACTURER_PATTERN = "Hardware[\\s]*:[\\s]*([\\S\\s]*)\n";
    public static final int DEVICE_INFO_UNKNOWN = -1;
    private static final int ERROR_RESULT = -1;
    private static final String MEMORY_INFO_PATH = "/proc/meminfo";
    public static final String MEMTOTAL_PATTERN = "MemTotal[\\s]*:[\\s]*(\\d+)[\\s]*kB\n";
    private static String RomVersion = "";
    private static final String TAG = "DeviceInfo";
    private static String sCpuModel = "";

    /* JADX WARN: Code duplicated, block: B:66:0x011b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x00fe A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:? A[SYNTHETIC] */
    public static String GetCpuModel() throws Throwable {
        Process processStart;
        StringBuilder sb2;
        if (!sCpuModel.isEmpty()) {
            return sCpuModel;
        }
        String strGroup = "";
        InputStream inputStream = null;
        try {
            processStart = new ProcessBuilder("/system/bin/cat", "/proc/cpuinfo").start();
            try {
                try {
                    inputStream = processStart.getInputStream();
                    if (inputStream != null) {
                        Scanner scanner = new Scanner(inputStream, "UTF-8");
                        if (scanner.findWithinHorizon(CPU_MANUFACTURER_PATTERN, 3000) != null) {
                            MatchResult matchResultMatch = scanner.match();
                            if (matchResultMatch.groupCount() > 0) {
                                try {
                                    strGroup = matchResultMatch.group(1);
                                } catch (NumberFormatException e10) {
                                    Log.i(TAG, "GetCpuModel NumberFormatException:" + e10.getMessage());
                                }
                            }
                        }
                        scanner.close();
                    }
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (Exception e11) {
                            Log.i(TAG, "GetCpuModel close input stream fail:" + e11.getMessage());
                        }
                    }
                    try {
                        processStart.destroy();
                    } catch (Exception e12) {
                        e = e12;
                        sb2 = new StringBuilder();
                        sb2.append("GetCpuModel close process fail:");
                        sb2.append(e.getMessage());
                        Log.i(TAG, sb2.toString());
                    }
                } catch (IOException e13) {
                    e = e13;
                    Log.i(TAG, "GetCpuModel IOException:" + e.getMessage());
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (Exception e14) {
                            Log.i(TAG, "GetCpuModel close input stream fail:" + e14.getMessage());
                        }
                    }
                    if (processStart != null) {
                        try {
                            processStart.destroy();
                        } catch (Exception e15) {
                            e = e15;
                            sb2 = new StringBuilder();
                            sb2.append("GetCpuModel close process fail:");
                            sb2.append(e.getMessage());
                            Log.i(TAG, sb2.toString());
                        }
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (Exception e16) {
                        Log.i(TAG, "GetCpuModel close input stream fail:" + e16.getMessage());
                    }
                }
                if (processStart != null) {
                    throw th;
                }
                try {
                    processStart.destroy();
                    throw th;
                } catch (Exception e17) {
                    Log.i(TAG, "GetCpuModel close process fail:" + e17.getMessage());
                    throw th;
                }
            }
        } catch (IOException e18) {
            e = e18;
            processStart = null;
        } catch (Throwable th3) {
            th = th3;
            processStart = null;
            if (inputStream != null) {
                inputStream.close();
            }
            if (processStart != null) {
                throw th;
            }
            processStart.destroy();
            throw th;
        }
        if (strGroup.isEmpty() && Build.VERSION.SDK_INT >= 31) {
            strGroup = Build.SOC_MODEL;
        }
        sCpuModel = strGroup;
        return strGroup;
    }

    public static String GetDeviceBrand() {
        String str = Build.MANUFACTURER;
        return str == null ? "" : str;
    }

    public static String GetDeviceModel() {
        String str = Build.MODEL;
        return str == null ? "" : str;
    }

    private static int extractValue(byte[] bArr, int i10) {
        byte b10;
        while (i10 < bArr.length && (b10 = bArr[i10]) != 10) {
            if (Character.isDigit(b10)) {
                int i11 = i10 + 1;
                while (i11 < bArr.length && Character.isDigit(bArr[i11])) {
                    i11++;
                }
                return Integer.parseInt(new String(bArr, 0, i10, i11 - i10));
            }
            i10++;
        }
        return -1;
    }

    public static String getAndroidBuildId() {
        return Build.ID;
    }

    public static String getAppRootPath() {
        try {
            Context applicationContext = ContextUtils.getApplicationContext();
            return applicationContext == null ? "" : applicationContext.getFilesDir().getAbsolutePath();
        } catch (Exception e10) {
            e10.printStackTrace();
            return "";
        }
    }

    public static String getBrand() {
        return Build.BRAND;
    }

    public static String getBuildRelease() {
        return Build.VERSION.RELEASE;
    }

    public static String getBuildType() {
        return Build.TYPE;
    }

    public static int getCPUMaxFrequency() {
        int i10 = -1;
        int iIntValue = -1;
        for (int i11 = 0; i11 < getNumberOfCPUCores(); i11++) {
            try {
                File file = new File("/sys/devices/system/cpu/cpu" + i11 + "/cpufreq/cpuinfo_max_freq");
                if (file.exists() && file.canRead()) {
                    byte[] bArr = new byte[128];
                    FileInputStream fileInputStream = new FileInputStream(file);
                    try {
                        try {
                            int i12 = fileInputStream.read(bArr);
                            if (i12 == -1 || i12 > 128) {
                                throw new NumberFormatException();
                            }
                            int i13 = 0;
                            while (Character.isDigit(bArr[i13]) && i13 < 128) {
                                i13++;
                            }
                            Integer numValueOf = Integer.valueOf(Integer.parseInt(new String(bArr, 0, i13, "UTF-8")));
                            if (numValueOf.intValue() > iIntValue) {
                                iIntValue = numValueOf.intValue();
                            }
                        } catch (NumberFormatException e10) {
                            Log.e(TAG, "getCPUMaxFrequency failed!", e10);
                        }
                        fileInputStream.close();
                    } catch (Throwable th2) {
                        fileInputStream.close();
                        throw th2;
                    }
                }
            } catch (IOException unused) {
            }
        }
        if (iIntValue == -1) {
            FileInputStream fileInputStream2 = new FileInputStream("/proc/cpuinfo");
            try {
                int fileForValue = parseFileForValue("cpu MHz", fileInputStream2) * 1000;
                if (fileForValue > iIntValue) {
                    iIntValue = fileForValue;
                }
                fileInputStream2.close();
            } catch (Throwable th3) {
                fileInputStream2.close();
                throw th3;
            }
        }
        i10 = iIntValue;
        return i10 / 1000;
    }

    private static int getCoresFromFileInfo(String str) throws Throwable {
        FileInputStream fileInputStream = null;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(str);
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream2, "UTF-8"));
                String line = bufferedReader.readLine();
                bufferedReader.close();
                int coresFromFileString = getCoresFromFileString(line);
                try {
                    fileInputStream2.close();
                } catch (IOException unused) {
                }
                return coresFromFileString;
            } catch (IOException unused2) {
                fileInputStream = fileInputStream2;
                if (fileInputStream != null) {
                    try {
                        fileInputStream.close();
                    } catch (IOException unused3) {
                    }
                }
                return -1;
            } catch (Throwable th2) {
                th = th2;
                fileInputStream = fileInputStream2;
                if (fileInputStream != null) {
                    try {
                        fileInputStream.close();
                    } catch (IOException unused4) {
                    }
                }
                throw th;
            }
        } catch (IOException unused5) {
        } catch (Throwable th3) {
            th = th3;
        }
    }

    private static int getCoresFromFileString(String str) {
        if (str == null || !str.matches("0-[\\d]+$")) {
            return -1;
        }
        return Integer.valueOf(str.substring(2)).intValue() + 1;
    }

    public static String getCpuName() throws Throwable {
        String strGetCpuModel = GetCpuModel();
        if (strGetCpuModel != null && !strGetCpuModel.isEmpty()) {
            return strGetCpuModel + ";" + Build.HARDWARE;
        }
        if (Build.VERSION.SDK_INT < 31) {
            return Build.HARDWARE;
        }
        return Build.SOC_MODEL + ";" + Build.HARDWARE;
    }

    public static int getCpuThreads() {
        return getNumberOfCPUCores();
    }

    public static String getDevice() {
        return Build.DEVICE;
    }

    public static String getDeviceManufacturer() {
        return Build.MANUFACTURER;
    }

    public static String getGpuName() throws Throwable {
        String gPURenderer = GPUUtil.getGPURenderer();
        return gPURenderer == null ? "null-null" : gPURenderer;
    }

    public static int getMemSize() {
        try {
            Context applicationContext = ContextUtils.getApplicationContext();
            if (applicationContext == null) {
                return -1;
            }
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            ActivityManager activityManager = (ActivityManager) applicationContext.getSystemService(RXScreenCaptureService.KEY_LAUNCH_ACTIVITY);
            if (activityManager == null) {
                return -1;
            }
            activityManager.getMemoryInfo(memoryInfo);
            return (int) Math.ceil((((memoryInfo.totalMem * 1.024d) / 1024.0d) / 1024.0d) / 1024.0d);
        } catch (Exception e10) {
            e10.printStackTrace();
            return (int) Math.ceil(((((-1) * 1.024d) / 1024.0d) / 1024.0d) / 1024.0d);
        }
        throw th;
    }

    public static int getNumberOfCPUCores() {
        try {
            int coresFromFileInfo = getCoresFromFileInfo("/sys/devices/system/cpu/possible");
            if (coresFromFileInfo == -1) {
                coresFromFileInfo = getCoresFromFileInfo("/sys/devices/system/cpu/present");
            }
            if (coresFromFileInfo != -1) {
                return coresFromFileInfo;
            }
            File[] fileArrListFiles = new File("/sys/devices/system/cpu/").listFiles(CPU_FILTER);
            if (fileArrListFiles != null) {
                return fileArrListFiles.length;
            }
            return -1;
        } catch (NullPointerException | SecurityException unused) {
            return -1;
        }
    }

    public static String getProduct() {
        return Build.PRODUCT;
    }

    public static String getRomVersionName() {
        if (TextUtils.isEmpty(RomVersion)) {
            RomVersion = RXDeviceUtil.getPhoneSystem(Build.BRAND);
        }
        return RomVersion;
    }

    public static String getSdkVersion() {
        return String.valueOf(Build.VERSION.SDK_INT);
    }

    public static String getSystemDefaultLanguage() {
        return Locale.getDefault().getLanguage();
    }

    public static String getValueFromCpuInfoFile(String str, String str2) throws Throwable {
        FileInputStream fileInputStream;
        BufferedReader bufferedReader = null;
        try {
            try {
                fileInputStream = new FileInputStream("/proc/cpuinfo");
                try {
                    try {
                        BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(fileInputStream, Charset.defaultCharset()));
                        while (true) {
                            try {
                                String line = bufferedReader2.readLine();
                                if (line == null) {
                                    break;
                                }
                                if (line.contains(":")) {
                                    String[] strArrSplit = line.split(":");
                                    if (strArrSplit.length > 1 && strArrSplit[0].contains(str)) {
                                        str2 = strArrSplit[1];
                                        break;
                                    }
                                }
                            } catch (Exception e10) {
                                e = e10;
                                bufferedReader = bufferedReader2;
                                e.printStackTrace();
                                if (bufferedReader != null) {
                                    try {
                                        bufferedReader.close();
                                    } catch (Exception e11) {
                                        e11.printStackTrace();
                                    }
                                }
                                if (fileInputStream != null) {
                                    fileInputStream.close();
                                }
                                return str2;
                            } catch (Throwable th2) {
                                th = th2;
                                bufferedReader = bufferedReader2;
                                if (bufferedReader != null) {
                                    try {
                                        bufferedReader.close();
                                    } catch (Exception e12) {
                                        e12.printStackTrace();
                                    }
                                }
                                if (fileInputStream == null) {
                                    throw th;
                                }
                                try {
                                    fileInputStream.close();
                                    throw th;
                                } catch (Exception e13) {
                                    e13.printStackTrace();
                                    throw th;
                                }
                            }
                        }
                        try {
                            bufferedReader2.close();
                        } catch (Exception e14) {
                            e14.printStackTrace();
                        }
                        fileInputStream.close();
                    } catch (Exception e15) {
                        e = e15;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (Exception e16) {
                e16.printStackTrace();
            }
        } catch (Exception e17) {
            e = e17;
            fileInputStream = null;
        } catch (Throwable th4) {
            th = th4;
            fileInputStream = null;
        }
        return str2;
    }

    private static int parseFileForValue(String str, FileInputStream fileInputStream) {
        byte[] bArr = new byte[1024];
        try {
            int i10 = fileInputStream.read(bArr);
            int i11 = 0;
            while (i11 < i10) {
                byte b10 = bArr[i11];
                if (b10 == 10 || i11 == 0) {
                    if (b10 == 10) {
                        i11++;
                    }
                    for (int i12 = i11; i12 < i10; i12++) {
                        int i13 = i12 - i11;
                        if (bArr[i12] != str.charAt(i13)) {
                            break;
                        }
                        if (i13 == str.length() - 1) {
                            return extractValue(bArr, i12);
                        }
                    }
                }
                i11++;
            }
            return -1;
        } catch (IOException | NumberFormatException unused) {
            return -1;
        }
    }
}
