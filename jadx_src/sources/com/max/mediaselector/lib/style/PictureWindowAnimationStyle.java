package com.max.mediaselector.lib.style;

import android.os.Parcel;
import android.os.Parcelable;
import bb.c;
import com.max.mediaselector.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: loaded from: classes2.dex */
public class PictureWindowAnimationStyle implements Parcelable {
    public static final Parcelable.Creator<PictureWindowAnimationStyle> CREATOR = new a();
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.a
    public int f75418b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.a
    public int f75419c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.a
    public int f75420d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.a
    public int f75421e;

    public class a implements Parcelable.Creator<PictureWindowAnimationStyle> {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        public PictureWindowAnimationStyle a(Parcel parcel) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{parcel}, this, changeQuickRedirect, false, c.m.f34856l5, new Class[]{Parcel.class}, PictureWindowAnimationStyle.class);
            return patchProxyResultProxy.isSupported ? (PictureWindowAnimationStyle) patchProxyResultProxy.result : new PictureWindowAnimationStyle(parcel);
        }

        public PictureWindowAnimationStyle[] b(int i10) {
            return new PictureWindowAnimationStyle[i10];
        }

        /* JADX WARN: Type inference failed for: r9v2, types: [com.max.mediaselector.lib.style.PictureWindowAnimationStyle, java.lang.Object] */
        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ PictureWindowAnimationStyle createFromParcel(Parcel parcel) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{parcel}, this, changeQuickRedirect, false, c.m.f34902n5, new Class[]{Parcel.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a(parcel);
        }

        /* JADX WARN: Type inference failed for: r9v3, types: [com.max.mediaselector.lib.style.PictureWindowAnimationStyle[], java.lang.Object[]] */
        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ PictureWindowAnimationStyle[] newArray(int i10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, c.m.f34879m5, new Class[]{Integer.TYPE}, Object[].class);
            return patchProxyResultProxy.isSupported ? (Object[]) patchProxyResultProxy.result : b(i10);
        }
    }

    public PictureWindowAnimationStyle() {
    }

    public PictureWindowAnimationStyle(@androidx.annotation.a int i10, @androidx.annotation.a int i11) {
        this.f75418b = i10;
        this.f75419c = i11;
        this.f75420d = i10;
        this.f75421e = i11;
    }

    public PictureWindowAnimationStyle(Parcel parcel) {
        this.f75418b = parcel.readInt();
        this.f75419c = parcel.readInt();
        this.f75420d = parcel.readInt();
        this.f75421e = parcel.readInt();
    }

    public static PictureWindowAnimationStyle f() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, c.m.f34810j5, new Class[0], PictureWindowAnimationStyle.class);
        return patchProxyResultProxy.isSupported ? (PictureWindowAnimationStyle) patchProxyResultProxy.result : new PictureWindowAnimationStyle(R.anim.ps_anim_enter, R.anim.ps_anim_exit);
    }

    public int a() {
        return this.f75418b;
    }

    public int b() {
        return this.f75419c;
    }

    public int c() {
        return this.f75420d;
    }

    public int d() {
        return this.f75421e;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public void h(int i10) {
        this.f75418b = i10;
    }

    public void j(int i10) {
        this.f75419c = i10;
    }

    public void k(int i10) {
        this.f75420d = i10;
    }

    public void l(int i10) {
        this.f75421e = i10;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        if (PatchProxy.proxy(new Object[]{parcel, new Integer(i10)}, this, changeQuickRedirect, false, c.m.f34833k5, new Class[]{Parcel.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        parcel.writeInt(this.f75418b);
        parcel.writeInt(this.f75419c);
        parcel.writeInt(this.f75420d);
        parcel.writeInt(this.f75421e);
    }
}
