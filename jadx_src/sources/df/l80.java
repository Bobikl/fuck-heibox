package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.max.hbcommon.component.bottombutton.BottomButtonLeftItemView;
import com.max.hbcustomview.MaxHeightRecyclerView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: LayoutNewcomerCouponReceiveDialogBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class l80 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f112917a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final BottomButtonLeftItemView f112918b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final MaxHeightRecyclerView f112919c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112920d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112921e;

    private l80(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 BottomButtonLeftItemView bottomButtonLeftItemView, @androidx.annotation.n0 MaxHeightRecyclerView maxHeightRecyclerView, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2) {
        this.f112917a = linearLayout;
        this.f112918b = bottomButtonLeftItemView;
        this.f112919c = maxHeightRecyclerView;
        this.f112920d = textView;
        this.f112921e = textView2;
    }

    @androidx.annotation.n0
    public static l80 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 20946, new Class[]{View.class}, l80.class);
        if (patchProxyResultProxy.isSupported) {
            return (l80) patchProxyResultProxy.result;
        }
        int i10 = R.id.btn_action;
        BottomButtonLeftItemView bottomButtonLeftItemView = (BottomButtonLeftItemView) l3.d.a(view, R.id.btn_action);
        if (bottomButtonLeftItemView != null) {
            i10 = R.id.rv;
            MaxHeightRecyclerView maxHeightRecyclerView = (MaxHeightRecyclerView) l3.d.a(view, R.id.rv);
            if (maxHeightRecyclerView != null) {
                i10 = R.id.tv_action;
                TextView textView = (TextView) l3.d.a(view, R.id.tv_action);
                if (textView != null) {
                    i10 = R.id.tv_title;
                    TextView textView2 = (TextView) l3.d.a(view, R.id.tv_title);
                    if (textView2 != null) {
                        return new l80((LinearLayout) view, bottomButtonLeftItemView, maxHeightRecyclerView, textView, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static l80 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 20944, new Class[]{LayoutInflater.class}, l80.class);
        return patchProxyResultProxy.isSupported ? (l80) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static l80 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 20945, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, l80.class);
        if (patchProxyResultProxy.isSupported) {
            return (l80) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.layout_newcomer_coupon_receive_dialog, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f112917a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 20947, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
