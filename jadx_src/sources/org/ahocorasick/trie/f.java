package org.ahocorasick.trie;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;

/* JADX INFO: compiled from: Trie.java */
/* JADX INFO: loaded from: classes5.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private g f132795a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private d f132796b;

    /* JADX INFO: compiled from: Trie.java */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private g f132797a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private f f132798b;

        private b() {
            g gVar = new g();
            this.f132797a = gVar;
            this.f132798b = new f(gVar);
        }

        public b a(String str) {
            this.f132798b.d(str);
            return this;
        }

        public f b() {
            this.f132798b.f();
            return this.f132798b;
        }

        public b c() {
            this.f132797a.g(true);
            return this;
        }

        public b d() {
            this.f132797a.h(true);
            return this;
        }

        public b e() {
            this.f132797a.i(true);
            return this;
        }

        public b f() {
            this.f132797a.f(false);
            return this;
        }

        public b g() {
            this.f132798b.f132795a.j(true);
            return this;
        }
    }

    private f(g gVar) {
        this.f132795a = gVar;
        this.f132796b = new d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(String str) {
        if (str == null || str.length() == 0) {
            return;
        }
        d dVarC = this.f132796b;
        for (char c10 : str.toCharArray()) {
            Character chValueOf = Character.valueOf(c10);
            if (this.f132795a.b()) {
                chValueOf = Character.valueOf(Character.toLowerCase(chValueOf.charValue()));
            }
            dVarC = dVarC.c(chValueOf);
        }
        if (this.f132795a.b()) {
            str = str.toLowerCase();
        }
        dVarC.a(str);
    }

    public static b e() {
        return new b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        LinkedBlockingDeque linkedBlockingDeque = new LinkedBlockingDeque();
        for (d dVar : this.f132796b.g()) {
            dVar.l(this.f132796b);
            linkedBlockingDeque.add(dVar);
        }
        while (!linkedBlockingDeque.isEmpty()) {
            d dVar2 = (d) linkedBlockingDeque.remove();
            for (Character ch2 : dVar2.h()) {
                d dVarI = dVar2.i(ch2);
                linkedBlockingDeque.add(dVarI);
                d dVarE = dVar2.e();
                while (dVarE.i(ch2) == null) {
                    dVarE = dVarE.e();
                }
                d dVarI2 = dVarE.i(ch2);
                dVarI.l(dVarI2);
                dVarI.b(dVarI2.d());
            }
        }
    }

    private e h(org.ahocorasick.trie.a aVar, String str, int i10) {
        return new org.ahocorasick.trie.b(str.substring(i10 + 1, aVar == null ? str.length() : aVar.D()));
    }

    private e i(org.ahocorasick.trie.a aVar, String str) {
        return new c(str.substring(aVar.D(), aVar.G() + 1), aVar);
    }

    private d k(d dVar, Character ch2) {
        d dVarI = dVar.i(ch2);
        while (dVarI == null) {
            dVar = dVar.e();
            dVarI = dVar.i(ch2);
        }
        return dVarI;
    }

    private boolean l(CharSequence charSequence, org.ahocorasick.trie.a aVar) {
        if (aVar.D() == 0 || !Character.isAlphabetic(charSequence.charAt(aVar.D() - 1))) {
            return aVar.G() + 1 != charSequence.length() && Character.isAlphabetic(charSequence.charAt(aVar.G() + 1));
        }
        return true;
    }

    private void o(CharSequence charSequence, List<org.ahocorasick.trie.a> list) {
        ArrayList arrayList = new ArrayList();
        for (org.ahocorasick.trie.a aVar : list) {
            if (l(charSequence, aVar)) {
                arrayList.add(aVar);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            list.remove((org.ahocorasick.trie.a) it.next());
        }
    }

    private void p(CharSequence charSequence, List<org.ahocorasick.trie.a> list) {
        long length = charSequence.length();
        ArrayList arrayList = new ArrayList();
        for (org.ahocorasick.trie.a aVar : list) {
            if ((aVar.D() != 0 && !Character.isWhitespace(charSequence.charAt(aVar.D() - 1))) || (aVar.G() + 1 != length && !Character.isWhitespace(charSequence.charAt(aVar.G() + 1)))) {
                arrayList.add(aVar);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            list.remove((org.ahocorasick.trie.a) it.next());
        }
    }

    private boolean q(int i10, d dVar, lj.b bVar) {
        Collection<String> collectionD = dVar.d();
        boolean z10 = false;
        if (collectionD != null && !collectionD.isEmpty()) {
            for (String str : collectionD) {
                bVar.a(new org.ahocorasick.trie.a((i10 - str.length()) + 1, i10, str));
                z10 = true;
            }
        }
        return z10;
    }

    public boolean g(CharSequence charSequence) {
        return j(charSequence) != null;
    }

    public org.ahocorasick.trie.a j(CharSequence charSequence) {
        if (!this.f132795a.a()) {
            Collection<org.ahocorasick.trie.a> collectionM = m(charSequence);
            if (collectionM == null || collectionM.isEmpty()) {
                return null;
            }
            return collectionM.iterator().next();
        }
        d dVarK = this.f132796b;
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            Character chValueOf = Character.valueOf(charSequence.charAt(i10));
            if (this.f132795a.b()) {
                chValueOf = Character.valueOf(Character.toLowerCase(chValueOf.charValue()));
            }
            dVarK = k(dVarK, chValueOf);
            Collection<String> collectionD = dVarK.d();
            if (collectionD != null && !collectionD.isEmpty()) {
                for (String str : collectionD) {
                    org.ahocorasick.trie.a aVar = new org.ahocorasick.trie.a((i10 - str.length()) + 1, i10, str);
                    if (!this.f132795a.c() || !l(charSequence, aVar)) {
                        return aVar;
                    }
                }
            }
        }
        return null;
    }

    public Collection<org.ahocorasick.trie.a> m(CharSequence charSequence) {
        lj.a aVar = new lj.a();
        n(charSequence, aVar);
        List<org.ahocorasick.trie.a> listB = aVar.b();
        if (this.f132795a.c()) {
            o(charSequence, listB);
        }
        if (this.f132795a.d()) {
            p(charSequence, listB);
        }
        if (!this.f132795a.a()) {
            new org.ahocorasick.interval.b(listB).b(listB);
        }
        return listB;
    }

    public void n(CharSequence charSequence, lj.b bVar) {
        d dVarK = this.f132796b;
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            Character chValueOf = Character.valueOf(charSequence.charAt(i10));
            if (this.f132795a.b()) {
                chValueOf = Character.valueOf(Character.toLowerCase(chValueOf.charValue()));
            }
            dVarK = k(dVarK, chValueOf);
            if (q(i10, dVarK, bVar) && this.f132795a.e()) {
                return;
            }
        }
    }

    public Collection<e> r(String str) {
        ArrayList arrayList = new ArrayList();
        int iG = -1;
        for (org.ahocorasick.trie.a aVar : m(str)) {
            if (aVar.D() - iG > 1) {
                arrayList.add(h(aVar, str, iG));
            }
            arrayList.add(i(aVar, str));
            iG = aVar.G();
        }
        if (str.length() - iG > 1) {
            arrayList.add(h(null, str, iG));
        }
        return arrayList;
    }
}
