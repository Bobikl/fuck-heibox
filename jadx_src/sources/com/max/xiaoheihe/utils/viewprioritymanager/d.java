package com.max.xiaoheihe.utils.viewprioritymanager;

import androidx.compose.runtime.internal.o;
import com.max.heybox.hblog.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.t0;

/* JADX INFO: compiled from: PriorityCounter.kt */
/* JADX INFO: loaded from: classes13.dex */
@t0({"SMAP\nPriorityCounter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PriorityCounter.kt\ncom/max/xiaoheihe/utils/viewprioritymanager/TopPriorityCounter\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,84:1\n515#2:85\n500#2,6:86\n515#2:92\n500#2,6:93\n*S KotlinDebug\n*F\n+ 1 PriorityCounter.kt\ncom/max/xiaoheihe/utils/viewprioritymanager/TopPriorityCounter\n*L\n77#1:85\n77#1:86,6\n79#1:92\n79#1:93,6\n*E\n"})
@o(parameters = 0)
public final class d implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final d f95783a = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private static final HashMap<Integer, Integer> f95784b = new HashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f95785c = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    private d() {
    }

    @Override // com.max.xiaoheihe.utils.viewprioritymanager.c
    public void a(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 49365, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        HashMap<Integer, Integer> map = f95784b;
        Integer numValueOf = Integer.valueOf(i10);
        Integer num = map.get(Integer.valueOf(i10));
        if (num == null) {
            num = 0;
        }
        map.put(numValueOf, Integer.valueOf(num.intValue() + 1));
        g.f74531b.M("TopPriorityCounter 添加优先级priority: " + i10);
    }

    @Override // com.max.xiaoheihe.utils.viewprioritymanager.c
    public void b(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 49366, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        HashMap<Integer, Integer> map = f95784b;
        Integer num = map.get(Integer.valueOf(i10));
        if (num != null) {
            if (num.intValue() > 1) {
                map.put(Integer.valueOf(i10), Integer.valueOf(num.intValue() - 1));
            } else {
                map.remove(Integer.valueOf(i10));
            }
        }
        g.f74531b.M("TopPriorityCounter 移除优先级priority: " + i10);
    }

    @Override // com.max.xiaoheihe.utils.viewprioritymanager.c
    public boolean c(int i10) {
        boolean zIsEmpty;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 49367, new Class[]{Integer.TYPE}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (i10 > ViewPriority.LOW.getValue()) {
            HashMap<Integer, Integer> map = f95784b;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                if (entry.getKey().intValue() >= i10 && entry.getValue().intValue() > 0) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            zIsEmpty = linkedHashMap.isEmpty();
        } else {
            HashMap<Integer, Integer> map2 = f95784b;
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Map.Entry<Integer, Integer> entry2 : map2.entrySet()) {
                if (entry2.getKey().intValue() > i10 && entry2.getValue().intValue() > 0) {
                    linkedHashMap2.put(entry2.getKey(), entry2.getValue());
                }
            }
            zIsEmpty = linkedHashMap2.isEmpty();
        }
        g.f74531b.M("TopPriorityCounter isHighestPriority: " + i10);
        return zIsEmpty;
    }
}
