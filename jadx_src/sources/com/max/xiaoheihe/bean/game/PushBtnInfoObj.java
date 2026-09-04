package com.max.xiaoheihe.bean.game;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: PushBtnInfoObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class PushBtnInfoObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String msg;

    @e
    private PushBtnClickInfoObj next;

    public PushBtnInfoObj(@e String str, @e PushBtnClickInfoObj pushBtnClickInfoObj) {
        this.msg = str;
        this.next = pushBtnClickInfoObj;
    }

    public static /* synthetic */ PushBtnInfoObj copy$default(PushBtnInfoObj pushBtnInfoObj, String str, PushBtnClickInfoObj pushBtnClickInfoObj, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{pushBtnInfoObj, str, pushBtnClickInfoObj, new Integer(i10), obj}, null, changeQuickRedirect, true, 14972, new Class[]{PushBtnInfoObj.class, String.class, PushBtnClickInfoObj.class, Integer.TYPE, Object.class}, PushBtnInfoObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (PushBtnInfoObj) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            str = pushBtnInfoObj.msg;
        }
        if ((i10 & 2) != 0) {
            pushBtnClickInfoObj = pushBtnInfoObj.next;
        }
        return pushBtnInfoObj.copy(str, pushBtnClickInfoObj);
    }

    @e
    public final String component1() {
        return this.msg;
    }

    @e
    public final PushBtnClickInfoObj component2() {
        return this.next;
    }

    @d
    public final PushBtnInfoObj copy(@e String str, @e PushBtnClickInfoObj pushBtnClickInfoObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, pushBtnClickInfoObj}, this, changeQuickRedirect, false, 14971, new Class[]{String.class, PushBtnClickInfoObj.class}, PushBtnInfoObj.class);
        return patchProxyResultProxy.isSupported ? (PushBtnInfoObj) patchProxyResultProxy.result : new PushBtnInfoObj(str, pushBtnClickInfoObj);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 14975, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PushBtnInfoObj)) {
            return false;
        }
        PushBtnInfoObj pushBtnInfoObj = (PushBtnInfoObj) obj;
        return f0.g(this.msg, pushBtnInfoObj.msg) && f0.g(this.next, pushBtnInfoObj.next);
    }

    @e
    public final String getMsg() {
        return this.msg;
    }

    @e
    public final PushBtnClickInfoObj getNext() {
        return this.next;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14974, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.msg;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        PushBtnClickInfoObj pushBtnClickInfoObj = this.next;
        return iHashCode + (pushBtnClickInfoObj != null ? pushBtnClickInfoObj.hashCode() : 0);
    }

    public final void setMsg(@e String str) {
        this.msg = str;
    }

    public final void setNext(@e PushBtnClickInfoObj pushBtnClickInfoObj) {
        this.next = pushBtnClickInfoObj;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14973, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "PushBtnInfoObj(msg=" + this.msg + ", next=" + this.next + ')';
    }
}
