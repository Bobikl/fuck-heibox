package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: LayoutPubgMatchListBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class k90 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f112492a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final RecyclerView f112493b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112494c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112495d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112496e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112497f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112498g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112499h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112500i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f112501j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f112502k;

    private k90(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 RecyclerView recyclerView, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 TextView textView5, @androidx.annotation.n0 TextView textView6, @androidx.annotation.n0 TextView textView7, @androidx.annotation.n0 LinearLayout linearLayout2, @androidx.annotation.n0 LinearLayout linearLayout3) {
        this.f112492a = linearLayout;
        this.f112493b = recyclerView;
        this.f112494c = textView;
        this.f112495d = textView2;
        this.f112496e = textView3;
        this.f112497f = textView4;
        this.f112498g = textView5;
        this.f112499h = textView6;
        this.f112500i = textView7;
        this.f112501j = linearLayout2;
        this.f112502k = linearLayout3;
    }

    @androidx.annotation.n0
    public static k90 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 21046, new Class[]{View.class}, k90.class);
        if (patchProxyResultProxy.isSupported) {
            return (k90) patchProxyResultProxy.result;
        }
        int i10 = R.id.rv_match_list_content;
        RecyclerView recyclerView = (RecyclerView) l3.d.a(view, R.id.rv_match_list_content);
        if (recyclerView != null) {
            i10 = R.id.tv_all_matches;
            TextView textView = (TextView) l3.d.a(view, R.id.tv_all_matches);
            if (textView != null) {
                i10 = R.id.tv_match_list_header_grade;
                TextView textView2 = (TextView) l3.d.a(view, R.id.tv_match_list_header_grade);
                if (textView2 != null) {
                    i10 = R.id.tv_match_list_header_kill_damage;
                    TextView textView3 = (TextView) l3.d.a(view, R.id.tv_match_list_header_kill_damage);
                    if (textView3 != null) {
                        i10 = R.id.tv_match_list_header_mode;
                        TextView textView4 = (TextView) l3.d.a(view, R.id.tv_match_list_header_mode);
                        if (textView4 != null) {
                            i10 = R.id.tv_match_list_header_rank;
                            TextView textView5 = (TextView) l3.d.a(view, R.id.tv_match_list_header_rank);
                            if (textView5 != null) {
                                i10 = R.id.tv_match_list_header_score;
                                TextView textView6 = (TextView) l3.d.a(view, R.id.tv_match_list_header_score);
                                if (textView6 != null) {
                                    i10 = R.id.tv_title;
                                    TextView textView7 = (TextView) l3.d.a(view, R.id.tv_title);
                                    if (textView7 != null) {
                                        LinearLayout linearLayout = (LinearLayout) view;
                                        i10 = R.id.vg_match_list_header;
                                        LinearLayout linearLayout2 = (LinearLayout) l3.d.a(view, R.id.vg_match_list_header);
                                        if (linearLayout2 != null) {
                                            return new k90(linearLayout, recyclerView, textView, textView2, textView3, textView4, textView5, textView6, textView7, linearLayout, linearLayout2);
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
    public static k90 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 21044, new Class[]{LayoutInflater.class}, k90.class);
        return patchProxyResultProxy.isSupported ? (k90) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static k90 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 21045, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, k90.class);
        if (patchProxyResultProxy.isSupported) {
            return (k90) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.layout_pubg_match_list, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f112492a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 21047, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
