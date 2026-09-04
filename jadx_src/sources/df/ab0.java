package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.max.hbcustomview.RadiusCardView;
import com.max.hbcustomview.SlideExpandView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: LayoutStoryCommentBottomDialogFragmentBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class ab0 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final SlideExpandView f108478a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ConstraintLayout f108479b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final FrameLayout f108480c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final RadiusCardView f108481d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final SlideExpandView f108482e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f108483f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f108484g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final FrameLayout f108485h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f108486i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f108487j;

    private ab0(@androidx.annotation.n0 SlideExpandView slideExpandView, @androidx.annotation.n0 ConstraintLayout constraintLayout, @androidx.annotation.n0 FrameLayout frameLayout, @androidx.annotation.n0 RadiusCardView radiusCardView, @androidx.annotation.n0 SlideExpandView slideExpandView2, @androidx.annotation.n0 View view, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 FrameLayout frameLayout2, @androidx.annotation.n0 View view2, @androidx.annotation.n0 View view3) {
        this.f108478a = slideExpandView;
        this.f108479b = constraintLayout;
        this.f108480c = frameLayout;
        this.f108481d = radiusCardView;
        this.f108482e = slideExpandView2;
        this.f108483f = view;
        this.f108484g = textView;
        this.f108485h = frameLayout2;
        this.f108486i = view2;
        this.f108487j = view3;
    }

    @androidx.annotation.n0
    public static ab0 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 21213, new Class[]{View.class}, ab0.class);
        if (patchProxyResultProxy.isSupported) {
            return (ab0) patchProxyResultProxy.result;
        }
        int i10 = R.id.comment_dialog_root;
        ConstraintLayout constraintLayout = (ConstraintLayout) l3.d.a(view, R.id.comment_dialog_root);
        if (constraintLayout != null) {
            i10 = R.id.comment_fragment_container;
            FrameLayout frameLayout = (FrameLayout) l3.d.a(view, R.id.comment_fragment_container);
            if (frameLayout != null) {
                i10 = R.id.cv_container;
                RadiusCardView radiusCardView = (RadiusCardView) l3.d.a(view, R.id.cv_container);
                if (radiusCardView != null) {
                    SlideExpandView slideExpandView = (SlideExpandView) view;
                    i10 = R.id.story_comment_bottom_fake_editor;
                    View viewA = l3.d.a(view, R.id.story_comment_bottom_fake_editor);
                    if (viewA != null) {
                        i10 = R.id.tv_story_comment_bottom_fake_editor_hint;
                        TextView textView = (TextView) l3.d.a(view, R.id.tv_story_comment_bottom_fake_editor_hint);
                        if (textView != null) {
                            i10 = R.id.v_anchor;
                            FrameLayout frameLayout2 = (FrameLayout) l3.d.a(view, R.id.v_anchor);
                            if (frameLayout2 != null) {
                                i10 = R.id.v_anchor_rect;
                                View viewA2 = l3.d.a(view, R.id.v_anchor_rect);
                                if (viewA2 != null) {
                                    i10 = R.id.v_bg;
                                    View viewA3 = l3.d.a(view, R.id.v_bg);
                                    if (viewA3 != null) {
                                        return new ab0(slideExpandView, constraintLayout, frameLayout, radiusCardView, slideExpandView, viewA, textView, frameLayout2, viewA2, viewA3);
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
    public static ab0 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 21211, new Class[]{LayoutInflater.class}, ab0.class);
        return patchProxyResultProxy.isSupported ? (ab0) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static ab0 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 21212, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, ab0.class);
        if (patchProxyResultProxy.isSupported) {
            return (ab0) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.layout_story_comment_bottom_dialog_fragment, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public SlideExpandView b() {
        return this.f108478a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 21214, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
