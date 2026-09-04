package com.igexin.push.util;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Process;
import android.util.Base64;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes6.dex */
public class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f64066a = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static String f64067b = "GT_PM";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Object f64068c;

    private static int a() {
        int i10 = f64066a;
        if (i10 != Integer.MIN_VALUE) {
            return i10;
        }
        if (com.igexin.push.core.d.f63671e != null) {
            try {
                Class<?> cls = Class.forName(new String(Base64.decode("YW5kcm9pZC5vcy5Vc2VySGFuZGxl", 0)));
                Method declaredMethod = cls.getDeclaredMethod(new String(Base64.decode("Z2V0VXNlcklk", 0)), Integer.TYPE);
                declaredMethod.setAccessible(true);
                int iIntValue = ((Integer) declaredMethod.invoke(cls, Integer.valueOf(Process.myUid()))).intValue();
                f64066a = iIntValue;
                return iIntValue;
            } catch (Throwable th2) {
                com.igexin.a.a.c.b.b(f64067b, th2.getMessage());
            }
        }
        return 0;
    }

    private static PackageInfo a(Object obj, String str, int i10) {
        PackageInfo packageInfo = null;
        try {
            IBinder iBinderAsBinder = ((IInterface) obj).asBinder();
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                parcelObtain.writeInterfaceToken(iBinderAsBinder.getInterfaceDescriptor());
                parcelObtain.writeString(str);
                parcelObtain.writeLong(i10);
                parcelObtain.writeInt(a());
                iBinderAsBinder.transact(3, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                packageInfo = parcelObtain2.readInt() != 0 ? (PackageInfo) PackageInfo.CREATOR.createFromParcel(parcelObtain2) : null;
            } finally {
                parcelObtain2.recycle();
                parcelObtain.recycle();
            }
        } catch (Throwable th2) {
            com.igexin.a.a.c.b.a(f64067b + th2.toString(), new Object[0]);
        }
        return packageInfo;
    }

    public static PackageInfo a(String str, int i10) throws PackageManager.NameNotFoundException {
        PackageInfo packageInfoA = a(str, i10, a());
        if (packageInfoA != null) {
            return packageInfoA;
        }
        throw new PackageManager.NameNotFoundException(str + " not found");
    }

    private static PackageInfo a(String str, int i10, int i11) {
        PackageInfo packageInfoA;
        try {
            if (f64068c == null) {
                f64068c = Class.forName(new String(Base64.decode("YW5kcm9pZC5hcHAuQWN0aXZpdHlUaHJlYWQ=", 0))).getMethod(new String(Base64.decode("Z2V0UGFja2FnZU1hbmFnZXI=", 0)), new Class[0]).invoke(null, new Object[0]);
            }
            if (Build.VERSION.SDK_INT >= 33) {
                packageInfoA = a(f64068c, str, i10);
            } else {
                String str2 = new String(Base64.decode("Z2V0UGFja2FnZUluZm8=", 0));
                Class<?> cls = f64068c.getClass();
                Class<?> cls2 = Integer.TYPE;
                packageInfoA = (PackageInfo) cls.getMethod(str2, String.class, cls2, cls2).invoke(f64068c, str, Integer.valueOf(i10), Integer.valueOf(i11));
            }
            return packageInfoA;
        } catch (Throwable th2) {
            com.igexin.a.a.c.b.b(f64067b, th2.getMessage());
            return null;
        }
    }
}
