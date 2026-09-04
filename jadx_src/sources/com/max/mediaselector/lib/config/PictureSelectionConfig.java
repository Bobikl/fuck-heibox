package com.max.mediaselector.lib.config;

import android.os.Parcel;
import android.os.Parcelable;
import com.max.mediaselector.lib.entity.LocalMedia;
import com.max.mediaselector.lib.thread.PictureThreadUtils;
import com.max.mediaselector.lib.utils.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.ArrayList;
import java.util.List;
import oe.k;
import oe.t;
import oe.u;

/* JADX INFO: loaded from: classes2.dex */
public final class PictureSelectionConfig implements Parcelable {
    public static final Parcelable.Creator<PictureSelectionConfig> CREATOR = new a();
    public static me.d W3;
    public static me.a X3;
    public static me.b Y3;
    public static me.f Z3;

    /* JADX INFO: renamed from: a4, reason: collision with root package name */
    public static me.c f75016a4;

    /* JADX INFO: renamed from: b4, reason: collision with root package name */
    public static com.max.mediaselector.lib.style.a f75017b4;

    /* JADX INFO: renamed from: c4, reason: collision with root package name */
    public static oe.d f75018c4;
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: d4, reason: collision with root package name */
    public static u f75019d4;

    /* JADX INFO: renamed from: e4, reason: collision with root package name */
    public static t<LocalMedia> f75020e4;

    /* JADX INFO: renamed from: f4, reason: collision with root package name */
    public static oe.e f75021f4;

    /* JADX INFO: renamed from: g4, reason: collision with root package name */
    public static oe.i f75022g4;

    /* JADX INFO: renamed from: h4, reason: collision with root package name */
    public static oe.j f75023h4;

    /* JADX INFO: renamed from: i4, reason: collision with root package name */
    public static oe.g f75024i4;

    /* JADX INFO: renamed from: j4, reason: collision with root package name */
    public static k f75025j4;

    /* JADX INFO: renamed from: k4, reason: collision with root package name */
    public static oe.f f75026k4;

    /* JADX INFO: renamed from: l4, reason: collision with root package name */
    private static PictureSelectionConfig f75027l4;
    public long A;
    public long B;
    public int C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean G2;
    public boolean G3;
    public boolean H;
    public boolean I;
    public boolean J;
    public int J3;
    public boolean K;
    public boolean K3;
    public boolean L;
    public boolean L3;
    public boolean M;
    public boolean M3;
    public boolean N;
    public boolean N3;
    public boolean O;
    public boolean O3;
    public boolean P;
    public boolean P3;
    public List<String> Q;
    public boolean Q3;
    public List<String> R;
    public boolean R3;
    public boolean S;
    public boolean S3;
    public String T;
    public boolean T3;
    public String U;
    public boolean U3;
    public String V;
    public boolean V3;
    public String W;
    public String X;
    public String Y;
    public String Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public String f75028a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f75029b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public String f75030b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f75031c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public int f75032c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f75033d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f75034e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f75035f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f75036g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f75037h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f75038i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f75039j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f75040k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f75041l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f75042m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f75043n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f75044o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f75045p;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    public boolean f75046p1;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    public int f75047p2;

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    public boolean f75048p3;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f75049q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f75050r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f75051s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f75052t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f75053u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f75054v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f75055w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f75056x;

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    public boolean f75057x1;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    public boolean f75058x2;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public long f75059y;

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    public boolean f75060y1;

    /* JADX INFO: renamed from: y2, reason: collision with root package name */
    public boolean f75061y2;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public long f75062z;

