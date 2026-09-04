package com.max.mediaselector.lib.entity;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import bb.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public class LocalMediaFolder implements Parcelable {
    public static final Parcelable.Creator<LocalMediaFolder> CREATOR = new a();
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f75214b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f75215c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f75216d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f75217e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f75218f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f75219g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f75220h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private ArrayList<LocalMedia> f75221i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f75222j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f75223k;

    public class a implements Parcelable.Creator<LocalMediaFolder> {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        public LocalMediaFolder a(Parcel parcel) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{parcel}, this, changeQuickRedirect, false, c.m.f34689e, new Class[]{Parcel.class}, LocalMediaFolder.class);
            return patchProxyResultProxy.isSupported ? (LocalMediaFolder) patchProxyResultProxy.result : new LocalMediaFolder(parcel);
        }

        public LocalMediaFolder[] b(int i10) {
            return new LocalMediaFolder[i10];
        }

        /* JADX WARN: Type inference failed for: r9v2, types: [com.max.mediaselector.lib.entity.LocalMediaFolder, java.lang.Object] */
        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ LocalMediaFolder createFromParcel(Parcel parcel) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{parcel}, this, changeQuickRedirect, false, c.m.f34735g, new Class[]{Parcel.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a(parcel);
        }

        /* JADX WARN: Type inference failed for: r9v3, types: [com.max.mediaselector.lib.entity.LocalMediaFolder[], java.lang.Object[]] */
        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ LocalMediaFolder[] newArray(int i10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, c.m.f34712f, new Class[]{Integer.TYPE}, Object[].class);
            return patchProxyResultProxy.isSupported ? (Object[]) patchProxyResultProxy.result : b(i10);
        }
    }

    public LocalMediaFolder() {
        this.f75214b = -1L;
        this.f75221i = new ArrayList<>();
        this.f75222j = 1;
    }

    public LocalMediaFolder(Parcel parcel) {
        this.f75214b = -1L;
        this.f75221i = new ArrayList<>();
        this.f75222j = 1;
        this.f75214b = parcel.readLong();
        this.f75215c = parcel.readString();
        this.f75216d = parcel.readString();
        this.f75217e = parcel.readString();
        this.f75218f = parcel.readInt();
        this.f75219g = parcel.readByte() != 0;
        this.f75220h = parcel.readInt();
        this.f75221i = parcel.createTypedArrayList(LocalMedia.CREATOR);
        this.f75222j = parcel.readInt();
        this.f75223k = parcel.readByte() != 0;
    }

    public void A(boolean z10) {
        this.f75219g = z10;
    }

    public void B(int i10) {
        this.f75220h = i10;
    }

    public long a() {
        return this.f75214b;
    }

    public int b() {
        return this.f75222j;
    }

    public ArrayList<LocalMedia> c() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.m.f34666d, new Class[0], ArrayList.class);
        if (patchProxyResultProxy.isSupported) {
            return (ArrayList) patchProxyResultProxy.result;
        }
        ArrayList<LocalMedia> arrayList = this.f75221i;
        return arrayList != null ? arrayList : new ArrayList<>();
    }

    public String d() {
        return this.f75216d;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String f() {
        return this.f75217e;
    }

    public String h() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.m.f34642c, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return TextUtils.isEmpty(this.f75215c) ? "unknown" : this.f75215c;
    }

    public int j() {
        return this.f75218f;
    }

    public int k() {
        return this.f75220h;
    }

    public boolean l() {
        return this.f75223k;
    }

    public boolean n() {
        return this.f75219g;
    }

    public void o(long j10) {
        this.f75214b = j10;
    }

    public void p(int i10) {
        this.f75222j = i10;
    }

    public void r(ArrayList<LocalMedia> arrayList) {
        this.f75221i = arrayList;
    }

    public void u(String str) {
        this.f75216d = str;
    }

    public void v(String str) {
        this.f75217e = str;
    }

    public void w(String str) {
        this.f75215c = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        if (PatchProxy.proxy(new Object[]{parcel, new Integer(i10)}, this, changeQuickRedirect, false, c.m.f34619b, new Class[]{Parcel.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        parcel.writeLong(this.f75214b);
        parcel.writeString(this.f75215c);
        parcel.writeString(this.f75216d);
        parcel.writeString(this.f75217e);
        parcel.writeInt(this.f75218f);
        parcel.writeByte(this.f75219g ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f75220h);
        parcel.writeTypedList(this.f75221i);
        parcel.writeInt(this.f75222j);
        parcel.writeByte(this.f75223k ? (byte) 1 : (byte) 0);
    }

    public void y(int i10) {
        this.f75218f = i10;
    }

    public void z(boolean z10) {
        this.f75223k = z10;
    }
}
