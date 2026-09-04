package com.max.mediaselector.lib.entity;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.n0;
import bb.c;
import com.max.mediaselector.lib.config.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.io.File;
import java.io.Serializable;
import z5.g;

/* JADX INFO: loaded from: classes2.dex */
public class LocalMedia implements Parcelable, Serializable {
    public static final Parcelable.Creator<LocalMedia> CREATOR = new a();
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 7229618150658705070L;
    private String A;
    private long B;
    private long C;
    private String D;
    private boolean E;
    private boolean F;
    private boolean G;
    private LocalMedia H;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f75189b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f75190c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f75191d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f75192e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f75193f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f75194g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f75195h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f75196i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f75197j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f75198k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f75199l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f75200m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f75201n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f75202o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f75203p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f75204q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f75205r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f75206s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f75207t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f75208u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f75209v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private float f75210w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private long f75211x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f75212y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private String f75213z;

    public class a implements Parcelable.Creator<LocalMedia> {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        public LocalMedia a(Parcel parcel) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{parcel}, this, changeQuickRedirect, false, c.l.Om, new Class[]{Parcel.class}, LocalMedia.class);
            return patchProxyResultProxy.isSupported ? (LocalMedia) patchProxyResultProxy.result : new LocalMedia(parcel);
        }

        public LocalMedia[] b(int i10) {
            return new LocalMedia[i10];
        }

        /* JADX WARN: Type inference failed for: r9v2, types: [com.max.mediaselector.lib.entity.LocalMedia, java.lang.Object] */
        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ LocalMedia createFromParcel(Parcel parcel) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{parcel}, this, changeQuickRedirect, false, c.m.f34596a, new Class[]{Parcel.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a(parcel);
        }

        /* JADX WARN: Type inference failed for: r9v3, types: [com.max.mediaselector.lib.entity.LocalMedia[], java.lang.Object[]] */
        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ LocalMedia[] newArray(int i10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, c.l.Pm, new Class[]{Integer.TYPE}, Object[].class);
            return patchProxyResultProxy.isSupported ? (Object[]) patchProxyResultProxy.result : b(i10);
        }
    }

    public LocalMedia() {
        this.B = -1L;
    }

    public LocalMedia(Parcel parcel) {
        this.B = -1L;
        this.f75189b = parcel.readLong();
        this.f75190c = parcel.readString();
        this.f75191d = parcel.readString();
        this.f75192e = parcel.readString();
        this.f75193f = parcel.readString();
        this.f75194g = parcel.readString();
        this.f75195h = parcel.readString();
        this.f75196i = parcel.readLong();
        this.f75197j = parcel.readByte() != 0;
        this.f75198k = parcel.readByte() != 0;
        this.f75199l = parcel.readInt();
        this.f75200m = parcel.readInt();
        this.f75201n = parcel.readString();
        this.f75202o = parcel.readInt();
        this.f75203p = parcel.readByte() != 0;
        this.f75204q = parcel.readInt();
        this.f75205r = parcel.readInt();
        this.f75206s = parcel.readInt();
        this.f75207t = parcel.readInt();
        this.f75208u = parcel.readInt();
        this.f75209v = parcel.readInt();
        this.f75210w = parcel.readFloat();
        this.f75211x = parcel.readLong();
        this.f75212y = parcel.readByte() != 0;
        this.f75213z = parcel.readString();
        this.A = parcel.readString();
        this.B = parcel.readLong();
        this.C = parcel.readLong();
        this.D = parcel.readString();
        this.E = parcel.readByte() != 0;
        this.F = parcel.readByte() != 0;
        this.G = parcel.readByte() != 0;
    }

    public static LocalMedia a(String str, String str2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2}, null, changeQuickRedirect, true, c.l.Bm, new Class[]{String.class, String.class}, LocalMedia.class);
        if (patchProxyResultProxy.isSupported) {
            return (LocalMedia) patchProxyResultProxy.result;
        }
        LocalMedia localMedia = new LocalMedia();
        localMedia.M0(str);
        localMedia.F0(str2);
        return localMedia;
    }

    public static LocalMedia a0(long j10, String str, String str2, String str3, String str4, long j11, int i10, String str5, int i11, int i12, long j12, long j13, long j14) {
        Object[] objArr = {new Long(j10), str, str2, str3, str4, new Long(j11), new Integer(i10), str5, new Integer(i11), new Integer(i12), new Long(j12), new Long(j13), new Long(j14)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Long.TYPE;
        Class cls2 = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, c.l.Cm, new Class[]{cls, String.class, String.class, String.class, String.class, cls, cls2, String.class, cls2, cls2, cls, cls, cls}, LocalMedia.class);
        if (patchProxyResultProxy.isSupported) {
            return (LocalMedia) patchProxyResultProxy.result;
        }
        LocalMedia localMedia = new LocalMedia();
        localMedia.C0(j10);
        localMedia.M0(str);
        localMedia.O0(str2);
        localMedia.z0(str3);
        localMedia.L0(str4);
        localMedia.x0(j11);
        localMedia.d0(i10);
        localMedia.F0(str5);
        localMedia.t0(i11);
        localMedia.G1(i12);
        localMedia.Q0(j12);
        localMedia.b0(j13);
        localMedia.r0(j14);
        return localMedia;
    }

    public String A() {
        return this.f75201n;
    }

    public void A0(boolean z10) {
        this.F = z10;
    }

    public int B() {
        return this.f75200m;
    }

    public String C() {
        return this.f75192e;
    }

    public void C0(long j10) {
        this.f75189b = j10;
    }

    public String D() {
        return this.A;
    }

    public void D0(boolean z10) {
        this.E = z10;
    }

    public String E() {
        return this.f75190c;
    }

    public int F() {
        return this.f75199l;
    }

    public void F0(String str) {
        this.f75201n = str;
    }

    public String G() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.l.Fm, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return !TextUtils.isEmpty(this.f75193f) ? this.f75193f : this.f75191d;
    }

    public void G0(int i10) {
        this.f75200m = i10;
    }

    public void G1(int i10) {
        this.f75205r = i10;
    }

    public String H() {
        return this.f75191d;
    }

    public Uri I() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.l.Hm, new Class[0], Uri.class);
        if (patchProxyResultProxy.isSupported) {
            return (Uri) patchProxyResultProxy.result;
        }
        String str = this.f75191d;
        if (!TextUtils.isEmpty(this.f75193f)) {
            str = this.f75193f;
        }
        return (f.c(str) || f.g(str)) ? Uri.parse(str) : Uri.fromFile(new File(str));
    }

    public void I0(boolean z10) {
        this.f75212y = z10;
    }

    public String K() {
        return this.f75195h;
    }

    public void K0(String str) {
        this.f75192e = str;
    }

    public long L() {
        return this.f75211x;
    }

    public void L0(String str) {
        this.A = str;
    }

    public boolean M() {
        return this.f75197j;
    }

    public void M0(String str) {
        this.f75190c = str;
    }

    public boolean N() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.l.Jm, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        return this.f75203p && !TextUtils.isEmpty(h());
    }

    public void N0(int i10) {
        this.f75199l = i10;
    }

    public boolean O() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.l.Im, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        return this.f75198k && !TextUtils.isEmpty(u());
    }

    public void O0(String str) {
        this.f75191d = str;
    }

    public boolean P() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.l.Lm, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        return this.G && !TextUtils.isEmpty(u());
    }

    public void P0(String str) {
        this.f75195h = str;
    }

    public void Q0(long j10) {
        this.f75211x = j10;
    }

    public boolean T() {
        return this.F;
    }

    public boolean U() {
        return this.E;
    }

    public boolean W() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.l.Km, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        return this.f75212y && !TextUtils.isEmpty(C());
    }

    public boolean X() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.l.Mm, new Class[0], Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : !TextUtils.isEmpty(K());
    }

    public String b() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.l.Em, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        if (N()) {
            return h();
        }
        if (O()) {
            return u();
        }
        return X() ? K() : E();
    }

    public void b0(long j10) {
        this.B = j10;
    }

    public long c() {
        return this.B;
    }

    public void c0(boolean z10) {
        this.f75197j = z10;
    }

    public int d() {
        return this.f75202o;
    }

    public void d0(int i10) {
        this.f75202o = i10;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public void e0(String str) {
        this.f75193f = str;
    }

    public boolean equals(Object obj) {
        boolean z10 = true;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, c.l.Dm, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocalMedia)) {
            return false;
        }
        LocalMedia localMedia = (LocalMedia) obj;
        if (!TextUtils.equals(E(), localMedia.E()) && z() != localMedia.z()) {
            z10 = false;
        }
        if (!z10) {
            localMedia = null;
        }
        this.H = localMedia;
        return z10;
    }

    public LocalMedia f() {
        return this.H;
    }

    public void f0(boolean z10) {
        this.f75203p = z10;
    }

    public void g0(int i10) {
        this.f75207t = i10;
    }

    public int getHeight() {
        return this.f75205r;
    }

    public int getWidth() {
        return this.f75204q;
    }

    public String h() {
        return this.f75193f;
    }

    public int j() {
        return this.f75207t;
    }

    public void j0(int i10) {
        this.f75206s = i10;
    }

    public int k() {
        return this.f75206s;
    }

    public void k0(int i10) {
        this.f75208u = i10;
    }

    public Uri l() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.l.Gm, new Class[0], Uri.class);
        if (patchProxyResultProxy.isSupported) {
            return (Uri) patchProxyResultProxy.result;
        }
        String str = this.f75191d;
        if (!TextUtils.isEmpty(this.f75193f)) {
            str = this.f75193f;
        }
        return (f.c(str) || f.g(str)) ? Uri.parse(str) : Uri.fromFile(new File(str));
    }

    public void l0(int i10) {
        this.f75209v = i10;
    }

    public void m0(float f10) {
        this.f75210w = f10;
    }

    public int n() {
        return this.f75208u;
    }

    public void n0(String str) {
        this.D = str;
    }

    public int o() {
        return this.f75209v;
    }

    public void o0(boolean z10) {
        this.f75198k = z10;
    }

    public float p() {
        return this.f75210w;
    }

    public void p0(String str) {
        this.f75194g = str;
    }

    public String r() {
        return this.D;
    }

    public void r0(long j10) {
        this.C = j10;
    }

    public void t0(int i10) {
        this.f75204q = i10;
    }

    @n0
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.l.Nm, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "LocalMedia { id='" + this.f75189b + "'path='" + this.f75190c + "'realPath='" + this.f75191d + "'originalPath='" + this.f75192e + "'compressPath='" + this.f75193f + "'mimeType='" + this.f75201n + "'fileName='" + this.f75213z + "'height='" + this.f75205r + "'width='" + this.f75204q + "'parentFolderName='" + this.A + '\'' + g.f141884d;
    }

    public String u() {
        return this.f75194g;
    }

    public long v() {
        return this.C;
    }

    public long w() {
        return this.f75196i;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        if (PatchProxy.proxy(new Object[]{parcel, new Integer(i10)}, this, changeQuickRedirect, false, c.l.Am, new Class[]{Parcel.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        parcel.writeLong(this.f75189b);
        parcel.writeString(this.f75190c);
        parcel.writeString(this.f75191d);
        parcel.writeString(this.f75192e);
        parcel.writeString(this.f75193f);
        parcel.writeString(this.f75194g);
        parcel.writeString(this.f75195h);
        parcel.writeLong(this.f75196i);
        parcel.writeByte(this.f75197j ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f75198k ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f75199l);
        parcel.writeInt(this.f75200m);
        parcel.writeString(this.f75201n);
        parcel.writeInt(this.f75202o);
        parcel.writeByte(this.f75203p ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f75204q);
        parcel.writeInt(this.f75205r);
        parcel.writeInt(this.f75206s);
        parcel.writeInt(this.f75207t);
        parcel.writeInt(this.f75208u);
        parcel.writeInt(this.f75209v);
        parcel.writeFloat(this.f75210w);
        parcel.writeLong(this.f75211x);
        parcel.writeByte(this.f75212y ? (byte) 1 : (byte) 0);
        parcel.writeString(this.f75213z);
        parcel.writeString(this.A);
        parcel.writeLong(this.B);
        parcel.writeLong(this.C);
        parcel.writeString(this.D);
        parcel.writeByte(this.E ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.F ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.G ? (byte) 1 : (byte) 0);
    }

    public void x0(long j10) {
        this.f75196i = j10;
    }

    public String y() {
        return this.f75213z;
    }

    public void y0(boolean z10) {
        this.G = z10;
    }

    public long z() {
        return this.f75189b;
    }

    public void z0(String str) {
        this.f75213z = str;
    }
}
