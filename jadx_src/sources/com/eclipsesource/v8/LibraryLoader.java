package com.eclipsesource.v8;

import com.uc.crashsdk.export.LogType;
import com.xiaomi.mipush.sdk.Constants;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes6.dex */
public class LibraryLoader {
    static final String DELIMITER = System.getProperty("line.separator");
    static final String SEPARATOR = System.getProperty("file.separator");
    static final String SWT_LIB_DIR = ".j2v8";

    LibraryLoader() {
    }

    static void chmod(String str, String str2) {
        if (PlatformDetector.OS.isWindows()) {
            return;
        }
        try {
            Runtime.getRuntime().exec(new String[]{"chmod", str, str2}).waitFor();
        } catch (Throwable unused) {
        }
    }

    public static String computeLibraryFullName(boolean z10) {
        return "lib" + computeLibraryShortName(z10) + "." + PlatformDetector.OS.getLibFileExtension();
    }

    public static String computeLibraryShortName(boolean z10) {
        String str;
        String name = (z10 && PlatformDetector.OS.isLinux()) ? PlatformDetector.Vendor.getName() : null;
        String name2 = PlatformDetector.OS.getName();
        String name3 = PlatformDetector.Arch.getName();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("j2v8");
        if (name != null) {
            str = Constants.ACCEPT_TIME_SEPARATOR_SERVER + name;
        } else {
            str = "";
        }
        sb2.append(str);
        sb2.append(Constants.ACCEPT_TIME_SEPARATOR_SERVER);
        sb2.append(name2);
        sb2.append(Constants.ACCEPT_TIME_SEPARATOR_SERVER);
        sb2.append(name3);
        return sb2.toString();
    }

    static boolean extract(String str, String str2, StringBuffer stringBuffer) {
        InputStream resourceAsStream;
        File file = new File(str);
        boolean z10 = true;
        FileOutputStream fileOutputStream = null;
        try {
            if (file.exists()) {
                file.delete();
            }
            resourceAsStream = LibraryLoader.class.getResourceAsStream("/" + str2);
            if (resourceAsStream != null) {
                try {
                    byte[] bArr = new byte[4096];
                    FileOutputStream fileOutputStream2 = new FileOutputStream(str);
                    while (true) {
                        try {
                            int i10 = resourceAsStream.read(bArr);
                            if (i10 == -1) {
                                break;
                            }
                            fileOutputStream2.write(bArr, 0, i10);
                        } catch (Throwable unused) {
                            fileOutputStream = fileOutputStream2;
                            if (fileOutputStream != null) {
                                try {
                                    fileOutputStream.close();
                                } catch (IOException unused2) {
                                }
                            }
                            if (resourceAsStream != null) {
                                try {
                                    resourceAsStream.close();
                                } catch (IOException unused3) {
                                }
                            }
                            if (z10 && file.exists()) {
                                file.delete();
                            }
                        }
                    }
                    fileOutputStream2.close();
                    resourceAsStream.close();
                    chmod("755", str);
                    if (load(str, stringBuffer)) {
                        return true;
                    }
                } catch (Throwable unused4) {
                }
            }
        } catch (Throwable unused5) {
            resourceAsStream = null;
            z10 = false;
        }
        return false;
    }

    static boolean extract(String str, boolean z10, StringBuffer stringBuffer) {
        String strComputeLibraryFullName = computeLibraryFullName(z10);
        return extract(str + SEPARATOR + strComputeLibraryFullName, strComputeLibraryFullName, stringBuffer);
    }

    static boolean load(String str, StringBuffer stringBuffer) {
        try {
            if (str.indexOf(SEPARATOR) != -1) {
                System.load(str);
                return true;
            }
            System.loadLibrary(str);
            return true;
        } catch (UnsatisfiedLinkError e10) {
            if (stringBuffer.length() == 0) {
                stringBuffer.append(DELIMITER);
            }
            stringBuffer.append('\t');
            stringBuffer.append(e10.getMessage());
            stringBuffer.append(DELIMITER);
            return false;
        }
    }

    static void loadLibrary(String str) {
        if (PlatformDetector.OS.isAndroid()) {
            System.loadLibrary("j2v8");
            return;
        }
        StringBuffer stringBuffer = new StringBuffer();
        if (tryLoad(true, stringBuffer) || tryLoad(false, stringBuffer)) {
            return;
        }
        if (str == null) {
            str = System.getProperty("java.io.tmpdir");
        }
        if (extract(str, true, stringBuffer) || extract(str, false, stringBuffer)) {
            return;
        }
        throw new UnsatisfiedLinkError("Could not load J2V8 library. Reasons: " + stringBuffer.toString());
    }

    static boolean tryLoad(boolean z10, StringBuffer stringBuffer) {
        String strComputeLibraryShortName = computeLibraryShortName(z10);
        String strComputeLibraryFullName = computeLibraryFullName(z10);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(System.getProperty("user.dir"));
        String str = SEPARATOR;
        sb2.append(str);
        sb2.append(LogType.NATIVE_TYPE);
        sb2.append(str);
        sb2.append(strComputeLibraryFullName);
        String string = sb2.toString();
        if (load(strComputeLibraryFullName, stringBuffer) || load(strComputeLibraryShortName, stringBuffer)) {
            return true;
        }
        return new File(string).exists() && load(string, stringBuffer);
    }
}
