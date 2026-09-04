package androidx.activity.result;

import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: PickVisualMediaRequest.kt */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private z.b.j.f f1545a = z.b.j.C1285b.f141817a;

    /* JADX INFO: compiled from: PickVisualMediaRequest.kt */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @dl.d
        private z.b.j.f f1546a = z.b.j.C1285b.f141817a;

        @dl.d
        public final j a() {
            j jVar = new j();
            jVar.b(this.f1546a);
            return jVar;
        }

        @dl.d
        public final a b(@dl.d z.b.j.f mediaType) {
            f0.p(mediaType, "mediaType");
            this.f1546a = mediaType;
            return this;
        }
    }

    @dl.d
    public final z.b.j.f a() {
        return this.f1545a;
    }

    public final void b(@dl.d z.b.j.f fVar) {
        f0.p(fVar, "<set-?>");
        this.f1545a = fVar;
    }
}
