package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemUserAchievementProgressBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class m00 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f113199a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f113200b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ProgressBar f113201c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f113202d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f113203e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f113204f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f113205g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f113206h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f113207i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f113208j;

    private m00(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ProgressBar progressBar, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 TextView textView5, @androidx.annotation.n0 LinearLayout linearLayout2, @androidx.annotation.n0 RelativeLayout relativeLayout) {
        this.f113199a = linearLayout;
        this.f113200b = imageView;
        this.f113201c = progressBar;
        this.f113202d = textView;
        this.f113203e = textView2;
        this.f113204f = textView3;
        this.f113205g = textView4;
        this.f113206h = textView5;
        this.f113207i = linearLayout2;
        this.f113208j = relativeLayout;
    }

    @androidx.annotation.n0
    public static m00 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 20124, new Class[]{View.class}, m00.class);
        if (patchProxyResultProxy.isSupported) {
            return (m00) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_img;
        ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_img);
        if (imageView != null) {
            i10 = R.id.pb_progress;
            ProgressBar progressBar = (ProgressBar) l3.d.a(view, R.id.pb_progress);
            if (progressBar != null) {
                i10 = R.id.tv_award_desc;
                TextView textView = (TextView) l3.d.a(view, R.id.tv_award_desc);
                if (textView != null) {
                    i10 = R.id.tv_desc;
                    TextView textView2 = (TextView) l3.d.a(view, R.id.tv_desc);
                    if (textView2 != null) {
                        i10 = R.id.tv_limit_note;
                        TextView textView3 = (TextView) l3.d.a(view, R.id.tv_limit_note);
                        if (textView3 != null) {
                            i10 = R.id.tv_name;
                            TextView textView4 = (TextView) l3.d.a(view, R.id.tv_name);
                            if (textView4 != null) {
                                i10 = R.id.tv_progress_desc;
                                TextView textView5 = (TextView) l3.d.a(view, R.id.tv_progress_desc);
                                if (textView5 != null) {
                                    i10 = R.id.vg_current_badge;
                                    LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_current_badge);
                                    if (linearLayout != null) {
                                        i10 = R.id.vg_preview;
                                        RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, R.id.vg_preview);
                                        if (relativeLayout != null) {
                                            return new m00((LinearLayout) view, imageView, progressBar, textView, textView2, textView3, textView4, textView5, linearLayout, relativeLayout);
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
    public static m00 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 20122, new Class[]{LayoutInflater.class}, m00.class);
        return patchProxyResultProxy.isSupported ? (m00) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static m00 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 20123, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, m00.class);
        if (patchProxyResultProxy.isSupported) {
            return (m00) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_user_achievement_progress, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f113199a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 20125, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
