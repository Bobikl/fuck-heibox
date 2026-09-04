package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemForbidPostContentBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class oj implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final NestedScrollView f114259a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f114260b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f114261c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f114262d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f114263e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f114264f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f114265g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f114266h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f114267i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f114268j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f114269k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f114270l;

    private oj(@androidx.annotation.n0 NestedScrollView nestedScrollView, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 TextView textView5, @androidx.annotation.n0 TextView textView6, @androidx.annotation.n0 TextView textView7, @androidx.annotation.n0 RelativeLayout relativeLayout2, @androidx.annotation.n0 LinearLayout linearLayout) {
        this.f114259a = nestedScrollView;
        this.f114260b = imageView;
        this.f114261c = relativeLayout;
        this.f114262d = textView;
        this.f114263e = textView2;
        this.f114264f = textView3;
        this.f114265g = textView4;
        this.f114266h = textView5;
        this.f114267i = textView6;
        this.f114268j = textView7;
        this.f114269k = relativeLayout2;
        this.f114270l = linearLayout;
    }

    @androidx.annotation.n0
    public static oj a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 18375, new Class[]{View.class}, oj.class);
        if (patchProxyResultProxy.isSupported) {
            return (oj) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_player_img;
        ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_player_img);
        if (imageView != null) {
            i10 = R.id.rl_medal_level;
            RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, R.id.rl_medal_level);
            if (relativeLayout != null) {
                i10 = R.id.tv_desc;
                TextView textView = (TextView) l3.d.a(view, R.id.tv_desc);
                if (textView != null) {
                    i10 = R.id.tv_feedback;
                    TextView textView2 = (TextView) l3.d.a(view, R.id.tv_feedback);
                    if (textView2 != null) {
                        i10 = R.id.tv_forbid_comment;
                        TextView textView3 = (TextView) l3.d.a(view, R.id.tv_forbid_comment);
                        if (textView3 != null) {
                            i10 = R.id.tv_forbid_reason;
                            TextView textView4 = (TextView) l3.d.a(view, R.id.tv_forbid_reason);
                            if (textView4 != null) {
                                i10 = R.id.tv_time;
                                TextView textView5 = (TextView) l3.d.a(view, R.id.tv_time);
                                if (textView5 != null) {
                                    i10 = R.id.tv_user_name;
                                    TextView textView6 = (TextView) l3.d.a(view, R.id.tv_user_name);
                                    if (textView6 != null) {
                                        i10 = R.id.tv_violated_rule;
                                        TextView textView7 = (TextView) l3.d.a(view, R.id.tv_violated_rule);
                                        if (textView7 != null) {
                                            i10 = R.id.vg_ref;
                                            RelativeLayout relativeLayout2 = (RelativeLayout) l3.d.a(view, R.id.vg_ref);
                                            if (relativeLayout2 != null) {
                                                i10 = R.id.vg_violated_rule;
                                                LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_violated_rule);
                                                if (linearLayout != null) {
                                                    return new oj((NestedScrollView) view, imageView, relativeLayout, textView, textView2, textView3, textView4, textView5, textView6, textView7, relativeLayout2, linearLayout);
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
    public static oj c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 18373, new Class[]{LayoutInflater.class}, oj.class);
        return patchProxyResultProxy.isSupported ? (oj) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static oj d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 18374, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, oj.class);
        if (patchProxyResultProxy.isSupported) {
            return (oj) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_forbid_post_content, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public NestedScrollView b() {
        return this.f114259a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 18376, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
