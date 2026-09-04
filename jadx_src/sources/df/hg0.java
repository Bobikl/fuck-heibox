package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.view.uikit.HBUiKitView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ViewLinkToolCardBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class hg0 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final View f111431a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f111432b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f111433c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111434d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111435e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111436f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111437g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final HBUiKitView f111438h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final FrameLayout f111439i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f111440j;

    private hg0(@androidx.annotation.n0 View view, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 HBUiKitView hBUiKitView, @androidx.annotation.n0 FrameLayout frameLayout, @androidx.annotation.n0 RelativeLayout relativeLayout) {
        this.f111431a = view;
        this.f111432b = imageView;
        this.f111433c = imageView2;
        this.f111434d = textView;
        this.f111435e = textView2;
        this.f111436f = textView3;
        this.f111437g = textView4;
        this.f111438h = hBUiKitView;
        this.f111439i = frameLayout;
        this.f111440j = relativeLayout;
    }

    @androidx.annotation.n0
    public static hg0 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 21751, new Class[]{View.class}, hg0.class);
        if (patchProxyResultProxy.isSupported) {
            return (hg0) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_icon;
        ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_icon);
        if (imageView != null) {
            i10 = R.id.iv_image;
            ImageView imageView2 = (ImageView) l3.d.a(view, R.id.iv_image);
            if (imageView2 != null) {
                i10 = R.id.tv_action;
                TextView textView = (TextView) l3.d.a(view, R.id.tv_action);
                if (textView != null) {
                    i10 = R.id.tv_content;
                    TextView textView2 = (TextView) l3.d.a(view, R.id.tv_content);
                    if (textView2 != null) {
                        i10 = R.id.tv_sub_Title;
                        TextView textView3 = (TextView) l3.d.a(view, R.id.tv_sub_Title);
                        if (textView3 != null) {
                            i10 = R.id.tv_title;
                            TextView textView4 = (TextView) l3.d.a(view, R.id.tv_title);
                            if (textView4 != null) {
                                i10 = R.id.v_uikit_content;
                                HBUiKitView hBUiKitView = (HBUiKitView) l3.d.a(view, R.id.v_uikit_content);
                                if (hBUiKitView != null) {
                                    i10 = R.id.vg_content;
                                    FrameLayout frameLayout = (FrameLayout) l3.d.a(view, R.id.vg_content);
                                    if (frameLayout != null) {
                                        i10 = R.id.vg_normal_content;
                                        RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, R.id.vg_normal_content);
                                        if (relativeLayout != null) {
                                            return new hg0(view, imageView, imageView2, textView, textView2, textView3, textView4, hBUiKitView, frameLayout, relativeLayout);
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
    public static hg0 b(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.n0 ViewGroup viewGroup) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup}, null, changeQuickRedirect, true, 21750, new Class[]{LayoutInflater.class, ViewGroup.class}, hg0.class);
        if (patchProxyResultProxy.isSupported) {
            return (hg0) patchProxyResultProxy.result;
        }
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R.layout.view_link_tool_card, viewGroup);
        return a(viewGroup);
    }

    @Override // l3.c
    @androidx.annotation.n0
    public View getRoot() {
        return this.f111431a;
    }
}
