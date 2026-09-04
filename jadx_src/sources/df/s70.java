package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.max.hbcommon.component.bottombutton.BottomButtonLeftItemView;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.littleprogram.view.MiniProgramBoardView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: LayoutLittleProgramItemsCardBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class s70 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f115495a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final BottomButtonLeftItemView f115496b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f115497c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final MiniProgramBoardView f115498d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f115499e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f115500f;

    private s70(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 BottomButtonLeftItemView bottomButtonLeftItemView, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 MiniProgramBoardView miniProgramBoardView, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 View view) {
        this.f115495a = relativeLayout;
        this.f115496b = bottomButtonLeftItemView;
        this.f115497c = linearLayout;
        this.f115498d = miniProgramBoardView;
        this.f115499e = textView;
        this.f115500f = view;
    }

    @androidx.annotation.n0
    public static s70 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 20870, new Class[]{View.class}, s70.class);
        if (patchProxyResultProxy.isSupported) {
            return (s70) patchProxyResultProxy.result;
        }
        int i10 = R.id.bb_cancel;
        BottomButtonLeftItemView bottomButtonLeftItemView = (BottomButtonLeftItemView) l3.d.a(view, R.id.bb_cancel);
        if (bottomButtonLeftItemView != null) {
            i10 = R.id.cardView2;
            LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.cardView2);
            if (linearLayout != null) {
                i10 = R.id.items_container;
                MiniProgramBoardView miniProgramBoardView = (MiniProgramBoardView) l3.d.a(view, R.id.items_container);
                if (miniProgramBoardView != null) {
                    i10 = R.id.title;
                    TextView textView = (TextView) l3.d.a(view, R.id.title);
                    if (textView != null) {
                        i10 = R.id.v_out;
                        View viewA = l3.d.a(view, R.id.v_out);
                        if (viewA != null) {
                            return new s70((RelativeLayout) view, bottomButtonLeftItemView, linearLayout, miniProgramBoardView, textView, viewA);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static s70 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 20868, new Class[]{LayoutInflater.class}, s70.class);
        return patchProxyResultProxy.isSupported ? (s70) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static s70 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 20869, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, s70.class);
        if (patchProxyResultProxy.isSupported) {
            return (s70) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.layout_little_program_items_card, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f115495a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 20871, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
