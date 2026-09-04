package xi;

import java.time.Duration;
import kotlin.e2;
import kotlin.jvm.internal.f0;
import kotlin.time.DurationUnit;
import kotlin.time.e;
import kotlin.time.g;
import kotlin.time.k;
import kotlin.u0;
import org.apache.tools.ant.util.s0;
import sh.f;
import xh.h;

/* JADX INFO: compiled from: DurationConversions.kt */
/* JADX INFO: loaded from: classes5.dex */
@h(name = "DurationConversionsJDK8Kt")
public final class a {
    @u0(version = s0.f136930u)
    @e2(markerClass = {k.class})
    @f
    private static final Duration a(long j10) {
        Duration durationOfSeconds = Duration.ofSeconds(e.U(j10), e.Y(j10));
        f0.o(durationOfSeconds, "toJavaDuration-LRDsOJo");
        return durationOfSeconds;
    }

    @u0(version = s0.f136930u)
    @e2(markerClass = {k.class})
    @f
    private static final long b(Duration duration) {
        f0.p(duration, "<this>");
        return e.m0(g.n0(duration.getSeconds(), DurationUnit.SECONDS), g.m0(duration.getNano(), DurationUnit.NANOSECONDS));
    }
}
