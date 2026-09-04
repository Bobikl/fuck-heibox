package com.ishumei.smantifraud.l111l1111l1Il;

import android.os.Build;
import com.taobao.accs.common.Constants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public class l1111l111111Il<E> {
    private final Queue<C0515l1111l111111Il<E, Integer>> l1111l111111Il;
    private final int l111l11111lIl;

    /* JADX INFO: renamed from: com.ishumei.smantifraud.l111l1111l1Il.l1111l111111Il$l1111l111111Il, reason: collision with other inner class name */
    public static final class C0515l1111l111111Il<T1, T2> {
        public final T1 l1111l111111Il;
        public T2 l111l11111lIl;

        C0515l1111l111111Il(T1 t10, T2 t11) {
            this.l1111l111111Il = t10;
            this.l111l11111lIl = t11;
        }
    }

    public l1111l111111Il() {
    }

    public l1111l111111Il(int i10) {
        this.l111l11111lIl = i10;
        this.l1111l111111Il = new LinkedList();
    }

    public static HashMap<String, String> l111l11111lIl() {
        HashMap<String, String> map = new HashMap<>();
        try {
            map.put("board", Build.BOARD);
            map.put(Constants.KEY_MODEL, Build.MODEL);
            map.put("brand", Build.BRAND);
            map.put("manufacturer", Build.MANUFACTURER);
            map.put("fingerprint", Build.FINGERPRINT);
            map.put("cpu_abi", Build.CPU_ABI);
            map.put("cpu_abi2", Build.CPU_ABI2);
            map.put("radioVersion", Build.getRadioVersion());
        } catch (Exception unused) {
        }
        return map;
    }

    public final synchronized int l1111l111111Il(int... iArr) {
        int i10;
        i10 = 0;
        for (C0515l1111l111111Il<E, Integer> c0515l1111l111111Il : this.l1111l111111Il) {
            for (int i11 = 0; i11 < 2; i11++) {
                if (c0515l1111l111111Il.l111l11111lIl.intValue() == iArr[i11]) {
                    i10++;
                }
            }
        }
        return i10;
    }

    public final synchronized List<E> l1111l111111Il() {
        ArrayList arrayList;
        arrayList = new ArrayList(this.l1111l111111Il.size() + 1);
        Iterator<C0515l1111l111111Il<E, Integer>> it = this.l1111l111111Il.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().l1111l111111Il);
        }
        return arrayList;
    }

    public final synchronized void l1111l111111Il(Set<E> set) {
        Iterator<C0515l1111l111111Il<E, Integer>> it = this.l1111l111111Il.iterator();
        while (it.hasNext()) {
            if (set.contains(it.next().l1111l111111Il)) {
                it.remove();
            }
        }
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [T2, java.lang.Integer] */
    public final synchronized void l1111l111111Il(Set<E> set, int i10) {
        for (C0515l1111l111111Il<E, Integer> c0515l1111l111111Il : this.l1111l111111Il) {
            if (set.contains(c0515l1111l111111Il.l1111l111111Il)) {
                c0515l1111l111111Il.l111l11111lIl = Integer.valueOf(i10);
            }
        }
    }

    public final synchronized boolean l1111l111111Il(E e10, int i10) {
        boolean zAdd;
        zAdd = this.l1111l111111Il.add(new C0515l1111l111111Il<>(e10, 0));
        while (this.l1111l111111Il.size() > this.l111l11111lIl) {
            this.l1111l111111Il.remove();
        }
        return zAdd;
    }

    public final synchronized List<E> l111l11111lIl(int... iArr) {
        ArrayList arrayList;
        arrayList = new ArrayList(this.l1111l111111Il.size() + 1);
        for (C0515l1111l111111Il<E, Integer> c0515l1111l111111Il : this.l1111l111111Il) {
            for (int i10 = 0; i10 < 2; i10++) {
                if (c0515l1111l111111Il.l111l11111lIl.intValue() == iArr[i10]) {
                    arrayList.add(c0515l1111l111111Il.l1111l111111Il);
                }
            }
        }
        return arrayList;
    }
}
