package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.Arrays;
import java.util.Set;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: JavaClassFinder.kt */
/* JADX INFO: loaded from: classes5.dex */
public interface j {

    /* JADX INFO: compiled from: JavaClassFinder.kt */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @dl.d
        private final kotlin.reflect.jvm.internal.impl.name.b f126056a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @dl.e
        private final byte[] f126057b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @dl.e
        private final mi.g f126058c;

        public a(@dl.d kotlin.reflect.jvm.internal.impl.name.b classId, @dl.e byte[] bArr, @dl.e mi.g gVar) {
            f0.p(classId, "classId");
            this.f126056a = classId;
            this.f126057b = bArr;
            this.f126058c = gVar;
        }

        public /* synthetic */ a(kotlin.reflect.jvm.internal.impl.name.b bVar, byte[] bArr, mi.g gVar, int i10, kotlin.jvm.internal.u uVar) {
            this(bVar, (i10 & 2) != 0 ? null : bArr, (i10 & 4) != 0 ? null : gVar);
        }

        @dl.d
        public final kotlin.reflect.jvm.internal.impl.name.b a() {
            return this.f126056a;
        }

        public boolean equals(@dl.e Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return f0.g(this.f126056a, aVar.f126056a) && f0.g(this.f126057b, aVar.f126057b) && f0.g(this.f126058c, aVar.f126058c);
        }

        public int hashCode() {
            int iHashCode = this.f126056a.hashCode() * 31;
            byte[] bArr = this.f126057b;
            int iHashCode2 = (iHashCode + (bArr == null ? 0 : Arrays.hashCode(bArr))) * 31;
            mi.g gVar = this.f126058c;
            return iHashCode2 + (gVar != null ? gVar.hashCode() : 0);
        }

        @dl.d
        public String toString() {
            return "Request(classId=" + this.f126056a + ", previouslyFoundClassFileContent=" + Arrays.toString(this.f126057b) + ", outerClass=" + this.f126058c + ')';
        }
    }

    @dl.e
    Set<String> a(@dl.d kotlin.reflect.jvm.internal.impl.name.c cVar);

    @dl.e
    mi.g b(@dl.d a aVar);

    @dl.e
    mi.u c(@dl.d kotlin.reflect.jvm.internal.impl.name.c cVar, boolean z10);
}
