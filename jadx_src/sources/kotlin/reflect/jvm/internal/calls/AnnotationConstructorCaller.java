package kotlin.reflect.jvm.internal.calls;

import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.s0;
import kotlin.collections.t;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;

/* JADX INFO: compiled from: AnnotationConstructorCaller.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class AnnotationConstructorCaller implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final Class<?> f125276a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final List<String> f125277b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private final CallMode f125278c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private final List<Method> f125279d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private final List<Type> f125280e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    private final List<Class<?>> f125281f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.d
    private final List<Object> f125282g;

    /* JADX INFO: compiled from: AnnotationConstructorCaller.kt */
    public enum CallMode {
        CALL_BY_NAME,
        POSITIONAL_CALL
    }

    /* JADX INFO: compiled from: AnnotationConstructorCaller.kt */
    public enum Origin {
        JAVA,
        KOTLIN
    }

    public AnnotationConstructorCaller(@dl.d Class<?> jClass, @dl.d List<String> parameterNames, @dl.d CallMode callMode, @dl.d Origin origin, @dl.d List<Method> methods) {
        f0.p(jClass, "jClass");
        f0.p(parameterNames, "parameterNames");
        f0.p(callMode, "callMode");
        f0.p(origin, "origin");
        f0.p(methods, "methods");
        this.f125276a = jClass;
        this.f125277b = parameterNames;
        this.f125278c = callMode;
        this.f125279d = methods;
        ArrayList arrayList = new ArrayList(t.Y(methods, 10));
        Iterator<T> it = methods.iterator();
        while (it.hasNext()) {
            arrayList.add(((Method) it.next()).getGenericReturnType());
        }
        this.f125280e = arrayList;
        List<Method> list = this.f125279d;
        ArrayList arrayList2 = new ArrayList(t.Y(list, 10));
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            Class<?> it3 = ((Method) it2.next()).getReturnType();
            f0.o(it3, "it");
            Class<?> clsG = ReflectClassUtilKt.g(it3);
            if (clsG != null) {
                it3 = clsG;
            }
            arrayList2.add(it3);
        }
        this.f125281f = arrayList2;
        List<Method> list2 = this.f125279d;
        ArrayList arrayList3 = new ArrayList(t.Y(list2, 10));
        Iterator<T> it4 = list2.iterator();
        while (it4.hasNext()) {
            arrayList3.add(((Method) it4.next()).getDefaultValue());
        }
        this.f125282g = arrayList3;
        if (this.f125278c == CallMode.POSITIONAL_CALL && origin == Origin.JAVA && (!CollectionsKt___CollectionsKt.l4(this.f125277b, "value").isEmpty())) {
            throw new UnsupportedOperationException("Positional call of a Java annotation constructor is allowed only if there are no parameters or one parameter named \"value\". This restriction exists because Java annotations (in contrast to Kotlin)do not impose any order on their arguments. Use KCallable#callBy instead.");
        }
    }

    public /* synthetic */ AnnotationConstructorCaller(Class cls, List list, CallMode callMode, Origin origin, List list2, int i10, u uVar) {
        if ((i10 & 16) != 0) {
            list2 = new ArrayList(t.Y(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                list2.add(cls.getDeclaredMethod((String) it.next(), new Class[0]));
            }
        }
        this(cls, list, callMode, origin, list2);
    }

    public void a(@dl.d Object[] objArr) {
        c.a.a(this, objArr);
    }

    @dl.e
    public Void b() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.calls.c
    @dl.d
    public List<Type> c() {
        return this.f125280e;
    }

    @Override // kotlin.reflect.jvm.internal.calls.c
    @dl.e
    public Object call(@dl.d Object[] args) {
        f0.p(args, "args");
        a(args);
        ArrayList arrayList = new ArrayList(args.length);
        int length = args.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            Object obj = args[i10];
            int i12 = i11 + 1;
            Object objK = (obj == null && this.f125278c == CallMode.CALL_BY_NAME) ? this.f125282g.get(i11) : AnnotationConstructorCallerKt.k(obj, this.f125281f.get(i11));
            if (objK == null) {
                AnnotationConstructorCallerKt.j(i11, this.f125277b.get(i11), this.f125281f.get(i11));
                throw null;
            }
            arrayList.add(objK);
            i10++;
            i11 = i12;
        }
        return AnnotationConstructorCallerKt.d(this.f125276a, s0.B0(CollectionsKt___CollectionsKt.d6(this.f125277b, arrayList)), this.f125279d);
    }

    @Override // kotlin.reflect.jvm.internal.calls.c
    public /* bridge */ /* synthetic */ Member d() {
        return (Member) b();
    }

    @Override // kotlin.reflect.jvm.internal.calls.c
    @dl.d
    public Type getReturnType() {
        return this.f125276a;
    }
}
