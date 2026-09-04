package com.tencent.thumbplayer.tcmedia.core.common;

import android.content.Context;
import android.text.TextUtils;
import com.max.xiaoheihe.loader.dynamic_so.DynamicSoManager;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* JADX INFO: loaded from: classes4.dex */
public final class TPLoadLibFromApk {
    private static final HashMap<String, WeakReference<ClassLoader>> mLoadedLibs = new HashMap<>();
    private static Context mContext = null;

    public static class LibraryBrokenHandler implements Thread.UncaughtExceptionHandler {
        private Thread.UncaughtExceptionHandler mParent;

        LibraryBrokenHandler(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
            this.mParent = uncaughtExceptionHandler;
        }

        @Override // java.lang.Thread.UncaughtExceptionHandler
        public void uncaughtException(Thread thread, Throwable th2) {
            boolean z10 = true;
            if ((th2 instanceof UnsatisfiedLinkError) || ((th2 instanceof NoSuchMethodError) && th2.getMessage().matches(".*sig(nature)?[=:].*"))) {
                try {
                    TPLoadLibFromApk.extractAllLibraries(TPLoadLibFromApk.mContext);
                } catch (Exception unused) {
                    z10 = false;
                }
            } else {
                z10 = false;
            }
            if (z10) {
                th2 = new UnsatisfiedLinkError("Invalid so detected and recovered.").initCause(th2);
            }
            this.mParent.uncaughtException(thread, th2);
        }
    }

    private TPLoadLibFromApk() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void extractAllLibraries(Context context) throws NoSuchMethodException, IOException {
        if (context == null) {
            return;
        }
        List<String> listGenerateAbiList = generateAbiList();
        File dir = context.getDir("recover_lib", 0);
        ZipFile zipFile = new ZipFile(context.getApplicationInfo().sourceDir);
        try {
            HashSet hashSet = new HashSet();
            Pattern patternCompile = Pattern.compile("lib/[A-Za-z0-9-_=]+/lib([A-Za-z0-9-_=]+)\\.so");
            Enumeration<? extends ZipEntry> enumerationEntries = zipFile.entries();
            while (enumerationEntries.hasMoreElements()) {
                ZipEntry zipEntryNextElement = enumerationEntries.nextElement();
                String name = zipEntryNextElement.getName();
                if (!TextUtils.isEmpty(name) && name.contains("../")) {
                    throw new Exception("contain ../, throw err");
                }
                Matcher matcher = patternCompile.matcher(zipEntryNextElement.getName());
                if (matcher.matches()) {
                    String strGroup = matcher.group(1);
                    if (!hashSet.contains(strGroup)) {
                        extractLibrary(zipFile, strGroup, listGenerateAbiList, new File(dir, "lib" + strGroup + DynamicSoManager.f77250e));
                        hashSet.add(strGroup);
                    }
                }
            }
            zipFile.close();
        } catch (Throwable th2) {
            zipFile.close();
            throw th2;
        }
    }

    private static boolean extractLibrary(ZipFile zipFile, String str, List<String> list, File file) throws IOException {
        if (file.isFile()) {
            return true;
        }
        Iterator<String> it = list.iterator();
        if (!it.hasNext()) {
            return false;
        }
        ZipEntry entry = zipFile.getEntry("lib/" + it.next() + "/lib" + str + DynamicSoManager.f77250e);
        if (entry == null) {
            return false;
        }
        String name = entry.getName();
        if (!TextUtils.isEmpty(name) && name.contains("../")) {
            return false;
        }
        InputStream inputStream = zipFile.getInputStream(entry);
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        byte[] bArr = new byte[2048];
        while (true) {
            try {
                int i10 = inputStream.read(bArr, 0, 2048);
                if (i10 == -1) {
                    inputStream.close();
                    fileOutputStream.close();
                    try {
                        file.setReadOnly();
                        return true;
                    } catch (Throwable unused) {
                        return false;
                    }
                }
                fileOutputStream.write(bArr, 0, i10);
            } catch (Throwable th2) {
                inputStream.close();
                fileOutputStream.close();
                throw th2;
            }
        }
    }

    public static String find(String str, Context context) {
        String str2 = null;
        if (context == null) {
            return null;
        }
        try {
            ClassLoader classLoader = TPLoadLibFromApk.class.getClassLoader();
            Method declaredMethod = ClassLoader.class.getDeclaredMethod("findLibrary", String.class);
            declaredMethod.setAccessible(true);
            str2 = (String) declaredMethod.invoke(classLoader, str);
        } catch (Exception unused) {
        }
        if (str2 != null) {
            return str2;
        }
        File file = new File(context.getDir("recover_lib", 0), "lib" + str + DynamicSoManager.f77250e);
        return file.canRead() ? file.getAbsolutePath() : str2;
    }

