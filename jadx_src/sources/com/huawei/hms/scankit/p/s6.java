package com.huawei.hms.scankit.p;

import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.scankit.aiscan.common.BarcodeFormat;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: Result.java */
/* JADX INFO: loaded from: classes7.dex */
public final class s6 implements Parcelable {
    public static final Parcelable.Creator<s6> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f62338a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f62339b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f62340c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private u6[] f62341d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private BarcodeFormat f62342e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f62343f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f62344g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f62345h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final float f62346i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f62347j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private List<Rect> f62348k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f62349l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f62350m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private List<Rect> f62351n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f62352o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private long f62353p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f62354q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f62355r;

    /* JADX INFO: compiled from: Result.java */
    public class a implements Parcelable.Creator<s6> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public s6 createFromParcel(Parcel parcel) {
            return new s6(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public s6[] newArray(int i10) {
            return new s6[i10];
        }
    }

    public s6(float f10) {
        this.f62344g = false;
        this.f62354q = false;
        this.f62355r = false;
        this.f62346i = f10;
        this.f62338a = null;
        this.f62339b = new byte[0];
        this.f62340c = 0;
        this.f62341d = new u6[0];
        this.f62342e = BarcodeFormat.NONE;
        this.f62343f = 0L;
        this.f62345h = false;
        this.f62347j = 0;
        this.f62349l = false;
        this.f62350m = 0;
        this.f62348k = new ArrayList();
        this.f62351n = new ArrayList();
    }

    public s6(float f10, boolean z10) {
        this.f62344g = false;
        this.f62354q = false;
        this.f62355r = false;
        this.f62346i = f10;
        this.f62338a = null;
        this.f62339b = new byte[0];
        this.f62340c = 0;
        this.f62341d = new u6[0];
        this.f62342e = BarcodeFormat.NONE;
        this.f62343f = 0L;
        this.f62345h = false;
        this.f62347j = 0;
        this.f62349l = false;
        this.f62350m = 0;
        this.f62355r = z10;
        this.f62348k = new ArrayList();
        this.f62351n = new ArrayList();
    }

    protected s6(Parcel parcel) {
        this.f62344g = false;
        this.f62354q = false;
        this.f62355r = false;
        this.f62338a = parcel.readString();
        this.f62339b = parcel.createByteArray();
        this.f62340c = parcel.readInt();
        this.f62341d = (u6[]) parcel.createTypedArray(u6.CREATOR);
        this.f62342e = (BarcodeFormat) parcel.readParcelable(s6.class.getClassLoader());
        this.f62343f = parcel.readLong();
        this.f62344g = parcel.readInt() == 1;
        this.f62345h = parcel.readInt() == 1;
        this.f62346i = parcel.readFloat();
        this.f62347j = parcel.readInt();
        if (this.f62348k == null) {
            this.f62348k = new ArrayList();
        }
        parcel.readList(this.f62348k, s6.class.getClassLoader());
        this.f62352o = parcel.readLong();
        this.f62353p = parcel.readLong();
        this.f62354q = parcel.readInt() == 1;
    }

    public s6(String str, byte[] bArr, int i10, u6[] u6VarArr, BarcodeFormat barcodeFormat, long j10) {
        this.f62344g = false;
        this.f62354q = false;
        this.f62355r = false;
        this.f62338a = str;
        this.f62339b = bArr;
        this.f62340c = i10;
        this.f62341d = u6VarArr;
        this.f62342e = barcodeFormat;
        this.f62343f = j10;
        this.f62346i = 1.0f;
        this.f62345h = false;
    }

    public s6(String str, byte[] bArr, u6[] u6VarArr, BarcodeFormat barcodeFormat) {
        this(str, bArr, u6VarArr, barcodeFormat, System.currentTimeMillis());
    }

    public s6(String str, byte[] bArr, u6[] u6VarArr, BarcodeFormat barcodeFormat, long j10) {
        this(str, bArr, bArr == null ? 0 : bArr.length * 8, u6VarArr, barcodeFormat, j10);
    }

    public void a() {
        this.f62341d = new u6[0];
    }

