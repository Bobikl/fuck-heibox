package kotlin.time;

import java.util.concurrent.TimeUnit;
import kotlin.e2;
import kotlin.u0;
import org.apache.tools.ant.util.s0;

/* JADX INFO: compiled from: DurationUnitJvm.kt */
/* JADX INFO: loaded from: classes5.dex */
@u0(version = s0.f136930u)
@e2(markerClass = {k.class})
public enum DurationUnit {
    NANOSECONDS(TimeUnit.NANOSECONDS),
    MICROSECONDS(TimeUnit.MICROSECONDS),
    MILLISECONDS(TimeUnit.MILLISECONDS),
    SECONDS(TimeUnit.SECONDS),
    MINUTES(TimeUnit.MINUTES),
    HOURS(TimeUnit.HOURS),
    DAYS(TimeUnit.DAYS);


    @dl.d
    private final TimeUnit timeUnit;

    DurationUnit(TimeUnit timeUnit) {
        this.timeUnit = timeUnit;
    }

    @dl.d
    public final TimeUnit getTimeUnit$kotlin_stdlib() {
        return this.timeUnit;
    }
}
