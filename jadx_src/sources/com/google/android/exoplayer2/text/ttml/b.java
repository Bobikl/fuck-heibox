package com.google.android.exoplayer2.text.ttml;

import android.text.TextUtils;
import androidx.annotation.p0;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import com.google.common.collect.l1;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: TextEmphasis.java */
/* JADX INFO: loaded from: classes7.dex */
public final class b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f49753d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f49754e = -2;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Pattern f49755f = Pattern.compile("\\s+");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final ImmutableSet<String> f49756g = ImmutableSet.F("auto", "none");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final ImmutableSet<String> f49757h = ImmutableSet.G(d.f49816x0, d.f49818y0, d.f49820z0);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final ImmutableSet<String> f49758i = ImmutableSet.F(d.A0, "open");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final ImmutableSet<String> f49759j = ImmutableSet.G(d.f49785d0, d.f49784c0, d.f49786e0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f49760a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f49761b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f49762c;

    /* JADX INFO: compiled from: TextEmphasis.java */
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    private b(int i10, int i11, int i12) {
        this.f49760a = i10;
        this.f49761b = i11;
        this.f49762c = i12;
    }

    @p0
    public static b a(@p0 String str) {
        if (str == null) {
            return null;
        }
        String strG = com.google.common.base.a.g(str.trim());
        if (strG.isEmpty()) {
            return null;
        }
        return b(ImmutableSet.y(TextUtils.split(strG, f49755f)));
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0042  */
    /* JADX WARN: Code duplicated, block: B:37:0x0084  */
    /* JADX WARN: Code duplicated, block: B:60:0x00d6  */
    private static b b(ImmutableSet<String> immutableSet) {
        byte b10;
        int i10;
        byte b11;
        String str = (String) l1.v(Sets.n(f49759j, immutableSet), d.f49786e0);
        int iHashCode = str.hashCode();
        int i11 = 2;
        int i12 = -1;
        byte b12 = 1;
        if (iHashCode != -1392885889) {
            if (iHashCode != -1106037339) {
                if (iHashCode == 92734940 && str.equals(d.f49785d0)) {
                    b10 = 0;
                } else {
                    b10 = -1;
                }
            } else if (str.equals(d.f49786e0)) {
                b10 = 1;
            } else {
                b10 = -1;
            }
        } else if (str.equals(d.f49784c0)) {
            b10 = 2;
        } else {
            b10 = -1;
        }
        if (b10 != 0) {
            i10 = b10 != 1 ? 1 : -2;
        } else {
            i10 = 2;
        }
        Sets.l lVarN = Sets.n(f49756g, immutableSet);
        if (!lVarN.isEmpty()) {
            String str2 = (String) lVarN.iterator().next();
            int iHashCode2 = str2.hashCode();
            if (iHashCode2 != 3005871) {
                if (iHashCode2 == 3387192 && str2.equals("none")) {
                    b12 = 0;
                } else {
                    b12 = -1;
                }
            } else if (!str2.equals("auto")) {
                b12 = -1;
            }
            return new b(b12 == 0 ? 0 : -1, 0, i10);
        }
        Sets.l lVarN2 = Sets.n(f49758i, immutableSet);
        Sets.l lVarN3 = Sets.n(f49757h, immutableSet);
        if (lVarN2.isEmpty() && lVarN3.isEmpty()) {
            return new b(-1, 0, i10);
        }
        String str3 = (String) l1.v(lVarN2, d.A0);
        int iHashCode3 = str3.hashCode();
        if (iHashCode3 != -1274499742) {
            if (iHashCode3 == 3417674 && str3.equals("open")) {
                b11 = 0;
            } else {
                b11 = -1;
            }
        } else if (str3.equals(d.A0)) {
            b11 = 1;
        } else {
            b11 = -1;
        }
        int i13 = b11 != 0 ? 1 : 2;
        String str4 = (String) l1.v(lVarN3, d.f49820z0);
        int iHashCode4 = str4.hashCode();
        if (iHashCode4 != -1360216880) {
            if (iHashCode4 != -905816648) {
                if (iHashCode4 == 99657 && str4.equals(d.f49816x0)) {
                    i12 = 0;
                }
            } else if (str4.equals(d.f49818y0)) {
                i12 = 1;
            }
        } else if (str4.equals(d.f49820z0)) {
            i12 = 2;
        }
        if (i12 != 0) {
            i11 = i12 != 1 ? 1 : 3;
        }
        return new b(i11, i13, i10);
    }
}
