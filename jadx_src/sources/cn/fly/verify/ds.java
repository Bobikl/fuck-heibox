package cn.fly.verify;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes6.dex */
public class ds {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f36153a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f36154b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private dl f36155c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f36156d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f36157e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private dp f36158f;

    public static class a implements dm<a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Throwable f36159a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f36160b;

        public boolean a() {
            return this.f36159a != null;
        }

        @Override // cn.fly.verify.dm
        public boolean a(a aVar, Class<a> cls, String str, Object[] objArr, boolean[] zArr, Object[] objArr2, Throwable[] thArr) {
            if ("isError".equals(str) && objArr.length == 0) {
                objArr2[0] = Boolean.valueOf(aVar.a());
                return true;
            }
            if ("getError".equals(str) && objArr.length == 0) {
                objArr2[0] = aVar.f36159a;
                return true;
            }
            if (!"getResult".equals(str) || objArr.length != 0) {
                return false;
            }
            objArr2[0] = aVar.f36160b;
            return true;
        }
    }

    public ds(String str, int i10, ArrayList<dr> arrayList, ArrayList<Object> arrayList2, int i11, int i12, dl dlVar) {
        this.f36153a = str;
        this.f36154b = i10;
        this.f36158f = new dp(arrayList, arrayList2);
        this.f36156d = i11;
        this.f36157e = i12;
        this.f36155c = dlVar;
    }

    public static ds a(String str, int i10, ArrayList<dr> arrayList, ArrayList<Object> arrayList2, int i11, int i12, dl dlVar) {
        return new ds(str, i10, arrayList, arrayList2, i11, i12, dlVar) { // from class: cn.fly.verify.ds.1
            @Override // cn.fly.verify.ds
            public LinkedList<Object> b(Object... objArr) throws Throwable {
                return new LinkedList<>();
            }
        };
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:29:? A[RETURN, SYNTHETIC] */
    private void a(String str, int i10, ArrayList<dr> arrayList, int i11) {
        dr drVar;
        dr drVar2;
        if (i11 != 0) {
            dr drVar3 = new dr(29);
            drVar3.f36128b = str;
            drVar3.f36129c = i10;
            drVar3.f36135i = 1;
            arrayList.add(drVar3);
        }
        dr drVar4 = new dr(1);
        drVar4.f36128b = str;
        drVar4.f36129c = i10;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("arg");
        int i12 = i11 + 1;
        sb2.append(i12);
        drVar4.f36134h = sb2.toString();
        arrayList.add(drVar4);
        int i13 = this.f36154b;
        if (i11 >= i13 - 1) {
            for (int i14 = i13 - 1; i14 >= 0; i14 += -1) {
                dr drVar5 = new dr(3);
                drVar5.f36128b = str;
                drVar5.f36129c = i10;
                drVar5.f36134h = "arg" + (i14 + 1);
                arrayList.add(drVar5);
            }
            if (this.f36153a == null) {
                dr drVar6 = new dr(2);
                drVar6.f36128b = str;
                drVar6.f36129c = i10;
                drVar6.f36143q = this;
                arrayList.add(drVar6);
                drVar = new dr(32);
                drVar.f36128b = str;
                drVar.f36129c = i10;
            } else {
                drVar = new dr(31);
                drVar.f36128b = str;
                drVar.f36129c = i10;
                drVar.f36134h = this.f36153a;
            }
            drVar.f36135i = this.f36154b;
            arrayList.add(drVar);
            Iterator<dr> it = this.f36158f.a().iterator();
            while (it.hasNext()) {
                if (it.next().f36127a == 28) {
                    drVar2 = new dr(28);
                }
            }
            if (i11 != 0) {
                dr drVar7 = new dr(30);
                drVar7.f36128b = str;
                drVar7.f36129c = i10;
                arrayList.add(drVar7);
            }
        }
        a(str, i10, arrayList, i12);
        drVar2 = new dr(28);
        drVar2.f36128b = str;
        drVar2.f36129c = i10;
        arrayList.add(drVar2);
        if (i11 != 0) {
            dr drVar8 = new dr(30);
            drVar8.f36128b = str;
            drVar8.f36129c = i10;
            arrayList.add(drVar8);
        }
    }

    public a a(Object... objArr) {
        a aVar = new a();
        try {
            LinkedList<Object> linkedListB = b(objArr);
            if (!linkedListB.isEmpty()) {
                aVar.f36160b = linkedListB.get(0);
            }
        } catch (Throwable th2) {
            aVar.f36159a = th2;
        }
        return aVar;
    }

    public ds a(dl dlVar, String str, int i10) {
        if (this.f36154b <= 1) {
            return this;
        }
        ArrayList<dr> arrayList = new ArrayList<>();
        a(str, i10, arrayList, 0);
        return new ds(null, 1, arrayList, new ArrayList(), 0, arrayList.size(), dlVar);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public LinkedList<Object> b(Object... objArr) throws Throwable {
        dl dlVarB = this.f36155c.b();
        int i10 = this.f36154b;
        if (i10 != 0) {
            if (objArr.length == i10) {
                for (int length = objArr.length - 1; length >= 0; length--) {
                    dlVarB.a(objArr[length]);
                }
            } else if (objArr.length < i10) {
                for (int length2 = objArr.length; length2 < this.f36154b; length2++) {
                    dlVarB.a((Object) null);
                }
                for (int length3 = objArr.length - 1; length3 >= 0; length3--) {
                    dlVarB.a(objArr[length3]);
                }
            } else {
                ArrayList arrayList = new ArrayList(0);
                for (int i11 = this.f36154b - 1; i11 < objArr.length; i11++) {
                    arrayList.add(objArr[i11]);
                }
                dlVarB.a(arrayList);
                for (int i12 = this.f36154b - 2; i12 >= 0; i12--) {
                    dlVarB.a(objArr[i12]);
                }
            }
        }
        LinkedList<Object> linkedList = new LinkedList<>();
        this.f36158f.a(this.f36156d, this.f36157e, dlVarB, linkedList);
        return linkedList;
    }
}
