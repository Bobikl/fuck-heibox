package com.vivo.push.util;

import android.os.Build;
import android.text.TextUtils;
import java.lang.reflect.Method;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: Device.java */
/* JADX INFO: loaded from: classes4.dex */
public final class j {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static Method f106676e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean f106672a = b("rom_1.0");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final boolean f106673b = b("rom_2.0");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final boolean f106674c = b("rom_2.5");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f106675d = b("rom_3.0");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static String f106677f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static String f106678g = null;

    /* JADX WARN: Code duplicated, block: B:13:0x0086 A[DONT_GENERATE] */
    /* JADX WARN: Code duplicated, block: B:15:0x0088 A[Catch: all -> 0x0098, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x0005, B:6:0x000a, B:8:0x000e, B:10:0x0053, B:11:0x005a, B:15:0x0088), top: B:24:0x0005, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:17:0x0094 A[DONT_GENERATE] */
    /* JADX WARN: Code duplicated, block: B:19:0x0096 A[DONT_GENERATE] */
    /* JADX WARN: Instruction removed from duplicated block: B:13:0x0086, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:17:0x0094, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:19:0x0096, please report this as an issue */
    public static synchronized String a() {
        String strA;
        String strA2;
        if (f106677f != null || f106678g != null) {
            p.d("Device", "sRomProperty1 : " + f106677f + " ; sRomProperty2 : " + f106678g);
            strA = a(f106677f);
            if (!TextUtils.isEmpty(strA)) {
                return strA;
            }
            strA2 = a(f106678g);
            if (TextUtils.isEmpty(strA2)) {
                return null;
            }
            return strA2;
        }
        try {
            Method declaredMethod = Class.forName("android.os.SystemProperties").getDeclaredMethod("get", String.class, String.class);
            f106676e = declaredMethod;
            declaredMethod.setAccessible(true);
            f106677f = (String) f106676e.invoke(null, "ro.vivo.rom", "@><@");
            f106678g = (String) f106676e.invoke(null, "ro.vivo.rom.version", "@><@");
        } catch (Exception unused) {
            p.b("Device", "getRomCode error");
        }
        p.d("Device", "sRomProperty1 : " + f106677f + " ; sRomProperty2 : " + f106678g);
        strA = a(f106677f);
        if (!TextUtils.isEmpty(strA)) {
            return strA;
        }
        strA2 = a(f106678g);
        if (TextUtils.isEmpty(strA2)) {
            return strA2;
        }
        return null;
        throw th;
    }

    private static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Matcher matcher = Pattern.compile("rom_([\\d]*).?([\\d]*)", 2).matcher(str);
        if (!matcher.find()) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(matcher.group(1));
        sb2.append(TextUtils.isEmpty(matcher.group(2)) ? "0" : matcher.group(2).substring(0, 1));
        return sb2.toString();
    }

    public static String a(String str, String str2) {
        String str3;
        try {
            str3 = (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class).invoke(null, str);
        } catch (Exception e10) {
            e10.printStackTrace();
            str3 = str2;
        }
        return (str3 == null || str3.length() == 0) ? str2 : str3;
    }

    public static boolean b() {
        String str = Build.MANUFACTURER;
        if (TextUtils.isEmpty(str)) {
            p.d("Device", "Build.MANUFACTURER is null");
            return false;
        }
        p.d("Device", "Build.MANUFACTURER is " + str);
        return str.toLowerCase().contains("bbk") || str.toLowerCase().startsWith("vivo");
    }

    private static boolean b(String str) {
        String strB = z.b("ro.vivo.rom", "");
        String strB2 = z.b("ro.vivo.rom.version", "");
        p.d("Device", "ro.vivo.rom = " + strB + " ; ro.vivo.rom.version = " + strB2);
        if (strB == null || !strB.contains(str)) {
            return strB2 != null && strB2.contains(str);
        }
        return true;
    }
}
