package com.max.hbimage.preview;

import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.previewlibrary.enitity.IThumbViewInfo;
import dl.d;
import dl.e;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: PreviewInfo.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class PreviewInfo implements IThumbViewInfo {

    @d
    public static final a CREATOR = new a(null);
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @e
    private String f70505b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @e
    private String f70506c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @e
    private String f70507d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @e
    private Rect f70508e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @e
    private String f70509f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @e
    private String f70510g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @e
    private String f70511h;

    /* JADX INFO: compiled from: PreviewInfo.kt */
    public static final class a implements Parcelable.Creator<PreviewInfo> {
        public static ChangeQuickRedirect changeQuickRedirect;

        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }

        @d
        public PreviewInfo a(@d Parcel parcel) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{parcel}, this, changeQuickRedirect, false, bb.c.g.Me, new Class[]{Parcel.class}, PreviewInfo.class);
            if (patchProxyResultProxy.isSupported) {
                return (PreviewInfo) patchProxyResultProxy.result;
            }
            f0.p(parcel, "parcel");
            return new PreviewInfo(parcel);
        }

        @d
        public PreviewInfo[] b(int i10) {
            return new PreviewInfo[i10];
        }

        /* JADX WARN: Type inference failed for: r9v2, types: [com.max.hbimage.preview.PreviewInfo, java.lang.Object] */
        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ PreviewInfo createFromParcel(Parcel parcel) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{parcel}, this, changeQuickRedirect, false, bb.c.g.Ne, new Class[]{Parcel.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a(parcel);
        }

        /* JADX WARN: Type inference failed for: r9v3, types: [com.max.hbimage.preview.PreviewInfo[], java.lang.Object[]] */
        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ PreviewInfo[] newArray(int i10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.g.Oe, new Class[]{Integer.TYPE}, Object[].class);
            return patchProxyResultProxy.isSupported ? (Object[]) patchProxyResultProxy.result : b(i10);
        }
    }

    public PreviewInfo() {
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PreviewInfo(@d Parcel parcel) {
        this();
        f0.p(parcel, "parcel");
        this.f70505b = parcel.readString();
        this.f70506c = parcel.readString();
        this.f70507d = parcel.readString();
        this.f70508e = (Rect) parcel.readParcelable(Rect.class.getClassLoader());
        this.f70509f = parcel.readString();
        this.f70510g = parcel.readString();
        this.f70511h = parcel.readString();
    }

    public PreviewInfo(@e String str) {
        this();
        this.f70505b = str;
    }

    public PreviewInfo(@e String str, @e String str2) {
        this();
        this.f70505b = str;
        this.f70511h = str2;
    }

    @e
    public final String a() {
        return this.f70511h;
    }

    @e
    public final String b() {
        return this.f70507d;
    }

    @e
    public final String c() {
        return this.f70506c;
    }

    @e
    public final String d() {
        return this.f70510g;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final void f(@e Rect rect) {
        this.f70508e = rect;
    }

    @Override // com.previewlibrary.enitity.IThumbViewInfo
    @e
    public Rect getBounds() {
        return this.f70508e;
    }

    @Override // com.previewlibrary.enitity.IThumbViewInfo
    @e
    public String getUrl() {
        return this.f70505b;
    }

    public final void h(@e String str) {
        this.f70511h = str;
    }

    public final void j(@e String str) {
        this.f70507d = str;
    }

    public final void k(@e String str) {
        this.f70506c = str;
    }

    public final void l(@e String str) {
        this.f70510g = str;
    }

    public final void n(@e String str) {
        this.f70505b = str;
    }

    public final void o(@e String str) {
        this.f70509f = str;
    }

    @Override // com.previewlibrary.enitity.IThumbViewInfo
    @e
    public String s() {
        return this.f70509f;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@d Parcel dest, int i10) {
        if (PatchProxy.proxy(new Object[]{dest, new Integer(i10)}, this, changeQuickRedirect, false, bb.c.g.Le, new Class[]{Parcel.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(dest, "dest");
        dest.writeString(this.f70505b);
        dest.writeString(this.f70506c);
        dest.writeString(this.f70507d);
        dest.writeParcelable(this.f70508e, i10);
        dest.writeString(this.f70509f);
        dest.writeString(this.f70510g);
        dest.writeString(this.f70511h);
    }
}
