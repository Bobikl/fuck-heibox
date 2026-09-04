package com.max.xiaoheihe.bean.mall;

import androidx.compose.runtime.internal.o;
import com.max.hbcommon.bean.KeyDescObj;
import com.meituan.robust.ChangeQuickRedirect;
import dl.e;
import java.io.Serializable;

/* JADX INFO: compiled from: MemberBulletinResultObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class MemberBulletinResultObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private KeyDescObj button;

    @e
    private MemberCardInfoObj card;

    @e
    private String desc;

    @e
    private String tips;

    @e
    private String title;

    public MemberBulletinResultObj(@e String str, @e String str2, @e MemberCardInfoObj memberCardInfoObj, @e KeyDescObj keyDescObj, @e String str3) {
        this.tips = str;
        this.desc = str2;
        this.card = memberCardInfoObj;
        this.button = keyDescObj;
        this.title = str3;
    }

    @e
    public final KeyDescObj getButton() {
        return this.button;
    }

    @e
    public final MemberCardInfoObj getCard() {
        return this.card;
    }

    @e
    public final String getDesc() {
        return this.desc;
    }

    @e
    public final String getTips() {
        return this.tips;
    }

    @e
    public final String getTitle() {
        return this.title;
    }

    public final void setButton(@e KeyDescObj keyDescObj) {
        this.button = keyDescObj;
    }

    public final void setCard(@e MemberCardInfoObj memberCardInfoObj) {
        this.card = memberCardInfoObj;
    }

    public final void setDesc(@e String str) {
        this.desc = str;
    }

    public final void setTips(@e String str) {
        this.tips = str;
    }

    public final void setTitle(@e String str) {
        this.title = str;
    }
}
