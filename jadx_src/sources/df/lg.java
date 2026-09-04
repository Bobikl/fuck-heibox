package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemConceptTopicBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class lg implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final CardView f113046a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final CardView f113047b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f113048c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f113049d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f113050e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f113051f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f113052g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f113053h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f113054i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f113055j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f113056k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f113057l;

    private lg(@androidx.annotation.n0 CardView cardView, @androidx.annotation.n0 CardView cardView2, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 ImageView imageView3, @androidx.annotation.n0 ImageView imageView4, @androidx.annotation.n0 ImageView imageView5, @androidx.annotation.n0 ImageView imageView6, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 LinearLayout linearLayout2) {
        this.f113046a = cardView;
        this.f113047b = cardView2;
        this.f113048c = imageView;
        this.f113049d = imageView2;
        this.f113050e = imageView3;
        this.f113051f = imageView4;
        this.f113052g = imageView5;
        this.f113053h = imageView6;
        this.f113054i = textView;
        this.f113055j = textView2;
        this.f113056k = linearLayout;
        this.f113057l = linearLayout2;
    }

    @androidx.annotation.n0
    public static lg a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 18051, new Class[]{View.class}, lg.class);
        if (patchProxyResultProxy.isSupported) {
            return (lg) patchProxyResultProxy.result;
        }
        CardView cardView = (CardView) view;
        int i10 = R.id.iv_bg;
        ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_bg);
        if (imageView != null) {
            i10 = R.id.iv_checked;
            ImageView imageView2 = (ImageView) l3.d.a(view, R.id.iv_checked);
            if (imageView2 != null) {
                i10 = R.id.iv_hot;
                ImageView imageView3 = (ImageView) l3.d.a(view, R.id.iv_hot);
                if (imageView3 != null) {
                    i10 = R.id.iv_icon;
                    ImageView imageView4 = (ImageView) l3.d.a(view, R.id.iv_icon);
                    if (imageView4 != null) {
                        i10 = R.id.iv_mask;
                        ImageView imageView5 = (ImageView) l3.d.a(view, R.id.iv_mask);
                        if (imageView5 != null) {
                            i10 = R.id.iv_subscribe;
                            ImageView imageView6 = (ImageView) l3.d.a(view, R.id.iv_subscribe);
                            if (imageView6 != null) {
                                i10 = R.id.tv_chatroom_num;
                                TextView textView = (TextView) l3.d.a(view, R.id.tv_chatroom_num);
                                if (textView != null) {
                                    i10 = R.id.tv_name;
                                    TextView textView2 = (TextView) l3.d.a(view, R.id.tv_name);
                                    if (textView2 != null) {
                                        i10 = R.id.vg_chatroom_num;
                                        LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_chatroom_num);
                                        if (linearLayout != null) {
                                            i10 = R.id.vg_name;
                                            LinearLayout linearLayout2 = (LinearLayout) l3.d.a(view, R.id.vg_name);
                                            if (linearLayout2 != null) {
                                                return new lg(cardView, cardView, imageView, imageView2, imageView3, imageView4, imageView5, imageView6, textView, textView2, linearLayout, linearLayout2);
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
    public static lg c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 18049, new Class[]{LayoutInflater.class}, lg.class);
        return patchProxyResultProxy.isSupported ? (lg) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static lg d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 18050, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, lg.class);
        if (patchProxyResultProxy.isSupported) {
            return (lg) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_concept_topic, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public CardView b() {
        return this.f113046a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 18052, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
