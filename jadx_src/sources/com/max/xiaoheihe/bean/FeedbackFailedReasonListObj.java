package com.max.xiaoheihe.bean;

import androidx.compose.runtime.internal.o;
import bb.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: FeedbackFailedReasonListObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class FeedbackFailedReasonListObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private ArrayList<String> reason;

    public FeedbackFailedReasonListObj(@e ArrayList<String> arrayList) {
        this.reason = arrayList;
    }

    public static /* synthetic */ FeedbackFailedReasonListObj copy$default(FeedbackFailedReasonListObj feedbackFailedReasonListObj, ArrayList arrayList, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{feedbackFailedReasonListObj, arrayList, new Integer(i10), obj}, null, changeQuickRedirect, true, c.m.aM, new Class[]{FeedbackFailedReasonListObj.class, ArrayList.class, Integer.TYPE, Object.class}, FeedbackFailedReasonListObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (FeedbackFailedReasonListObj) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            arrayList = feedbackFailedReasonListObj.reason;
        }
        return feedbackFailedReasonListObj.copy(arrayList);
    }

    @e
    public final ArrayList<String> component1() {
        return this.reason;
    }

    @d
    public final FeedbackFailedReasonListObj copy(@e ArrayList<String> arrayList) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{arrayList}, this, changeQuickRedirect, false, c.m.ZL, new Class[]{ArrayList.class}, FeedbackFailedReasonListObj.class);
        return patchProxyResultProxy.isSupported ? (FeedbackFailedReasonListObj) patchProxyResultProxy.result : new FeedbackFailedReasonListObj(arrayList);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, c.m.dM, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        return (obj instanceof FeedbackFailedReasonListObj) && f0.g(this.reason, ((FeedbackFailedReasonListObj) obj).reason);
    }

    @e
    public final ArrayList<String> getReason() {
        return this.reason;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.m.cM, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        ArrayList<String> arrayList = this.reason;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.hashCode();
    }

    public final void setReason(@e ArrayList<String> arrayList) {
        this.reason = arrayList;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.m.bM, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "FeedbackFailedReasonListObj(reason=" + this.reason + ')';
    }
}
