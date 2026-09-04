package com.eclipsesource.v8;

import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

/* JADX INFO: loaded from: classes6.dex */
public class PlatformDetector {

    public static class Arch {
        public static String getName() {
            String property = System.getProperty("os.arch");
            String strNormalizeArch = PlatformDetector.normalizeArch(property);
            if (!strNormalizeArch.equals("unknown")) {
                return strNormalizeArch;
            }
            throw new UnsatisfiedLinkError("Unsupported arch: " + property);
        }
    }

    public static class OS {
        public static String getLibFileExtension() {
            if (isWindows()) {
                return "dll";
            }
            if (isMac()) {
                return "dylib";
            }
            if (isLinux() || isAndroid() || isNativeClient()) {
                return "so";
            }
            throw new UnsatisfiedLinkError("Unsupported platform library-extension for: " + getName());
        }

        public static String getName() {
            String property = System.getProperty("os.name");
            String strNormalizeOs = PlatformDetector.normalizeOs(property);
            String property2 = System.getProperty("java.specification.vendor");
            if (PlatformDetector.normalize(property2).contains("android") || strNormalizeOs.contains("android")) {
                return "android";
            }
            if (!strNormalizeOs.equals("unknown")) {
                return strNormalizeOs;
            }
            throw new UnsatisfiedLinkError("Unsupported platform/vendor: " + property + " / " + property2);
        }

        public static boolean isAndroid() {
            return getName().equals("android");
        }

        public static boolean isLinux() {
            return getName().equals(Platform.LINUX);
        }

        public static boolean isMac() {
            return getName().equals(Platform.MACOSX);
        }

        public static boolean isNativeClient() {
            return getName().equals(Platform.NATIVE_CLIENT);
        }

        public static boolean isWindows() {
            return getName().equals("windows");
        }
    }

    public static class Vendor {
        private static final String LINUX_ID_PREFIX = "ID=";
        private static final String[] LINUX_OS_RELEASE_FILES = {"/etc/os-release", "/usr/lib/os-release"};
        private static final String REDHAT_RELEASE_FILE = "/etc/redhat-release";

        private static void closeQuietly(Closeable closeable) {
            if (closeable != null) {
                try {
                    closeable.close();
                } catch (IOException unused) {
                }
            }
        }

        private static String getLinuxOsReleaseId() {
            for (String str : LINUX_OS_RELEASE_FILES) {
                File file = new File(str);
                if (file.exists()) {
                    return parseLinuxOsReleaseFile(file);
                }
            }
            File file2 = new File(REDHAT_RELEASE_FILE);
            if (file2.exists()) {
                return parseLinuxRedhatReleaseFile(file2);
            }
            throw new UnsatisfiedLinkError("Unsupported linux vendor: " + getName());
        }

        public static String getName() {
            if (OS.isWindows()) {
                return "microsoft";
            }
            if (OS.isMac()) {
                return "apple";
            }
            if (OS.isLinux()) {
                return getLinuxOsReleaseId();
            }
            if (OS.isAndroid()) {
                return "google";
            }
            throw new UnsatisfiedLinkError("Unsupported vendor: " + getName());
        }

