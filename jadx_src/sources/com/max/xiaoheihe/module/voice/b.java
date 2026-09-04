package com.max.xiaoheihe.module.voice;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.LinkAddress;
import android.net.LinkProperties;
import com.max.heybox.hblog.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: compiled from: HeyboxMicFragment.kt */
/* JADX INFO: loaded from: classes12.dex */
@t0({"SMAP\nHeyboxMicFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HeyboxMicFragment.kt\ncom/max/xiaoheihe/module/voice/HeyboxMicFragmentKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,614:1\n288#2,2:615\n288#2,2:617\n*S KotlinDebug\n*F\n+ 1 HeyboxMicFragment.kt\ncom/max/xiaoheihe/module/voice/HeyboxMicFragmentKt\n*L\n591#1:615,2\n600#1:617,2\n*E\n"})
public final class b {
    public static ChangeQuickRedirect changeQuickRedirect;

    @d
    public static final String a(@d Context context) {
        String str;
        Object next;
        Object next2;
        InetAddress address;
        String hostAddress;
        List listT4;
        LinkAddress linkAddress;
        InetAddress address2;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, null, changeQuickRedirect, true, 46649, new Class[]{Context.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        f0.p(context, "context");
        try {
            Object systemService = context.getSystemService("connectivity");
            f0.n(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
            ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
            LinkProperties linkProperties = connectivityManager.getLinkProperties(connectivityManager.getActiveNetwork());
            if (linkProperties == null) {
                return "0.0.0.0";
            }
            List<LinkAddress> linkAddresses = linkProperties.getLinkAddresses();
            f0.o(linkAddresses, "it.linkAddresses");
            Iterator<T> it = linkAddresses.iterator();
            do {
                str = null;
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!(((LinkAddress) next).getAddress() instanceof Inet4Address));
            LinkAddress linkAddress2 = (LinkAddress) next;
            String hostAddress2 = (linkAddress2 == null || (address2 = linkAddress2.getAddress()) == null) ? null : address2.getHostAddress();
            if (hostAddress2 != null) {
                return hostAddress2;
            }
            Iterator<T> it2 = linkAddresses.iterator();
            do {
                if (!it2.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it2.next();
                linkAddress = (LinkAddress) next2;
            } while (!((linkAddress.getAddress() instanceof Inet6Address) && !linkAddress.getAddress().isLoopbackAddress()));
            LinkAddress linkAddress3 = (LinkAddress) next2;
            if (linkAddress3 != null && (address = linkAddress3.getAddress()) != null && (hostAddress = address.getHostAddress()) != null && (listT4 = StringsKt__StringsKt.T4(hostAddress, new char[]{'%'}, false, 0, 6, null)) != null) {
                str = (String) CollectionsKt___CollectionsKt.w2(listT4);
            }
            return str != null ? str : "0.0.0.0";
        } catch (Exception e10) {
            g.f74531b.u(e10);
            return "0.0.0.0";
        }
    }
}
