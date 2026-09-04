package dj;

import dl.d;
import kotlin.jvm.internal.f0;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import kotlinx.serialization.descriptors.e;
import kotlinx.serialization.descriptors.f;
import kotlinx.serialization.encoding.h;
import kotlinx.serialization.g;

/* JADX INFO: compiled from: LongAsStringSerializer.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class b implements g<Long> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @d
    public static final b f118526a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @d
    private static final f f118527b = SerialDescriptorsKt.a("kotlinx.serialization.LongAsStringSerializer", e.i.f130582a);

    private b() {
    }

    @Override // kotlinx.serialization.g, kotlinx.serialization.r, kotlinx.serialization.c
    @d
    public f a() {
        return f118527b;
    }

    @Override // kotlinx.serialization.r
    public /* bridge */ /* synthetic */ void b(h hVar, Object obj) {
        g(hVar, ((Number) obj).longValue());
    }

    @Override // kotlinx.serialization.c
    @d
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public Long d(@d kotlinx.serialization.encoding.f decoder) {
        f0.p(decoder, "decoder");
        return Long.valueOf(Long.parseLong(decoder.p()));
    }

    public void g(@d h encoder, long j10) {
        f0.p(encoder, "encoder");
        encoder.t(String.valueOf(j10));
    }
}
