package com.tencent.thumbplayer.tcmedia.api;

/* JADX INFO: loaded from: classes4.dex */
public class TPHlsTag {
    public String codecs;
    public String groupId;
    public String language;
    public String name;
    public String resolution;
    public long bandwidth = -1;
    public float framerate = -1.0f;

    public long getBandwidth() {
        return this.bandwidth;
    }

    public String getCodecs() {
        return this.codecs;
    }

    public float getFramerate() {
        return this.framerate;
    }

    public String getGroupId() {
        return this.groupId;
    }

    public String getLanguage() {
        return this.language;
    }

    public String getName() {
        return this.name;
    }

    public String getResolution() {
        return this.resolution;
    }
}
