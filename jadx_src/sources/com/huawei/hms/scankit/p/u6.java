package com.huawei.hms.scankit.p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: ResultPoint.java */
/* JADX INFO: loaded from: classes7.dex */
public class u6 implements Parcelable {
    public static final Parcelable.Creator<u6> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f62421a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f62422b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f62423c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f62424d;

    /* JADX INFO: compiled from: ResultPoint.java */
    public class a implements Parcelable.Creator<u6> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public u6 createFromParcel(Parcel parcel) {
            return new u6(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public u6[] newArray(int i10) {
            return new u6[i10];
        }
    }

    public u6(float f10, float f11) {
        this.f62423c = 0;
        this.f62424d = false;
        this.f62421a = f10;
        this.f62422b = f11;
    }

    public u6(float f10, float f11, int i10) {
        this.f62424d = false;
        this.f62421a = f10;
        this.f62422b = f11;
        this.f62423c = i10;
    }

    public u6(float f10, float f11, boolean z10) {
        this.f62423c = 0;
        this.f62421a = f10;
        this.f62422b = f11;
        this.f62424d = z10;
    }

    protected u6(Parcel parcel) {
        this.f62423c = 0;
        this.f62424d = false;
        this.f62421a = parcel.readFloat();
        this.f62422b = parcel.readFloat();
    }

    public static float a(u6 u6Var, u6 u6Var2) {
        return s4.a(u6Var.f62421a, u6Var.f62422b, u6Var2.f62421a, u6Var2.f62422b);
    }

    private static float a(u6 u6Var, u6 u6Var2, u6 u6Var3) {
        float f10 = u6Var2.f62421a;
        float f11 = u6Var2.f62422b;
        return ((u6Var3.f62421a - f10) * (u6Var.f62422b - f11)) - ((u6Var3.f62422b - f11) * (u6Var.f62421a - f10));
    }

    public static void a(u6[] u6VarArr) {
        float fA = a(u6VarArr[0], u6VarArr[1]);
        float fA2 = a(u6VarArr[1], u6VarArr[2]);
        float fA3 = a(u6VarArr[0], u6VarArr[2]);
        int[] iArrA = a(fA2, fA, fA3);
        int i10 = iArrA[0];
        int i11 = iArrA[1];
        int i12 = iArrA[2];
        u6 u6Var = u6VarArr[i10];
        u6 u6Var2 = u6VarArr[i11];
        u6 u6Var3 = u6VarArr[i12];
        float[] fArr = {fA2, fA3, fA};
        if (r3.f62284j % 2 == 0) {
            int i13 = ((fArr[i11] / fArr[i10]) > 1.1d ? 1 : ((fArr[i11] / fArr[i10]) == 1.1d ? 0 : -1));
        }
        if (a(u6Var2, u6Var, u6Var3) < 0.0f) {
            u6Var2 = u6Var3;
            u6Var3 = u6Var2;
        }
        u6VarArr[0] = u6Var2;
        u6VarArr[1] = u6Var;
        u6VarArr[2] = u6Var3;
    }

    private static int[] a(float f10, float f11, float f12) {
        int i10;
        int i11;
        int i12;
        if (f10 < f11 || f10 < f12) {
            if (f12 < f10 || f12 < f11) {
                if (f10 > f10) {
                    i11 = 1;
                    i10 = 0;
                } else {
                    i10 = 1;
                    i11 = 0;
                }
                i12 = 2;
            } else {
                i12 = 1;
                if (f10 > f11) {
                    i10 = 0;
                    i11 = 2;
                } else {
                    i11 = 0;
                    i10 = 2;
                }
            }
        } else if (f11 > f12) {
            i11 = 1;
            i12 = 0;
            i10 = 2;
        } else {
            i10 = 1;
            i12 = 0;
            i11 = 2;
        }
        return new int[]{i12, i10, i11};
    }

    public int a() {
        return this.f62423c;
    }

    public final float b() {
        return this.f62421a;
    }

    public final float c() {
        return this.f62422b;
    }

    public boolean d() {
        return this.f62424d;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof u6)) {
            return false;
        }
        u6 u6Var = (u6) obj;
        return ((double) Math.abs(this.f62421a - u6Var.f62421a)) < 1.0E-4d && ((double) Math.abs(this.f62422b - u6Var.f62422b)) < 1.0E-4d;
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.f62421a) * 31) + Float.floatToIntBits(this.f62422b);
    }

    public final String toString() {
        return "(" + this.f62421a + ',' + this.f62422b + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeFloat(this.f62421a);
        parcel.writeFloat(this.f62422b);
    }
}
