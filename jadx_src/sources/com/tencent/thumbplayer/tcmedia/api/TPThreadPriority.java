package com.tencent.thumbplayer.tcmedia.api;

import com.tencent.thumbplayer.tcmedia.adapter.strategy.utils.TPNativeKeyMap;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes4.dex */
public class TPThreadPriority {

    @TPNativeKeyMap.MapThreadPriorityType(35)
    public static final int THREAD_PRIORITY_AUDIO = 35;

    @TPNativeKeyMap.MapThreadPriorityType(9)
    public static final int THREAD_PRIORITY_BACKGROUND = 9;

    @TPNativeKeyMap.MapThreadPriorityType(-1)
    public static final int THREAD_PRIORITY_DEFAULT = -1;

    @TPNativeKeyMap.MapThreadPriorityType(23)
    public static final int THREAD_PRIORITY_DISPLAY = 23;

    @TPNativeKeyMap.MapThreadPriorityType(21)
    public static final int THREAD_PRIORITY_FOREGROUND = 21;

    @TPNativeKeyMap.MapThreadPriorityType(0)
    public static final int THREAD_PRIORITY_LOWEST = 0;

    @TPNativeKeyMap.MapThreadPriorityType(38)
    public static final int THREAD_PRIORITY_URGENT_AUDIO = 38;

    @TPNativeKeyMap.MapThreadPriorityType(27)
    public static final int THREAD_PRIORITY_URGENT_DISPLAY = 27;

    @TPNativeKeyMap.MapThreadPriorityType(29)
    public static final int THREAD_PRIORITY_VIDEO = 29;

    @Retention(RetentionPolicy.SOURCE)
    public @interface THREAD_PRIORITY {
    }
}
