package androidx.work.impl.utils;

import androidx.annotation.w0;
import com.umeng.analytics.pro.ak;
import java.time.Duration;
import kotlin.Metadata;

/* JADX INFO: compiled from: DurationApi26.kt */
/* JADX INFO: loaded from: classes6.dex */
@xh.h(name = "DurationApi26Impl")
@w0(26)
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0001¨\u0006\u0003"}, d2 = {"Ljava/time/Duration;", "", ak.av, "work-runtime_release"}, k = 2, mv = {1, 7, 1})
public final class d {
    @androidx.annotation.u
    public static final long a(@dl.d Duration duration) {
        kotlin.jvm.internal.f0.p(duration, "<this>");
        return duration.toMillis();
    }
}
