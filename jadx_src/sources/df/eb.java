package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.max.hbcommon.component.bottombutton.BottomButtonLeftItemView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: FragmentReportReasonDialogBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class eb implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f110113a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final BottomButtonLeftItemView f110114b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final f20 f110115c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f110116d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f110117e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final ProgressBar f110118f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final ScrollView f110119g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f110120h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f110121i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f110122j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f110123k;

    private eb(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 BottomButtonLeftItemView bottomButtonLeftItemView, @androidx.annotation.n0 f20 f20Var, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 ProgressBar progressBar, @androidx.annotation.n0 ScrollView scrollView, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 RelativeLayout relativeLayout2, @androidx.annotation.n0 LinearLayout linearLayout2) {
        this.f110113a = relativeLayout;
        this.f110114b = bottomButtonLeftItemView;
        this.f110115c = f20Var;
        this.f110116d = imageView;
        this.f110117e = linearLayout;
        this.f110118f = progressBar;
        this.f110119g = scrollView;
        this.f110120h = textView;
        this.f110121i = textView2;
        this.f110122j = relativeLayout2;
        this.f110123k = linearLayout2;
    }

    @androidx.annotation.n0
    public static eb a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 17504, new Class[]{View.class}, eb.class);
        if (patchProxyResultProxy.isSupported) {
            return (eb) patchProxyResultProxy.result;
        }
        int i10 = R.id.bottom_button;
        BottomButtonLeftItemView bottomButtonLeftItemView = (BottomButtonLeftItemView) l3.d.a(view, R.id.bottom_button);
        if (bottomButtonLeftItemView != null) {
            i10 = R.id.divider_bottom;
            View viewA = l3.d.a(view, R.id.divider_bottom);
            if (viewA != null) {
                f20 f20VarA = f20.a(viewA);
                i10 = R.id.iv_author_avatar;
                ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_author_avatar);
                if (imageView != null) {
                    i10 = R.id.ll_container;
                    LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.ll_container);
                    if (linearLayout != null) {
                        i10 = R.id.progress;
                        ProgressBar progressBar = (ProgressBar) l3.d.a(view, R.id.progress);
                        if (progressBar != null) {
                            i10 = R.id.sv_container;
                            ScrollView scrollView = (ScrollView) l3.d.a(view, R.id.sv_container);
                            if (scrollView != null) {
                                i10 = R.id.tv_author_name;
                                TextView textView = (TextView) l3.d.a(view, R.id.tv_author_name);
                                if (textView != null) {
                                    i10 = R.id.tv_block;
                                    TextView textView2 = (TextView) l3.d.a(view, R.id.tv_block);
                                    if (textView2 != null) {
                                        i10 = R.id.vg_author;
                                        RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, R.id.vg_author);
                                        if (relativeLayout != null) {
                                            i10 = R.id.vg_block;
                                            LinearLayout linearLayout2 = (LinearLayout) l3.d.a(view, R.id.vg_block);
                                            if (linearLayout2 != null) {
                                                return new eb((RelativeLayout) view, bottomButtonLeftItemView, f20VarA, imageView, linearLayout, progressBar, scrollView, textView, textView2, relativeLayout, linearLayout2);
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
    public static eb c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 17502, new Class[]{LayoutInflater.class}, eb.class);
        return patchProxyResultProxy.isSupported ? (eb) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static eb d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 17503, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, eb.class);
        if (patchProxyResultProxy.isSupported) {
            return (eb) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.fragment_report_reason_dialog, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f110113a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 17505, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
