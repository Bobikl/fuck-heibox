package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.expression.widget.ExpressionTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemOfficialMessageV2Binding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class zr implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f118434a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final CardView f118435b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f118436c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f118437d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f118438e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f118439f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final ExpressionTextView f118440g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f118441h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f118442i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final ExpressionTextView f118443j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f118444k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f118445l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f118446m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f118447n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f118448o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f118449p;

    private zr(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 CardView cardView, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 ImageView imageView3, @androidx.annotation.n0 ImageView imageView4, @androidx.annotation.n0 ExpressionTextView expressionTextView, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 ExpressionTextView expressionTextView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 View view, @androidx.annotation.n0 LinearLayout linearLayout2, @androidx.annotation.n0 LinearLayout linearLayout3, @androidx.annotation.n0 LinearLayout linearLayout4, @androidx.annotation.n0 LinearLayout linearLayout5) {
        this.f118434a = linearLayout;
        this.f118435b = cardView;
        this.f118436c = imageView;
        this.f118437d = imageView2;
        this.f118438e = imageView3;
        this.f118439f = imageView4;
        this.f118440g = expressionTextView;
        this.f118441h = textView;
        this.f118442i = textView2;
        this.f118443j = expressionTextView2;
        this.f118444k = textView3;
        this.f118445l = view;
        this.f118446m = linearLayout2;
        this.f118447n = linearLayout3;
        this.f118448o = linearLayout4;
        this.f118449p = linearLayout5;
    }

    @androidx.annotation.n0
    public static zr a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 19248, new Class[]{View.class}, zr.class);
        if (patchProxyResultProxy.isSupported) {
            return (zr) patchProxyResultProxy.result;
        }
        int i10 = R.id.cv_content;
        CardView cardView = (CardView) l3.d.a(view, R.id.cv_content);
        if (cardView != null) {
            i10 = R.id.iv_avatar;
            ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_avatar);
            if (imageView != null) {
                i10 = R.id.iv_img;
                ImageView imageView2 = (ImageView) l3.d.a(view, R.id.iv_img);
                if (imageView2 != null) {
                    i10 = R.id.iv_mid_img;
                    ImageView imageView3 = (ImageView) l3.d.a(view, R.id.iv_mid_img);
                    if (imageView3 != null) {
                        i10 = R.id.iv_more;
                        ImageView imageView4 = (ImageView) l3.d.a(view, R.id.iv_more);
                        if (imageView4 != null) {
                            i10 = R.id.tv_desc;
                            ExpressionTextView expressionTextView = (ExpressionTextView) l3.d.a(view, R.id.tv_desc);
                            if (expressionTextView != null) {
                                i10 = R.id.tv_hint;
                                TextView textView = (TextView) l3.d.a(view, R.id.tv_hint);
                                if (textView != null) {
                                    i10 = R.id.tv_time;
                                    TextView textView2 = (TextView) l3.d.a(view, R.id.tv_time);
                                    if (textView2 != null) {
                                        i10 = R.id.tv_title;
                                        ExpressionTextView expressionTextView2 = (ExpressionTextView) l3.d.a(view, R.id.tv_title);
                                        if (expressionTextView2 != null) {
                                            i10 = R.id.tv_username;
                                            TextView textView3 = (TextView) l3.d.a(view, R.id.tv_username);
                                            if (textView3 != null) {
                                                i10 = R.id.v_divider;
                                                View viewA = l3.d.a(view, R.id.v_divider);
                                                if (viewA != null) {
                                                    i10 = R.id.vg_bottom_bar;
                                                    LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_bottom_bar);
                                                    if (linearLayout != null) {
                                                        i10 = R.id.vg_content;
                                                        LinearLayout linearLayout2 = (LinearLayout) l3.d.a(view, R.id.vg_content);
                                                        if (linearLayout2 != null) {
                                                            i10 = R.id.vg_text;
                                                            LinearLayout linearLayout3 = (LinearLayout) l3.d.a(view, R.id.vg_text);
                                                            if (linearLayout3 != null) {
                                                                i10 = R.id.vg_user_info;
                                                                LinearLayout linearLayout4 = (LinearLayout) l3.d.a(view, R.id.vg_user_info);
                                                                if (linearLayout4 != null) {
                                                                    return new zr((LinearLayout) view, cardView, imageView, imageView2, imageView3, imageView4, expressionTextView, textView, textView2, expressionTextView2, textView3, viewA, linearLayout, linearLayout2, linearLayout3, linearLayout4);
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
    public static zr c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 19246, new Class[]{LayoutInflater.class}, zr.class);
        return patchProxyResultProxy.isSupported ? (zr) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static zr d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 19247, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, zr.class);
        if (patchProxyResultProxy.isSupported) {
            return (zr) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_official_message_v2, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f118434a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 19249, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
