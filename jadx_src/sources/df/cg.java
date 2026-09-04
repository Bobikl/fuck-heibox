package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.max.hbcustomview.shinebuttonlib.ShineButton;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.expression.widget.ExpressionTextView;
import com.max.xiaoheihe.view.richtext.RichStackModelView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemConceptLinkBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class cg implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final CardView f109380a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final CheckBox f109381b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f109382c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f109383d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final RichStackModelView f109384e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final RichStackModelView f109385f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final ShineButton f109386g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final ExpressionTextView f109387h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f109388i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f109389j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final ExpressionTextView f109390k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f109391l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @androidx.annotation.n0
    public final FrameLayout f109392m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f109393n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @androidx.annotation.n0
    public final FrameLayout f109394o;

    private cg(@androidx.annotation.n0 CardView cardView, @androidx.annotation.n0 CheckBox checkBox, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 RichStackModelView richStackModelView, @androidx.annotation.n0 RichStackModelView richStackModelView2, @androidx.annotation.n0 ShineButton shineButton, @androidx.annotation.n0 ExpressionTextView expressionTextView, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 ExpressionTextView expressionTextView2, @androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 FrameLayout frameLayout, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 FrameLayout frameLayout2) {
        this.f109380a = cardView;
        this.f109381b = checkBox;
        this.f109382c = imageView;
        this.f109383d = imageView2;
        this.f109384e = richStackModelView;
        this.f109385f = richStackModelView2;
        this.f109386g = shineButton;
        this.f109387h = expressionTextView;
        this.f109388i = textView;
        this.f109389j = textView2;
        this.f109390k = expressionTextView2;
        this.f109391l = relativeLayout;
        this.f109392m = frameLayout;
        this.f109393n = linearLayout;
        this.f109394o = frameLayout2;
    }

    @androidx.annotation.n0
    public static cg a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 18015, new Class[]{View.class}, cg.class);
        if (patchProxyResultProxy.isSupported) {
            return (cg) patchProxyResultProxy.result;
        }
        int i10 = R.id.f76243cb;
        CheckBox checkBox = (CheckBox) l3.d.a(view, R.id.f76243cb);
        if (checkBox != null) {
            i10 = R.id.iv_avatar;
            ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_avatar);
            if (imageView != null) {
                i10 = R.id.iv_img;
                ImageView imageView2 = (ImageView) l3.d.a(view, R.id.iv_img);
                if (imageView2 != null) {
                    i10 = R.id.rich_text_image;
                    RichStackModelView richStackModelView = (RichStackModelView) l3.d.a(view, R.id.rich_text_image);
                    if (richStackModelView != null) {
                        i10 = R.id.rich_text_model;
                        RichStackModelView richStackModelView2 = (RichStackModelView) l3.d.a(view, R.id.rich_text_model);
                        if (richStackModelView2 != null) {
                            i10 = R.id.sb_interactive_like;
                            ShineButton shineButton = (ShineButton) l3.d.a(view, R.id.sb_interactive_like);
                            if (shineButton != null) {
                                i10 = R.id.tv_desc;
                                ExpressionTextView expressionTextView = (ExpressionTextView) l3.d.a(view, R.id.tv_desc);
                                if (expressionTextView != null) {
                                    i10 = R.id.tv_like;
                                    TextView textView = (TextView) l3.d.a(view, R.id.tv_like);
                                    if (textView != null) {
                                        i10 = R.id.tv_name;
                                        TextView textView2 = (TextView) l3.d.a(view, R.id.tv_name);
                                        if (textView2 != null) {
                                            i10 = R.id.tv_title;
                                            ExpressionTextView expressionTextView2 = (ExpressionTextView) l3.d.a(view, R.id.tv_title);
                                            if (expressionTextView2 != null) {
                                                i10 = R.id.vg_checkbox;
                                                RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, R.id.vg_checkbox);
                                                if (relativeLayout != null) {
                                                    i10 = R.id.vg_img;
                                                    FrameLayout frameLayout = (FrameLayout) l3.d.a(view, R.id.vg_img);
                                                    if (frameLayout != null) {
                                                        i10 = R.id.vg_like;
                                                        LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_like);
                                                        if (linearLayout != null) {
                                                            i10 = R.id.vg_video_play;
                                                            FrameLayout frameLayout2 = (FrameLayout) l3.d.a(view, R.id.vg_video_play);
                                                            if (frameLayout2 != null) {
                                                                return new cg((CardView) view, checkBox, imageView, imageView2, richStackModelView, richStackModelView2, shineButton, expressionTextView, textView, textView2, expressionTextView2, relativeLayout, frameLayout, linearLayout, frameLayout2);
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

    @androidx.annotation.n0
    public static cg c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 18013, new Class[]{LayoutInflater.class}, cg.class);
        return patchProxyResultProxy.isSupported ? (cg) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static cg d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 18014, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, cg.class);
        if (patchProxyResultProxy.isSupported) {
            return (cg) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_concept_link, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public CardView b() {
        return this.f109380a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 18016, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
