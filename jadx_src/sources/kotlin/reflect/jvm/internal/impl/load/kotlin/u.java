package kotlin.reflect.jvm.internal.impl.load.kotlin;

import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: PackagePartProvider.kt */
/* JADX INFO: loaded from: classes5.dex */
public interface u {

    /* JADX INFO: compiled from: PackagePartProvider.kt */
    public static final class a implements u {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @dl.d
        public static final a f126560a = new a();

        private a() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.u
        @dl.d
        public List<String> a(@dl.d String packageFqName) {
            f0.p(packageFqName, "packageFqName");
            return CollectionsKt__CollectionsKt.E();
        }
    }

    @dl.d
    List<String> a(@dl.d String str);
}
