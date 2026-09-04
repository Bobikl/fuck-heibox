package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.expression.widget.ExpressionTextView;
import com.mcxtzhang.swipemenulib.SwipeMenuLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemDraftListBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class oi implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final SwipeMenuLayout f114242a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final CardView f114243b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f114244c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f114245d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f114246e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f114247f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f114248g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final SwipeMenuLayout f114249h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final ExpressionTextView f114250i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f114251j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f114252k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f114253l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @androidx.annotation.n0
    public final ExpressionTextView f114254m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f114255n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f114256o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f114257p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f114258q;

    private oi(@androidx.annotation.n0 SwipeMenuLayout swipeMenuLayout, @androidx.annotation.n0 CardView cardView, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 ImageView imageView3, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 LinearLayout linearLayout2, @androidx.annotation.n0 SwipeMenuLayout swipeMenuLayout2, @androidx.annotation.n0 ExpressionTextView expressionTextView, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 ExpressionTextView expressionTextView2, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 RelativeLayout relativeLayout2, @androidx.annotation.n0 RelativeLayout relativeLayout3) {
        this.f114242a = swipeMenuLayout;
        this.f114243b = cardView;
        this.f114244c = imageView;
        this.f114245d = imageView2;
        this.f114246e = imageView3;
        this.f114247f = linearLayout;
        this.f114248g = linearLayout2;
        this.f114249h = swipeMenuLayout2;
        this.f114250i = expressionTextView;
        this.f114251j = textView;
        this.f114252k = textView2;
        this.f114253l = textView3;
        this.f114254m = expressionTextView2;
        this.f114255n = textView4;
        this.f114256o = relativeLayout;
        this.f114257p = relativeLayout2;
        this.f114258q = relativeLayout3;
    }

    @androidx.annotation.n0
    public static oi a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 18271, new Class[]{View.class}, oi.class);
        if (patchProxyResultProxy.isSupported) {
            return (oi) patchProxyResultProxy.result;
        }
        int i10 = R.id.cv_link;
        CardView cardView = (CardView) l3.d.a(view, R.id.cv_link);
        if (cardView != null) {
            i10 = R.id.iv_img0;
            ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_img0);
            if (imageView != null) {
                i10 = R.id.iv_img1;
                ImageView imageView2 = (ImageView) l3.d.a(view, R.id.iv_img1);
                if (imageView2 != null) {
                    i10 = R.id.iv_img2;
                    ImageView imageView3 = (ImageView) l3.d.a(view, R.id.iv_img2);
                    if (imageView3 != null) {
                        i10 = R.id.ll_content;
                        LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.ll_content);
                        if (linearLayout != null) {
                            i10 = R.id.ll_img;
                            LinearLayout linearLayout2 = (LinearLayout) l3.d.a(view, R.id.ll_img);
                            if (linearLayout2 != null) {
                                SwipeMenuLayout swipeMenuLayout = (SwipeMenuLayout) view;
                                i10 = R.id.tv_content;
                                ExpressionTextView expressionTextView = (ExpressionTextView) l3.d.a(view, R.id.tv_content);
                                if (expressionTextView != null) {
                                    i10 = R.id.tv_del;
                                    TextView textView = (TextView) l3.d.a(view, R.id.tv_del);
                                    if (textView != null) {
                                        i10 = R.id.tv_edit_time;
                                        TextView textView2 = (TextView) l3.d.a(view, R.id.tv_edit_time);
                                        if (textView2 != null) {
                                            i10 = R.id.tv_img_cnt;
                                            TextView textView3 = (TextView) l3.d.a(view, R.id.tv_img_cnt);
                                            if (textView3 != null) {
                                                i10 = R.id.tv_title;
                                                ExpressionTextView expressionTextView2 = (ExpressionTextView) l3.d.a(view, R.id.tv_title);
                                                if (expressionTextView2 != null) {
                                                    i10 = R.id.tv_type;
                                                    TextView textView4 = (TextView) l3.d.a(view, R.id.tv_type);
                                                    if (textView4 != null) {
                                                        i10 = R.id.vg_basic_info;
                                                        RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, R.id.vg_basic_info);
                                                        if (relativeLayout != null) {
                                                            i10 = R.id.vg_img2;
                                                            RelativeLayout relativeLayout2 = (RelativeLayout) l3.d.a(view, R.id.vg_img2);
                                                            if (relativeLayout2 != null) {
                                                                i10 = R.id.vg_item;
                                                                RelativeLayout relativeLayout3 = (RelativeLayout) l3.d.a(view, R.id.vg_item);
                                                                if (relativeLayout3 != null) {
                                                                    return new oi(swipeMenuLayout, cardView, imageView, imageView2, imageView3, linearLayout, linearLayout2, swipeMenuLayout, expressionTextView, textView, textView2, textView3, expressionTextView2, textView4, relativeLayout, relativeLayout2, relativeLayout3);
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
    public static oi c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 18269, new Class[]{LayoutInflater.class}, oi.class);
        return patchProxyResultProxy.isSupported ? (oi) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static oi d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 18270, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, oi.class);
        if (patchProxyResultProxy.isSupported) {
            return (oi) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_draft_list, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public SwipeMenuLayout b() {
        return this.f114242a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 18272, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
