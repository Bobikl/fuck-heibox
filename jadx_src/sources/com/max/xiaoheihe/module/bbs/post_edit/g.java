package com.max.xiaoheihe.module.bbs.post_edit;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: EditCommentPost.kt */
/* JADX INFO: loaded from: classes10.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
public final class g {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f82963h = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final String f82964a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.e
    private final String f82965b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.e
    private final String f82966c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f82967d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.e
    private final String f82968e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.e
    private final String f82969f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.e
    private final String f82970g;

    public g(@dl.d String type, @dl.e String str, @dl.e String str2, boolean z10, @dl.e String str3, @dl.e String str4, @dl.e String str5) {
        kotlin.jvm.internal.f0.p(type, "type");
        this.f82964a = type;
        this.f82965b = str;
        this.f82966c = str2;
        this.f82967d = z10;
        this.f82968e = str3;
        this.f82969f = str4;
        this.f82970g = str5;
    }

    public /* synthetic */ g(String str, String str2, String str3, boolean z10, String str4, String str5, String str6, int i10, kotlin.jvm.internal.u uVar) {
        this(str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3, z10, (i10 & 16) != 0 ? null : str4, (i10 & 32) != 0 ? null : str5, (i10 & 64) != 0 ? null : str6);
    }

    public static /* synthetic */ g i(g gVar, String str, String str2, String str3, boolean z10, String str4, String str5, String str6, int i10, Object obj) {
        boolean z11 = z10;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{gVar, str, str2, str3, new Byte(z11 ? (byte) 1 : (byte) 0), str4, str5, str6, new Integer(i10), obj}, null, changeQuickRedirect, true, 29653, new Class[]{g.class, String.class, String.class, String.class, Boolean.TYPE, String.class, String.class, String.class, Integer.TYPE, Object.class}, g.class);
        if (patchProxyResultProxy.isSupported) {
            return (g) patchProxyResultProxy.result;
        }
        String str7 = (i10 & 1) != 0 ? gVar.f82964a : str;
        String str8 = (i10 & 2) != 0 ? gVar.f82965b : str2;
        String str9 = (i10 & 4) != 0 ? gVar.f82966c : str3;
        if ((i10 & 8) != 0) {
            z11 = gVar.f82967d;
        }
        return gVar.h(str7, str8, str9, z11, (i10 & 16) != 0 ? gVar.f82968e : str4, (i10 & 32) != 0 ? gVar.f82969f : str5, (i10 & 64) != 0 ? gVar.f82970g : str6);
    }

    @dl.d
    public final String a() {
        return this.f82964a;
    }

    @dl.e
    public final String b() {
        return this.f82965b;
    }

    @dl.e
    public final String c() {
        return this.f82966c;
    }

    public final boolean d() {
        return this.f82967d;
    }

    @dl.e
    public final String e() {
        return this.f82968e;
    }

    public boolean equals(@dl.e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 29656, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return kotlin.jvm.internal.f0.g(this.f82964a, gVar.f82964a) && kotlin.jvm.internal.f0.g(this.f82965b, gVar.f82965b) && kotlin.jvm.internal.f0.g(this.f82966c, gVar.f82966c) && this.f82967d == gVar.f82967d && kotlin.jvm.internal.f0.g(this.f82968e, gVar.f82968e) && kotlin.jvm.internal.f0.g(this.f82969f, gVar.f82969f) && kotlin.jvm.internal.f0.g(this.f82970g, gVar.f82970g);
    }

    @dl.e
    public final String f() {
        return this.f82969f;
    }

    @dl.e
    public final String g() {
        return this.f82970g;
    }

    @dl.d
    public final g h(@dl.d String type, @dl.e String str, @dl.e String str2, boolean z10, @dl.e String str3, @dl.e String str4, @dl.e String str5) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{type, str, str2, new Byte(z10 ? (byte) 1 : (byte) 0), str3, str4, str5}, this, changeQuickRedirect, false, 29652, new Class[]{String.class, String.class, String.class, Boolean.TYPE, String.class, String.class, String.class}, g.class);
        if (patchProxyResultProxy.isSupported) {
            return (g) patchProxyResultProxy.result;
        }
        kotlin.jvm.internal.f0.p(type, "type");
        return new g(type, str, str2, z10, str3, str4, str5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v9, types: [int] */
    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29655, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        int iHashCode = this.f82964a.hashCode() * 31;
        String str = this.f82965b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f82966c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        boolean z10 = this.f82967d;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        int i10 = (iHashCode3 + r10) * 31;
        String str3 = this.f82968e;
        int iHashCode4 = (i10 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f82969f;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f82970g;
        return iHashCode5 + (str5 != null ? str5.hashCode() : 0);
    }

    public final boolean j() {
        return this.f82967d;
    }

    @dl.e
    public final String k() {
        return this.f82970g;
    }

    @dl.e
    public final String l() {
        return this.f82968e;
    }

    @dl.e
    public final String m() {
        return this.f82965b;
    }

    @dl.d
    public final String n() {
        return this.f82964a;
    }

    @dl.e
    public final String o() {
        return this.f82966c;
    }

    @dl.e
    public final String p() {
        return this.f82969f;
    }

    @dl.d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 29654, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "Item(type=" + this.f82964a + ", text=" + this.f82965b + ", url=" + this.f82966c + ", checked=" + this.f82967d + ", height=" + this.f82968e + ", width=" + this.f82969f + ", commentText=" + this.f82970g + ')';
    }
}
