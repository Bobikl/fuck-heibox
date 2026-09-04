package kotlinx.serialization.internal;

import java.util.ArrayList;
import kotlinx.serialization.MissingFieldException;

/* JADX INFO: compiled from: PluginExceptions.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class r1 {
    @kotlinx.serialization.f
    public static final void a(@dl.d int[] seenArray, @dl.d int[] goldenMaskArray, @dl.d kotlinx.serialization.descriptors.f descriptor) {
        kotlin.jvm.internal.f0.p(seenArray, "seenArray");
        kotlin.jvm.internal.f0.p(goldenMaskArray, "goldenMaskArray");
        kotlin.jvm.internal.f0.p(descriptor, "descriptor");
        ArrayList arrayList = new ArrayList();
        int length = goldenMaskArray.length;
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = goldenMaskArray[i10] & (~seenArray[i10]);
            if (i11 != 0) {
                for (int i12 = 0; i12 < 32; i12++) {
                    if ((i11 & 1) != 0) {
                        arrayList.add(descriptor.h((i10 * 32) + i12));
                    }
                    i11 >>>= 1;
                }
            }
        }
        throw new MissingFieldException(arrayList, descriptor.j());
    }

    @kotlinx.serialization.f
    public static final void b(int i10, int i11, @dl.d kotlinx.serialization.descriptors.f descriptor) {
        kotlin.jvm.internal.f0.p(descriptor, "descriptor");
        ArrayList arrayList = new ArrayList();
        int i12 = (~i10) & i11;
        for (int i13 = 0; i13 < 32; i13++) {
            if ((i12 & 1) != 0) {
                arrayList.add(descriptor.h(i13));
            }
            i12 >>>= 1;
        }
        throw new MissingFieldException(arrayList, descriptor.j());
    }
}
