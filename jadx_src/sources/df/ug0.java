package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import com.max.mediaselector.lib.widget.RecyclerPreloadView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ViewPostToolsV2GalleryBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class ug0 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final ConstraintLayout f116419a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final Group f116420b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final RecyclerPreloadView f116421c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f116422d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f116423e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f116424f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f116425g;

    private ug0(@androidx.annotation.n0 ConstraintLayout constraintLayout, @androidx.annotation.n0 Group group, @androidx.annotation.n0 RecyclerPreloadView recyclerPreloadView, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 View view) {
        this.f116419a = constraintLayout;
        this.f116420b = group;
        this.f116421c = recyclerPreloadView;
        this.f116422d = textView;
        this.f116423e = textView2;
        this.f116424f = textView3;
        this.f116425g = view;
    }

    @androidx.annotation.n0
    public static ug0 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 21802, new Class[]{View.class}, ug0.class);
        if (patchProxyResultProxy.isSupported) {
            return (ug0) patchProxyResultProxy.result;
        }
        int i10 = R.id.group_go_setting;
        Group group = (Group) l3.d.a(view, R.id.group_go_setting);
        if (group != null) {
            i10 = R.id.recycler;
            RecyclerPreloadView recyclerPreloadView = (RecyclerPreloadView) l3.d.a(view, R.id.recycler);
            if (recyclerPreloadView != null) {
                i10 = R.id.tv_empty_data_tips;
                TextView textView = (TextView) l3.d.a(view, R.id.tv_empty_data_tips);
                if (textView != null) {
                    i10 = R.id.tv_go_setting;
                    TextView textView2 = (TextView) l3.d.a(view, R.id.tv_go_setting);
                    if (textView2 != null) {
                        i10 = R.id.tv_go_setting_desc;
                        TextView textView3 = (TextView) l3.d.a(view, R.id.tv_go_setting_desc);
                        if (textView3 != null) {
                            i10 = R.id.v_go_setting_bg;
                            View viewA = l3.d.a(view, R.id.v_go_setting_bg);
                            if (viewA != null) {
                                return new ug0((ConstraintLayout) view, group, recyclerPreloadView, textView, textView2, textView3, viewA);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static ug0 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 21800, new Class[]{LayoutInflater.class}, ug0.class);
        return patchProxyResultProxy.isSupported ? (ug0) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static ug0 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 21801, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, ug0.class);
        if (patchProxyResultProxy.isSupported) {
            return (ug0) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.view_post_tools_v2_gallery, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public ConstraintLayout b() {
        return this.f116419a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 21803, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
