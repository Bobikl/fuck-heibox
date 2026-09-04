package com.alipay.deviceid.module.x;

import android.text.format.Time;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: HttpDateTime.java */
/* JADX INFO: loaded from: classes6.dex */
public final class av {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Pattern f38247a = Pattern.compile("([0-9]{1,2})[- ]([A-Za-z]{3,9})[- ]([0-9]{2,4})[ ]([0-9]{1,2}:[0-9][0-9]:[0-9][0-9])");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Pattern f38248b = Pattern.compile("[ ]([A-Za-z]{3,9})[ ]+([0-9]{1,2})[ ]([0-9]{1,2}:[0-9][0-9]:[0-9][0-9])[ ]([0-9]{2,4})");

    /* JADX INFO: compiled from: HttpDateTime.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f38249a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f38250b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f38251c;

        a(int i10, int i11, int i12) {
            this.f38249a = i10;
            this.f38250b = i11;
            this.f38251c = i12;
        }
    }

    public static long a(String str) {
        int iC;
        int iD;
        int iB;
        a aVarE;
        int i10;
        int i11;
        int i12;
        Matcher matcher = f38247a.matcher(str);
        if (matcher.find()) {
            iB = b(matcher.group(1));
            iC = c(matcher.group(2));
            iD = d(matcher.group(3));
            aVarE = e(matcher.group(4));
        } else {
            Matcher matcher2 = f38248b.matcher(str);
            if (!matcher2.find()) {
                throw new IllegalArgumentException();
            }
            iC = c(matcher2.group(1));
            int iB2 = b(matcher2.group(2));
            a aVarE2 = e(matcher2.group(3));
            iD = d(matcher2.group(4));
            iB = iB2;
            aVarE = aVarE2;
        }
        if (iD >= 2038) {
            i11 = 0;
            i12 = 2038;
            i10 = 1;
        } else {
            i10 = iB;
            i11 = iC;
            i12 = iD;
        }
        Time time = new Time("UTC");
        time.set(aVarE.f38251c, aVarE.f38250b, aVarE.f38249a, i10, i11, i12);
        return time.toMillis(false);
    }

    private static int b(String str) {
        return str.length() == 2 ? ((str.charAt(0) - '0') * 10) + (str.charAt(1) - '0') : str.charAt(0) - '0';
    }

    private static int c(String str) {
        int lowerCase = ((Character.toLowerCase(str.charAt(0)) + Character.toLowerCase(str.charAt(1))) + Character.toLowerCase(str.charAt(2))) - 291;
        if (lowerCase == 9) {
            return 11;
        }
        if (lowerCase == 10) {
            return 1;
        }
        if (lowerCase == 22) {
            return 0;
        }
        if (lowerCase == 26) {
            return 7;
        }
        if (lowerCase == 29) {
            return 2;
        }
        if (lowerCase == 32) {
            return 3;
        }
        if (lowerCase == 40) {
            return 6;
        }
        if (lowerCase == 42) {
            return 5;
        }
        if (lowerCase == 48) {
            return 10;
        }
        switch (lowerCase) {
            case 35:
                return 9;
            case 36:
                return 4;
            case 37:
                return 8;
            default:
                throw new IllegalArgumentException();
        }
    }

    private static int d(String str) {
        if (str.length() == 2) {
            int iCharAt = ((str.charAt(0) - '0') * 10) + (str.charAt(1) - '0');
            return iCharAt >= 70 ? iCharAt + bb.c.b.Dx : iCharAt + 2000;
        }
        if (str.length() == 3) {
            return ((str.charAt(0) - '0') * 100) + ((str.charAt(1) - '0') * 10) + (str.charAt(2) - '0') + bb.c.b.Dx;
        }
        return str.length() == 4 ? ((str.charAt(0) - '0') * 1000) + ((str.charAt(1) - '0') * 100) + ((str.charAt(2) - '0') * 10) + (str.charAt(3) - '0') : bb.c.b.Wy;
    }

    private static a e(String str) {
        int i10;
        int iCharAt = str.charAt(0) - '0';
        if (str.charAt(1) != ':') {
            i10 = 2;
            iCharAt = (iCharAt * 10) + (str.charAt(1) - '0');
        } else {
            i10 = 1;
        }
        int i11 = i10 + 1;
        int i12 = i11 + 1;
        int i13 = i12 + 1 + 1;
        return new a(iCharAt, ((str.charAt(i11) - '0') * 10) + (str.charAt(i12) - '0'), ((str.charAt(i13) - '0') * 10) + (str.charAt(i13 + 1) - '0'));
    }
}
