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

/* JADX INFO: compiled from: ItemDacFriendsPreviewBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class ih implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f111804a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final GradientTextView f111805b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f111806c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111807d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f111808e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f111809f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final mb.o f111810g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f111811h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f111812i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111813j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111814k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f111815l;

    private ih(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 GradientTextView gradientTextView, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 RelativeLayout relativeLayout2, @androidx.annotation.n0 mb.o oVar, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 ImageView imageView3, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 RelativeLayout relativeLayout3) {
        this.f111804a = relativeLayout;
        this.f111805b = gradientTextView;
        this.f111806c = imageView;
        this.f111807d = textView;
        this.f111808e = linearLayout;
        this.f111809f = relativeLayout2;
        this.f111810g = oVar;
        this.f111811h = imageView2;
        this.f111812i = imageView3;
        this.f111813j = textView2;
        this.f111814k = textView3;
        this.f111815l = relativeLayout3;
    }

    @androidx.annotation.n0
    public static ih a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 18143, new Class[]{View.class}, ih.class);
        if (patchProxyResultProxy.isSupported) {
            return (ih) patchProxyResultProxy.result;
        }
        int i10 = R.id.cell0;
        GradientTextView gradientTextView = (GradientTextView) l3.d.a(view, R.id.cell0);
        if (gradientTextView != null) {
            i10 = R.id.cell1;
            ImageView imageView = (ImageView) l3.d.a(view, R.id.cell1);
            if (imageView != null) {
                i10 = R.id.cell2;
                TextView textView = (TextView) l3.d.a(view, R.id.cell2);
                if (textView != null) {
                    i10 = R.id.cell3;
                    LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.cell3);
                    if (linearLayout != null) {
                        i10 = R.id.cell4;
                        RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, R.id.cell4);
                        if (relativeLayout != null) {
                            i10 = R.id.divider;
                            View viewA = l3.d.a(view, R.id.divider);
                            if (viewA != null) {
                                mb.o oVarA = mb.o.a(viewA);
                                i10 = R.id.iv_item_friend_ranking_x_heybox_avatar;
                                ImageView imageView2 = (ImageView) l3.d.a(view, R.id.iv_item_friend_ranking_x_heybox_avatar);
                                if (imageView2 != null) {
                                    i10 = R.id.iv_level_img;
                                    ImageView imageView3 = (ImageView) l3.d.a(view, R.id.iv_level_img);
                                    if (imageView3 != null) {
                                        i10 = R.id.tv_item_friend_ranking_x_heybox_username;
                                        TextView textView2 = (TextView) l3.d.a(view, R.id.tv_item_friend_ranking_x_heybox_username);
                                        if (textView2 != null) {
                                            i10 = R.id.tv_level_desc;
                                            TextView textView3 = (TextView) l3.d.a(view, R.id.tv_level_desc);
                                            if (textView3 != null) {
                                                i10 = R.id.vg_item_friend_invite;
                                                RelativeLayout relativeLayout2 = (RelativeLayout) l3.d.a(view, R.id.vg_item_friend_invite);
                                                if (relativeLayout2 != null) {
                                                    return new ih((RelativeLayout) view, gradientTextView, imageView, textView, linearLayout, relativeLayout, oVarA, imageView2, imageView3, textView2, textView3, relativeLayout2);
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
    public static ih c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 18141, new Class[]{LayoutInflater.class}, ih.class);
        return patchProxyResultProxy.isSupported ? (ih) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static ih d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 18142, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, ih.class);
        if (patchProxyResultProxy.isSupported) {
            return (ih) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_dac_friends_preview, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f111804a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 18144, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
