package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.flyco.tablayout.widget.MsgView;
import com.max.hbcommon.component.HeyBoxAvatarView;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.expression.widget.ExpressionTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemNotifyGroupBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class yr implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final CardView f118022a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final HeyBoxAvatarView f118023b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final MsgView f118024c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final CardView f118025d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f118026e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f118027f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f118028g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f118029h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final ExpressionTextView f118030i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f118031j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f118032k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f118033l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f118034m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f118035n;

    private yr(@androidx.annotation.n0 CardView cardView, @androidx.annotation.n0 HeyBoxAvatarView heyBoxAvatarView, @androidx.annotation.n0 MsgView msgView, @androidx.annotation.n0 CardView cardView2, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 ExpressionTextView expressionTextView, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 TextView textView5, @androidx.annotation.n0 TextView textView6, @androidx.annotation.n0 LinearLayout linearLayout) {
        this.f118022a = cardView;
        this.f118023b = heyBoxAvatarView;
        this.f118024c = msgView;
        this.f118025d = cardView2;
        this.f118026e = imageView;
        this.f118027f = imageView2;
        this.f118028g = textView;
        this.f118029h = textView2;
        this.f118030i = expressionTextView;
        this.f118031j = textView3;
        this.f118032k = textView4;
        this.f118033l = textView5;
        this.f118034m = textView6;
        this.f118035n = linearLayout;
    }

    @androidx.annotation.n0
    public static yr a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 19244, new Class[]{View.class}, yr.class);
        if (patchProxyResultProxy.isSupported) {
            return (yr) patchProxyResultProxy.result;
        }
        int i10 = R.id.avatar;
        HeyBoxAvatarView heyBoxAvatarView = (HeyBoxAvatarView) l3.d.a(view, R.id.avatar);
        if (heyBoxAvatarView != null) {
            i10 = R.id.badge;
            MsgView msgView = (MsgView) l3.d.a(view, R.id.badge);
            if (msgView != null) {
                CardView cardView = (CardView) view;
                i10 = R.id.iv_arrow_more;
                ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_arrow_more);
                if (imageView != null) {
                    i10 = R.id.iv_follow_state;
                    ImageView imageView2 = (ImageView) l3.d.a(view, R.id.iv_follow_state);
                    if (imageView2 != null) {
                        i10 = R.id.tv_action;
                        TextView textView = (TextView) l3.d.a(view, R.id.tv_action);
                        if (textView != null) {
                            i10 = R.id.tv_action_x;
                            TextView textView2 = (TextView) l3.d.a(view, R.id.tv_action_x);
                            if (textView2 != null) {
                                i10 = R.id.tv_desc;
                                ExpressionTextView expressionTextView = (ExpressionTextView) l3.d.a(view, R.id.tv_desc);
                                if (expressionTextView != null) {
                                    i10 = R.id.tv_follow_state;
                                    TextView textView3 = (TextView) l3.d.a(view, R.id.tv_follow_state);
                                    if (textView3 != null) {
                                        i10 = R.id.tv_hint;
                                        TextView textView4 = (TextView) l3.d.a(view, R.id.tv_hint);
                                        if (textView4 != null) {
                                            i10 = R.id.tv_time;
                                            TextView textView5 = (TextView) l3.d.a(view, R.id.tv_time);
                                            if (textView5 != null) {
                                                i10 = R.id.tv_title;
                                                TextView textView6 = (TextView) l3.d.a(view, R.id.tv_title);
                                                if (textView6 != null) {
                                                    i10 = R.id.vg_follow_state;
                                                    LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_follow_state);
                                                    if (linearLayout != null) {
                                                        return new yr(cardView, heyBoxAvatarView, msgView, cardView, imageView, imageView2, textView, textView2, expressionTextView, textView3, textView4, textView5, textView6, linearLayout);
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
    public static yr c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 19242, new Class[]{LayoutInflater.class}, yr.class);
        return patchProxyResultProxy.isSupported ? (yr) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static yr d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 19243, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, yr.class);
        if (patchProxyResultProxy.isSupported) {
            return (yr) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_notify_group, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public CardView b() {
        return this.f118022a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 19245, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
