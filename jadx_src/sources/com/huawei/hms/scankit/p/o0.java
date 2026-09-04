package com.huawei.hms.scankit.p;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: CharacterSetECI.java */
/* JADX INFO: loaded from: classes7.dex */
public enum o0 {
    Cp437(new int[]{0, 2}, new String[0]),
    ISO8859_1(new int[]{1, 3}, "ISO-8859-1"),
    ISO8859_2(4, "ISO-8859-2"),
    ISO8859_3(5, "ISO-8859-3"),
    ISO8859_4(6, "ISO-8859-4"),
    ISO8859_5(7, "ISO-8859-5"),
    ISO8859_6(8, "ISO-8859-6"),
    ISO8859_7(9, "ISO-8859-7"),
    ISO8859_8(10, "ISO-8859-8"),
    ISO8859_9(11, "ISO-8859-9"),
    ISO8859_10(12, "ISO-8859-10"),
    ISO8859_11(13, "ISO-8859-11"),
    ISO8859_13(15, "ISO-8859-13"),
    ISO8859_14(16, "ISO-8859-14"),
    ISO8859_15(17, "ISO-8859-15"),
    ISO8859_16(18, "ISO-8859-16"),
    SJIS(20, "Shift_JIS"),
    Cp1250(21, "windows-1250"),
    Cp1251(22, "windows-1251"),
    Cp1252(23, "windows-1252"),
    Cp1256(24, "windows-1256"),
    UnicodeBigUnmarked(25, mj.c.f131911d, "UnicodeBig"),
    UTF8(26, "UTF-8"),
    ASCII(new int[]{27, bb.c.b.f30828o0}, "US-ASCII"),
    Big5(28),
    GB18030(29, "GB2312", "EUC_CN", "GBK"),
    EUC_KR(30, "EUC-KR");

    private static final Map<Integer, o0> D = new HashMap();
    private static final Map<String, o0> E = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int[] f62170a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String[] f62171b;

    static {
        for (o0 o0Var : values()) {
            for (int i10 : o0Var.f62170a) {
                D.put(Integer.valueOf(i10), o0Var);
            }
            E.put(o0Var.name(), o0Var);
            for (String str : o0Var.f62171b) {
                E.put(str, o0Var);
            }
        }
    }

    o0(int i10) {
        this(new int[]{i10}, new String[0]);
    }

    o0(int i10, String... strArr) {
        this.f62170a = new int[]{i10};
        this.f62171b = strArr;
    }

    o0(int[] iArr, String... strArr) {
        this.f62170a = iArr;
        this.f62171b = strArr;
    }

    public static o0 a(int i10) throws a {
        if (i10 < 0 || i10 >= 900) {
            throw a.a();
        }
        return D.get(Integer.valueOf(i10));
    }

    public static o0 a(String str) {
        return E.get(str);
    }

    public int a() {
        return this.f62170a[0];
    }
}
