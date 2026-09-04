package com.bun.miitmdid;

import android.content.Context;
import com.bun.miitmdid.interfaces.IIdProvider;

/* JADX INFO: loaded from: classes6.dex */
public class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static p f42135a = new p();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public IIdProvider f42136b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c f42137c;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f42138a;

        static {
            int[] iArr = new int[c.values().length];
            f42138a = iArr;
            try {
                iArr[c.ASUS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f42138a[c.FREEMEOS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f42138a[c.HUAWEI.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f42138a[c.HONOR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f42138a[c.LENOVO.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f42138a[c.MOTO.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f42138a[c.MEIZU.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f42138a[c.CHUANGLIAN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f42138a[c.CHINATELECOM.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f42138a[c.NUBIA.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f42138a[c.OPPO.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f42138a[c.ONEPLUS.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f42138a[c.REALME.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f42138a[c.SAMSUNG.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f42138a[c.VIVO.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f42138a[c.XIAOMI.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f42138a[c.BLACKSHARK.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f42138a[c.ZTE.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f42138a[c.PRIZE.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f42138a[c.COOLPAD.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f42138a[c.EEBBK.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f42138a[c.OS360.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f42138a[c.XIAODU.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
        }
    }

    public static native p a();

    public static native boolean d();

    public native IIdProvider a(Context context);

    public native IIdProvider a(Context context, c cVar);

    public native c b(Context context);

    public final native boolean b();

    public native boolean c();
}
