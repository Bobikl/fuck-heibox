package com.max.xiaoheihe.bean.account;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: PlatformBindStatus.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class PlatformBindStatus implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;
    private boolean isBindCsgo;
    private boolean isBindDota2;
    private boolean isBindEpic;
    private boolean isBindHardware;
    private boolean isBindPSN;
    private boolean isBindSteam;
    private boolean isBindSwitch;
    private boolean isBindXbox;

    public PlatformBindStatus() {
        this(false, false, false, false, false, false, false, false, 255, null);
    }

    public PlatformBindStatus(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17) {
        this.isBindSteam = z10;
        this.isBindPSN = z11;
        this.isBindXbox = z12;
        this.isBindSwitch = z13;
        this.isBindHardware = z14;
        this.isBindEpic = z15;
        this.isBindDota2 = z16;
        this.isBindCsgo = z17;
    }

    public /* synthetic */ PlatformBindStatus(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, int i10, u uVar) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? false : z11, (i10 & 4) != 0 ? false : z12, (i10 & 8) != 0 ? false : z13, (i10 & 16) != 0 ? false : z14, (i10 & 32) != 0 ? false : z15, (i10 & 64) != 0 ? false : z16, (i10 & 128) == 0 ? z17 : false);
    }

    public static /* synthetic */ PlatformBindStatus copy$default(PlatformBindStatus platformBindStatus, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, int i10, Object obj) {
        boolean z18 = z10;
        boolean z19 = z11;
        boolean z20 = z12;
        boolean z21 = z13;
        boolean z22 = z14;
        boolean z23 = z15;
        Object[] objArr = {platformBindStatus, new Byte(z18 ? (byte) 1 : (byte) 0), new Byte(z19 ? (byte) 1 : (byte) 0), new Byte(z20 ? (byte) 1 : (byte) 0), new Byte(z21 ? (byte) 1 : (byte) 0), new Byte(z22 ? (byte) 1 : (byte) 0), new Byte(z23 ? (byte) 1 : (byte) 0), new Byte(z16 ? (byte) 1 : (byte) 0), new Byte(z17 ? (byte) 1 : (byte) 0), new Integer(i10), obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Boolean.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 13905, new Class[]{PlatformBindStatus.class, cls, cls, cls, cls, cls, cls, cls, cls, Integer.TYPE, Object.class}, PlatformBindStatus.class);
        if (patchProxyResultProxy.isSupported) {
            return (PlatformBindStatus) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            z18 = platformBindStatus.isBindSteam;
        }
        if ((i10 & 2) != 0) {
            z19 = platformBindStatus.isBindPSN;
        }
        if ((i10 & 4) != 0) {
            z20 = platformBindStatus.isBindXbox;
        }
        if ((i10 & 8) != 0) {
            z21 = platformBindStatus.isBindSwitch;
        }
        if ((i10 & 16) != 0) {
            z22 = platformBindStatus.isBindHardware;
        }
        if ((i10 & 32) != 0) {
            z23 = platformBindStatus.isBindEpic;
        }
        return platformBindStatus.copy(z18, z19, z20, z21, z22, z23, (i10 & 64) != 0 ? platformBindStatus.isBindDota2 : z16 ? 1 : 0, (i10 & 128) != 0 ? platformBindStatus.isBindCsgo : z17 ? 1 : 0);
    }

    public final boolean component1() {
        return this.isBindSteam;
    }

    public final boolean component2() {
        return this.isBindPSN;
    }

    public final boolean component3() {
        return this.isBindXbox;
    }

    public final boolean component4() {
        return this.isBindSwitch;
    }

    public final boolean component5() {
        return this.isBindHardware;
    }

    public final boolean component6() {
        return this.isBindEpic;
    }

    public final boolean component7() {
        return this.isBindDota2;
    }

    public final boolean component8() {
        return this.isBindCsgo;
    }

    @d
    public final PlatformBindStatus copy(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17) {
        Object[] objArr = {new Byte(z10 ? (byte) 1 : (byte) 0), new Byte(z11 ? (byte) 1 : (byte) 0), new Byte(z12 ? (byte) 1 : (byte) 0), new Byte(z13 ? (byte) 1 : (byte) 0), new Byte(z14 ? (byte) 1 : (byte) 0), new Byte(z15 ? (byte) 1 : (byte) 0), new Byte(z16 ? (byte) 1 : (byte) 0), new Byte(z17 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Boolean.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 13904, new Class[]{cls, cls, cls, cls, cls, cls, cls, cls}, PlatformBindStatus.class);
        return patchProxyResultProxy.isSupported ? (PlatformBindStatus) patchProxyResultProxy.result : new PlatformBindStatus(z10, z11, z12, z13, z14, z15, z16, z17);
    }

    public boolean equals(@e Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlatformBindStatus)) {
            return false;
        }
        PlatformBindStatus platformBindStatus = (PlatformBindStatus) obj;
        return this.isBindSteam == platformBindStatus.isBindSteam && this.isBindPSN == platformBindStatus.isBindPSN && this.isBindXbox == platformBindStatus.isBindXbox && this.isBindSwitch == platformBindStatus.isBindSwitch && this.isBindHardware == platformBindStatus.isBindHardware && this.isBindEpic == platformBindStatus.isBindEpic && this.isBindDota2 == platformBindStatus.isBindDota2 && this.isBindCsgo == platformBindStatus.isBindCsgo;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v11, types: [int] */
    /* JADX WARN: Type inference failed for: r0v13, types: [int] */
    /* JADX WARN: Type inference failed for: r0v15, types: [int] */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r0v7, types: [int] */
    /* JADX WARN: Type inference failed for: r0v9, types: [int] */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v11, types: [int] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v5, types: [int] */
    /* JADX WARN: Type inference failed for: r2v7, types: [int] */
    /* JADX WARN: Type inference failed for: r2v9, types: [int] */
    public int hashCode() {
        boolean z10 = this.isBindSteam;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        int i10 = r10 * 31;
        boolean z11 = this.isBindPSN;
        ?? r11 = z11;
        if (z11) {
            r11 = 1;
        }
        int i11 = (i10 + r11) * 31;
        boolean z12 = this.isBindXbox;
        ?? r12 = z12;
        if (z12) {
            r12 = 1;
        }
        int i12 = (i11 + r12) * 31;
        boolean z13 = this.isBindSwitch;
        ?? r13 = z13;
        if (z13) {
            r13 = 1;
        }
        int i13 = (i12 + r13) * 31;
        boolean z14 = this.isBindHardware;
        ?? r14 = z14;
        if (z14) {
            r14 = 1;
        }
        int i14 = (i13 + r14) * 31;
        boolean z15 = this.isBindEpic;
        ?? r15 = z15;
        if (z15) {
            r15 = 1;
        }
        int i15 = (i14 + r15) * 31;
        boolean z16 = this.isBindDota2;
        ?? r16 = z16;
        if (z16) {
            r16 = 1;
        }
        int i16 = (i15 + r16) * 31;
        boolean z17 = this.isBindCsgo;
        return i16 + (z17 ? 1 : z17);
    }

    public final boolean isBindCsgo() {
        return this.isBindCsgo;
    }

    public final boolean isBindDota2() {
        return this.isBindDota2;
    }

    public final boolean isBindEpic() {
        return this.isBindEpic;
    }

    public final boolean isBindHardware() {
        return this.isBindHardware;
    }

    public final boolean isBindPSN() {
        return this.isBindPSN;
    }

    public final boolean isBindSteam() {
        return this.isBindSteam;
    }

    public final boolean isBindSwitch() {
        return this.isBindSwitch;
    }

    public final boolean isBindXbox() {
        return this.isBindXbox;
    }

    public final void setBindCsgo(boolean z10) {
        this.isBindCsgo = z10;
    }

    public final void setBindDota2(boolean z10) {
        this.isBindDota2 = z10;
    }

    public final void setBindEpic(boolean z10) {
        this.isBindEpic = z10;
    }

    public final void setBindHardware(boolean z10) {
        this.isBindHardware = z10;
    }

    public final void setBindPSN(boolean z10) {
        this.isBindPSN = z10;
    }

    public final void setBindSteam(boolean z10) {
        this.isBindSteam = z10;
    }

    public final void setBindSwitch(boolean z10) {
        this.isBindSwitch = z10;
    }

    public final void setBindXbox(boolean z10) {
        this.isBindXbox = z10;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 13906, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "PlatformBindStatus(isBindSteam=" + this.isBindSteam + ", isBindPSN=" + this.isBindPSN + ", isBindXbox=" + this.isBindXbox + ", isBindSwitch=" + this.isBindSwitch + ", isBindHardware=" + this.isBindHardware + ", isBindEpic=" + this.isBindEpic + ", isBindDota2=" + this.isBindDota2 + ", isBindCsgo=" + this.isBindCsgo + ')';
    }
}
