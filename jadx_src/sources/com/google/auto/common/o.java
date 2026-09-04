package com.google.auto.common;

import com.google.common.base.Equivalence;
import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.function.Function;
import javax.lang.model.element.AnnotationMirror;
import javax.lang.model.element.AnnotationValue;
import javax.lang.model.element.VariableElement;
import javax.lang.model.type.DeclaredType;
import javax.lang.model.type.TypeMirror;
import javax.lang.model.util.SimpleAnnotationValueVisitor8;

/* JADX INFO: compiled from: AnnotationValues.java */
/* JADX INFO: loaded from: classes7.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Equivalence<AnnotationValue> f56507a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final c<DeclaredType> f56508b = new c<>(new Function() { // from class: com.google.auto.common.b
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return o.z((AnnotationValue) obj);
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final c<AnnotationMirror> f56509c = new c<>(new Function() { // from class: com.google.auto.common.i
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return o.c((AnnotationValue) obj);
        }
    });

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final c<VariableElement> f56510d = new c<>(new Function() { // from class: com.google.auto.common.j
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return o.n((AnnotationValue) obj);
        }
    });

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final c<String> f56511e = new c<>(new Function() { // from class: com.google.auto.common.k
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return o.x((AnnotationValue) obj);
        }
    });

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final c<Integer> f56512f = new c<>(new Function() { // from class: com.google.auto.common.l
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return Integer.valueOf(o.r((AnnotationValue) obj));
        }
    });

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final c<Long> f56513g = new c<>(new Function() { // from class: com.google.auto.common.m
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return Long.valueOf(o.t((AnnotationValue) obj));
        }
    });

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final c<Byte> f56514h = new c<>(new Function() { // from class: com.google.auto.common.n
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return Byte.valueOf(o.h((AnnotationValue) obj));
        }
    });

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final c<Short> f56515i = new c<>(new Function() { // from class: com.google.auto.common.c
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return Short.valueOf(o.v((AnnotationValue) obj));
        }
    });

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final c<Float> f56516j = new c<>(new Function() { // from class: com.google.auto.common.d
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return Float.valueOf(o.p((AnnotationValue) obj));
        }
    });

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final c<Double> f56517k = new c<>(new Function() { // from class: com.google.auto.common.e
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return Double.valueOf(o.l((AnnotationValue) obj));
        }
    });

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final c<Boolean> f56518l = new c<>(new Function() { // from class: com.google.auto.common.f
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return Boolean.valueOf(o.f((AnnotationValue) obj));
        }
    });

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final c<Character> f56519m = new c<>(new Function() { // from class: com.google.auto.common.g
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return Character.valueOf(o.j((AnnotationValue) obj));
        }
    });

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final c<AnnotationValue> f56520n = new c<>(new Function() { // from class: com.google.auto.common.h
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return o.B((AnnotationValue) obj);
        }
    });

    /* JADX INFO: compiled from: AnnotationValues.java */
    public static final class a extends Equivalence<AnnotationValue> {

        /* JADX INFO: renamed from: com.google.auto.common.o$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: AnnotationValues.java */
        public class C0437a extends SimpleAnnotationValueVisitor8<Boolean, AnnotationValue> {

            /* JADX INFO: renamed from: com.google.auto.common.o$a$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: AnnotationValues.java */
            public class C0438a extends SimpleAnnotationValueVisitor8<Object, Void> {
                C0438a() {
                }

                /* JADX INFO: Access modifiers changed from: protected */
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public Object a(Object obj, Void r10) {
                    return obj;
                }
            }

            /* JADX INFO: renamed from: com.google.auto.common.o$a$a$b */
            /* JADX INFO: compiled from: AnnotationValues.java */
            public class b extends SimpleAnnotationValueVisitor8<Boolean, AnnotationMirror> {
                b() {
                }

                /* JADX INFO: Access modifiers changed from: protected */
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public Boolean b(Object obj, AnnotationMirror annotationMirror) {
                    return Boolean.FALSE;
                }

                /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
                public Boolean d(AnnotationMirror annotationMirror, AnnotationMirror annotationMirror2) {
                    return Boolean.valueOf(com.google.auto.common.a.a().d(annotationMirror2, annotationMirror));
                }
            }

            /* JADX INFO: renamed from: com.google.auto.common.o$a$a$c */
            /* JADX INFO: compiled from: AnnotationValues.java */
            public class c extends SimpleAnnotationValueVisitor8<Boolean, List<? extends AnnotationValue>> {
                c() {
                }

                /* JADX INFO: Access modifiers changed from: protected */
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public Boolean b(Object obj, List<? extends AnnotationValue> list) {
                    return Boolean.FALSE;
                }

                /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
                public Boolean d(List<? extends AnnotationValue> list, List<? extends AnnotationValue> list2) {
                    return Boolean.valueOf(o.b().i().d(list2, list));
                }
            }

            /* JADX INFO: renamed from: com.google.auto.common.o$a$a$d */
            /* JADX INFO: compiled from: AnnotationValues.java */
            public class d extends SimpleAnnotationValueVisitor8<Boolean, TypeMirror> {
                d() {
                }

                /* JADX INFO: Access modifiers changed from: protected */
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public Boolean b(Object obj, TypeMirror typeMirror) {
                    return Boolean.FALSE;
                }

                /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
                public Boolean d(TypeMirror typeMirror, TypeMirror typeMirror2) {
                    return Boolean.valueOf(o0.w().d(typeMirror2, typeMirror));
                }
            }

            C0437a() {
            }

            /* JADX INFO: Access modifiers changed from: protected */
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Boolean b(Object obj, AnnotationValue annotationValue) {
                return Boolean.valueOf(obj.equals(annotationValue.accept(new C0438a(), (Object) null)));
            }

            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public Boolean d(AnnotationMirror annotationMirror, AnnotationValue annotationValue) {
                return (Boolean) annotationValue.accept(new b(), annotationMirror);
            }

            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public Boolean f(List<? extends AnnotationValue> list, AnnotationValue annotationValue) {
                return (Boolean) annotationValue.accept(new c(), list);
            }

            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public Boolean h(TypeMirror typeMirror, AnnotationValue annotationValue) {
                return (Boolean) annotationValue.accept(new d(), typeMirror);
            }
        }

        /* JADX INFO: compiled from: AnnotationValues.java */
        public class b extends SimpleAnnotationValueVisitor8<Integer, Void> {
            b() {
            }

            /* JADX INFO: Access modifiers changed from: protected */
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Integer b(Object obj, Void r10) {
                return Integer.valueOf(obj.hashCode());
            }

            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public Integer d(AnnotationMirror annotationMirror, Void r10) {
                return Integer.valueOf(com.google.auto.common.a.a().f(annotationMirror));
            }

            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public Integer f(List<? extends AnnotationValue> list, Void r10) {
                return Integer.valueOf(o.b().i().f(list));
            }

            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public Integer h(TypeMirror typeMirror, Void r10) {
                return Integer.valueOf(o0.w().f(typeMirror));
            }
        }

        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.base.Equivalence
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public boolean a(AnnotationValue annotationValue, AnnotationValue annotationValue2) {
            return ((Boolean) annotationValue.accept(new C0437a(), annotationValue2)).booleanValue();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.base.Equivalence
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public int b(AnnotationValue annotationValue) {
            return ((Integer) annotationValue.accept(new b(), (Object) null)).intValue();
        }
    }

    /* JADX INFO: compiled from: AnnotationValues.java */
    public static final class b extends d<AnnotationMirror> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final b f56527b = new b();

        b() {
            super(AnnotationMirror.class);
        }

        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public AnnotationMirror c(AnnotationMirror annotationMirror, Void r10) {
            return annotationMirror;
        }
    }

    /* JADX INFO: compiled from: AnnotationValues.java */
    public static final class c<T> extends SimpleAnnotationValueVisitor8<ImmutableList<T>, Void> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Function<AnnotationValue, T> f56528a;

        c(Function<AnnotationValue, T> function) {
            this.f56528a = (Function) com.google.common.base.w.E(function);
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ImmutableList<T> b(Object obj, Void r10) {
            throw new IllegalStateException("Expected an array, got instead: " + obj);
        }

        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public ImmutableList<T> d(List<? extends AnnotationValue> list, Void r10) {
            return (ImmutableList) list.stream().map(this.f56528a).collect(ImmutableList.toImmutableList());
        }
    }

    /* JADX INFO: compiled from: AnnotationValues.java */
    public static class d<T> extends SimpleAnnotationValueVisitor8<T, Void> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Class<T> f56529a;

        d(Class<T> cls) {
            this.f56529a = (Class) com.google.common.base.w.E(cls);
        }

        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public T a(Object obj, Void r10) {
            throw new IllegalArgumentException("Expected a " + this.f56529a.getSimpleName() + ", got instead: " + obj);
        }
    }

    /* JADX INFO: compiled from: AnnotationValues.java */
    public static final class e extends d<VariableElement> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final e f56530b = new e();

        e() {
            super(VariableElement.class);
        }

        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public VariableElement c(VariableElement variableElement, Void r10) {
            return variableElement;
        }
    }

    /* JADX INFO: compiled from: AnnotationValues.java */
    public static final class f extends d<DeclaredType> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final f f56531b = new f();

        f() {
            super(DeclaredType.class);
        }

        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public DeclaredType c(TypeMirror typeMirror, Void r10) {
            return o0.g(typeMirror);
        }
    }

    private o() {
    }

    public static ImmutableList<DeclaredType> A(AnnotationValue annotationValue) {
        return (ImmutableList) f56508b.visit(annotationValue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ AnnotationValue B(AnnotationValue annotationValue) {
        return annotationValue;
    }

    private static <T> T C(AnnotationValue annotationValue, Class<T> cls) {
        Object value = annotationValue.getValue();
        if (cls.isInstance(value)) {
            return cls.cast(value);
        }
        throw new IllegalArgumentException("Expected " + cls.getSimpleName() + ", got instead: " + value);
    }

    public static Equivalence<AnnotationValue> b() {
        return f56507a;
    }

    public static AnnotationMirror c(AnnotationValue annotationValue) {
        return (AnnotationMirror) b.f56527b.visit(annotationValue);
    }

    public static ImmutableList<AnnotationMirror> d(AnnotationValue annotationValue) {
        return (ImmutableList) f56509c.visit(annotationValue);
    }

    public static ImmutableList<AnnotationValue> e(AnnotationValue annotationValue) {
        return (ImmutableList) f56520n.visit(annotationValue);
    }

    public static boolean f(AnnotationValue annotationValue) {
        return ((Boolean) C(annotationValue, Boolean.class)).booleanValue();
    }

    public static ImmutableList<Boolean> g(AnnotationValue annotationValue) {
        return (ImmutableList) f56518l.visit(annotationValue);
    }

    public static byte h(AnnotationValue annotationValue) {
        return ((Byte) C(annotationValue, Byte.class)).byteValue();
    }

    public static ImmutableList<Byte> i(AnnotationValue annotationValue) {
        return (ImmutableList) f56514h.visit(annotationValue);
    }

    public static char j(AnnotationValue annotationValue) {
        return ((Character) C(annotationValue, Character.class)).charValue();
    }

    public static ImmutableList<Character> k(AnnotationValue annotationValue) {
        return (ImmutableList) f56519m.visit(annotationValue);
    }

    public static double l(AnnotationValue annotationValue) {
        return ((Double) C(annotationValue, Double.class)).doubleValue();
    }

    public static ImmutableList<Double> m(AnnotationValue annotationValue) {
        return (ImmutableList) f56517k.visit(annotationValue);
    }

    public static VariableElement n(AnnotationValue annotationValue) {
        return (VariableElement) e.f56530b.visit(annotationValue);
    }

    public static ImmutableList<VariableElement> o(AnnotationValue annotationValue) {
        return (ImmutableList) f56510d.visit(annotationValue);
    }

    public static float p(AnnotationValue annotationValue) {
        return ((Float) C(annotationValue, Float.class)).floatValue();
    }

    public static ImmutableList<Float> q(AnnotationValue annotationValue) {
        return (ImmutableList) f56516j.visit(annotationValue);
    }

    public static int r(AnnotationValue annotationValue) {
        return ((Integer) C(annotationValue, Integer.class)).intValue();
    }

    public static ImmutableList<Integer> s(AnnotationValue annotationValue) {
        return (ImmutableList) f56512f.visit(annotationValue);
    }

    public static long t(AnnotationValue annotationValue) {
        return ((Long) C(annotationValue, Long.class)).longValue();
    }

    public static ImmutableList<Long> u(AnnotationValue annotationValue) {
        return (ImmutableList) f56513g.visit(annotationValue);
    }

    public static short v(AnnotationValue annotationValue) {
        return ((Short) C(annotationValue, Short.class)).shortValue();
    }

    public static ImmutableList<Short> w(AnnotationValue annotationValue) {
        return (ImmutableList) f56515i.visit(annotationValue);
    }

    public static String x(AnnotationValue annotationValue) {
        return (String) C(annotationValue, String.class);
    }

    public static ImmutableList<String> y(AnnotationValue annotationValue) {
        return (ImmutableList) f56511e.visit(annotationValue);
    }

    public static DeclaredType z(AnnotationValue annotationValue) {
        return (DeclaredType) f.f56531b.visit(annotationValue);
    }
}
