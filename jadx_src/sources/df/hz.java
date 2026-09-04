package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.igexin.sdk.PushConsts;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.taobao.accs.utl.UTMini;

/* JADX INFO: compiled from: ItemTaskDialogBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class hz implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final ConstraintLayout f111545a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f111546b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f111547c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111548d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111549e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111550f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f111551g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f111552h;

    private hz(@androidx.annotation.n0 ConstraintLayout constraintLayout, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 View view, @androidx.annotation.n0 LinearLayout linearLayout2) {
        this.f111545a = constraintLayout;
        this.f111546b = imageView;
        this.f111547c = linearLayout;
        this.f111548d = textView;
        this.f111549e = textView2;
        this.f111550f = textView3;
        this.f111551g = view;
        this.f111552h = linearLayout2;
    }

    @androidx.annotation.n0
    public static hz a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 20000, new Class[]{View.class}, hz.class);
        if (patchProxyResultProxy.isSupported) {
            return (hz) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_task_icon;
        ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_task_icon);
        if (imageView != null) {
            i10 = R.id.linearLayout;
            LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.linearLayout);
            if (linearLayout != null) {
                i10 = R.id.tv_confirm;
                TextView textView = (TextView) l3.d.a(view, R.id.tv_confirm);
                if (textView != null) {
                    i10 = R.id.tv_confirm_desc;
                    TextView textView2 = (TextView) l3.d.a(view, R.id.tv_confirm_desc);
                    if (textView2 != null) {
                        i10 = R.id.tv_task_name;
                        TextView textView3 = (TextView) l3.d.a(view, R.id.tv_task_name);
                        if (textView3 != null) {
                            i10 = R.id.v_divider;
                            View viewA = l3.d.a(view, R.id.v_divider);
                            if (viewA != null) {
                                i10 = R.id.vg_task_award;
                                LinearLayout linearLayout2 = (LinearLayout) l3.d.a(view, R.id.vg_task_award);
                                if (linearLayout2 != null) {
                                    return new hz((ConstraintLayout) view, imageView, linearLayout, textView, textView2, textView3, viewA, linearLayout2);
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
    public static hz c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 19998, new Class[]{LayoutInflater.class}, hz.class);
        return patchProxyResultProxy.isSupported ? (hz) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static hz d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, UTMini.EVENTID_AGOO, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, hz.class);
        if (patchProxyResultProxy.isSupported) {
            return (hz) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_task_dialog, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public ConstraintLayout b() {
        return this.f111545a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, PushConsts.SETTAG_ERROR_COUNT, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
