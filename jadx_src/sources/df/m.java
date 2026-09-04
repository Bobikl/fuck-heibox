package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ActivityChooseTopicsBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class m implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f113185a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final HorizontalScrollView f113186b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f113187c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final RecyclerView f113188d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f113189e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final mb.o f113190f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final la0 f113191g;

    private m(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 HorizontalScrollView horizontalScrollView, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 RecyclerView recyclerView, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 mb.o oVar, @androidx.annotation.n0 la0 la0Var) {
        this.f113185a = relativeLayout;
        this.f113186b = horizontalScrollView;
        this.f113187c = linearLayout;
        this.f113188d = recyclerView;
        this.f113189e = textView;
        this.f113190f = oVar;
        this.f113191g = la0Var;
    }

    @androidx.annotation.n0
    public static m a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 16288, new Class[]{View.class}, m.class);
        if (patchProxyResultProxy.isSupported) {
            return (m) patchProxyResultProxy.result;
        }
        int i10 = R.id.hsv_topic;
        HorizontalScrollView horizontalScrollView = (HorizontalScrollView) l3.d.a(view, R.id.hsv_topic);
        if (horizontalScrollView != null) {
            i10 = R.id.ll_choosed;
            LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.ll_choosed);
            if (linearLayout != null) {
                i10 = R.id.rv_topics;
                RecyclerView recyclerView = (RecyclerView) l3.d.a(view, R.id.rv_topics);
                if (recyclerView != null) {
                    i10 = R.id.tv_finish;
                    TextView textView = (TextView) l3.d.a(view, R.id.tv_finish);
                    if (textView != null) {
                        i10 = R.id.v_divider;
                        View viewA = l3.d.a(view, R.id.v_divider);
                        if (viewA != null) {
                            mb.o oVarA = mb.o.a(viewA);
                            i10 = R.id.vg_et;
                            View viewA2 = l3.d.a(view, R.id.vg_et);
                            if (viewA2 != null) {
                                return new m((RelativeLayout) view, horizontalScrollView, linearLayout, recyclerView, textView, oVarA, la0.a(viewA2));
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static m c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 16286, new Class[]{LayoutInflater.class}, m.class);
        return patchProxyResultProxy.isSupported ? (m) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static m d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 16287, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, m.class);
        if (patchProxyResultProxy.isSupported) {
            return (m) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.activity_choose_topics, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f113185a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16289, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
