package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.max.hbcommon.component.bottombutton.BottomButtonLeftItemView;
import com.max.hbcustomview.ProgressBgView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: DialogAddFreeGamesBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class k4 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f112402a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ProgressBgView f112403b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ProgressBar f112404c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112405d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112406e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112407f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112408g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final BottomButtonLeftItemView f112409h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f112410i;

    private k4(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 ProgressBgView progressBgView, @androidx.annotation.n0 ProgressBar progressBar, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 BottomButtonLeftItemView bottomButtonLeftItemView, @androidx.annotation.n0 RelativeLayout relativeLayout2) {
        this.f112402a = relativeLayout;
        this.f112403b = progressBgView;
        this.f112404c = progressBar;
        this.f112405d = textView;
        this.f112406e = textView2;
        this.f112407f = textView3;
        this.f112408g = textView4;
        this.f112409h = bottomButtonLeftItemView;
        this.f112410i = relativeLayout2;
    }

    @androidx.annotation.n0
    public static k4 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 16800, new Class[]{View.class}, k4.class);
        if (patchProxyResultProxy.isSupported) {
            return (k4) patchProxyResultProxy.result;
        }
        int i10 = R.id.pb_0;
        ProgressBgView progressBgView = (ProgressBgView) l3.d.a(view, R.id.pb_0);
        if (progressBgView != null) {
            i10 = R.id.pb_title;
            ProgressBar progressBar = (ProgressBar) l3.d.a(view, R.id.pb_title);
            if (progressBar != null) {
                i10 = R.id.tv_progress_0;
                TextView textView = (TextView) l3.d.a(view, R.id.tv_progress_0);
                if (textView != null) {
                    i10 = R.id.tv_progress_checked_0;
                    TextView textView2 = (TextView) l3.d.a(view, R.id.tv_progress_checked_0);
                    if (textView2 != null) {
                        i10 = R.id.tv_progress_desc_0;
                        TextView textView3 = (TextView) l3.d.a(view, R.id.tv_progress_desc_0);
                        if (textView3 != null) {
                            i10 = R.id.tv_title;
                            TextView textView4 = (TextView) l3.d.a(view, R.id.tv_title);
                            if (textView4 != null) {
                                i10 = R.id.vg_button_panel;
                                BottomButtonLeftItemView bottomButtonLeftItemView = (BottomButtonLeftItemView) l3.d.a(view, R.id.vg_button_panel);
                                if (bottomButtonLeftItemView != null) {
                                    i10 = R.id.vg_progress_desc_0;
                                    RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, R.id.vg_progress_desc_0);
                                    if (relativeLayout != null) {
                                        return new k4((RelativeLayout) view, progressBgView, progressBar, textView, textView2, textView3, textView4, bottomButtonLeftItemView, relativeLayout);
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
    public static k4 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 16798, new Class[]{LayoutInflater.class}, k4.class);
        return patchProxyResultProxy.isSupported ? (k4) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static k4 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 16799, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, k4.class);
        if (patchProxyResultProxy.isSupported) {
            return (k4) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.dialog_add_free_games, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f112402a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16801, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
