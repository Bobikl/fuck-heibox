package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.max.hbcommon.component.bottombutton.BottomButtonLeftItemView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: DialogManageFavourContentAndFolderBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class x5 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f117382a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final BottomButtonLeftItemView f117383b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f117384c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f117385d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117386e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117387f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117388g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final FrameLayout f117389h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f117390i;

    private x5(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 BottomButtonLeftItemView bottomButtonLeftItemView, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 LinearLayout linearLayout2, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 FrameLayout frameLayout, @androidx.annotation.n0 LinearLayout linearLayout3) {
        this.f117382a = relativeLayout;
        this.f117383b = bottomButtonLeftItemView;
        this.f117384c = linearLayout;
        this.f117385d = linearLayout2;
        this.f117386e = textView;
        this.f117387f = textView2;
        this.f117388g = textView3;
        this.f117389h = frameLayout;
        this.f117390i = linearLayout3;
    }

    @androidx.annotation.n0
    public static x5 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 16956, new Class[]{View.class}, x5.class);
        if (patchProxyResultProxy.isSupported) {
            return (x5) patchProxyResultProxy.result;
        }
        int i10 = R.id.bottom_button;
        BottomButtonLeftItemView bottomButtonLeftItemView = (BottomButtonLeftItemView) l3.d.a(view, R.id.bottom_button);
        if (bottomButtonLeftItemView != null) {
            i10 = R.id.ll_manage_favour_content;
            LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.ll_manage_favour_content);
            if (linearLayout != null) {
                i10 = R.id.ll_manage_favour_folder;
                LinearLayout linearLayout2 = (LinearLayout) l3.d.a(view, R.id.ll_manage_favour_folder);
                if (linearLayout2 != null) {
                    i10 = R.id.tv_delete_content_w500;
                    TextView textView = (TextView) l3.d.a(view, R.id.tv_delete_content_w500);
                    if (textView != null) {
                        i10 = R.id.tv_move_content_w500;
                        TextView textView2 = (TextView) l3.d.a(view, R.id.tv_move_content_w500);
                        if (textView2 != null) {
                            i10 = R.id.tv_title;
                            TextView textView3 = (TextView) l3.d.a(view, R.id.tv_title);
                            if (textView3 != null) {
                                i10 = R.id.v_blank;
                                FrameLayout frameLayout = (FrameLayout) l3.d.a(view, R.id.v_blank);
                                if (frameLayout != null) {
                                    i10 = R.id.vg_dialog;
                                    LinearLayout linearLayout3 = (LinearLayout) l3.d.a(view, R.id.vg_dialog);
                                    if (linearLayout3 != null) {
                                        return new x5((RelativeLayout) view, bottomButtonLeftItemView, linearLayout, linearLayout2, textView, textView2, textView3, frameLayout, linearLayout3);
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
    public static x5 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 16954, new Class[]{LayoutInflater.class}, x5.class);
        return patchProxyResultProxy.isSupported ? (x5) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static x5 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 16955, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, x5.class);
        if (patchProxyResultProxy.isSupported) {
            return (x5) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.dialog_manage_favour_content_and_folder, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f117382a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16957, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
