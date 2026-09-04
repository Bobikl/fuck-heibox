package com.bun.miitmdid;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes6.dex */
public class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f42155a = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f42156b = 4;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f42157c = 5;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f42158d = 6;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f42159e = 7;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public IBinder f42160f;

    public x() {
        Method declaredMethod;
        this.f42160f = null;
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            if (!((String) cls.getMethod("get", String.class, String.class).invoke(cls, "ro.build.uiversion", "")).contains("360UI") || (declaredMethod = Class.forName("android.os.ServiceManager").getDeclaredMethod("getService", String.class)) == null) {
                return;
            }
            this.f42160f = (IBinder) declaredMethod.invoke(null, "qikuid");
        } catch (Exception e10) {
            Log.e("QikuIdmanager", "Failure get qikuid service", e10);
        }
    }

    public String a() {
        if (this.f42160f == null) {
            return null;
        }
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            this.f42160f.transact(f42158d, parcelObtain, parcelObtain2, 0);
            return parcelObtain2.readString();
        } catch (RemoteException e10) {
            e10.printStackTrace();
            return null;
        } finally {
            parcelObtain.recycle();
            parcelObtain2.recycle();
        }
    }

    public String b() {
        if (this.f42160f == null) {
            return null;
        }
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            this.f42160f.transact(f42156b, parcelObtain, parcelObtain2, 0);
            return parcelObtain2.readString();
        } catch (RemoteException e10) {
            e10.printStackTrace();
            return null;
        } finally {
            parcelObtain.recycle();
            parcelObtain2.recycle();
        }
    }

    public String c() {
        if (this.f42160f == null) {
            return null;
        }
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            this.f42160f.transact(f42157c, parcelObtain, parcelObtain2, 0);
            return parcelObtain2.readString();
        } catch (RemoteException e10) {
            e10.printStackTrace();
            return null;
        } finally {
            parcelObtain.recycle();
            parcelObtain2.recycle();
        }
    }

    public boolean d() {
        if (this.f42160f != null) {
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                this.f42160f.transact(9, parcelObtain, parcelObtain2, 0);
                return parcelObtain2.readBoolean();
            } catch (RemoteException e10) {
                e10.printStackTrace();
                return false;
            } finally {
                parcelObtain.recycle();
                parcelObtain2.recycle();
            }
        }
        return false;
    }

    public boolean e() {
        if (this.f42160f != null) {
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                this.f42160f.transact(f42155a, parcelObtain, parcelObtain2, 0);
                return parcelObtain2.readInt() == 1;
            } catch (RemoteException e10) {
                e10.printStackTrace();
            } finally {
                parcelObtain.recycle();
                parcelObtain2.recycle();
            }
        }
        return false;
    }

    public void f() {
        if (this.f42160f != null) {
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                try {
                    this.f42160f.transact(f42159e, parcelObtain, parcelObtain2, 0);
                } catch (RemoteException e10) {
                    e10.printStackTrace();
                }
            } finally {
                parcelObtain.recycle();
                parcelObtain2.recycle();
            }
        }
    }
}
