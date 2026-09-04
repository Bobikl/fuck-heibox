package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.max.hbcustomview.HBLineHeightTextView;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.account.component.SettingItemView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: DialogPostSettingBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class f6 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f110424a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final mb.o f110425b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final id0 f110426c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final FrameLayout f110427d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f110428e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f110429f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f110430g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f110431h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f110432i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final RecyclerView f110433j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final SettingItemView f110434k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.n0
    public final SettingItemView f110435l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @androidx.annotation.n0
    public final SettingItemView f110436m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @androidx.annotation.n0
    public final Space f110437n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f110438o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f110439p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @androidx.annotation.n0
    public final HBLineHeightTextView f110440q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f110441r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f110442s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f110443t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @androidx.annotation.n0
    public final o3 f110444u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f110445v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f110446w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f110447x;

    private f6(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 mb.o oVar, @androidx.annotation.n0 id0 id0Var, @androidx.annotation.n0 FrameLayout frameLayout, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 LinearLayout linearLayout2, @androidx.annotation.n0 LinearLayout linearLayout3, @androidx.annotation.n0 LinearLayout linearLayout4, @androidx.annotation.n0 RecyclerView recyclerView, @androidx.annotation.n0 SettingItemView settingItemView, @androidx.annotation.n0 SettingItemView settingItemView2, @androidx.annotation.n0 SettingItemView settingItemView3, @androidx.annotation.n0 Space space, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 HBLineHeightTextView hBLineHeightTextView, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 TextView textView5, @androidx.annotation.n0 o3 o3Var, @androidx.annotation.n0 LinearLayout linearLayout5, @androidx.annotation.n0 LinearLayout linearLayout6, @androidx.annotation.n0 LinearLayout linearLayout7) {
        this.f110424a = linearLayout;
        this.f110425b = oVar;
        this.f110426c = id0Var;
        this.f110427d = frameLayout;
        this.f110428e = imageView;
        this.f110429f = imageView2;
        this.f110430g = linearLayout2;
        this.f110431h = linearLayout3;
        this.f110432i = linearLayout4;
        this.f110433j = recyclerView;
        this.f110434k = settingItemView;
        this.f110435l = settingItemView2;
        this.f110436m = settingItemView3;
        this.f110437n = space;
        this.f110438o = textView;
        this.f110439p = textView2;
        this.f110440q = hBLineHeightTextView;
        this.f110441r = textView3;
        this.f110442s = textView4;
        this.f110443t = textView5;
        this.f110444u = o3Var;
        this.f110445v = linearLayout5;
        this.f110446w = linearLayout6;
        this.f110447x = linearLayout7;
    }

    @androidx.annotation.n0
    public static f6 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 16988, new Class[]{View.class}, f6.class);
        if (patchProxyResultProxy.isSupported) {
            return (f6) patchProxyResultProxy.result;
        }
        int i10 = R.id.bottom_tip_divider;
        View viewA = l3.d.a(view, R.id.bottom_tip_divider);
        if (viewA != null) {
            mb.o oVarA = mb.o.a(viewA);
            i10 = R.id.divider_siv_root;
            View viewA2 = l3.d.a(view, R.id.divider_siv_root);
            if (viewA2 != null) {
                id0 id0VarA = id0.a(viewA2);
                i10 = R.id.fl_post_time_set;
                FrameLayout frameLayout = (FrameLayout) l3.d.a(view, R.id.fl_post_time_set);
                if (frameLayout != null) {
                    i10 = R.id.iv_clear_selected_compilation;
                    ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_clear_selected_compilation);
                    if (imageView != null) {
                        i10 = R.id.iv_post_schedule_time_arrow;
                        ImageView imageView2 = (ImageView) l3.d.a(view, R.id.iv_post_schedule_time_arrow);
                        if (imageView2 != null) {
                            i10 = R.id.ll_action;
                            LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.ll_action);
                            if (linearLayout != null) {
                                i10 = R.id.ll_selected_compilation;
                                LinearLayout linearLayout2 = (LinearLayout) l3.d.a(view, R.id.ll_selected_compilation);
                                if (linearLayout2 != null) {
                                    i10 = R.id.post_compilation_container;
                                    LinearLayout linearLayout3 = (LinearLayout) l3.d.a(view, R.id.post_compilation_container);
                                    if (linearLayout3 != null) {
                                        i10 = R.id.rv_project;
                                        RecyclerView recyclerView = (RecyclerView) l3.d.a(view, R.id.rv_project);
                                        if (recyclerView != null) {
                                            i10 = R.id.siv_headline;
                                            SettingItemView settingItemView = (SettingItemView) l3.d.a(view, R.id.siv_headline);
                                            if (settingItemView != null) {
                                                i10 = R.id.siv_root;
                                                SettingItemView settingItemView2 = (SettingItemView) l3.d.a(view, R.id.siv_root);
                                                if (settingItemView2 != null) {
                                                    i10 = R.id.siv_schedule_post_time;
                                                    SettingItemView settingItemView3 = (SettingItemView) l3.d.a(view, R.id.siv_schedule_post_time);
                                                    if (settingItemView3 != null) {
                                                        i10 = R.id.space_no_post_plan;
                                                        Space space = (Space) l3.d.a(view, R.id.space_no_post_plan);
                                                        if (space != null) {
                                                            i10 = R.id.tv_action_desc;
                                                            TextView textView = (TextView) l3.d.a(view, R.id.tv_action_desc);
                                                            if (textView != null) {
                                                                i10 = R.id.tv_add_into_compilation_w500;
                                                                TextView textView2 = (TextView) l3.d.a(view, R.id.tv_add_into_compilation_w500);
                                                                if (textView2 != null) {
                                                                    i10 = R.id.tv_irregular_post_plan_tip;
                                                                    HBLineHeightTextView hBLineHeightTextView = (HBLineHeightTextView) l3.d.a(view, R.id.tv_irregular_post_plan_tip);
                                                                    if (hBLineHeightTextView != null) {
                                                                        i10 = R.id.tv_post_plan_desc;
                                                                        TextView textView3 = (TextView) l3.d.a(view, R.id.tv_post_plan_desc);
                                                                        if (textView3 != null) {
                                                                            i10 = R.id.tv_post_schedule_time;
                                                                            TextView textView4 = (TextView) l3.d.a(view, R.id.tv_post_schedule_time);
                                                                            if (textView4 != null) {
                                                                                i10 = R.id.tv_selected_compilation;
                                                                                TextView textView5 = (TextView) l3.d.a(view, R.id.tv_selected_compilation);
                                                                                if (textView5 != null) {
                                                                                    i10 = R.id.vg_article_preview;
                                                                                    View viewA3 = l3.d.a(view, R.id.vg_article_preview);
                                                                                    if (viewA3 != null) {
                                                                                        o3 o3VarA = o3.a(viewA3);
                                                                                        i10 = R.id.vg_headline;
                                                                                        LinearLayout linearLayout4 = (LinearLayout) l3.d.a(view, R.id.vg_headline);
                                                                                        if (linearLayout4 != null) {
                                                                                            i10 = R.id.vg_project;
                                                                                            LinearLayout linearLayout5 = (LinearLayout) l3.d.a(view, R.id.vg_project);
                                                                                            if (linearLayout5 != null) {
                                                                                                i10 = R.id.vg_siv_root;
                                                                                                LinearLayout linearLayout6 = (LinearLayout) l3.d.a(view, R.id.vg_siv_root);
                                                                                                if (linearLayout6 != null) {
                                                                                                    return new f6((LinearLayout) view, oVarA, id0VarA, frameLayout, imageView, imageView2, linearLayout, linearLayout2, linearLayout3, recyclerView, settingItemView, settingItemView2, settingItemView3, space, textView, textView2, hBLineHeightTextView, textView3, textView4, textView5, o3VarA, linearLayout4, linearLayout5, linearLayout6);
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
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static f6 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 16986, new Class[]{LayoutInflater.class}, f6.class);
        return patchProxyResultProxy.isSupported ? (f6) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static f6 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 16987, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, f6.class);
        if (patchProxyResultProxy.isSupported) {
            return (f6) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.dialog_post_setting, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f110424a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16989, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
