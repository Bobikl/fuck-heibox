package com.max.hbexpression;

import com.max.hbexpression.bean.ExpressionObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.t;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: compiled from: RecentEmojiManger.kt */
/* JADX INFO: loaded from: classes10.dex */
@t0({"SMAP\nRecentEmojiManger.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RecentEmojiManger.kt\ncom/max/hbexpression/RecentEmojiManger\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,80:1\n1855#2,2:81\n1549#2:83\n1620#2,3:84\n*S KotlinDebug\n*F\n+ 1 RecentEmojiManger.kt\ncom/max/hbexpression/RecentEmojiManger\n*L\n18#1:81,2\n41#1:83\n41#1:84,3\n*E\n"})
public final class RecentEmojiManger {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.e
    private static LinkedList<String> f70168b;
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final RecentEmojiManger f70167a = new RecentEmojiManger();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private static final String f70169c = "recent_emoji";

    private RecentEmojiManger() {
    }

    private final void e() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.g.R1, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        LinkedList<String> linkedList = f70168b;
        f0.m(linkedList);
        com.max.hbcache.c.z(f70169c, CollectionsKt___CollectionsKt.h3(linkedList, Constants.ACCEPT_TIME_SEPARATOR_SP, null, null, 0, null, new yh.l<String, CharSequence>() { // from class: com.max.hbexpression.RecentEmojiManger$saveCache$cacheStr$1
            public static ChangeQuickRedirect changeQuickRedirect;

            @dl.d
            public final CharSequence a(@dl.d String it) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, bb.c.g.V1, new Class[]{String.class}, CharSequence.class);
                if (patchProxyResultProxy.isSupported) {
                    return (CharSequence) patchProxyResultProxy.result;
                }
                f0.p(it, "it");
                return it;
            }

            /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.CharSequence, java.lang.Object] */
            @Override // yh.l
            public /* bridge */ /* synthetic */ CharSequence invoke(String str) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, bb.c.g.W1, new Class[]{Object.class}, Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a(str);
            }
        }, 30, null));
    }

    @dl.d
    public final String a() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.g.S1, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        String strJ = com.max.hbcache.c.j(f70169c);
        f0.o(strJ, "getEnterFlag(...)");
        return strJ;
    }

    @dl.e
    public final LinkedList<String> b() {
        return f70168b;
    }

    @dl.d
    public final List<ExpressionObj> c() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.g.Q1, new Class[0], List.class);
        if (patchProxyResultProxy.isSupported) {
            return (List) patchProxyResultProxy.result;
        }
        LinkedList<String> linkedList = f70168b;
        if (linkedList == null) {
            return CollectionsKt__CollectionsKt.E();
        }
        ArrayList arrayList = new ArrayList(t.Y(linkedList, 10));
        for (String str : linkedList) {
            ExpressionObj expressionObj = new ExpressionObj(str, -1, f.b(str));
            expressionObj.setType(1);
            arrayList.add(expressionObj);
        }
        return arrayList;
    }

    public final void d() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.g.P1, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        f70168b = new LinkedList<>();
        String strJ = com.max.hbcache.c.j(f70169c);
        if (!com.max.hbcommon.utils.c.u(strJ)) {
            f0.m(strJ);
            for (String str : StringsKt__StringsKt.U4(strJ, new String[]{Constants.ACCEPT_TIME_SEPARATOR_SP}, false, 0, 6, null)) {
                LinkedList<String> linkedList = f70168b;
                f0.m(linkedList);
                linkedList.add(str);
            }
            return;
        }
        LinkedList<String> linkedList2 = f70168b;
        if (linkedList2 != null) {
            linkedList2.add("[cube_惊讶]");
            linkedList2.add("[cube_开心]");
            linkedList2.add("[cube_黑人问号]");
            linkedList2.add("[cube_滑稽]");
            linkedList2.add("[cube_闭嘴]");
            linkedList2.add("[cube_并不简单]");
            linkedList2.add("[heygirl_苦酒入喉]");
            linkedList2.add("[cube_沧桑]");
            linkedList2.add("[cube_打脸]");
            linkedList2.add("[cube_感动]");
        }
    }

    public final void f(@dl.e LinkedList<String> linkedList) {
        f70168b = linkedList;
    }

    public final void g(@dl.e ExpressionObj expressionObj) {
        if (PatchProxy.proxy(new Object[]{expressionObj}, this, changeQuickRedirect, false, bb.c.g.T1, new Class[]{ExpressionObj.class}, Void.TYPE).isSupported || expressionObj == null) {
            return;
        }
        LinkedList<String> linkedList = f70168b;
        f0.m(linkedList);
        linkedList.remove(expressionObj.getEmoji_key());
        LinkedList<String> linkedList2 = f70168b;
        f0.m(linkedList2);
        linkedList2.addFirst(expressionObj.getEmoji_key());
        while (true) {
            LinkedList<String> linkedList3 = f70168b;
            f0.m(linkedList3);
            if (linkedList3.size() <= 10) {
                f70167a.e();
                return;
            } else {
                LinkedList<String> linkedList4 = f70168b;
                f0.m(linkedList4);
                linkedList4.removeLast();
            }
        }
    }

    public final void h(@dl.e String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, bb.c.g.U1, new Class[]{String.class}, Void.TYPE).isSupported || str == null) {
            return;
        }
        LinkedList<String> linkedList = f70168b;
        f0.m(linkedList);
        linkedList.remove(str);
        LinkedList<String> linkedList2 = f70168b;
        f0.m(linkedList2);
        linkedList2.addFirst(str);
        while (true) {
            LinkedList<String> linkedList3 = f70168b;
            f0.m(linkedList3);
            if (linkedList3.size() <= 10) {
                f70167a.e();
                return;
            } else {
                LinkedList<String> linkedList4 = f70168b;
                f0.m(linkedList4);
                linkedList4.removeLast();
            }
        }
    }
}
