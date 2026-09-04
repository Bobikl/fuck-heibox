package com.max.hbcommon.base.adapter;

import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.j0;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.List;

/* JADX INFO: compiled from: MyFragmentPagerAdapter.java */
/* JADX INFO: loaded from: classes9.dex */
public class n extends j0 {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<?> f66770a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<String> f66771b;

    public n(FragmentManager fragmentManager, List<?> list) {
        super(fragmentManager);
        this.f66770a = list;
    }

    public n(FragmentManager fragmentManager, List<?> list, List<String> list2) {
        super(fragmentManager);
        this.f66770a = list;
        this.f66771b = list2;
    }

    public void a(List<?> list) {
        if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, bb.c.b.hz, new Class[]{List.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f66770a.clear();
        this.f66770a = list;
        notifyDataSetChanged();
    }

    @Override // androidx.fragment.app.j0, androidx.viewpager.widget.a
    public void destroyItem(ViewGroup viewGroup, int i10, Object obj) {
        if (PatchProxy.proxy(new Object[]{viewGroup, new Integer(i10), obj}, this, changeQuickRedirect, false, bb.c.b.fz, new Class[]{ViewGroup.class, Integer.TYPE, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        super.destroyItem(viewGroup, i10, obj);
    }

    @Override // androidx.viewpager.widget.a
    public int getCount() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.ez, new Class[0], Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : this.f66770a.size();
    }

    @Override // androidx.fragment.app.j0
    public Fragment getItem(int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.b.dz, new Class[]{Integer.TYPE}, Fragment.class);
        return patchProxyResultProxy.isSupported ? (Fragment) patchProxyResultProxy.result : (Fragment) this.f66770a.get(i10);
    }

    @Override // androidx.viewpager.widget.a
    public CharSequence getPageTitle(int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.b.gz, new Class[]{Integer.TYPE}, CharSequence.class);
        if (patchProxyResultProxy.isSupported) {
            return (CharSequence) patchProxyResultProxy.result;
        }
        List<String> list = this.f66771b;
        return list != null ? list.get(i10) : "";
    }
}
