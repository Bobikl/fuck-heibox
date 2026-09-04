package com.max.xiaoheihe.utils.imageviewer;

import android.content.Context;
import androidx.collection.k;
import androidx.compose.runtime.internal.o;
import com.heybox.imageviewer.core.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.e1;
import kotlinx.coroutines.i;
import v9.b;

/* JADX INFO: compiled from: MediaData.kt */
/* JADX INFO: loaded from: classes13.dex */
@o(parameters = 0)
public final class MediaData implements d, v9.a, b {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f95526l = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final Context f95527a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f95528b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private String f95529c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f95530d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f95531e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @e
    private final String f95532f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @e
    private Serializable f95533g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f95534h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @e
    private String f95535i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @e
    private String f95536j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @e
    private String f95537k;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MediaData(@dl.d Context context, long j10, @dl.d String url) {
        this(context, j10, url, true, false, null, null, false, null, null, null);
        f0.p(context, "context");
        f0.p(url, "url");
    }

    public MediaData(@dl.d Context context, long j10, @dl.d String url, boolean z10, boolean z11, @e String str, @e Serializable serializable, boolean z12, @e String str2, @e String str3, @e String str4) {
        f0.p(context, "context");
        f0.p(url, "url");
        this.f95527a = context;
        this.f95528b = j10;
        this.f95529c = url;
        this.f95530d = z10;
        this.f95531e = z11;
        this.f95532f = str;
        this.f95533g = serializable;
        this.f95534h = z12;
        this.f95535i = str2;
        this.f95536j = str3;
        this.f95537k = str4;
    }

    public /* synthetic */ MediaData(Context context, long j10, String str, boolean z10, boolean z11, String str2, Serializable serializable, boolean z12, String str3, String str4, String str5, int i10, u uVar) {
        this(context, j10, str, (i10 & 8) != 0 ? true : z10, (i10 & 16) != 0 ? false : z11, (i10 & 32) != 0 ? null : str2, (i10 & 64) != 0 ? null : serializable, (i10 & 128) != 0 ? false : z12, (i10 & 256) != 0 ? null : str3, (i10 & 512) != 0 ? null : str4, (i10 & 1024) != 0 ? null : str5);
    }

    public static /* synthetic */ MediaData w(MediaData mediaData, Context context, long j10, String str, boolean z10, boolean z11, String str2, Serializable serializable, boolean z12, String str3, String str4, String str5, int i10, Object obj) {
        Object[] objArr = {mediaData, context, new Long(j10), str, new Byte(z10 ? (byte) 1 : (byte) 0), new Byte(z11 ? (byte) 1 : (byte) 0), str2, serializable, new Byte(z12 ? (byte) 1 : (byte) 0), str3, str4, str5, new Integer(i10), obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Boolean.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 49241, new Class[]{MediaData.class, Context.class, Long.TYPE, String.class, cls, cls, String.class, Serializable.class, cls, String.class, String.class, String.class, Integer.TYPE, Object.class}, MediaData.class);
        if (patchProxyResultProxy.isSupported) {
            return (MediaData) patchProxyResultProxy.result;
        }
        return mediaData.v((i10 & 1) != 0 ? mediaData.f95527a : context, (i10 & 2) != 0 ? mediaData.f95528b : j10, (i10 & 4) != 0 ? mediaData.f95529c : str, (i10 & 8) != 0 ? mediaData.f95530d : z10 ? 1 : 0, (i10 & 16) != 0 ? mediaData.f95531e : z11 ? 1 : 0, (i10 & 32) != 0 ? mediaData.f95532f : str2, (i10 & 64) != 0 ? mediaData.f95533g : serializable, (i10 & 128) != 0 ? mediaData.j() : z12 ? 1 : 0, (i10 & 256) != 0 ? mediaData.g() : str3, (i10 & 512) != 0 ? mediaData.e() : str4, (i10 & 1024) != 0 ? mediaData.f() : str5);
    }

    public final long A() {
        return this.f95528b;
    }

    public final boolean B() {
        return this.f95531e;
    }

    public final boolean C() {
        return this.f95530d;
    }

    @dl.d
    public final String D() {
        return this.f95529c;
    }

    public final void E(@e Serializable serializable) {
        this.f95533g = serializable;
    }

    public final void F(boolean z10) {
        this.f95531e = z10;
    }

    public final void G(boolean z10) {
        this.f95530d = z10;
    }

    public final void H(@dl.d String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 49233, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(str, "<set-?>");
        this.f95529c = str;
    }

    @Override // v9.a
    public void a(boolean z10) {
        this.f95534h = z10;
    }

    @Override // v9.a
    public void b(@e String str) {
        this.f95535i = str;
    }

    @Override // v9.a
    public void c(@e String str) {
        this.f95536j = str;
    }

