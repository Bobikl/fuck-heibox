package androidx.collection;

import com.meituan.robust.Constants;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: IntList.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.t0({"SMAP\nIntList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntList.kt\nandroidx/collection/IntList\n*L\n1#1,969:1\n253#1,6:970\n279#1,6:976\n253#1,6:982\n75#1:988\n253#1,6:989\n253#1,6:995\n253#1,6:1001\n266#1,6:1007\n279#1,6:1013\n293#1,6:1019\n70#1:1025\n70#1:1026\n266#1,6:1027\n266#1,6:1033\n293#1,6:1039\n70#1:1045\n279#1,6:1046\n293#1,6:1052\n266#1,6:1058\n266#1,6:1064\n253#1,6:1070\n75#1:1076\n467#1,10:1077\n266#1,4:1087\n477#1,9:1091\n271#1:1100\n486#1,2:1101\n467#1,10:1103\n266#1,4:1113\n477#1,9:1117\n271#1:1126\n486#1,2:1127\n467#1,10:1129\n266#1,4:1139\n477#1,9:1143\n271#1:1152\n486#1,2:1153\n467#1,10:1155\n266#1,4:1165\n477#1,9:1169\n271#1:1178\n486#1,2:1179\n467#1,10:1181\n266#1,4:1191\n477#1,9:1195\n271#1:1204\n486#1,2:1205\n*S KotlinDebug\n*F\n+ 1 IntList.kt\nandroidx/collection/IntList\n*L\n96#1:970,6\n110#1:976,6\n122#1:982,6\n135#1:988\n153#1:989,6\n175#1:995,6\n192#1:1001,6\n208#1:1007,6\n225#1:1013,6\n241#1:1019,6\n306#1:1025\n317#1:1026\n343#1:1027,6\n357#1:1033,6\n371#1:1039,6\n397#1:1045\n407#1:1046,6\n420#1:1052,6\n445#1:1058,6\n476#1:1064,6\n494#1:1070,6\n510#1:1076\n-1#1:1077,10\n-1#1:1087,4\n-1#1:1091,9\n-1#1:1100\n-1#1:1101,2\n-1#1:1103,10\n-1#1:1113,4\n-1#1:1117,9\n-1#1:1126\n-1#1:1127,2\n-1#1:1129,10\n-1#1:1139,4\n-1#1:1143,9\n-1#1:1152\n-1#1:1153,2\n-1#1:1155,10\n-1#1:1165,4\n-1#1:1169,9\n-1#1:1178\n-1#1:1179,2\n-1#1:1181,10\n-1#1:1191,4\n-1#1:1195,9\n-1#1:1204\n-1#1:1205,2\n*E\n"})
public abstract class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    @xh.e
    public int[] f3568a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @xh.e
    public int f3569b;

    private c0(int i10) {
        this.f3568a = i10 == 0 ? j0.b() : new int[i10];
    }

    public /* synthetic */ c0(int i10, kotlin.jvm.internal.u uVar) {
        this(i10);
    }

    public static /* synthetic */ String P(c0 c0Var, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: joinToString");
        }
        if ((i11 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = (i11 & 2) != 0 ? "" : charSequence2;
        CharSequence charSequence6 = (i11 & 4) == 0 ? charSequence3 : "";
        if ((i11 & 8) != 0) {
            i10 = -1;
        }
        int i12 = i10;
        if ((i11 & 16) != 0) {
            charSequence4 = "...";
        }
        return c0Var.I(charSequence, charSequence5, charSequence6, i12, charSequence4);
    }

    public static /* synthetic */ String Q(c0 c0Var, CharSequence separator, CharSequence prefix, CharSequence postfix, int i10, CharSequence truncated, yh.l transform, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: joinToString");
        }
        if ((i11 & 1) != 0) {
            separator = ", ";
        }
        if ((i11 & 2) != 0) {
            prefix = "";
        }
        if ((i11 & 4) != 0) {
            postfix = "";
        }
        if ((i11 & 8) != 0) {
            i10 = -1;
        }
        if ((i11 & 16) != 0) {
            truncated = "...";
        }
        kotlin.jvm.internal.f0.p(separator, "separator");
        kotlin.jvm.internal.f0.p(prefix, "prefix");
        kotlin.jvm.internal.f0.p(postfix, "postfix");
        kotlin.jvm.internal.f0.p(truncated, "truncated");
        kotlin.jvm.internal.f0.p(transform, "transform");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(prefix);
        int[] iArr = c0Var.f3568a;
        int i12 = c0Var.f3569b;
        for (int i13 = 0; i13 < i12; i13++) {
            int i14 = iArr[i13];
            if (i13 == i10) {
                sb2.append(truncated);
                String string = sb2.toString();
                kotlin.jvm.internal.f0.o(string, "StringBuilder().apply(builderAction).toString()");
                return string;
            }
            if (i13 != 0) {
                sb2.append(separator);
            }
            sb2.append((CharSequence) transform.invoke(Integer.valueOf(i14)));
        }
        sb2.append(postfix);
        String string2 = sb2.toString();
        kotlin.jvm.internal.f0.o(string2, "StringBuilder().apply(builderAction).toString()");
        return string2;
    }

    @kotlin.r0
    public static /* synthetic */ void t() {
    }

    @kotlin.r0
    public static /* synthetic */ void x() {
    }

    public final int A(@dl.d yh.l<? super Integer, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        int[] iArr = this.f3568a;
        int i10 = this.f3569b;
        do {
            i10--;
            if (-1 >= i10) {
                return -1;
            }
        } while (!predicate.invoke(Integer.valueOf(iArr[i10])).booleanValue());
        return i10;
    }

    public final boolean B() {
        return this.f3569b == 0;
    }

    public final boolean C() {
        return this.f3569b != 0;
    }

    @dl.d
    @xh.i
    public final String D() {
        return P(this, null, null, null, 0, null, 31, null);
    }

    @dl.d
    @xh.i
    public final String E(@dl.d CharSequence separator) {
        kotlin.jvm.internal.f0.p(separator, "separator");
        return P(this, separator, null, null, 0, null, 30, null);
    }

    @dl.d
    @xh.i
    public final String F(@dl.d CharSequence separator, @dl.d CharSequence prefix) {
        kotlin.jvm.internal.f0.p(separator, "separator");
        kotlin.jvm.internal.f0.p(prefix, "prefix");
        return P(this, separator, prefix, null, 0, null, 28, null);
    }

    @dl.d
    @xh.i
    public final String G(@dl.d CharSequence separator, @dl.d CharSequence prefix, @dl.d CharSequence postfix) {
        kotlin.jvm.internal.f0.p(separator, "separator");
        kotlin.jvm.internal.f0.p(prefix, "prefix");
        kotlin.jvm.internal.f0.p(postfix, "postfix");
        return P(this, separator, prefix, postfix, 0, null, 24, null);
    }

    @dl.d
    @xh.i
    public final String H(@dl.d CharSequence separator, @dl.d CharSequence prefix, @dl.d CharSequence postfix, int i10) {
        kotlin.jvm.internal.f0.p(separator, "separator");
        kotlin.jvm.internal.f0.p(prefix, "prefix");
        kotlin.jvm.internal.f0.p(postfix, "postfix");
        return P(this, separator, prefix, postfix, i10, null, 16, null);
    }

    @dl.d
    @xh.i
    public final String I(@dl.d CharSequence separator, @dl.d CharSequence prefix, @dl.d CharSequence postfix, int i10, @dl.d CharSequence truncated) {
        kotlin.jvm.internal.f0.p(separator, "separator");
        kotlin.jvm.internal.f0.p(prefix, "prefix");
        kotlin.jvm.internal.f0.p(postfix, "postfix");
        kotlin.jvm.internal.f0.p(truncated, "truncated");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(prefix);
        int[] iArr = this.f3568a;
        int i11 = this.f3569b;
        for (int i12 = 0; i12 < i11; i12++) {
            int i13 = iArr[i12];
            if (i12 == i10) {
                sb2.append(truncated);
                String string = sb2.toString();
                kotlin.jvm.internal.f0.o(string, "StringBuilder().apply(builderAction).toString()");
                return string;
            }
            if (i12 != 0) {
                sb2.append(separator);
            }
            sb2.append(i13);
        }
        sb2.append(postfix);
        String string2 = sb2.toString();
        kotlin.jvm.internal.f0.o(string2, "StringBuilder().apply(builderAction).toString()");
        return string2;
    }

    @dl.d
    @xh.i
    public final String J(@dl.d CharSequence separator, @dl.d CharSequence prefix, @dl.d CharSequence postfix, int i10, @dl.d CharSequence truncated, @dl.d yh.l<? super Integer, ? extends CharSequence> transform) {
        kotlin.jvm.internal.f0.p(separator, "separator");
        kotlin.jvm.internal.f0.p(prefix, "prefix");
        kotlin.jvm.internal.f0.p(postfix, "postfix");
        kotlin.jvm.internal.f0.p(truncated, "truncated");
        kotlin.jvm.internal.f0.p(transform, "transform");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(prefix);
        int[] iArr = this.f3568a;
        int i11 = this.f3569b;
        for (int i12 = 0; i12 < i11; i12++) {
            int i13 = iArr[i12];
            if (i12 == i10) {
                sb2.append(truncated);
                String string = sb2.toString();
                kotlin.jvm.internal.f0.o(string, "StringBuilder().apply(builderAction).toString()");
                return string;
            }
            if (i12 != 0) {
                sb2.append(separator);
            }
            sb2.append(transform.invoke(Integer.valueOf(i13)));
        }
        sb2.append(postfix);
        String string2 = sb2.toString();
        kotlin.jvm.internal.f0.o(string2, "StringBuilder().apply(builderAction).toString()");
        return string2;
    }

    @dl.d
    @xh.i
    public final String K(@dl.d CharSequence separator, @dl.d CharSequence prefix, @dl.d CharSequence postfix, int i10, @dl.d yh.l<? super Integer, ? extends CharSequence> transform) {
        kotlin.jvm.internal.f0.p(separator, "separator");
        kotlin.jvm.internal.f0.p(prefix, "prefix");
        kotlin.jvm.internal.f0.p(postfix, "postfix");
        kotlin.jvm.internal.f0.p(transform, "transform");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(prefix);
        int[] iArr = this.f3568a;
        int i11 = this.f3569b;
        for (int i12 = 0; i12 < i11; i12++) {
            int i13 = iArr[i12];
            if (i12 == i10) {
                sb2.append((CharSequence) "...");
                String string = sb2.toString();
                kotlin.jvm.internal.f0.o(string, "StringBuilder().apply(builderAction).toString()");
                return string;
            }
            if (i12 != 0) {
                sb2.append(separator);
            }
            sb2.append(transform.invoke(Integer.valueOf(i13)));
        }
        sb2.append(postfix);
        String string2 = sb2.toString();
        kotlin.jvm.internal.f0.o(string2, "StringBuilder().apply(builderAction).toString()");
        return string2;
    }

    @dl.d
    @xh.i
    public final String L(@dl.d CharSequence separator, @dl.d CharSequence prefix, @dl.d CharSequence postfix, @dl.d yh.l<? super Integer, ? extends CharSequence> transform) {
        kotlin.jvm.internal.f0.p(separator, "separator");
        kotlin.jvm.internal.f0.p(prefix, "prefix");
        kotlin.jvm.internal.f0.p(postfix, "postfix");
        kotlin.jvm.internal.f0.p(transform, "transform");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(prefix);
        int[] iArr = this.f3568a;
        int i10 = this.f3569b;
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = iArr[i11];
            if (i11 == -1) {
                sb2.append((CharSequence) "...");
                String string = sb2.toString();
                kotlin.jvm.internal.f0.o(string, "StringBuilder().apply(builderAction).toString()");
                return string;
            }
            if (i11 != 0) {
                sb2.append(separator);
            }
            sb2.append(transform.invoke(Integer.valueOf(i12)));
        }
        sb2.append(postfix);
        String string2 = sb2.toString();
        kotlin.jvm.internal.f0.o(string2, "StringBuilder().apply(builderAction).toString()");
        return string2;
    }

    @dl.d
    @xh.i
    public final String M(@dl.d CharSequence separator, @dl.d CharSequence prefix, @dl.d yh.l<? super Integer, ? extends CharSequence> transform) {
        kotlin.jvm.internal.f0.p(separator, "separator");
        kotlin.jvm.internal.f0.p(prefix, "prefix");
        kotlin.jvm.internal.f0.p(transform, "transform");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(prefix);
        int[] iArr = this.f3568a;
        int i10 = this.f3569b;
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = iArr[i11];
            if (i11 == -1) {
                sb2.append((CharSequence) "...");
                String string = sb2.toString();
                kotlin.jvm.internal.f0.o(string, "StringBuilder().apply(builderAction).toString()");
                return string;
            }
            if (i11 != 0) {
                sb2.append(separator);
            }
            sb2.append(transform.invoke(Integer.valueOf(i12)));
        }
        sb2.append((CharSequence) "");
        String string2 = sb2.toString();
        kotlin.jvm.internal.f0.o(string2, "StringBuilder().apply(builderAction).toString()");
        return string2;
    }

    @dl.d
    @xh.i
    public final String N(@dl.d CharSequence separator, @dl.d yh.l<? super Integer, ? extends CharSequence> transform) {
        kotlin.jvm.internal.f0.p(separator, "separator");
        kotlin.jvm.internal.f0.p(transform, "transform");
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) "");
        int[] iArr = this.f3568a;
        int i10 = this.f3569b;
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = iArr[i11];
            if (i11 == -1) {
                sb2.append((CharSequence) "...");
                String string = sb2.toString();
                kotlin.jvm.internal.f0.o(string, "StringBuilder().apply(builderAction).toString()");
                return string;
            }
            if (i11 != 0) {
                sb2.append(separator);
            }
            sb2.append(transform.invoke(Integer.valueOf(i12)));
        }
        sb2.append((CharSequence) "");
        String string2 = sb2.toString();
        kotlin.jvm.internal.f0.o(string2, "StringBuilder().apply(builderAction).toString()");
        return string2;
    }

    @dl.d
    @xh.i
    public final String O(@dl.d yh.l<? super Integer, ? extends CharSequence> transform) {
        kotlin.jvm.internal.f0.p(transform, "transform");
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) "");
        int[] iArr = this.f3568a;
        int i10 = this.f3569b;
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = iArr[i11];
            if (i11 == -1) {
                sb2.append((CharSequence) "...");
                String string = sb2.toString();
                kotlin.jvm.internal.f0.o(string, "StringBuilder().apply(builderAction).toString()");
                return string;
            }
            if (i11 != 0) {
                sb2.append((CharSequence) ", ");
            }
            sb2.append(transform.invoke(Integer.valueOf(i12)));
        }
        sb2.append((CharSequence) "");
        String string2 = sb2.toString();
        kotlin.jvm.internal.f0.o(string2, "StringBuilder().apply(builderAction).toString()");
        return string2;
    }

    public final int R() {
        if (B()) {
            throw new NoSuchElementException("IntList is empty.");
        }
        return this.f3568a[this.f3569b - 1];
    }

    public final int S(@dl.d yh.l<? super Integer, Boolean> predicate) {
        int i10;
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        int[] iArr = this.f3568a;
        int i11 = this.f3569b;
        do {
            i11--;
            if (-1 >= i11) {
                throw new NoSuchElementException("IntList contains no element matching the predicate.");
            }
            i10 = iArr[i11];
        } while (!predicate.invoke(Integer.valueOf(i10)).booleanValue());
        return i10;
    }

    public final int T(int i10) {
        int[] iArr = this.f3568a;
        int i11 = this.f3569b;
        do {
            i11--;
            if (-1 >= i11) {
                return -1;
            }
        } while (iArr[i11] != i10);
        return i11;
    }

    public final boolean U() {
        return B();
    }

    public final boolean V(@dl.d yh.l<? super Integer, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        int[] iArr = this.f3568a;
        for (int i10 = this.f3569b - 1; -1 < i10; i10--) {
            if (predicate.invoke(Integer.valueOf(iArr[i10])).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public final boolean a() {
        return C();
    }

    public final boolean b(@dl.d yh.l<? super Integer, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        int[] iArr = this.f3568a;
        int i10 = this.f3569b;
        for (int i11 = 0; i11 < i10; i11++) {
            if (predicate.invoke(Integer.valueOf(iArr[i11])).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public final boolean c(int i10) {
        int[] iArr = this.f3568a;
        int i11 = this.f3569b;
        for (int i12 = 0; i12 < i11; i12++) {
            if (iArr[i12] == i10) {
                return true;
            }
        }
        return false;
    }

    public final boolean d(@dl.d c0 elements) {
        kotlin.jvm.internal.f0.p(elements, "elements");
        fi.l lVarW1 = fi.u.W1(0, elements.f3569b);
        int iH = lVarW1.h();
        int i10 = lVarW1.i();
        if (iH > i10) {
            return true;
        }
        while (c(elements.s(iH))) {
            if (iH == i10) {
                return true;
            }
            iH++;
        }
        return false;
    }

    public final int e() {
        return this.f3569b;
    }

    public boolean equals(@dl.e Object obj) {
        if (obj instanceof c0) {
            c0 c0Var = (c0) obj;
            int i10 = c0Var.f3569b;
            int i11 = this.f3569b;
            if (i10 == i11) {
                int[] iArr = this.f3568a;
                int[] iArr2 = c0Var.f3568a;
                fi.l lVarW1 = fi.u.W1(0, i11);
                int iH = lVarW1.h();
                int i12 = lVarW1.i();
                if (iH > i12) {
                    return true;
                }
                while (iArr[iH] == iArr2[iH]) {
                    if (iH == i12) {
                        return true;
                    }
                    iH++;
                }
                return false;
            }
        }
        return false;
    }

    public final int f(@dl.d yh.l<? super Integer, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        int[] iArr = this.f3568a;
        int i10 = this.f3569b;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            if (predicate.invoke(Integer.valueOf(iArr[i12])).booleanValue()) {
                i11++;
            }
        }
        return i11;
    }

    public final int g(@androidx.annotation.f0(from = 0) int i10) {
        boolean z10 = false;
        if (i10 >= 0 && i10 < this.f3569b) {
            z10 = true;
        }
        if (z10) {
            return this.f3568a[i10];
        }
        throw new IndexOutOfBoundsException("Index " + i10 + " must be in 0.." + (this.f3569b - 1));
    }

    public final int h(@androidx.annotation.f0(from = 0) int i10, @dl.d yh.l<? super Integer, Integer> defaultValue) {
        kotlin.jvm.internal.f0.p(defaultValue, "defaultValue");
        boolean z10 = false;
        if (i10 >= 0 && i10 < this.f3569b) {
            z10 = true;
        }
        return !z10 ? defaultValue.invoke(Integer.valueOf(i10)).intValue() : this.f3568a[i10];
    }

    public int hashCode() {
        int[] iArr = this.f3568a;
        int i10 = this.f3569b;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            i11 += iArr[i12] * 31;
        }
        return i11;
    }

    public final int i() {
        if (B()) {
            throw new NoSuchElementException("IntList is empty.");
        }
        return this.f3568a[0];
    }

    public final int j(@dl.d yh.l<? super Integer, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        int[] iArr = this.f3568a;
        int i10 = this.f3569b;
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = iArr[i11];
            if (predicate.invoke(Integer.valueOf(i12)).booleanValue()) {
                return i12;
            }
        }
        throw new NoSuchElementException("IntList contains no element matching the predicate.");
    }

    public final <R> R k(R r10, @dl.d yh.p<? super R, ? super Integer, ? extends R> operation) {
        kotlin.jvm.internal.f0.p(operation, "operation");
        int[] iArr = this.f3568a;
        int i10 = this.f3569b;
        for (int i11 = 0; i11 < i10; i11++) {
            r10 = operation.invoke(r10, Integer.valueOf(iArr[i11]));
        }
        return r10;
    }

    public final <R> R l(R r10, @dl.d yh.q<? super Integer, ? super R, ? super Integer, ? extends R> operation) {
        kotlin.jvm.internal.f0.p(operation, "operation");
        int[] iArr = this.f3568a;
        int i10 = this.f3569b;
        for (int i11 = 0; i11 < i10; i11++) {
            R r11 = r10;
            r10 = operation.invoke(Integer.valueOf(i11), r11, Integer.valueOf(iArr[i11]));
        }
        return r10;
    }

    public final <R> R m(R r10, @dl.d yh.p<? super Integer, ? super R, ? extends R> operation) {
        kotlin.jvm.internal.f0.p(operation, "operation");
        int[] iArr = this.f3568a;
        int i10 = this.f3569b;
        while (true) {
            i10--;
            if (-1 >= i10) {
                return r10;
            }
            r10 = operation.invoke(Integer.valueOf(iArr[i10]), r10);
        }
    }

    public final <R> R n(R r10, @dl.d yh.q<? super Integer, ? super Integer, ? super R, ? extends R> operation) {
        kotlin.jvm.internal.f0.p(operation, "operation");
        int[] iArr = this.f3568a;
        int i10 = this.f3569b;
        while (true) {
            i10--;
            if (-1 >= i10) {
                return r10;
            }
            r10 = operation.invoke(Integer.valueOf(i10), Integer.valueOf(iArr[i10]), r10);
        }
    }

    public final void o(@dl.d yh.l<? super Integer, kotlin.b2> block) {
        kotlin.jvm.internal.f0.p(block, "block");
        int[] iArr = this.f3568a;
        int i10 = this.f3569b;
        for (int i11 = 0; i11 < i10; i11++) {
            block.invoke(Integer.valueOf(iArr[i11]));
        }
    }

    public final void p(@dl.d yh.p<? super Integer, ? super Integer, kotlin.b2> block) {
        kotlin.jvm.internal.f0.p(block, "block");
        int[] iArr = this.f3568a;
        int i10 = this.f3569b;
        for (int i11 = 0; i11 < i10; i11++) {
            block.invoke(Integer.valueOf(i11), Integer.valueOf(iArr[i11]));
        }
    }

    public final void q(@dl.d yh.l<? super Integer, kotlin.b2> block) {
        kotlin.jvm.internal.f0.p(block, "block");
        int[] iArr = this.f3568a;
        int i10 = this.f3569b;
        while (true) {
            i10--;
            if (-1 >= i10) {
                return;
            } else {
                block.invoke(Integer.valueOf(iArr[i10]));
            }
        }
    }

    public final void r(@dl.d yh.p<? super Integer, ? super Integer, kotlin.b2> block) {
        kotlin.jvm.internal.f0.p(block, "block");
        int[] iArr = this.f3568a;
        int i10 = this.f3569b;
        while (true) {
            i10--;
            if (-1 >= i10) {
                return;
            } else {
                block.invoke(Integer.valueOf(i10), Integer.valueOf(iArr[i10]));
            }
        }
    }

    public final int s(@androidx.annotation.f0(from = 0) int i10) {
        boolean z10 = false;
        if (i10 >= 0 && i10 < this.f3569b) {
            z10 = true;
        }
        if (z10) {
            return this.f3568a[i10];
        }
        throw new IndexOutOfBoundsException("Index " + i10 + " must be in 0.." + (this.f3569b - 1));
    }

    @dl.d
    public String toString() {
        return P(this, null, Constants.ARRAY_TYPE, "]", 0, null, 25, null);
    }

    @dl.d
    public final fi.l u() {
        return fi.u.W1(0, this.f3569b);
    }

    @androidx.annotation.f0(from = -1)
    public final int v() {
        return this.f3569b - 1;
    }

    @androidx.annotation.f0(from = 0)
    public final int w() {
        return this.f3569b;
    }

    public final int y(int i10) {
        int[] iArr = this.f3568a;
        int i11 = this.f3569b;
        for (int i12 = 0; i12 < i11; i12++) {
            if (i10 == iArr[i12]) {
                return i12;
            }
        }
        return -1;
    }

    public final int z(@dl.d yh.l<? super Integer, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        int[] iArr = this.f3568a;
        int i10 = this.f3569b;
        for (int i11 = 0; i11 < i10; i11++) {
            if (predicate.invoke(Integer.valueOf(iArr[i11])).booleanValue()) {
                return i11;
            }
        }
        return -1;
    }
}