    public class a implements Parcelable.Creator<PictureSelectionConfig> {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        public PictureSelectionConfig a(Parcel parcel) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{parcel}, this, changeQuickRedirect, false, bb.c.l.Pl, new Class[]{Parcel.class}, PictureSelectionConfig.class);
            return patchProxyResultProxy.isSupported ? (PictureSelectionConfig) patchProxyResultProxy.result : new PictureSelectionConfig(parcel);
        }

        public PictureSelectionConfig[] b(int i10) {
            return new PictureSelectionConfig[i10];
        }

        /* JADX WARN: Type inference failed for: r9v2, types: [com.max.mediaselector.lib.config.PictureSelectionConfig, java.lang.Object] */
        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ PictureSelectionConfig createFromParcel(Parcel parcel) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{parcel}, this, changeQuickRedirect, false, bb.c.l.Rl, new Class[]{Parcel.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a(parcel);
        }

        /* JADX WARN: Type inference failed for: r9v3, types: [com.max.mediaselector.lib.config.PictureSelectionConfig[], java.lang.Object[]] */
        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ PictureSelectionConfig[] newArray(int i10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.l.Ql, new Class[]{Integer.TYPE}, Object[].class);
            return patchProxyResultProxy.isSupported ? (Object[]) patchProxyResultProxy.result : b(i10);
        }
    }

    public PictureSelectionConfig() {
        this.V3 = true;
    }

    public PictureSelectionConfig(Parcel parcel) {
        this.V3 = true;
        this.f75029b = parcel.readInt();
        this.f75031c = parcel.readByte() != 0;
        this.f75033d = parcel.readByte() != 0;
        this.f75034e = parcel.readString();
        this.f75035f = parcel.readString();
        this.f75036g = parcel.readString();
        this.f75037h = parcel.readString();
        this.f75038i = parcel.readInt();
        this.f75039j = parcel.readByte() != 0;
        this.f75040k = parcel.readInt();
        this.f75041l = parcel.readInt();
        this.f75042m = parcel.readInt();
        this.f75043n = parcel.readInt();
        this.f75044o = parcel.readInt();
        this.f75045p = parcel.readInt();
        this.f75049q = parcel.readInt();
        this.f75050r = parcel.readInt();
        this.f75051s = parcel.readInt();
        this.f75052t = parcel.readInt();
        this.f75053u = parcel.readInt();
        this.f75054v = parcel.readInt();
        this.f75055w = parcel.readInt();
        this.f75056x = parcel.readInt();
        this.f75059y = parcel.readLong();
        this.f75062z = parcel.readLong();
        this.A = parcel.readLong();
        this.B = parcel.readLong();
        this.C = parcel.readInt();
        this.D = parcel.readByte() != 0;
        this.E = parcel.readByte() != 0;
        this.F = parcel.readByte() != 0;
        this.G = parcel.readByte() != 0;
        this.H = parcel.readByte() != 0;
        this.I = parcel.readByte() != 0;
        this.J = parcel.readByte() != 0;
        this.K = parcel.readByte() != 0;
        this.L = parcel.readByte() != 0;
        this.M = parcel.readByte() != 0;
        this.N = parcel.readByte() != 0;
        this.O = parcel.readByte() != 0;
        this.P = parcel.readByte() != 0;
        this.Q = parcel.createStringArrayList();
        this.R = parcel.createStringArrayList();
        this.S = parcel.readByte() != 0;
        this.T = parcel.readString();
        this.U = parcel.readString();
        this.V = parcel.readString();
        this.W = parcel.readString();
        this.X = parcel.readString();
        this.Y = parcel.readString();
        this.Z = parcel.readString();
        this.f75028a0 = parcel.readString();
        this.f75030b0 = parcel.readString();
        this.f75032c0 = parcel.readInt();
        this.f75046p1 = parcel.readByte() != 0;
        this.f75057x1 = parcel.readByte() != 0;
        this.f75060y1 = parcel.readByte() != 0;
        this.f75047p2 = parcel.readInt();
        this.f75058x2 = parcel.readByte() != 0;
        this.f75061y2 = parcel.readByte() != 0;
        this.G2 = parcel.readByte() != 0;
        this.f75048p3 = parcel.readByte() != 0;
        this.G3 = parcel.readByte() != 0;
        this.J3 = parcel.readInt();
        this.K3 = parcel.readByte() != 0;
        this.L3 = parcel.readByte() != 0;
        this.M3 = parcel.readByte() != 0;
        this.N3 = parcel.readByte() != 0;
        this.O3 = parcel.readByte() != 0;
        this.P3 = parcel.readByte() != 0;
        this.Q3 = parcel.readByte() != 0;
        this.R3 = parcel.readByte() != 0;
        this.S3 = parcel.readByte() != 0;
        this.T3 = parcel.readByte() != 0;
        this.U3 = parcel.readByte() != 0;
        this.V3 = parcel.readByte() != 0;
    }

    public static void a() {
        if (PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, bb.c.l.Ol, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        W3 = null;
        X3 = null;
        Y3 = null;
        Z3 = null;
        f75016a4 = null;
        f75020e4 = null;
        f75018c4 = null;
        f75021f4 = null;
        f75022g4 = null;
        f75023h4 = null;
        f75024i4 = null;
        f75025j4 = null;
        f75019d4 = null;
        f75026k4 = null;
        PictureThreadUtils.f(PictureThreadUtils.k0());
        qe.a.e();
        com.max.mediaselector.lib.magical.a.a();
        qe.a.k(null);
    }

    public static PictureSelectionConfig b() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, bb.c.l.Ml, new Class[0], PictureSelectionConfig.class);
        if (patchProxyResultProxy.isSupported) {
            return (PictureSelectionConfig) patchProxyResultProxy.result;
        }
        PictureSelectionConfig pictureSelectionConfigC = c();
        pictureSelectionConfigC.d();
        return pictureSelectionConfigC;
    }

    public static PictureSelectionConfig c() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, bb.c.l.Nl, new Class[0], PictureSelectionConfig.class);
        if (patchProxyResultProxy.isSupported) {
            return (PictureSelectionConfig) patchProxyResultProxy.result;
        }
        if (f75027l4 == null) {
            synchronized (PictureSelectionConfig.class) {
                if (f75027l4 == null) {
                    PictureSelectionConfig pictureSelectionConfig = new PictureSelectionConfig();
                    f75027l4 = pictureSelectionConfig;
                    pictureSelectionConfig.d();
                }
            }
        }
        return f75027l4;
    }

    public void d() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.Ll, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f75029b = h.c();
        this.f75031c = false;
        this.f75040k = 2;
        f75017b4 = new com.max.mediaselector.lib.style.a();
        this.f75041l = 9;
        this.f75042m = 0;
        this.f75043n = 1;
        this.f75044o = 0;
        this.f75045p = 0;
        this.f75049q = 1;
        this.C = -2;
        this.f75050r = 0;
        this.f75051s = 1000;
        this.f75052t = 0;
        this.f75053u = 0;
        this.f75059y = 0L;
        this.f75062z = 1024L;
        this.A = 0L;
        this.B = 0L;
        this.f75054v = 60;
        this.f75055w = 0;
        this.f75056x = 4;
        this.f75039j = false;
        this.P = false;
        this.D = true;
        this.E = false;
        this.F = true;
        this.G = true;
        this.S = false;
        this.f75033d = false;
        this.H = true;
        this.I = true;
        this.J = true;
        this.O = false;
        this.M = false;
        this.N = false;
        this.f75034e = f.f75139r;
        this.f75035f = ".mp4";
        this.f75036g = "image/jpeg";
        this.f75037h = "video/mp4";
        this.T = "";
        this.U = "";
        this.V = "";
        this.Q = new ArrayList();
        this.W = "";
        this.X = "";
        this.Y = "";
        this.Z = "";
        this.f75028a0 = "";
        this.f75032c0 = 60;
        this.f75046p1 = true;
        this.f75057x1 = false;
        this.f75060y1 = false;
        this.f75047p2 = -1;
        this.f75058x2 = true;
        this.f75061y2 = true;
        this.G2 = true;
        this.f75048p3 = true;
        this.G3 = !o.e();
        this.J3 = h.a();
        this.K3 = false;
        this.f75038i = -1;
        this.L3 = true;
        this.M3 = true;
        this.O3 = false;
        this.P3 = false;
        this.Q3 = false;
        this.R3 = false;
        this.K = true;
        this.L = this.f75029b != h.b();
        this.S3 = false;
        this.N3 = false;
        this.T3 = true;
        this.U3 = false;
        this.V3 = true;
        this.R = new ArrayList();
        this.f75030b0 = "";
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        if (PatchProxy.proxy(new Object[]{parcel, new Integer(i10)}, this, changeQuickRedirect, false, bb.c.l.Kl, new Class[]{Parcel.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        parcel.writeInt(this.f75029b);
        parcel.writeByte(this.f75031c ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f75033d ? (byte) 1 : (byte) 0);
        parcel.writeString(this.f75034e);
        parcel.writeString(this.f75035f);
        parcel.writeString(this.f75036g);
        parcel.writeString(this.f75037h);
        parcel.writeInt(this.f75038i);
        parcel.writeByte(this.f75039j ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f75040k);
        parcel.writeInt(this.f75041l);
        parcel.writeInt(this.f75042m);
        parcel.writeInt(this.f75043n);
        parcel.writeInt(this.f75044o);
        parcel.writeInt(this.f75045p);
        parcel.writeInt(this.f75049q);
        parcel.writeInt(this.f75050r);
        parcel.writeInt(this.f75051s);
        parcel.writeInt(this.f75052t);
        parcel.writeInt(this.f75053u);
        parcel.writeInt(this.f75054v);
        parcel.writeInt(this.f75055w);
        parcel.writeInt(this.f75056x);
        parcel.writeLong(this.f75059y);
        parcel.writeLong(this.f75062z);
        parcel.writeLong(this.A);
        parcel.writeLong(this.B);
        parcel.writeInt(this.C);
        parcel.writeByte(this.D ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.E ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.F ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.G ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.H ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.I ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.J ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.K ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.L ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.M ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.N ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.O ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.P ? (byte) 1 : (byte) 0);
        parcel.writeStringList(this.Q);
        parcel.writeStringList(this.R);
        parcel.writeByte(this.S ? (byte) 1 : (byte) 0);
        parcel.writeString(this.T);
        parcel.writeString(this.U);
        parcel.writeString(this.V);
        parcel.writeString(this.W);
        parcel.writeString(this.X);
        parcel.writeString(this.Y);
        parcel.writeString(this.Z);
        parcel.writeString(this.f75028a0);
        parcel.writeString(this.f75030b0);
        parcel.writeInt(this.f75032c0);
        parcel.writeByte(this.f75046p1 ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f75057x1 ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f75060y1 ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f75047p2);
        parcel.writeByte(this.f75058x2 ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f75061y2 ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.G2 ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f75048p3 ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.G3 ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.J3);
        parcel.writeByte(this.K3 ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.L3 ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.M3 ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.N3 ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.O3 ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.P3 ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.Q3 ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.R3 ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.S3 ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.T3 ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.U3 ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.V3 ? (byte) 1 : (byte) 0);
    }
}
