package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.max.hbcommon.component.HeyBoxAvatarView;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.expression.widget.ExpressionTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: LayoutMaterialPostHeaderBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class z70 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f118239a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final HeyBoxAvatarView f118240b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f118241c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final ExpressionTextView f118242d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f118243e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f118244f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f118245g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f118246h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final nn f118247i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f118248j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f118249k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f118250l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f118251m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f118252n;

    private z70(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 HeyBoxAvatarView heyBoxAvatarView, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ExpressionTextView expressionTextView, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 nn nnVar, @androidx.annotation.n0 RelativeLayout relativeLayout2, @androidx.annotation.n0 RelativeLayout relativeLayout3, @androidx.annotation.n0 LinearLayout linearLayout2, @androidx.annotation.n0 LinearLayout linearLayout3, @androidx.annotation.n0 RelativeLayout relativeLayout4) {
        this.f118239a = relativeLayout;
        this.f118240b = heyBoxAvatarView;
        this.f118241c = imageView;
        this.f118242d = expressionTextView;
        this.f118243e = textView;
        this.f118244f = textView2;
        this.f118245g = textView3;
        this.f118246h = linearLayout;
        this.f118247i = nnVar;
        this.f118248j = relativeLayout2;
        this.f118249k = relativeLayout3;
        this.f118250l = linearLayout2;
        this.f118251m = linearLayout3;
        this.f118252n = relativeLayout4;
    }

    @androidx.annotation.n0
    public static z70 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 20898, new Class[]{View.class}, z70.class);
        if (patchProxyResultProxy.isSupported) {
            return (z70) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_avatar;
        HeyBoxAvatarView heyBoxAvatarView = (HeyBoxAvatarView) l3.d.a(view, R.id.iv_avatar);
        if (heyBoxAvatarView != null) {
            i10 = R.id.iv_expand;
            ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_expand);
            if (imageView != null) {
                i10 = R.id.tv_desc;
                ExpressionTextView expressionTextView = (ExpressionTextView) l3.d.a(view, R.id.tv_desc);
                if (expressionTextView != null) {
                    i10 = R.id.tv_material_info;
                    TextView textView = (TextView) l3.d.a(view, R.id.tv_material_info);
                    if (textView != null) {
                        i10 = R.id.tv_title;
                        TextView textView2 = (TextView) l3.d.a(view, R.id.tv_title);
                        if (textView2 != null) {
                            i10 = R.id.tv_user_name;
                            TextView textView3 = (TextView) l3.d.a(view, R.id.tv_user_name);
                            if (textView3 != null) {
                                i10 = R.id.vg_cards;
                                LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_cards);
                                if (linearLayout != null) {
                                    i10 = R.id.vg_header_game_rec;
                                    View viewA = l3.d.a(view, R.id.vg_header_game_rec);
                                    if (viewA != null) {
                                        nn nnVarA = nn.a(viewA);
                                        i10 = R.id.vg_header_game_rec_wrapper;
                                        RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, R.id.vg_header_game_rec_wrapper);
                                        if (relativeLayout != null) {
                                            i10 = R.id.vg_panel_sub_a;
                                            RelativeLayout relativeLayout2 = (RelativeLayout) l3.d.a(view, R.id.vg_panel_sub_a);
                                            if (relativeLayout2 != null) {
                                                i10 = R.id.vg_panel_sub_b;
                                                LinearLayout linearLayout2 = (LinearLayout) l3.d.a(view, R.id.vg_panel_sub_b);
                                                if (linearLayout2 != null) {
                                                    i10 = R.id.vg_title;
                                                    LinearLayout linearLayout3 = (LinearLayout) l3.d.a(view, R.id.vg_title);
                                                    if (linearLayout3 != null) {
                                                        i10 = R.id.vg_user;
                                                        RelativeLayout relativeLayout3 = (RelativeLayout) l3.d.a(view, R.id.vg_user);
                                                        if (relativeLayout3 != null) {
                                                            return new z70((RelativeLayout) view, heyBoxAvatarView, imageView, expressionTextView, textView, textView2, textView3, linearLayout, nnVarA, relativeLayout, relativeLayout2, linearLayout2, linearLayout3, relativeLayout3);
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
    public static z70 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 20896, new Class[]{LayoutInflater.class}, z70.class);
        return patchProxyResultProxy.isSupported ? (z70) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static z70 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 20897, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, z70.class);
        if (patchProxyResultProxy.isSupported) {
            return (z70) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.layout_material_post_header, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f118239a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 20899, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
