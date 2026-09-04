package ld;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.n0;
import androidx.annotation.p0;
import com.google.android.material.tabs.TabLayout;
import com.max.hbcommon.component.FilterButtonView;
import com.max.hbsearch.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemSearchFilterHeaderBinding.java */
/* JADX INFO: loaded from: classes12.dex */
public final class k implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @n0
    private final RelativeLayout f131395a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @n0
    public final CheckBox f131396b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @n0
    public final FilterButtonView f131397c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @n0
    public final TabLayout f131398d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @n0
    public final TextView f131399e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @n0
    public final LinearLayout f131400f;

    private k(@n0 RelativeLayout relativeLayout, @n0 CheckBox checkBox, @n0 FilterButtonView filterButtonView, @n0 TabLayout tabLayout, @n0 TextView textView, @n0 LinearLayout linearLayout) {
        this.f131395a = relativeLayout;
        this.f131396b = checkBox;
        this.f131397c = filterButtonView;
        this.f131398d = tabLayout;
        this.f131399e = textView;
        this.f131400f = linearLayout;
    }

    @n0
    public static k a(@n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, bb.c.k.f33430a9, new Class[]{View.class}, k.class);
        if (patchProxyResultProxy.isSupported) {
            return (k) patchProxyResultProxy.result;
        }
        int i10 = R.id.cb_select_in_topic;
        CheckBox checkBox = (CheckBox) l3.d.a(view, i10);
        if (checkBox != null) {
            i10 = R.id.fbv_sort;
            FilterButtonView filterButtonView = (FilterButtonView) l3.d.a(view, i10);
            if (filterButtonView != null) {
                i10 = R.id.tl_sort_type;
                TabLayout tabLayout = (TabLayout) l3.d.a(view, i10);
                if (tabLayout != null) {
                    i10 = R.id.tv_select_in_topic;
                    TextView textView = (TextView) l3.d.a(view, i10);
                    if (textView != null) {
                        i10 = R.id.vg_select_in_topic;
                        LinearLayout linearLayout = (LinearLayout) l3.d.a(view, i10);
                        if (linearLayout != null) {
                            return new k((RelativeLayout) view, checkBox, filterButtonView, tabLayout, textView, linearLayout);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @n0
    public static k c(@n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, bb.c.k.Y8, new Class[]{LayoutInflater.class}, k.class);
        return patchProxyResultProxy.isSupported ? (k) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @n0
    public static k d(@n0 LayoutInflater layoutInflater, @p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, bb.c.k.Z8, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, k.class);
        if (patchProxyResultProxy.isSupported) {
            return (k) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_search_filter_header, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @n0
    public RelativeLayout b() {
        return this.f131395a;
    }

    @Override // l3.c
    @n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.f33453b9, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
