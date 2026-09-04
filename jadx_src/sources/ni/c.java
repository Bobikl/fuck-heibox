package ni;

import dl.d;
import java.io.InputStream;
import kotlin.Pair;
import kotlin.c1;
import kotlin.jvm.internal.f0;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.protobuf.f;

/* JADX INFO: compiled from: readPackageFragment.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class c {
    @d
    public static final Pair<ProtoBuf.PackageFragment, a> a(@d InputStream inputStream) {
        ProtoBuf.PackageFragment packageFragmentX;
        f0.p(inputStream, "<this>");
        try {
            a aVarA = a.f132102g.a(inputStream);
            if (aVarA.h()) {
                f fVarD = f.d();
                b.a(fVarD);
                packageFragmentX = ProtoBuf.PackageFragment.X(inputStream, fVarD);
            } else {
                packageFragmentX = null;
            }
            Pair<ProtoBuf.PackageFragment, a> pairA = c1.a(packageFragmentX, aVarA);
            kotlin.io.b.a(inputStream, null);
            return pairA;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                kotlin.io.b.a(inputStream, th2);
                throw th3;
            }
        }
    }
}
