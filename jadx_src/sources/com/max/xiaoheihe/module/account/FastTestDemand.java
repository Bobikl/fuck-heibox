package com.max.xiaoheihe.module.account;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.io.Serializable;

/* JADX INFO: compiled from: FastTestHelper.kt */
/* JADX INFO: loaded from: classes9.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
public final class FastTestDemand implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f77666k = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private String f77667b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private String f77668c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.e
    private String f77669d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.e
    private String f77670e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.e
    private String f77671f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.e
    private String f77672g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @dl.e
    private String f77673h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f77674i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f77675j;

    public FastTestDemand(@dl.d String id2, @dl.d String name, @dl.e String str, @dl.e String str2, @dl.e String str3, @dl.e String str4, @dl.e String str5, int i10, boolean z10) {
        kotlin.jvm.internal.f0.p(id2, "id");
        kotlin.jvm.internal.f0.p(name, "name");
        this.f77667b = id2;
        this.f77668c = name;
        this.f77669d = str;
        this.f77670e = str2;
        this.f77671f = str3;
        this.f77672g = str4;
        this.f77673h = str5;
        this.f77674i = i10;
        this.f77675j = z10;
    }

    public /* synthetic */ FastTestDemand(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i10, boolean z10, int i11, kotlin.jvm.internal.u uVar) {
        this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? "" : str2, str3, str4, str5, str6, str7, (i11 & 128) != 0 ? 0 : i10, (i11 & 256) != 0 ? false : z10);
    }

    public static /* synthetic */ FastTestDemand k(FastTestDemand fastTestDemand, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i10, boolean z10, int i11, Object obj) {
        boolean z11 = z10;
        Object[] objArr = {fastTestDemand, str, str2, str3, str4, str5, str6, str7, new Integer(i10), new Byte(z11 ? (byte) 1 : (byte) 0), new Integer(i11), obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 22745, new Class[]{FastTestDemand.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, cls, Boolean.TYPE, cls, Object.class}, FastTestDemand.class);
        if (patchProxyResultProxy.isSupported) {
            return (FastTestDemand) patchProxyResultProxy.result;
        }
        String str8 = (i11 & 1) != 0 ? fastTestDemand.f77667b : str;
        String str9 = (i11 & 2) != 0 ? fastTestDemand.f77668c : str2;
        String str10 = (i11 & 4) != 0 ? fastTestDemand.f77669d : str3;
        String str11 = (i11 & 8) != 0 ? fastTestDemand.f77670e : str4;
        String str12 = (i11 & 16) != 0 ? fastTestDemand.f77671f : str5;
        String str13 = (i11 & 32) != 0 ? fastTestDemand.f77672g : str6;
        String str14 = (i11 & 64) != 0 ? fastTestDemand.f77673h : str7;
        int i12 = (i11 & 128) != 0 ? fastTestDemand.f77674i : i10;
        if ((i11 & 256) != 0) {
            z11 = fastTestDemand.f77675j;
        }
        return fastTestDemand.j(str8, str9, str10, str11, str12, str13, str14, i12, z11);
    }

    public final void A(@dl.e String str) {
        this.f77669d = str;
    }

    public final void B(@dl.e String str) {
        this.f77670e = str;
    }

    public final void C(@dl.e String str) {
        this.f77672g = str;
    }

    @dl.d
    public final String a() {
        return this.f77667b;
    }

    @dl.d
    public final String b() {
        return this.f77668c;
    }

    @dl.e
    public final String c() {
        return this.f77669d;
    }

    @dl.e
    public final String d() {
        return this.f77670e;
    }

    @dl.e
    public final String e() {
        return this.f77671f;
    }

    public boolean equals(@dl.e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 22748, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FastTestDemand)) {
            return false;
        }
        FastTestDemand fastTestDemand = (FastTestDemand) obj;
        return kotlin.jvm.internal.f0.g(this.f77667b, fastTestDemand.f77667b) && kotlin.jvm.internal.f0.g(this.f77668c, fastTestDemand.f77668c) && kotlin.jvm.internal.f0.g(this.f77669d, fastTestDemand.f77669d) && kotlin.jvm.internal.f0.g(this.f77670e, fastTestDemand.f77670e) && kotlin.jvm.internal.f0.g(this.f77671f, fastTestDemand.f77671f) && kotlin.jvm.internal.f0.g(this.f77672g, fastTestDemand.f77672g) && kotlin.jvm.internal.f0.g(this.f77673h, fastTestDemand.f77673h) && this.f77674i == fastTestDemand.f77674i && this.f77675j == fastTestDemand.f77675j;
    }

    @dl.e
    public final String f() {
        return this.f77672g;
    }

    @dl.e
    public final String g() {
        return this.f77673h;
    }

    public final int h() {
        return this.f77674i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r1v19, types: [int] */
    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 22747, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        int iHashCode = ((this.f77667b.hashCode() * 31) + this.f77668c.hashCode()) * 31;
        String str = this.f77669d;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f77670e;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f77671f;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f77672g;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f77673h;
        int iHashCode6 = (((iHashCode5 + (str5 != null ? str5.hashCode() : 0)) * 31) + this.f77674i) * 31;
        boolean z10 = this.f77675j;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        return iHashCode6 + r10;
    }

    public final boolean i() {
        return this.f77675j;
    }

    @dl.d
    public final FastTestDemand j(@dl.d String id2, @dl.d String name, @dl.e String str, @dl.e String str2, @dl.e String str3, @dl.e String str4, @dl.e String str5, int i10, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{id2, name, str, str2, str3, str4, str5, new Integer(i10), new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 22744, new Class[]{String.class, String.class, String.class, String.class, String.class, String.class, String.class, Integer.TYPE, Boolean.TYPE}, FastTestDemand.class);
        if (patchProxyResultProxy.isSupported) {
            return (FastTestDemand) patchProxyResultProxy.result;
        }
        kotlin.jvm.internal.f0.p(id2, "id");
        kotlin.jvm.internal.f0.p(name, "name");
        return new FastTestDemand(id2, name, str, str2, str3, str4, str5, i10, z10);
    }

    @dl.e
    public final String l() {
        return this.f77673h;
    }

    public final boolean m() {
        return this.f77675j;
    }

    public final int n() {
        return this.f77674i;
    }

    @dl.d
    public final String o() {
        return this.f77667b;
    }

    @dl.d
    public final String p() {
        return this.f77668c;
    }

    @dl.e
    public final String q() {
        return this.f77671f;
    }

    @dl.e
    public final String r() {
        return this.f77669d;
    }

    @dl.e
    public final String s() {
        return this.f77670e;
    }

    @dl.e
    public final String t() {
        return this.f77672g;
    }

    @dl.d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 22746, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "FastTestDemand(id=" + this.f77667b + ", name=" + this.f77668c + ", test_account=" + this.f77669d + ", test_account_phone=" + this.f77670e + ", tag=" + this.f77671f + ", web_tag=" + this.f77672g + ", abtest_key=" + this.f77673h + ", end_time=" + this.f77674i + ", delete=" + this.f77675j + ')';
    }

    public final void u(@dl.e String str) {
        this.f77673h = str;
    }

    public final void v(boolean z10) {
        this.f77675j = z10;
    }

    public final void w(int i10) {
        this.f77674i = i10;
    }

    public final void x(@dl.d String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 22742, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(str, "<set-?>");
        this.f77667b = str;
    }

    public final void y(@dl.d String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 22743, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(str, "<set-?>");
        this.f77668c = str;
    }

    public final void z(@dl.e String str) {
        this.f77671f = str;
    }
}
