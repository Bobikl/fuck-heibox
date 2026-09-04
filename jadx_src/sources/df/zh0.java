package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ViewStoryFollowCoreWidgetBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class zh0 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final View f118375a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f118376b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f118377c;

    private zh0(@androidx.annotation.n0 View view, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2) {
        this.f118375a = view;
        this.f118376b = textView;
        this.f118377c = textView2;
    }

    @androidx.annotation.n0
    public static zh0 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 21923, new Class[]{View.class}, zh0.class);
        if (patchProxyResultProxy.isSupported) {
            return (zh0) patchProxyResultProxy.result;
        }
        int i10 = R.id.story_followed_text_view;
        TextView textView = (TextView) l3.d.a(view, R.id.story_followed_text_view);
        if (textView != null) {
            i10 = R.id.story_unfollow_text_view;
            TextView textView2 = (TextView) l3.d.a(view, R.id.story_unfollow_text_view);
            if (textView2 != null) {
                return new zh0(view, textView, textView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static zh0 b(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.n0 ViewGroup viewGroup) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup}, null, changeQuickRedirect, true, 21922, new Class[]{LayoutInflater.class, ViewGroup.class}, zh0.class);
        if (patchProxyResultProxy.isSupported) {
            return (zh0) patchProxyResultProxy.result;
        }
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R.layout.view_story_follow_core_widget, viewGroup);
        return a(viewGroup);
    }

    @Override // l3.c
    @androidx.annotation.n0
    public View getRoot() {
        return this.f118375a;
    }
}
