package kotlin.reflect.jvm.internal;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import kotlin.reflect.jvm.internal.impl.descriptors.g0;
import kotlin.reflect.jvm.internal.impl.descriptors.o0;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor;
import kotlin.text.y;

/* JADX INFO: compiled from: RuntimeTypeMapper.kt */
/* JADX INFO: loaded from: classes5.dex */
public abstract class h {

    /* JADX INFO: compiled from: RuntimeTypeMapper.kt */
    public static final class a extends h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @dl.d
        private final Field f125320a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@dl.d Field field) {
            super(null);
            f0.p(field, "field");
            this.f125320a = field;
        }

        @Override // kotlin.reflect.jvm.internal.h
        @dl.d
        public String a() {
            StringBuilder sb2 = new StringBuilder();
            String name = this.f125320a.getName();
            f0.o(name, "field.name");
            sb2.append(kotlin.reflect.jvm.internal.impl.load.java.s.b(name));
            sb2.append("()");
            Class<?> type = this.f125320a.getType();
            f0.o(type, "field.type");
            sb2.append(ReflectClassUtilKt.b(type));
            return sb2.toString();
        }

        @dl.d
        public final Field b() {
            return this.f125320a;
        }
    }

    /* JADX INFO: compiled from: RuntimeTypeMapper.kt */
    public static final class b extends h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @dl.d
        private final Method f125321a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @dl.e
        private final Method f125322b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@dl.d Method getterMethod, @dl.e Method method) {
            super(null);
            f0.p(getterMethod, "getterMethod");
            this.f125321a = getterMethod;
            this.f125322b = method;
        }

        @Override // kotlin.reflect.jvm.internal.h
        @dl.d
        public String a() {
            return RuntimeTypeMapperKt.b(this.f125321a);
        }

        @dl.d
        public final Method b() {
            return this.f125321a;
        }

        @dl.e
        public final Method c() {
            return this.f125322b;
        }
    }

    /* JADX INFO: compiled from: RuntimeTypeMapper.kt */
    public static final class c extends h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @dl.d
        private final o0 f125323a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @dl.d
        private final ProtoBuf.Property f125324b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @dl.d
        private final JvmProtoBuf.JvmPropertySignature f125325c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @dl.d
        private final kotlin.reflect.jvm.internal.impl.metadata.deserialization.c f125326d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @dl.d
        private final kotlin.reflect.jvm.internal.impl.metadata.deserialization.g f125327e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @dl.d
        private final String f125328f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(@dl.d o0 descriptor, @dl.d ProtoBuf.Property proto, @dl.d JvmProtoBuf.JvmPropertySignature signature, @dl.d kotlin.reflect.jvm.internal.impl.metadata.deserialization.c nameResolver, @dl.d kotlin.reflect.jvm.internal.impl.metadata.deserialization.g typeTable) {
            String str;
            super(null);
            f0.p(descriptor, "descriptor");
            f0.p(proto, "proto");
            f0.p(signature, "signature");
            f0.p(nameResolver, "nameResolver");
            f0.p(typeTable, "typeTable");
            this.f125323a = descriptor;
            this.f125324b = proto;
            this.f125325c = signature;
            this.f125326d = nameResolver;
            this.f125327e = typeTable;
            if (signature.H()) {
                str = nameResolver.getString(signature.C().y()) + nameResolver.getString(signature.C().x());
            } else {
                kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.d.a aVarD = kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.i.d(kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.i.f127181a, proto, nameResolver, typeTable, false, 8, null);
                if (aVarD == null) {
                    throw new KotlinReflectionInternalError("No field signature for property: " + descriptor);
                }
                String strD = aVarD.d();
                str = kotlin.reflect.jvm.internal.impl.load.java.s.b(strD) + c() + "()" + aVarD.e();
            }
            this.f125328f = str;
        }

        private final String c() {
            String string;
            kotlin.reflect.jvm.internal.impl.descriptors.k kVarC = this.f125323a.c();
            f0.o(kVarC, "descriptor.containingDeclaration");
            if (f0.g(this.f125323a.getVisibility(), kotlin.reflect.jvm.internal.impl.descriptors.r.f125867d) && (kVarC instanceof DeserializedClassDescriptor)) {
                ProtoBuf.Class classC1 = ((DeserializedClassDescriptor) kVarC).c1();
                GeneratedMessageLite.f<ProtoBuf.Class, Integer> classModuleName = JvmProtoBuf.f127078i;
                f0.o(classModuleName, "classModuleName");
                Integer num = (Integer) kotlin.reflect.jvm.internal.impl.metadata.deserialization.e.a(classC1, classModuleName);
                if (num == null || (string = this.f125326d.getString(num.intValue())) == null) {
                    string = "main";
                }
                return y.f128594c + kotlin.reflect.jvm.internal.impl.name.g.a(string);
            }
            if (!f0.g(this.f125323a.getVisibility(), kotlin.reflect.jvm.internal.impl.descriptors.r.f125864a) || !(kVarC instanceof g0)) {
                return "";
            }
            o0 o0Var = this.f125323a;
            f0.n(o0Var, "null cannot be cast to non-null type org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedPropertyDescriptor");
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.e eVarH0 = ((kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.h) o0Var).h0();
            if (!(eVarH0 instanceof kotlin.reflect.jvm.internal.impl.load.kotlin.i)) {
                return "";
            }
            kotlin.reflect.jvm.internal.impl.load.kotlin.i iVar = (kotlin.reflect.jvm.internal.impl.load.kotlin.i) eVarH0;
            if (iVar.f() == null) {
                return "";
            }
            return y.f128594c + iVar.h().b();
        }

        @Override // kotlin.reflect.jvm.internal.h
        @dl.d
        public String a() {
            return this.f125328f;
        }

        @dl.d
        public final o0 b() {
            return this.f125323a;
        }

        @dl.d
        public final kotlin.reflect.jvm.internal.impl.metadata.deserialization.c d() {
            return this.f125326d;
        }

        @dl.d
        public final ProtoBuf.Property e() {
            return this.f125324b;
        }

        @dl.d
        public final JvmProtoBuf.JvmPropertySignature f() {
            return this.f125325c;
        }

        @dl.d
        public final kotlin.reflect.jvm.internal.impl.metadata.deserialization.g g() {
            return this.f125327e;
        }
    }

    /* JADX INFO: compiled from: RuntimeTypeMapper.kt */
    public static final class d extends h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @dl.d
        private final JvmFunctionSignature.c f125329a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @dl.e
        private final JvmFunctionSignature.c f125330b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(@dl.d JvmFunctionSignature.c getterSignature, @dl.e JvmFunctionSignature.c cVar) {
            super(null);
            f0.p(getterSignature, "getterSignature");
            this.f125329a = getterSignature;
            this.f125330b = cVar;
        }

        @Override // kotlin.reflect.jvm.internal.h
        @dl.d
        public String a() {
            return this.f125329a.a();
        }

        @dl.d
        public final JvmFunctionSignature.c b() {
            return this.f125329a;
        }

        @dl.e
        public final JvmFunctionSignature.c c() {
            return this.f125330b;
        }
    }

    private h() {
    }

    public /* synthetic */ h(u uVar) {
        this();
    }

    @dl.d
    public abstract String a();
}
