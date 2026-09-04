package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: LayoutDota2MatchDetailHeaderInfoBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class a40 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f108352a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f108353b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f108354c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f108355d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f108356e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f108357f;

    private a40(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 LinearLayout linearLayout2) {
        this.f108352a = linearLayout;
        this.f108353b = textView;
        this.f108354c = textView2;
        this.f108355d = textView3;
        this.f108356e = textView4;
        this.f108357f = linearLayout2;
    }

    @androidx.annotation.n0
    public static a40 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 20490, new Class[]{View.class}, a40.class);
        if (patchProxyResultProxy.isSupported) {
            return (a40) patchProxyResultProxy.result;
        }
        int i10 = R.id.tv_delta;
        TextView textView = (TextView) l3.d.a(view, R.id.tv_delta);
        if (textView != null) {
            i10 = R.id.tv_rank;
            TextView textView2 = (TextView) l3.d.a(view, R.id.tv_rank);
            if (textView2 != null) {
                i10 = R.id.tv_result;
                TextView textView3 = (TextView) l3.d.a(view, R.id.tv_result);
                if (textView3 != null) {
                    i10 = R.id.tv_team;
                    TextView textView4 = (TextView) l3.d.a(view, R.id.tv_team);
                    if (textView4 != null) {
                        i10 = R.id.vg_rank;
                        LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_rank);
                        if (linearLayout != null) {
                            return new a40((LinearLayout) view, textView, textView2, textView3, textView4, linearLayout);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static a40 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 20488, new Class[]{LayoutInflater.class}, a40.class);
        return patchProxyResultProxy.isSupported ? (a40) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static a40 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 20489, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, a40.class);
        if (patchProxyResultProxy.isSupported) {
            return (a40) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.layout_dota2_match_detail_header_info, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f108352a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 20491, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
