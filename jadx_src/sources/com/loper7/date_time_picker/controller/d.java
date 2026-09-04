package com.loper7.date_time_picker.controller;

import dl.e;
import java.util.List;
import kotlin.Metadata;
import kotlin.b2;
import yh.l;

/* JADX INFO: compiled from: DateTimeInterface.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J$\u0010\r\u001a\u00020\u00042\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\b\b\u0002\u0010\f\u001a\u00020\u000bH&J \u0010\u0010\u001a\u00020\u00042\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000eH&J\b\u0010\u0011\u001a\u00020\u0002H&¨\u0006\u0012"}, d2 = {"Lcom/loper7/date_time_picker/controller/d;", "", "", "time", "Lkotlin/b2;", "setDefaultMillisecond", "setMinMillisecond", "setMaxMillisecond", "", "", "types", "", "wrapSelector", "setWrapSelectorWheel", "Lkotlin/Function1;", "callback", "setOnDateTimeChangedListener", "getMillisecond", "date_time_picker_release"}, k = 1, mv = {1, 5, 1})
public interface d {

    /* JADX INFO: compiled from: DateTimeInterface.kt */
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class a {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void a(d dVar, l lVar, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setOnDateTimeChangedListener");
            }
            if ((i10 & 1) != 0) {
                lVar = null;
            }
            dVar.setOnDateTimeChangedListener(lVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void b(d dVar, List list, boolean z10, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setWrapSelectorWheel");
            }
            if ((i10 & 1) != 0) {
                list = null;
            }
            if ((i10 & 2) != 0) {
                z10 = true;
            }
            dVar.setWrapSelectorWheel(list, z10);
        }
    }

    long getMillisecond();

    void setDefaultMillisecond(long j10);

    void setMaxMillisecond(long j10);

    void setMinMillisecond(long j10);

    void setOnDateTimeChangedListener(@e l<? super Long, b2> lVar);

    void setWrapSelectorWheel(@e List<Integer> list, boolean z10);
}
