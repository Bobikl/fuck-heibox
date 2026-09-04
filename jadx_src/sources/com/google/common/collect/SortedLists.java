package com.google.common.collect;

import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes7.dex */
@o9.a
@o9.b
@u
public final class SortedLists {

    public enum KeyAbsentBehavior {
        NEXT_LOWER { // from class: com.google.common.collect.SortedLists.KeyAbsentBehavior.1
            @Override // com.google.common.collect.SortedLists.KeyAbsentBehavior
            int resultIndex(int i10) {
                return i10 - 1;
            }
        },
        NEXT_HIGHER { // from class: com.google.common.collect.SortedLists.KeyAbsentBehavior.2
            @Override // com.google.common.collect.SortedLists.KeyAbsentBehavior
            public int resultIndex(int i10) {
                return i10;
            }
        },
        INVERTED_INSERTION_INDEX { // from class: com.google.common.collect.SortedLists.KeyAbsentBehavior.3
            @Override // com.google.common.collect.SortedLists.KeyAbsentBehavior
            public int resultIndex(int i10) {
                return ~i10;
            }
        };

        abstract int resultIndex(int i10);
    }

    public enum KeyPresentBehavior {
        ANY_PRESENT { // from class: com.google.common.collect.SortedLists.KeyPresentBehavior.1
            @Override // com.google.common.collect.SortedLists.KeyPresentBehavior
            <E> int resultIndex(Comparator<? super E> comparator, @x1 E e10, List<? extends E> list, int i10) {
                return i10;
            }
        },
        LAST_PRESENT { // from class: com.google.common.collect.SortedLists.KeyPresentBehavior.2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.common.collect.SortedLists.KeyPresentBehavior
            <E> int resultIndex(Comparator<? super E> comparator, @x1 E e10, List<? extends E> list, int i10) {
                int size = list.size() - 1;
                while (i10 < size) {
                    int i11 = ((i10 + size) + 1) >>> 1;
                    if (comparator.compare(list.get(i11), e10) > 0) {
                        size = i11 - 1;
                    } else {
                        i10 = i11;
                    }
                }
                return i10;
            }
        },
        FIRST_PRESENT { // from class: com.google.common.collect.SortedLists.KeyPresentBehavior.3
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.common.collect.SortedLists.KeyPresentBehavior
            <E> int resultIndex(Comparator<? super E> comparator, @x1 E e10, List<? extends E> list, int i10) {
                int i11 = 0;
                while (i11 < i10) {
                    int i12 = (i11 + i10) >>> 1;
                    if (comparator.compare(list.get(i12), e10) < 0) {
                        i11 = i12 + 1;
                    } else {
                        i10 = i12;
                    }
                }
                return i11;
            }
        },
        FIRST_AFTER { // from class: com.google.common.collect.SortedLists.KeyPresentBehavior.4
            @Override // com.google.common.collect.SortedLists.KeyPresentBehavior
            public <E> int resultIndex(Comparator<? super E> comparator, @x1 E e10, List<? extends E> list, int i10) {
                return KeyPresentBehavior.LAST_PRESENT.resultIndex(comparator, e10, list, i10) + 1;
            }
        },
        LAST_BEFORE { // from class: com.google.common.collect.SortedLists.KeyPresentBehavior.5
            @Override // com.google.common.collect.SortedLists.KeyPresentBehavior
            public <E> int resultIndex(Comparator<? super E> comparator, @x1 E e10, List<? extends E> list, int i10) {
                return KeyPresentBehavior.FIRST_PRESENT.resultIndex(comparator, e10, list, i10) - 1;
            }
        };

        abstract <E> int resultIndex(Comparator<? super E> comparator, @x1 E e10, List<? extends E> list, int i10);
    }

    private SortedLists() {
    }

    public static <E, K extends Comparable> int a(List<E> list, com.google.common.base.n<? super E, K> nVar, K k10, KeyPresentBehavior keyPresentBehavior, KeyAbsentBehavior keyAbsentBehavior) {
        com.google.common.base.w.E(k10);
        return b(list, nVar, k10, Ordering.z(), keyPresentBehavior, keyAbsentBehavior);
    }

    public static <E, K> int b(List<E> list, com.google.common.base.n<? super E, K> nVar, @x1 K k10, Comparator<? super K> comparator, KeyPresentBehavior keyPresentBehavior, KeyAbsentBehavior keyAbsentBehavior) {
        return d(Lists.D(list, nVar), k10, comparator, keyPresentBehavior, keyAbsentBehavior);
    }

    public static <E extends Comparable> int c(List<? extends E> list, E e10, KeyPresentBehavior keyPresentBehavior, KeyAbsentBehavior keyAbsentBehavior) {
        com.google.common.base.w.E(e10);
        return d(list, e10, Ordering.z(), keyPresentBehavior, keyAbsentBehavior);
    }

    public static <E> int d(List<? extends E> list, @x1 E e10, Comparator<? super E> comparator, KeyPresentBehavior keyPresentBehavior, KeyAbsentBehavior keyAbsentBehavior) {
        com.google.common.base.w.E(comparator);
        com.google.common.base.w.E(list);
        com.google.common.base.w.E(keyPresentBehavior);
        com.google.common.base.w.E(keyAbsentBehavior);
        if (!(list instanceof RandomAccess)) {
            list = Lists.r(list);
        }
        int i10 = 0;
        int size = list.size() - 1;
        while (i10 <= size) {
            int i11 = (i10 + size) >>> 1;
            int iCompare = comparator.compare(e10, list.get(i11));
            if (iCompare < 0) {
                size = i11 - 1;
            } else {
                if (iCompare <= 0) {
                    return i10 + keyPresentBehavior.resultIndex(comparator, e10, list.subList(i10, size + 1), i11 - i10);
                }
                i10 = i11 + 1;
            }
        }
        return keyAbsentBehavior.resultIndex(i10);
    }
}
