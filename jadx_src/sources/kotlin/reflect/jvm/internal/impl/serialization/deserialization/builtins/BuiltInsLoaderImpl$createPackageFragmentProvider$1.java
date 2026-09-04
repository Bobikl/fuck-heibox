package kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins;

import dl.d;
import dl.e;
import java.io.InputStream;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.n0;
import kotlin.reflect.h;
import yh.l;

/* JADX INFO: compiled from: BuiltInsLoaderImpl.kt */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class BuiltInsLoaderImpl$createPackageFragmentProvider$1 extends FunctionReference implements l<String, InputStream> {
    BuiltInsLoaderImpl$createPackageFragmentProvider$1(Object obj) {
        super(1, obj);
    }

    @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.c
    @d
    public final String getName() {
        return "loadResource";
    }

    @Override // kotlin.jvm.internal.CallableReference
    @d
    public final h getOwner() {
        return n0.d(c.class);
    }

    @Override // kotlin.jvm.internal.CallableReference
    @d
    public final String getSignature() {
        return "loadResource(Ljava/lang/String;)Ljava/io/InputStream;";
    }

    @Override // yh.l
    @e
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public final InputStream invoke(@d String p10) {
        f0.p(p10, "p0");
        return ((c) this.receiver).a(p10);
    }
}
