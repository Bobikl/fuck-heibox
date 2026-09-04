package com.max.xiaoheihe.bean.account;

import androidx.compose.runtime.internal.o;
import bb.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: AuthorInfoObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class AuthorInfoObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private AccountDetailObj author_info;

    public AuthorInfoObj(@e AccountDetailObj accountDetailObj) {
        this.author_info = accountDetailObj;
    }

    public static /* synthetic */ AuthorInfoObj copy$default(AuthorInfoObj authorInfoObj, AccountDetailObj accountDetailObj, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{authorInfoObj, accountDetailObj, new Integer(i10), obj}, null, changeQuickRedirect, true, c.m.xO, new Class[]{AuthorInfoObj.class, AccountDetailObj.class, Integer.TYPE, Object.class}, AuthorInfoObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (AuthorInfoObj) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            accountDetailObj = authorInfoObj.author_info;
        }
        return authorInfoObj.copy(accountDetailObj);
    }

    @e
    public final AccountDetailObj component1() {
        return this.author_info;
    }

    @d
    public final AuthorInfoObj copy(@e AccountDetailObj accountDetailObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{accountDetailObj}, this, changeQuickRedirect, false, c.m.wO, new Class[]{AccountDetailObj.class}, AuthorInfoObj.class);
        return patchProxyResultProxy.isSupported ? (AuthorInfoObj) patchProxyResultProxy.result : new AuthorInfoObj(accountDetailObj);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, c.m.AO, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        return (obj instanceof AuthorInfoObj) && f0.g(this.author_info, ((AuthorInfoObj) obj).author_info);
    }

    @e
    public final AccountDetailObj getAuthor_info() {
        return this.author_info;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.m.zO, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        AccountDetailObj accountDetailObj = this.author_info;
        if (accountDetailObj == null) {
            return 0;
        }
        return accountDetailObj.hashCode();
    }

    public final void setAuthor_info(@e AccountDetailObj accountDetailObj) {
        this.author_info = accountDetailObj;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.m.yO, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "AuthorInfoObj(author_info=" + this.author_info + ')';
    }
}
