package kotlin.reflect.jvm.internal.impl.util;

import java.util.Arrays;
import java.util.Collection;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import kotlin.reflect.jvm.internal.impl.descriptors.w;
import kotlin.text.Regex;

/* JADX INFO: compiled from: modifierChecks.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class Checks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.e
    private final kotlin.reflect.jvm.internal.impl.name.f f128200a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.e
    private final Regex f128201b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.e
    private final Collection<kotlin.reflect.jvm.internal.impl.name.f> f128202c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private final yh.l<w, String> f128203d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private final f[] f128204e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Checks(@dl.d Collection<kotlin.reflect.jvm.internal.impl.name.f> nameList, @dl.d f[] checks, @dl.d yh.l<? super w, String> additionalChecks) {
        this((kotlin.reflect.jvm.internal.impl.name.f) null, (Regex) null, nameList, additionalChecks, (f[]) Arrays.copyOf(checks, checks.length));
        f0.p(nameList, "nameList");
        f0.p(checks, "checks");
        f0.p(additionalChecks, "additionalChecks");
    }

    public /* synthetic */ Checks(Collection collection, f[] fVarArr, yh.l lVar, int i10, u uVar) {
        this((Collection<kotlin.reflect.jvm.internal.impl.name.f>) collection, fVarArr, (yh.l<? super w, String>) ((i10 & 4) != 0 ? new yh.l() { // from class: kotlin.reflect.jvm.internal.impl.util.Checks.4
            @Override // yh.l
            @dl.e
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Void invoke(@dl.d w wVar) {
                f0.p(wVar, "$this$null");
                return null;
            }
        } : lVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Checks(kotlin.reflect.jvm.internal.impl.name.f fVar, Regex regex, Collection<kotlin.reflect.jvm.internal.impl.name.f> collection, yh.l<? super w, String> lVar, f... fVarArr) {
        this.f128200a = fVar;
        this.f128201b = regex;
        this.f128202c = collection;
        this.f128203d = lVar;
        this.f128204e = fVarArr;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Checks(@dl.d kotlin.reflect.jvm.internal.impl.name.f name, @dl.d f[] checks, @dl.d yh.l<? super w, String> additionalChecks) {
        this(name, (Regex) null, (Collection<kotlin.reflect.jvm.internal.impl.name.f>) null, additionalChecks, (f[]) Arrays.copyOf(checks, checks.length));
        f0.p(name, "name");
        f0.p(checks, "checks");
        f0.p(additionalChecks, "additionalChecks");
    }

    public /* synthetic */ Checks(kotlin.reflect.jvm.internal.impl.name.f fVar, f[] fVarArr, yh.l lVar, int i10, u uVar) {
        this(fVar, fVarArr, (yh.l<? super w, String>) ((i10 & 4) != 0 ? new yh.l() { // from class: kotlin.reflect.jvm.internal.impl.util.Checks.2
            @Override // yh.l
            @dl.e
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Void invoke(@dl.d w wVar) {
                f0.p(wVar, "$this$null");
                return null;
            }
        } : lVar));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Checks(@dl.d Regex regex, @dl.d f[] checks, @dl.d yh.l<? super w, String> additionalChecks) {
        this((kotlin.reflect.jvm.internal.impl.name.f) null, regex, (Collection<kotlin.reflect.jvm.internal.impl.name.f>) null, additionalChecks, (f[]) Arrays.copyOf(checks, checks.length));
        f0.p(regex, "regex");
        f0.p(checks, "checks");
        f0.p(additionalChecks, "additionalChecks");
    }

    public /* synthetic */ Checks(Regex regex, f[] fVarArr, yh.l lVar, int i10, u uVar) {
        this(regex, fVarArr, (yh.l<? super w, String>) ((i10 & 4) != 0 ? new yh.l() { // from class: kotlin.reflect.jvm.internal.impl.util.Checks.3
            @Override // yh.l
            @dl.e
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Void invoke(@dl.d w wVar) {
                f0.p(wVar, "$this$null");
                return null;
            }
        } : lVar));
    }

    @dl.d
    public final g a(@dl.d w functionDescriptor) {
        f0.p(functionDescriptor, "functionDescriptor");
        for (f fVar : this.f128204e) {
            String strA = fVar.a(functionDescriptor);
            if (strA != null) {
                return new g.b(strA);
            }
        }
        String strInvoke = this.f128203d.invoke(functionDescriptor);
        return strInvoke != null ? new g.b(strInvoke) : g.c.f128236b;
    }

    public final boolean b(@dl.d w functionDescriptor) {
        f0.p(functionDescriptor, "functionDescriptor");
        if (this.f128200a != null && !f0.g(functionDescriptor.getName(), this.f128200a)) {
            return false;
        }
        if (this.f128201b != null) {
            String strB = functionDescriptor.getName().b();
            f0.o(strB, "functionDescriptor.name.asString()");
            if (!this.f128201b.k(strB)) {
                return false;
            }
        }
        Collection<kotlin.reflect.jvm.internal.impl.name.f> collection = this.f128202c;
        return collection == null || collection.contains(functionDescriptor.getName());
    }
}
