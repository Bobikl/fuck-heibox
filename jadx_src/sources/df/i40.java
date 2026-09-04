package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: LayoutEditorRecommendContainerBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class i40 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final View f111618a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f111619b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final RecyclerView f111620c;

    private i40(@androidx.annotation.n0 View view, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 RecyclerView recyclerView) {
        this.f111618a = view;
        this.f111619b = imageView;
        this.f111620c = recyclerView;
    }

    @androidx.annotation.n0
    public static i40 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 20521, new Class[]{View.class}, i40.class);
        if (patchProxyResultProxy.isSupported) {
            return (i40) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_recommend_topic_close;
        ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_recommend_topic_close);
        if (imageView != null) {
            i10 = R.id.rv_recommend_topic;
            RecyclerView recyclerView = (RecyclerView) l3.d.a(view, R.id.rv_recommend_topic);
            if (recyclerView != null) {
                return new i40(view, imageView, recyclerView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static i40 b(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.n0 ViewGroup viewGroup) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup}, null, changeQuickRedirect, true, 20520, new Class[]{LayoutInflater.class, ViewGroup.class}, i40.class);
        if (patchProxyResultProxy.isSupported) {
            return (i40) patchProxyResultProxy.result;
        }
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R.layout.layout_editor_recommend_container, viewGroup);
        return a(viewGroup);
    }

    @Override // l3.c
    @androidx.annotation.n0
    public View getRoot() {
        return this.f111618a;
    }
}
