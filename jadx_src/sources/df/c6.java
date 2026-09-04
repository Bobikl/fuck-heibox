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
import com.max.hbcommon.component.bottombutton.BottomButtonLeftItemView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: DialogPostCompilationCreateBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class c6 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f109161a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final CardView f109162b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final BottomButtonLeftItemView f109163c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final EditText f109164d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final EditText f109165e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f109166f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f109167g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f109168h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f109169i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f109170j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f109171k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f109172l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f109173m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f109174n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f109175o;

    private c6(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 CardView cardView, @androidx.annotation.n0 BottomButtonLeftItemView bottomButtonLeftItemView, @androidx.annotation.n0 EditText editText, @androidx.annotation.n0 EditText editText2, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 ImageView imageView3, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 TextView textView5, @androidx.annotation.n0 View view) {
        this.f109161a = relativeLayout;
        this.f109162b = cardView;
        this.f109163c = bottomButtonLeftItemView;
        this.f109164d = editText;
        this.f109165e = editText2;
        this.f109166f = imageView;
        this.f109167g = imageView2;
        this.f109168h = imageView3;
        this.f109169i = linearLayout;
        this.f109170j = textView;
        this.f109171k = textView2;
        this.f109172l = textView3;
        this.f109173m = textView4;
        this.f109174n = textView5;
        this.f109175o = view;
    }

    @androidx.annotation.n0
    public static c6 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 16976, new Class[]{View.class}, c6.class);
        if (patchProxyResultProxy.isSupported) {
            return (c6) patchProxyResultProxy.result;
        }
        int i10 = R.id.add_cover_card;
        CardView cardView = (CardView) l3.d.a(view, R.id.add_cover_card);
        if (cardView != null) {
            i10 = R.id.bottom_button;
            BottomButtonLeftItemView bottomButtonLeftItemView = (BottomButtonLeftItemView) l3.d.a(view, R.id.bottom_button);
            if (bottomButtonLeftItemView != null) {
                i10 = R.id.et_desc;
                EditText editText = (EditText) l3.d.a(view, R.id.et_desc);
                if (editText != null) {
                    i10 = R.id.et_title;
                    EditText editText2 = (EditText) l3.d.a(view, R.id.et_title);
                    if (editText2 != null) {
                        i10 = R.id.iv_add;
                        ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_add);
                        if (imageView != null) {
                            i10 = R.id.iv_clear;
                            ImageView imageView2 = (ImageView) l3.d.a(view, R.id.iv_clear);
                            if (imageView2 != null) {
                                i10 = R.id.iv_img;
                                ImageView imageView3 = (ImageView) l3.d.a(view, R.id.iv_img);
                                if (imageView3 != null) {
                                    i10 = R.id.ll_bottom_button;
                                    LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.ll_bottom_button);
                                    if (linearLayout != null) {
                                        i10 = R.id.tv_asterisk_1;
                                        TextView textView = (TextView) l3.d.a(view, R.id.tv_asterisk_1);
                                        if (textView != null) {
                                            i10 = R.id.tv_asterisk_2;
                                            TextView textView2 = (TextView) l3.d.a(view, R.id.tv_asterisk_2);
                                            if (textView2 != null) {
                                                i10 = R.id.tv_compilation_cover;
                                                TextView textView3 = (TextView) l3.d.a(view, R.id.tv_compilation_cover);
                                                if (textView3 != null) {
                                                    i10 = R.id.tv_compilation_desc;
                                                    TextView textView4 = (TextView) l3.d.a(view, R.id.tv_compilation_desc);
                                                    if (textView4 != null) {
                                                        i10 = R.id.tv_compilation_title;
                                                        TextView textView5 = (TextView) l3.d.a(view, R.id.tv_compilation_title);
                                                        if (textView5 != null) {
                                                            i10 = R.id.v_img_stroke;
                                                            View viewA = l3.d.a(view, R.id.v_img_stroke);
                                                            if (viewA != null) {
                                                                return new c6((RelativeLayout) view, cardView, bottomButtonLeftItemView, editText, editText2, imageView, imageView2, imageView3, linearLayout, textView, textView2, textView3, textView4, textView5, viewA);
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
    public static c6 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 16974, new Class[]{LayoutInflater.class}, c6.class);
        return patchProxyResultProxy.isSupported ? (c6) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static c6 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 16975, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, c6.class);
        if (patchProxyResultProxy.isSupported) {
            return (c6) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.dialog_post_compilation_create, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f109161a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16977, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
