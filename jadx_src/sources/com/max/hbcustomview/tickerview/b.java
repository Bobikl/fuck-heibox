package com.max.hbcustomview.tickerview;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: TickerCharacterList.java */
/* JADX INFO: loaded from: classes10.dex */
public class b {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f69633a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final char[] f69634b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map<Character, Integer> f69635c;

    /* JADX INFO: compiled from: TickerCharacterList.java */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f69636a;

        static {
            int[] iArr = new int[TickerView.ScrollingDirection.valuesCustom().length];
            f69636a = iArr;
            try {
                iArr[TickerView.ScrollingDirection.DOWN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f69636a[TickerView.ScrollingDirection.UP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f69636a[TickerView.ScrollingDirection.ANY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: renamed from: com.max.hbcustomview.tickerview.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: TickerCharacterList.java */
    public class C0563b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f69637a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f69638b;

        public C0563b(int i10, int i11) {
            this.f69637a = i10;
            this.f69638b = i11;
        }
    }

    b(String str) {
        int i10 = 0;
        if (str.contains(Character.toString((char) 0))) {
            throw new IllegalArgumentException("You cannot include TickerUtils.EMPTY_CHAR in the character list.");
        }
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        this.f69633a = length;
        this.f69635c = new HashMap(length);
        for (int i11 = 0; i11 < length; i11++) {
            this.f69635c.put(Character.valueOf(charArray[i11]), Integer.valueOf(i11));
        }
        char[] cArr = new char[(length * 2) + 1];
        this.f69634b = cArr;
        cArr[0] = 0;
        while (i10 < length) {
            char[] cArr2 = this.f69634b;
            int i12 = i10 + 1;
            cArr2[i12] = charArray[i10];
            cArr2[length + 1 + i10] = charArray[i10];
            i10 = i12;
        }
    }

    private int c(char c10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Character(c10)}, this, changeQuickRedirect, false, 6006, new Class[]{Character.TYPE}, Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        if (c10 == 0) {
            return 0;
        }
        if (this.f69635c.containsKey(Character.valueOf(c10))) {
            return this.f69635c.get(Character.valueOf(c10)).intValue() + 1;
        }
        return -1;
    }

    C0563b a(char c10, char c11, TickerView.ScrollingDirection scrollingDirection) {
        Object[] objArr = {new Character(c10), new Character(c11), scrollingDirection};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Character.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 6004, new Class[]{cls, cls, TickerView.ScrollingDirection.class}, C0563b.class);
        if (patchProxyResultProxy.isSupported) {
            return (C0563b) patchProxyResultProxy.result;
        }
        int iC = c(c10);
        int iC2 = c(c11);
        if (iC < 0 || iC2 < 0) {
            return null;
        }
        int i10 = a.f69636a[scrollingDirection.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3 && c10 != 0 && c11 != 0) {
                    if (iC2 < iC) {
                        int i11 = iC - iC2;
                        int i12 = this.f69633a;
                        if ((i12 - iC) + iC2 < i11) {
                            iC2 += i12;
                        }
                    } else if (iC < iC2) {
                        int i13 = iC2 - iC;
                        int i14 = this.f69633a;
                        if ((i14 - iC2) + iC < i13) {
                            iC += i14;
                        }
                    }
                }
            } else if (iC < iC2) {
                iC += this.f69633a;
            }
        } else if (c11 == 0) {
            iC2 = this.f69634b.length;
        } else if (iC2 < iC) {
            iC2 += this.f69633a;
        }
        return new C0563b(iC, iC2);
    }

    char[] b() {
        return this.f69634b;
    }

    Set<Character> d() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 6005, new Class[0], Set.class);
        return patchProxyResultProxy.isSupported ? (Set) patchProxyResultProxy.result : this.f69635c.keySet();
    }

    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 6007, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "TickerCharacterList{numOriginalCharacters=" + this.f69633a + ", characterList=" + Arrays.toString(this.f69634b) + ", characterIndicesMap=" + this.f69635c + '}';
    }
}
