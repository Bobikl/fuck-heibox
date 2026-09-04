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
@t0({"SMAP\nPriorityCounter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PriorityCounter.kt\ncom/max/xiaoheihe/utils/viewprioritymanager/BottomPriorityCounter\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,84:1\n515#2:85\n500#2,6:86\n*S KotlinDebug\n*F\n+ 1 PriorityCounter.kt\ncom/max/xiaoheihe/utils/viewprioritymanager/BottomPriorityCounter\n*L\n46#1:85\n46#1:86,6\n*E\n"})
@o(parameters = 0)
public final class a implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final a f95777a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private static final HashMap<Integer, Integer> f95778b = new HashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f95779c = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    private a() {
    }

    @Override // com.max.xiaoheihe.utils.viewprioritymanager.c
    public void a(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 49355, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        HashMap<Integer, Integer> map = f95778b;
        Integer numValueOf = Integer.valueOf(i10);
        Integer num = map.get(Integer.valueOf(i10));
        if (num == null) {
            num = 0;
        }
        map.put(numValueOf, Integer.valueOf(num.intValue() + 1));
        g.f74531b.M("BottomPriorityCounter 添加优先级priority: " + i10);
    }

    @Override // com.max.xiaoheihe.utils.viewprioritymanager.c
    public void b(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 49356, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        HashMap<Integer, Integer> map = f95778b;
        Integer num = map.get(Integer.valueOf(i10));
        if (num != null) {
            if (num.intValue() > 1) {
                map.put(Integer.valueOf(i10), Integer.valueOf(num.intValue() - 1));
            } else {
                map.remove(Integer.valueOf(i10));
            }
        }
        g.f74531b.M("BottomPriorityCounter 移除优先级priority: " + i10);
    }

    @Override // com.max.xiaoheihe.utils.viewprioritymanager.c
    public boolean c(int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 49357, new Class[]{Integer.TYPE}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        HashMap<Integer, Integer> map = f95778b;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getKey().intValue() > i10 && entry.getValue().intValue() > 0) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        boolean zIsEmpty = linkedHashMap.isEmpty();
        g.f74531b.M("BottomPriorityCounter isHighestPriority: " + i10);
        return zIsEmpty;
    }
}
