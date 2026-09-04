package com.max.hbcustomview.tickerview;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: LevenshteinUtils.java */
/* JADX INFO: loaded from: classes10.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final int f69630a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final int f69631b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final int f69632c = 2;
    public static ChangeQuickRedirect changeQuickRedirect;

    private static void a(List<Integer> list, char[] cArr, char[] cArr2, int i10, int i11, int i12, int i13) {
        int i14 = i10;
        Object[] objArr = {list, cArr, cArr2, new Integer(i14), new Integer(i11), new Integer(i12), new Integer(i13)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        Integer num = 2;
        if (PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 6002, new Class[]{List.class, char[].class, char[].class, cls, cls, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        int i15 = i11 - i14;
        int i16 = i13 - i12;
        int iMax = Math.max(i15, i16);
        if (i15 == i16) {
            c(list, iMax, 0);
            return;
        }
        int i17 = i15 + 1;
        int i18 = i16 + 1;
        int[][] iArr = (int[][]) Array.newInstance((Class<?>) cls, i17, i18);
        for (int i19 = 0; i19 < i17; i19++) {
            iArr[i19][0] = i19;
        }
        for (int i20 = 0; i20 < i18; i20++) {
            iArr[0][i20] = i20;
        }
        int i21 = 1;
        while (i21 < i17) {
            int i22 = 1;
            while (i22 < i18) {
                int i23 = i21 - 1;
                int i24 = i22 - 1;
                int i25 = cArr[i23 + i14] == cArr2[i24 + i12] ? 0 : 1;
                int[] iArr2 = iArr[i21];
                int[] iArr3 = iArr[i23];
                iArr2[i22] = e(iArr3[i22] + 1, iArr2[i24] + 1, iArr3[i24] + i25);
                i22++;
                i14 = i10;
            }
            i21++;
            i14 = i10;
        }
        ArrayList arrayList = new ArrayList(iMax * 2);
        int i26 = i17 - 1;
        int i27 = i18 - 1;
        while (true) {
            if (i26 <= 0 && i27 <= 0) {
                break;
            }
            if (i26 == 0) {
                arrayList.add(1);
                i27--;
            } else if (i27 == 0) {
                arrayList.add(num);
                i26--;
            } else {
                Integer num2 = num;
                int i28 = i27 - 1;
                int i29 = iArr[i26][i28];
                int[] iArr4 = iArr[i26 - 1];
                int i30 = iArr4[i27];
                int i31 = iArr4[i28];
                if (i29 >= i30 || i29 >= i31) {
                    if (i30 < i31) {
                        arrayList.add(num2);
                        i26--;
                    } else {
                        arrayList.add(0);
                        i26--;
                        i27--;
                    }
                    num = num2;
                } else {
                    arrayList.add(1);
                    i27--;
                }
                num = num2;
            }
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            list.add((Integer) arrayList.get(size));
        }
    }

    public static int[] b(char[] cArr, char[] cArr2, Set<Character> set) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{cArr, cArr2, set}, null, changeQuickRedirect, true, bb.c.f.Ut, new Class[]{char[].class, char[].class, Set.class}, int[].class);
        if (patchProxyResultProxy.isSupported) {
            return (int[]) patchProxyResultProxy.result;
        }
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            boolean z10 = i10 == cArr.length;
            boolean z11 = i11 == cArr2.length;
            if (z10 && z11) {
                break;
            }
            if (z10) {
                c(arrayList, cArr2.length - i11, 1);
                break;
            }
            if (z11) {
                c(arrayList, cArr.length - i10, 2);
                break;
            }
            boolean zContains = set.contains(Character.valueOf(cArr[i10]));
            boolean zContains2 = set.contains(Character.valueOf(cArr2[i11]));
            if (zContains && zContains2) {
                int iD = d(cArr, i10 + 1, set);
                int iD2 = d(cArr2, i11 + 1, set);
                a(arrayList, cArr, cArr2, i10, iD, i11, iD2);
                i10 = iD;
                i11 = iD2;
            } else {
                if (zContains) {
                    arrayList.add(1);
                } else if (zContains2) {
                    arrayList.add(2);
                    i10++;
                } else {
                    arrayList.add(0);
                    i10++;
                }
                i11++;
            }
        }
        int[] iArr = new int[arrayList.size()];
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            iArr[i12] = ((Integer) arrayList.get(i12)).intValue();
        }
        return iArr;
    }

    private static void c(List<Integer> list, int i10, int i11) {
        Object[] objArr = {list, new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 6001, new Class[]{List.class, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        for (int i12 = 0; i12 < i10; i12++) {
            list.add(Integer.valueOf(i11));
        }
    }

    private static int d(char[] cArr, int i10, Set<Character> set) {
        Object[] objArr = {cArr, new Integer(i10), set};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 6000, new Class[]{char[].class, cls, Set.class}, cls);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        while (i10 < cArr.length) {
            if (!set.contains(Character.valueOf(cArr[i10]))) {
                return i10;
            }
            i10++;
        }
        return cArr.length;
    }

    private static int e(int i10, int i11, int i12) {
        Object[] objArr = {new Integer(i10), new Integer(i11), new Integer(i12)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 6003, new Class[]{cls, cls, cls}, cls);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : Math.min(i10, Math.min(i11, i12));
    }
}
