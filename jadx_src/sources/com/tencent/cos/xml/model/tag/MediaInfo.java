package com.tencent.cos.xml.model.tag;

import com.tencent.qcloud.qcloudxml.annoation.XmlBean;

/* JADX INFO: loaded from: classes4.dex */
@XmlBean
public class MediaInfo {
    public Format format;
    public Stream stream;

    @XmlBean
    public static class Audio {
        public float bitrate;
        public int channel;
        public String channelLayout;
        public String codecLongName;
        public String codecName;
        public String codecTag;
        public String codecTagString;
        public String codecTimeBase;
        public float duration;
        public int index;
        public String language;
        public String sampleFmt;
        public float sampleRate;
        public float startTime;
        public String timebase;
    }

    @XmlBean
    public static class Format {
        public float bitrate;
        public float duration;
        public String formatLongName;
        public String formatName;
        public int numProgram;
        public int numStream;
        public float size;
        public float startTime;
    }

    @XmlBean
    public static class Stream {
        public Audio audio;
        public Subtitle subtitle;
        public Video video;
    }

    @XmlBean
    public static class Subtitle {
        public int index;
        public String language;
    }

    @XmlBean
    public static class Video {
        public String avgFps;
        public float bitrate;
        public String codecLongName;
        public String codecName;
        public String codecTag;
        public String codecTagString;
        public String codecTimeBase;
        public String dar;
        public float duration;
        public String fieldOrder;
        public float fps;
        public int hasBFrame;
        public int height;
        public int index;
        public String language;
        public int level;
        public int numFrames;
        public String pixFormat;
        public String profile;
        public int refFrames;
        public String sar;
        public float startTime;
        public String timebase;
        public int width;
    }
}
