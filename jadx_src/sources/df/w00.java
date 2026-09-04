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

/* JADX INFO: compiled from: ItemUserMessageBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class w00 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final CardView f116967a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final CardView f116968b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f116969c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f116970d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f116971e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f116972f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final ExpressionTextView f116973g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f116974h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final ExpressionTextView f116975i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f116976j;

    private w00(@androidx.annotation.n0 CardView cardView, @androidx.annotation.n0 CardView cardView2, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 ImageView imageView3, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 ExpressionTextView expressionTextView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 ExpressionTextView expressionTextView2, @androidx.annotation.n0 LinearLayout linearLayout) {
        this.f116967a = cardView;
        this.f116968b = cardView2;
        this.f116969c = imageView;
        this.f116970d = imageView2;
        this.f116971e = imageView3;
        this.f116972f = textView;
        this.f116973g = expressionTextView;
        this.f116974h = textView2;
        this.f116975i = expressionTextView2;
        this.f116976j = linearLayout;
    }

    @androidx.annotation.n0
    public static w00 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 20164, new Class[]{View.class}, w00.class);
        if (patchProxyResultProxy.isSupported) {
            return (w00) patchProxyResultProxy.result;
        }
        CardView cardView = (CardView) view;
        int i10 = R.id.iv_avatar;
        ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_avatar);
        if (imageView != null) {
            i10 = R.id.iv_more_s;
            ImageView imageView2 = (ImageView) l3.d.a(view, R.id.iv_more_s);
            if (imageView2 != null) {
                i10 = R.id.iv_option;
                ImageView imageView3 = (ImageView) l3.d.a(view, R.id.iv_option);
                if (imageView3 != null) {
                    i10 = R.id.tv_name;
                    TextView textView = (TextView) l3.d.a(view, R.id.tv_name);
                    if (textView != null) {
                        i10 = R.id.tv_text;
                        ExpressionTextView expressionTextView = (ExpressionTextView) l3.d.a(view, R.id.tv_text);
                        if (expressionTextView != null) {
                            i10 = R.id.tv_time;
                            TextView textView2 = (TextView) l3.d.a(view, R.id.tv_time);
                            if (textView2 != null) {
                                i10 = R.id.tv_type;
                                ExpressionTextView expressionTextView2 = (ExpressionTextView) l3.d.a(view, R.id.tv_type);
                                if (expressionTextView2 != null) {
                                    i10 = R.id.vg_item;
                                    LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_item);
                                    if (linearLayout != null) {
                                        return new w00(cardView, cardView, imageView, imageView2, imageView3, textView, expressionTextView, textView2, expressionTextView2, linearLayout);
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
    public static w00 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 20162, new Class[]{LayoutInflater.class}, w00.class);
        return patchProxyResultProxy.isSupported ? (w00) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static w00 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 20163, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, w00.class);
        if (patchProxyResultProxy.isSupported) {
            return (w00) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_user_message, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public CardView b() {
        return this.f116967a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 20165, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
