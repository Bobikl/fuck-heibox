package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;

/* JADX INFO: compiled from: ActivityGameAddTagsBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class z implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final SmartRefreshLayout f118097a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final EditText f118098b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f118099c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f118100d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final SmartRefreshLayout f118101e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f118102f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f118103g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f118104h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f118105i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f118106j;

    private z(@androidx.annotation.n0 SmartRefreshLayout smartRefreshLayout, @androidx.annotation.n0 EditText editText, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 LinearLayout linearLayout2, @androidx.annotation.n0 SmartRefreshLayout smartRefreshLayout2, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 LinearLayout linearLayout3, @androidx.annotation.n0 LinearLayout linearLayout4, @androidx.annotation.n0 LinearLayout linearLayout5) {
        this.f118097a = smartRefreshLayout;
        this.f118098b = editText;
        this.f118099c = linearLayout;
        this.f118100d = linearLayout2;
        this.f118101e = smartRefreshLayout2;
        this.f118102f = textView;
        this.f118103g = textView2;
        this.f118104h = linearLayout3;
        this.f118105i = linearLayout4;
        this.f118106j = linearLayout5;
    }

    @androidx.annotation.n0
    public static z a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 16340, new Class[]{View.class}, z.class);
        if (patchProxyResultProxy.isSupported) {
            return (z) patchProxyResultProxy.result;
        }
        int i10 = R.id.et_add_tag;
        EditText editText = (EditText) l3.d.a(view, R.id.et_add_tag);
        if (editText != null) {
            i10 = R.id.ll_my_tags;
            LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.ll_my_tags);
            if (linearLayout != null) {
                i10 = R.id.ll_recommend_tags;
                LinearLayout linearLayout2 = (LinearLayout) l3.d.a(view, R.id.ll_recommend_tags);
                if (linearLayout2 != null) {
                    SmartRefreshLayout smartRefreshLayout = (SmartRefreshLayout) view;
                    i10 = R.id.tv_add_tag;
                    TextView textView = (TextView) l3.d.a(view, R.id.tv_add_tag);
                    if (textView != null) {
                        i10 = R.id.tv_my_tags_num;
                        TextView textView2 = (TextView) l3.d.a(view, R.id.tv_my_tags_num);
                        if (textView2 != null) {
                            i10 = R.id.vg_add_tag;
                            LinearLayout linearLayout3 = (LinearLayout) l3.d.a(view, R.id.vg_add_tag);
                            if (linearLayout3 != null) {
                                i10 = R.id.vg_my_tags;
                                LinearLayout linearLayout4 = (LinearLayout) l3.d.a(view, R.id.vg_my_tags);
                                if (linearLayout4 != null) {
                                    i10 = R.id.vg_recommend_tags;
                                    LinearLayout linearLayout5 = (LinearLayout) l3.d.a(view, R.id.vg_recommend_tags);
                                    if (linearLayout5 != null) {
                                        return new z(smartRefreshLayout, editText, linearLayout, linearLayout2, smartRefreshLayout, textView, textView2, linearLayout3, linearLayout4, linearLayout5);
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
    public static z c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 16338, new Class[]{LayoutInflater.class}, z.class);
        return patchProxyResultProxy.isSupported ? (z) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static z d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 16339, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, z.class);
        if (patchProxyResultProxy.isSupported) {
            return (z) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.activity_game_add_tags, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public SmartRefreshLayout b() {
        return this.f118097a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16341, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
