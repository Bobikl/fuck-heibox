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

/* JADX INFO: compiled from: ItemMatchesTitleBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class lq implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f113123a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f113124b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f113125c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f113126d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f113127e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f113128f;

    private lq(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 TextView textView5) {
        this.f113123a = linearLayout;
        this.f113124b = textView;
        this.f113125c = textView2;
        this.f113126d = textView3;
        this.f113127e = textView4;
        this.f113128f = textView5;
    }

    @androidx.annotation.n0
    public static lq a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 19088, new Class[]{View.class}, lq.class);
        if (patchProxyResultProxy.isSupported) {
            return (lq) patchProxyResultProxy.result;
        }
        int i10 = R.id.tv_match_list_header_grade;
        TextView textView = (TextView) l3.d.a(view, R.id.tv_match_list_header_grade);
        if (textView != null) {
            i10 = R.id.tv_match_list_header_kill_damage;
            TextView textView2 = (TextView) l3.d.a(view, R.id.tv_match_list_header_kill_damage);
            if (textView2 != null) {
                i10 = R.id.tv_match_list_header_mode;
                TextView textView3 = (TextView) l3.d.a(view, R.id.tv_match_list_header_mode);
                if (textView3 != null) {
                    i10 = R.id.tv_match_list_header_rank;
                    TextView textView4 = (TextView) l3.d.a(view, R.id.tv_match_list_header_rank);
                    if (textView4 != null) {
                        i10 = R.id.tv_match_list_header_score;
                        TextView textView5 = (TextView) l3.d.a(view, R.id.tv_match_list_header_score);
                        if (textView5 != null) {
                            return new lq((LinearLayout) view, textView, textView2, textView3, textView4, textView5);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static lq c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 19086, new Class[]{LayoutInflater.class}, lq.class);
        return patchProxyResultProxy.isSupported ? (lq) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static lq d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 19087, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, lq.class);
        if (patchProxyResultProxy.isSupported) {
            return (lq) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_matches_title, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f113123a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 19089, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
