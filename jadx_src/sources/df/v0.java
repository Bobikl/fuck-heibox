package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.max.mediaselector.lib.widget.MediumBoldTextView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ActivityImageModuleListBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class v0 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f116552a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final FrameLayout f116553b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f116554c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final TabLayout f116555d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f116556e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f116557f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f116558g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final MediumBoldTextView f116559h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final MediumBoldTextView f116560i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f116561j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final ViewPager2 f116562k;

    private v0(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 FrameLayout frameLayout, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 TabLayout tabLayout, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 MediumBoldTextView mediumBoldTextView, @androidx.annotation.n0 MediumBoldTextView mediumBoldTextView2, @androidx.annotation.n0 RelativeLayout relativeLayout2, @androidx.annotation.n0 ViewPager2 viewPager2) {
        this.f116552a = relativeLayout;
        this.f116553b = frameLayout;
        this.f116554c = linearLayout;
        this.f116555d = tabLayout;
        this.f116556e = textView;
        this.f116557f = textView2;
        this.f116558g = textView3;
        this.f116559h = mediumBoldTextView;
        this.f116560i = mediumBoldTextView2;
        this.f116561j = relativeLayout2;
        this.f116562k = viewPager2;
    }

    @androidx.annotation.n0
    public static v0 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 16428, new Class[]{View.class}, v0.class);
        if (patchProxyResultProxy.isSupported) {
            return (v0) patchProxyResultProxy.result;
        }
        int i10 = R.id.fragment_container;
        FrameLayout frameLayout = (FrameLayout) l3.d.a(view, R.id.fragment_container);
        if (frameLayout != null) {
            i10 = R.id.ll_select_click_area;
            LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.ll_select_click_area);
            if (linearLayout != null) {
                i10 = R.id.tab;
                TabLayout tabLayout = (TabLayout) l3.d.a(view, R.id.tab);
                if (tabLayout != null) {
                    i10 = R.id.tv_edit;
                    TextView textView = (TextView) l3.d.a(view, R.id.tv_edit);
                    if (textView != null) {
                        i10 = R.id.tv_next;
                        TextView textView2 = (TextView) l3.d.a(view, R.id.tv_next);
                        if (textView2 != null) {
                            i10 = R.id.tv_select;
                            TextView textView3 = (TextView) l3.d.a(view, R.id.tv_select);
                            if (textView3 != null) {
                                i10 = R.id.tv_selected_original;
                                MediumBoldTextView mediumBoldTextView = (MediumBoldTextView) l3.d.a(view, R.id.tv_selected_original);
                                if (mediumBoldTextView != null) {
                                    i10 = R.id.tv_selected_original_word;
                                    MediumBoldTextView mediumBoldTextView2 = (MediumBoldTextView) l3.d.a(view, R.id.tv_selected_original_word);
                                    if (mediumBoldTextView2 != null) {
                                        i10 = R.id.vg_select;
                                        RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, R.id.vg_select);
                                        if (relativeLayout != null) {
                                            i10 = R.id.vp2;
                                            ViewPager2 viewPager2 = (ViewPager2) l3.d.a(view, R.id.vp2);
                                            if (viewPager2 != null) {
                                                return new v0((RelativeLayout) view, frameLayout, linearLayout, tabLayout, textView, textView2, textView3, mediumBoldTextView, mediumBoldTextView2, relativeLayout, viewPager2);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static v0 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 16426, new Class[]{LayoutInflater.class}, v0.class);
        return patchProxyResultProxy.isSupported ? (v0) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static v0 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 16427, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, v0.class);
        if (patchProxyResultProxy.isSupported) {
            return (v0) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.activity_image_module_list, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f116552a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16429, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
