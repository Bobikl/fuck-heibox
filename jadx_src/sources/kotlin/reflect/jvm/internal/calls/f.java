package kotlin.reflect.jvm.internal.calls;

import fi.l;
import fi.u;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.f0;
import kotlin.reflect.jvm.internal.KotlinReflectionInternalError;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.b1;
import kotlin.reflect.jvm.internal.impl.descriptors.j;
import kotlin.reflect.jvm.internal.impl.descriptors.k;
import kotlin.reflect.jvm.internal.impl.descriptors.r0;
import kotlin.reflect.jvm.internal.impl.descriptors.w;
import kotlin.reflect.jvm.internal.impl.types.d0;
import kotlin.reflect.jvm.internal.s;

/* JADX INFO: compiled from: InlineClassAwareCaller.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class f<M extends Member> implements c<M> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final c<M> f125305a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f125306b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private final a f125307c;

    /* JADX INFO: compiled from: InlineClassAwareCaller.kt */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @dl.d
        private final l f125308a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @dl.d
        private final Method[] f125309b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @dl.e
        private final Method f125310c;

        public a(@dl.d l argumentRange, @dl.d Method[] unbox, @dl.e Method method) {
            f0.p(argumentRange, "argumentRange");
            f0.p(unbox, "unbox");
            this.f125308a = argumentRange;
            this.f125309b = unbox;
            this.f125310c = method;
        }

        @dl.d
        public final l a() {
            return this.f125308a;
        }

        @dl.d
        public final Method[] b() {
            return this.f125309b;
        }

        @dl.e
        public final Method c() {
            return this.f125310c;
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0067  */
    /* JADX WARN: Multi-variable type inference failed */
    public f(@dl.d CallableMemberDescriptor descriptor, @dl.d c<? extends M> caller, boolean z10) {
        a aVar;
        Class<?> clsI;
        f0.p(descriptor, "descriptor");
        f0.p(caller, "caller");
        this.f125305a = caller;
        this.f125306b = z10;
        d0 returnType = descriptor.getReturnType();
        f0.m(returnType);
        Class<?> clsI2 = g.i(returnType);
        Method methodD = clsI2 != null ? g.d(clsI2, descriptor) : null;
        if (kotlin.reflect.jvm.internal.impl.resolve.e.a(descriptor)) {
            aVar = new a(l.f118877f.a(), new Method[0], methodD);
        } else {
            int i10 = -1;
            if (!(caller instanceof d.h.c)) {
                if (descriptor instanceof j) {
                    if (!(caller instanceof b)) {
                        i10 = 0;
                    }
                } else if (descriptor.i0() == null || (caller instanceof b)) {
                    i10 = 0;
                } else {
                    k kVarC = descriptor.c();
                    f0.o(kVarC, "descriptor.containingDeclaration");
                    if (kotlin.reflect.jvm.internal.impl.resolve.e.b(kVarC)) {
                        i10 = 0;
                    } else {
                        i10 = 1;
                    }
                }
            }
            ArrayList arrayList = new ArrayList();
            r0 r0VarL0 = descriptor.l0();
            d0 type = r0VarL0 != null ? r0VarL0.getType() : null;
            if (type != null) {
                arrayList.add(type);
            } else if (descriptor instanceof j) {
                kotlin.reflect.jvm.internal.impl.descriptors.d dVarO = ((j) descriptor).O();
                f0.o(dVarO, "descriptor.constructedClass");
                if (dVarO.m()) {
                    k kVarC2 = dVarO.c();
                    f0.n(kVarC2, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                    arrayList.add(((kotlin.reflect.jvm.internal.impl.descriptors.d) kVarC2).v());
                }
            } else {
                k kVarC3 = descriptor.c();
                f0.o(kVarC3, "descriptor.containingDeclaration");
                if ((kVarC3 instanceof kotlin.reflect.jvm.internal.impl.descriptors.d) && kotlin.reflect.jvm.internal.impl.resolve.e.b(kVarC3)) {
                    arrayList.add(((kotlin.reflect.jvm.internal.impl.descriptors.d) kVarC3).v());
                }
            }
            List<b1> listI = descriptor.i();
            f0.o(listI, "descriptor.valueParameters");
            Iterator<T> it = listI.iterator();
            while (it.hasNext()) {
                arrayList.add(((b1) it.next()).getType());
            }
            int size = arrayList.size() + i10 + (this.f125306b ? (((arrayList.size() + 32) - 1) / 32) + 1 : 0) + (((descriptor instanceof w) && ((w) descriptor).isSuspend()) ? 1 : 0);
            if (e.a(this) != size) {
                throw new KotlinReflectionInternalError("Inconsistent number of parameters in the descriptor and Java reflection object: " + e.a(this) + " != " + size + "\nCalling: " + descriptor + "\nParameter types: " + c() + ")\nDefault: " + this.f125306b);
            }
            l lVarW1 = u.W1(Math.max(i10, 0), arrayList.size() + i10);
            Method[] methodArr = new Method[size];
            int i11 = 0;
            while (i11 < size) {
                methodArr[i11] = (!(i11 <= lVarW1.i() && lVarW1.h() <= i11) || (clsI = g.i((d0) arrayList.get(i11 - i10))) == null) ? null : g.f(clsI, descriptor);
                i11++;
            }
            aVar = new a(lVarW1, methodArr, methodD);
        }
        this.f125307c = aVar;
    }

    @Override // kotlin.reflect.jvm.internal.calls.c
    @dl.d
    public List<Type> c() {
        return this.f125305a.c();
    }

    @Override // kotlin.reflect.jvm.internal.calls.c
    @dl.e
    public Object call(@dl.d Object[] args) throws IllegalAccessException, InvocationTargetException {
        Object objInvoke;
        f0.p(args, "args");
        a aVar = this.f125307c;
        l lVarA = aVar.a();
        Method[] methodArrB = aVar.b();
        Method methodC = aVar.c();
        Object[] objArrCopyOf = Arrays.copyOf(args, args.length);
        f0.o(objArrCopyOf, "copyOf(this, size)");
        int iH = lVarA.h();
        int i10 = lVarA.i();
        if (iH <= i10) {
            while (true) {
                Method method = methodArrB[iH];
                Object objG = args[iH];
                if (method != null) {
                    if (objG != null) {
                        objG = method.invoke(objG, new Object[0]);
                    } else {
                        Class<?> returnType = method.getReturnType();
                        f0.o(returnType, "method.returnType");
                        objG = s.g(returnType);
                    }
                }
                objArrCopyOf[iH] = objG;
                if (iH == i10) {
                    break;
                }
                iH++;
            }
        }
        Object objCall = this.f125305a.call(objArrCopyOf);
        return (methodC == null || (objInvoke = methodC.invoke(null, objCall)) == null) ? objCall : objInvoke;
    }

    @Override // kotlin.reflect.jvm.internal.calls.c
    public M d() {
        return (M) this.f125305a.d();
    }

    @Override // kotlin.reflect.jvm.internal.calls.c
    @dl.d
    public Type getReturnType() {
        return this.f125305a.getReturnType();
    }
}
