package kotlin.reflect.jvm.internal.impl.load.kotlin;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.f0;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.descriptors.b1;
import kotlin.reflect.jvm.internal.impl.descriptors.d0;
import kotlin.reflect.jvm.internal.impl.descriptors.t0;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValueFactory;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: compiled from: BinaryClassAnnotationAndConstantLoaderImpl.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class b extends AbstractBinaryClassAnnotationAndConstantLoader<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c, kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private final d0 f126466c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private final NotFoundClasses f126467d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.c f126468e;

    /* JADX INFO: compiled from: BinaryClassAnnotationAndConstantLoaderImpl.kt */
    public abstract class a implements o.a {

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.b$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: BinaryClassAnnotationAndConstantLoaderImpl.kt */
        public static final class C1156a implements o.a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final /* synthetic */ o.a f126470a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ o.a f126471b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ a f126472c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ kotlin.reflect.jvm.internal.impl.name.f f126473d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ ArrayList<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> f126474e;

            C1156a(o.a aVar, a aVar2, kotlin.reflect.jvm.internal.impl.name.f fVar, ArrayList<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> arrayList) {
                this.f126471b = aVar;
                this.f126472c = aVar2;
                this.f126473d = fVar;
                this.f126474e = arrayList;
                this.f126470a = aVar;
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.o.a
            public void a(@dl.e kotlin.reflect.jvm.internal.impl.name.f fVar, @dl.d kotlin.reflect.jvm.internal.impl.name.b enumClassId, @dl.d kotlin.reflect.jvm.internal.impl.name.f enumEntryName) {
                f0.p(enumClassId, "enumClassId");
                f0.p(enumEntryName, "enumEntryName");
                this.f126470a.a(fVar, enumClassId, enumEntryName);
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.o.a
            @dl.e
            public o.a b(@dl.e kotlin.reflect.jvm.internal.impl.name.f fVar, @dl.d kotlin.reflect.jvm.internal.impl.name.b classId) {
                f0.p(classId, "classId");
                return this.f126470a.b(fVar, classId);
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.o.a
            public void c(@dl.e kotlin.reflect.jvm.internal.impl.name.f fVar, @dl.d kotlin.reflect.jvm.internal.impl.resolve.constants.f value) {
                f0.p(value, "value");
                this.f126470a.c(fVar, value);
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.o.a
            public void d(@dl.e kotlin.reflect.jvm.internal.impl.name.f fVar, @dl.e Object obj) {
                this.f126470a.d(fVar, obj);
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.o.a
            @dl.e
            public o.b e(@dl.e kotlin.reflect.jvm.internal.impl.name.f fVar) {
                return this.f126470a.e(fVar);
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.o.a
            public void visitEnd() {
                this.f126471b.visitEnd();
                this.f126472c.g(this.f126473d, new kotlin.reflect.jvm.internal.impl.resolve.constants.a((kotlin.reflect.jvm.internal.impl.descriptors.annotations.c) CollectionsKt___CollectionsKt.c5(this.f126474e)));
            }
        }

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.b$a$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: BinaryClassAnnotationAndConstantLoaderImpl.kt */
        public static final class C1157b implements o.b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @dl.d
            private final ArrayList<kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>> f126475a = new ArrayList<>();

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ b f126476b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ kotlin.reflect.jvm.internal.impl.name.f f126477c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ a f126478d;

            /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.b$a$b$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: BinaryClassAnnotationAndConstantLoaderImpl.kt */
            public static final class C1158a implements o.a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                private final /* synthetic */ o.a f126479a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ o.a f126480b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ C1157b f126481c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                final /* synthetic */ ArrayList<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> f126482d;

                C1158a(o.a aVar, C1157b c1157b, ArrayList<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> arrayList) {
                    this.f126480b = aVar;
                    this.f126481c = c1157b;
                    this.f126482d = arrayList;
                    this.f126479a = aVar;
                }

                @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.o.a
                public void a(@dl.e kotlin.reflect.jvm.internal.impl.name.f fVar, @dl.d kotlin.reflect.jvm.internal.impl.name.b enumClassId, @dl.d kotlin.reflect.jvm.internal.impl.name.f enumEntryName) {
                    f0.p(enumClassId, "enumClassId");
                    f0.p(enumEntryName, "enumEntryName");
                    this.f126479a.a(fVar, enumClassId, enumEntryName);
                }

                @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.o.a
                @dl.e
                public o.a b(@dl.e kotlin.reflect.jvm.internal.impl.name.f fVar, @dl.d kotlin.reflect.jvm.internal.impl.name.b classId) {
                    f0.p(classId, "classId");
                    return this.f126479a.b(fVar, classId);
                }

                @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.o.a
                public void c(@dl.e kotlin.reflect.jvm.internal.impl.name.f fVar, @dl.d kotlin.reflect.jvm.internal.impl.resolve.constants.f value) {
                    f0.p(value, "value");
                    this.f126479a.c(fVar, value);
                }

                @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.o.a
                public void d(@dl.e kotlin.reflect.jvm.internal.impl.name.f fVar, @dl.e Object obj) {
                    this.f126479a.d(fVar, obj);
                }

                @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.o.a
                @dl.e
                public o.b e(@dl.e kotlin.reflect.jvm.internal.impl.name.f fVar) {
                    return this.f126479a.e(fVar);
                }

                @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.o.a
                public void visitEnd() {
                    this.f126480b.visitEnd();
                    this.f126481c.f126475a.add(new kotlin.reflect.jvm.internal.impl.resolve.constants.a((kotlin.reflect.jvm.internal.impl.descriptors.annotations.c) CollectionsKt___CollectionsKt.c5(this.f126482d)));
                }
            }

            C1157b(b bVar, kotlin.reflect.jvm.internal.impl.name.f fVar, a aVar) {
                this.f126476b = bVar;
                this.f126477c = fVar;
                this.f126478d = aVar;
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.o.b
            public void a(@dl.e Object obj) {
                this.f126475a.add(this.f126476b.I(this.f126477c, obj));
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.o.b
            @dl.e
            public o.a b(@dl.d kotlin.reflect.jvm.internal.impl.name.b classId) {
                f0.p(classId, "classId");
                ArrayList arrayList = new ArrayList();
                b bVar = this.f126476b;
                t0 NO_SOURCE = t0.f125942a;
                f0.o(NO_SOURCE, "NO_SOURCE");
                o.a aVarV = bVar.v(classId, NO_SOURCE, arrayList);
                f0.m(aVarV);
                return new C1158a(aVarV, this, arrayList);
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.o.b
            public void c(@dl.d kotlin.reflect.jvm.internal.impl.name.b enumClassId, @dl.d kotlin.reflect.jvm.internal.impl.name.f enumEntryName) {
                f0.p(enumClassId, "enumClassId");
                f0.p(enumEntryName, "enumEntryName");
                this.f126475a.add(new kotlin.reflect.jvm.internal.impl.resolve.constants.i(enumClassId, enumEntryName));
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.o.b
            public void d(@dl.d kotlin.reflect.jvm.internal.impl.resolve.constants.f value) {
                f0.p(value, "value");
                this.f126475a.add(new kotlin.reflect.jvm.internal.impl.resolve.constants.o(value));
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.o.b
            public void visitEnd() {
                this.f126478d.f(this.f126477c, this.f126475a);
            }
        }

        public a() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.o.a
        public void a(@dl.e kotlin.reflect.jvm.internal.impl.name.f fVar, @dl.d kotlin.reflect.jvm.internal.impl.name.b enumClassId, @dl.d kotlin.reflect.jvm.internal.impl.name.f enumEntryName) {
            f0.p(enumClassId, "enumClassId");
            f0.p(enumEntryName, "enumEntryName");
            g(fVar, new kotlin.reflect.jvm.internal.impl.resolve.constants.i(enumClassId, enumEntryName));
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.o.a
        @dl.e
        public o.a b(@dl.e kotlin.reflect.jvm.internal.impl.name.f fVar, @dl.d kotlin.reflect.jvm.internal.impl.name.b classId) {
            f0.p(classId, "classId");
            ArrayList arrayList = new ArrayList();
            b bVar = b.this;
            t0 NO_SOURCE = t0.f125942a;
            f0.o(NO_SOURCE, "NO_SOURCE");
            o.a aVarV = bVar.v(classId, NO_SOURCE, arrayList);
            f0.m(aVarV);
            return new C1156a(aVarV, this, fVar, arrayList);
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.o.a
        public void c(@dl.e kotlin.reflect.jvm.internal.impl.name.f fVar, @dl.d kotlin.reflect.jvm.internal.impl.resolve.constants.f value) {
            f0.p(value, "value");
            g(fVar, new kotlin.reflect.jvm.internal.impl.resolve.constants.o(value));
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.o.a
        public void d(@dl.e kotlin.reflect.jvm.internal.impl.name.f fVar, @dl.e Object obj) {
            g(fVar, b.this.I(fVar, obj));
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.o.a
        @dl.e
        public o.b e(@dl.e kotlin.reflect.jvm.internal.impl.name.f fVar) {
            return new C1157b(b.this, fVar, this);
        }

        public abstract void f(@dl.e kotlin.reflect.jvm.internal.impl.name.f fVar, @dl.d ArrayList<kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>> arrayList);

        public abstract void g(@dl.e kotlin.reflect.jvm.internal.impl.name.f fVar, @dl.d kotlin.reflect.jvm.internal.impl.resolve.constants.g<?> gVar);
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: BinaryClassAnnotationAndConstantLoaderImpl.kt */
    public static final class C1159b extends a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @dl.d
        private final HashMap<kotlin.reflect.jvm.internal.impl.name.f, kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>> f126483b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.d f126485d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ kotlin.reflect.jvm.internal.impl.name.b f126486e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ List<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> f126487f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ t0 f126488g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1159b(kotlin.reflect.jvm.internal.impl.descriptors.d dVar, kotlin.reflect.jvm.internal.impl.name.b bVar, List<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> list, t0 t0Var) {
            super();
            this.f126485d = dVar;
            this.f126486e = bVar;
            this.f126487f = list;
            this.f126488g = t0Var;
            this.f126483b = new HashMap<>();
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.b.a
        public void f(@dl.e kotlin.reflect.jvm.internal.impl.name.f fVar, @dl.d ArrayList<kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>> elements) {
            f0.p(elements, "elements");
            if (fVar == null) {
                return;
            }
            b1 b1VarB = kotlin.reflect.jvm.internal.impl.load.java.components.a.b(fVar, this.f126485d);
            if (b1VarB != null) {
                HashMap<kotlin.reflect.jvm.internal.impl.name.f, kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>> map = this.f126483b;
                ConstantValueFactory constantValueFactory = ConstantValueFactory.f127518a;
                List<? extends kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>> listC = kotlin.reflect.jvm.internal.impl.utils.a.c(elements);
                kotlin.reflect.jvm.internal.impl.types.d0 type = b1VarB.getType();
                f0.o(type, "parameter.type");
                map.put(fVar, constantValueFactory.b(listC, type));
                return;
            }
            if (b.this.u(this.f126486e) && f0.g(fVar.b(), "value")) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : elements) {
                    if (obj instanceof kotlin.reflect.jvm.internal.impl.resolve.constants.a) {
                        arrayList.add(obj);
                    }
                }
                List<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> list = this.f126487f;
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    list.add(((kotlin.reflect.jvm.internal.impl.resolve.constants.a) it.next()).b());
                }
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.b.a
        public void g(@dl.e kotlin.reflect.jvm.internal.impl.name.f fVar, @dl.d kotlin.reflect.jvm.internal.impl.resolve.constants.g<?> value) {
            f0.p(value, "value");
            if (fVar != null) {
                this.f126483b.put(fVar, value);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.o.a
        public void visitEnd() {
            if (b.this.C(this.f126486e, this.f126483b) || b.this.u(this.f126486e)) {
                return;
            }
            this.f126487f.add(new kotlin.reflect.jvm.internal.impl.descriptors.annotations.d(this.f126485d.v(), this.f126483b, this.f126488g));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(@dl.d d0 module, @dl.d NotFoundClasses notFoundClasses, @dl.d kotlin.reflect.jvm.internal.impl.storage.m storageManager, @dl.d m kotlinClassFinder) {
        super(storageManager, kotlinClassFinder);
        f0.p(module, "module");
        f0.p(notFoundClasses, "notFoundClasses");
        f0.p(storageManager, "storageManager");
        f0.p(kotlinClassFinder, "kotlinClassFinder");
        this.f126466c = module;
        this.f126467d = notFoundClasses;
        this.f126468e = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.c(module, notFoundClasses);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final kotlin.reflect.jvm.internal.impl.resolve.constants.g<?> I(kotlin.reflect.jvm.internal.impl.name.f fVar, Object obj) {
        kotlin.reflect.jvm.internal.impl.resolve.constants.g<?> gVarC = ConstantValueFactory.f127518a.c(obj);
        if (gVarC != null) {
            return gVarC;
        }
        return kotlin.reflect.jvm.internal.impl.resolve.constants.j.f127536b.a("Unsupported annotation argument: " + fVar);
    }

    private final kotlin.reflect.jvm.internal.impl.descriptors.d L(kotlin.reflect.jvm.internal.impl.name.b bVar) {
        return FindClassInModuleKt.c(this.f126466c, bVar, this.f126467d);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader
    @dl.e
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public kotlin.reflect.jvm.internal.impl.resolve.constants.g<?> E(@dl.d String desc, @dl.d Object initializer) {
        f0.p(desc, "desc");
        f0.p(initializer, "initializer");
        if (StringsKt__StringsKt.W2("ZBCS", desc, false, 2, null)) {
            int iIntValue = ((Integer) initializer).intValue();
            int iHashCode = desc.hashCode();
            if (iHashCode == 66) {
                if (desc.equals("B")) {
                    initializer = Byte.valueOf((byte) iIntValue);
                }
                throw new AssertionError(desc);
            }
            if (iHashCode == 67) {
                if (desc.equals("C")) {
                    initializer = Character.valueOf((char) iIntValue);
                }
                throw new AssertionError(desc);
            }
            if (iHashCode == 83) {
                if (desc.equals(androidx.exifinterface.media.a.R4)) {
                    initializer = Short.valueOf((short) iIntValue);
                }
                throw new AssertionError(desc);
            }
            if (iHashCode == 90 && desc.equals("Z")) {
                initializer = Boolean.valueOf(iIntValue != 0);
            }
            throw new AssertionError(desc);
        }
        return ConstantValueFactory.f127518a.c(initializer);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationLoader
    @dl.d
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public kotlin.reflect.jvm.internal.impl.descriptors.annotations.c y(@dl.d ProtoBuf.Annotation proto, @dl.d kotlin.reflect.jvm.internal.impl.metadata.deserialization.c nameResolver) {
        f0.p(proto, "proto");
        f0.p(nameResolver, "nameResolver");
        return this.f126468e.a(proto, nameResolver);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader
    @dl.e
    /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
    public kotlin.reflect.jvm.internal.impl.resolve.constants.g<?> G(@dl.d kotlin.reflect.jvm.internal.impl.resolve.constants.g<?> constant) {
        kotlin.reflect.jvm.internal.impl.resolve.constants.g<?> wVar;
        f0.p(constant, "constant");
        if (constant instanceof kotlin.reflect.jvm.internal.impl.resolve.constants.d) {
            wVar = new kotlin.reflect.jvm.internal.impl.resolve.constants.u(((kotlin.reflect.jvm.internal.impl.resolve.constants.d) constant).b().byteValue());
        } else if (constant instanceof kotlin.reflect.jvm.internal.impl.resolve.constants.s) {
            wVar = new kotlin.reflect.jvm.internal.impl.resolve.constants.x(((kotlin.reflect.jvm.internal.impl.resolve.constants.s) constant).b().shortValue());
        } else if (constant instanceof kotlin.reflect.jvm.internal.impl.resolve.constants.l) {
            wVar = new kotlin.reflect.jvm.internal.impl.resolve.constants.v(((kotlin.reflect.jvm.internal.impl.resolve.constants.l) constant).b().intValue());
        } else {
            if (!(constant instanceof kotlin.reflect.jvm.internal.impl.resolve.constants.p)) {
                return constant;
            }
            wVar = new kotlin.reflect.jvm.internal.impl.resolve.constants.w(((kotlin.reflect.jvm.internal.impl.resolve.constants.p) constant).b().longValue());
        }
        return wVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationLoader
    @dl.e
    protected o.a v(@dl.d kotlin.reflect.jvm.internal.impl.name.b annotationClassId, @dl.d t0 source, @dl.d List<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> result) {
        f0.p(annotationClassId, "annotationClassId");
        f0.p(source, "source");
        f0.p(result, "result");
        return new C1159b(L(annotationClassId), annotationClassId, result, source);
    }
}
