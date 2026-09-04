package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.expression.widget.HeyBoxEditText;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ActivityWriteFeedbackBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class i3 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f111599a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final HeyBoxEditText f111600b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f111601c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f111602d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final RecyclerView f111603e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111604f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f111605g;

    private i3(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 HeyBoxEditText heyBoxEditText, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 RelativeLayout relativeLayout2, @androidx.annotation.n0 RecyclerView recyclerView, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 LinearLayout linearLayout2) {
        this.f111599a = relativeLayout;
        this.f111600b = heyBoxEditText;
        this.f111601c = linearLayout;
        this.f111602d = relativeLayout2;
        this.f111603e = recyclerView;
        this.f111604f = textView;
        this.f111605g = linearLayout2;
    }

    @androidx.annotation.n0
    public static i3 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 16688, new Class[]{View.class}, i3.class);
        if (patchProxyResultProxy.isSupported) {
            return (i3) patchProxyResultProxy.result;
        }
        int i10 = R.id.et_content;
        HeyBoxEditText heyBoxEditText = (HeyBoxEditText) l3.d.a(view, R.id.et_content);
        if (heyBoxEditText != null) {
            i10 = R.id.ll_topic;
            LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.ll_topic);
            if (linearLayout != null) {
                RelativeLayout relativeLayout = (RelativeLayout) view;
                i10 = R.id.rv_edit_comment_edit_pic;
                RecyclerView recyclerView = (RecyclerView) l3.d.a(view, R.id.rv_edit_comment_edit_pic);
                if (recyclerView != null) {
                    i10 = R.id.tv_upload_desc;
                    TextView textView = (TextView) l3.d.a(view, R.id.tv_upload_desc);
                    if (textView != null) {
                        i10 = R.id.vg_topic_group;
                        LinearLayout linearLayout2 = (LinearLayout) l3.d.a(view, R.id.vg_topic_group);
                        if (linearLayout2 != null) {
                            return new i3(relativeLayout, heyBoxEditText, linearLayout, relativeLayout, recyclerView, textView, linearLayout2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static i3 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 16686, new Class[]{LayoutInflater.class}, i3.class);
        return patchProxyResultProxy.isSupported ? (i3) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static i3 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 16687, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, i3.class);
        if (patchProxyResultProxy.isSupported) {
            return (i3) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.activity_write_feedback, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f111599a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16689, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
