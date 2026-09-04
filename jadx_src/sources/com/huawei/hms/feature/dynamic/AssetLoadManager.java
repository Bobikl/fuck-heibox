package com.huawei.hms.feature.dynamic;

import android.content.Context;
import android.content.res.AssetManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.huawei.hms.common.util.ExtractNativeUtils;
import com.huawei.hms.common.util.Logger;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes7.dex */
public class AssetLoadManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f60603a = "AssetLoadManager";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f60604b = "dynamic_modules";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f60605c = ".apk";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f60606d = "com.huawei.hms.feature.dynamic.descriptors.";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f60607e = ".AssetModuleDescriptor";

    public static int a(Context context, String str) {
        if (context == null || TextUtils.isEmpty(str)) {
            Logger.e(f60603a, "Invalid context or moduleName.");
            return 0;
        }
        try {
            return context.getClassLoader().loadClass(f60606d + str + f60607e).getDeclaredField("MODULE_VERSION").getInt(null);
        } catch (ClassNotFoundException unused) {
            Logger.w(f60603a, "Cannot get the class of module descriptor for " + str);
            return 0;
        } catch (Exception e10) {
            Logger.w(f60603a, "Get local asset module info failed.", e10);
            return 0;
        }
    }

    public static Bundle a(Context context, File file, String str) {
        String[] list = file.list();
        if (list == null || list.length == 0) {
            Logger.w(f60603a, "No version in module path.");
            return new Bundle();
        }
        int iMax = 0;
        for (String str2 : list) {
            iMax = Math.max(Integer.parseInt(str2), iMax);
        }
        if (iMax == 0) {
            Logger.w(f60603a, "Cannot get module version path.");
            return new Bundle();
        }
        try {
            String canonicalPath = file.getCanonicalPath();
            ModuleCopy.clearLowVersionModule(iMax, canonicalPath, list, f60603a);
            if (a(context, str) > iMax) {
                Logger.i(f60603a, "There is a higher loader version in assets.");
                return new Bundle();
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(canonicalPath);
            String str3 = File.separator;
            sb2.append(str3);
            sb2.append(iMax);
            sb2.append(str3);
            sb2.append(str);
            sb2.append(".apk");
            String string = sb2.toString();
            if (!new File(string).exists()) {
                Logger.w(f60603a, "Cannot find module apk in asset decompressed path.");
                return new Bundle();
            }
            Bundle bundle = new Bundle();
            bundle.putString(b.f60688j, str);
            bundle.putString(b.f60692n, string);
            bundle.putInt(b.f60691m, iMax);
            Logger.i(f60603a, "Get module info from decompressed asset path success: ModuleName:" + str + ", ModuleVersion:" + iMax + ", ModulePath:" + string);
            return bundle;
        } catch (IOException e10) {
            Logger.w(f60603a, "request modulePath error: " + e10.getMessage());
            return new Bundle();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [int] */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v7, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r11v9, types: [java.io.Closeable, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v3 */
    public static String a(Context context, String str, int i10, String str2) throws Throwable {
        BufferedInputStream bufferedInputStream;
        FileOutputStream fileOutputStream;
        ?? r11;
        ?? r10 = 0;
        r10 = 0;
        try {
            try {
                AssetManager assets = context.getAssets();
                StringBuilder sb2 = new StringBuilder();
                sb2.append("dynamic_modules");
                String str3 = File.separator;
                sb2.append(str3);
                sb2.append(str);
                sb2.append(str3);
                sb2.append((String) str2);
                str2 = assets.open(sb2.toString());
                try {
                    bufferedInputStream = new BufferedInputStream(str2);
                    try {
                        String str4 = ModuleCopy.getProtectedPath(context) + str3 + "dynamic_modules" + str3 + str + str3 + ((int) i10);
                        if (!new File(str4).exists() && !new File(str4).mkdirs()) {
                            Logger.w(f60603a, "mkdirs local loaderPath failed.");
                            ModuleCopy.closeQuietly(bufferedInputStream);
                            ModuleCopy.closeQuietly(null);
                            r11 = str2;
                            ModuleCopy.closeQuietly(r11);
                            return null;
                        }
                        String str5 = str4 + str3 + str + ".apk";
                        fileOutputStream = new FileOutputStream(str5);
                        try {
                            byte[] bArr = new byte[4096];
                            while (true) {
                                int i11 = bufferedInputStream.read(bArr, 0, 4096);
                                if (i11 == -1) {
                                    Logger.i(f60603a, "Decompress module:" + str + " from assets success.");
                                    ModuleCopy.closeQuietly(bufferedInputStream);
                                    ModuleCopy.closeQuietly(fileOutputStream);
                                    ModuleCopy.closeQuietly(str2);
                                    return str5;
                                }
                                fileOutputStream.write(bArr, 0, i11);
                            }
                        } catch (Exception e10) {
                            e = e10;
                            Logger.w(f60603a, "Cannot find module:" + str + " in assets.", e);
                            ModuleCopy.closeQuietly(bufferedInputStream);
                            ModuleCopy.closeQuietly(fileOutputStream);
                            r11 = str2;
                            ModuleCopy.closeQuietly(r11);
                            return null;
                        }
                    } catch (Exception e11) {
                        e = e11;
                        fileOutputStream = null;
                    } catch (Throwable th2) {
                        th = th2;
                        ModuleCopy.closeQuietly(bufferedInputStream);
                        ModuleCopy.closeQuietly(r10);
                        ModuleCopy.closeQuietly(str2);
                        throw th;
                    }
                } catch (Exception e12) {
                    e = e12;
                    fileOutputStream = null;
                    bufferedInputStream = null;
                    Logger.w(f60603a, "Cannot find module:" + str + " in assets.", e);
                    ModuleCopy.closeQuietly(bufferedInputStream);
                    ModuleCopy.closeQuietly(fileOutputStream);
                    r11 = str2;
                    ModuleCopy.closeQuietly(r11);
                    return null;
                } catch (Throwable th3) {
                    th = th3;
                    bufferedInputStream = null;
                    ModuleCopy.closeQuietly(bufferedInputStream);
                    ModuleCopy.closeQuietly(r10);
                    ModuleCopy.closeQuietly(str2);
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                r10 = i10;
            }
        } catch (Exception e13) {
            e = e13;
            str2 = 0;
        } catch (Throwable th5) {
            th = th5;
            str2 = 0;
        }
    }

    public static Bundle b(Context context, String str) throws Throwable {
        try {
            String[] list = context.getAssets().list("dynamic_modules" + File.separator + str);
            if (list != null && list.length != 0) {
                String str2 = list[0];
                int iA = a(context, str);
                String strA = a(context, str, iA, str2);
                if (!TextUtils.isEmpty(strA) && new File(strA).exists()) {
                    if (ExtractNativeUtils.a(context, strA) && ExtractNativeUtils.a(new File(strA), ModuleCopy.trimLastSection(strA)) != 0) {
                        Logger.w(f60603a, "Extract native to current dir failed.");
                        return new Bundle();
                    }
                    Bundle bundle = new Bundle();
                    bundle.putString(b.f60688j, str);
                    bundle.putString(b.f60692n, strA);
                    bundle.putInt(b.f60691m, iA);
                    Logger.i(f60603a, "Get dynamic module info from asset success: ModuleName:" + str + ", ModuleVersion:" + iA + ", ModulePath:" + strA);
                    return bundle;
                }
                Logger.w(f60603a, "Decompress module from assets failed.");
                return new Bundle();
            }
            Logger.w(f60603a, "No module apk in asset path.");
            return new Bundle();
        } catch (Exception e10) {
            Logger.i(f60603a, "getModuleFromAsset failed.", e10);
            return new Bundle();
        }
    }

    public static Bundle getAssetModuleInfo(Context context, String str) throws Throwable {
        if (context == null || TextUtils.isEmpty(str)) {
            Logger.w(f60603a, "The context or moduleName is null.");
            return new Bundle();
        }
        try {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(ModuleCopy.getProtectedPath(context));
            String str2 = File.separator;
            sb2.append(str2);
            sb2.append("dynamic_modules");
            sb2.append(str2);
            sb2.append(str);
            File file = new File(sb2.toString());
            if (file.exists()) {
                Bundle bundleA = a(context, file, str);
                if (bundleA.getInt(b.f60691m) > 0) {
                    Logger.i(f60603a, "Successfully get module info from decompressed asset path.");
                    return bundleA;
                }
            }
            Bundle bundleB = b(context, str);
            if (bundleB.getInt(b.f60691m) > 0) {
                Logger.i(f60603a, "Successfully get module info from asset.");
                return bundleB;
            }
        } catch (Exception e10) {
            Logger.i(f60603a, "getDataModuleInfo failed.", e10);
        }
        return new Bundle();
    }
}