    private static List<String> generateAbiList() throws NoSuchMethodException {
        ArrayList arrayList = new ArrayList(3);
        Method method = Class.forName("android.os.SystemProperties").getMethod("get", String.class);
        String str = (String) method.invoke(null, "ro.product.cpu.abi");
        if (str != null && str.length() > 0) {
            arrayList.add(str);
        }
        String str2 = (String) method.invoke(null, "ro.product.cpu.abi2");
        if (str2 != null && str2.length() > 0) {
            arrayList.add(str2);
        }
        arrayList.add("armeabi");
        return arrayList;
    }

    public static boolean load(String str, ClassLoader classLoader, Context context) {
        if (str == null || str.length() == 0 || classLoader == null) {
            return false;
        }
        mContext = context;
        HashMap<String, WeakReference<ClassLoader>> map = mLoadedLibs;
        synchronized (map) {
            WeakReference<ClassLoader> weakReference = map.get(str);
            ClassLoader classLoader2 = weakReference != null ? weakReference.get() : null;
            if (classLoader2 != null) {
                if (classLoader2 == classLoader) {
                    TPNativeLog.printLog(2, "callerClassLoader has already load ! name=".concat(str));
                    return true;
                }
                throw new UnsatisfiedLinkError("Library '" + str + "' was loaded by a different ClassLoader.");
            }
            if (context == null) {
                try {
                    TPNativeLog.printLog(2, "context is null,load by System.loadLibrary,name= ".concat(str));
                    reflectSystemLoadLibrary(str, classLoader);
                    synchronized (map) {
                        map.put(str, new WeakReference<>(classLoader));
                    }
                    return true;
                } catch (InvocationTargetException e10) {
                    throw ((UnsatisfiedLinkError) new UnsatisfiedLinkError("Failed loading library: ".concat(str)).initCause(e10.getCause()));
                } catch (Exception e11) {
                    throw ((UnsatisfiedLinkError) new UnsatisfiedLinkError("Failed loading library: ".concat(str)).initCause(e11));
                }
            }
            File file = new File(context.getDir("recover_lib", 0), "lib" + str + DynamicSoManager.f77250e);
            UnsatisfiedLinkError unsatisfiedLinkErrorLoadFromRecovery = loadFromRecovery(str, classLoader, context, file);
            if (unsatisfiedLinkErrorLoadFromRecovery == null) {
                return true;
            }
            return loadFromApk(str, classLoader, context, file, unsatisfiedLinkErrorLoadFromRecovery);
        }
    }

