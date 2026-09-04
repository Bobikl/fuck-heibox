package com.max.xiaoheihe.bean.story;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: StoryModeListObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class CardIdInfoObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;
    private int card_type;

    @e
    private String item_id;

    /* JADX WARN: Multi-variable type inference failed */
    public CardIdInfoObj() {
        this(null, 0, 3, 0 == true ? 1 : 0);
    }

    public CardIdInfoObj(@e String str, int i10) {
        this.item_id = str;
        this.card_type = i10;
    }

    public /* synthetic */ CardIdInfoObj(String str, int i10, int i11, u uVar) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? 0 : i10);
    }

    public static /* synthetic */ CardIdInfoObj copy$default(CardIdInfoObj cardIdInfoObj, String str, int i10, int i11, Object obj) {
        Object[] objArr = {cardIdInfoObj, str, new Integer(i10), new Integer(i11), obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 15933, new Class[]{CardIdInfoObj.class, String.class, cls, cls, Object.class}, CardIdInfoObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (CardIdInfoObj) patchProxyResultProxy.result;
        }
        if ((i11 & 1) != 0) {
            str = cardIdInfoObj.item_id;
        }
        if ((i11 & 2) != 0) {
            i10 = cardIdInfoObj.card_type;
        }
        return cardIdInfoObj.copy(str, i10);
    }

    @e
    public final String component1() {
        return this.item_id;
    }

    public final int component2() {
        return this.card_type;
    }

    @d
    public final CardIdInfoObj copy(@e String str, int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, new Integer(i10)}, this, changeQuickRedirect, false, 15932, new Class[]{String.class, Integer.TYPE}, CardIdInfoObj.class);
        return patchProxyResultProxy.isSupported ? (CardIdInfoObj) patchProxyResultProxy.result : new CardIdInfoObj(str, i10);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 15936, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CardIdInfoObj)) {
            return false;
        }
        CardIdInfoObj cardIdInfoObj = (CardIdInfoObj) obj;
        return f0.g(this.item_id, cardIdInfoObj.item_id) && this.card_type == cardIdInfoObj.card_type;
    }

    public final int getCard_type() {
        return this.card_type;
    }

    @e
    public final String getItem_id() {
        return this.item_id;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15935, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.item_id;
        return ((str != null ? str.hashCode() : 0) * 31) + this.card_type;
    }

    public final void setCard_type(int i10) {
        this.card_type = i10;
    }

    public final void setItem_id(@e String str) {
        this.item_id = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15934, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "CardIdInfoObj(item_id=" + this.item_id + ", card_type=" + this.card_type + ')';
    }
}
