package com.max.xiaoheihe.module.account.utils;

import androidx.lifecycle.y;
import androidx.lifecycle.z;
import com.google.gson.Gson;
import com.max.hbutils.bean.Result;
import com.max.xiaoheihe.bean.game.GameObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.tencent.mmkv.MMKV;
import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.e1;

/* JADX INFO: compiled from: HBSteamInfoUtils.kt */
/* JADX INFO: loaded from: classes9.dex */
@t0({"SMAP\nHBSteamInfoUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HBSteamInfoUtils.kt\ncom/max/xiaoheihe/module/account/utils/HBSteamInfoUtilsKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,186:1\n1855#2,2:187\n766#2:189\n857#2,2:190\n*S KotlinDebug\n*F\n+ 1 HBSteamInfoUtils.kt\ncom/max/xiaoheihe/module/account/utils/HBSteamInfoUtilsKt\n*L\n69#1:187,2\n134#1:189\n134#1:190,2\n*E\n"})
public final class HBSteamInfoUtilsKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private static final String f79274a = "SteamGameInfo";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f79275b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f79276c = 1000;
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long f79277d = 60000;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long f79278e = 3600000;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final long f79279f = 86400000;

    public static final /* synthetic */ void a(String str, String str2) {
        if (PatchProxy.proxy(new Object[]{str, str2}, null, changeQuickRedirect, true, 25372, new Class[]{String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        e(str, str2);
    }

    public static final /* synthetic */ String b(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 25370, new Class[]{String.class}, String.class);
        return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : l(str);
    }

    public static final /* synthetic */ Object c(String str, kotlin.coroutines.c cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, cVar}, null, changeQuickRedirect, true, 25371, new Class[]{String.class, kotlin.coroutines.c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : m(str, cVar);
    }

    public static final /* synthetic */ void d(String str, String str2) {
        if (PatchProxy.proxy(new Object[]{str, str2}, null, changeQuickRedirect, true, 25369, new Class[]{String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        n(str, str2);
    }

    private static final void e(String str, String str2) {
        if (PatchProxy.proxy(new Object[]{str, str2}, null, changeQuickRedirect, true, 25361, new Class[]{String.class, String.class}, Void.TYPE).isSupported || str == null || str2 == null) {
            return;
        }
        g gVar = g.f79313a;
        if (gVar.b(str)) {
            return;
        }
        gVar.e(str, str2);
    }

    private static final String f(String str) {
        List listU4;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 25366, new Class[]{String.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        if (str == null || (listU4 = StringsKt__StringsKt.U4(str, new String[]{Constants.ACCEPT_TIME_SEPARATOR_SP}, false, 0, 6, null)) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : listU4) {
            if (!g.f79313a.b((String) obj)) {
                arrayList.add(obj);
            }
        }
        return CollectionsKt___CollectionsKt.h3(arrayList, Constants.ACCEPT_TIME_SEPARATOR_SP, null, null, 0, null, null, 62, null);
    }

    @dl.e
    public static final String g(@dl.d MMKV mmkv, @dl.e String str) {
        String string;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{mmkv, str}, null, changeQuickRedirect, true, 25363, new Class[]{MMKV.class, String.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        f0.p(mmkv, "<this>");
        if (str == null || (string = mmkv.getString(str, null)) == null) {
            return null;
        }
        a aVar = (a) new Gson().fromJson(string, a.class);
        if ((aVar != null ? aVar.e() : 0L) < System.currentTimeMillis()) {
            mmkv.remove(str);
            return null;
        }
        if (aVar != null) {
            return aVar.f();
        }
        return null;
    }

    private static final void h(String str) {
        List<String> listU4;
        String strL;
        if (PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 25360, new Class[]{String.class}, Void.TYPE).isSupported || str == null || (listU4 = StringsKt__StringsKt.U4(str, new String[]{Constants.ACCEPT_TIME_SEPARATOR_SP}, false, 0, 6, null)) == null) {
            return;
        }
        for (String str2 : listU4) {
            if (g.f79313a.d(str2) && (strL = l(str2)) != null) {
                e(str2, strL);
            }
        }
    }

    public static final void i(@dl.e String str, @dl.e b bVar, @dl.d y lifecycleOwner) {
        if (PatchProxy.proxy(new Object[]{str, bVar, lifecycleOwner}, null, changeQuickRedirect, true, 25367, new Class[]{String.class, b.class, y.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(lifecycleOwner, "lifecycleOwner");
        String strF = f(str);
        if (!(strF == null || strF.length() == 0)) {
            kotlinx.coroutines.k.f(z.a(lifecycleOwner), e1.c(), null, new HBSteamInfoUtilsKt$initSteamGameNameByIdFromRemote$1(strF, bVar, null), 2, null);
        } else if (bVar != null) {
            bVar.onSuccess();
        }
    }

    public static final void j(@dl.e String str, @dl.e b bVar, @dl.d y lifecycleOwner) {
        if (PatchProxy.proxy(new Object[]{str, bVar, lifecycleOwner}, null, changeQuickRedirect, true, 25359, new Class[]{String.class, b.class, y.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(lifecycleOwner, "lifecycleOwner");
        if (!(str == null || str.length() == 0)) {
            h(str);
            i(str, bVar, lifecycleOwner);
        } else if (bVar != null) {
            bVar.onSuccess();
        }
    }

    public static final void k(@dl.d MMKV mmkv, @dl.e String str, @dl.e String str2, long j10) {
        if (PatchProxy.proxy(new Object[]{mmkv, str, str2, new Long(j10)}, null, changeQuickRedirect, true, 25362, new Class[]{MMKV.class, String.class, String.class, Long.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(mmkv, "<this>");
        if (str == null || str2 == null) {
            return;
        }
        mmkv.putString(str, new Gson().toJson(new a(str2, System.currentTimeMillis() + j10)));
    }

    private static final String l(String str) {
        MMKV mmkvMmkvWithID;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 25365, new Class[]{String.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        if (str == null || (mmkvMmkvWithID = MMKV.mmkvWithID(f79274a)) == null) {
            return null;
        }
        return g(mmkvMmkvWithID, str);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0039  */
    private static final Object m(String str, kotlin.coroutines.c<? super List<? extends GameObj>> cVar) throws Throwable {
        HBSteamInfoUtilsKt$requestGameNamesFromRemote$1 hBSteamInfoUtilsKt$requestGameNamesFromRemote$1;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, cVar}, null, changeQuickRedirect, true, 25368, new Class[]{String.class, kotlin.coroutines.c.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        if (cVar instanceof HBSteamInfoUtilsKt$requestGameNamesFromRemote$1) {
            hBSteamInfoUtilsKt$requestGameNamesFromRemote$1 = (HBSteamInfoUtilsKt$requestGameNamesFromRemote$1) cVar;
            int i10 = hBSteamInfoUtilsKt$requestGameNamesFromRemote$1.f79287c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                hBSteamInfoUtilsKt$requestGameNamesFromRemote$1.f79287c = i10 - Integer.MIN_VALUE;
            } else {
                hBSteamInfoUtilsKt$requestGameNamesFromRemote$1 = new HBSteamInfoUtilsKt$requestGameNamesFromRemote$1(cVar);
            }
        } else {
            hBSteamInfoUtilsKt$requestGameNamesFromRemote$1 = new HBSteamInfoUtilsKt$requestGameNamesFromRemote$1(cVar);
        }
        Object objH = hBSteamInfoUtilsKt$requestGameNamesFromRemote$1.f79286b;
        Object objH2 = kotlin.coroutines.intrinsics.b.h();
        int i11 = hBSteamInfoUtilsKt$requestGameNamesFromRemote$1.f79287c;
        try {
            if (i11 == 0) {
                kotlin.t0.n(objH);
                if (str == null) {
                    return new ArrayList();
                }
                CoroutineDispatcher coroutineDispatcherC = e1.c();
                HBSteamInfoUtilsKt$requestGameNamesFromRemote$result$1 hBSteamInfoUtilsKt$requestGameNamesFromRemote$result$1 = new HBSteamInfoUtilsKt$requestGameNamesFromRemote$result$1(str, null);
                hBSteamInfoUtilsKt$requestGameNamesFromRemote$1.f79287c = 1;
                objH = kotlinx.coroutines.i.h(coroutineDispatcherC, hBSteamInfoUtilsKt$requestGameNamesFromRemote$result$1, hBSteamInfoUtilsKt$requestGameNamesFromRemote$1);
                if (objH == objH2) {
                    return objH2;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.t0.n(objH);
            }
            List list = (List) ((Result) objH).getResult();
            return list == null ? new ArrayList() : list;
        } catch (Exception unused) {
            return new ArrayList();
        }
    }

    private static final void n(String str, String str2) {
        MMKV mmkvMmkvWithID;
        if (PatchProxy.proxy(new Object[]{str, str2}, null, changeQuickRedirect, true, 25364, new Class[]{String.class, String.class}, Void.TYPE).isSupported || str == null || str2 == null || (mmkvMmkvWithID = MMKV.mmkvWithID(f79274a)) == null) {
            return;
        }
        k(mmkvMmkvWithID, str, str2, 86400000L);
    }
}
