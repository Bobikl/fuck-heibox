package com.max.hbsearch.config;

import bb.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.t0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: SearchContainerConfig.kt */
/* JADX INFO: loaded from: classes12.dex */
public enum HotHashtagType {
    EMPTY(0),
    GENERAL(1),
    MALL(2);

    public static ChangeQuickRedirect changeQuickRedirect;
    private final int value;
    private static final /* synthetic */ kotlin.enums.a $ENTRIES = EnumEntriesKt.b(values());

    @d
    public static final a Companion = new a(null);

    /* JADX INFO: compiled from: SearchContainerConfig.kt */
    @t0({"SMAP\nSearchContainerConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchContainerConfig.kt\ncom/max/hbsearch/config/HotHashtagType$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,56:1\n1#2:57\n*E\n"})
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }

        @e
        public final HotHashtagType a(int i10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, c.k.f33499d8, new Class[]{Integer.TYPE}, HotHashtagType.class);
            if (patchProxyResultProxy.isSupported) {
                return (HotHashtagType) patchProxyResultProxy.result;
            }
            for (HotHashtagType hotHashtagType : HotHashtagType.valuesCustom()) {
                if (hotHashtagType.getValue() == i10) {
                    return hotHashtagType;
                }
            }
            return null;
        }
    }

    HotHashtagType(int i10) {
        this.value = i10;
    }

    @d
    public static kotlin.enums.a<HotHashtagType> getEntries() {
        return $ENTRIES;
    }

    public static HotHashtagType valueOf(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, c.k.f33475c8, new Class[]{String.class}, HotHashtagType.class);
        return (HotHashtagType) (patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : Enum.valueOf(HotHashtagType.class, str));
    }

    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static HotHashtagType[] valuesCustom() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, c.k.f33452b8, new Class[0], HotHashtagType[].class);
        return (HotHashtagType[]) (patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : values().clone());
    }

    public final int getValue() {
        return this.value;
    }
}
