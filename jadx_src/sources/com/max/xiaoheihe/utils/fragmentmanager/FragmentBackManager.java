package com.max.xiaoheihe.utils.fragmentmanager;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.d0;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class FragmentBackManager implements Parcelable {
    public static final Parcelable.Creator<FragmentBackManager> CREATOR = new a();
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f95384j = 4;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<BackRecord> f95385b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<BackRecord> f95386c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private FragmentManager f95387d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Fragment f95388e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private b f95389f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f95390g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f95391h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f95392i;

    public class a implements Parcelable.Creator<FragmentBackManager> {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        public FragmentBackManager a(Parcel parcel) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{parcel}, this, changeQuickRedirect, false, 49122, new Class[]{Parcel.class}, FragmentBackManager.class);
            return patchProxyResultProxy.isSupported ? (FragmentBackManager) patchProxyResultProxy.result : new FragmentBackManager(parcel);
        }

        public FragmentBackManager[] b(int i10) {
            return new FragmentBackManager[i10];
        }

        /* JADX WARN: Type inference failed for: r9v2, types: [com.max.xiaoheihe.utils.fragmentmanager.FragmentBackManager, java.lang.Object] */
        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ FragmentBackManager createFromParcel(Parcel parcel) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{parcel}, this, changeQuickRedirect, false, 49124, new Class[]{Parcel.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a(parcel);
        }

        /* JADX WARN: Type inference failed for: r9v3, types: [com.max.xiaoheihe.utils.fragmentmanager.FragmentBackManager[], java.lang.Object[]] */
        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ FragmentBackManager[] newArray(int i10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 49123, new Class[]{Integer.TYPE}, Object[].class);
            return patchProxyResultProxy.isSupported ? (Object[]) patchProxyResultProxy.result : b(i10);
        }
    }

    public interface b {
        void a(int i10, @p0 Fragment fragment);

        void b(int i10, @p0 Fragment fragment);
    }

    public FragmentBackManager(Parcel parcel) {
        this.f95385b = new ArrayList();
        this.f95386c = new ArrayList();
        this.f95388e = null;
        this.f95389f = null;
        this.f95391h = 0L;
        this.f95392i = 0;
        Parcelable.Creator<BackRecord> creator = BackRecord.CREATOR;
        this.f95385b = parcel.createTypedArrayList(creator);
        this.f95386c = parcel.createTypedArrayList(creator);
        this.f95390g = parcel.readInt();
        this.f95391h = parcel.readLong();
        this.f95392i = parcel.readInt();
    }

    public FragmentBackManager(@n0 FragmentManager fragmentManager) {
        this.f95385b = new ArrayList();
        this.f95386c = new ArrayList();
        this.f95388e = null;
        this.f95389f = null;
        this.f95391h = 0L;
        this.f95392i = 0;
        this.f95387d = fragmentManager;
    }

    private void d(int i10) {
        b bVar;
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 49119, new Class[]{Integer.TYPE}, Void.TYPE).isSupported || (bVar = this.f95389f) == null) {
            return;
        }
        bVar.a(i10, k());
    }

    private void f(int i10) {
        b bVar;
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 49118, new Class[]{Integer.TYPE}, Void.TYPE).isSupported || (bVar = this.f95389f) == null) {
            return;
        }
        bVar.b(i10, k());
    }

    public boolean a() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 49115, new Class[0], Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : b(this.f95390g);
    }

    public synchronized boolean b(@d0 int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 49116, new Class[]{Integer.TYPE}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (System.currentTimeMillis() - this.f95391h < 100) {
            return false;
        }
        this.f95391h = System.currentTimeMillis();
        if (this.f95385b.isEmpty()) {
            return false;
        }
        androidx.fragment.app.p0 p0VarU = this.f95387d.u();
        List<BackRecord> list = this.f95385b;
        list.remove(list.size() - 1);
        if (!this.f95386c.isEmpty()) {
            List<BackRecord> list2 = this.f95386c;
            BackRecord backRecordRemove = list2.remove(list2.size() - 1);
            this.f95385b.add(0, backRecordRemove);
            Fragment fragmentB = backRecordRemove.b(this.f95387d);
            if (fragmentB != null) {
                p0VarU.c(i10, fragmentB, backRecordRemove.k()).u(fragmentB);
            }
        }
        p0VarU.n();
        androidx.fragment.app.p0 p0VarI = this.f95387d.u().I(R.anim.activity_open_enter_from_right, R.anim.activity_close_to_right);
        f(0);
        if (this.f95388e != null) {
            p0VarI.N(8194).x(this.f95388e);
        }
        if (!this.f95385b.isEmpty()) {
            List<BackRecord> list3 = this.f95385b;
            Fragment fragmentB2 = list3.get(list3.size() - 1).b(this.f95387d);
            if (fragmentB2 != null) {
                p0VarI.P(fragmentB2);
                this.f95388e = fragmentB2;
            }
        }
        p0VarI.n();
        d(0);
        return true;
    }

    public synchronized void c() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 49117, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        androidx.fragment.app.p0 p0VarU = this.f95387d.u();
        int size = this.f95385b.size();
        for (int i10 = 0; i10 < size; i10++) {
            BackRecord backRecord = this.f95385b.get((size - i10) - 1);
            if (backRecord.d() != null) {
                p0VarU.x(backRecord.f(this.f95387d));
            }
        }
        int size2 = this.f95386c.size();
        for (int i11 = 0; i11 < size2; i11++) {
            BackRecord backRecord2 = this.f95386c.get(i11);
            if (backRecord2.d() != null) {
                p0VarU.x(backRecord2.f(this.f95387d));
            }
        }
        this.f95385b.clear();
        this.f95386c.clear();
        p0VarU.n();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public List<BackRecord> h() {
        return this.f95386c;
    }

    public List<BackRecord> j() {
        return this.f95385b;
    }

    @p0
    public Fragment k() {
        return this.f95388e;
    }

    @n0
    public FragmentManager l() {
        return this.f95387d;
    }

    public int n() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 49120, new Class[0], Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : this.f95385b.size() + this.f95386c.size();
    }

    public void o(FragmentManager fragmentManager) {
        if (PatchProxy.proxy(new Object[]{fragmentManager}, this, changeQuickRedirect, false, 49112, new Class[]{FragmentManager.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f95387d = fragmentManager;
        if (this.f95385b.isEmpty()) {
            return;
        }
        List<BackRecord> list = this.f95385b;
        this.f95388e = fragmentManager.s0(list.get(list.size() - 1).k());
    }

    public void p(b bVar) {
        this.f95389f = bVar;
    }

    public void r(@d0 int i10, @n0 Fragment fragment) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10), fragment}, this, changeQuickRedirect, false, 49113, new Class[]{Integer.TYPE, Fragment.class}, Void.TYPE).isSupported) {
            return;
        }
        u(i10, fragment, null);
    }

    public synchronized void u(@d0 int i10, @n0 Fragment fragment, Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10), fragment, bundle}, this, changeQuickRedirect, false, 49114, new Class[]{Integer.TYPE, Fragment.class, Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        if (bundle != null) {
            fragment.setArguments(bundle);
        } else {
            bundle = fragment.getArguments();
        }
        this.f95390g = i10;
        f(1);
        androidx.fragment.app.p0 p0VarU = this.f95387d.u();
        if (this.f95385b.size() >= 4) {
            BackRecord backRecord = this.f95385b.get(0);
            this.f95385b.remove(backRecord);
            this.f95386c.add(backRecord);
            Fragment fragmentF = backRecord.f(this.f95387d);
            if (fragmentF != null) {
                if (fragmentF.getView() != null) {
                    fragmentF.getView().setAlpha(0.0f);
                }
                p0VarU.u(fragmentF).x(fragmentF);
            }
        }
        this.f95385b.add(new BackRecord(i10, fragment, bundle, String.valueOf(this.f95392i)));
        p0VarU.I(R.anim.activity_open_enter_from_right, R.anim.activity_close_to_right).c(i10, fragment, String.valueOf(this.f95392i)).P(fragment).n();
        this.f95392i++;
        this.f95387d.n0();
        this.f95388e = fragment;
        d(1);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        if (PatchProxy.proxy(new Object[]{parcel, new Integer(i10)}, this, changeQuickRedirect, false, 49121, new Class[]{Parcel.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        parcel.writeTypedList(this.f95385b);
        parcel.writeTypedList(this.f95386c);
        parcel.writeInt(this.f95390g);
        parcel.writeLong(this.f95391h);
        parcel.writeInt(this.f95392i);
    }
}
