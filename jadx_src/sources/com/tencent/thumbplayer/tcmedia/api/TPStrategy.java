package com.tencent.thumbplayer.tcmedia.api;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes4.dex */
public class TPStrategy {
    public static final int DEC_STRATEGY_AUTO = 0;
    public static final int DEC_STRATEGY_HARD_FIRST = 2;
    public static final int DEC_STRATEGY_HARD_ONLY = 1;
    public static final int DEC_STRATEGY_SOFT_FIRST = 4;
    public static final int DEC_STRATEGY_SOFT_ONLY = 3;
    public static final int PLAYER_STRATEGY_AUTO = 0;
    public static final int PLAYER_STRATEGY_SYSTEM_FIRST = 4;
    public static final int PLAYER_STRATEGY_SYSTEM_ONLY = 3;
    public static final int PLAYER_STRATEGY_THUMB_FIRST = 2;
    public static final int PLAYER_STRATEGY_THUMB_ONLY = 1;

    @Retention(RetentionPolicy.SOURCE)
    public @interface DecStrategy {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface PlayerStrategy {
    }
}
