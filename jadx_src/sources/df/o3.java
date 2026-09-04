package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.account.component.SettingItemView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ArticlePreviewBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class o3 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f114063a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final EditText f114064b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f114065c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final SettingItemView f114066d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final SettingItemView f114067e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final SettingItemView f114068f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f114069g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f114070h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f114071i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final m30 f114072j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f114073k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.n0
    public final CardView f114074l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f114075m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f114076n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f114077o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f114078p;

    private o3(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 EditText editText, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 SettingItemView settingItemView, @androidx.annotation.n0 SettingItemView settingItemView2, @androidx.annotation.n0 SettingItemView settingItemView3, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 LinearLayout linearLayout2, @androidx.annotation.n0 m30 m30Var, @androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 CardView cardView, @androidx.annotation.n0 LinearLayout linearLayout3, @androidx.annotation.n0 RelativeLayout relativeLayout2, @androidx.annotation.n0 LinearLayout linearLayout4, @androidx.annotation.n0 LinearLayout linearLayout5) {
        this.f114063a = linearLayout;
        this.f114064b = editText;
        this.f114065c = imageView;
        this.f114066d = settingItemView;
        this.f114067e = settingItemView2;
        this.f114068f = settingItemView3;
        this.f114069g = textView;
        this.f114070h = textView2;
        this.f114071i = linearLayout2;
        this.f114072j = m30Var;
        this.f114073k = relativeLayout;
        this.f114074l = cardView;
        this.f114075m = linearLayout3;
        this.f114076n = relativeLayout2;
        this.f114077o = linearLayout4;
        this.f114078p = linearLayout5;
    }

    @androidx.annotation.n0
    public static o3 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 16712, new Class[]{View.class}, o3.class);
        if (patchProxyResultProxy.isSupported) {
            return (o3) patchProxyResultProxy.result;
        }
        int i10 = R.id.et_reference;
        EditText editText = (EditText) l3.d.a(view, R.id.et_reference);
        if (editText != null) {
            i10 = R.id.iv_preview_img;
            ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_preview_img);
            if (imageView != null) {
                i10 = R.id.siv_article_type;
                SettingItemView settingItemView = (SettingItemView) l3.d.a(view, R.id.siv_article_type);
                if (settingItemView != null) {
                    i10 = R.id.siv_auth;
                    SettingItemView settingItemView2 = (SettingItemView) l3.d.a(view, R.id.siv_auth);
                    if (settingItemView2 != null) {
                        i10 = R.id.siv_reprint_tips;
                        SettingItemView settingItemView3 = (SettingItemView) l3.d.a(view, R.id.siv_reprint_tips);
                        if (settingItemView3 != null) {
                            i10 = R.id.tv_change_preview_img;
                            TextView textView = (TextView) l3.d.a(view, R.id.tv_change_preview_img);
                            if (textView != null) {
                                i10 = R.id.tv_preview_title;
                                TextView textView2 = (TextView) l3.d.a(view, R.id.tv_preview_title);
                                if (textView2 != null) {
                                    i10 = R.id.vg_atticle_info;
                                    LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_atticle_info);
                                    if (linearLayout != null) {
                                        i10 = R.id.vg_preview_bottom_bar;
                                        View viewA = l3.d.a(view, R.id.vg_preview_bottom_bar);
                                        if (viewA != null) {
                                            m30 m30VarA = m30.a(viewA);
                                            i10 = R.id.vg_preview_bottom_bar_placeholder;
                                            RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, R.id.vg_preview_bottom_bar_placeholder);
                                            if (relativeLayout != null) {
                                                i10 = R.id.vg_preview_img;
                                                CardView cardView = (CardView) l3.d.a(view, R.id.vg_preview_img);
                                                if (cardView != null) {
                                                    i10 = R.id.vg_preview_title_placeholder;
                                                    LinearLayout linearLayout2 = (LinearLayout) l3.d.a(view, R.id.vg_preview_title_placeholder);
                                                    if (linearLayout2 != null) {
                                                        i10 = R.id.vg_reference;
                                                        RelativeLayout relativeLayout2 = (RelativeLayout) l3.d.a(view, R.id.vg_reference);
                                                        if (relativeLayout2 != null) {
                                                            i10 = R.id.vg_siv_auth;
                                                            LinearLayout linearLayout3 = (LinearLayout) l3.d.a(view, R.id.vg_siv_auth);
                                                            if (linearLayout3 != null) {
                                                                i10 = R.id.vg_siv_reprint_tips;
                                                                LinearLayout linearLayout4 = (LinearLayout) l3.d.a(view, R.id.vg_siv_reprint_tips);
                                                                if (linearLayout4 != null) {
                                                                    return new o3((LinearLayout) view, editText, imageView, settingItemView, settingItemView2, settingItemView3, textView, textView2, linearLayout, m30VarA, relativeLayout, cardView, linearLayout2, relativeLayout2, linearLayout3, linearLayout4);
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
    public static o3 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 16710, new Class[]{LayoutInflater.class}, o3.class);
        return patchProxyResultProxy.isSupported ? (o3) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static o3 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 16711, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, o3.class);
        if (patchProxyResultProxy.isSupported) {
            return (o3) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.article_preview, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f114063a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16713, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
