package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.max.hbcommon.component.LineListItemView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: LayoutNoGameScreenShotBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class p80 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f114472a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f114473b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f114474c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final LineListItemView f114475d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final LineListItemView f114476e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final LineListItemView f114477f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final LineListItemView f114478g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f114479h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f114480i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f114481j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f114482k;

    private p80(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 LineListItemView lineListItemView, @androidx.annotation.n0 LineListItemView lineListItemView2, @androidx.annotation.n0 LineListItemView lineListItemView3, @androidx.annotation.n0 LineListItemView lineListItemView4, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 LinearLayout linearLayout2, @androidx.annotation.n0 LinearLayout linearLayout3) {
        this.f114472a = linearLayout;
        this.f114473b = imageView;
        this.f114474c = imageView2;
        this.f114475d = lineListItemView;
        this.f114476e = lineListItemView2;
        this.f114477f = lineListItemView3;
        this.f114478g = lineListItemView4;
        this.f114479h = textView;
        this.f114480i = textView2;
        this.f114481j = linearLayout2;
        this.f114482k = linearLayout3;
    }

    @androidx.annotation.n0
    public static p80 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 20962, new Class[]{View.class}, p80.class);
        if (patchProxyResultProxy.isSupported) {
            return (p80) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_tips_img;
        ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_tips_img);
        if (imageView != null) {
            i10 = R.id.iv_view_full_help_tip;
            ImageView imageView2 = (ImageView) l3.d.a(view, R.id.iv_view_full_help_tip);
            if (imageView2 != null) {
                i10 = R.id.lliv_f12_tip;
                LineListItemView lineListItemView = (LineListItemView) l3.d.a(view, R.id.lliv_f12_tip);
                if (lineListItemView != null) {
                    i10 = R.id.lliv_set_pic_public_tip;
                    LineListItemView lineListItemView2 = (LineListItemView) l3.d.a(view, R.id.lliv_set_pic_public_tip);
                    if (lineListItemView2 != null) {
                        i10 = R.id.lliv_upload_steam_tip;
                        LineListItemView lineListItemView3 = (LineListItemView) l3.d.a(view, R.id.lliv_upload_steam_tip);
                        if (lineListItemView3 != null) {
                            i10 = R.id.lliv_use_heybox_accelerator_tip;
                            LineListItemView lineListItemView4 = (LineListItemView) l3.d.a(view, R.id.lliv_use_heybox_accelerator_tip);
                            if (lineListItemView4 != null) {
                                i10 = R.id.tv_tip_title;
                                TextView textView = (TextView) l3.d.a(view, R.id.tv_tip_title);
                                if (textView != null) {
                                    i10 = R.id.tv_view_full_help_tip;
                                    TextView textView2 = (TextView) l3.d.a(view, R.id.tv_view_full_help_tip);
                                    if (textView2 != null) {
                                        i10 = R.id.vg_goto_help;
                                        LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_goto_help);
                                        if (linearLayout != null) {
                                            i10 = R.id.vg_tips;
                                            LinearLayout linearLayout2 = (LinearLayout) l3.d.a(view, R.id.vg_tips);
                                            if (linearLayout2 != null) {
                                                return new p80((LinearLayout) view, imageView, imageView2, lineListItemView, lineListItemView2, lineListItemView3, lineListItemView4, textView, textView2, linearLayout, linearLayout2);
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
    public static p80 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 20960, new Class[]{LayoutInflater.class}, p80.class);
        return patchProxyResultProxy.isSupported ? (p80) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static p80 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 20961, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, p80.class);
        if (patchProxyResultProxy.isSupported) {
            return (p80) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.layout_no_game_screen_shot, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f114472a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 20963, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
