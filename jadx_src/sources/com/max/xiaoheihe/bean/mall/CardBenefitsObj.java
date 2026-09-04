package com.max.xiaoheihe.bean.mall;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import dl.e;
import java.io.Serializable;

/* JADX INFO: compiled from: MemberBulletinResultObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class CardBenefitsObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String desc;

    @e
    private String icon;

    public CardBenefitsObj(@e String str, @e String str2) {
        this.desc = str;
        this.icon = str2;
    }

    @e
    public final String getDesc() {
        return this.desc;
    }

    @e
    public final String getIcon() {
        return this.icon;
    }

    public final void setDesc(@e String str) {
        this.desc = str;
    }

    public final void setIcon(@e String str) {
        this.icon = str;
    }
}
