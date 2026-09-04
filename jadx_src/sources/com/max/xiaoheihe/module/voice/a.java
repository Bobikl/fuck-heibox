package com.max.xiaoheihe.module.voice;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: HeyboxMicViewModel.kt */
/* JADX INFO: loaded from: classes12.dex */
@o(parameters = 0)
public final class a {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f93951n = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f93952a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f93953b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f93954c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @e
    private final PCDeviceInfo f93955d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f93956e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f93957f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f93958g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f93959h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @e
    private final String f93960i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean f93961j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final boolean f93962k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final boolean f93963l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @e
    private final Boolean f93964m;

    public a() {
        this(false, false, false, null, 0, 0, false, false, null, false, false, false, null, 8191, null);
    }

    public a(boolean z10, boolean z11, boolean z12, @e PCDeviceInfo pCDeviceInfo, int i10, int i11, boolean z13, boolean z14, @e String str, boolean z15, boolean z16, boolean z17, @e Boolean bool) {
        this.f93952a = z10;
        this.f93953b = z11;
        this.f93954c = z12;
        this.f93955d = pCDeviceInfo;
        this.f93956e = i10;
        this.f93957f = i11;
        this.f93958g = z13;
        this.f93959h = z14;
        this.f93960i = str;
        this.f93961j = z15;
        this.f93962k = z16;
        this.f93963l = z17;
        this.f93964m = bool;
    }

    public /* synthetic */ a(boolean z10, boolean z11, boolean z12, PCDeviceInfo pCDeviceInfo, int i10, int i11, boolean z13, boolean z14, String str, boolean z15, boolean z16, boolean z17, Boolean bool, int i12, u uVar) {
        this((i12 & 1) != 0 ? false : z10, (i12 & 2) != 0 ? true : z11, (i12 & 4) != 0 ? false : z12, (i12 & 8) != 0 ? null : pCDeviceInfo, (i12 & 16) != 0 ? 0 : i10, (i12 & 32) != 0 ? 0 : i11, (i12 & 64) != 0 ? false : z13, (i12 & 128) != 0 ? false : z14, (i12 & 256) != 0 ? null : str, (i12 & 512) != 0 ? false : z15, (i12 & 1024) != 0 ? false : z16, (i12 & 2048) == 0 ? z17 : false, (i12 & 4096) == 0 ? bool : null);
    }

    public static /* synthetic */ a o(a aVar, boolean z10, boolean z11, boolean z12, PCDeviceInfo pCDeviceInfo, int i10, int i11, boolean z13, boolean z14, String str, boolean z15, boolean z16, boolean z17, Boolean bool, int i12, Object obj) {
        Object[] objArr = {aVar, new Byte(z10 ? (byte) 1 : (byte) 0), new Byte(z11 ? (byte) 1 : (byte) 0), new Byte(z12 ? (byte) 1 : (byte) 0), pCDeviceInfo, new Integer(i10), new Integer(i11), new Byte(z13 ? (byte) 1 : (byte) 0), new Byte(z14 ? (byte) 1 : (byte) 0), str, new Byte(z15 ? (byte) 1 : (byte) 0), new Byte(z16 ? (byte) 1 : (byte) 0), new Byte(z17 ? (byte) 1 : (byte) 0), bool, new Integer(i12), obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Boolean.TYPE;
        Class cls2 = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 46436, new Class[]{a.class, cls, cls, cls, PCDeviceInfo.class, cls2, cls2, cls, cls, String.class, cls, cls, cls, Boolean.class, cls2, Object.class}, a.class);
        if (patchProxyResultProxy.isSupported) {
            return (a) patchProxyResultProxy.result;
        }
        return aVar.n((i12 & 1) != 0 ? aVar.f93952a : z10 ? 1 : 0, (i12 & 2) != 0 ? aVar.f93953b : z11 ? 1 : 0, (i12 & 4) != 0 ? aVar.f93954c : z12 ? 1 : 0, (i12 & 8) != 0 ? aVar.f93955d : pCDeviceInfo, (i12 & 16) != 0 ? aVar.f93956e : i10, (i12 & 32) != 0 ? aVar.f93957f : i11, (i12 & 64) != 0 ? aVar.f93958g : z13 ? 1 : 0, (i12 & 128) != 0 ? aVar.f93959h : z14 ? 1 : 0, (i12 & 256) != 0 ? aVar.f93960i : str, (i12 & 512) != 0 ? aVar.f93961j : z15 ? 1 : 0, (i12 & 1024) != 0 ? aVar.f93962k : z16 ? 1 : 0, (i12 & 2048) != 0 ? aVar.f93963l : z17 ? 1 : 0, (i12 & 4096) != 0 ? aVar.f93964m : bool);
    }

