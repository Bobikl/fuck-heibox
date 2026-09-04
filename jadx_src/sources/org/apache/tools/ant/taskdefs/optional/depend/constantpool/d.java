package org.apache.tools.ant.taskdefs.optional.depend.constantpool;

import java.io.DataInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.IntFunction;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/* JADX INFO: compiled from: ConstantPool.java */
/* JADX INFO: loaded from: classes5.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<e> f134746a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<String, Integer> f134747b;

    public d() {
        ArrayList arrayList = new ArrayList();
        this.f134746a = arrayList;
        this.f134747b = new HashMap();
        arrayList.add(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String k(int i10) {
        return String.format("[%d] = %s", Integer.valueOf(i10), e(i10));
    }

    public int b(e eVar) {
        int size = this.f134746a.size();
        this.f134746a.add(eVar);
        int iA = eVar.a();
        for (int i10 = 0; i10 < iA - 1; i10++) {
            this.f134746a.add(null);
        }
        if (eVar instanceof s) {
            this.f134747b.put(((s) eVar).g(), Integer.valueOf(size));
        }
        return size;
    }

    public int c(String str) {
        int size = this.f134746a.size();
        int i10 = -1;
        for (int i11 = 0; i11 < size && i10 == -1; i11++) {
            e eVar = this.f134746a.get(i11);
            if ((eVar instanceof a) && ((a) eVar).g().equals(str)) {
                i10 = i11;
            }
        }
        return i10;
    }

    public int d(Object obj) {
        int size = this.f134746a.size();
        int i10 = -1;
        for (int i11 = 0; i11 < size && i10 == -1; i11++) {
            e eVar = this.f134746a.get(i11);
            if ((eVar instanceof b) && ((b) eVar).g().equals(obj)) {
                i10 = i11;
            }
        }
        return i10;
    }

    public e e(int i10) {
        return this.f134746a.get(i10);
    }

    public int f(String str, String str2, String str3) {
        int size = this.f134746a.size();
        int i10 = -1;
        for (int i11 = 0; i11 < size && i10 == -1; i11++) {
            e eVar = this.f134746a.get(i11);
            if (eVar instanceof g) {
                g gVar = (g) eVar;
                if (gVar.g().equals(str) && gVar.h().equals(str2) && gVar.i().equals(str3)) {
                    i10 = i11;
                }
            }
        }
        return i10;
    }

    public int g(String str, String str2, String str3) {
        int size = this.f134746a.size();
        int i10 = -1;
        for (int i11 = 0; i11 < size && i10 == -1; i11++) {
            e eVar = this.f134746a.get(i11);
            if (eVar instanceof j) {
                j jVar = (j) eVar;
                if (jVar.g().equals(str) && jVar.h().equals(str2) && jVar.i().equals(str3)) {
                    i10 = i11;
                }
            }
        }
        return i10;
    }

    public int h(String str, String str2, String str3) {
        int size = this.f134746a.size();
        int i10 = -1;
        for (int i11 = 0; i11 < size && i10 == -1; i11++) {
            e eVar = this.f134746a.get(i11);
            if (eVar instanceof m) {
                m mVar = (m) eVar;
                if (mVar.g().equals(str) && mVar.h().equals(str2) && mVar.i().equals(str3)) {
                    i10 = i11;
                }
            }
        }
        return i10;
    }

    public int i(String str, String str2) {
        int size = this.f134746a.size();
        int i10 = -1;
        for (int i11 = 0; i11 < size && i10 == -1; i11++) {
            e eVar = this.f134746a.get(i11);
            if (eVar instanceof p) {
                p pVar = (p) eVar;
                if (pVar.g().equals(str) && pVar.h().equals(str2)) {
                    i10 = i11;
                }
            }
        }
        return i10;
    }

    public int j(String str) {
        Integer num = this.f134747b.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -1;
    }

    public void l(DataInputStream dataInputStream) throws IOException {
        int unsignedShort = dataInputStream.readUnsignedShort();
        int iA = 1;
        while (iA < unsignedShort) {
            e eVarE = e.e(dataInputStream);
            iA += eVarE.a();
            b(eVarE);
        }
    }

    public void m() {
        for (e eVar : this.f134746a) {
            if (eVar != null && !eVar.c()) {
                eVar.f(this);
            }
        }
    }

    public int n() {
        return this.f134746a.size();
    }

    public String toString() {
        return (String) IntStream.range(0, this.f134746a.size()).mapToObj(new IntFunction() { // from class: org.apache.tools.ant.taskdefs.optional.depend.constantpool.c
            @Override // java.util.function.IntFunction
            public final Object apply(int i10) {
                return this.f134745a.k(i10);
            }
        }).collect(Collectors.joining("\n", "\n", "\n"));
    }
}
