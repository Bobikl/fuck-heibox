package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: LayoutConceptTopicTitleBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class o30 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f114079a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f114080b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f114081c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f114082d;

    private o30(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 LinearLayout linearLayout) {
        this.f114079a = relativeLayout;
        this.f114080b = textView;
        this.f114081c = textView2;
        this.f114082d = linearLayout;
    }

    @androidx.annotation.n0
    public static o30 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 20442, new Class[]{View.class}, o30.class);
        if (patchProxyResultProxy.isSupported) {
            return (o30) patchProxyResultProxy.result;
        }
        int i10 = R.id.tv_desc;
        TextView textView = (TextView) l3.d.a(view, R.id.tv_desc);
        if (textView != null) {
            i10 = R.id.tv_title;
            TextView textView2 = (TextView) l3.d.a(view, R.id.tv_title);
            if (textView2 != null) {
                i10 = R.id.vg_title;
                LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_title);
                if (linearLayout != null) {
                    return new o30((RelativeLayout) view, textView, textView2, linearLayout);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static o30 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 20440, new Class[]{LayoutInflater.class}, o30.class);
        return patchProxyResultProxy.isSupported ? (o30) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static o30 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 20441, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, o30.class);
        if (patchProxyResultProxy.isSupported) {
            return (o30) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.layout_concept_topic_title, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f114079a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 20443, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