    public final boolean A() {
        return this.f93953b;
    }

    public final boolean B() {
        return this.f93959h && this.f93957f > 0;
    }

    public final boolean C() {
        return this.f93958g;
    }

    public final boolean a() {
        return this.f93952a;
    }

    public final boolean b() {
        return this.f93961j;
    }

    public final boolean c() {
        return this.f93962k;
    }

    public final boolean d() {
        return this.f93963l;
    }

    @e
    public final Boolean e() {
        return this.f93964m;
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 46439, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f93952a == aVar.f93952a && this.f93953b == aVar.f93953b && this.f93954c == aVar.f93954c && f0.g(this.f93955d, aVar.f93955d) && this.f93956e == aVar.f93956e && this.f93957f == aVar.f93957f && this.f93958g == aVar.f93958g && this.f93959h == aVar.f93959h && f0.g(this.f93960i, aVar.f93960i) && this.f93961j == aVar.f93961j && this.f93962k == aVar.f93962k && this.f93963l == aVar.f93963l && f0.g(this.f93964m, aVar.f93964m);
    }

    public final boolean f() {
        return this.f93953b;
    }

    public final boolean g() {
        return this.f93954c;
    }

    @e
    public final PCDeviceInfo h() {
        return this.f93955d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v28 */
    /* JADX WARN: Type inference failed for: r1v29 */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r3v11, types: [int] */
    /* JADX WARN: Type inference failed for: r3v13, types: [int] */
    /* JADX WARN: Type inference failed for: r3v18, types: [int] */
    /* JADX WARN: Type inference failed for: r3v2, types: [int] */
    /* JADX WARN: Type inference failed for: r3v20, types: [int] */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX WARN: Type inference failed for: r3v30 */
    /* JADX WARN: Type inference failed for: r3v31 */
    /* JADX WARN: Type inference failed for: r3v32 */
    /* JADX WARN: Type inference failed for: r3v33 */
    /* JADX WARN: Type inference failed for: r3v34 */
    /* JADX WARN: Type inference failed for: r3v35 */
    /* JADX WARN: Type inference failed for: r3v4, types: [int] */
    public int hashCode() {
        ?? r10;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 46438, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        boolean z10 = this.f93952a;
        if (z10) {
            r10 = z10;
            r10 = 1;
        }
        r10 = z10;
        int i10 = r10 * 31;
        boolean z11 = this.f93953b;
        ?? r11 = z11;
        if (z11) {
            r11 = 1;
        }
        int i11 = (i10 + r11) * 31;
        boolean z12 = this.f93954c;
        ?? r12 = z12;
        if (z12) {
            r12 = 1;
        }
        int i12 = (i11 + r12) * 31;
        PCDeviceInfo pCDeviceInfo = this.f93955d;
        int iHashCode = (((((i12 + (pCDeviceInfo == null ? 0 : pCDeviceInfo.hashCode())) * 31) + this.f93956e) * 31) + this.f93957f) * 31;
        boolean z13 = this.f93958g;
        ?? r13 = z13;
        if (z13) {
            r13 = 1;
        }
        int i13 = (iHashCode + r13) * 31;
        boolean z14 = this.f93959h;
        ?? r14 = z14;
        if (z14) {
            r14 = 1;
        }
        int i14 = (i13 + r14) * 31;
        String str = this.f93960i;
        int iHashCode2 = (i14 + (str == null ? 0 : str.hashCode())) * 31;
        boolean z15 = this.f93961j;
        ?? r15 = z15;
        if (z15) {
            r15 = 1;
        }
        int i15 = (iHashCode2 + r15) * 31;
        boolean z16 = this.f93962k;
        ?? r16 = z16;
        if (z16) {
            r16 = 1;
        }
        int i16 = (i15 + r16) * 31;
        boolean z17 = this.f93963l;
        int i17 = (i16 + (z17 ? 1 : z17)) * 31;
        Boolean bool = this.f93964m;
        return i17 + (bool != null ? bool.hashCode() : 0);
    }

    public final int i() {
        return this.f93956e;
    }

    public final int j() {
        return this.f93957f;
    }

    public final boolean k() {
        return this.f93958g;
    }

    public final boolean l() {
        return this.f93959h;
    }

    @e
    public final String m() {
        return this.f93960i;
    }

    @d
    public final a n(boolean z10, boolean z11, boolean z12, @e PCDeviceInfo pCDeviceInfo, int i10, int i11, boolean z13, boolean z14, @e String str, boolean z15, boolean z16, boolean z17, @e Boolean bool) {
        Object[] objArr = {new Byte(z10 ? (byte) 1 : (byte) 0), new Byte(z11 ? (byte) 1 : (byte) 0), new Byte(z12 ? (byte) 1 : (byte) 0), pCDeviceInfo, new Integer(i10), new Integer(i11), new Byte(z13 ? (byte) 1 : (byte) 0), new Byte(z14 ? (byte) 1 : (byte) 0), str, new Byte(z15 ? (byte) 1 : (byte) 0), new Byte(z16 ? (byte) 1 : (byte) 0), new Byte(z17 ? (byte) 1 : (byte) 0), bool};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Boolean.TYPE;
        Class cls2 = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 46435, new Class[]{cls, cls, cls, PCDeviceInfo.class, cls2, cls2, cls, cls, String.class, cls, cls, cls, Boolean.class}, a.class);
        return patchProxyResultProxy.isSupported ? (a) patchProxyResultProxy.result : new a(z10, z11, z12, pCDeviceInfo, i10, i11, z13, z14, str, z15, z16, z17, bool);
    }

