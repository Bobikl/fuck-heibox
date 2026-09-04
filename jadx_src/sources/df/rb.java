package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: FragmentTeamDialogBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class rb implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f115159a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ConstraintLayout f115160b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f115161c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f115162d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f115163e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f115164f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f115165g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f115166h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f115167i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final FrameLayout f115168j;

    private rb(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 ConstraintLayout constraintLayout, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 View view, @androidx.annotation.n0 RelativeLayout relativeLayout2, @androidx.annotation.n0 FrameLayout frameLayout) {
        this.f115159a = relativeLayout;
        this.f115160b = constraintLayout;
        this.f115161c = imageView;
        this.f115162d = imageView2;
        this.f115163e = textView;
        this.f115164f = textView2;
        this.f115165g = textView3;
        this.f115166h = view;
        this.f115167i = relativeLayout2;
        this.f115168j = frameLayout;
    }

    @androidx.annotation.n0
    public static rb a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 17556, new Class[]{View.class}, rb.class);
        if (patchProxyResultProxy.isSupported) {
            return (rb) patchProxyResultProxy.result;
        }
        int i10 = R.id.cl_content;
        ConstraintLayout constraintLayout = (ConstraintLayout) l3.d.a(view, R.id.cl_content);
        if (constraintLayout != null) {
            i10 = R.id.iv_close;
            ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_close);
            if (imageView != null) {
                i10 = R.id.iv_icon;
                ImageView imageView2 = (ImageView) l3.d.a(view, R.id.iv_icon);
                if (imageView2 != null) {
                    i10 = R.id.tv_desc;
                    TextView textView = (TextView) l3.d.a(view, R.id.tv_desc);
                    if (textView != null) {
                        i10 = R.id.tv_tips;
                        TextView textView2 = (TextView) l3.d.a(view, R.id.tv_tips);
                        if (textView2 != null) {
                            i10 = R.id.tv_title;
                            TextView textView3 = (TextView) l3.d.a(view, R.id.tv_title);
                            if (textView3 != null) {
                                i10 = R.id.vg_btn;
                                View viewA = l3.d.a(view, R.id.vg_btn);
                                if (viewA != null) {
                                    i10 = R.id.vg_icon;
                                    RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, R.id.vg_icon);
                                    if (relativeLayout != null) {
                                        i10 = R.id.vg_user;
                                        FrameLayout frameLayout = (FrameLayout) l3.d.a(view, R.id.vg_user);
                                        if (frameLayout != null) {
                                            return new rb((RelativeLayout) view, constraintLayout, imageView, imageView2, textView, textView2, textView3, viewA, relativeLayout, frameLayout);
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
    public static rb c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 17554, new Class[]{LayoutInflater.class}, rb.class);
        return patchProxyResultProxy.isSupported ? (rb) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static rb d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 17555, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, rb.class);
        if (patchProxyResultProxy.isSupported) {
            return (rb) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.fragment_team_dialog, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f115159a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 17557, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
