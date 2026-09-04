package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.max.hbcommon.component.HeyBoxAvatarView;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.expression.widget.ExpressionTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: TableRowFeedbackSupporterBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class md0 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f113413a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final HeyBoxAvatarView f113414b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f113415c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f113416d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f113417e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final ExpressionTextView f113418f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f113419g;

    private md0(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 HeyBoxAvatarView heyBoxAvatarView, @androidx.annotation.n0 LinearLayout linearLayout2, @androidx.annotation.n0 LinearLayout linearLayout3, @androidx.annotation.n0 LinearLayout linearLayout4, @androidx.annotation.n0 ExpressionTextView expressionTextView, @androidx.annotation.n0 TextView textView) {
        this.f113413a = linearLayout;
        this.f113414b = heyBoxAvatarView;
        this.f113415c = linearLayout2;
        this.f113416d = linearLayout3;
        this.f113417e = linearLayout4;
        this.f113418f = expressionTextView;
        this.f113419g = textView;
    }

    @androidx.annotation.n0
    public static md0 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 21464, new Class[]{View.class}, md0.class);
        if (patchProxyResultProxy.isSupported) {
            return (md0) patchProxyResultProxy.result;
        }
        int i10 = R.id.avatar;
        HeyBoxAvatarView heyBoxAvatarView = (HeyBoxAvatarView) l3.d.a(view, R.id.avatar);
        if (heyBoxAvatarView != null) {
            i10 = R.id.ll_pic;
            LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.ll_pic);
            if (linearLayout != null) {
                LinearLayout linearLayout2 = (LinearLayout) view;
                i10 = R.id.rl_comment;
                LinearLayout linearLayout3 = (LinearLayout) l3.d.a(view, R.id.rl_comment);
                if (linearLayout3 != null) {
                    i10 = R.id.tv_comment;
                    ExpressionTextView expressionTextView = (ExpressionTextView) l3.d.a(view, R.id.tv_comment);
                    if (expressionTextView != null) {
                        i10 = R.id.tv_time;
                        TextView textView = (TextView) l3.d.a(view, R.id.tv_time);
                        if (textView != null) {
                            return new md0(linearLayout2, heyBoxAvatarView, linearLayout, linearLayout2, linearLayout3, expressionTextView, textView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static md0 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 21462, new Class[]{LayoutInflater.class}, md0.class);
        return patchProxyResultProxy.isSupported ? (md0) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static md0 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 21463, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, md0.class);
        if (patchProxyResultProxy.isSupported) {
            return (md0) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.table_row_feedback_supporter, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f113413a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 21465, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
