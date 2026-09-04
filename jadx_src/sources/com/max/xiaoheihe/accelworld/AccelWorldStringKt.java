package com.max.xiaoheihe.accelworld;

import android.text.Editable;
import com.huawei.hms.framework.common.ContainerUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.c1;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.s0;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.StringsKt___StringsKt;
import kotlinx.coroutines.e1;
import kotlinx.coroutines.r0;

/* JADX INFO: compiled from: AccelWorldString.kt */
/* JADX INFO: loaded from: classes3.dex */
@t0({"SMAP\nAccelWorldString.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AccelWorldString.kt\ncom/max/xiaoheihe/accelworld/AccelWorldStringKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,141:1\n1855#2:142\n1774#2,4:143\n1856#2:147\n1603#2,9:150\n1855#2:159\n1856#2:161\n1612#2:162\n215#3,2:148\n1#4:160\n*S KotlinDebug\n*F\n+ 1 AccelWorldString.kt\ncom/max/xiaoheihe/accelworld/AccelWorldStringKt\n*L\n98#1:142\n100#1:143,4\n98#1:147\n133#1:150,9\n133#1:159\n133#1:161\n133#1:162\n104#1:148,2\n133#1:160\n*E\n"})
public final class AccelWorldStringKt {
    public static ChangeQuickRedirect changeQuickRedirect;

    @dl.e
    public static final <T> T a(@dl.e String str, @dl.e Class<T> cls) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, cls}, null, changeQuickRedirect, true, bb.c.m.zy, new Class[]{String.class, Class.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return (T) patchProxyResultProxy.result;
        }
        if (str == null || kotlin.text.u.V1(str)) {
            return null;
        }
        try {
            return (T) com.max.hbutils.utils.k.c().fromJson(str, (Class) cls);
        } catch (Exception unused) {
            return null;
        }
    }

    public static final int b(@dl.e Editable editable) {
        String string;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{editable}, null, changeQuickRedirect, true, bb.c.m.Cy, new Class[]{Editable.class}, Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        if (editable == null || (string = editable.toString()) == null) {
            return 0;
        }
        return c(string);
    }

    public static final int c(@dl.e String str) {
        String str2;
        String str3;
        int iIntValue;
        int i10;
        fi.l lVarE;
        String strL2 = str;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{strL2}, null, changeQuickRedirect, true, bb.c.m.Dy, new Class[]{String.class}, Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        if (strL2 == null || str.length() == 0) {
            return 0;
        }
        double dS1 = 0.0d;
        if (kotlin.text.u.v2(strL2, lb.b.f131098n, false, 2, null)) {
            strL2 = kotlin.text.u.p2(str, lb.b.f131098n, "", false, 4, null);
            dS1 = 1.0d;
        }
        Regex regex = new Regex("<a.*?>(.*?)</a>");
        while (regex.b(strL2)) {
            kotlin.text.k kVarD = Regex.d(regex, strL2, 0, 2, null);
            if (kVarD != null) {
                kotlin.text.h hVar = kVarD.b().get(1);
                dS1 += (double) ((hVar == null || (lVarE = hVar.e()) == null) ? 0 : CollectionsKt___CollectionsKt.S1(lVarE));
                strL2 = StringsKt__StringsKt.f4(strL2, kVarD.d()).toString();
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Set<String> setE = com.max.hbexpression.f.e();
        f0.o(setE, "getNetworkEmojiMapKeys()");
        for (String emojiKey : setE) {
            if (!(emojiKey == null || emojiKey.length() == 0)) {
                f0.o(emojiKey, "emojiKey");
                List listM9 = StringsKt___StringsKt.m9(strL2, emojiKey.length(), 0, false, 6, null);
                if ((listM9 instanceof Collection) && listM9.isEmpty()) {
                    i10 = 0;
                } else {
                    Iterator it = listM9.iterator();
                    i10 = 0;
                    while (it.hasNext()) {
                        if (f0.g((String) it.next(), emojiKey) && (i10 = i10 + 1) < 0) {
                            CollectionsKt__CollectionsKt.V();
                        }
                    }
                }
                linkedHashMap.put(emojiKey, Integer.valueOf(i10));
            }
        }
        Iterator it2 = linkedHashMap.entrySet().iterator();
        loop3: while (true) {
            str2 = strL2;
            do {
                if (!it2.hasNext()) {
                    break loop3;
                }
                Map.Entry entry = (Map.Entry) it2.next();
                str3 = (String) entry.getKey();
                iIntValue = ((Number) entry.getValue()).intValue();
            } while (iIntValue == 0);
            dS1 += (double) iIntValue;
            strL2 = kotlin.text.u.l2(str2, str3, "", false, 4, null);
        }
        char[] charArray = str2.toCharArray();
        f0.o(charArray, "this as java.lang.String).toCharArray()");
        for (char c10 : charArray) {
            double d10 = 0.5d;
            if (c10 >= 128 && (c10 < ' ' || c10 > '~')) {
                d10 = 1.0d;
            }
            dS1 += d10;
        }
        return (int) dS1;
    }

    public static final void d(@dl.d String str) {
        if (PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, bb.c.m.By, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(str, "<this>");
        kotlinx.coroutines.k.f(r0.a(e1.c()), null, null, new AccelWorldStringKt$fastDelayExecuteProtocol$1(str, null), 3, null);
    }

    @dl.d
    public static final Map<String, String> e(@dl.e String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, bb.c.m.Fy, new Class[]{String.class}, Map.class);
        if (patchProxyResultProxy.isSupported) {
            return (Map) patchProxyResultProxy.result;
        }
        if (str == null) {
            return s0.z();
        }
        List listU4 = StringsKt__StringsKt.U4(str, new String[]{" "}, false, 0, 6, null);
        ArrayList arrayList = new ArrayList();
        Iterator it = listU4.iterator();
        while (it.hasNext()) {
            List listU5 = StringsKt__StringsKt.U4((String) it.next(), new String[]{ContainerUtils.KEY_VALUE_DELIMITER}, false, 2, 2, null);
            Pair pairA = listU5.size() == 2 ? c1.a(listU5.get(0), StringsKt__StringsKt.K5((String) listU5.get(1), kotlin.text.y.f128593b)) : null;
            if (pairA != null) {
                arrayList.add(pairA);
            }
        }
        return s0.B0(arrayList);
    }

    @dl.d
    public static final String f(@dl.d String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, bb.c.m.Ay, new Class[]{String.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        f0.p(str, "<this>");
        return kotlin.text.u.l2(kotlin.text.u.l2(kotlin.text.u.l2(kotlin.text.u.l2(kotlin.text.u.l2(kotlin.text.u.l2(kotlin.text.u.l2(kotlin.text.u.l2(str, "\\", "\\\\", false, 4, null), "\"", "\\\"", false, 4, null), "'", "\\'", false, 4, null), "\n", "\\n", false, 4, null), "\r", "\\r", false, 4, null), "\f", "\\f", false, 4, null), "\u2028", "\\u2028", false, 4, null), "\u2029", "\\u2029", false, 4, null);
    }

    @dl.e
    public static final String g(@dl.e String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, bb.c.m.Ey, new Class[]{String.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        if (str != null) {
            return new Regex("\\n+$").m(str, "");
        }
        return null;
    }
}
