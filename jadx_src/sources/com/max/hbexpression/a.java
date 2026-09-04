package com.max.hbexpression;

import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.p0;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.n0;
import androidx.viewpager.widget.ViewPager;
import com.max.hbexpression.bean.ExpressionObj;
import com.max.hbexpression.widget.CirclePageIndicator;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: BaseInsideFragment.java */
/* JADX INFO: loaded from: classes10.dex */
public abstract class a extends Fragment {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ViewPager f70171b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ArrayList<c> f70172c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private CirclePageIndicator f70173d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f70174e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ArrayList<List<ExpressionObj>> f70175f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f70176g;

    /* JADX INFO: renamed from: com.max.hbexpression.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: BaseInsideFragment.java */
    public static class C0567a extends n0 {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private final List<c> f70177l;

        public C0567a(FragmentManager fragmentManager, List<c> list) {
            super(fragmentManager);
            this.f70177l = list;
        }

        @Override // androidx.viewpager.widget.a
        public int getCount() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.yB, new Class[0], Integer.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Integer) patchProxyResultProxy.result).intValue();
            }
            List<c> list = this.f70177l;
            if (list == null) {
                return 0;
            }
            return list.size();
        }

        @Override // androidx.fragment.app.n0
        public Fragment getItem(int i10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.f.xB, new Class[]{Integer.TYPE}, Fragment.class);
            return patchProxyResultProxy.isSupported ? (Fragment) patchProxyResultProxy.result : this.f70177l.get(i10);
        }
    }

    private void P3(View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, bb.c.f.wB, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f70171b = (ViewPager) view.findViewById(R.id.vp_iner_expression);
        this.f70173d = (CirclePageIndicator) view.findViewById(R.id.cp_iner_expression);
        if (com.max.hbcommon.utils.c.u(this.f70174e)) {
            return;
        }
        this.f70173d.setFillColor(Color.parseColor(this.f70174e));
    }

    private void R3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.vB, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f70172c = V3();
        this.f70171b.setAdapter(new C0567a(getChildFragmentManager(), this.f70172c));
        if (!Q3()) {
            this.f70173d.setVisibility(8);
        } else {
            this.f70173d.setVisibility(0);
            this.f70173d.setViewPager(this.f70171b);
        }
    }

    public ArrayList<c> L3() {
        return this.f70172c;
    }

    public ViewPager M3() {
        return this.f70171b;
    }

    public ArrayList<List<ExpressionObj>> N3() {
        return this.f70175f;
    }

    public String O3() {
        return this.f70176g;
    }

    public abstract boolean Q3();

    public void S3(String str) {
        this.f70174e = str;
    }

    public void T3(ArrayList<List<ExpressionObj>> arrayList) {
        this.f70175f = arrayList;
    }

    public void U3(String str) {
        this.f70176g = str;
    }

    public abstract ArrayList<c> V3();

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, @p0 ViewGroup viewGroup, @p0 Bundle bundle) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, bundle}, this, changeQuickRedirect, false, bb.c.f.tB, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : layoutInflater.inflate(R.layout.hbexpression_expression_iner_fragment, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, @p0 Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{view, bundle}, this, changeQuickRedirect, false, bb.c.f.uB, new Class[]{View.class, Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onViewCreated(view, bundle);
        P3(view);
        R3();
    }
}
