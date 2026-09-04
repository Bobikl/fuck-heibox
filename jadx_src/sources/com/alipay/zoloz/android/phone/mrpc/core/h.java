package com.alipay.zoloz.android.phone.mrpc.core;

import android.text.format.Time;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: HttpDateTime.java */
/* JADX INFO: loaded from: classes6.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f39695a = "([0-9]{1,2})[- ]([A-Za-z]{3,9})[- ]([0-9]{2,4})[ ]([0-9]{1,2}:[0-9][0-9]:[0-9][0-9])";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Pattern f39697c = Pattern.compile(f39695a);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f39696b = "[ ]([A-Za-z]{3,9})[ ]+([0-9]{1,2})[ ]([0-9]{1,2}:[0-9][0-9]:[0-9][0-9])[ ]([0-9]{2,4})";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Pattern f39698d = Pattern.compile(f39696b);

    /* JADX INFO: compiled from: HttpDateTime.java */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f39699a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f39700b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f39701c;

        a(int i10, int i11, int i12) {
            this.f39699a = i10;
            this.f39700b = i11;
            this.f39701c = i12;
        }
    }

    private static int a(String str) {
        return str.length() == 2 ? ((str.charAt(0) - '0') * 10) + (str.charAt(1) - '0') : str.charAt(0) - '0';
    }

    private static int b(String str) {
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

    private static a c(String str) {
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

    public static long e(String str) throws IllegalArgumentException {
        int iB;
        int iD;
        int iA;
        a aVarC;
        int i10;
        int i11;
        int i12;
        Matcher matcher = f39697c.matcher(str);
        if (matcher.find()) {
            iA = a(matcher.group(1));
            iB = b(matcher.group(2));
            iD = d(matcher.group(3));
            aVarC = c(matcher.group(4));
        } else {
            Matcher matcher2 = f39698d.matcher(str);
            if (!matcher2.find()) {
                throw new IllegalArgumentException();
            }
            iB = b(matcher2.group(1));
            int iA2 = a(matcher2.group(2));
            a aVarC2 = c(matcher2.group(3));
            iD = d(matcher2.group(4));
            iA = iA2;
            aVarC = aVarC2;
        }
        if (iD >= 2038) {
            i11 = 0;
            i12 = 2038;
            i10 = 1;
        } else {
            i10 = iA;
            i11 = iB;
            i12 = iD;
        }
        Time time = new Time("UTC");
        time.set(aVarC.f39701c, aVarC.f39700b, aVarC.f39699a, i10, i11, i12);
        return time.toMillis(false);
    }
}
