package mb;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import com.loper7.date_time_picker.DateTimePicker;
import com.max.hbcommon.R;
import com.max.hbcommon.component.bottombutton.BottomButtonLeftItemView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ViewHbWrappedDateTimePickerBinding.java */
/* JADX INFO: loaded from: classes9.dex */
public final class r1 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f131729a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final BottomButtonLeftItemView f131730b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final Space f131731c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final DateTimePicker f131732d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f131733e;

    private r1(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 BottomButtonLeftItemView bottomButtonLeftItemView, @androidx.annotation.n0 Space space, @androidx.annotation.n0 DateTimePicker dateTimePicker, @androidx.annotation.n0 TextView textView) {
        this.f131729a = linearLayout;
        this.f131730b = bottomButtonLeftItemView;
        this.f131731c = space;
        this.f131732d = dateTimePicker;
        this.f131733e = textView;
    }

    @androidx.annotation.n0
    public static r1 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, bb.c.e.La, new Class[]{View.class}, r1.class);
        if (patchProxyResultProxy.isSupported) {
            return (r1) patchProxyResultProxy.result;
        }
        int i10 = R.id.bottom_button;
        BottomButtonLeftItemView bottomButtonLeftItemView = (BottomButtonLeftItemView) l3.d.a(view, i10);
        if (bottomButtonLeftItemView != null) {
            i10 = R.id.bottom_safe_space;
            Space space = (Space) l3.d.a(view, i10);
            if (space != null) {
                i10 = R.id.picker;
                DateTimePicker dateTimePicker = (DateTimePicker) l3.d.a(view, i10);
                if (dateTimePicker != null) {
                    i10 = R.id.tv_title;
                    TextView textView = (TextView) l3.d.a(view, i10);
                    if (textView != null) {
                        return new r1((LinearLayout) view, bottomButtonLeftItemView, space, dateTimePicker, textView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static r1 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, bb.c.e.Ja, new Class[]{LayoutInflater.class}, r1.class);
        return patchProxyResultProxy.isSupported ? (r1) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static r1 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, bb.c.e.Ka, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, r1.class);
        if (patchProxyResultProxy.isSupported) {
            return (r1) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.view_hb_wrapped_date_time_picker, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f131729a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.e.Ma, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
