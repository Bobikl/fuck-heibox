package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import com.max.hbcustomview.QMUIRadiusImageView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: LayoutLinkPostInfoBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class o70 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final View f114127a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final QMUIRadiusImageView f114128b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final AppCompatTextView f114129c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final AppCompatTextView f114130d;

    private o70(@androidx.annotation.n0 View view, @androidx.annotation.n0 QMUIRadiusImageView qMUIRadiusImageView, @androidx.annotation.n0 AppCompatTextView appCompatTextView, @androidx.annotation.n0 AppCompatTextView appCompatTextView2) {
        this.f114127a = view;
        this.f114128b = qMUIRadiusImageView;
        this.f114129c = appCompatTextView;
        this.f114130d = appCompatTextView2;
    }

    @androidx.annotation.n0
    public static o70 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 20855, new Class[]{View.class}, o70.class);
        if (patchProxyResultProxy.isSupported) {
            return (o70) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_post_img;
        QMUIRadiusImageView qMUIRadiusImageView = (QMUIRadiusImageView) l3.d.a(view, R.id.iv_post_img);
        if (qMUIRadiusImageView != null) {
            i10 = R.id.tv_post_author;
            AppCompatTextView appCompatTextView = (AppCompatTextView) l3.d.a(view, R.id.tv_post_author);
            if (appCompatTextView != null) {
                i10 = R.id.tv_post_info;
                AppCompatTextView appCompatTextView2 = (AppCompatTextView) l3.d.a(view, R.id.tv_post_info);
                if (appCompatTextView2 != null) {
                    return new o70(view, qMUIRadiusImageView, appCompatTextView, appCompatTextView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static o70 b(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.n0 ViewGroup viewGroup) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup}, null, changeQuickRedirect, true, 20854, new Class[]{LayoutInflater.class, ViewGroup.class}, o70.class);
        if (patchProxyResultProxy.isSupported) {
            return (o70) patchProxyResultProxy.result;
        }
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R.layout.layout_link_post_info, viewGroup);
        return a(viewGroup);
    }

    @Override // l3.c
    @androidx.annotation.n0
    public View getRoot() {
        return this.f114127a;
    }
}
