package androidx.collection;

import com.meituan.robust.Constants;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: ObjectList.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.t0({"SMAP\nObjectList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ObjectList.kt\nandroidx/collection/ObjectList\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1618:1\n305#1,6:1619\n331#1,6:1625\n305#1,6:1633\n305#1,6:1639\n305#1,6:1645\n305#1,6:1651\n305#1,6:1657\n318#1,6:1663\n331#1,6:1669\n345#1,6:1675\n75#1:1681\n75#1:1682\n318#1,6:1683\n318#1,6:1689\n318#1,6:1695\n345#1,6:1701\n75#1:1707\n331#1,6:1708\n75#1:1714\n331#1,6:1715\n345#1,6:1721\n345#1,6:1727\n318#1,6:1733\n305#1,6:1739\n80#1:1745\n1855#2,2:1631\n*S KotlinDebug\n*F\n+ 1 ObjectList.kt\nandroidx/collection/ObjectList\n*L\n101#1:1619,6\n115#1:1625,6\n168#1:1633,6\n186#1:1639,6\n209#1:1645,6\n227#1:1651,6\n244#1:1657,6\n260#1:1663,6\n277#1:1669,6\n293#1:1675,6\n358#1:1681\n369#1:1682\n399#1:1683,6\n405#1:1689,6\n421#1:1695,6\n435#1:1701,6\n461#1:1707\n472#1:1708,6\n483#1:1714\n492#1:1715,6\n509#1:1721,6\n515#1:1727,6\n545#1:1733,6\n576#1:1739,6\n592#1:1745\n157#1:1631,2\n*E\n"})
public abstract class ObjectList<E> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    @xh.e
    public Object[] f3484a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @xh.e
    public int f3485b;

    private ObjectList(int i10) {
        this.f3484a = i10 == 0 ? d2.f3574a : new Object[i10];
    }

    public /* synthetic */ ObjectList(int i10, kotlin.jvm.internal.u uVar) {
        this(i10);
    }

    @kotlin.r0
    public static /* synthetic */ void D() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ String Q(ObjectList objectList, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, yh.l lVar, int i11, Object obj) {
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
        CharSequence charSequence7 = charSequence4;
        if ((i11 & 32) != 0) {
            lVar = null;
        }
        return objectList.P(charSequence, charSequence5, charSequence6, i12, charSequence7, lVar);
    }

    @kotlin.r0
    public static /* synthetic */ void z() {
    }

    @dl.d
    public final fi.l A() {
        return fi.u.W1(0, this.f3485b);
    }

    @androidx.annotation.f0(from = -1)
    public final int B() {
        return this.f3485b - 1;
    }

    @androidx.annotation.f0(from = 0)
    public final int C() {
        return this.f3485b;
    }

    public final int E(E e10) {
        int i10 = 0;
        if (e10 == null) {
            Object[] objArr = this.f3484a;
            int i11 = this.f3485b;
            while (i10 < i11) {
                if (objArr[i10] == null) {
                    return i10;
                }
                i10++;
            }
            return -1;
        }
        Object[] objArr2 = this.f3484a;
        int i12 = this.f3485b;
        while (i10 < i12) {
            if (e10.equals(objArr2[i10])) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public final int F(@dl.d yh.l<? super E, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        Object[] objArr = this.f3484a;
        int i10 = this.f3485b;
        for (int i11 = 0; i11 < i10; i11++) {
            if (predicate.invoke(objArr[i11]).booleanValue()) {
                return i11;
            }
        }
        return -1;
    }

    public final int G(@dl.d yh.l<? super E, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        Object[] objArr = this.f3484a;
        int i10 = this.f3485b;
        do {
            i10--;
            if (-1 >= i10) {
                return -1;
            }
        } while (!predicate.invoke(objArr[i10]).booleanValue());
        return i10;
    }

    public final boolean H() {
        return this.f3485b == 0;
    }

    public final boolean I() {
        return this.f3485b != 0;
    }

    @dl.d
    @xh.i
    public final String J() {
        return Q(this, null, null, null, 0, null, null, 63, null);
    }

    @dl.d
    @xh.i
    public final String K(@dl.d CharSequence separator) {
        kotlin.jvm.internal.f0.p(separator, "separator");
        return Q(this, separator, null, null, 0, null, null, 62, null);
    }

    @dl.d
    @xh.i
    public final String L(@dl.d CharSequence separator, @dl.d CharSequence prefix) {
        kotlin.jvm.internal.f0.p(separator, "separator");
        kotlin.jvm.internal.f0.p(prefix, "prefix");
        return Q(this, separator, prefix, null, 0, null, null, 60, null);
    }

    @dl.d
    @xh.i
    public final String M(@dl.d CharSequence separator, @dl.d CharSequence prefix, @dl.d CharSequence postfix) {
        kotlin.jvm.internal.f0.p(separator, "separator");
        kotlin.jvm.internal.f0.p(prefix, "prefix");
        kotlin.jvm.internal.f0.p(postfix, "postfix");
        return Q(this, separator, prefix, postfix, 0, null, null, 56, null);
    }

    @dl.d
    @xh.i
    public final String N(@dl.d CharSequence separator, @dl.d CharSequence prefix, @dl.d CharSequence postfix, int i10) {
        kotlin.jvm.internal.f0.p(separator, "separator");
        kotlin.jvm.internal.f0.p(prefix, "prefix");
        kotlin.jvm.internal.f0.p(postfix, "postfix");
        return Q(this, separator, prefix, postfix, i10, null, null, 48, null);
    }

    @dl.d
    @xh.i
    public final String O(@dl.d CharSequence separator, @dl.d CharSequence prefix, @dl.d CharSequence postfix, int i10, @dl.d CharSequence truncated) {
        kotlin.jvm.internal.f0.p(separator, "separator");
        kotlin.jvm.internal.f0.p(prefix, "prefix");
        kotlin.jvm.internal.f0.p(postfix, "postfix");
        kotlin.jvm.internal.f0.p(truncated, "truncated");
        return Q(this, separator, prefix, postfix, i10, truncated, null, 32, null);
    }

    @dl.d
    @xh.i
    public final String P(@dl.d CharSequence separator, @dl.d CharSequence prefix, @dl.d CharSequence postfix, int i10, @dl.d CharSequence truncated, @dl.e yh.l<? super E, ? extends CharSequence> lVar) {
        kotlin.jvm.internal.f0.p(separator, "separator");
        kotlin.jvm.internal.f0.p(prefix, "prefix");
        kotlin.jvm.internal.f0.p(postfix, "postfix");
        kotlin.jvm.internal.f0.p(truncated, "truncated");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(prefix);
        Object[] objArr = this.f3484a;
        int i11 = this.f3485b;
        for (int i12 = 0; i12 < i11; i12++) {
            Object obj = objArr[i12];
            if (i12 == i10) {
                sb2.append(truncated);
                String string = sb2.toString();
                kotlin.jvm.internal.f0.o(string, "StringBuilder().apply(builderAction).toString()");
                return string;
            }
            if (i12 != 0) {
                sb2.append(separator);
            }
            if (lVar == null) {
                sb2.append(obj);
            } else {
                sb2.append(lVar.invoke(obj));
            }
        }
        sb2.append(postfix);
        String string2 = sb2.toString();
        kotlin.jvm.internal.f0.o(string2, "StringBuilder().apply(builderAction).toString()");
        return string2;
    }

    public final E R() {
        if (H()) {
            throw new NoSuchElementException("ObjectList is empty.");
        }
        return (E) this.f3484a[this.f3485b - 1];
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [E, java.lang.Object] */
    public final E S(@dl.d yh.l<? super E, Boolean> predicate) {
        ?? r10;
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        Object[] objArr = this.f3484a;
        int i10 = this.f3485b;
        do {
            i10--;
            if (-1 >= i10) {
                throw new NoSuchElementException("ObjectList contains no element matching the predicate.");
            }
            r10 = (Object) objArr[i10];
        } while (!predicate.invoke(r10).booleanValue());
        return r10;
    }

    public final int T(E e10) {
        if (e10 == null) {
            Object[] objArr = this.f3484a;
            for (int i10 = this.f3485b - 1; -1 < i10; i10--) {
                if (objArr[i10] == null) {
                    return i10;
                }
            }
        } else {
            Object[] objArr2 = this.f3484a;
            for (int i11 = this.f3485b - 1; -1 < i11; i11--) {
                if (e10.equals(objArr2[i11])) {
                    return i11;
                }
            }
        }
        return -1;
    }

    @dl.e
    public final E U() {
        if (H()) {
            return null;
        }
        return (E) this.f3484a[this.f3485b - 1];
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [E, java.lang.Object] */
    @dl.e
    public final E V(@dl.d yh.l<? super E, Boolean> predicate) {
        ?? r10;
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        Object[] objArr = this.f3484a;
        int i10 = this.f3485b;
        do {
            i10--;
            if (-1 >= i10) {
                return null;
            }
            r10 = (Object) objArr[i10];
        } while (!predicate.invoke(r10).booleanValue());
        return r10;
    }

    public final boolean W() {
        return H();
    }

    public final boolean X(@dl.d yh.l<? super E, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        Object[] objArr = this.f3484a;
        for (int i10 = this.f3485b - 1; -1 < i10; i10--) {
            if (predicate.invoke(objArr[i10]).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public final boolean a() {
        return I();
    }

    public final boolean b(@dl.d yh.l<? super E, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        Object[] objArr = this.f3484a;
        int i10 = this.f3485b;
        for (int i11 = 0; i11 < i10; i11++) {
            if (predicate.invoke(objArr[i11]).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @dl.d
    public abstract List<E> c();

    public final boolean d(E e10) {
        return E(e10) >= 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean e(@dl.d ObjectList<E> elements) {
        kotlin.jvm.internal.f0.p(elements, "elements");
        Object[] objArr = elements.f3484a;
        int i10 = elements.f3485b;
        for (int i11 = 0; i11 < i10; i11++) {
            if (!d(objArr[i11])) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(@dl.e Object obj) {
        if (obj instanceof ObjectList) {
            ObjectList objectList = (ObjectList) obj;
            int i10 = objectList.f3485b;
            int i11 = this.f3485b;
            if (i10 == i11) {
                Object[] objArr = this.f3484a;
                Object[] objArr2 = objectList.f3484a;
                fi.l lVarW1 = fi.u.W1(0, i11);
                int iH = lVarW1.h();
                int i12 = lVarW1.i();
                if (iH > i12) {
                    return true;
                }
                while (kotlin.jvm.internal.f0.g(objArr[iH], objArr2[iH])) {
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

    public final boolean f(@dl.d Iterable<? extends E> elements) {
        kotlin.jvm.internal.f0.p(elements, "elements");
        Iterator<? extends E> it = elements.iterator();
        while (it.hasNext()) {
            if (!d(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final boolean g(@dl.d List<? extends E> elements) {
        kotlin.jvm.internal.f0.p(elements, "elements");
        int size = elements.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!d(elements.get(i10))) {
                return false;
            }
        }
        return true;
    }

    public final boolean h(@dl.d E[] elements) {
        kotlin.jvm.internal.f0.p(elements, "elements");
        for (E e10 : elements) {
            if (!d(e10)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        Object[] objArr = this.f3484a;
        int i10 = this.f3485b;
        int iHashCode = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            Object obj = objArr[i11];
            iHashCode += (obj != null ? obj.hashCode() : 0) * 31;
        }
        return iHashCode;
    }

    public final int i() {
        return this.f3485b;
    }

    public final int j(@dl.d yh.l<? super E, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        Object[] objArr = this.f3484a;
        int i10 = this.f3485b;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            if (predicate.invoke(objArr[i12]).booleanValue()) {
                i11++;
            }
        }
        return i11;
    }

    public final E k(@androidx.annotation.f0(from = 0) int i10) {
        boolean z10 = false;
        if (i10 >= 0 && i10 < this.f3485b) {
            z10 = true;
        }
        if (z10) {
            return (E) this.f3484a[i10];
        }
        throw new IndexOutOfBoundsException("Index " + i10 + " must be in 0.." + (this.f3485b - 1));
    }

    public final E l(@androidx.annotation.f0(from = 0) int i10, @dl.d yh.l<? super Integer, ? extends E> defaultValue) {
        kotlin.jvm.internal.f0.p(defaultValue, "defaultValue");
        boolean z10 = false;
        if (i10 >= 0 && i10 < this.f3485b) {
            z10 = true;
        }
        return !z10 ? defaultValue.invoke(Integer.valueOf(i10)) : (E) this.f3484a[i10];
    }

    public final E m() {
        if (H()) {
            throw new NoSuchElementException("ObjectList is empty.");
        }
        return (E) this.f3484a[0];
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [E, java.lang.Object] */
    public final E n(@dl.d yh.l<? super E, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        Object[] objArr = this.f3484a;
        int i10 = this.f3485b;
        for (int i11 = 0; i11 < i10; i11++) {
            ?? r10 = (Object) objArr[i11];
            if (predicate.invoke(r10).booleanValue()) {
                return r10;
            }
        }
        throw new NoSuchElementException("ObjectList contains no element matching the predicate.");
    }

    @dl.e
    public final E o() {
        if (H()) {
            return null;
        }
        return y(0);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [E, java.lang.Object] */
    @dl.e
    public final E p(@dl.d yh.l<? super E, Boolean> predicate) {
        kotlin.jvm.internal.f0.p(predicate, "predicate");
        Object[] objArr = this.f3484a;
        int i10 = this.f3485b;
        for (int i11 = 0; i11 < i10; i11++) {
            ?? r10 = (Object) objArr[i11];
            if (predicate.invoke(r10).booleanValue()) {
                return r10;
            }
        }
        return null;
    }

    public final <R> R q(R r10, @dl.d yh.p<? super R, ? super E, ? extends R> operation) {
        kotlin.jvm.internal.f0.p(operation, "operation");
        Object[] objArr = this.f3484a;
        int i10 = this.f3485b;
        for (int i11 = 0; i11 < i10; i11++) {
            r10 = operation.invoke(r10, objArr[i11]);
        }
        return r10;
    }

    public final <R> R r(R r10, @dl.d yh.q<? super Integer, ? super R, ? super E, ? extends R> operation) {
        kotlin.jvm.internal.f0.p(operation, "operation");
        Object[] objArr = this.f3484a;
        int i10 = this.f3485b;
        for (int i11 = 0; i11 < i10; i11++) {
            r10 = operation.invoke(Integer.valueOf(i11), r10, objArr[i11]);
        }
        return r10;
    }

    public final <R> R s(R r10, @dl.d yh.p<? super E, ? super R, ? extends R> operation) {
        kotlin.jvm.internal.f0.p(operation, "operation");
        Object[] objArr = this.f3484a;
        int i10 = this.f3485b;
        while (true) {
            i10--;
            if (-1 >= i10) {
                return r10;
            }
            r10 = operation.invoke(objArr[i10], r10);
        }
    }

    public final <R> R t(R r10, @dl.d yh.q<? super Integer, ? super E, ? super R, ? extends R> operation) {
        kotlin.jvm.internal.f0.p(operation, "operation");
        Object[] objArr = this.f3484a;
        int i10 = this.f3485b;
        while (true) {
            i10--;
            if (-1 >= i10) {
                return r10;
            }
            r10 = operation.invoke(Integer.valueOf(i10), objArr[i10], r10);
        }
    }

    @dl.d
    public String toString() {
        return Q(this, null, Constants.ARRAY_TYPE, "]", 0, null, new yh.l<E, CharSequence>(this) { // from class: androidx.collection.ObjectList.toString.1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ ObjectList<E> f3486b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.f3486b = this;
            }

            @Override // yh.l
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final CharSequence invoke(E e10) {
                return e10 == this.f3486b ? "(this)" : String.valueOf(e10);
            }
        }, 25, null);
    }

    public final void u(@dl.d yh.l<? super E, kotlin.b2> block) {
        kotlin.jvm.internal.f0.p(block, "block");
        Object[] objArr = this.f3484a;
        int i10 = this.f3485b;
        for (int i11 = 0; i11 < i10; i11++) {
            block.invoke(objArr[i11]);
        }
    }

    public final void v(@dl.d yh.p<? super Integer, ? super E, kotlin.b2> block) {
        kotlin.jvm.internal.f0.p(block, "block");
        Object[] objArr = this.f3484a;
        int i10 = this.f3485b;
        for (int i11 = 0; i11 < i10; i11++) {
            block.invoke(Integer.valueOf(i11), objArr[i11]);
        }
    }

    public final void w(@dl.d yh.l<? super E, kotlin.b2> block) {
        kotlin.jvm.internal.f0.p(block, "block");
        Object[] objArr = this.f3484a;
        int i10 = this.f3485b;
        while (true) {
            i10--;
            if (-1 >= i10) {
                return;
            } else {
                block.invoke(objArr[i10]);
            }
        }
    }

    public final void x(@dl.d yh.p<? super Integer, ? super E, kotlin.b2> block) {
        kotlin.jvm.internal.f0.p(block, "block");
        Object[] objArr = this.f3484a;
        int i10 = this.f3485b;
        while (true) {
            i10--;
            if (-1 >= i10) {
                return;
            } else {
                block.invoke(Integer.valueOf(i10), objArr[i10]);
            }
        }
    }

    public final E y(@androidx.annotation.f0(from = 0) int i10) {
        boolean z10 = false;
        if (i10 >= 0 && i10 < this.f3485b) {
            z10 = true;
        }
        if (z10) {
            return (E) this.f3484a[i10];
        }
        throw new IndexOutOfBoundsException("Index " + i10 + " must be in 0.." + (this.f3485b - 1));
    }
}
