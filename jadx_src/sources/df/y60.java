package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.view.ContentAutoPlayTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: LayoutHardwareCardV2Binding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class y60 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final CardView f117801a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117802b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117803c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117804d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117805e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final ContentAutoPlayTextView f117806f;

    private y60(@androidx.annotation.n0 CardView cardView, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 ContentAutoPlayTextView contentAutoPlayTextView) {
        this.f117801a = cardView;
        this.f117802b = textView;
        this.f117803c = textView2;
        this.f117804d = textView3;
        this.f117805e = textView4;
        this.f117806f = contentAutoPlayTextView;
    }

    @androidx.annotation.n0
    public static y60 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 20792, new Class[]{View.class}, y60.class);
        if (patchProxyResultProxy.isSupported) {
            return (y60) patchProxyResultProxy.result;
        }
        int i10 = R.id.tv_detail;
        TextView textView = (TextView) l3.d.a(view, R.id.tv_detail);
        if (textView != null) {
            i10 = R.id.tv_info;
            TextView textView2 = (TextView) l3.d.a(view, R.id.tv_info);
            if (textView2 != null) {
                i10 = R.id.tv_more;
                TextView textView3 = (TextView) l3.d.a(view, R.id.tv_more);
                if (textView3 != null) {
                    i10 = R.id.tv_my_hardware;
                    TextView textView4 = (TextView) l3.d.a(view, R.id.tv_my_hardware);
                    if (textView4 != null) {
                        i10 = R.id.tv_score;
                        ContentAutoPlayTextView contentAutoPlayTextView = (ContentAutoPlayTextView) l3.d.a(view, R.id.tv_score);
                        if (contentAutoPlayTextView != null) {
                            return new y60((CardView) view, textView, textView2, textView3, textView4, contentAutoPlayTextView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static y60 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 20790, new Class[]{LayoutInflater.class}, y60.class);
        return patchProxyResultProxy.isSupported ? (y60) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static y60 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 20791, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, y60.class);
        if (patchProxyResultProxy.isSupported) {
            return (y60) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.layout_hardware_card_v2, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public CardView b() {
        return this.f117801a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 20793, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