        private static String parseLinuxOsReleaseFile(File file) throws Throwable {
            BufferedReader bufferedReader;
            String line;
            BufferedReader bufferedReader2 = null;
            String strNormalizeOsReleaseValue = null;
            try {
                bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), "utf-8"));
                do {
                    try {
                        line = bufferedReader.readLine();
                        if (line != null) {
                        }
                        closeQuietly(bufferedReader);
                        return strNormalizeOsReleaseValue;
                    } catch (IOException unused) {
                        closeQuietly(bufferedReader);
                        return null;
                    } catch (Throwable th2) {
                        th = th2;
                        bufferedReader2 = bufferedReader;
                        closeQuietly(bufferedReader2);
                        throw th;
                    }
                } while (!line.startsWith(LINUX_ID_PREFIX));
                strNormalizeOsReleaseValue = PlatformDetector.normalizeOsReleaseValue(line.substring(3));
                closeQuietly(bufferedReader);
                return strNormalizeOsReleaseValue;
            } catch (IOException unused2) {
                bufferedReader = null;
            } catch (Throwable th3) {
                th = th3;
            }
        }

        private static String parseLinuxRedhatReleaseFile(File file) throws Throwable {
            BufferedReader bufferedReader;
            String str = "centos";
            BufferedReader bufferedReader2 = null;
            try {
                bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), "utf-8"));
                try {
                    String line = bufferedReader.readLine();
                    if (line != null) {
                        String lowerCase = line.toLowerCase(Locale.US);
                        if (!lowerCase.contains("centos")) {
                            if (lowerCase.contains("fedora")) {
                                str = "fedora";
                            } else {
                                if (!lowerCase.contains("red hat enterprise linux")) {
                                    closeQuietly(bufferedReader);
                                    return null;
                                }
                                str = "rhel";
                            }
                        }
                        closeQuietly(bufferedReader);
                        return str;
                    }
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    th = th2;
                    bufferedReader2 = bufferedReader;
                    closeQuietly(bufferedReader2);
                    throw th;
                }
            } catch (IOException unused2) {
                bufferedReader = null;
            } catch (Throwable th3) {
                th = th3;
            }
            closeQuietly(bufferedReader);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String normalize(String str) {
        return str == null ? "" : str.toLowerCase(Locale.US).replaceAll("[^a-z0-9]+", "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String normalizeArch(String str) {
        String strNormalize = normalize(str);
        if (strNormalize.matches("^(x8664|amd64|ia32e|em64t|x64)$")) {
            return "x86_64";
        }
        if (strNormalize.matches("^(x8632|x86|i[3-6]86|ia32|x32)$")) {
            return "x86_32";
        }
        if (strNormalize.matches("^(ia64|itanium64)$")) {
            return "itanium_64";
        }
        if (strNormalize.matches("^(sparc|sparc32)$")) {
            return "sparc_32";
        }
        if (strNormalize.matches("^(sparcv9|sparc64)$")) {
            return "sparc_64";
        }
        if (strNormalize.matches("^(arm|arm32)$") || strNormalize.startsWith("armv7")) {
            return "arm_32";
        }
        if ("aarch64".equals(strNormalize) || strNormalize.startsWith("armv8")) {
            return "aarch_64";
        }
        if (strNormalize.matches("^(ppc|ppc32)$")) {
            return "ppc_32";
        }
        if ("ppc64".equals(strNormalize)) {
            return "ppc_64";
        }
        if ("ppc64le".equals(strNormalize)) {
            return "ppcle_64";
        }
        if ("s390".equals(strNormalize)) {
            return "s390_32";
        }
        return "s390x".equals(strNormalize) ? "s390_64" : "unknown";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String normalizeOs(String str) {
        String strNormalize = normalize(str);
        if (strNormalize.startsWith("aix")) {
            return "aix";
        }
        if (strNormalize.startsWith("hpux")) {
            return "hpux";
        }
        if (strNormalize.startsWith("os400") && (strNormalize.length() <= 5 || !Character.isDigit(strNormalize.charAt(5)))) {
            return "os400";
        }
        if (strNormalize.startsWith("android")) {
            return "android";
        }
        if (strNormalize.startsWith(Platform.LINUX)) {
            return Platform.LINUX;
        }
        if (strNormalize.startsWith(Platform.NATIVE_CLIENT)) {
            return Platform.NATIVE_CLIENT;
        }
        if (strNormalize.startsWith(Platform.MACOSX) || strNormalize.startsWith("osx")) {
            return Platform.MACOSX;
        }
        if (strNormalize.startsWith("freebsd")) {
            return "freebsd";
        }
        if (strNormalize.startsWith("openbsd")) {
            return "openbsd";
        }
        if (strNormalize.startsWith("netbsd")) {
            return "netbsd";
        }
        if (strNormalize.startsWith("solaris") || strNormalize.startsWith("sunos")) {
            return "sunos";
        }
        return strNormalize.startsWith("windows") ? "windows" : "unknown";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String normalizeOsReleaseValue(String str) {
        return str.trim().replace("\"", "");
    }
}
