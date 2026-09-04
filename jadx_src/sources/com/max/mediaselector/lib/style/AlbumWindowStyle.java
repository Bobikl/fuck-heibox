package com.max.mediaselector.lib.style;

import android.os.Parcel;
import android.os.Parcelable;
import bb.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: loaded from: classes2.dex */
public class AlbumWindowStyle implements Parcelable {
    public static final Parcelable.Creator<AlbumWindowStyle> CREATOR = new a();
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f75395b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f75396c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f75397d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f75398e;

    public class a implements Parcelable.Creator<AlbumWindowStyle> {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        public AlbumWindowStyle a(Parcel parcel) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{parcel}, this, changeQuickRedirect, false, c.m.X4, new Class[]{Parcel.class}, AlbumWindowStyle.class);
            return patchProxyResultProxy.isSupported ? (AlbumWindowStyle) patchProxyResultProxy.result : new AlbumWindowStyle(parcel);
        }

        public AlbumWindowStyle[] b(int i10) {
            return new AlbumWindowStyle[i10];
        }

        /* JADX WARN: Type inference failed for: r9v2, types: [com.max.mediaselector.lib.style.AlbumWindowStyle, java.lang.Object] */
        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ AlbumWindowStyle createFromParcel(Parcel parcel) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{parcel}, this, changeQuickRedirect, false, c.m.Z4, new Class[]{Parcel.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a(parcel);
        }

        /* JADX WARN: Type inference failed for: r9v3, types: [com.max.mediaselector.lib.style.AlbumWindowStyle[], java.lang.Object[]] */
        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ AlbumWindowStyle[] newArray(int i10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, c.m.Y4, new Class[]{Integer.TYPE}, Object[].class);
            return patchProxyResultProxy.isSupported ? (Object[]) patchProxyResultProxy.result : b(i10);
        }
    }

    public AlbumWindowStyle() {
    }

    public AlbumWindowStyle(Parcel parcel) {
        this.f75395b = parcel.readInt();
        this.f75396c = parcel.readInt();
        this.f75397d = parcel.readInt();
        this.f75398e = parcel.readInt();
    }

    public int a() {
        return this.f75395b;
    }

    public int b() {
        return this.f75396c;
    }

    public int c() {
        return this.f75398e;
    }

    public int d() {
        return this.f75397d;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public void f(int i10) {
        this.f75395b = i10;
    }

    public void h(int i10) {
        this.f75396c = i10;
    }

    public void j(int i10) {
        this.f75398e = i10;
    }

    public void k(int i10) {
        this.f75397d = i10;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        if (PatchProxy.proxy(new Object[]{parcel, new Integer(i10)}, this, changeQuickRedirect, false, c.m.W4, new Class[]{Parcel.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        parcel.writeInt(this.f75395b);
        parcel.writeInt(this.f75396c);
        parcel.writeInt(this.f75397d);
        parcel.writeInt(this.f75398e);
    }
}