    @e
    public final Boolean p() {
        return this.f93964m;
    }

    public final boolean q() {
        return this.f93961j;
    }

    public final boolean r() {
        return this.f93962k;
    }

    @e
    public final String s() {
        return this.f93960i;
    }

    public final int t() {
        return this.f93956e;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 46437, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "HeyBoxMicUiState(permissionGranted=" + this.f93952a + ", isConnecting=" + this.f93953b + ", serviceConnected=" + this.f93954c + ", pcDeviceInfo=" + this.f93955d + ", micVolume=" + this.f93956e + ", seekBarProgress=" + this.f93957f + ", isStreamStarted=" + this.f93958g + ", isAudioStarted=" + this.f93959h + ", errorMsg=" + this.f93960i + ", connectFailed=" + this.f93961j + ", connectionInterrupt=" + this.f93962k + ", pcDisconnection=" + this.f93963l + ", audioPause=" + this.f93964m + ')';
    }

    @e
    public final PCDeviceInfo u() {
        return this.f93955d;
    }

    public final boolean v() {
        return this.f93963l;
    }

    public final boolean w() {
        return this.f93952a;
    }

    public final int x() {
        return this.f93957f;
    }

    public final boolean y() {
        return this.f93954c;
    }

    public final boolean z() {
        return this.f93959h;
    }
}
