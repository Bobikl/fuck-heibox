package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: LayoutAllBottomBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class i20 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f111594a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f111595b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f111596c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111597d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f111598e;

    private i20(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 RelativeLayout relativeLayout2) {
        this.f111594a = relativeLayout;
        this.f111595b = imageView;
        this.f111596c = linearLayout;
        this.f111597d = textView;
        this.f111598e = relativeLayout2;
    }

    @androidx.annotation.n0
    public static i20 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 20314, new Class[]{View.class}, i20.class);
        if (patchProxyResultProxy.isSupported) {
            return (i20) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_layout_all_action;
        ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_layout_all_action);
        if (imageView != null) {
            i10 = R.id.ll_my_game_card_all_action;
            LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.ll_my_game_card_all_action);
            if (linearLayout != null) {
                i10 = R.id.tv_layout_all_action_text;
                TextView textView = (TextView) l3.d.a(view, R.id.tv_layout_all_action_text);
                if (textView != null) {
                    RelativeLayout relativeLayout = (RelativeLayout) view;
                    return new i20(relativeLayout, imageView, linearLayout, textView, relativeLayout);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static i20 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 20312, new Class[]{LayoutInflater.class}, i20.class);
        return patchProxyResultProxy.isSupported ? (i20) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static i20 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 20313, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, i20.class);
        if (patchProxyResultProxy.isSupported) {
            return (i20) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.layout_all_bottom, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f111594a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 20315, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
