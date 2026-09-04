package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.max.hbcommon.component.bottombutton.BottomButtonLeftItemView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: DialogSelectCollectionBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class l6 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f112875a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final BottomButtonLeftItemView f112876b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final RecyclerView f112877c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112878d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112879e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final FrameLayout f112880f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f112881g;

    private l6(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 BottomButtonLeftItemView bottomButtonLeftItemView, @androidx.annotation.n0 RecyclerView recyclerView, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 FrameLayout frameLayout, @androidx.annotation.n0 LinearLayout linearLayout) {
        this.f112875a = relativeLayout;
        this.f112876b = bottomButtonLeftItemView;
        this.f112877c = recyclerView;
        this.f112878d = textView;
        this.f112879e = textView2;
        this.f112880f = frameLayout;
        this.f112881g = linearLayout;
    }

    @androidx.annotation.n0
    public static l6 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 17012, new Class[]{View.class}, l6.class);
        if (patchProxyResultProxy.isSupported) {
            return (l6) patchProxyResultProxy.result;
        }
        int i10 = R.id.bb_cancel;
        BottomButtonLeftItemView bottomButtonLeftItemView = (BottomButtonLeftItemView) l3.d.a(view, R.id.bb_cancel);
        if (bottomButtonLeftItemView != null) {
            i10 = R.id.rv_choices;
            RecyclerView recyclerView = (RecyclerView) l3.d.a(view, R.id.rv_choices);
            if (recyclerView != null) {
                i10 = R.id.tv_action;
                TextView textView = (TextView) l3.d.a(view, R.id.tv_action);
                if (textView != null) {
                    i10 = R.id.tv_title;
                    TextView textView2 = (TextView) l3.d.a(view, R.id.tv_title);
                    if (textView2 != null) {
                        i10 = R.id.v_blank;
                        FrameLayout frameLayout = (FrameLayout) l3.d.a(view, R.id.v_blank);
                        if (frameLayout != null) {
                            i10 = R.id.vg_dialog;
                            LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_dialog);
                            if (linearLayout != null) {
                                return new l6((RelativeLayout) view, bottomButtonLeftItemView, recyclerView, textView, textView2, frameLayout, linearLayout);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static l6 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 17010, new Class[]{LayoutInflater.class}, l6.class);
        return patchProxyResultProxy.isSupported ? (l6) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static l6 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 17011, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, l6.class);
        if (patchProxyResultProxy.isSupported) {
            return (l6) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.dialog_select_collection, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f112875a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 17013, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
