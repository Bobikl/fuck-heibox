package androidx.activity.result;

import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: PickVisualMediaRequest.kt */
/* JADX INFO: loaded from: classes.dex */
public final class k {
    @dl.d
    public static final j a(@dl.d z.b.j.f mediaType) {
        f0.p(mediaType, "mediaType");
        return new j.a().b(mediaType).a();
    }

    public static /* synthetic */ j b(z.b.j.f fVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            fVar = z.b.j.C1285b.f141817a;
        }
        return a(fVar);
    }
}
