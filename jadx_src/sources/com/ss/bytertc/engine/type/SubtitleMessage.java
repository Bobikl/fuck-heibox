package com.ss.bytertc.engine.type;

import com.bytedance.realx.base.CalledByNative;

/* JADX INFO: loaded from: classes4.dex */
public class SubtitleMessage {
    public boolean definite;
    public String language;
    public SubtitleMode mode;
    public int sequence;
    public String text;
    public String userId;

    public SubtitleMessage(String str, String str2, String str3, SubtitleMode subtitleMode, int i10, boolean z10) {
        this.userId = str;
        this.text = str2;
        this.language = str3;
        this.mode = subtitleMode;
        this.sequence = i10;
        this.definite = z10;
    }

    @CalledByNative
    public static SubtitleMessage create(String str, String str2, String str3, int i10, int i11, boolean z10) {
        return new SubtitleMessage(str, str2, str3, SubtitleMode.fromId(i10), i11, z10);
    }
}
