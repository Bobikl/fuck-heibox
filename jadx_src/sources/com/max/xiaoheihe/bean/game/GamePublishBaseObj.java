package com.max.xiaoheihe.bean.game;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: GamePublishBaseObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public class GamePublishBaseObj implements Serializable {

    @d
    public static final String TYPE_DISCOUNT = "2";

    @d
    public static final String TYPE_GAME = "0";

    @d
    public static final String TYPE_NORMAL_EVENT = "1";
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String item_type;

    @d
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: compiled from: GamePublishBaseObj.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(u uVar) {
            this();
        }
    }

    @e
    public final String getItem_type() {
        return this.item_type;
    }

    public final void setItem_type(@e String str) {
        this.item_type = str;
    }
}
