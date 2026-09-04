package mb;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.DatePicker;
import android.widget.TimePicker;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.max.hbcommon.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ViewCombinedDateTimePickerBinding.java */
/* JADX INFO: loaded from: classes9.dex */
public final class o1 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final ConstraintLayout f131688a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final DatePicker f131689b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final TimePicker f131690c;

    private o1(@androidx.annotation.n0 ConstraintLayout constraintLayout, @androidx.annotation.n0 DatePicker datePicker, @androidx.annotation.n0 TimePicker timePicker) {
        this.f131688a = constraintLayout;
        this.f131689b = datePicker;
        this.f131690c = timePicker;
    }

    @androidx.annotation.n0
    public static o1 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, bb.c.e.f32127za, new Class[]{View.class}, o1.class);
        if (patchProxyResultProxy.isSupported) {
            return (o1) patchProxyResultProxy.result;
        }
        int i10 = R.id.data_picker;
        DatePicker datePicker = (DatePicker) l3.d.a(view, i10);
        if (datePicker != null) {
            i10 = R.id.time_picker;
            TimePicker timePicker = (TimePicker) l3.d.a(view, i10);
            if (timePicker != null) {
                return new o1((ConstraintLayout) view, datePicker, timePicker);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static o1 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, bb.c.e.f32093xa, new Class[]{LayoutInflater.class}, o1.class);
        return patchProxyResultProxy.isSupported ? (o1) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static o1 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, bb.c.e.f32110ya, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, o1.class);
        if (patchProxyResultProxy.isSupported) {
            return (o1) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.view_combined_date_time_picker, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public ConstraintLayout b() {
        return this.f131688a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.e.Aa, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
