package kotlin.text;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.f0;
import kotlin.sequences.SequencesKt___SequencesKt;

/* JADX INFO: compiled from: Indent.kt */
/* JADX INFO: loaded from: classes5.dex */
public class StringsKt__IndentKt extends n {
    private static final yh.l<String, String> g(final String str) {
        return str.length() == 0 ? new yh.l<String, String>() { // from class: kotlin.text.StringsKt__IndentKt$getIndentFunction$1
            @Override // yh.l
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke(@dl.d String line) {
                f0.p(line, "line");
                return line;
            }
        } : new yh.l<String, String>() { // from class: kotlin.text.StringsKt__IndentKt$getIndentFunction$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // yh.l
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke(@dl.d String line) {
                f0.p(line, "line");
                return str + line;
            }
        };
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001b  */
    /* JADX WARN: Code duplicated, block: B:15:? A[RETURN, SYNTHETIC] */
    private static final int h(String str) {
        int length = str.length();
        int i10 = 0;
        while (i10 < length) {
            if (!b.r(str.charAt(i10))) {
                if (i10 == -1) {
                    return str.length();
                }
                return i10;
            }
            i10++;
        }
        i10 = -1;
        if (i10 == -1) {
            return str.length();
        }
        return i10;
    }

    @dl.d
    public static final String i(@dl.d String str, @dl.d final String indent) {
        f0.p(str, "<this>");
        f0.p(indent, "indent");
        return SequencesKt___SequencesKt.e1(SequencesKt___SequencesKt.k1(StringsKt__StringsKt.L3(str), new yh.l<String, String>() { // from class: kotlin.text.StringsKt__IndentKt$prependIndent$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // yh.l
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke(@dl.d String it) {
                f0.p(it, "it");
                if (u.V1(it)) {
                    return it.length() < indent.length() ? indent : it;
                }
                return indent + it;
            }
        }), "\n", null, null, 0, null, null, 62, null);
    }

    public static /* synthetic */ String j(String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str2 = "    ";
        }
        return i(str, str2);
    }

