package kotlin.reflect.jvm.internal;

import java.io.IOException;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.f0;
import kotlin.reflect.KParameter;
import kotlin.reflect.jvm.internal.impl.descriptors.b1;
import kotlin.reflect.jvm.internal.impl.descriptors.o0;
import kotlin.reflect.jvm.internal.impl.descriptors.r0;
import kotlin.reflect.jvm.internal.impl.descriptors.w;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import kotlin.reflect.jvm.internal.impl.types.d0;

/* JADX INFO: compiled from: ReflectionObjectRenderer.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class ReflectionObjectRenderer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final ReflectionObjectRenderer f125266a = new ReflectionObjectRenderer();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private static final DescriptorRenderer f125267b = DescriptorRenderer.f127417g;

    /* JADX INFO: compiled from: ReflectionObjectRenderer.kt */
    public final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f125268a;

        static {
            int[] iArr = new int[KParameter.Kind.values().length];
            try {
                iArr[KParameter.Kind.EXTENSION_RECEIVER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[KParameter.Kind.INSTANCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[KParameter.Kind.VALUE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f125268a = iArr;
        }
    }

    private ReflectionObjectRenderer() {
    }

    private final void a(StringBuilder sb2, r0 r0Var) {
        if (r0Var != null) {
            d0 type = r0Var.getType();
            f0.o(type, "receiver.type");
            sb2.append(h(type));
            sb2.append(".");
        }
    }

    private final void b(StringBuilder sb2, kotlin.reflect.jvm.internal.impl.descriptors.a aVar) {
        r0 r0VarI = s.i(aVar);
        r0 r0VarL0 = aVar.l0();
        a(sb2, r0VarI);
        boolean z10 = (r0VarI == null || r0VarL0 == null) ? false : true;
        if (z10) {
            sb2.append("(");
        }
        a(sb2, r0VarL0);
        if (z10) {
            sb2.append(")");
        }
    }

    private final String c(kotlin.reflect.jvm.internal.impl.descriptors.a aVar) {
        if (aVar instanceof o0) {
            return g((o0) aVar);
        }
        if (aVar instanceof w) {
            return d((w) aVar);
        }
        throw new IllegalStateException(("Illegal callable: " + aVar).toString());
    }

    @dl.d
    public final String d(@dl.d w descriptor) throws IOException {
        f0.p(descriptor, "descriptor");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("fun ");
        ReflectionObjectRenderer reflectionObjectRenderer = f125266a;
        reflectionObjectRenderer.b(sb2, descriptor);
        DescriptorRenderer descriptorRenderer = f125267b;
        kotlin.reflect.jvm.internal.impl.name.f name = descriptor.getName();
        f0.o(name, "descriptor.name");
        sb2.append(descriptorRenderer.x(name, true));
        List<b1> listI = descriptor.i();
        f0.o(listI, "descriptor.valueParameters");
        CollectionsKt___CollectionsKt.e3(listI, sb2, (112 & 2) != 0 ? ", " : ", ", (112 & 4) != 0 ? "" : "(", (112 & 8) == 0 ? ")" : "", (112 & 16) != 0 ? -1 : 0, (112 & 32) != 0 ? "..." : null, (112 & 64) != 0 ? null : new yh.l<b1, CharSequence>() { // from class: kotlin.reflect.jvm.internal.ReflectionObjectRenderer$renderFunction$1$1
            @Override // yh.l
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final CharSequence invoke(b1 b1Var) {
                ReflectionObjectRenderer reflectionObjectRenderer2 = ReflectionObjectRenderer.f125266a;
                d0 type = b1Var.getType();
                f0.o(type, "it.type");
                return reflectionObjectRenderer2.h(type);
            }
        });
        sb2.append(": ");
        d0 returnType = descriptor.getReturnType();
        f0.m(returnType);
        sb2.append(reflectionObjectRenderer.h(returnType));
        String string = sb2.toString();
        f0.o(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    @dl.d
    public final String e(@dl.d w invoke) throws IOException {
        f0.p(invoke, "invoke");
        StringBuilder sb2 = new StringBuilder();
        ReflectionObjectRenderer reflectionObjectRenderer = f125266a;
        reflectionObjectRenderer.b(sb2, invoke);
        List<b1> listI = invoke.i();
        f0.o(listI, "invoke.valueParameters");
        CollectionsKt___CollectionsKt.e3(listI, sb2, (112 & 2) != 0 ? ", " : ", ", (112 & 4) != 0 ? "" : "(", (112 & 8) == 0 ? ")" : "", (112 & 16) != 0 ? -1 : 0, (112 & 32) != 0 ? "..." : null, (112 & 64) != 0 ? null : new yh.l<b1, CharSequence>() { // from class: kotlin.reflect.jvm.internal.ReflectionObjectRenderer$renderLambda$1$1
            @Override // yh.l
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final CharSequence invoke(b1 b1Var) {
                ReflectionObjectRenderer reflectionObjectRenderer2 = ReflectionObjectRenderer.f125266a;
                d0 type = b1Var.getType();
                f0.o(type, "it.type");
                return reflectionObjectRenderer2.h(type);
            }
        });
        sb2.append(" -> ");
        d0 returnType = invoke.getReturnType();
        f0.m(returnType);
        sb2.append(reflectionObjectRenderer.h(returnType));
        String string = sb2.toString();
        f0.o(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    @dl.d
    public final String f(@dl.d KParameterImpl parameter) {
        f0.p(parameter, "parameter");
        StringBuilder sb2 = new StringBuilder();
        int i10 = a.f125268a[parameter.b().ordinal()];
        if (i10 == 1) {
            sb2.append("extension receiver parameter");
        } else if (i10 == 2) {
            sb2.append("instance parameter");
        } else if (i10 == 3) {
            sb2.append("parameter #" + parameter.getIndex() + ' ' + parameter.getName());
        }
        sb2.append(" of ");
        sb2.append(f125266a.c(parameter.i().L()));
        String string = sb2.toString();
        f0.o(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    @dl.d
    public final String g(@dl.d o0 descriptor) {
        f0.p(descriptor, "descriptor");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(descriptor.G() ? "var " : "val ");
        ReflectionObjectRenderer reflectionObjectRenderer = f125266a;
        reflectionObjectRenderer.b(sb2, descriptor);
        DescriptorRenderer descriptorRenderer = f125267b;
        kotlin.reflect.jvm.internal.impl.name.f name = descriptor.getName();
        f0.o(name, "descriptor.name");
        sb2.append(descriptorRenderer.x(name, true));
        sb2.append(": ");
        d0 type = descriptor.getType();
        f0.o(type, "descriptor.type");
        sb2.append(reflectionObjectRenderer.h(type));
        String string = sb2.toString();
        f0.o(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    @dl.d
    public final String h(@dl.d d0 type) {
        f0.p(type, "type");
        return f125267b.y(type);
    }
}
