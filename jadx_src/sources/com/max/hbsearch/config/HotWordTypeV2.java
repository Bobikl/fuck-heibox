package com.max.hbsearch.config;

import bb.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: SearchContainerConfig.kt */
/* JADX INFO: loaded from: classes12.dex */
public enum HotWordTypeV2 {
    EMPTY("empty"),
    GENERAL("general"),
    CHANNEL_CONTENT("channel"),
    MALL("mall");

    public static ChangeQuickRedirect changeQuickRedirect;

    @d
    private final String value;
    private static final /* synthetic */ kotlin.enums.a $ENTRIES = EnumEntriesKt.b(values());

    @d
    public static final a Companion = new a(null);

    /* JADX INFO: compiled from: SearchContainerConfig.kt */
    @t0({"SMAP\nSearchContainerConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchContainerConfig.kt\ncom/max/hbsearch/config/HotWordTypeV2$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,56:1\n1#2:57\n*E\n"})
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }

        @e
        public final HotWordTypeV2 a(@d String value) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{value}, this, changeQuickRedirect, false, c.k.f33568g8, new Class[]{String.class}, HotWordTypeV2.class);
            if (patchProxyResultProxy.isSupported) {
                return (HotWordTypeV2) patchProxyResultProxy.result;
            }
            f0.p(value, "value");
            for (HotWordTypeV2 hotWordTypeV2 : HotWordTypeV2.valuesCustom()) {
                if (f0.g(hotWordTypeV2.getValue(), value)) {
                    return hotWordTypeV2;
                }
            }
            return null;
        }
    }

    HotWordTypeV2(String str) {
        this.value = str;
    }

    @d
    public static kotlin.enums.a<HotWordTypeV2> getEntries() {
        return $ENTRIES;
    }

    public static HotWordTypeV2 valueOf(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, c.k.f33545f8, new Class[]{String.class}, HotWordTypeV2.class);
        return (HotWordTypeV2) (patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : Enum.valueOf(HotWordTypeV2.class, str));
    }

    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static HotWordTypeV2[] valuesCustom() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, c.k.f33522e8, new Class[0], HotWordTypeV2[].class);
        return (HotWordTypeV2[]) (patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : values().clone());
    }

    @d
    public final String getValue() {
        return this.value;
    }

    @Override // java.lang.Enum
    @d
    public String toString() {
        return this.value;
    }
}
