package com.tencent.thumbplayer.tcmedia.api;

import android.media.AudioAttributes;
import com.tencent.thumbplayer.tcmedia.adapter.strategy.utils.TPNativeKeyMap;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public class TPAudioAttributes {

    @TPNativeKeyMap.MapTPAudioAttributeContentType(3)
    public static final int TP_CONTENT_MOVIE = 3;

    @TPNativeKeyMap.MapTPAudioAttributeContentType(2)
    public static final int TP_CONTENT_MUSIC = 2;

    @TPNativeKeyMap.MapTPAudioAttributeContentType(4)
    public static final int TP_CONTENT_SONIFICATION = 4;

    @TPNativeKeyMap.MapTPAudioAttributeContentType(1)
    public static final int TP_CONTENT_SPEECH = 1;

    @TPNativeKeyMap.MapTPAudioAttributeContentType(0)
    public static final int TP_CONTENT_UNKNOWN = 0;

    @TPNativeKeyMap.MapTPAudioAttributeFlag(1)
    public static final int TP_FLAG_AUDIBILITY_ENFORCED = 1;

    @TPNativeKeyMap.MapTPAudioAttributeFlag(16)
    public static final int TP_FLAG_HW_AV_SYNC = 16;

    @TPNativeKeyMap.MapTPAudioAttributeFlag(256)
    public static final int TP_FLAG_LOW_LATENCY = 256;
    private static final int TP_FLAG_PUBLIC = 273;

    @TPNativeKeyMap.MapTPAudioAttributeFlag(0)
    public static final int TP_FLAG_UNKNOWN = 0;

    @TPNativeKeyMap.MapTPAudioAttributeStreamType(4)
    public static final int TP_STREAM_ALARM = 4;

    @TPNativeKeyMap.MapTPAudioAttributeStreamType(8)
    public static final int TP_STREAM_DTMF = 8;

    @TPNativeKeyMap.MapTPAudioAttributeStreamType(3)
    public static final int TP_STREAM_MUSIC = 3;

    @TPNativeKeyMap.MapTPAudioAttributeStreamType(5)
    public static final int TP_STREAM_NOTIFICATION = 5;

    @TPNativeKeyMap.MapTPAudioAttributeStreamType(2)
    public static final int TP_STREAM_RING = 2;

    @TPNativeKeyMap.MapTPAudioAttributeStreamType(1)
    public static final int TP_STREAM_SYSTEM = 1;

    @TPNativeKeyMap.MapTPAudioAttributeStreamType(-1)
    public static final int TP_STREAM_UNKNOWN = -1;

    @TPNativeKeyMap.MapTPAudioAttributeStreamType(0)
    public static final int TP_STREAM_VOICE_CALL = 0;

    @TPNativeKeyMap.MapTPAudioAttributeUsage(4)
    public static final int TP_USAGE_ALARM = 4;

    @TPNativeKeyMap.MapTPAudioAttributeUsage(11)
    public static final int TP_USAGE_ASSISTANCE_ACCESSIBILITY = 11;

    @TPNativeKeyMap.MapTPAudioAttributeUsage(12)
    public static final int TP_USAGE_ASSISTANCE_NAVIGATION_GUIDANCE = 12;

    @TPNativeKeyMap.MapTPAudioAttributeUsage(13)
    public static final int TP_USAGE_ASSISTANCE_SONIFICATION = 13;

    @TPNativeKeyMap.MapTPAudioAttributeUsage(16)
    public static final int TP_USAGE_ASSISTANT = 16;

    @TPNativeKeyMap.MapTPAudioAttributeUsage(14)
    public static final int TP_USAGE_GAME = 14;

    @TPNativeKeyMap.MapTPAudioAttributeUsage(1)
    public static final int TP_USAGE_MEDIA = 1;

    @TPNativeKeyMap.MapTPAudioAttributeUsage(5)
    public static final int TP_USAGE_NOTIFICATION = 5;

    @TPNativeKeyMap.MapTPAudioAttributeUsage(9)
    public static final int TP_USAGE_NOTIFICATION_COMMUNICATION_DELAYED = 9;

    @TPNativeKeyMap.MapTPAudioAttributeUsage(8)
    public static final int TP_USAGE_NOTIFICATION_COMMUNICATION_INSTANT = 8;

    @TPNativeKeyMap.MapTPAudioAttributeUsage(7)
    public static final int TP_USAGE_NOTIFICATION_COMMUNICATION_REQUEST = 7;

    @TPNativeKeyMap.MapTPAudioAttributeUsage(10)
    public static final int TP_USAGE_NOTIFICATION_EVENT = 10;

    @TPNativeKeyMap.MapTPAudioAttributeUsage(6)
    public static final int TP_USAGE_NOTIFICATION_RINGTONE = 6;

    @TPNativeKeyMap.MapTPAudioAttributeUsage(0)
    public static final int TP_USAGE_UNKNOWN = 0;

    @TPNativeKeyMap.MapTPAudioAttributeUsage(2)
    public static final int TP_USAGE_VOICE_COMMUNICATION = 2;

    @TPNativeKeyMap.MapTPAudioAttributeUsage(3)
    public static final int TP_USAGE_VOICE_COMMUNICATION_SIGNALLING = 3;
    private static final HashMap<Integer, Integer> mMapContentTypeToAndroidMediaContentType;
    private static final HashMap<Integer, String> mMapContentTypeToString;
    private static final HashMap<Integer, Integer> mMapUsageToAndroidMediaStreamType;
    private static final HashMap<Integer, Integer> mMapUsageToAndroidMediaUsage;
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

        public TPAudioAttributes build() {
            TPAudioAttributes tPAudioAttributes = new TPAudioAttributes();
            tPAudioAttributes.mContentType = this.mContentType;
            tPAudioAttributes.mUsage = this.mUsage;
            tPAudioAttributes.mFlags = this.mFlags;
            return tPAudioAttributes;
        }

        public Builder setContentType(@TPAudioAttributeContentType int i10) {
            if (!TPAudioAttributes.mMapContentTypeToString.containsKey(Integer.valueOf(i10))) {
                i10 = 0;
            }
            this.mContentType = i10;
            return this;
        }

        public Builder setFlag(int i10) {
            this.mFlags = i10 & 273;
            return this;
        }

        public Builder setLegacyStreamType(@TPAudioAttributeStreamType int i10) {
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

        public Builder setUsage(@TPAudioAttributeUsage int i10) {
            if (!TPAudioAttributes.mMapUsageToString.containsKey(Integer.valueOf(i10))) {
                i10 = 0;
            }
            this.mUsage = i10;
            return this;
        }
    }

    @Target({ElementType.METHOD, ElementType.LOCAL_VARIABLE, ElementType.PARAMETER})
    @Retention(RetentionPolicy.RUNTIME)
    public @interface TPAudioAttributeContentType {
    }

    @Target({ElementType.METHOD, ElementType.LOCAL_VARIABLE, ElementType.PARAMETER})
    @Retention(RetentionPolicy.RUNTIME)
    public @interface TPAudioAttributeFlag {
    }

    @Target({ElementType.METHOD, ElementType.LOCAL_VARIABLE, ElementType.PARAMETER})
    @Retention(RetentionPolicy.RUNTIME)
    public @interface TPAudioAttributeStreamType {
    }

    @Target({ElementType.METHOD, ElementType.LOCAL_VARIABLE, ElementType.PARAMETER})
    @Retention(RetentionPolicy.RUNTIME)
    public @interface TPAudioAttributeUsage {
    }

    static {
        HashMap<Integer, String> map = new HashMap<>();
        mMapContentTypeToString = map;
        map.put(0, "TP_CONTENT_UNKNOWN");
        map.put(1, "TP_CONTENT_SPEECH");
        map.put(2, "TP_CONTENT_MUSIC");
        map.put(3, "TP_CONTENT_MOVIE");
        map.put(4, "TP_CONTENT_SONIFICATION");
        HashMap<Integer, Integer> map2 = new HashMap<>();
        mMapContentTypeToAndroidMediaContentType = map2;
        map2.put(0, 0);
        map2.put(1, 1);
        map2.put(2, 2);
        map2.put(3, 3);
        map2.put(4, 4);
        HashMap<Integer, String> map3 = new HashMap<>();
        mMapUsageToString = map3;
        map3.put(0, "TP_USAGE_UNKNOWN");
        map3.put(1, "TP_USAGE_MEDIA");
        map3.put(2, "TP_USAGE_VOICE_COMMUNICATION");
        map3.put(3, "TP_USAGE_VOICE_COMMUNICATION_SIGNALLING");
        map3.put(4, "TP_USAGE_ALARM");
        map3.put(5, "TP_USAGE_NOTIFICATION");
        map3.put(6, "TP_USAGE_NOTIFICATION_RINGTONE");
        map3.put(7, "TP_USAGE_NOTIFICATION_COMMUNICATION_REQUEST");
        map3.put(8, "TP_USAGE_NOTIFICATION_COMMUNICATION_INSTANT");
        map3.put(9, "TP_USAGE_NOTIFICATION_COMMUNICATION_DELAYED");
        map3.put(10, "TP_USAGE_NOTIFICATION_EVENT");
        map3.put(11, "TP_USAGE_ASSISTANCE_ACCESSIBILITY");
        map3.put(12, "TP_USAGE_ASSISTANCE_NAVIGATION_GUIDANCE");
        map3.put(13, "TP_USAGE_ASSISTANCE_SONIFICATION");
        map3.put(14, "TP_USAGE_GAME");
        map3.put(16, "TP_USAGE_ASSISTANT");
        HashMap<Integer, Integer> map4 = new HashMap<>();
        mMapUsageToAndroidMediaUsage = map4;
        map4.put(0, 0);
        map4.put(1, 1);
        map4.put(2, 2);
        map4.put(3, 3);
        map4.put(4, 4);
        map4.put(5, 5);
        map4.put(6, 6);
        map4.put(7, 7);
        map4.put(8, 8);
        map4.put(9, 9);
        map4.put(10, 10);
        map4.put(11, 11);
        map4.put(12, 12);
        map4.put(13, 13);
        map4.put(14, 14);
        map4.put(16, 16);
        HashMap<Integer, Integer> map5 = new HashMap<>();
        mMapUsageToAndroidMediaStreamType = map5;
        map5.put(0, 3);
        map5.put(1, 3);
        map5.put(2, 0);
        map5.put(3, 8);
        map5.put(4, 4);
        map5.put(5, 5);
        map5.put(6, 2);
        map5.put(7, 5);
        map5.put(8, 5);
        map5.put(9, 5);
        map5.put(10, 5);
        map5.put(12, 3);
        map5.put(13, 1);
        map5.put(14, 3);
        map5.put(16, 3);
    }

    private TPAudioAttributes() {
        this.mUsage = 0;
        this.mContentType = 0;
        this.mFlags = 0;
    }

    private static int contentTypeToAndroidMediaContentType(@TPAudioAttributeContentType int i10) {
        HashMap<Integer, Integer> map = mMapContentTypeToAndroidMediaContentType;
        if (map.containsKey(Integer.valueOf(i10))) {
            return map.get(Integer.valueOf(i10)).intValue();
        }
        return 0;
    }

    public static String contentTypeToString(@TPAudioAttributeContentType int i10) {
        HashMap<Integer, String> map = mMapContentTypeToString;
        return map.containsKey(Integer.valueOf(i10)) ? map.get(Integer.valueOf(i10)) : "unknown content type".concat(String.valueOf(i10));
    }

    private static int flagsToAndroidMediaFlags(int i10) {
        int i11 = (i10 & 1) != 0 ? 1 : 0;
        if ((i10 & 16) != 0) {
            i11 |= 16;
        }
        return (i10 & 256) != 0 ? i11 | 256 : i11;
    }

    public static int usageToAndroidMediaStreamType(@TPAudioAttributeUsage int i10) {
        HashMap<Integer, Integer> map = mMapUsageToAndroidMediaStreamType;
        if (map.containsKey(Integer.valueOf(i10))) {
            return map.get(Integer.valueOf(i10)).intValue();
        }
        return 3;
    }

    private static int usageToAndroidMediaUsage(@TPAudioAttributeUsage int i10) {
        HashMap<Integer, Integer> map = mMapUsageToAndroidMediaUsage;
        if (map.containsKey(Integer.valueOf(i10))) {
            return map.get(Integer.valueOf(i10)).intValue();
        }
        return 0;
    }

    public static String usageToString(@TPAudioAttributeUsage int i10) {
        HashMap<Integer, String> map = mMapUsageToString;
        return map.containsKey(Integer.valueOf(i10)) ? map.get(Integer.valueOf(i10)) : "unknown usage ".concat(String.valueOf(i10));
    }

    @TPAudioAttributeContentType
    public int getContentType() {
        return this.mContentType;
    }

    public int getFlags() {
        return this.mFlags & 273;
    }

    @TPAudioAttributeUsage
    public int getUsage() {
        return this.mUsage;
    }

    public AudioAttributes toAndroidMediaAudioAttributes() {
        int iUsageToAndroidMediaUsage = usageToAndroidMediaUsage(this.mUsage);
        int iContentTypeToAndroidMediaContentType = contentTypeToAndroidMediaContentType(this.mContentType);
        return new AudioAttributes.Builder().setContentType(iContentTypeToAndroidMediaContentType).setUsage(iUsageToAndroidMediaUsage).setFlags(flagsToAndroidMediaFlags(this.mFlags)).build();
    }

    public String toString() {
        return "AudioAttributes: usage=" + usageToString(this.mUsage) + " content=" + contentTypeToString(this.mContentType) + " flags=0x" + Integer.toHexString(this.mFlags).toUpperCase();
    }
}
