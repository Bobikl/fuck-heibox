package kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins;

import dl.d;
import java.io.InputStream;
import kotlin.Pair;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import kotlin.reflect.jvm.internal.impl.descriptors.d0;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializedPackageFragmentImpl;
import kotlin.reflect.jvm.internal.impl.storage.m;

/* JADX INFO: compiled from: BuiltInsPackageFragmentImpl.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class b extends DeserializedPackageFragmentImpl implements kotlin.reflect.jvm.internal.impl.builtins.a {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @d
    public static final a f127723p = new a(null);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final boolean f127724o;

    /* JADX INFO: compiled from: BuiltInsPackageFragmentImpl.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }

        @d
        public final b a(@d kotlin.reflect.jvm.internal.impl.name.c fqName, @d m storageManager, @d d0 module, @d InputStream inputStream, boolean z10) {
            f0.p(fqName, "fqName");
            f0.p(storageManager, "storageManager");
            f0.p(module, "module");
            f0.p(inputStream, "inputStream");
            Pair<ProtoBuf.PackageFragment, ni.a> pairA = ni.c.a(inputStream);
            ProtoBuf.PackageFragment packageFragmentA = pairA.a();
            ni.a aVarB = pairA.b();
            if (packageFragmentA != null) {
                return new b(fqName, storageManager, module, packageFragmentA, aVarB, z10, null);
            }
            throw new UnsupportedOperationException("Kotlin built-in definition format version is not supported: expected " + ni.a.f132103h + ", actual " + aVarB + ". Please update Kotlin");
        }
    }

    private b(kotlin.reflect.jvm.internal.impl.name.c cVar, m mVar, d0 d0Var, ProtoBuf.PackageFragment packageFragment, ni.a aVar, boolean z10) {
        super(cVar, mVar, d0Var, packageFragment, aVar, null);
        this.f127724o = z10;
    }

    public /* synthetic */ b(kotlin.reflect.jvm.internal.impl.name.c cVar, m mVar, d0 d0Var, ProtoBuf.PackageFragment packageFragment, ni.a aVar, boolean z10, u uVar) {
        this(cVar, mVar, d0Var, packageFragment, aVar, z10);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.w, kotlin.reflect.jvm.internal.impl.descriptors.impl.i
    @d
    public String toString() {
        return "builtins package fragment for " + e() + " from " + DescriptorUtilsKt.p(this);
    }
}
