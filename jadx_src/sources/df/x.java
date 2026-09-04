package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.expression.widget.ExpressionTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ActivityForwardEditBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class x implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final ConstraintLayout f117304a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final CheckBox f117305b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final CardView f117306c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final mb.o f117307d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final EditText f117308e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final FrameLayout f117309f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f117310g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f117311h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f117312i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f117313j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f117314k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f117315l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f117316m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @androidx.annotation.n0
    public final ConstraintLayout f117317n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @androidx.annotation.n0
    public final RecyclerView f117318o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @androidx.annotation.n0
    public final ScrollView f117319p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117320q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117321r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @androidx.annotation.n0
    public final ExpressionTextView f117322s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f117323t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @androidx.annotation.n0
    public final FrameLayout f117324u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f117325v;

    private x(@androidx.annotation.n0 ConstraintLayout constraintLayout, @androidx.annotation.n0 CheckBox checkBox, @androidx.annotation.n0 CardView cardView, @androidx.annotation.n0 mb.o oVar, @androidx.annotation.n0 EditText editText, @androidx.annotation.n0 FrameLayout frameLayout, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 ImageView imageView3, @androidx.annotation.n0 ImageView imageView4, @androidx.annotation.n0 ImageView imageView5, @androidx.annotation.n0 ImageView imageView6, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 ConstraintLayout constraintLayout2, @androidx.annotation.n0 RecyclerView recyclerView, @androidx.annotation.n0 ScrollView scrollView, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 ExpressionTextView expressionTextView, @androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 FrameLayout frameLayout2, @androidx.annotation.n0 LinearLayout linearLayout2) {
        this.f117304a = constraintLayout;
        this.f117305b = checkBox;
        this.f117306c = cardView;
        this.f117307d = oVar;
        this.f117308e = editText;
        this.f117309f = frameLayout;
        this.f117310g = imageView;
        this.f117311h = imageView2;
        this.f117312i = imageView3;
        this.f117313j = imageView4;
        this.f117314k = imageView5;
        this.f117315l = imageView6;
        this.f117316m = linearLayout;
        this.f117317n = constraintLayout2;
        this.f117318o = recyclerView;
        this.f117319p = scrollView;
        this.f117320q = textView;
        this.f117321r = textView2;
        this.f117322s = expressionTextView;
        this.f117323t = relativeLayout;
        this.f117324u = frameLayout2;
        this.f117325v = linearLayout2;
    }

    @androidx.annotation.n0
    public static x a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 16332, new Class[]{View.class}, x.class);
        if (patchProxyResultProxy.isSupported) {
            return (x) patchProxyResultProxy.result;
        }
        int i10 = R.id.cb_also_comment;
        CheckBox checkBox = (CheckBox) l3.d.a(view, R.id.cb_also_comment);
        if (checkBox != null) {
            i10 = R.id.cv_postcard;
            CardView cardView = (CardView) l3.d.a(view, R.id.cv_postcard);
            if (cardView != null) {
                i10 = R.id.edit_bar_divider;
                View viewA = l3.d.a(view, R.id.edit_bar_divider);
                if (viewA != null) {
                    mb.o oVarA = mb.o.a(viewA);
                    i10 = R.id.et_content;
                    EditText editText = (EditText) l3.d.a(view, R.id.et_content);
                    if (editText != null) {
                        i10 = R.id.fl_toolbar_popup_box;
                        FrameLayout frameLayout = (FrameLayout) l3.d.a(view, R.id.fl_toolbar_popup_box);
                        if (frameLayout != null) {
                            i10 = R.id.iv_add_img;
                            ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_add_img);
                            if (imageView != null) {
                                i10 = R.id.iv_at;
                                ImageView imageView2 = (ImageView) l3.d.a(view, R.id.iv_at);
                                if (imageView2 != null) {
                                    i10 = R.id.iv_btmbar_expand;
                                    ImageView imageView3 = (ImageView) l3.d.a(view, R.id.iv_btmbar_expand);
                                    if (imageView3 != null) {
                                        i10 = R.id.iv_emoji;
                                        ImageView imageView4 = (ImageView) l3.d.a(view, R.id.iv_emoji);
                                        if (imageView4 != null) {
                                            i10 = R.id.iv_hashtag;
                                            ImageView imageView5 = (ImageView) l3.d.a(view, R.id.iv_hashtag);
                                            if (imageView5 != null) {
                                                i10 = R.id.iv_img;
                                                ImageView imageView6 = (ImageView) l3.d.a(view, R.id.iv_img);
                                                if (imageView6 != null) {
                                                    i10 = R.id.ll_button_container;
                                                    LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.ll_button_container);
                                                    if (linearLayout != null) {
                                                        ConstraintLayout constraintLayout = (ConstraintLayout) view;
                                                        i10 = R.id.rv_img_preview;
                                                        RecyclerView recyclerView = (RecyclerView) l3.d.a(view, R.id.rv_img_preview);
                                                        if (recyclerView != null) {
                                                            i10 = R.id.sv_container;
                                                            ScrollView scrollView = (ScrollView) l3.d.a(view, R.id.sv_container);
                                                            if (scrollView != null) {
                                                                i10 = R.id.tv_author;
                                                                TextView textView = (TextView) l3.d.a(view, R.id.tv_author);
                                                                if (textView != null) {
                                                                    i10 = R.id.tv_count;
                                                                    TextView textView2 = (TextView) l3.d.a(view, R.id.tv_count);
                                                                    if (textView2 != null) {
                                                                        i10 = R.id.tv_desc;
                                                                        ExpressionTextView expressionTextView = (ExpressionTextView) l3.d.a(view, R.id.tv_desc);
                                                                        if (expressionTextView != null) {
                                                                            i10 = R.id.vg_alert;
                                                                            RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, R.id.vg_alert);
                                                                            if (relativeLayout != null) {
                                                                                i10 = R.id.vg_edit_bar;
                                                                                FrameLayout frameLayout2 = (FrameLayout) l3.d.a(view, R.id.vg_edit_bar);
                                                                                if (frameLayout2 != null) {
                                                                                    i10 = R.id.vg_img_preview;
                                                                                    LinearLayout linearLayout2 = (LinearLayout) l3.d.a(view, R.id.vg_img_preview);
                                                                                    if (linearLayout2 != null) {
                                                                                        return new x(constraintLayout, checkBox, cardView, oVarA, editText, frameLayout, imageView, imageView2, imageView3, imageView4, imageView5, imageView6, linearLayout, constraintLayout, recyclerView, scrollView, textView, textView2, expressionTextView, relativeLayout, frameLayout2, linearLayout2);
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
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static x c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 16330, new Class[]{LayoutInflater.class}, x.class);
        return patchProxyResultProxy.isSupported ? (x) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static x d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 16331, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, x.class);
        if (patchProxyResultProxy.isSupported) {
            return (x) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.activity_forward_edit, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public ConstraintLayout b() {
        return this.f117304a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16333, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
