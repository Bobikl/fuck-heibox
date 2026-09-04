package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemLinkListTopicBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class pp implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f114590a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f114591b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f114592c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f114593d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f114594e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f114595f;

    private pp(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4) {
        this.f114590a = relativeLayout;
        this.f114591b = imageView;
        this.f114592c = textView;
        this.f114593d = textView2;
        this.f114594e = textView3;
        this.f114595f = textView4;
    }

    @androidx.annotation.n0
    public static pp a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 19000, new Class[]{View.class}, pp.class);
        if (patchProxyResultProxy.isSupported) {
            return (pp) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_image;
        ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_image);
        if (imageView != null) {
            i10 = R.id.tv_follow;
            TextView textView = (TextView) l3.d.a(view, R.id.tv_follow);
            if (textView != null) {
                i10 = R.id.tv_follow_num;
                TextView textView2 = (TextView) l3.d.a(view, R.id.tv_follow_num);
                if (textView2 != null) {
                    i10 = R.id.tv_link_num;
                    TextView textView3 = (TextView) l3.d.a(view, R.id.tv_link_num);
                    if (textView3 != null) {
                        i10 = R.id.tv_name;
                        TextView textView4 = (TextView) l3.d.a(view, R.id.tv_name);
                        if (textView4 != null) {
                            return new pp((RelativeLayout) view, imageView, textView, textView2, textView3, textView4);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static pp c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 18998, new Class[]{LayoutInflater.class}, pp.class);
        return patchProxyResultProxy.isSupported ? (pp) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static pp d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 18999, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, pp.class);
        if (patchProxyResultProxy.isSupported) {
            return (pp) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_link_list_topic, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f114590a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 19001, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
