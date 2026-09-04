package com.tencent.thumbplayer.tcmedia.core.common;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public class TPNativeAudioAttributes {
    public static final int TP_NATIVE_CONTENT_MOVIE = 3;
    public static final int TP_NATIVE_CONTENT_MUSIC = 2;
    public static final int TP_NATIVE_CONTENT_SONIFICATION = 4;
    public static final int TP_NATIVE_CONTENT_SPEECH = 1;
    public static final int TP_NATIVE_CONTENT_UNKNOWN = 0;
    public static final int TP_NATIVE_FLAG_AUDIBILITY_ENFORCED = 1;
    public static final int TP_NATIVE_FLAG_HW_AV_SYNC = 16;
    public static final int TP_NATIVE_FLAG_LOW_LATENCY = 256;
    private static final int TP_NATIVE_FLAG_PUBLIC = 273;
    public static final int TP_NATIVE_FLAG_UNKNOWN = 0;
    public static final int TP_NATIVE_STREAM_ALARM = 4;
    public static final int TP_NATIVE_STREAM_DTMF = 8;
    public static final int TP_NATIVE_STREAM_MUSIC = 3;
    public static final int TP_NATIVE_STREAM_NOTIFICATION = 5;
    public static final int TP_NATIVE_STREAM_RING = 2;
    public static final int TP_NATIVE_STREAM_SYSTEM = 1;
    public static final int TP_NATIVE_STREAM_UNKNOWN = -1;
    public static final int TP_NATIVE_STREAM_VOICE_CALL = 0;
    public static final int TP_NATIVE_USAGE_ALARM = 4;
    public static final int TP_NATIVE_USAGE_ASSISTANCE_ACCESSIBILITY = 11;
    public static final int TP_NATIVE_USAGE_ASSISTANCE_NAVIGATION_GUIDANCE = 12;
    public static final int TP_NATIVE_USAGE_ASSISTANCE_SONIFICATION = 13;
    public static final int TP_NATIVE_USAGE_ASSISTANT = 16;
    public static final int TP_NATIVE_USAGE_GAME = 14;
    public static final int TP_NATIVE_USAGE_MEDIA = 1;
    public static final int TP_NATIVE_USAGE_NOTIFICATION = 5;
    public static final int TP_NATIVE_USAGE_NOTIFICATION_COMMUNICATION_DELAYED = 9;
    public static final int TP_NATIVE_USAGE_NOTIFICATION_COMMUNICATION_INSTANT = 8;
    public static final int TP_NATIVE_USAGE_NOTIFICATION_COMMUNICATION_REQUEST = 7;
    public static final int TP_NATIVE_USAGE_NOTIFICATION_EVENT = 10;
    public static final int TP_NATIVE_USAGE_NOTIFICATION_RINGTONE = 6;
    public static final int TP_NATIVE_USAGE_UNKNOWN = 0;
    public static final int TP_NATIVE_USAGE_VOICE_COMMUNICATION = 2;
    public static final int TP_NATIVE_USAGE_VOICE_COMMUNICATION_SIGNALLING = 3;
    private static final HashMap<Integer, String> mMapContentTypeToString;
    private static final HashMap<Integer, String> mMapUsageToString;
    private int mContentType;
    private int mFlags;
    private int mUsage;

    public static class Builder {
        private static final HashMap<Integer, Integer> mMapStreamTypeToContentType;
        private static final HashMap<Integer, Integer> mMapStreamTypeToUsage;
        private int mUsage = 0;
        private int mContentType = 0;
        private int mFlags = 0;

        static {
            HashMap<Integer, Integer> map = new HashMap<>();
            mMapStreamTypeToContentType = map;
            map.put(-1, 0);
            map.put(0, 1);
            map.put(1, 4);
            map.put(2, 4);
            map.put(3, 2);
            map.put(4, 4);
            map.put(5, 4);
            map.put(8, 4);
            HashMap<Integer, Integer> map2 = new HashMap<>();
            mMapStreamTypeToUsage = map2;
            map2.put(-1, 0);
            map2.put(0, 2);
            map2.put(1, 13);
            map2.put(2, 6);
            map2.put(3, 1);
            map2.put(4, 4);
            map2.put(5, 5);
            map2.put(8, 3);
        }

        public Builder addFlags(int i10) {
            this.mFlags = (i10 & 273) | this.mFlags;
            return this;
        }

        public TPNativeAudioAttributes build() {
            TPNativeAudioAttributes tPNativeAudioAttributes = new TPNativeAudioAttributes();
            tPNativeAudioAttributes.mContentType = this.mContentType;
            tPNativeAudioAttributes.mUsage = this.mUsage;
            tPNativeAudioAttributes.mFlags = this.mFlags;
            return tPNativeAudioAttributes;
        }

        public Builder setContentType(@TPNativeAudioAttributeContentType int i10) {
            if (!TPNativeAudioAttributes.mMapContentTypeToString.containsKey(Integer.valueOf(i10))) {
                i10 = 0;
            }
            this.mContentType = i10;
            return this;
        }

        public Builder setFlags(int i10) {
            this.mFlags = i10 & 273;
            return this;
        }

        public Builder setLegacyStreamType(@TPNativeAudioAttributeStreamType int i10) {
            HashMap<Integer, Integer> map = mMapStreamTypeToContentType;
            if (map.containsKey(Integer.valueOf(i10))) {
                this.mContentType = map.get(Integer.valueOf(i10)).intValue();
            } else {
                this.mContentType = 0;
            }
            HashMap<Integer, Integer> map2 = mMapStreamTypeToUsage;
            if (map2.containsKey(Integer.valueOf(i10))) {
                this.mUsage = map2.get(Integer.valueOf(i10)).intValue();
            } else {
                this.mUsage = 0;
            }
            return this;
        }

        public Builder setUsage(@TPNativeAudioAttributeUsage int i10) {
            if (!TPNativeAudioAttributes.mMapUsageToString.containsKey(Integer.valueOf(i10))) {
                i10 = 0;
            }
            this.mUsage = i10;
            return this;
        }
    }

    @Target({ElementType.METHOD, ElementType.LOCAL_VARIABLE, ElementType.PARAMETER})
    @Retention(RetentionPolicy.RUNTIME)
    public @interface TPNativeAudioAttributeContentType {
    }

    @Target({ElementType.METHOD, ElementType.LOCAL_VARIABLE, ElementType.PARAMETER})
    @Retention(RetentionPolicy.RUNTIME)
    public @interface TPNativeAudioAttributeFlag {
    }

    @Target({ElementType.METHOD, ElementType.LOCAL_VARIABLE, ElementType.PARAMETER})
    @Retention(RetentionPolicy.RUNTIME)
    public @interface TPNativeAudioAttributeStreamType {
    }

    @Target({ElementType.METHOD, ElementType.LOCAL_VARIABLE, ElementType.PARAMETER})
    @Retention(RetentionPolicy.RUNTIME)
    public @interface TPNativeAudioAttributeUsage {
    }

    static {
        HashMap<Integer, String> map = new HashMap<>();
        mMapContentTypeToString = map;
        map.put(0, "TP_NATIVE_CONTENT_UNKNOWN");
        map.put(1, "TP_NATIVE_CONTENT_SPEECH");
        map.put(2, "TP_NATIVE_CONTENT_MUSIC");
        map.put(3, "TP_NATIVE_CONTENT_MOVIE");
        map.put(4, "TP_NATIVE_CONTENT_SONIFICATION");
        HashMap<Integer, String> map2 = new HashMap<>();
        mMapUsageToString = map2;
        map2.put(0, "TP_NATIVE_USAGE_UNKNOWN");
        map2.put(1, "TP_NATIVE_USAGE_MEDIA");
        map2.put(2, "TP_NATIVE_USAGE_VOICE_COMMUNICATION");
        map2.put(3, "TP_NATIVE_USAGE_VOICE_COMMUNICATION_SIGNALLING");
        map2.put(4, "TP_NATIVE_USAGE_ALARM");
        map2.put(5, "TP_NATIVE_USAGE_NOTIFICATION");
        map2.put(6, "TP_NATIVE_USAGE_NOTIFICATION_RINGTONE");
        map2.put(7, "TP_NATIVE_USAGE_NOTIFICATION_COMMUNICATION_REQUEST");
        map2.put(8, "TP_NATIVE_USAGE_NOTIFICATION_COMMUNICATION_INSTANT");
        map2.put(9, "TP_NATIVE_USAGE_NOTIFICATION_COMMUNICATION_DELAYED");
        map2.put(10, "TP_NATIVE_USAGE_NOTIFICATION_EVENT");
        map2.put(11, "TP_NATIVE_USAGE_ASSISTANCE_ACCESSIBILITY");
        map2.put(12, "TP_NATIVE_USAGE_ASSISTANCE_NAVIGATION_GUIDANCE");
        map2.put(13, "TP_NATIVE_USAGE_ASSISTANCE_SONIFICATION");
        map2.put(14, "TP_NATIVE_USAGE_GAME");
        map2.put(16, "TP_NATIVE_USAGE_ASSISTANT");
    }

    private TPNativeAudioAttributes() {
        this.mUsage = 0;
        this.mContentType = 0;
        this.mFlags = 0;
    }

    public static String contentTypeToString(@TPNativeAudioAttributeContentType int i10) {
        HashMap<Integer, String> map = mMapContentTypeToString;
        return map.containsKey(Integer.valueOf(i10)) ? map.get(Integer.valueOf(i10)) : "unknown content type".concat(String.valueOf(i10));
    }

    public static String usageToString(@TPNativeAudioAttributeUsage int i10) {
        HashMap<Integer, String> map = mMapUsageToString;
        return map.containsKey(Integer.valueOf(i10)) ? map.get(Integer.valueOf(i10)) : "unknown usage ".concat(String.valueOf(i10));
    }

    @TPNativeAudioAttributeContentType
    public int getContentType() {
        return this.mContentType;
    }

    public int getFlags() {
        return this.mFlags & 273;
    }

    @TPNativeAudioAttributeUsage
    public int getUsage() {
        return this.mUsage;
    }

    public String toString() {
        return "AudioAttributes: usage=" + usageToString(this.mUsage) + " content=" + contentTypeToString(this.mContentType) + " flags=0x" + Integer.toHexString(this.mFlags).toUpperCase();
    }
}
