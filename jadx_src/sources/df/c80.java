package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.max.hbcommon.component.bottombutton.BottomButtonLeftItemView;
import com.max.hbcustomview.HBLineHeightTextView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: LayoutMemberCardBulletinDialogBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class c80 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f109219a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final BottomButtonLeftItemView f109220b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final b80 f109221c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final HBLineHeightTextView f109222d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final HBLineHeightTextView f109223e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f109224f;

    private c80(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 BottomButtonLeftItemView bottomButtonLeftItemView, @androidx.annotation.n0 b80 b80Var, @androidx.annotation.n0 HBLineHeightTextView hBLineHeightTextView, @androidx.annotation.n0 HBLineHeightTextView hBLineHeightTextView2, @androidx.annotation.n0 TextView textView) {
        this.f109219a = linearLayout;
        this.f109220b = bottomButtonLeftItemView;
        this.f109221c = b80Var;
        this.f109222d = hBLineHeightTextView;
        this.f109223e = hBLineHeightTextView2;
        this.f109224f = textView;
    }

    @androidx.annotation.n0
    public static c80 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 20910, new Class[]{View.class}, c80.class);
        if (patchProxyResultProxy.isSupported) {
            return (c80) patchProxyResultProxy.result;
        }
        int i10 = R.id.btn_action;
        BottomButtonLeftItemView bottomButtonLeftItemView = (BottomButtonLeftItemView) l3.d.a(view, R.id.btn_action);
        if (bottomButtonLeftItemView != null) {
            i10 = R.id.cv_card;
            View viewA = l3.d.a(view, R.id.cv_card);
            if (viewA != null) {
                b80 b80VarA = b80.a(viewA);
                i10 = R.id.tv_card_desc;
                HBLineHeightTextView hBLineHeightTextView = (HBLineHeightTextView) l3.d.a(view, R.id.tv_card_desc);
                if (hBLineHeightTextView != null) {
                    i10 = R.id.tv_card_tips;
                    HBLineHeightTextView hBLineHeightTextView2 = (HBLineHeightTextView) l3.d.a(view, R.id.tv_card_tips);
                    if (hBLineHeightTextView2 != null) {
                        i10 = R.id.tv_title;
                        TextView textView = (TextView) l3.d.a(view, R.id.tv_title);
                        if (textView != null) {
                            return new c80((LinearLayout) view, bottomButtonLeftItemView, b80VarA, hBLineHeightTextView, hBLineHeightTextView2, textView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static c80 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 20908, new Class[]{LayoutInflater.class}, c80.class);
        return patchProxyResultProxy.isSupported ? (c80) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static c80 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 20909, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, c80.class);
        if (patchProxyResultProxy.isSupported) {
            return (c80) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.layout_member_card_bulletin_dialog, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f109219a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 20911, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
