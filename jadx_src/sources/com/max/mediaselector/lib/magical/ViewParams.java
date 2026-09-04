package com.max.mediaselector.lib.magical;

import android.os.Parcel;
import android.os.Parcelable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: loaded from: classes2.dex */
public class ViewParams implements Parcelable {
    public static final Parcelable.Creator<ViewParams> CREATOR = new a();
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f75328b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f75329c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f75330d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f75331e;

    public class a implements Parcelable.Creator<ViewParams> {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        public ViewParams a(Parcel parcel) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{parcel}, this, changeQuickRedirect, false, bb.c.m.f35144y2, new Class[]{Parcel.class}, ViewParams.class);
            return patchProxyResultProxy.isSupported ? (ViewParams) patchProxyResultProxy.result : new ViewParams(parcel);
        }

        public ViewParams[] b(int i10) {
            return new ViewParams[i10];
        }

        /* JADX WARN: Type inference failed for: r9v2, types: [com.max.mediaselector.lib.magical.ViewParams, java.lang.Object] */
        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ ViewParams createFromParcel(Parcel parcel) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{parcel}, this, changeQuickRedirect, false, bb.c.m.A2, new Class[]{Parcel.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a(parcel);
        }

        /* JADX WARN: Type inference failed for: r9v3, types: [com.max.mediaselector.lib.magical.ViewParams[], java.lang.Object[]] */
        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ ViewParams[] newArray(int i10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.m.f35166z2, new Class[]{Integer.TYPE}, Object[].class);
            return patchProxyResultProxy.isSupported ? (Object[]) patchProxyResultProxy.result : b(i10);
        }
    }

    public ViewParams() {
    }

    public ViewParams(Parcel parcel) {
        this.f75328b = parcel.readInt();
        this.f75329c = parcel.readInt();
        this.f75330d = parcel.readInt();
        this.f75331e = parcel.readInt();
    }

    public void G1(int i10) {
        this.f75331e = i10;
    }

    public int a() {
        return this.f75328b;
    }

    public int b() {
        return this.f75329c;
    }

    public void c(int i10) {
        this.f75328b = i10;
    }

    public void d(int i10) {
        this.f75329c = i10;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getHeight() {
        return this.f75331e;
    }

    public int getWidth() {
        return this.f75330d;
    }

    public void t0(int i10) {
        this.f75330d = i10;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        if (PatchProxy.proxy(new Object[]{parcel, new Integer(i10)}, this, changeQuickRedirect, false, bb.c.m.f35122x2, new Class[]{Parcel.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        parcel.writeInt(this.f75328b);
        parcel.writeInt(this.f75329c);
        parcel.writeInt(this.f75330d);
        parcel.writeInt(this.f75331e);
    }
}
