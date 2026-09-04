package pa;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.legacy.widget.Space;
import com.max.commentimagepainter.R;
import com.max.commentimagepainter.sharecard.CardImageView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import l3.c;
import l3.d;

/* JADX INFO: compiled from: CardItemLayoutBinding.java */
/* JADX INFO: loaded from: classes8.dex */
public final class a implements c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @n0
    private final ConstraintLayout f138204a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @n0
    public final ImageView f138205b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @n0
    public final ImageView f138206c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @n0
    public final CardImageView f138207d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @n0
    public final ImageView f138208e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @n0
    public final ImageView f138209f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @n0
    public final ImageView f138210g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @n0
    public final ImageView f138211h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @n0
    public final Space f138212i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @n0
    public final TextView f138213j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @n0
    public final TextView f138214k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @n0
    public final TextView f138215l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @n0
    public final TextView f138216m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @n0
    public final TextView f138217n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @n0
    public final TextView f138218o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @n0
    public final TextView f138219p;

    private a(@n0 ConstraintLayout constraintLayout, @n0 ImageView imageView, @n0 ImageView imageView2, @n0 CardImageView cardImageView, @n0 ImageView imageView3, @n0 ImageView imageView4, @n0 ImageView imageView5, @n0 ImageView imageView6, @n0 Space space, @n0 TextView textView, @n0 TextView textView2, @n0 TextView textView3, @n0 TextView textView4, @n0 TextView textView5, @n0 TextView textView6, @n0 TextView textView7) {
        this.f138204a = constraintLayout;
        this.f138205b = imageView;
        this.f138206c = imageView2;
        this.f138207d = cardImageView;
        this.f138208e = imageView3;
        this.f138209f = imageView4;
        this.f138210g = imageView5;
        this.f138211h = imageView6;
        this.f138212i = space;
        this.f138213j = textView;
        this.f138214k = textView2;
        this.f138215l = textView3;
        this.f138216m = textView4;
        this.f138217n = textView5;
        this.f138218o = textView6;
        this.f138219p = textView7;
    }

    @n0
    public static a a(@n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 1034, new Class[]{View.class}, a.class);
        if (patchProxyResultProxy.isSupported) {
            return (a) patchProxyResultProxy.result;
        }
        int i10 = R.id.base_card_view;
        ImageView imageView = (ImageView) d.a(view, i10);
        if (imageView != null) {
            i10 = R.id.card_gif_view;
            ImageView imageView2 = (ImageView) d.a(view, i10);
            if (imageView2 != null) {
                i10 = R.id.card_view;
                CardImageView cardImageView = (CardImageView) d.a(view, i10);
                if (cardImageView != null) {
                    i10 = R.id.cover_card_view;
                    ImageView imageView3 = (ImageView) d.a(view, i10);
                    if (imageView3 != null) {
                        i10 = R.id.iv_background;
                        ImageView imageView4 = (ImageView) d.a(view, i10);
                        if (imageView4 != null) {
                            i10 = R.id.iv_game_name_background;
                            ImageView imageView5 = (ImageView) d.a(view, i10);
                            if (imageView5 != null) {
                                i10 = R.id.iv_user_avatar;
                                ImageView imageView6 = (ImageView) d.a(view, i10);
                                if (imageView6 != null) {
                                    i10 = R.id.space;
                                    Space space = (Space) d.a(view, i10);
                                    if (space != null) {
                                        i10 = R.id.tv_card_id;
                                        TextView textView = (TextView) d.a(view, i10);
                                        if (textView != null) {
                                            i10 = R.id.tv_desc_0;
                                            TextView textView2 = (TextView) d.a(view, i10);
                                            if (textView2 != null) {
                                                i10 = R.id.tv_desc_1;
                                                TextView textView3 = (TextView) d.a(view, i10);
                                                if (textView3 != null) {
                                                    i10 = R.id.tv_game_name;
                                                    TextView textView4 = (TextView) d.a(view, i10);
                                                    if (textView4 != null) {
                                                        i10 = R.id.tv_user_name;
                                                        TextView textView5 = (TextView) d.a(view, i10);
                                                        if (textView5 != null) {
                                                            i10 = R.id.tv_value_0;
                                                            TextView textView6 = (TextView) d.a(view, i10);
                                                            if (textView6 != null) {
                                                                i10 = R.id.tv_value_1;
                                                                TextView textView7 = (TextView) d.a(view, i10);
                                                                if (textView7 != null) {
                                                                    return new a((ConstraintLayout) view, imageView, imageView2, cardImageView, imageView3, imageView4, imageView5, imageView6, space, textView, textView2, textView3, textView4, textView5, textView6, textView7);
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
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @n0
    public static a c(@n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 1032, new Class[]{LayoutInflater.class}, a.class);
        return patchProxyResultProxy.isSupported ? (a) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @n0
    public static a d(@n0 LayoutInflater layoutInflater, @p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 1033, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, a.class);
        if (patchProxyResultProxy.isSupported) {
            return (a) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.card_item_layout, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @n0
    public ConstraintLayout b() {
        return this.f138204a;
    }

    @Override // l3.c
    @n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1035, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
