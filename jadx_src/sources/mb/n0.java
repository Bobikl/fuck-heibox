package mb;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.max.commentimagepainter.sharecard.CardRecyclerView;
import com.max.hbcommon.R;
import com.max.hbcustomview.Shimmer.ShimmerLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: LayoutBottomSheetsCardShareBinding.java */
/* JADX INFO: loaded from: classes9.dex */
public final class n0 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final ConstraintLayout f131661a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ConstraintLayout f131662b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f131663c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f131664d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f131665e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f131666f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final CardRecyclerView f131667g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final CardRecyclerView f131668h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f131669i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f131670j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f131671k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.n0
    public final ShimmerLayout f131672l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f131673m;

    private n0(@androidx.annotation.n0 ConstraintLayout constraintLayout, @androidx.annotation.n0 ConstraintLayout constraintLayout2, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 ImageView imageView3, @androidx.annotation.n0 ImageView imageView4, @androidx.annotation.n0 CardRecyclerView cardRecyclerView, @androidx.annotation.n0 CardRecyclerView cardRecyclerView2, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 ShimmerLayout shimmerLayout, @androidx.annotation.n0 LinearLayout linearLayout) {
        this.f131661a = constraintLayout;
        this.f131662b = constraintLayout2;
        this.f131663c = imageView;
        this.f131664d = imageView2;
        this.f131665e = imageView3;
        this.f131666f = imageView4;
        this.f131667g = cardRecyclerView;
        this.f131668h = cardRecyclerView2;
        this.f131669i = textView;
        this.f131670j = textView2;
        this.f131671k = relativeLayout;
        this.f131672l = shimmerLayout;
        this.f131673m = linearLayout;
    }

    @androidx.annotation.n0
    public static n0 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, bb.c.e.f32057v8, new Class[]{View.class}, n0.class);
        if (patchProxyResultProxy.isSupported) {
            return (n0) patchProxyResultProxy.result;
        }
        int i10 = R.id.cl_content;
        ConstraintLayout constraintLayout = (ConstraintLayout) l3.d.a(view, i10);
        if (constraintLayout != null) {
            i10 = R.id.iv_close;
            ImageView imageView = (ImageView) l3.d.a(view, i10);
            if (imageView != null) {
                i10 = R.id.iv_icon;
                ImageView imageView2 = (ImageView) l3.d.a(view, i10);
                if (imageView2 != null) {
                    i10 = R.id.iv_share_picture;
                    ImageView imageView3 = (ImageView) l3.d.a(view, i10);
                    if (imageView3 != null) {
                        i10 = R.id.iv_small_icon;
                        ImageView imageView4 = (ImageView) l3.d.a(view, i10);
                        if (imageView4 != null) {
                            i10 = R.id.rv_card_recycler;
                            CardRecyclerView cardRecyclerView = (CardRecyclerView) l3.d.a(view, i10);
                            if (cardRecyclerView != null) {
                                i10 = R.id.rv_card_v2_recycler;
                                CardRecyclerView cardRecyclerView2 = (CardRecyclerView) l3.d.a(view, i10);
                                if (cardRecyclerView2 != null) {
                                    i10 = R.id.tv_desc;
                                    TextView textView = (TextView) l3.d.a(view, i10);
                                    if (textView != null) {
                                        i10 = R.id.tv_title;
                                        TextView textView2 = (TextView) l3.d.a(view, i10);
                                        if (textView2 != null) {
                                            i10 = R.id.vg_bottom_view;
                                            RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, i10);
                                            if (relativeLayout != null) {
                                                i10 = R.id.vg_icon;
                                                ShimmerLayout shimmerLayout = (ShimmerLayout) l3.d.a(view, i10);
                                                if (shimmerLayout != null) {
                                                    i10 = R.id.vg_title;
                                                    LinearLayout linearLayout = (LinearLayout) l3.d.a(view, i10);
                                                    if (linearLayout != null) {
                                                        return new n0((ConstraintLayout) view, constraintLayout, imageView, imageView2, imageView3, imageView4, cardRecyclerView, cardRecyclerView2, textView, textView2, relativeLayout, shimmerLayout, linearLayout);
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
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static n0 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, bb.c.e.f32023t8, new Class[]{LayoutInflater.class}, n0.class);
        return patchProxyResultProxy.isSupported ? (n0) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static n0 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, bb.c.e.f32040u8, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, n0.class);
        if (patchProxyResultProxy.isSupported) {
            return (n0) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.layout_bottom_sheets_card_share, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public ConstraintLayout b() {
        return this.f131661a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.e.f32074w8, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
