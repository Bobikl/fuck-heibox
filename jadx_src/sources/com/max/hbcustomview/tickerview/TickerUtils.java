package com.max.hbcustomview.tickerview;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: loaded from: classes10.dex */
public class TickerUtils {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final char f69593a = 0;
    public static ChangeQuickRedirect changeQuickRedirect;

    public enum TickerTimeFormat {
        FORMAT_ANY,
        FORMAT_HMS_SEPARATE_BY_SEMICOLON;

        public static ChangeQuickRedirect changeQuickRedirect;

        public static TickerTimeFormat valueOf(String str) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, bb.c.f.Au, new Class[]{String.class}, TickerTimeFormat.class);
            return patchProxyResultProxy.isSupported ? (TickerTimeFormat) patchProxyResultProxy.result : (TickerTimeFormat) Enum.valueOf(TickerTimeFormat.class, str);
        }

        /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
        public static TickerTimeFormat[] valuesCustom() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, bb.c.f.zu, new Class[0], TickerTimeFormat[].class);
            return patchProxyResultProxy.isSupported ? (TickerTimeFormat[]) patchProxyResultProxy.result : (TickerTimeFormat[]) values().clone();
        }
    }

    public static String a() {
        return "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
    }

    public static String b() {
        return "0123456789";
    }
}
