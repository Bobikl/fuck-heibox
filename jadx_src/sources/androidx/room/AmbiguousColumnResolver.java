package androidx.room;

import androidx.annotation.RestrictTo;
import com.alipay.zoloz.toyger.face.ToygerFaceAlgorithmConfig;
import com.max.xiaoheihe.module.littleprogram.fragment.pubg.PUBGCommonContainerFragment;
import com.starlightc.ucropplus.ui.UCropPlusActivity;
import com.umeng.analytics.pro.ak;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: AmbiguousColumnResolver.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001:\u0003\u0019\u001c\u0011B\t\b\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ7\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0002H\u0007¢\u0006\u0004\b\u0007\u0010\bJQ\u0010\u0011\u001a\u00020\u000f2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022$\u0010\u0010\u001a \u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0004\u0012\u00020\u000f0\rH\u0002¢\u0006\u0004\b\u0011\u0010\u0012JV\u0010\u0019\u001a\u00020\u000f\"\u0004\b\u0000\u0010\u00132\u0012\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t0\t2\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u00142\b\b\u0002\u0010\u0016\u001a\u00020\u000e2\u0018\u0010\u0018\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t\u0012\u0004\u0012\u00020\u000f0\u0017H\u0002¨\u0006\u001d"}, d2 = {"Landroidx/room/AmbiguousColumnResolver;", "", "", "", "resultColumns", "mappings", "", "d", "([Ljava/lang/String;[[Ljava/lang/String;)[[I", "", "Landroidx/room/AmbiguousColumnResolver$b;", "content", org.apache.tools.ant.types.selectors.m.f136546u, "Lkotlin/Function3;", "", "Lkotlin/b2;", "onHashMatch", ak.aF, "(Ljava/util/List;[Ljava/lang/String;Lyh/q;)V", androidx.exifinterface.media.a.f23244d5, "", org.apache.tools.ant.taskdefs.optional.vss.g.H2, ToygerFaceAlgorithmConfig.DEPTH, "Lkotlin/Function1;", "block", ak.av, "<init>", "()V", "b", "room-common"}, k = 1, mv = {1, 7, 1})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class AmbiguousColumnResolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final AmbiguousColumnResolver f26850a = new AmbiguousColumnResolver();

    /* JADX INFO: compiled from: AmbiguousColumnResolver.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\n\u001a\u00020\t\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\r\u0010\u000eR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\u0004\u0010\f¨\u0006\u000f"}, d2 = {"Landroidx/room/AmbiguousColumnResolver$a;", "", "", "", "b", "Ljava/util/List;", ak.av, "()Ljava/util/List;", "resultIndices", "Lfi/l;", "resultRange", "Lfi/l;", "()Lfi/l;", "<init>", "(Lfi/l;Ljava/util/List;)V", "room-common"}, k = 1, mv = {1, 7, 1})
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @dl.d
        private final fi.l f26851a;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private final List<Integer> resultIndices;

        public a(@dl.d fi.l resultRange, @dl.d List<Integer> resultIndices) {
            kotlin.jvm.internal.f0.p(resultRange, "resultRange");
            kotlin.jvm.internal.f0.p(resultIndices, "resultIndices");
            this.f26851a = resultRange;
            this.resultIndices = resultIndices;
        }

        @dl.d
        public final List<Integer> a() {
            return this.resultIndices;
        }

        @dl.d
        /* JADX INFO: renamed from: b, reason: from getter */
        public final fi.l getF26851a() {
            return this.f26851a;
        }
    }

    /* JADX INFO: renamed from: androidx.room.AmbiguousColumnResolver$b, reason: from toString */
    /* JADX INFO: compiled from: AmbiguousColumnResolver.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\n\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\t\u0010\t\u001a\u00020\u0002HÖ\u0001J\t\u0010\n\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"Landroidx/room/AmbiguousColumnResolver$b;", "", "", ak.av, "", "b", "name", UCropPlusActivity.ARG_INDEX, ak.aF, "toString", "hashCode", "other", "", "equals", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "I", "e", "()I", "<init>", "(Ljava/lang/String;I)V", "room-common"}, k = 1, mv = {1, 7, 1})
    public static final /* data */ class ResultColumn {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        @dl.d
        private final String name;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final int index;

        public ResultColumn(@dl.d String name, int i10) {
            kotlin.jvm.internal.f0.p(name, "name");
            this.name = name;
            this.index = i10;
        }

        public static /* synthetic */ ResultColumn d(ResultColumn resultColumn, String str, int i10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = resultColumn.name;
            }
            if ((i11 & 2) != 0) {
                i10 = resultColumn.index;
            }
            return resultColumn.c(str, i10);
        }

        @dl.d
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getIndex() {
            return this.index;
        }

        @dl.d
        public final ResultColumn c(@dl.d String name, int index) {
            kotlin.jvm.internal.f0.p(name, "name");
            return new ResultColumn(name, index);
        }

        public final int e() {
            return this.index;
        }

        public boolean equals(@dl.e Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ResultColumn)) {
                return false;
            }
            ResultColumn resultColumn = (ResultColumn) other;
            return kotlin.jvm.internal.f0.g(this.name, resultColumn.name) && this.index == resultColumn.index;
        }

        @dl.d
        public final String f() {
            return this.name;
        }

        public int hashCode() {
            return (this.name.hashCode() * 31) + this.index;
        }

        @dl.d
        public String toString() {
            return "ResultColumn(name=" + this.name + ", index=" + this.index + ')';
        }
    }

    /* JADX INFO: compiled from: AmbiguousColumnResolver.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0002\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0013B%\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0011\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0000H\u0096\u0002R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0017\u0010\u000e\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\rR\u0017\u0010\u0010\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\b\u0010\f\u001a\u0004\b\u000f\u0010\r¨\u0006\u0014"}, d2 = {"Landroidx/room/AmbiguousColumnResolver$c;", "", "other", "", "b", "", "Landroidx/room/AmbiguousColumnResolver$a;", "Ljava/util/List;", "d", "()Ljava/util/List;", PUBGCommonContainerFragment.f89169x, ak.aF, "I", "()I", "coverageOffset", "e", "overlaps", "<init>", "(Ljava/util/List;II)V", ak.av, "room-common"}, k = 1, mv = {1, 7, 1})
    public static final class c implements Comparable<c> {

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        @dl.d
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @dl.d
        private static final c f26856f = new c(CollectionsKt__CollectionsKt.E(), Integer.MAX_VALUE, Integer.MAX_VALUE);

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private final List<a> matches;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final int coverageOffset;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final int overlaps;

        /* JADX INFO: renamed from: androidx.room.AmbiguousColumnResolver$c$a, reason: from kotlin metadata */
        /* JADX INFO: compiled from: AmbiguousColumnResolver.kt */
        @Metadata(bv = {}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0014\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Landroidx/room/AmbiguousColumnResolver$c$a;", "", "", "Landroidx/room/AmbiguousColumnResolver$a;", PUBGCommonContainerFragment.f89169x, "Landroidx/room/AmbiguousColumnResolver$c;", ak.av, "NO_SOLUTION", "Landroidx/room/AmbiguousColumnResolver$c;", "b", "()Landroidx/room/AmbiguousColumnResolver$c;", "<init>", "()V", "room-common"}, k = 1, mv = {1, 7, 1})
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.u uVar) {
                this();
            }

            @dl.d
            public final c a(@dl.d List<a> matches) {
                boolean z10;
                kotlin.jvm.internal.f0.p(matches, "matches");
                int i10 = 0;
                int i11 = 0;
                for (a aVar : matches) {
                    i11 += ((aVar.getF26851a().i() - aVar.getF26851a().h()) + 1) - aVar.a().size();
                }
                Iterator<T> it = matches.iterator();
                if (!it.hasNext()) {
                    throw new NoSuchElementException();
                }
                int iH = ((a) it.next()).getF26851a().h();
                while (it.hasNext()) {
                    int iH2 = ((a) it.next()).getF26851a().h();
                    if (iH > iH2) {
                        iH = iH2;
                    }
                }
                Iterator<T> it2 = matches.iterator();
                if (!it2.hasNext()) {
                    throw new NoSuchElementException();
                }
                int i12 = ((a) it2.next()).getF26851a().i();
                while (it2.hasNext()) {
                    int i13 = ((a) it2.next()).getF26851a().i();
                    if (i12 < i13) {
                        i12 = i13;
                    }
                }
                Iterable lVar = new fi.l(iH, i12);
                if (!(lVar instanceof Collection) || !((Collection) lVar).isEmpty()) {
                    Iterator it3 = lVar.iterator();
                    int i14 = 0;
                    while (it3.hasNext()) {
                        int iNextInt = ((kotlin.collections.k0) it3).nextInt();
                        Iterator<T> it4 = matches.iterator();
                        int i15 = 0;
                        while (true) {
                            if (!it4.hasNext()) {
                                z10 = false;
                                break;
                            }
                            if (((a) it4.next()).getF26851a().s(iNextInt)) {
                                i15++;
                            }
                            if (i15 > 1) {
                                z10 = true;
                                break;
                            }
                        }
                        if (z10 && (i14 = i14 + 1) < 0) {
                            CollectionsKt__CollectionsKt.V();
                        }
                    }
                    i10 = i14;
                }
                return new c(matches, i11, i10);
            }

            @dl.d
            public final c b() {
                return c.f26856f;
            }
        }

        public c(@dl.d List<a> matches, int i10, int i11) {
            kotlin.jvm.internal.f0.p(matches, "matches");
            this.matches = matches;
            this.coverageOffset = i10;
            this.overlaps = i11;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public int compareTo(@dl.d c other) {
            kotlin.jvm.internal.f0.p(other, "other");
            int iT = kotlin.jvm.internal.f0.t(this.overlaps, other.overlaps);
            return iT != 0 ? iT : kotlin.jvm.internal.f0.t(this.coverageOffset, other.coverageOffset);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final int getCoverageOffset() {
            return this.coverageOffset;
        }

        @dl.d
        public final List<a> d() {
            return this.matches;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final int getOverlaps() {
            return this.overlaps;
        }
    }

    private AmbiguousColumnResolver() {
    }

    private final <T> void a(List<? extends List<? extends T>> list, List<T> list2, int i10, yh.l<? super List<? extends T>, kotlin.b2> lVar) {
        if (i10 == list.size()) {
            lVar.invoke(CollectionsKt___CollectionsKt.Q5(list2));
            return;
        }
        Iterator<T> it = list.get(i10).iterator();
        while (it.hasNext()) {
            list2.add(it.next());
            f26850a.a(list, list2, i10 + 1, lVar);
            kotlin.collections.x.L0(list2);
        }
    }

    static /* synthetic */ void b(AmbiguousColumnResolver ambiguousColumnResolver, List list, List list2, int i10, yh.l lVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            list2 = new ArrayList();
        }
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        ambiguousColumnResolver.a(list, list2, i10, lVar);
    }

    private final void c(List<ResultColumn> content, String[] pattern, yh.q<? super Integer, ? super Integer, ? super List<ResultColumn>, kotlin.b2> onHashMatch) {
        int i10 = 0;
        int iHashCode = 0;
        for (String str : pattern) {
            iHashCode += str.hashCode();
        }
        int length = pattern.length;
        Iterator<T> it = content.subList(0, length).iterator();
        int iHashCode2 = 0;
        while (it.hasNext()) {
            iHashCode2 += ((ResultColumn) it.next()).f().hashCode();
        }
        while (true) {
            if (iHashCode == iHashCode2) {
                onHashMatch.invoke(Integer.valueOf(i10), Integer.valueOf(length), content.subList(i10, length));
            }
            i10++;
            length++;
            if (length > content.size()) {
                return;
            } else {
                iHashCode2 = (iHashCode2 - content.get(i10 - 1).f().hashCode()) + content.get(length - 1).f().hashCode();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [T, androidx.room.AmbiguousColumnResolver$c] */
    @dl.d
    @xh.m
    public static final int[][] d(@dl.d String[] resultColumns, @dl.d String[][] mappings) {
        boolean z10;
        kotlin.jvm.internal.f0.p(resultColumns, "resultColumns");
        kotlin.jvm.internal.f0.p(mappings, "mappings");
        int length = resultColumns.length;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            z10 = true;
            if (i11 >= length) {
                break;
            }
            String strSubstring = resultColumns[i11];
            if (strSubstring.charAt(0) == '`' && strSubstring.charAt(strSubstring.length() - 1) == '`') {
                strSubstring = strSubstring.substring(1, strSubstring.length() - 1);
                kotlin.jvm.internal.f0.o(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            }
            Locale US = Locale.US;
            kotlin.jvm.internal.f0.o(US, "US");
            String lowerCase = strSubstring.toLowerCase(US);
            kotlin.jvm.internal.f0.o(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            resultColumns[i11] = lowerCase;
            i11++;
        }
        int length2 = mappings.length;
        for (int i12 = 0; i12 < length2; i12++) {
            int length3 = mappings[i12].length;
            for (int i13 = 0; i13 < length3; i13++) {
                String[] strArr = mappings[i12];
                String str = strArr[i13];
                Locale US2 = Locale.US;
                kotlin.jvm.internal.f0.o(US2, "US");
                String lowerCase2 = str.toLowerCase(US2);
                kotlin.jvm.internal.f0.o(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
                strArr[i13] = lowerCase2;
            }
        }
        Set setD = kotlin.collections.c1.d();
        for (String[] strArr2 : mappings) {
            kotlin.collections.x.p0(setD, strArr2);
        }
        Set setA = kotlin.collections.c1.a(setD);
        List listI = kotlin.collections.s.i();
        int length4 = resultColumns.length;
        int i14 = 0;
        int i15 = 0;
        while (i14 < length4) {
            String str2 = resultColumns[i14];
            int i16 = i15 + 1;
            if (setA.contains(str2)) {
                listI.add(new ResultColumn(str2, i15));
            }
            i14++;
            i15 = i16;
        }
        List<ResultColumn> listA = kotlin.collections.s.a(listI);
        int length5 = mappings.length;
        final ArrayList arrayList = new ArrayList(length5);
        for (int i17 = 0; i17 < length5; i17++) {
            arrayList.add(new ArrayList());
        }
        int length6 = mappings.length;
        int i18 = 0;
        final int i19 = 0;
        while (i18 < length6) {
            final String[] strArr3 = mappings[i18];
            int i20 = i19 + 1;
            f26850a.c(listA, strArr3, new yh.q<Integer, Integer, List<? extends ResultColumn>, kotlin.b2>() { // from class: androidx.room.AmbiguousColumnResolver$resolve$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(3);
                }

                public final void a(int i21, int i22, @dl.d List<AmbiguousColumnResolver.ResultColumn> resultColumnsSublist) {
                    Object next;
                    kotlin.jvm.internal.f0.p(resultColumnsSublist, "resultColumnsSublist");
                    String[] strArr4 = strArr3;
                    ArrayList arrayList2 = new ArrayList(strArr4.length);
                    for (String str3 : strArr4) {
                        Iterator<T> it = resultColumnsSublist.iterator();
                        do {
                            if (!it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                        } while (!kotlin.jvm.internal.f0.g(str3, ((AmbiguousColumnResolver.ResultColumn) next).getName()));
                        AmbiguousColumnResolver.ResultColumn resultColumn = (AmbiguousColumnResolver.ResultColumn) next;
                        if (resultColumn == null) {
                            return;
                        }
                        arrayList2.add(Integer.valueOf(resultColumn.e()));
                    }
                    arrayList.get(i19).add(new AmbiguousColumnResolver.a(new fi.l(i21, i22 - 1), arrayList2));
                }

                @Override // yh.q
                public /* bridge */ /* synthetic */ kotlin.b2 invoke(Integer num, Integer num2, List<? extends AmbiguousColumnResolver.ResultColumn> list) {
                    a(num.intValue(), num2.intValue(), list);
                    return kotlin.b2.f124493a;
                }
            });
            if (((List) arrayList.get(i19)).isEmpty()) {
                ArrayList arrayList2 = new ArrayList(strArr3.length);
                int length7 = strArr3.length;
                for (int i21 = i10; i21 < length7; i21++) {
                    String str3 = strArr3[i21];
                    List listI2 = kotlin.collections.s.i();
                    for (ResultColumn resultColumn : listA) {
                        if (kotlin.jvm.internal.f0.g(str3, resultColumn.f())) {
                            listI2.add(Integer.valueOf(resultColumn.e()));
                        }
                    }
                    List listA2 = kotlin.collections.s.a(listI2);
                    if (!(!listA2.isEmpty())) {
                        throw new IllegalStateException(("Column " + str3 + " not found in result").toString());
                    }
                    arrayList2.add(listA2);
                }
                b(f26850a, arrayList2, null, 0, new yh.l<List<? extends Integer>, kotlin.b2>() { // from class: androidx.room.AmbiguousColumnResolver$resolve$1$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    public final void a(@dl.d List<Integer> indices) {
                        kotlin.jvm.internal.f0.p(indices, "indices");
                        Iterator<T> it = indices.iterator();
                        if (!it.hasNext()) {
                            throw new NoSuchElementException();
                        }
                        int iIntValue = ((Number) it.next()).intValue();
                        while (it.hasNext()) {
                            int iIntValue2 = ((Number) it.next()).intValue();
                            if (iIntValue > iIntValue2) {
                                iIntValue = iIntValue2;
                            }
                        }
                        Iterator<T> it2 = indices.iterator();
                        if (!it2.hasNext()) {
                            throw new NoSuchElementException();
                        }
                        int iIntValue3 = ((Number) it2.next()).intValue();
                        while (it2.hasNext()) {
                            int iIntValue4 = ((Number) it2.next()).intValue();
                            if (iIntValue3 < iIntValue4) {
                                iIntValue3 = iIntValue4;
                            }
                        }
                        arrayList.get(i19).add(new AmbiguousColumnResolver.a(new fi.l(iIntValue, iIntValue3), indices));
                    }

                    @Override // yh.l
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(List<? extends Integer> list) {
                        a(list);
                        return kotlin.b2.f124493a;
                    }
                }, 6, null);
            }
            i18++;
            i19 = i20;
            i10 = 0;
        }
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (!(!((List) it.next()).isEmpty())) {
                    z10 = false;
                    break;
                }
            }
        }
        if (!z10) {
            throw new IllegalStateException("Failed to find matches for all mappings".toString());
        }
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.f124891b = c.INSTANCE.b();
        b(f26850a, arrayList, null, 0, new yh.l<List<? extends a>, kotlin.b2>() { // from class: androidx.room.AmbiguousColumnResolver$resolve$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX WARN: Type inference failed for: r2v1, types: [T, androidx.room.AmbiguousColumnResolver$c] */
            public final void a(@dl.d List<AmbiguousColumnResolver.a> it2) {
                kotlin.jvm.internal.f0.p(it2, "it");
                ?? A = AmbiguousColumnResolver.c.INSTANCE.a(it2);
                if (A.compareTo(objectRef.f124891b) < 0) {
                    objectRef.f124891b = A;
                }
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ kotlin.b2 invoke(List<? extends AmbiguousColumnResolver.a> list) {
                a(list);
                return kotlin.b2.f124493a;
            }
        }, 6, null);
        List<a> listD = ((c) objectRef.f124891b).d();
        ArrayList arrayList3 = new ArrayList(kotlin.collections.t.Y(listD, 10));
        Iterator<T> it2 = listD.iterator();
        while (it2.hasNext()) {
            arrayList3.add(CollectionsKt___CollectionsKt.P5(((a) it2.next()).a()));
        }
        Object[] array = arrayList3.toArray(new int[0][]);
        kotlin.jvm.internal.f0.n(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        return (int[][]) array;
    }
}
