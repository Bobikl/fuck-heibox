package kotlin.reflect;

import java.util.List;
import kotlin.u0;

/* JADX INFO: compiled from: KTypeParameter.kt */
/* JADX INFO: loaded from: classes5.dex */
@u0(version = "1.1")
public interface s extends g {
    @dl.d
    String getName();

    @dl.d
    List<r> getUpperBounds();

    boolean k();

    @dl.d
    KVariance n();
}
