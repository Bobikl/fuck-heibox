package com.max.mediaselector.lib.style;

import android.os.Parcel;
import android.os.Parcelable;
import bb.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: loaded from: classes2.dex */
public class TitleBarStyle implements Parcelable {
    public static final Parcelable.Creator<TitleBarStyle> CREATOR = new a();
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f75447b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f75448c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f75449d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f75450e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f75451f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f75452g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f75453h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f75454i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f75455j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f75456k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f75457l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f75458m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f75459n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f75460o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f75461p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private String f75462q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f75463r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f75464s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f75465t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f75466u;

    public class a implements Parcelable.Creator<TitleBarStyle> {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        public TitleBarStyle a(Parcel parcel) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{parcel}, this, changeQuickRedirect, false, c.m.f35037t5, new Class[]{Parcel.class}, TitleBarStyle.class);
            return patchProxyResultProxy.isSupported ? (TitleBarStyle) patchProxyResultProxy.result : new TitleBarStyle(parcel);
        }

        public TitleBarStyle[] b(int i10) {
            return new TitleBarStyle[i10];
        }

        /* JADX WARN: Type inference failed for: r9v2, types: [com.max.mediaselector.lib.style.TitleBarStyle, java.lang.Object] */
        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ TitleBarStyle createFromParcel(Parcel parcel) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{parcel}, this, changeQuickRedirect, false, c.m.f35081v5, new Class[]{Parcel.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a(parcel);
        }

        /* JADX WARN: Type inference failed for: r9v3, types: [com.max.mediaselector.lib.style.TitleBarStyle[], java.lang.Object[]] */
        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ TitleBarStyle[] newArray(int i10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, c.m.f35059u5, new Class[]{Integer.TYPE}, Object[].class);
            return patchProxyResultProxy.isSupported ? (Object[]) patchProxyResultProxy.result : b(i10);
        }
    }

    public TitleBarStyle() {
    }

    public TitleBarStyle(Parcel parcel) {
        this.f75447b = parcel.readByte() != 0;
        this.f75448c = parcel.readInt();
        this.f75449d = parcel.readInt();
        this.f75450e = parcel.readString();
        this.f75451f = parcel.readInt();
        this.f75452g = parcel.readInt();
        this.f75453h = parcel.readInt();
        this.f75454i = parcel.readInt();
        this.f75455j = parcel.readInt();
        this.f75456k = parcel.readInt();
        this.f75457l = parcel.readByte() != 0;
        this.f75458m = parcel.readInt();
        this.f75459n = parcel.readInt();
        this.f75460o = parcel.readByte() != 0;
        this.f75461p = parcel.readInt();
        this.f75462q = parcel.readString();
        this.f75463r = parcel.readInt();
        this.f75464s = parcel.readInt();
        this.f75465t = parcel.readInt();
        this.f75466u = parcel.readByte() != 0;
    }

    public boolean A() {
        return this.f75460o;
    }

    public boolean B() {
        return this.f75447b;
    }

    public void C(boolean z10) {
        this.f75457l = z10;
    }

    public void D(boolean z10) {
        this.f75466u = z10;
    }

    public void E(boolean z10) {
        this.f75460o = z10;
    }

    public void F(boolean z10) {
        this.f75447b = z10;
    }

    public void G(int i10) {
        this.f75461p = i10;
    }

    public void H(int i10) {
        this.f75454i = i10;
    }

    public void I(int i10) {
        this.f75449d = i10;
    }

    public void K(int i10) {
        this.f75456k = i10;
    }

    public void L(int i10) {
        this.f75453h = i10;
    }

    public void M(int i10) {
        this.f75455j = i10;
    }

    public void N(int i10) {
        this.f75465t = i10;
    }

    public void O(int i10) {
        this.f75459n = i10;
    }

    public void P(String str) {
        this.f75462q = str;
    }

    public void T(int i10) {
        this.f75464s = i10;
    }

    public void U(int i10) {
        this.f75463r = i10;
    }

    public void W(String str) {
        this.f75450e = str;
    }

    public void X(int i10) {
        this.f75458m = i10;
    }

    public int a() {
        return this.f75461p;
    }

    public void a0(int i10) {
        this.f75448c = i10;
    }

    public int b() {
        return this.f75454i;
    }

    public void b0(int i10) {
        this.f75452g = i10;
    }

    public int c() {
        return this.f75449d;
    }

    public void c0(int i10) {
        this.f75451f = i10;
    }

    public int d() {
        return this.f75456k;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int f() {
        return this.f75453h;
    }

    public int h() {
        return this.f75455j;
    }

    public int j() {
        return this.f75465t;
    }

    public int k() {
        return this.f75459n;
    }

    public String l() {
        return this.f75462q;
    }

    public int n() {
        return this.f75464s;
    }

    public int o() {
        return this.f75463r;
    }

    public String p() {
        return this.f75450e;
    }

    public int r() {
        return this.f75458m;
    }

    public int u() {
        return this.f75448c;
    }

    public int v() {
        return this.f75452g;
    }

    public int w() {
        return this.f75451f;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        if (PatchProxy.proxy(new Object[]{parcel, new Integer(i10)}, this, changeQuickRedirect, false, c.m.f35015s5, new Class[]{Parcel.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        parcel.writeByte(this.f75447b ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f75448c);
        parcel.writeInt(this.f75449d);
        parcel.writeString(this.f75450e);
        parcel.writeInt(this.f75451f);
        parcel.writeInt(this.f75452g);
        parcel.writeInt(this.f75453h);
        parcel.writeInt(this.f75454i);
        parcel.writeInt(this.f75455j);
        parcel.writeInt(this.f75456k);
        parcel.writeByte(this.f75457l ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f75458m);
        parcel.writeInt(this.f75459n);
        parcel.writeByte(this.f75460o ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f75461p);
        parcel.writeString(this.f75462q);
        parcel.writeInt(this.f75463r);
        parcel.writeInt(this.f75464s);
        parcel.writeInt(this.f75465t);
        parcel.writeByte(this.f75466u ? (byte) 1 : (byte) 0);
    }

    public boolean y() {
        return this.f75457l;
    }

    public boolean z() {
        return this.f75466u;
    }
}
