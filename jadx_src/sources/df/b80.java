package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import com.max.hbcustomview.GradientTextView;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.view.richtext.RichViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: LayoutMemberCardBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class b80 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final ConstraintLayout f108860a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final Group f108861b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f108862c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final RichViewGroup f108863d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final RichViewGroup f108864e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f108865f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final GradientTextView f108866g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f108867h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f108868i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final ConstraintLayout f108869j;

    private b80(@androidx.annotation.n0 ConstraintLayout constraintLayout, @androidx.annotation.n0 Group group, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 RichViewGroup richViewGroup, @androidx.annotation.n0 RichViewGroup richViewGroup2, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 GradientTextView gradientTextView, @androidx.annotation.n0 View view, @androidx.annotation.n0 View view2, @androidx.annotation.n0 ConstraintLayout constraintLayout2) {
        this.f108860a = constraintLayout;
        this.f108861b = group;
        this.f108862c = imageView;
        this.f108863d = richViewGroup;
        this.f108864e = richViewGroup2;
        this.f108865f = textView;
        this.f108866g = gradientTextView;
        this.f108867h = view;
        this.f108868i = view2;
        this.f108869j = constraintLayout2;
    }

    @androidx.annotation.n0
    public static b80 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 20906, new Class[]{View.class}, b80.class);
        if (patchProxyResultProxy.isSupported) {
            return (b80) patchProxyResultProxy.result;
        }
        int i10 = R.id.group_vip_level_progress;
        Group group = (Group) l3.d.a(view, R.id.group_vip_level_progress);
        if (group != null) {
            i10 = R.id.iv_bg;
            ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_bg);
            if (imageView != null) {
                i10 = R.id.ll_progress_rich_text;
                RichViewGroup richViewGroup = (RichViewGroup) l3.d.a(view, R.id.ll_progress_rich_text);
                if (richViewGroup != null) {
                    i10 = R.id.ll_sub_title_rich_text;
                    RichViewGroup richViewGroup2 = (RichViewGroup) l3.d.a(view, R.id.ll_sub_title_rich_text);
                    if (richViewGroup2 != null) {
                        i10 = R.id.tv_sub_title;
                        TextView textView = (TextView) l3.d.a(view, R.id.tv_sub_title);
                        if (textView != null) {
                            i10 = R.id.tv_title;
                            GradientTextView gradientTextView = (GradientTextView) l3.d.a(view, R.id.tv_title);
                            if (gradientTextView != null) {
                                i10 = R.id.v_vip_level_progress;
                                View viewA = l3.d.a(view, R.id.v_vip_level_progress);
                                if (viewA != null) {
                                    i10 = R.id.v_vip_level_progress_background;
                                    View viewA2 = l3.d.a(view, R.id.v_vip_level_progress_background);
                                    if (viewA2 != null) {
                                        ConstraintLayout constraintLayout = (ConstraintLayout) view;
                                        return new b80(constraintLayout, group, imageView, richViewGroup, richViewGroup2, textView, gradientTextView, viewA, viewA2, constraintLayout);
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
    public static b80 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 20904, new Class[]{LayoutInflater.class}, b80.class);
        return patchProxyResultProxy.isSupported ? (b80) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static b80 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 20905, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, b80.class);
        if (patchProxyResultProxy.isSupported) {
            return (b80) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.layout_member_card, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public ConstraintLayout b() {
        return this.f108860a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 20907, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