    private static boolean loadFromApk(String str, ClassLoader classLoader, Context context, File file, UnsatisfiedLinkError unsatisfiedLinkError) throws Throwable {
        ZipFile zipFile = null;
        try {
            try {
                String str2 = context.getApplicationInfo().sourceDir;
                ZipFile zipFile2 = new ZipFile(str2);
                try {
                    TPNativeLog.printLog(2, "unzip apk,name= " + str + "apkPath=" + str2);
                    if (!extractLibrary(zipFile2, str, generateAbiList(), file)) {
                        throw new RuntimeException("Can't find recover library: ".concat(String.valueOf(str)));
                    }
                    try {
                        zipFile2.close();
                        try {
                            TPNativeLog.printLog(2, "load from unzip apk,name= ".concat(String.valueOf(str)));
                            reflectSystemLoad(file.getAbsolutePath(), classLoader);
                            HashMap<String, WeakReference<ClassLoader>> map = mLoadedLibs;
                            synchronized (map) {
                                map.put(str, new WeakReference<>(classLoader));
                            }
                            return true;
                        } catch (InvocationTargetException e10) {
                            if (unsatisfiedLinkError == null) {
                                throw ((UnsatisfiedLinkError) new UnsatisfiedLinkError("Failed recovering native library: ".concat(String.valueOf(str))).initCause(e10.getCause()));
                            }
                            throw unsatisfiedLinkError;
                        } catch (Exception e11) {
                            if (unsatisfiedLinkError == null) {
                                throw ((UnsatisfiedLinkError) new UnsatisfiedLinkError("Failed recovering native library.").initCause(e11));
                            }
                            throw unsatisfiedLinkError;
                        }
                    } catch (IOException unused) {
                        return false;
                    }
                } catch (Exception e12) {
                    e = e12;
                    throw ((UnsatisfiedLinkError) new UnsatisfiedLinkError("Failed recovering native library.").initCause(e));
                } catch (Throwable th2) {
                    th = th2;
                    zipFile = zipFile2;
                    if (zipFile != null) {
                        try {
                            zipFile.close();
                        } catch (IOException unused2) {
                            return false;
                        }
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Exception e13) {
            e = e13;
        }
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00a0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    private static UnsatisfiedLinkError loadFromRecovery(String str, ClassLoader classLoader, Context context, File file) {
        UnsatisfiedLinkError e10;
        HashMap<String, WeakReference<ClassLoader>> map;
        if (file.isFile()) {
            try {
                TPNativeLog.printLog(2, "load by recover_lib,name= " + str + "recoverfile=" + file);
                reflectSystemLoad(file.getAbsolutePath(), classLoader);
                HashMap<String, WeakReference<ClassLoader>> map2 = mLoadedLibs;
                synchronized (map2) {
                    try {
                        map2.put(str, new WeakReference<>(classLoader));
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return null;
            } catch (UnsatisfiedLinkError e11) {
                e10 = e11;
                TPNativeLog.printLog(2, "load by recover_lib failed!,name= ".concat(String.valueOf(str)));
                file.delete();
                reflectSystemLoadLibrary(str, classLoader);
                TPNativeLog.printLog(2, "load by reflectSystemLoadLibrary,name= ".concat(String.valueOf(str)));
                map = mLoadedLibs;
                synchronized (map) {
                    try {
                        map.put(str, new WeakReference<>(classLoader));
                        return null;
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
            } catch (InvocationTargetException e12) {
                if (!(e12.getCause() instanceof UnsatisfiedLinkError)) {
                    throw ((UnsatisfiedLinkError) new UnsatisfiedLinkError("Failed recovering native library: ".concat(String.valueOf(str))).initCause(e12.getCause()));
                }
                e10 = (UnsatisfiedLinkError) e12.getCause();
                TPNativeLog.printLog(2, "load by recover_lib failed!,name= ".concat(String.valueOf(str)));
                file.delete();
                reflectSystemLoadLibrary(str, classLoader);
                TPNativeLog.printLog(2, "load by reflectSystemLoadLibrary,name= ".concat(String.valueOf(str)));
                map = mLoadedLibs;
                synchronized (map) {
                    map.put(str, new WeakReference<>(classLoader));
                    return null;
                }
            } catch (Throwable th4) {
                throw ((UnsatisfiedLinkError) new UnsatisfiedLinkError("Failed recovering native library: ".concat(String.valueOf(str))).initCause(th4));
            }
        }
        e10 = null;
        try {
            reflectSystemLoadLibrary(str, classLoader);
            TPNativeLog.printLog(2, "load by reflectSystemLoadLibrary,name= ".concat(String.valueOf(str)));
            map = mLoadedLibs;
            synchronized (map) {
                map.put(str, new WeakReference<>(classLoader));
            }
            return null;
        } catch (UnsatisfiedLinkError e13) {
            return e10 == null ? e13 : e10;
        } catch (InvocationTargetException e14) {
            if (e14.getCause() instanceof UnsatisfiedLinkError) {
                return e10 == null ? (UnsatisfiedLinkError) e14.getCause() : e10;
            }
            throw ((UnsatisfiedLinkError) new UnsatisfiedLinkError("Failed recovering native library: ".concat(String.valueOf(str))).initCause(e14.getCause()));
        } catch (Throwable th5) {
            throw ((UnsatisfiedLinkError) new UnsatisfiedLinkError("Failed recovering native library: ".concat(String.valueOf(str))).initCause(th5));
        }
    }

    private static void reflectSystemLoad(String str, ClassLoader classLoader) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Runtime runtime = Runtime.getRuntime();
        Method declaredMethod = runtime.getClass().getDeclaredMethod("load", String.class, ClassLoader.class);
        declaredMethod.setAccessible(true);
        declaredMethod.invoke(runtime, str, classLoader);
    }

    private static void reflectSystemLoadLibrary(String str, ClassLoader classLoader) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Runtime runtime = Runtime.getRuntime();
        Method declaredMethod = runtime.getClass().getDeclaredMethod("loadLibrary", String.class, ClassLoader.class);
        declaredMethod.setAccessible(true);
        declaredMethod.invoke(runtime, str, classLoader);
    }

    public static void setupBrokenLibraryHandler() {
        Thread.setDefaultUncaughtExceptionHandler(new LibraryBrokenHandler(Thread.getDefaultUncaughtExceptionHandler()));
    }
}
