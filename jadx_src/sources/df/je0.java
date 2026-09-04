package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ViewApexLogsCardBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class je0 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final CardView f112161a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112162b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final cd f112163c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final cd f112164d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final cd f112165e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final cd f112166f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final cd f112167g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final qu f112168h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final i20 f112169i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f112170j;

    private je0(@androidx.annotation.n0 CardView cardView, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 cd cdVar, @androidx.annotation.n0 cd cdVar2, @androidx.annotation.n0 cd cdVar3, @androidx.annotation.n0 cd cdVar4, @androidx.annotation.n0 cd cdVar5, @androidx.annotation.n0 qu quVar, @androidx.annotation.n0 i20 i20Var, @androidx.annotation.n0 RelativeLayout relativeLayout) {
        this.f112161a = cardView;
        this.f112162b = textView;
        this.f112163c = cdVar;
        this.f112164d = cdVar2;
        this.f112165e = cdVar3;
        this.f112166f = cdVar4;
        this.f112167g = cdVar5;
        this.f112168h = quVar;
        this.f112169i = i20Var;
        this.f112170j = relativeLayout;
    }

    @androidx.annotation.n0
    public static je0 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 21556, new Class[]{View.class}, je0.class);
        if (patchProxyResultProxy.isSupported) {
            return (je0) patchProxyResultProxy.result;
        }
        int i10 = R.id.tv_matches_card_no_data;
        TextView textView = (TextView) l3.d.a(view, R.id.tv_matches_card_no_data);
        if (textView != null) {
            i10 = R.id.vg_card_item_0;
            View viewA = l3.d.a(view, R.id.vg_card_item_0);
            if (viewA != null) {
                cd cdVarA = cd.a(viewA);
                i10 = R.id.vg_card_item_1;
                View viewA2 = l3.d.a(view, R.id.vg_card_item_1);
                if (viewA2 != null) {
                    cd cdVarA2 = cd.a(viewA2);
                    i10 = R.id.vg_card_item_2;
                    View viewA3 = l3.d.a(view, R.id.vg_card_item_2);
                    if (viewA3 != null) {
                        cd cdVarA3 = cd.a(viewA3);
                        i10 = R.id.vg_card_item_3;
                        View viewA4 = l3.d.a(view, R.id.vg_card_item_3);
                        if (viewA4 != null) {
                            cd cdVarA4 = cd.a(viewA4);
                            i10 = R.id.vg_card_item_4;
                            View viewA5 = l3.d.a(view, R.id.vg_card_item_4);
                            if (viewA5 != null) {
                                cd cdVarA5 = cd.a(viewA5);
                                i10 = R.id.vg_card_title;
                                View viewA6 = l3.d.a(view, R.id.vg_card_title);
                                if (viewA6 != null) {
                                    qu quVarA = qu.a(viewA6);
                                    i10 = R.id.vg_matches_card_layout_all_bottom;
                                    View viewA7 = l3.d.a(view, R.id.vg_matches_card_layout_all_bottom);
                                    if (viewA7 != null) {
                                        i20 i20VarA = i20.a(viewA7);
                                        i10 = R.id.vg_matches_card_no_data;
                                        RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, R.id.vg_matches_card_no_data);
                                        if (relativeLayout != null) {
                                            return new je0((CardView) view, textView, cdVarA, cdVarA2, cdVarA3, cdVarA4, cdVarA5, quVarA, i20VarA, relativeLayout);
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
    public static je0 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 21554, new Class[]{LayoutInflater.class}, je0.class);
        return patchProxyResultProxy.isSupported ? (je0) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static je0 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 21555, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, je0.class);
        if (patchProxyResultProxy.isSupported) {
            return (je0) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.view_apex_logs_card, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public CardView b() {
        return this.f112161a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 21557, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
