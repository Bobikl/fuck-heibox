package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.max.hbcustomview.GradientTextView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ViewGameFollowWithNumBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class wf0 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final View f117171a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f117172b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f117173c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final GradientTextView f117174d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117175e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117176f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final GradientTextView f117177g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f117178h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f117179i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f117180j;

    private wf0(@androidx.annotation.n0 View view, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 GradientTextView gradientTextView, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 GradientTextView gradientTextView2, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 LinearLayout linearLayout2, @androidx.annotation.n0 RelativeLayout relativeLayout) {
        this.f117171a = view;
        this.f117172b = imageView;
        this.f117173c = imageView2;
        this.f117174d = gradientTextView;
        this.f117175e = textView;
        this.f117176f = textView2;
        this.f117177g = gradientTextView2;
        this.f117178h = linearLayout;
        this.f117179i = linearLayout2;
        this.f117180j = relativeLayout;
    }

    @androidx.annotation.n0
    public static wf0 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 21709, new Class[]{View.class}, wf0.class);
        if (patchProxyResultProxy.isSupported) {
            return (wf0) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_follow_icon;
        ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_follow_icon);
        if (imageView != null) {
            i10 = R.id.iv_tritangle;
            ImageView imageView2 = (ImageView) l3.d.a(view, R.id.iv_tritangle);
            if (imageView2 != null) {
                i10 = R.id.tv_follow_desc;
                GradientTextView gradientTextView = (GradientTextView) l3.d.a(view, R.id.tv_follow_desc);
                if (gradientTextView != null) {
                    i10 = R.id.tv_follow_num;
                    TextView textView = (TextView) l3.d.a(view, R.id.tv_follow_num);
                    if (textView != null) {
                        i10 = R.id.tv_follow_num_unit;
                        TextView textView2 = (TextView) l3.d.a(view, R.id.tv_follow_num_unit);
                        if (textView2 != null) {
                            i10 = R.id.tv_rank;
                            GradientTextView gradientTextView2 = (GradientTextView) l3.d.a(view, R.id.tv_rank);
                            if (gradientTextView2 != null) {
                                i10 = R.id.vg_follow_btn;
                                LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_follow_btn);
                                if (linearLayout != null) {
                                    i10 = R.id.vg_follow_num_container;
                                    LinearLayout linearLayout2 = (LinearLayout) l3.d.a(view, R.id.vg_follow_num_container);
                                    if (linearLayout2 != null) {
                                        i10 = R.id.vg_rank;
                                        RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, R.id.vg_rank);
                                        if (relativeLayout != null) {
                                            return new wf0(view, imageView, imageView2, gradientTextView, textView, textView2, gradientTextView2, linearLayout, linearLayout2, relativeLayout);
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
    public static wf0 b(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.n0 ViewGroup viewGroup) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup}, null, changeQuickRedirect, true, 21708, new Class[]{LayoutInflater.class, ViewGroup.class}, wf0.class);
        if (patchProxyResultProxy.isSupported) {
            return (wf0) patchProxyResultProxy.result;
        }
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R.layout.view_game_follow_with_num, viewGroup);
        return a(viewGroup);
    }

    @Override // l3.c
    @androidx.annotation.n0
    public View getRoot() {
        return this.f117171a;
    }
}
