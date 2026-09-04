package org.android.spdy;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import com.max.xiaoheihe.loader.dynamic_so.DynamicSoManager;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;
import java.util.zip.ZipFile;

/* JADX INFO: loaded from: classes5.dex */
public class SoInstallMgrSdk {
    private static final String ARMEABI = "armeabi";
    private static final int EventID_SO_INIT = 21033;
    static final String LOGTAG = "INIT_SO";
    private static final String MIPS = "mips";
    private static final String X86 = "x86";
    static Context mContext;

    private static String _cpuType() {
        String str_getFieldReflectively = _getFieldReflectively(new Build(), "CPU_ABI");
        if (str_getFieldReflectively == null || str_getFieldReflectively.length() == 0 || str_getFieldReflectively.equals("Unknown")) {
            str_getFieldReflectively = ARMEABI;
        }
        return str_getFieldReflectively.toLowerCase();
    }

    private static String _getFieldReflectively(Build build, String str) {
        try {
            return Build.class.getField(str).get(build).toString();
        } catch (Exception unused) {
            return "Unknown";
        }
    }

    static boolean _loadUnzipSo(String str, int i10, ClassLoader classLoader) {
        try {
            if (isExist(str, i10)) {
                if (classLoader == null) {
                    System.load(_targetSoFile(str, i10));
                } else {
                    Runtime runtime = Runtime.getRuntime();
                    Method declaredMethod = Runtime.class.getDeclaredMethod("load", String.class, ClassLoader.class);
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(runtime, _targetSoFile(str, i10), classLoader);
                }
            }
            return true;
        } catch (Exception e10) {
            e10.printStackTrace();
            return false;
        } catch (UnsatisfiedLinkError e11) {
            e11.printStackTrace();
            return false;
        } catch (Error e12) {
            e12.printStackTrace();
            return false;
        }
    }

    static String _targetSoFile(String str, int i10) {
        Context context = mContext;
        if (context == null) {
            return "";
        }
        String path = "/data/data/" + context.getPackageName() + "/files";
        File filesDir = context.getFilesDir();
        if (filesDir != null) {
            path = filesDir.getPath();
        }
        return path + "/lib" + str + "bk" + i10 + DynamicSoManager.f77250e;
    }

    public static void init(Context context) {
        mContext = context;
    }

    public static boolean initSo(String str, int i10) {
        return initSo(str, i10, null);
    }

    public static boolean initSo(String str, int i10, ClassLoader classLoader) {
        boolean z10 = true;
        try {
            if (classLoader == null) {
                System.loadLibrary(str);
            } else {
                Runtime runtime = Runtime.getRuntime();
                Method declaredMethod = Runtime.class.getDeclaredMethod("loadLibrary", String.class, ClassLoader.class);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(runtime, str, classLoader);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
            z10 = false;
        } catch (UnsatisfiedLinkError e11) {
            e11.printStackTrace();
            z10 = false;
        } catch (Error e12) {
            e12.printStackTrace();
            z10 = false;
        }
        if (!z10) {
            try {
                if (isExist(str, i10)) {
                    boolean z_loadUnzipSo = _loadUnzipSo(str, i10, classLoader);
                    if (z_loadUnzipSo) {
                        return z_loadUnzipSo;
                    }
                    removeSoIfExit(str, i10);
                }
                String str_cpuType = _cpuType();
                if (!str_cpuType.equalsIgnoreCase(MIPS) && !str_cpuType.equalsIgnoreCase(X86)) {
                    try {
                        return unZipSelectedFiles(str, i10, classLoader);
                    } catch (ZipException e13) {
                        e13.printStackTrace();
                    } catch (IOException e14) {
                        e14.printStackTrace();
                    }
                }
            } catch (Error e15) {
                e15.printStackTrace();
                return false;
            } catch (Exception e16) {
                e16.printStackTrace();
                return false;
            } catch (UnsatisfiedLinkError e17) {
                e17.printStackTrace();
                return false;
            }
        }
        return z10;
    }

    static boolean isExist(String str, int i10) {
        return new File(_targetSoFile(str, i10)).exists();
    }

    static void removeSoIfExit(String str, int i10) {
        File file = new File(_targetSoFile(str, i10));
        if (file.exists()) {
            file.delete();
        }
    }

    static boolean unZipSelectedFiles(String str, int i10, ClassLoader classLoader) throws Throwable {
        FileChannel fileChannel;
        FileOutputStream fileOutputStreamOpenFileOutput;
        String str2 = "lib/armeabi/lib" + str + DynamicSoManager.f77250e;
        try {
            Context context = mContext;
            if (context == null) {
                return false;
            }
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            ZipFile zipFile = new ZipFile(applicationInfo != null ? applicationInfo.sourceDir : "");
            Enumeration<? extends ZipEntry> enumerationEntries = zipFile.entries();
            while (enumerationEntries.hasMoreElements()) {
                ZipEntry zipEntryNextElement = enumerationEntries.nextElement();
                String name = zipEntryNextElement.getName();
                if (!name.contains("..") && !name.contains("\\") && !name.contains("%")) {
                    if (zipEntryNextElement.getName().startsWith(str2)) {
                        InputStream inputStream = null;
                        FileChannel channel = null;
                        try {
                            removeSoIfExit(str, i10);
                            InputStream inputStream2 = zipFile.getInputStream(zipEntryNextElement);
                            try {
                                fileOutputStreamOpenFileOutput = context.openFileOutput("lib" + str + "bk" + i10 + DynamicSoManager.f77250e, 0);
                                try {
                                    channel = fileOutputStreamOpenFileOutput.getChannel();
                                    byte[] bArr = new byte[1024];
                                    int i11 = 0;
                                    while (true) {
                                        int i12 = inputStream2.read(bArr);
                                        if (i12 > 0) {
                                            channel.write(ByteBuffer.wrap(bArr, 0, i12));
                                            i11 += i12;
                                        } else {
                                            try {
                                                break;
                                            } catch (Exception e10) {
                                                e10.printStackTrace();
                                            }
                                        }
                                        e.printStackTrace();
                                        return false;
                                    }
                                    inputStream2.close();
                                    if (channel != null) {
                                        try {
                                            channel.close();
                                        } catch (Exception e11) {
                                            e11.printStackTrace();
                                        }
                                    }
                                    try {
                                        fileOutputStreamOpenFileOutput.close();
                                    } catch (Exception e12) {
                                        e12.printStackTrace();
                                    }
                                    zipFile.close();
                                    if (i11 > 0) {
                                        return _loadUnzipSo(str, i10, classLoader);
                                    }
                                    return false;
                                } catch (Throwable th2) {
                                    th = th2;
                                    fileChannel = channel;
                                    inputStream = inputStream2;
                                    if (inputStream != null) {
                                        try {
                                            inputStream.close();
                                        } catch (Exception e13) {
                                            e13.printStackTrace();
                                        }
                                    }
                                    if (fileChannel != null) {
                                        try {
                                            fileChannel.close();
                                        } catch (Exception e14) {
                                            e14.printStackTrace();
                                        }
                                    }
                                    if (fileOutputStreamOpenFileOutput != null) {
                                        try {
                                            fileOutputStreamOpenFileOutput.close();
                                        } catch (Exception e15) {
                                            e15.printStackTrace();
                                        }
                                    }
                                    zipFile.close();
                                    throw th;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                fileChannel = null;
                                fileOutputStreamOpenFileOutput = null;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            fileChannel = null;
                            fileOutputStreamOpenFileOutput = null;
                        }
                    }
                }
                return false;
            }
            return false;
        } catch (IOException e16) {
            e16.printStackTrace();
        }
    }
}
