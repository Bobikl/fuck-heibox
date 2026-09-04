package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: FragmentUserBbsInfoBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class wb implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f117109a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final CardView f117110b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f117111c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final ProgressBar f117112d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final mb.q f117113e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final mb.b1 f117114f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f117115g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117116h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117117i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final z80 f117118j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final a90 f117119k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f117120l;

    private wb(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 CardView cardView, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ProgressBar progressBar, @androidx.annotation.n0 mb.q qVar, @androidx.annotation.n0 mb.b1 b1Var, @androidx.annotation.n0 RelativeLayout relativeLayout2, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 z80 z80Var, @androidx.annotation.n0 a90 a90Var, @androidx.annotation.n0 RelativeLayout relativeLayout3) {
        this.f117109a = relativeLayout;
        this.f117110b = cardView;
        this.f117111c = imageView;
        this.f117112d = progressBar;
        this.f117113e = qVar;
        this.f117114f = b1Var;
        this.f117115g = relativeLayout2;
        this.f117116h = textView;
        this.f117117i = textView2;
        this.f117118j = z80Var;
        this.f117119k = a90Var;
        this.f117120l = relativeLayout3;
    }

    @androidx.annotation.n0
    public static wb a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 17576, new Class[]{View.class}, wb.class);
        if (patchProxyResultProxy.isSupported) {
            return (wb) patchProxyResultProxy.result;
        }
        int i10 = R.id.card_video;
        CardView cardView = (CardView) l3.d.a(view, R.id.card_video);
        if (cardView != null) {
            i10 = R.id.iv_video_thumb;
            ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_video_thumb);
            if (imageView != null) {
                i10 = R.id.pb_upload;
                ProgressBar progressBar = (ProgressBar) l3.d.a(view, R.id.pb_upload);
                if (progressBar != null) {
                    i10 = R.id.rv_empty_view;
                    View viewA = l3.d.a(view, R.id.rv_empty_view);
                    if (viewA != null) {
                        mb.q qVarA = mb.q.a(viewA);
                        i10 = R.id.srl;
                        View viewA2 = l3.d.a(view, R.id.srl);
                        if (viewA2 != null) {
                            mb.b1 b1VarA = mb.b1.a(viewA2);
                            i10 = R.id.sticky_layout_header;
                            RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, R.id.sticky_layout_header);
                            if (relativeLayout != null) {
                                i10 = R.id.tv_upload_all_progress;
                                TextView textView = (TextView) l3.d.a(view, R.id.tv_upload_all_progress);
                                if (textView != null) {
                                    i10 = R.id.tv_upload_progress;
                                    TextView textView2 = (TextView) l3.d.a(view, R.id.tv_upload_progress);
                                    if (textView2 != null) {
                                        i10 = R.id.vg_recommend_post;
                                        View viewA3 = l3.d.a(view, R.id.vg_recommend_post);
                                        if (viewA3 != null) {
                                            z80 z80VarA = z80.a(viewA3);
                                            i10 = R.id.vg_recommend_post_v2;
                                            View viewA4 = l3.d.a(view, R.id.vg_recommend_post_v2);
                                            if (viewA4 != null) {
                                                a90 a90VarA = a90.a(viewA4);
                                                i10 = R.id.vg_video_upload;
                                                RelativeLayout relativeLayout2 = (RelativeLayout) l3.d.a(view, R.id.vg_video_upload);
                                                if (relativeLayout2 != null) {
                                                    return new wb((RelativeLayout) view, cardView, imageView, progressBar, qVarA, b1VarA, relativeLayout, textView, textView2, z80VarA, a90VarA, relativeLayout2);
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
    public static wb c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 17574, new Class[]{LayoutInflater.class}, wb.class);
        return patchProxyResultProxy.isSupported ? (wb) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static wb d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 17575, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, wb.class);
        if (patchProxyResultProxy.isSupported) {
            return (wb) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.fragment_user_bbs_info, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f117109a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 17577, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
