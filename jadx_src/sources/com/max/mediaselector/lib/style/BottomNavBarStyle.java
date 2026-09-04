package com.max.mediaselector.lib.style;

import android.os.Parcel;
import android.os.Parcelable;
import bb.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: loaded from: classes2.dex */
public class BottomNavBarStyle implements Parcelable {
    public static final Parcelable.Creator<BottomNavBarStyle> CREATOR = new a();
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f75399b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f75400c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f75401d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f75402e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f75403f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f75404g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f75405h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f75406i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f75407j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f75408k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f75409l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f75410m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f75411n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f75412o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f75413p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f75414q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f75415r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f75416s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f75417t;

    public class a implements Parcelable.Creator<BottomNavBarStyle> {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        public BottomNavBarStyle a(Parcel parcel) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{parcel}, this, changeQuickRedirect, false, c.m.f34625b5, new Class[]{Parcel.class}, BottomNavBarStyle.class);
            return patchProxyResultProxy.isSupported ? (BottomNavBarStyle) patchProxyResultProxy.result : new BottomNavBarStyle(parcel);
        }

        public BottomNavBarStyle[] b(int i10) {
            return new BottomNavBarStyle[i10];
        }

        /* JADX WARN: Type inference failed for: r9v2, types: [com.max.mediaselector.lib.style.BottomNavBarStyle, java.lang.Object] */
        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ BottomNavBarStyle createFromParcel(Parcel parcel) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{parcel}, this, changeQuickRedirect, false, c.m.f34672d5, new Class[]{Parcel.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a(parcel);
        }

        /* JADX WARN: Type inference failed for: r9v3, types: [com.max.mediaselector.lib.style.BottomNavBarStyle[], java.lang.Object[]] */
        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ BottomNavBarStyle[] newArray(int i10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, c.m.f34648c5, new Class[]{Integer.TYPE}, Object[].class);
            return patchProxyResultProxy.isSupported ? (Object[]) patchProxyResultProxy.result : b(i10);
        }
    }

    public BottomNavBarStyle() {
        this.f75417t = true;
    }

    public BottomNavBarStyle(Parcel parcel) {
        this.f75417t = true;
        this.f75399b = parcel.readInt();
        this.f75400c = parcel.readInt();
        this.f75401d = parcel.readInt();
        this.f75402e = parcel.readString();
        this.f75403f = parcel.readInt();
        this.f75404g = parcel.readInt();
        this.f75405h = parcel.readString();
        this.f75406i = parcel.readInt();
        this.f75407j = parcel.readString();
        this.f75408k = parcel.readInt();
        this.f75409l = parcel.readInt();
        this.f75410m = parcel.readInt();
        this.f75411n = parcel.readString();
        this.f75412o = parcel.readInt();
        this.f75413p = parcel.readInt();
        this.f75414q = parcel.readInt();
        this.f75415r = parcel.readInt();
        this.f75416s = parcel.readInt();
        this.f75417t = parcel.readByte() != 0;
    }

    public boolean A() {
        return this.f75417t;
    }

    public void B(String str) {
        this.f75407j = str;
    }

    public void C(int i10) {
        this.f75409l = i10;
    }

    public void D(int i10) {
        this.f75408k = i10;
    }

    public void E(int i10) {
        this.f75399b = i10;
    }

    public void F(int i10) {
        this.f75401d = i10;
    }

    public void G(int i10) {
        this.f75410m = i10;
    }

    public void H(String str) {
        this.f75411n = str;
    }

    public void I(int i10) {
        this.f75413p = i10;
    }

    public void K(int i10) {
        this.f75412o = i10;
    }

    public void L(int i10) {
        this.f75400c = i10;
    }

    public void M(String str) {
        this.f75402e = str;
    }

    public void N(int i10) {
        this.f75404g = i10;
    }

    public void O(int i10) {
        this.f75403f = i10;
    }

    public void P(String str) {
        this.f75405h = str;
    }

    public void T(int i10) {
        this.f75406i = i10;
    }

    public void U(int i10) {
        this.f75414q = i10;
    }

    public void W(int i10) {
        this.f75416s = i10;
    }

    public void X(int i10) {
        this.f75415r = i10;
    }

    public String a() {
        return this.f75407j;
    }

    public void a0(boolean z10) {
        this.f75417t = z10;
    }

    public int b() {
        return this.f75409l;
    }

    public int c() {
        return this.f75408k;
    }

    public int d() {
        return this.f75399b;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int f() {
        return this.f75401d;
    }

    public int h() {
        return this.f75410m;
    }

    public String j() {
        return this.f75411n;
    }

    public int k() {
        return this.f75413p;
    }

    public int l() {
        return this.f75412o;
    }

    public int n() {
        return this.f75400c;
    }

    public String o() {
        return this.f75402e;
    }

    public int p() {
        return this.f75404g;
    }

    public int r() {
        return this.f75403f;
    }

    public String u() {
        return this.f75405h;
    }

    public int v() {
        return this.f75406i;
    }

    public int w() {
        return this.f75414q;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        if (PatchProxy.proxy(new Object[]{parcel, new Integer(i10)}, this, changeQuickRedirect, false, c.m.f34602a5, new Class[]{Parcel.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        parcel.writeInt(this.f75399b);
        parcel.writeInt(this.f75400c);
        parcel.writeInt(this.f75401d);
        parcel.writeString(this.f75402e);
        parcel.writeInt(this.f75403f);
        parcel.writeInt(this.f75404g);
        parcel.writeString(this.f75405h);
        parcel.writeInt(this.f75406i);
        parcel.writeString(this.f75407j);
        parcel.writeInt(this.f75408k);
        parcel.writeInt(this.f75409l);
        parcel.writeInt(this.f75410m);
        parcel.writeString(this.f75411n);
        parcel.writeInt(this.f75412o);
        parcel.writeInt(this.f75413p);
        parcel.writeInt(this.f75414q);
        parcel.writeInt(this.f75415r);
        parcel.writeInt(this.f75416s);
        parcel.writeByte(this.f75417t ? (byte) 1 : (byte) 0);
    }

    public int y() {
        return this.f75416s;
    }

    public int z() {
        return this.f75415r;
    }
}
