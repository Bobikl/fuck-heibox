package com.max.hbsearch.config;

import bb.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.t0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: SearchContainerConfig.kt */
/* JADX INFO: loaded from: classes12.dex */
public enum SearchTabType implements Serializable {
    GENERAL(1),
    CHANNEL_CONTENT(2),
    MALL(3);

    public static ChangeQuickRedirect changeQuickRedirect;
    private final int value;
    private static final /* synthetic */ kotlin.enums.a $ENTRIES = EnumEntriesKt.b(values());

    @d
    public static final a Companion = new a(null);

    /* JADX INFO: compiled from: SearchContainerConfig.kt */
    @t0({"SMAP\nSearchContainerConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchContainerConfig.kt\ncom/max/hbsearch/config/SearchTabType$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,56:1\n1#2:57\n*E\n"})
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }

        @e
        public final SearchTabType a(int i10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, c.k.f33637j8, new Class[]{Integer.TYPE}, SearchTabType.class);
            if (patchProxyResultProxy.isSupported) {
                return (SearchTabType) patchProxyResultProxy.result;
            }
            for (SearchTabType searchTabType : SearchTabType.valuesCustom()) {
                if (searchTabType.getValue() == i10) {
                    return searchTabType;
                }
            }
            return null;
        }
    }

    SearchTabType(int i10) {
        this.value = i10;
    }

    @d
    public static kotlin.enums.a<SearchTabType> getEntries() {
        return $ENTRIES;
    }

    public static SearchTabType valueOf(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, c.k.f33614i8, new Class[]{String.class}, SearchTabType.class);
        return (SearchTabType) (patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : Enum.valueOf(SearchTabType.class, str));
    }

    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static SearchTabType[] valuesCustom() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 8322, new Class[0], SearchTabType[].class);
        return (SearchTabType[]) (patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : values().clone());
    }

    public final int getValue() {
        return this.value;
    }
}
