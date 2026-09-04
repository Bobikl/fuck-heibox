package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.max.hbcustomview.GradientTextView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemPlayerLeaderboardsPubgBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class bt implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f109018a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f109019b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f109020c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f109021d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f109022e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final GradientTextView f109023f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f109024g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f109025h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f109026i;

    private bt(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 ImageView imageView3, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 GradientTextView gradientTextView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4) {
        this.f109018a = linearLayout;
        this.f109019b = imageView;
        this.f109020c = imageView2;
        this.f109021d = imageView3;
        this.f109022e = textView;
        this.f109023f = gradientTextView;
        this.f109024g = textView2;
        this.f109025h = textView3;
        this.f109026i = textView4;
    }

    @androidx.annotation.n0
    public static bt a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 19360, new Class[]{View.class}, bt.class);
        if (patchProxyResultProxy.isSupported) {
            return (bt) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_avatar;
        ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_avatar);
        if (imageView != null) {
            i10 = R.id.iv_more;
            ImageView imageView2 = (ImageView) l3.d.a(view, R.id.iv_more);
            if (imageView2 != null) {
                i10 = R.id.iv_rating_img;
                ImageView imageView3 = (ImageView) l3.d.a(view, R.id.iv_rating_img);
                if (imageView3 != null) {
                    i10 = R.id.tv_nickname;
                    TextView textView = (TextView) l3.d.a(view, R.id.tv_nickname);
                    if (textView != null) {
                        i10 = R.id.tv_rank;
                        GradientTextView gradientTextView = (GradientTextView) l3.d.a(view, R.id.tv_rank);
                        if (gradientTextView != null) {
                            i10 = R.id.tv_value0;
                            TextView textView2 = (TextView) l3.d.a(view, R.id.tv_value0);
                            if (textView2 != null) {
                                i10 = R.id.tv_value1;
                                TextView textView3 = (TextView) l3.d.a(view, R.id.tv_value1);
                                if (textView3 != null) {
                                    i10 = R.id.tv_value2;
                                    TextView textView4 = (TextView) l3.d.a(view, R.id.tv_value2);
                                    if (textView4 != null) {
                                        return new bt((LinearLayout) view, imageView, imageView2, imageView3, textView, gradientTextView, textView2, textView3, textView4);
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
    public static bt c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 19358, new Class[]{LayoutInflater.class}, bt.class);
        return patchProxyResultProxy.isSupported ? (bt) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static bt d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 19359, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, bt.class);
        if (patchProxyResultProxy.isSupported) {
            return (bt) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_player_leaderboards_pubg, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f109018a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 19361, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
