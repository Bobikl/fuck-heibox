package com.tencent.thumbplayer.tcmedia.api.proxy;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes4.dex */
public class TPProxyEnum {
    public static final int DLTYPE_AUTO = 0;
    public static final int DLTYPE_CLIP_MP4_PRELOAD = 202;
    public static final int DLTYPE_CLIP_MP4_VOD = 2;
    public static final int DLTYPE_DASH_VOD = 19;
    public static final int DLTYPE_FILE_VOD = 10;

    @Deprecated
    public static final int DLTYPE_FILE_VOD_PROXYLOAD = 11;
    public static final int DLTYPE_HLS_ADV = 7;
    public static final int DLTYPE_HLS_ADV_LOOP = 8;
    public static final int DLTYPE_HLS_LIVE = 5;
    public static final int DLTYPE_HLS_VOD = 3;
    public static final int DLTYPE_HLS_VOD_LOOP = 4;
    public static final int DLTYPE_HTTP_FLV = 12;
    public static final int DLTYPE_LAN = 9;
    public static final int DLTYPE_MP4_ADV = 6;
    public static final int DLTYPE_MP4_VOD = 1;
    public static final int EVENT_APPTOBACK = 13;
    public static final int EVENT_APPTOFRONT = 14;
    public static final int EVENT_BUFFER_MORE_DATA = 21;
    public static final int EVENT_NOT_PLAYING = 16;
    public static final int EVENT_OFFLINE_ALLOWED = 4;
    public static final int EVENT_OFFLINE_FORBIDDEN = 3;
    public static final int EVENT_ON_PLAYING = 15;
    public static final int EVENT_P2PUPLOAD_OFF = 18;
    public static final int EVENT_P2PUPLOAD_ON = 17;
    public static final int EVENT_PLAY_ALLOWED = 6;
    public static final int EVENT_PLAY_FORBIDDEN = 5;
    public static final int EVENT_SCREEN_OFF = 20;
    public static final int EVENT_SCREEN_ON = 19;
    public static final int TASK_TYPE_ONLY_CREATE = 1;
    public static final int TASK_TYPE_PRELOAD = 0;

    @Retention(RetentionPolicy.SOURCE)
    public @interface TP_DLTYPE {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface TP_PROXY_EVENTID {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface TP_TASK_TYPE {
    }
}
