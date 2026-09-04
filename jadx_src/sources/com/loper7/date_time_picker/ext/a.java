package com.loper7.date_time_picker.ext;

import com.lzy.okgo.model.Progress;
import com.umeng.analytics.pro.ak;
import dl.d;
import dl.e;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: ListExt.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0010!\n\u0002\u0010\t\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u001a\"\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0000*\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0000\u001a\u001a\u0010\u0007\u001a\u00020\u0006*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0005\u001a\u00020\u0001H\u0000\u001a)\u0010\t\u001a\u00020\b*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00000\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0001H\u0000¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"", "", "", "format", ak.aF, Progress.L, "", ak.av, "", "b", "(Ljava/util/List;Ljava/lang/Long;)I", "date_time_picker_release"}, k = 2, mv = {1, 5, 1})
public final class a {
    public static final boolean a(@d List<Long> list, long j10) {
        f0.p(list, "<this>");
        Iterator<Long> it = list.iterator();
        while (it.hasNext()) {
            long jLongValue = it.next().longValue();
            fa.a aVar = fa.a.f118821a;
            if (f0.g(aVar.b(jLongValue, "yyyyMMdd"), aVar.b(j10, "yyyyMMdd"))) {
                return true;
            }
        }
        return false;
    }

    public static final int b(@d List<List<Long>> list, @e Long l10) {
        f0.p(list, "<this>");
        if (list.isEmpty() || l10 == null) {
            return -1;
        }
        if (l10.longValue() == 0) {
            l10 = Long.valueOf(Calendar.getInstance().getTimeInMillis());
        }
        int size = list.size();
        if (size > 0) {
            int i10 = 0;
            while (true) {
                int i11 = i10 + 1;
                if (a(list.get(i10), l10.longValue())) {
                    return i10;
                }
                if (i11 < size) {
                    i10 = i11;
                }
            }
        }
        return 0;
    }

    @d
    public static final List<String> c(@d List<Long> list, @d String format) {
        f0.p(list, "<this>");
        f0.p(format, "format");
        ArrayList arrayList = new ArrayList();
        Iterator<Long> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(fa.a.f118821a.b(it.next().longValue(), format));
        }
        return arrayList;
    }

    public static /* synthetic */ List d(List list, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = "yyyy-MM-dd";
        }
        return c(list, str);
    }
}
