package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemVoteOptionViewBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class n10 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f113590a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final EditText f113591b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f113592c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f113593d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f113594e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f113595f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f113596g;

    private n10(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 EditText editText, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 View view, @androidx.annotation.n0 RelativeLayout relativeLayout2) {
        this.f113590a = relativeLayout;
        this.f113591b = editText;
        this.f113592c = imageView;
        this.f113593d = imageView2;
        this.f113594e = textView;
        this.f113595f = view;
        this.f113596g = relativeLayout2;
    }

    @androidx.annotation.n0
    public static n10 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 20232, new Class[]{View.class}, n10.class);
        if (patchProxyResultProxy.isSupported) {
            return (n10) patchProxyResultProxy.result;
        }
        int i10 = R.id.et_option;
        EditText editText = (EditText) l3.d.a(view, R.id.et_option);
        if (editText != null) {
            i10 = R.id.iv_del;
            ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_del);
            if (imageView != null) {
                i10 = R.id.iv_option_icon;
                ImageView imageView2 = (ImageView) l3.d.a(view, R.id.iv_option_icon);
                if (imageView2 != null) {
                    i10 = R.id.tv_option_num;
                    TextView textView = (TextView) l3.d.a(view, R.id.tv_option_num);
                    if (textView != null) {
                        i10 = R.id.v_divider;
                        View viewA = l3.d.a(view, R.id.v_divider);
                        if (viewA != null) {
                            RelativeLayout relativeLayout = (RelativeLayout) view;
                            return new n10(relativeLayout, editText, imageView, imageView2, textView, viewA, relativeLayout);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static n10 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 20230, new Class[]{LayoutInflater.class}, n10.class);
        return patchProxyResultProxy.isSupported ? (n10) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static n10 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 20231, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, n10.class);
        if (patchProxyResultProxy.isSupported) {
            return (n10) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_vote_option_view, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f113590a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 20233, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
