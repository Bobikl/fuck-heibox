package com.max.xiaoheihe.okflutter.entity;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.taobao.agoo.a.a.b;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: HybridResult.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\bJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J5\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0010R\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\n\"\u0004\b\u0014\u0010\f¨\u0006 "}, d2 = {"Lcom/max/xiaoheihe/okflutter/entity/HybridResult;", "Ljava/io/Serializable;", "resultID", "", b.JSON_ERRORCODE, "", "resultState", "resultJson", "(Ljava/lang/String;IILjava/lang/String;)V", "getResultCode", "()I", "setResultCode", "(I)V", "getResultID", "()Ljava/lang/String;", "setResultID", "(Ljava/lang/String;)V", "getResultJson", "setResultJson", "getResultState", "setResultState", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "toString", "heybox_okflutter_android_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class HybridResult implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    private int resultCode;

    @e
    private String resultID;

    @e
    private String resultJson;
    private int resultState;

    public HybridResult() {
        this(null, 0, 0, null, 15, null);
    }

    public HybridResult(@e String str, int i10, int i11, @e String str2) {
        this.resultID = str;
        this.resultCode = i10;
        this.resultState = i11;
        this.resultJson = str2;
    }

    public /* synthetic */ HybridResult(String str, int i10, int i11, String str2, int i12, u uVar) {
        this((i12 & 1) != 0 ? null : str, (i12 & 2) != 0 ? -1 : i10, (i12 & 4) != 0 ? 0 : i11, (i12 & 8) != 0 ? null : str2);
    }

    public static /* synthetic */ HybridResult copy$default(HybridResult hybridResult, String str, int i10, int i11, String str2, int i12, Object obj) {
        int i13 = i10;
        int i14 = i11;
        Object[] objArr = {hybridResult, str, new Integer(i13), new Integer(i14), str2, new Integer(i12), obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 47930, new Class[]{HybridResult.class, String.class, cls, cls, String.class, cls, Object.class}, HybridResult.class);
        if (patchProxyResultProxy.isSupported) {
            return (HybridResult) patchProxyResultProxy.result;
        }
        String str3 = (i12 & 1) != 0 ? hybridResult.resultID : str;
        if ((i12 & 2) != 0) {
            i13 = hybridResult.resultCode;
        }
        if ((i12 & 4) != 0) {
            i14 = hybridResult.resultState;
        }
        return hybridResult.copy(str3, i13, i14, (i12 & 8) != 0 ? hybridResult.resultJson : str2);
    }

    @e
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getResultID() {
        return this.resultID;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getResultCode() {
        return this.resultCode;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getResultState() {
        return this.resultState;
    }

    @e
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getResultJson() {
        return this.resultJson;
    }

    @d
    public final HybridResult copy(@e String resultID, int resultCode, int resultState, @e String resultJson) {
        Object[] objArr = {resultID, new Integer(resultCode), new Integer(resultState), resultJson};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 47929, new Class[]{String.class, cls, cls, String.class}, HybridResult.class);
        return patchProxyResultProxy.isSupported ? (HybridResult) patchProxyResultProxy.result : new HybridResult(resultID, resultCode, resultState, resultJson);
    }

    public boolean equals(@e Object other) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{other}, this, changeQuickRedirect, false, 47933, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == other) {
            return true;
        }
        if (!(other instanceof HybridResult)) {
            return false;
        }
        HybridResult hybridResult = (HybridResult) other;
        return f0.g(this.resultID, hybridResult.resultID) && this.resultCode == hybridResult.resultCode && this.resultState == hybridResult.resultState && f0.g(this.resultJson, hybridResult.resultJson);
    }

    public final int getResultCode() {
        return this.resultCode;
    }

    @e
    public final String getResultID() {
        return this.resultID;
    }

    @e
    public final String getResultJson() {
        return this.resultJson;
    }

    public final int getResultState() {
        return this.resultState;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47932, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.resultID;
        int iHashCode = (((((str == null ? 0 : str.hashCode()) * 31) + this.resultCode) * 31) + this.resultState) * 31;
        String str2 = this.resultJson;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final void setResultCode(int i10) {
        this.resultCode = i10;
    }

    public final void setResultID(@e String str) {
        this.resultID = str;
    }

    public final void setResultJson(@e String str) {
        this.resultJson = str;
    }

    public final void setResultState(int i10) {
        this.resultState = i10;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47931, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "HybridResult(resultID=" + this.resultID + ", resultCode=" + this.resultCode + ", resultState=" + this.resultState + ", resultJson=" + this.resultJson + ')';
    }
}
