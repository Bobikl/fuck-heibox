package com.google.android.exoplayer2.text.ssa;

import android.graphics.Color;
import android.graphics.PointF;
import android.text.TextUtils;
import androidx.annotation.l;
import androidx.annotation.p0;
import com.google.android.exoplayer2.util.u;
import com.google.android.exoplayer2.util.u0;
import com.google.common.primitives.Ints;
import com.xiaomi.mipush.sdk.Constants;
import io.flutter.embedding.android.KeyboardMap;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: SsaStyle.java */
/* JADX INFO: loaded from: classes7.dex */
public final class c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f49701i = "SsaStyle";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f49702j = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f49703k = 1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f49704l = 2;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f49705m = 3;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f49706n = 4;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f49707o = 5;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f49708p = 6;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f49709q = 7;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f49710r = 8;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f49711s = 9;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f49712a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f49713b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @l
    @p0
    public final Integer f49714c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f49715d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f49716e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f49717f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f49718g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f49719h;

    /* JADX INFO: compiled from: SsaStyle.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f49720a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f49721b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f49722c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f49723d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f49724e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f49725f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f49726g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final int f49727h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final int f49728i;

        private a(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
            this.f49720a = i10;
            this.f49721b = i11;
            this.f49722c = i12;
            this.f49723d = i13;
            this.f49724e = i14;
            this.f49725f = i15;
            this.f49726g = i16;
            this.f49727h = i17;
            this.f49728i = i18;
        }

        @p0
        public static a a(String str) {
            String[] strArrSplit = TextUtils.split(str.substring(7), Constants.ACCEPT_TIME_SEPARATOR_SP);
            int i10 = -1;
            int i11 = -1;
            int i12 = -1;
            int i13 = -1;
            int i14 = -1;
            int i15 = -1;
            int i16 = -1;
            int i17 = -1;
            for (int i18 = 0; i18 < strArrSplit.length; i18++) {
                String strG = com.google.common.base.a.g(strArrSplit[i18].trim());
                strG.hashCode();
                switch (strG) {
                    case "italic":
                        i15 = i18;
                        break;
                    case "underline":
                        i16 = i18;
                        break;
                    case "strikeout":
                        i17 = i18;
                        break;
                    case "primarycolour":
                        i12 = i18;
                        break;
                    case "bold":
                        i14 = i18;
                        break;
                    case "name":
                        i10 = i18;
                        break;
                    case "fontsize":
                        i13 = i18;
                        break;
                    case "alignment":
                        i11 = i18;
                        break;
                }
            }
            if (i10 != -1) {
                return new a(i10, i11, i12, i13, i14, i15, i16, i17, strArrSplit.length);
            }
            return null;
        }
    }

    /* JADX INFO: compiled from: SsaStyle.java */
    public static final class b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final String f49729c = "SsaStyle.Overrides";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final Pattern f49730d = Pattern.compile("\\{([^}]*)\\}");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final String f49731e = "\\s*\\d+(?:\\.\\d+)?\\s*";

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final Pattern f49732f = Pattern.compile(u0.H("\\\\pos\\((%1$s),(%1$s)\\)", f49731e));

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final Pattern f49733g = Pattern.compile(u0.H("\\\\move\\(%1$s,%1$s,(%1$s),(%1$s)(?:,%1$s,%1$s)?\\)", f49731e));

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final Pattern f49734h = Pattern.compile("\\\\an(\\d+)");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f49735a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @p0
        public final PointF f49736b;

        private b(int i10, @p0 PointF pointF) {
            this.f49735a = i10;
            this.f49736b = pointF;
        }

        private static int a(String str) {
            Matcher matcher = f49734h.matcher(str);
            if (matcher.find()) {
                return c.d((String) com.google.android.exoplayer2.util.a.g(matcher.group(1)));
            }
            return -1;
        }

        public static b b(String str) {
            Matcher matcher = f49730d.matcher(str);
            PointF pointF = null;
            int i10 = -1;
            while (matcher.find()) {
                String str2 = (String) com.google.android.exoplayer2.util.a.g(matcher.group(1));
                try {
                    PointF pointFC = c(str2);
                    if (pointFC != null) {
                        pointF = pointFC;
                    }
                } catch (RuntimeException unused) {
                }
                try {
                    int iA = a(str2);
                    if (iA != -1) {
                        i10 = iA;
                    }
                } catch (RuntimeException unused2) {
                }
            }
            return new b(i10, pointF);
        }

        @p0
        private static PointF c(String str) {
            String strGroup;
            String strGroup2;
            Matcher matcher = f49732f.matcher(str);
            Matcher matcher2 = f49733g.matcher(str);
            boolean zFind = matcher.find();
            boolean zFind2 = matcher2.find();
            if (zFind) {
                if (zFind2) {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 82);
                    sb2.append("Override has both \\pos(x,y) and \\move(x1,y1,x2,y2); using \\pos values. override='");
                    sb2.append(str);
                    sb2.append("'");
                    u.h(f49729c, sb2.toString());
                }
                strGroup = matcher.group(1);
                strGroup2 = matcher.group(2);
            } else {
                if (!zFind2) {
                    return null;
                }
                strGroup = matcher2.group(1);
                strGroup2 = matcher2.group(2);
            }
            return new PointF(Float.parseFloat(((String) com.google.android.exoplayer2.util.a.g(strGroup)).trim()), Float.parseFloat(((String) com.google.android.exoplayer2.util.a.g(strGroup2)).trim()));
        }

        public static String d(String str) {
            return f49730d.matcher(str).replaceAll("");
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.text.ssa.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: SsaStyle.java */
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC0396c {
    }

    private c(String str, int i10, @l @p0 Integer num, float f10, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f49712a = str;
        this.f49713b = i10;
        this.f49714c = num;
        this.f49715d = f10;
        this.f49716e = z10;
        this.f49717f = z11;
        this.f49718g = z12;
        this.f49719h = z13;
    }

    @p0
    public static c b(String str, a aVar) {
        com.google.android.exoplayer2.util.a.a(str.startsWith("Style:"));
        String[] strArrSplit = TextUtils.split(str.substring(6), Constants.ACCEPT_TIME_SEPARATOR_SP);
        int length = strArrSplit.length;
        int i10 = aVar.f49728i;
        if (length != i10) {
            u.m(f49701i, u0.H("Skipping malformed 'Style:' line (expected %s values, found %s): '%s'", Integer.valueOf(i10), Integer.valueOf(strArrSplit.length), str));
            return null;
        }
        try {
            String strTrim = strArrSplit[aVar.f49720a].trim();
            int i11 = aVar.f49721b;
            int iD = i11 != -1 ? d(strArrSplit[i11].trim()) : -1;
            int i12 = aVar.f49722c;
            Integer numF = i12 != -1 ? f(strArrSplit[i12].trim()) : null;
            int i13 = aVar.f49723d;
            float fG = i13 != -1 ? g(strArrSplit[i13].trim()) : -3.4028235E38f;
            int i14 = aVar.f49724e;
            boolean z10 = i14 != -1 && e(strArrSplit[i14].trim());
            int i15 = aVar.f49725f;
            boolean z11 = i15 != -1 && e(strArrSplit[i15].trim());
            int i16 = aVar.f49726g;
            boolean z12 = i16 != -1 && e(strArrSplit[i16].trim());
            int i17 = aVar.f49727h;
            return new c(strTrim, iD, numF, fG, z10, z11, z12, i17 != -1 && e(strArrSplit[i17].trim()));
        } catch (RuntimeException e10) {
            StringBuilder sb2 = new StringBuilder(str.length() + 36);
            sb2.append("Skipping malformed 'Style:' line: '");
            sb2.append(str);
            sb2.append("'");
            u.n(f49701i, sb2.toString(), e10);
            return null;
        }
    }

    private static boolean c(int i10) {
        switch (i10) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return true;
            default:
                return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int d(String str) {
        try {
            int i10 = Integer.parseInt(str.trim());
            if (c(i10)) {
                return i10;
            }
        } catch (NumberFormatException unused) {
        }
        String strValueOf = String.valueOf(str);
        u.m(f49701i, strValueOf.length() != 0 ? "Ignoring unknown alignment: ".concat(strValueOf) : new String("Ignoring unknown alignment: "));
        return -1;
    }

    private static boolean e(String str) {
        try {
            int i10 = Integer.parseInt(str);
            return i10 == 1 || i10 == -1;
        } catch (NumberFormatException e10) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 33);
            sb2.append("Failed to parse boolean value: '");
            sb2.append(str);
            sb2.append("'");
            u.n(f49701i, sb2.toString(), e10);
            return false;
        }
    }

    @l
    @p0
    public static Integer f(String str) {
        try {
            long j10 = str.startsWith("&H") ? Long.parseLong(str.substring(2), 16) : Long.parseLong(str);
            com.google.android.exoplayer2.util.a.a(j10 <= KeyboardMap.kValueMask);
            return Integer.valueOf(Color.argb(Ints.d(((j10 >> 24) & 255) ^ 255), Ints.d(j10 & 255), Ints.d((j10 >> 8) & 255), Ints.d((j10 >> 16) & 255)));
        } catch (IllegalArgumentException e10) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 36);
            sb2.append("Failed to parse color expression: '");
            sb2.append(str);
            sb2.append("'");
            u.n(f49701i, sb2.toString(), e10);
            return null;
        }
    }

    private static float g(String str) {
        try {
            return Float.parseFloat(str);
        } catch (NumberFormatException e10) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 29);
            sb2.append("Failed to parse font size: '");
            sb2.append(str);
            sb2.append("'");
            u.n(f49701i, sb2.toString(), e10);
            return -3.4028235E38f;
        }
    }
}