    public void a(float f10) {
        if (f10 < 20.0f) {
            this.f62347j = 0;
            return;
        }
        if (f10 < 50.0f) {
            this.f62347j = 2;
            return;
        }
        if (f10 < 90.0f) {
            this.f62347j = 1;
            return;
        }
        if (f10 < 140.0f) {
            this.f62347j = 0;
        } else if (f10 < 190.0f) {
            this.f62347j = -1;
        } else if (f10 <= 255.0f) {
            this.f62347j = -2;
        }
    }

    public void a(int i10) {
        this.f62350m = i10;
    }

    public void a(long j10) {
        this.f62353p = j10;
    }

    public void a(i2 i2Var) {
        int iD = (int) i2Var.d();
        int iE = (int) i2Var.e();
        this.f62348k.add(new Rect(iD, iE, ((int) i2Var.f()) + iD, ((int) i2Var.c()) + iE));
    }

    public void a(boolean z10) {
        this.f62354q = z10;
    }

    public void a(u6[] u6VarArr) {
        u6[] u6VarArr2 = this.f62341d;
        if (u6VarArr2 == null) {
            this.f62341d = u6VarArr;
            return;
        }
        if (u6VarArr == null || u6VarArr.length <= 0) {
            return;
        }
        u6[] u6VarArr3 = new u6[u6VarArr2.length + u6VarArr.length];
        System.arraycopy(u6VarArr2, 0, u6VarArr3, 0, u6VarArr2.length);
        System.arraycopy(u6VarArr, 0, u6VarArr3, u6VarArr2.length, u6VarArr.length);
        this.f62341d = u6VarArr3;
    }

    public long b() {
        return this.f62353p;
    }

    public void b(float f10) {
        if (f10 < 50.0f) {
            this.f62350m = 2;
            return;
        }
        if (f10 < 90.0f) {
            this.f62350m = 1;
            return;
        }
        if (f10 < 140.0f) {
            this.f62350m = 0;
        } else if (f10 < 190.0f) {
            this.f62350m = -1;
        } else if (f10 <= 255.0f) {
            this.f62350m = -2;
        }
    }

    public void b(long j10) {
        this.f62352o = j10;
    }

    public void b(i2 i2Var) {
        int iD = (int) i2Var.d();
        int iE = (int) i2Var.e();
        this.f62351n.add(new Rect(iD, iE, ((int) i2Var.f()) + iD, ((int) i2Var.c()) + iE));
    }

    public void b(boolean z10) {
        this.f62349l = z10;
    }

    public void b(u6[] u6VarArr) {
        this.f62341d = u6VarArr;
    }

    public BarcodeFormat c() {
        return this.f62342e;
    }

    public void c(boolean z10) {
        this.f62344g = z10;
    }

    public List<Rect> d() {
        return this.f62348k;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public long e() {
        return this.f62352o;
    }

    public int f() {
        return this.f62347j;
    }

    public List<Rect> g() {
        return this.f62351n;
    }

    public int h() {
        return this.f62350m;
    }

    public byte[] i() {
        return this.f62339b;
    }

    public u6[] j() {
        return this.f62341d;
    }

    public String k() {
        return this.f62338a;
    }

    public float l() {
        return this.f62346i;
    }

    public boolean m() {
        return this.f62354q;
    }

    public boolean n() {
        return this.f62349l;
    }

    public boolean o() {
        return this.f62355r;
    }

    public boolean p() {
        return this.f62344g;
    }

    public String toString() {
        return this.f62338a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f62338a);
        parcel.writeByteArray(this.f62339b);
        parcel.writeInt(this.f62340c);
        parcel.writeTypedArray(this.f62341d, i10);
        parcel.writeParcelable(this.f62342e, i10);
        parcel.writeLong(this.f62343f);
        parcel.writeInt(this.f62344g ? 1 : 0);
        parcel.writeInt(this.f62345h ? 1 : 0);
        parcel.writeFloat(this.f62346i);
        parcel.writeInt(this.f62347j);
        parcel.writeList(this.f62348k);
        parcel.writeLong(this.f62352o);
        parcel.writeLong(this.f62353p);
        parcel.writeInt(this.f62354q ? 1 : 0);
    }
}
