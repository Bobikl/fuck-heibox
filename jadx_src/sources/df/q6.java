package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: DialogTradeBindConflictBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class q6 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final ConstraintLayout f114737a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f114738b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f114739c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f114740d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f114741e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f114742f;

    private q6(@androidx.annotation.n0 ConstraintLayout constraintLayout, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4) {
        this.f114737a = constraintLayout;
        this.f114738b = imageView;
        this.f114739c = textView;
        this.f114740d = textView2;
        this.f114741e = textView3;
        this.f114742f = textView4;
    }

    @androidx.annotation.n0
    public static q6 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 17032, new Class[]{View.class}, q6.class);
        if (patchProxyResultProxy.isSupported) {
            return (q6) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_avartar;
        ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_avartar);
        if (imageView != null) {
            i10 = R.id.tv_app_heybox;
            TextView textView = (TextView) l3.d.a(view, R.id.tv_app_heybox);
            if (textView != null) {
                i10 = R.id.tv_app_max;
                TextView textView2 = (TextView) l3.d.a(view, R.id.tv_app_max);
                if (textView2 != null) {
                    i10 = R.id.tv_id;
                    TextView textView3 = (TextView) l3.d.a(view, R.id.tv_id);
                    if (textView3 != null) {
                        i10 = R.id.tv_name;
                        TextView textView4 = (TextView) l3.d.a(view, R.id.tv_name);
                        if (textView4 != null) {
                            return new q6((ConstraintLayout) view, imageView, textView, textView2, textView3, textView4);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static q6 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 17030, new Class[]{LayoutInflater.class}, q6.class);
        return patchProxyResultProxy.isSupported ? (q6) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static q6 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 17031, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, q6.class);
        if (patchProxyResultProxy.isSupported) {
            return (q6) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.dialog_trade_bind_conflict, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public ConstraintLayout b() {
        return this.f114737a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 17033, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
