package kotlin.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.unsigned.UArraysKt___UArraysKt;
import kotlin.k1;
import kotlin.o1;
import kotlin.s1;
import kotlin.y1;

/* JADX INFO: compiled from: Arrays.kt */
/* JADX INFO: loaded from: classes5.dex */
public class l extends k {
    /* JADX WARN: Multi-variable type inference failed */
    @kotlin.u0(version = "1.3")
    @kotlin.r0
    @xh.h(name = "contentDeepEquals")
    public static final <T> boolean g(@dl.e T[] tArr, @dl.e T[] tArr2) {
        if (tArr == tArr2) {
            return true;
        }
        if (tArr == 0 || tArr2 == 0 || tArr.length != tArr2.length) {
            return false;
        }
        int length = tArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            Object[] objArr = tArr[i10];
            Object[] objArr2 = tArr2[i10];
            if (objArr != objArr2) {
                if (objArr == 0 || objArr2 == 0) {
                    return false;
                }
                if ((objArr instanceof Object[]) && (objArr2 instanceof Object[])) {
                    if (!g(objArr, objArr2)) {
                        return false;
                    }
                } else if ((objArr instanceof byte[]) && (objArr2 instanceof byte[])) {
                    if (!Arrays.equals((byte[]) objArr, (byte[]) objArr2)) {
                        return false;
                    }
                } else if ((objArr instanceof short[]) && (objArr2 instanceof short[])) {
                    if (!Arrays.equals((short[]) objArr, (short[]) objArr2)) {
                        return false;
                    }
                } else if ((objArr instanceof int[]) && (objArr2 instanceof int[])) {
                    if (!Arrays.equals((int[]) objArr, (int[]) objArr2)) {
                        return false;
                    }
                } else if ((objArr instanceof long[]) && (objArr2 instanceof long[])) {
                    if (!Arrays.equals((long[]) objArr, (long[]) objArr2)) {
                        return false;
                    }
                } else if ((objArr instanceof float[]) && (objArr2 instanceof float[])) {
                    if (!Arrays.equals((float[]) objArr, (float[]) objArr2)) {
                        return false;
                    }
                } else if ((objArr instanceof double[]) && (objArr2 instanceof double[])) {
                    if (!Arrays.equals((double[]) objArr, (double[]) objArr2)) {
                        return false;
                    }
                } else if ((objArr instanceof char[]) && (objArr2 instanceof char[])) {
                    if (!Arrays.equals((char[]) objArr, (char[]) objArr2)) {
                        return false;
                    }
                } else if ((objArr instanceof boolean[]) && (objArr2 instanceof boolean[])) {
                    if (!Arrays.equals((boolean[]) objArr, (boolean[]) objArr2)) {
                        return false;
                    }
                } else if ((objArr instanceof k1) && (objArr2 instanceof k1)) {
                    if (!UArraysKt___UArraysKt.V0(((k1) objArr).E(), ((k1) objArr2).E())) {
                        return false;
                    }
                } else if ((objArr instanceof y1) && (objArr2 instanceof y1)) {
                    if (!UArraysKt___UArraysKt.S0(((y1) objArr).E(), ((y1) objArr2).E())) {
                        return false;
                    }
                } else if ((objArr instanceof o1) && (objArr2 instanceof o1)) {
                    if (!UArraysKt___UArraysKt.T0(((o1) objArr).E(), ((o1) objArr2).E())) {
                        return false;
                    }
                } else if ((objArr instanceof s1) && (objArr2 instanceof s1)) {
                    if (!UArraysKt___UArraysKt.X0(((s1) objArr).E(), ((s1) objArr2).E())) {
                        return false;
                    }
                } else if (!kotlin.jvm.internal.f0.g(objArr, objArr2)) {
                    return false;
                }
            }
        }
        return true;
    }

    @kotlin.u0(version = "1.3")
    @dl.d
    @kotlin.r0
    @xh.h(name = "contentDeepToString")
    public static final <T> String h(@dl.e T[] tArr) {
        if (tArr == null) {
            return "null";
        }
        StringBuilder sb2 = new StringBuilder((fi.u.B(tArr.length, 429496729) * 5) + 2);
        i(tArr, sb2, new ArrayList());
        String string = sb2.toString();
        kotlin.jvm.internal.f0.o(string, "StringBuilder(capacity).…builderAction).toString()");
        return string;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final <T> void i(T[] tArr, StringBuilder sb2, List<Object[]> list) {
        if (list.contains(tArr)) {
            sb2.append("[...]");
            return;
        }
        list.add(tArr);
        sb2.append('[');
        int length = tArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (i10 != 0) {
                sb2.append(", ");
            }
            Object[] objArr = tArr[i10];
            if (objArr == 0) {
                sb2.append("null");
            } else if (objArr instanceof Object[]) {
                i(objArr, sb2, list);
            } else if (objArr instanceof byte[]) {
                String string = Arrays.toString((byte[]) objArr);
                kotlin.jvm.internal.f0.o(string, "toString(this)");
                sb2.append(string);
            } else if (objArr instanceof short[]) {
                String string2 = Arrays.toString((short[]) objArr);
                kotlin.jvm.internal.f0.o(string2, "toString(this)");
                sb2.append(string2);
            } else if (objArr instanceof int[]) {
                String string3 = Arrays.toString((int[]) objArr);
                kotlin.jvm.internal.f0.o(string3, "toString(this)");
                sb2.append(string3);
            } else if (objArr instanceof long[]) {
                String string4 = Arrays.toString((long[]) objArr);
                kotlin.jvm.internal.f0.o(string4, "toString(this)");
                sb2.append(string4);
            } else if (objArr instanceof float[]) {
                String string5 = Arrays.toString((float[]) objArr);
                kotlin.jvm.internal.f0.o(string5, "toString(this)");
                sb2.append(string5);
            } else if (objArr instanceof double[]) {
                String string6 = Arrays.toString((double[]) objArr);
                kotlin.jvm.internal.f0.o(string6, "toString(this)");
                sb2.append(string6);
            } else if (objArr instanceof char[]) {
                String string7 = Arrays.toString((char[]) objArr);
                kotlin.jvm.internal.f0.o(string7, "toString(this)");
                sb2.append(string7);
            } else if (objArr instanceof boolean[]) {
                String string8 = Arrays.toString((boolean[]) objArr);
                kotlin.jvm.internal.f0.o(string8, "toString(this)");
                sb2.append(string8);
            } else if (objArr instanceof k1) {
                sb2.append(UArraysKt___UArraysKt.j1(((k1) objArr).E()));
            } else if (objArr instanceof y1) {
                sb2.append(UArraysKt___UArraysKt.n1(((y1) objArr).E()));
            } else if (objArr instanceof o1) {
                sb2.append(UArraysKt___UArraysKt.m1(((o1) objArr).E()));
            } else if (objArr instanceof s1) {
                sb2.append(UArraysKt___UArraysKt.p1(((s1) objArr).E()));
            } else {
                sb2.append(objArr.toString());
            }
        }
        sb2.append(']');
        list.remove(CollectionsKt__CollectionsKt.G(list));
    }

    @dl.d
    public static final <T> List<T> j(@dl.d T[][] tArr) {
        kotlin.jvm.internal.f0.p(tArr, "<this>");
        int length = 0;
        for (T[] tArr2 : tArr) {
            length += tArr2.length;
        }
        ArrayList arrayList = new ArrayList(length);
        for (T[] tArr3 : tArr) {
            x.p0(arrayList, tArr3);
        }
        return arrayList;
    }

    /* JADX WARN: Incorrect types in method signature: <C:[Ljava/lang/Object;:TR;R:Ljava/lang/Object;>(TC;Lyh/a<+TR;>;)TR; */
    @kotlin.u0(version = "1.3")
    @sh.f
    private static final Object k(Object[] objArr, yh.a defaultValue) {
        kotlin.jvm.internal.f0.p(defaultValue, "defaultValue");
        return objArr.length == 0 ? defaultValue.invoke() : objArr;
    }

    @kotlin.u0(version = "1.3")
    @sh.f
    private static final boolean l(Object[] objArr) {
        if (objArr != null) {
            if (!(objArr.length == 0)) {
                return false;
            }
        }
        return true;
    }

    @dl.d
    public static final <T, R> Pair<List<T>, List<R>> m(@dl.d Pair<? extends T, ? extends R>[] pairArr) {
        kotlin.jvm.internal.f0.p(pairArr, "<this>");
        ArrayList arrayList = new ArrayList(pairArr.length);
        ArrayList arrayList2 = new ArrayList(pairArr.length);
        for (Pair<? extends T, ? extends R> pair : pairArr) {
            arrayList.add(pair.e());
            arrayList2.add(pair.f());
        }
        return kotlin.c1.a(arrayList, arrayList2);
    }
}
