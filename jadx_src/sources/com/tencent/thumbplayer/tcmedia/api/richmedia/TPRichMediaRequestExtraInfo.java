package com.tencent.thumbplayer.tcmedia.api.richmedia;

/* JADX INFO: loaded from: classes4.dex */
public class TPRichMediaRequestExtraInfo {
    public static final int TP_RICH_MEDIA_ACT_ON_OPTION_ACCOMPANY_AUDIO_CALLBACK = 2;
    public static final int TP_RICH_MEDIA_ACT_ON_OPTION_ACCOMPANY_VIDEO_CALLBACK = 1;
    public static final int TP_RICH_MEDIA_ACT_ON_OPTION_DIRECT_CALLBACK = 0;
    private int mActOnOption = 0;

    public int getActOnOption() {
        return this.mActOnOption;
    }

    public void setActOnOption(int i10) {
        this.mActOnOption = i10;
    }
}
