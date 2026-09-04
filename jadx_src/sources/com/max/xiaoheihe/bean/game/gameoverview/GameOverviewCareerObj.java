package com.max.xiaoheihe.bean.game.gameoverview;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import dl.e;
import java.util.List;

/* JADX INFO: compiled from: GameOverviewCareerObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class GameOverviewCareerObj extends BaseGameOverviewObj {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private List<CareerRecordObj> career_record;

    @e
    private String title;

    @e
    public final List<CareerRecordObj> getCareer_record() {
        return this.career_record;
    }

    @e
    public final String getTitle() {
        return this.title;
    }

    public final void setCareer_record(@e List<CareerRecordObj> list) {
        this.career_record = list;
    }

    public final void setTitle(@e String str) {
        this.title = str;
    }
}
