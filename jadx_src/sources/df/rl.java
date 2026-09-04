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

/* JADX INFO: compiled from: ItemGameOverviewCareerRecordBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class rl implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f115272a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final RecyclerView f115273b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f115274c;

    private rl(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 RecyclerView recyclerView, @androidx.annotation.n0 TextView textView) {
        this.f115272a = linearLayout;
        this.f115273b = recyclerView;
        this.f115274c = textView;
    }

    @androidx.annotation.n0
    public static rl a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 18592, new Class[]{View.class}, rl.class);
        if (patchProxyResultProxy.isSupported) {
            return (rl) patchProxyResultProxy.result;
        }
        int i10 = R.id.rv;
        RecyclerView recyclerView = (RecyclerView) l3.d.a(view, R.id.rv);
        if (recyclerView != null) {
            i10 = R.id.tv_title;
            TextView textView = (TextView) l3.d.a(view, R.id.tv_title);
            if (textView != null) {
                return new rl((LinearLayout) view, recyclerView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static rl c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 18590, new Class[]{LayoutInflater.class}, rl.class);
        return patchProxyResultProxy.isSupported ? (rl) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static rl d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 18591, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, rl.class);
        if (patchProxyResultProxy.isSupported) {
            return (rl) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_game_overview_career_record, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f115272a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 18593, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
