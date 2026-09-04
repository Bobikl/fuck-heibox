package com.max.hbcommon.component.picker;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.DatePicker;
import android.widget.FrameLayout;
import android.widget.TimePicker;
import bb.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.util.Calendar;
import kotlin.b2;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import mb.o1;
import xh.i;
import yh.l;

/* JADX INFO: compiled from: CombinedDateTimePicker.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class CombinedDateTimePicker extends FrameLayout {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @d
    private o1 f67812b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @d
    private final Calendar f67813c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @e
    private l<? super Long, b2> f67814d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @i
    public CombinedDateTimePicker(@d Context context) {
        this(context, null, 0, 6, null);
        f0.p(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @i
    public CombinedDateTimePicker(@d Context context, @e AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        f0.p(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @i
    public CombinedDateTimePicker(@d Context context, @e AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        f0.p(context, "context");
        Calendar calendar = Calendar.getInstance();
        f0.o(calendar, "getInstance(...)");
        this.f67813c = calendar;
        o1 o1VarD = o1.d(LayoutInflater.from(context), this, true);
        f0.o(o1VarD, "inflate(...)");
        this.f67812b = o1VarD;
        c();
        e();
    }

    public /* synthetic */ CombinedDateTimePicker(Context context, AttributeSet attributeSet, int i10, int i11, u uVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    private final void c() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.e.f31830i1, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f67812b.f131689b.init(this.f67813c.get(1), this.f67813c.get(2), this.f67813c.get(5), new DatePicker.OnDateChangedListener() { // from class: com.max.hbcommon.component.picker.b
            @Override // android.widget.DatePicker.OnDateChangedListener
            public final void onDateChanged(DatePicker datePicker, int i10, int i11, int i12) {
                CombinedDateTimePicker.d(this.f67819b, datePicker, i10, i11, i12);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(CombinedDateTimePicker this$0, DatePicker datePicker, int i10, int i11, int i12) {
        Object[] objArr = {this$0, datePicker, new Integer(i10), new Integer(i11), new Integer(i12)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, c.e.f31948p1, new Class[]{CombinedDateTimePicker.class, DatePicker.class, cls, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(this$0, "this$0");
        this$0.f67813c.set(1, i10);
        this$0.f67813c.set(2, i11);
        this$0.f67813c.set(5, i12);
        l<? super Long, b2> lVar = this$0.f67814d;
        if (lVar != null) {
            lVar.invoke(Long.valueOf(this$0.f67813c.getTimeInMillis()));
        }
    }

    private final void e() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.e.f31846j1, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        TimePicker timePicker = this.f67812b.f131690c;
        timePicker.setIs24HourView(Boolean.TRUE);
        timePicker.setHour(this.f67813c.get(11));
        timePicker.setMinute(this.f67813c.get(12));
        timePicker.setOnTimeChangedListener(new TimePicker.OnTimeChangedListener() { // from class: com.max.hbcommon.component.picker.a
            @Override // android.widget.TimePicker.OnTimeChangedListener
            public final void onTimeChanged(TimePicker timePicker2, int i10, int i11) {
                CombinedDateTimePicker.f(this.f67818b, timePicker2, i10, i11);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(CombinedDateTimePicker this$0, TimePicker timePicker, int i10, int i11) {
        Object[] objArr = {this$0, timePicker, new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, c.e.f31965q1, new Class[]{CombinedDateTimePicker.class, TimePicker.class, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(this$0, "this$0");
        this$0.f67813c.set(11, i10);
        this$0.f67813c.set(12, i11);
        l<? super Long, b2> lVar = this$0.f67814d;
        if (lVar != null) {
            lVar.invoke(Long.valueOf(this$0.f67813c.getTimeInMillis()));
        }
    }

    private final void g() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.e.f31863k1, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        o1 o1Var = this.f67812b;
        o1Var.f131689b.updateDate(this.f67813c.get(1), this.f67813c.get(2), this.f67813c.get(5));
        o1Var.f131690c.setHour(this.f67813c.get(11));
        o1Var.f131690c.setMinute(this.f67813c.get(12));
    }

    public final long getTimestampMs() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.e.f31897m1, new Class[0], Long.TYPE);
        return patchProxyResultProxy.isSupported ? ((Long) patchProxyResultProxy.result).longValue() : this.f67813c.getTimeInMillis();
    }

    public final void setOnTimestampChangeListener(@d l<? super Long, b2> listener) {
        if (PatchProxy.proxy(new Object[]{listener}, this, changeQuickRedirect, false, c.e.f31914n1, new Class[]{l.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(listener, "listener");
        this.f67814d = listener;
    }

    public final void setTimestampMs(long j10) {
        if (PatchProxy.proxy(new Object[]{new Long(j10)}, this, changeQuickRedirect, false, c.e.f31880l1, new Class[]{Long.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f67813c.setTimeInMillis(j10);
        g();
    }

    public final void setTimestampRange(long j10, long j11) {
        Object[] objArr = {new Long(j10), new Long(j11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Long.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, c.e.f31931o1, new Class[]{cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        this.f67812b.f131689b.setMinDate(j10);
        this.f67812b.f131689b.setMaxDate(j11);
    }
}
