package com.loper7.date_time_picker.controller;

import com.loper7.date_time_picker.ext.CalendarExtKt;
import com.loper7.date_time_picker.number_picker.NumberPicker;
import com.umeng.analytics.pro.ak;
import dl.e;
import java.util.Calendar;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: BaseDateTimeController.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&J\u0010\u0010\b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0002H&J\b\u0010\t\u001a\u00020\u0000H&J#\u0010\f\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0004¢\u0006\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/loper7/date_time_picker/controller/a;", "Lcom/loper7/date_time_picker/controller/d;", "", "type", "Lcom/loper7/date_time_picker/number_picker/NumberPicker;", "picker", "b", "global", ak.av, ak.aF, "year", "month", "d", "(Ljava/lang/Integer;Ljava/lang/Integer;)I", "<init>", "()V", "date_time_picker_release"}, k = 1, mv = {1, 5, 1})
public abstract class a implements d {
    @dl.d
    public abstract a a(int global);

    @dl.d
    public abstract a b(int type, @e NumberPicker picker);

    @dl.d
    public abstract a c();

    protected final int d(@e Integer year, @e Integer month) {
        if (year != null && month != null && year.intValue() > 0 && month.intValue() >= 0) {
            try {
                Calendar calendar = Calendar.getInstance();
                f0.o(calendar, "getInstance()");
                calendar.clear();
                calendar.set(1, year.intValue());
                calendar.set(2, month.intValue());
                return CalendarExtKt.d(calendar);
            } catch (Exception unused) {
            }
        }
        return 0;
    }
}
