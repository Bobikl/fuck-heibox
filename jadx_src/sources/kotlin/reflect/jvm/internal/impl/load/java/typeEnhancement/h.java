package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import fi.u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.b2;
import kotlin.c1;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.h0;
import kotlin.collections.r0;
import kotlin.collections.t;
import kotlin.jvm.internal.f0;
import kotlin.reflect.jvm.internal.impl.load.kotlin.SignatureBuildingComponents;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;

/* JADX INFO: compiled from: predefinedEnhancementInfo.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final Map<String, g> f126402a = new LinkedHashMap();

    /* JADX INFO: compiled from: predefinedEnhancementInfo.kt */
    public final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @dl.d
        private final String f126403a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ h f126404b;

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.h$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: predefinedEnhancementInfo.kt */
        public final class C1154a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @dl.d
            private final String f126405a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @dl.d
            private final List<Pair<String, k>> f126406b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            @dl.d
            private Pair<String, k> f126407c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ a f126408d;

            public C1154a(@dl.d a aVar, String functionName) {
                f0.p(functionName, "functionName");
                this.f126408d = aVar;
                this.f126405a = functionName;
                this.f126406b = new ArrayList();
                this.f126407c = c1.a(androidx.exifinterface.media.a.X4, null);
            }

            @dl.d
            public final Pair<String, g> a() {
                SignatureBuildingComponents signatureBuildingComponents = SignatureBuildingComponents.f126464a;
                String strB = this.f126408d.b();
                String str = this.f126405a;
                List<Pair<String, k>> list = this.f126406b;
                ArrayList arrayList = new ArrayList(t.Y(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add((String) ((Pair) it.next()).e());
                }
                String strK = signatureBuildingComponents.k(strB, signatureBuildingComponents.j(str, arrayList, this.f126407c.e()));
                k kVarF = this.f126407c.f();
                List<Pair<String, k>> list2 = this.f126406b;
                ArrayList arrayList2 = new ArrayList(t.Y(list2, 10));
                Iterator<T> it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add((k) ((Pair) it2.next()).f());
                }
                return c1.a(strK, new g(kVarF, arrayList2));
            }

            public final void b(@dl.d String type, @dl.d d... qualifiers) {
                k kVar;
                f0.p(type, "type");
                f0.p(qualifiers, "qualifiers");
                List<Pair<String, k>> list = this.f126406b;
                if (qualifiers.length == 0) {
                    kVar = null;
                } else {
                    Iterable<h0> iterableFA = ArraysKt___ArraysKt.fA(qualifiers);
                    LinkedHashMap linkedHashMap = new LinkedHashMap(u.u(r0.j(t.Y(iterableFA, 10)), 16));
                    for (h0 h0Var : iterableFA) {
                        linkedHashMap.put(Integer.valueOf(h0Var.e()), (d) h0Var.f());
                    }
                    kVar = new k(linkedHashMap);
                }
                list.add(c1.a(type, kVar));
            }

            public final void c(@dl.d String type, @dl.d d... qualifiers) {
                f0.p(type, "type");
                f0.p(qualifiers, "qualifiers");
                Iterable<h0> iterableFA = ArraysKt___ArraysKt.fA(qualifiers);
                LinkedHashMap linkedHashMap = new LinkedHashMap(u.u(r0.j(t.Y(iterableFA, 10)), 16));
                for (h0 h0Var : iterableFA) {
                    linkedHashMap.put(Integer.valueOf(h0Var.e()), (d) h0Var.f());
                }
                this.f126407c = c1.a(type, new k(linkedHashMap));
            }

            public final void d(@dl.d JvmPrimitiveType type) {
                f0.p(type, "type");
                String desc = type.getDesc();
                f0.o(desc, "type.desc");
                this.f126407c = c1.a(desc, null);
            }
        }

        public a(@dl.d h hVar, String className) {
            f0.p(className, "className");
            this.f126404b = hVar;
            this.f126403a = className;
        }

        public final void a(@dl.d String name, @dl.d yh.l<? super C1154a, b2> block) {
            f0.p(name, "name");
            f0.p(block, "block");
            Map map = this.f126404b.f126402a;
            C1154a c1154a = new C1154a(this, name);
            block.invoke(c1154a);
            Pair<String, g> pairA = c1154a.a();
            map.put(pairA.e(), pairA.f());
        }

        @dl.d
        public final String b() {
            return this.f126403a;
        }
    }

    @dl.d
    public final Map<String, g> b() {
        return this.f126402a;
    }
}
