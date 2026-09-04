package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.max.hbcommon.component.bottombutton.BottomButtonLeftItemView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ActivityInterestInitV2Binding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class y0 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final ConstraintLayout f117684a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final BottomButtonLeftItemView f117685b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final RecyclerView f117686c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final RecyclerView f117687d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117688e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117689f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117690g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117691h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f117692i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f117693j;

    private y0(@androidx.annotation.n0 ConstraintLayout constraintLayout, @androidx.annotation.n0 BottomButtonLeftItemView bottomButtonLeftItemView, @androidx.annotation.n0 RecyclerView recyclerView, @androidx.annotation.n0 RecyclerView recyclerView2, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 LinearLayout linearLayout2) {
        this.f117684a = constraintLayout;
        this.f117685b = bottomButtonLeftItemView;
        this.f117686c = recyclerView;
        this.f117687d = recyclerView2;
        this.f117688e = textView;
        this.f117689f = textView2;
        this.f117690g = textView3;
        this.f117691h = textView4;
        this.f117692i = linearLayout;
        this.f117693j = linearLayout2;
    }

    @androidx.annotation.n0
    public static y0 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 16440, new Class[]{View.class}, y0.class);
        if (patchProxyResultProxy.isSupported) {
            return (y0) patchProxyResultProxy.result;
        }
        int i10 = R.id.bb_confirm;
        BottomButtonLeftItemView bottomButtonLeftItemView = (BottomButtonLeftItemView) l3.d.a(view, R.id.bb_confirm);
        if (bottomButtonLeftItemView != null) {
            i10 = R.id.rv_group;
            RecyclerView recyclerView = (RecyclerView) l3.d.a(view, R.id.rv_group);
            if (recyclerView != null) {
                i10 = R.id.rv_topic;
                RecyclerView recyclerView2 = (RecyclerView) l3.d.a(view, R.id.rv_topic);
                if (recyclerView2 != null) {
                    i10 = R.id.tv_desc;
                    TextView textView = (TextView) l3.d.a(view, R.id.tv_desc);
                    if (textView != null) {
                        i10 = R.id.tv_desc_topic;
                        TextView textView2 = (TextView) l3.d.a(view, R.id.tv_desc_topic);
                        if (textView2 != null) {
                            i10 = R.id.tv_title;
                            TextView textView3 = (TextView) l3.d.a(view, R.id.tv_title);
                            if (textView3 != null) {
                                i10 = R.id.tv_title_topic;
                                TextView textView4 = (TextView) l3.d.a(view, R.id.tv_title_topic);
                                if (textView4 != null) {
                                    i10 = R.id.vg_title_info;
                                    LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_title_info);
                                    if (linearLayout != null) {
                                        i10 = R.id.vg_title_info_topic;
                                        LinearLayout linearLayout2 = (LinearLayout) l3.d.a(view, R.id.vg_title_info_topic);
                                        if (linearLayout2 != null) {
                                            return new y0((ConstraintLayout) view, bottomButtonLeftItemView, recyclerView, recyclerView2, textView, textView2, textView3, textView4, linearLayout, linearLayout2);
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
    public static y0 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 16438, new Class[]{LayoutInflater.class}, y0.class);
        return patchProxyResultProxy.isSupported ? (y0) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static y0 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 16439, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, y0.class);
        if (patchProxyResultProxy.isSupported) {
            return (y0) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.activity_interest_init_v2, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public ConstraintLayout b() {
        return this.f117684a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16441, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
