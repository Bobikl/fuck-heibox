package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.DatePicker;
import android.widget.TimePicker;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: DialogDateTimePickerBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class w4 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final ConstraintLayout f117022a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final DatePicker f117023b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final TimePicker f117024c;

    private w4(@androidx.annotation.n0 ConstraintLayout constraintLayout, @androidx.annotation.n0 DatePicker datePicker, @androidx.annotation.n0 TimePicker timePicker) {
        this.f117022a = constraintLayout;
        this.f117023b = datePicker;
        this.f117024c = timePicker;
    }

    @androidx.annotation.n0
    public static w4 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 16848, new Class[]{View.class}, w4.class);
        if (patchProxyResultProxy.isSupported) {
            return (w4) patchProxyResultProxy.result;
        }
        int i10 = R.id.dp_date;
        DatePicker datePicker = (DatePicker) l3.d.a(view, R.id.dp_date);
        if (datePicker != null) {
            i10 = R.id.tp_time;
            TimePicker timePicker = (TimePicker) l3.d.a(view, R.id.tp_time);
            if (timePicker != null) {
                return new w4((ConstraintLayout) view, datePicker, timePicker);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static w4 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 16846, new Class[]{LayoutInflater.class}, w4.class);
        return patchProxyResultProxy.isSupported ? (w4) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static w4 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 16847, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, w4.class);
        if (patchProxyResultProxy.isSupported) {
            return (w4) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.dialog_date_time_picker, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public ConstraintLayout b() {
        return this.f117022a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16849, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
