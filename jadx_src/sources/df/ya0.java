package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: LayoutSteamBotCountDownBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class ya0 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final ConstraintLayout f117876a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f117877b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117878c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117879d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117880e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117881f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117882g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117883h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117884i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f117885j;

    private ya0(@androidx.annotation.n0 ConstraintLayout constraintLayout, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 TextView textView5, @androidx.annotation.n0 TextView textView6, @androidx.annotation.n0 TextView textView7, @androidx.annotation.n0 LinearLayout linearLayout) {
        this.f117876a = constraintLayout;
        this.f117877b = imageView;
        this.f117878c = textView;
        this.f117879d = textView2;
        this.f117880e = textView3;
        this.f117881f = textView4;
        this.f117882g = textView5;
        this.f117883h = textView6;
        this.f117884i = textView7;
        this.f117885j = linearLayout;
    }

    @androidx.annotation.n0
    public static ya0 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 21205, new Class[]{View.class}, ya0.class);
        if (patchProxyResultProxy.isSupported) {
            return (ya0) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_faq;
        ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_faq);
        if (imageView != null) {
            i10 = R.id.tv_day;
            TextView textView = (TextView) l3.d.a(view, R.id.tv_day);
            if (textView != null) {
                i10 = R.id.tv_desc;
                TextView textView2 = (TextView) l3.d.a(view, R.id.tv_desc);
                if (textView2 != null) {
                    i10 = R.id.tv_hour_desc;
                    TextView textView3 = (TextView) l3.d.a(view, R.id.tv_hour_desc);
                    if (textView3 != null) {
                        i10 = R.id.tv_minute_desc;
                        TextView textView4 = (TextView) l3.d.a(view, R.id.tv_minute_desc);
                        if (textView4 != null) {
                            i10 = R.id.tv_second_desc;
                            TextView textView5 = (TextView) l3.d.a(view, R.id.tv_second_desc);
                            if (textView5 != null) {
                                i10 = R.id.tv_tips;
                                TextView textView6 = (TextView) l3.d.a(view, R.id.tv_tips);
                                if (textView6 != null) {
                                    i10 = R.id.tv_title;
                                    TextView textView7 = (TextView) l3.d.a(view, R.id.tv_title);
                                    if (textView7 != null) {
                                        i10 = R.id.vg_time;
                                        LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_time);
                                        if (linearLayout != null) {
                                            return new ya0((ConstraintLayout) view, imageView, textView, textView2, textView3, textView4, textView5, textView6, textView7, linearLayout);
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
    public static ya0 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 21203, new Class[]{LayoutInflater.class}, ya0.class);
        return patchProxyResultProxy.isSupported ? (ya0) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static ya0 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 21204, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, ya0.class);
        if (patchProxyResultProxy.isSupported) {
            return (ya0) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.layout_steam_bot_count_down, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public ConstraintLayout b() {
        return this.f117876a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 21206, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
