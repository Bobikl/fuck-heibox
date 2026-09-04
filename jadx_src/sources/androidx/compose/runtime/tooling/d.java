package androidx.compose.runtime.tooling;

import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import dl.e;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: CompositionData.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u001c\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u000b\u001a\u0004\u0018\u00010\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0012À\u0006\u0003"}, d2 = {"Landroidx/compose/runtime/tooling/d;", "Landroidx/compose/runtime/tooling/b;", "", "getKey", "()Ljava/lang/Object;", "key", "", "g", "()Ljava/lang/String;", "sourceInfo", "e", "node", "", "getData", "()Ljava/lang/Iterable;", "data", RXScreenCaptureService.KEY_HEIGHT, "identity", "runtime_release"}, k = 1, mv = {1, 7, 1})
public interface d extends b {

    /* JADX INFO: compiled from: CompositionData.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class a {
        @e
        @Deprecated
        public static d a(@dl.d d dVar, @dl.d Object identityToFind) {
            f0.p(identityToFind, "identityToFind");
            return androidx.compose.runtime.tooling.a.a(dVar, identityToFind);
        }

        @e
        @Deprecated
        public static Object b(@dl.d d dVar) {
            return c.a(dVar);
        }
    }

    @e
    Object e();

    @e
    String g();

    @dl.d
    Iterable<Object> getData();

    @dl.d
    Object getKey();

    @e
    Object h();
}
