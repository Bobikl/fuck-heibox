package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ViewPostToolsV2Binding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class tg0 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final ConstraintLayout f115994a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f115995b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f115996c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f115997d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f115998e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f115999f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f116000g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f116001h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f116002i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f116003j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final ViewPager2 f116004k;

    private tg0(@androidx.annotation.n0 ConstraintLayout constraintLayout, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 LinearLayout linearLayout2, @androidx.annotation.n0 LinearLayout linearLayout3, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 View view, @androidx.annotation.n0 View view2, @androidx.annotation.n0 View view3, @androidx.annotation.n0 ViewPager2 viewPager2) {
        this.f115994a = constraintLayout;
        this.f115995b = linearLayout;
        this.f115996c = linearLayout2;
        this.f115997d = linearLayout3;
        this.f115998e = textView;
        this.f115999f = textView2;
        this.f116000g = textView3;
        this.f116001h = view;
        this.f116002i = view2;
        this.f116003j = view3;
        this.f116004k = viewPager2;
    }

    @androidx.annotation.n0
    public static tg0 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 21798, new Class[]{View.class}, tg0.class);
        if (patchProxyResultProxy.isSupported) {
            return (tg0) patchProxyResultProxy.result;
        }
        int i10 = R.id.post_tools_gallery_tab;
        LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.post_tools_gallery_tab);
        if (linearLayout != null) {
            i10 = R.id.post_tools_game_shot_tab;
            LinearLayout linearLayout2 = (LinearLayout) l3.d.a(view, R.id.post_tools_game_shot_tab);
            if (linearLayout2 != null) {
                i10 = R.id.post_tools_template_tab;
                LinearLayout linearLayout3 = (LinearLayout) l3.d.a(view, R.id.post_tools_template_tab);
                if (linearLayout3 != null) {
                    i10 = R.id.tv_gallery_tab;
                    TextView textView = (TextView) l3.d.a(view, R.id.tv_gallery_tab);
                    if (textView != null) {
                        i10 = R.id.tv_game_shot_tab;
                        TextView textView2 = (TextView) l3.d.a(view, R.id.tv_game_shot_tab);
                        if (textView2 != null) {
                            i10 = R.id.tv_template_tab;
                            TextView textView3 = (TextView) l3.d.a(view, R.id.tv_template_tab);
                            if (textView3 != null) {
                                i10 = R.id.v_gallery_tab_underline;
                                View viewA = l3.d.a(view, R.id.v_gallery_tab_underline);
                                if (viewA != null) {
                                    i10 = R.id.v_game_shot_tab_underline;
                                    View viewA2 = l3.d.a(view, R.id.v_game_shot_tab_underline);
                                    if (viewA2 != null) {
                                        i10 = R.id.v_template_tab_underline;
                                        View viewA3 = l3.d.a(view, R.id.v_template_tab_underline);
                                        if (viewA3 != null) {
                                            i10 = R.id.vp_post_tools_content;
                                            ViewPager2 viewPager2 = (ViewPager2) l3.d.a(view, R.id.vp_post_tools_content);
                                            if (viewPager2 != null) {
                                                return new tg0((ConstraintLayout) view, linearLayout, linearLayout2, linearLayout3, textView, textView2, textView3, viewA, viewA2, viewA3, viewPager2);
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
    public static tg0 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 21796, new Class[]{LayoutInflater.class}, tg0.class);
        return patchProxyResultProxy.isSupported ? (tg0) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static tg0 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 21797, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, tg0.class);
        if (patchProxyResultProxy.isSupported) {
            return (tg0) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.view_post_tools_v2, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public ConstraintLayout b() {
        return this.f115994a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 21799, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