    private static final String k(List<String> list, int i10, yh.l<? super String, String> lVar, yh.l<? super String, String> lVar2) {
        String strInvoke;
        int iG = CollectionsKt__CollectionsKt.G(list);
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        for (Object obj : list) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                CollectionsKt__CollectionsKt.W();
            }
            String str = (String) obj;
            if ((i11 == 0 || i11 == iG) && u.V1(str)) {
                str = null;
            } else {
                String strInvoke2 = lVar2.invoke(str);
                if (strInvoke2 != null && (strInvoke = lVar.invoke(strInvoke2)) != null) {
                    str = strInvoke;
                }
            }
            if (str != null) {
                arrayList.add(str);
            }
            i11 = i12;
        }
        String string = ((StringBuilder) CollectionsKt___CollectionsKt.e3(arrayList, new StringBuilder(i10), (112 & 2) != 0 ? ", " : "\n", (112 & 4) != 0 ? "" : null, (112 & 8) == 0 ? null : "", (112 & 16) != 0 ? -1 : 0, (112 & 32) != 0 ? "..." : null, (112 & 64) != 0 ? null : null)).toString();
        f0.o(string, "mapIndexedNotNull { inde…\"\\n\")\n        .toString()");
        return string;
    }

    @dl.d
    public static final String l(@dl.d String str, @dl.d String newIndent) {
        String strInvoke;
        f0.p(str, "<this>");
        f0.p(newIndent, "newIndent");
        List<String> listM3 = StringsKt__StringsKt.M3(str);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listM3) {
            if (!u.V1((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(kotlin.collections.t.Y(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(Integer.valueOf(h((String) it.next())));
        }
        Integer num = (Integer) CollectionsKt___CollectionsKt.c4(arrayList2);
        int i10 = 0;
        int iIntValue = num != null ? num.intValue() : 0;
        int length = str.length() + (newIndent.length() * listM3.size());
        yh.l<String, String> lVarG = g(newIndent);
        int iG = CollectionsKt__CollectionsKt.G(listM3);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : listM3) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                CollectionsKt__CollectionsKt.W();
            }
            String str2 = (String) obj2;
            if ((i10 == 0 || i10 == iG) && u.V1(str2)) {
                str2 = null;
            } else {
                String strB6 = StringsKt___StringsKt.B6(str2, iIntValue);
                if (strB6 != null && (strInvoke = lVarG.invoke(strB6)) != null) {
                    str2 = strInvoke;
                }
            }
            if (str2 != null) {
                arrayList3.add(str2);
            }
            i10 = i11;
        }
        String string = ((StringBuilder) CollectionsKt___CollectionsKt.e3(arrayList3, new StringBuilder(length), (112 & 2) != 0 ? ", " : "\n", (112 & 4) != 0 ? "" : null, (112 & 8) == 0 ? null : "", (112 & 16) != 0 ? -1 : 0, (112 & 32) != 0 ? "..." : null, (112 & 64) != 0 ? null : null)).toString();
        f0.o(string, "mapIndexedNotNull { inde…\"\\n\")\n        .toString()");
        return string;
    }

    public static /* synthetic */ String m(String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str2 = "";
        }
        return l(str, str2);
    }

    @dl.d
    public static final String n(@dl.d String str, @dl.d String newIndent, @dl.d String marginPrefix) {
        int i10;
        String strInvoke;
        f0.p(str, "<this>");
        f0.p(newIndent, "newIndent");
        f0.p(marginPrefix, "marginPrefix");
        if (!(!u.V1(marginPrefix))) {
            throw new IllegalArgumentException("marginPrefix must be non-blank string.".toString());
        }
        List<String> listM3 = StringsKt__StringsKt.M3(str);
        int length = str.length() + (newIndent.length() * listM3.size());
        yh.l<String, String> lVarG = g(newIndent);
        int iG = CollectionsKt__CollectionsKt.G(listM3);
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        for (Object obj : listM3) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                CollectionsKt__CollectionsKt.W();
            }
            String str2 = (String) obj;
            String strSubstring = null;
            if ((i11 == 0 || i11 == iG) && u.V1(str2)) {
                str2 = null;
            } else {
                int length2 = str2.length();
                int i13 = 0;
                while (true) {
                    if (i13 >= length2) {
                        i10 = -1;
                        break;
                    }
                    if (!b.r(str2.charAt(i13))) {
                        i10 = i13;
                        break;
                    }
                    i13++;
                }
                if (i10 != -1) {
                    int i14 = i10;
                    if (u.u2(str2, marginPrefix, i10, false, 4, null)) {
                        int length3 = i14 + marginPrefix.length();
                        f0.n(str2, "null cannot be cast to non-null type java.lang.String");
                        strSubstring = str2.substring(length3);
                        f0.o(strSubstring, "this as java.lang.String).substring(startIndex)");
                    }
                }
                if (strSubstring != null && (strInvoke = lVarG.invoke(strSubstring)) != null) {
                    str2 = strInvoke;
                }
            }
            if (str2 != null) {
                arrayList.add(str2);
            }
            i11 = i12;
        }
        String string = ((StringBuilder) CollectionsKt___CollectionsKt.e3(arrayList, new StringBuilder(length), (112 & 2) != 0 ? ", " : "\n", (112 & 4) != 0 ? "" : null, (112 & 8) == 0 ? null : "", (112 & 16) != 0 ? -1 : 0, (112 & 32) != 0 ? "..." : null, (112 & 64) != 0 ? null : null)).toString();
        f0.o(string, "mapIndexedNotNull { inde…\"\\n\")\n        .toString()");
        return string;
    }

    public static /* synthetic */ String o(String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str2 = "";
        }
        if ((i10 & 2) != 0) {
            str3 = "|";
        }
        return n(str, str2, str3);
    }

    @dl.d
    @sh.g
    public static final String p(@dl.d String str) {
        f0.p(str, "<this>");
        return l(str, "");
    }

    @dl.d
    @sh.g
    public static final String q(@dl.d String str, @dl.d String marginPrefix) {
        f0.p(str, "<this>");
        f0.p(marginPrefix, "marginPrefix");
        return n(str, "", marginPrefix);
    }

    public static /* synthetic */ String r(String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str2 = "|";
        }
        return q(str, str2);
    }
}
