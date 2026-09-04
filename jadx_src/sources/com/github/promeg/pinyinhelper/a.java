package com.github.promeg.pinyinhelper;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: compiled from: Engine.java */
/* JADX INFO: loaded from: classes6.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final C0369a f43469a = new C0369a();

    /* JADX INFO: renamed from: com.github.promeg.pinyinhelper.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: Engine.java */
    public static final class C0369a implements Comparator<org.ahocorasick.trie.a> {
        C0369a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(org.ahocorasick.trie.a aVar, org.ahocorasick.trie.a aVar2) {
            if (aVar.D() == aVar2.D()) {
                if (aVar.size() < aVar2.size()) {
                    return 1;
                }
                return aVar.size() == aVar2.size() ? 0 : -1;
            }
            if (aVar.D() < aVar2.D()) {
                return -1;
            }
            return aVar.D() == aVar2.D() ? 0 : 1;
        }
    }

    private a() {
    }

    static String[] a(String str, List<h> list) {
        if (list != null) {
            for (h hVar : list) {
                if (hVar != null && hVar.a() != null && hVar.a().contains(str)) {
                    return hVar.b(str);
                }
            }
        }
        throw new IllegalArgumentException("No pinyin dict contains word: " + str);
    }

    static String b(String str, org.ahocorasick.trie.f fVar, List<h> list, String str2, j jVar) {
        if (str == null || str.length() == 0) {
            return str;
        }
        if (fVar == null || jVar == null) {
            StringBuffer stringBuffer = new StringBuffer();
            for (int i10 = 0; i10 < str.length(); i10++) {
                stringBuffer.append(c.g(str.charAt(i10)));
                if (i10 != str.length() - 1) {
                    stringBuffer.append(str2);
                }
            }
            return stringBuffer.toString();
        }
        List<org.ahocorasick.trie.a> listA = jVar.a(fVar.m(str));
        Collections.sort(listA, f43469a);
        StringBuffer stringBuffer2 = new StringBuffer();
        int size = 0;
        int i11 = 0;
        while (size < str.length()) {
            if (i11 >= listA.size() || size != listA.get(i11).D()) {
                stringBuffer2.append(c.g(str.charAt(size)));
                size++;
            } else {
                String[] strArrA = a(listA.get(i11).c(), list);
                for (int i12 = 0; i12 < strArrA.length; i12++) {
                    stringBuffer2.append(strArrA[i12].toUpperCase());
                    if (i12 != strArrA.length - 1) {
                        stringBuffer2.append(str2);
                    }
                }
                size += listA.get(i11).size();
                i11++;
            }
            if (size != str.length()) {
                stringBuffer2.append(str2);
            }
        }
        return stringBuffer2.toString();
    }
}