    @Override // com.heybox.imageviewer.core.d
    @dl.d
    public Object d() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 49235, new Class[0], Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : d.a.a(this);
    }

    @Override // v9.a
    @e
    public String e() {
        return this.f95536j;
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 49244, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaData)) {
            return false;
        }
        MediaData mediaData = (MediaData) obj;
        return f0.g(this.f95527a, mediaData.f95527a) && this.f95528b == mediaData.f95528b && f0.g(this.f95529c, mediaData.f95529c) && this.f95530d == mediaData.f95530d && this.f95531e == mediaData.f95531e && f0.g(this.f95532f, mediaData.f95532f) && f0.g(this.f95533g, mediaData.f95533g) && j() == mediaData.j() && f0.g(g(), mediaData.g()) && f0.g(e(), mediaData.e()) && f0.g(f(), mediaData.f());
    }

    @Override // v9.b
    @e
    public String f() {
        return this.f95537k;
    }

    @Override // v9.a
    @e
    public String g() {
        return this.f95535i;
    }

    @Override // v9.b
    public void h(@e String str) {
        this.f95537k = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v30 */
    /* JADX WARN: Type inference failed for: r2v31 */
    /* JADX WARN: Type inference failed for: r2v32 */
    /* JADX WARN: Type inference failed for: r2v33 */
    /* JADX WARN: Type inference failed for: r2v7, types: [int] */
    /* JADX WARN: Type inference failed for: r2v9, types: [int] */
    public int hashCode() {
        ?? r10;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 49243, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        int iHashCode = ((((this.f95527a.hashCode() * 31) + k.a(this.f95528b)) * 31) + this.f95529c.hashCode()) * 31;
        boolean z10 = this.f95530d;
        if (z10) {
            r10 = z10;
            r10 = 1;
        }
        r10 = z10;
        int i10 = (iHashCode + r10) * 31;
        boolean z11 = this.f95531e;
        ?? r11 = z11;
        if (z11) {
            r11 = 1;
        }
        int i11 = (i10 + r11) * 31;
        String str = this.f95532f;
        int iHashCode2 = (i11 + (str == null ? 0 : str.hashCode())) * 31;
        Serializable serializable = this.f95533g;
        int iHashCode3 = (iHashCode2 + (serializable == null ? 0 : serializable.hashCode())) * 31;
        boolean zJ = j();
        return ((((((iHashCode3 + (zJ ? 1 : zJ)) * 31) + (g() == null ? 0 : g().hashCode())) * 31) + (e() == null ? 0 : e().hashCode())) * 31) + (f() != null ? f().hashCode() : 0);
    }

    @Override // com.heybox.imageviewer.core.d
    public int i() throws InterruptedException {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 49234, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        i.f(e1.c(), new MediaData$itemType$1(this, null));
        return this.f95531e ? 2 : 1;
    }

    @Override // com.heybox.imageviewer.core.d
    public long id() {
        return this.f95528b;
    }

    @Override // v9.a
    public boolean j() {
        return this.f95534h;
    }

    @dl.d
    public final Context k() {
        return this.f95527a;
    }

    @e
    public final String l() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 49238, new Class[0], String.class);
        return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : e();
    }

    @e
    public final String m() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 49239, new Class[0], String.class);
        return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : f();
    }

    public final long n() {
        return this.f95528b;
    }

    @dl.d
    public final String o() {
        return this.f95529c;
    }

    public final boolean p() {
        return this.f95530d;
    }

    public final boolean q() {
        return this.f95531e;
    }

    @e
    public final String r() {
        return this.f95532f;
    }

    @e
    public final Serializable s() {
        return this.f95533g;
    }

    public final boolean t() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 49236, new Class[0], Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : j();
    }

    @dl.d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 49242, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "MediaData(context=" + this.f95527a + ", id=" + this.f95528b + ", url=" + this.f95529c + ", uncheck=" + this.f95530d + ", subsampling=" + this.f95531e + ", extra=" + this.f95532f + ", extra1=" + this.f95533g + ", isOrigin=" + j() + ", originUrl=" + g() + ", originSizeStr=" + e() + ", parsedQRCode=" + f() + ')';
    }

    @e
    public final String u() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 49237, new Class[0], String.class);
        return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : g();
    }

    @dl.d
    public final MediaData v(@dl.d Context context, long j10, @dl.d String url, boolean z10, boolean z11, @e String str, @e Serializable serializable, boolean z12, @e String str2, @e String str3, @e String str4) {
        Object[] objArr = {context, new Long(j10), url, new Byte(z10 ? (byte) 1 : (byte) 0), new Byte(z11 ? (byte) 1 : (byte) 0), str, serializable, new Byte(z12 ? (byte) 1 : (byte) 0), str2, str3, str4};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Boolean.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 49240, new Class[]{Context.class, Long.TYPE, String.class, cls, cls, String.class, Serializable.class, cls, String.class, String.class, String.class}, MediaData.class);
        if (patchProxyResultProxy.isSupported) {
            return (MediaData) patchProxyResultProxy.result;
        }
        f0.p(context, "context");
        f0.p(url, "url");
        return new MediaData(context, j10, url, z10, z11, str, serializable, z12, str2, str3, str4);
    }

    @dl.d
    public final Context x() {
        return this.f95527a;
    }

    @e
    public final String y() {
        return this.f95532f;
    }

    @e
    public final Serializable z() {
        return this.f95533g;
    }
}
