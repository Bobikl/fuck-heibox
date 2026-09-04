package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemGameRollRoomListHeaderBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class an implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f108593a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final EditText f108594b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f108595c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f108596d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f108597e;

    private an(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 EditText editText, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 RelativeLayout relativeLayout) {
        this.f108593a = linearLayout;
        this.f108594b = editText;
        this.f108595c = textView;
        this.f108596d = textView2;
        this.f108597e = relativeLayout;
    }

    @androidx.annotation.n0
    public static an a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 18732, new Class[]{View.class}, an.class);
        if (patchProxyResultProxy.isSupported) {
            return (an) patchProxyResultProxy.result;
        }
        int i10 = R.id.et_search_roll_room;
        EditText editText = (EditText) l3.d.a(view, R.id.et_search_roll_room);
        if (editText != null) {
            i10 = R.id.tv_create_roll_room;
            TextView textView = (TextView) l3.d.a(view, R.id.tv_create_roll_room);
            if (textView != null) {
                i10 = R.id.tv_my_roll_room;
                TextView textView2 = (TextView) l3.d.a(view, R.id.tv_my_roll_room);
                if (textView2 != null) {
                    i10 = R.id.vg_search_roll_room;
                    RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, R.id.vg_search_roll_room);
                    if (relativeLayout != null) {
                        return new an((LinearLayout) view, editText, textView, textView2, relativeLayout);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static an c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 18730, new Class[]{LayoutInflater.class}, an.class);
        return patchProxyResultProxy.isSupported ? (an) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static an d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 18731, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, an.class);
        if (patchProxyResultProxy.isSupported) {
            return (an) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_game_roll_room_list_header, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f108593a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 18733, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
