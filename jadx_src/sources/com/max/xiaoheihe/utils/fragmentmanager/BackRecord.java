package com.max.xiaoheihe.utils.fragmentmanager;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import androidx.annotation.d0;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.lang.ref.WeakReference;
import java.util.Objects;

/* JADX INFO: loaded from: classes13.dex */
public class BackRecord implements Parcelable {
    public static final Parcelable.Creator<BackRecord> CREATOR = new a();
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @d0
    private int f95378b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private WeakReference<Fragment> f95379c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f95380d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f95381e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Bundle f95382f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f95383g;

    public class a implements Parcelable.Creator<BackRecord> {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        public BackRecord a(Parcel parcel) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{parcel}, this, changeQuickRedirect, false, 49109, new Class[]{Parcel.class}, BackRecord.class);
            return patchProxyResultProxy.isSupported ? (BackRecord) patchProxyResultProxy.result : new BackRecord(parcel);
        }

        public BackRecord[] b(int i10) {
            return new BackRecord[i10];
        }

        /* JADX WARN: Type inference failed for: r9v2, types: [com.max.xiaoheihe.utils.fragmentmanager.BackRecord, java.lang.Object] */
        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ BackRecord createFromParcel(Parcel parcel) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{parcel}, this, changeQuickRedirect, false, 49111, new Class[]{Parcel.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a(parcel);
        }

        /* JADX WARN: Type inference failed for: r9v3, types: [com.max.xiaoheihe.utils.fragmentmanager.BackRecord[], java.lang.Object[]] */
        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ BackRecord[] newArray(int i10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 49110, new Class[]{Integer.TYPE}, Object[].class);
            return patchProxyResultProxy.isSupported ? (Object[]) patchProxyResultProxy.result : b(i10);
        }
    }

    public BackRecord(@d0 int i10, @n0 Fragment fragment, Bundle bundle, String str) {
        this(i10, fragment, bundle, true, str);
    }

    public BackRecord(@d0 int i10, @n0 Fragment fragment, Bundle bundle, boolean z10) {
        this(i10, fragment, bundle, z10, "-1");
    }

    public BackRecord(@d0 int i10, @n0 Fragment fragment, Bundle bundle, boolean z10, String str) {
        this.f95381e = true;
        this.f95378b = i10;
        this.f95379c = new WeakReference<>(fragment);
        this.f95381e = z10;
        this.f95383g = str;
        this.f95380d = fragment.getClass().getName();
        if (bundle == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            this.f95382f = bundle.deepCopy();
        } else {
            this.f95382f = new Bundle(bundle);
        }
    }

    public BackRecord(Parcel parcel) {
        this.f95381e = true;
        this.f95378b = parcel.readInt();
        this.f95380d = parcel.readString();
        this.f95381e = parcel.readByte() != 0;
        this.f95382f = parcel.readBundle();
        this.f95383g = parcel.readString();
    }

    @p0
    public Fragment a() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 49106, new Class[0], Fragment.class);
        return patchProxyResultProxy.isSupported ? (Fragment) patchProxyResultProxy.result : b(null);
    }

    public Fragment b(FragmentManager fragmentManager) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{fragmentManager}, this, changeQuickRedirect, false, 49107, new Class[]{FragmentManager.class}, Fragment.class);
        if (patchProxyResultProxy.isSupported) {
            return (Fragment) patchProxyResultProxy.result;
        }
        Fragment fragmentF = fragmentManager != null ? f(fragmentManager) : d();
        if (fragmentF == null) {
            try {
                Object objNewInstance = Class.forName(this.f95380d).newInstance();
                if (objNewInstance instanceof Fragment) {
                    fragmentF = (Fragment) objNewInstance;
                }
                if (fragmentF != null) {
                    fragmentF.setArguments(this.f95382f);
                }
            } catch (Exception e10) {
                String message = e10.getMessage();
                Objects.requireNonNull(message);
                Log.d("createInstance", message);
            }
        }
        return fragmentF;
    }

    public Bundle c() {
        return this.f95382f;
    }

    @p0
    public Fragment d() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 49104, new Class[0], Fragment.class);
        if (patchProxyResultProxy.isSupported) {
            return (Fragment) patchProxyResultProxy.result;
        }
        WeakReference<Fragment> weakReference = this.f95379c;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Fragment f(FragmentManager fragmentManager) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{fragmentManager}, this, changeQuickRedirect, false, 49105, new Class[]{FragmentManager.class}, Fragment.class);
        if (patchProxyResultProxy.isSupported) {
            return (Fragment) patchProxyResultProxy.result;
        }
        return d() == null ? fragmentManager.s0(this.f95383g) : d();
    }

    public String h() {
        return this.f95380d;
    }

    public int j() {
        return this.f95378b;
    }

    public String k() {
        return this.f95383g;
    }

    public boolean l() {
        return this.f95381e;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        if (PatchProxy.proxy(new Object[]{parcel, new Integer(i10)}, this, changeQuickRedirect, false, 49108, new Class[]{Parcel.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        parcel.writeInt(this.f95378b);
        parcel.writeString(this.f95380d);
        parcel.writeByte(this.f95381e ? (byte) 1 : (byte) 0);
        parcel.writeBundle(this.f95382f);
        parcel.writeString(this.f95383g);
    }
}
