package com.tencent.ugc.common;

import android.media.MediaFormat;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.ugc.AudioEncodeParams;
import com.tencent.ugc.videobase.utils.CollectionUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class UGCTranscodeAudioEncodeParamsDecider {
    private static final int DEFAULT_BITRATE = 98304;
    private static final int DEFAULT_BIT_PER_CHANNEL = 16;
    private static final int DEFAULT_CHANNEL_COUNT = 1;
    private static final int DEFAULT_SAMPLE_RATE = 48000;
    private static final String TAG = "UGCTranscodeAudioEncodeParamsDecider";
    private List<MediaFormat> mAudioMediaFormatList;
    private MediaFormat mBGMMediaFormat;
    private int mEncodeBitrate = 0;

    private int getDecidedBitRate() {
        int i10 = this.mEncodeBitrate;
        if (i10 != 0) {
            return i10;
        }
        if (this.mBGMMediaFormat == null) {
            int maxAudioBitRate = getMaxAudioBitRate(this.mAudioMediaFormatList);
            return maxAudioBitRate != -1 ? maxAudioBitRate : DEFAULT_BITRATE;
        }
        if (CollectionUtils.isEmpty(this.mAudioMediaFormatList)) {
            return getIntValueFromFormat(this.mBGMMediaFormat, "bitrate", DEFAULT_BITRATE);
        }
        ArrayList arrayList = new ArrayList(this.mAudioMediaFormatList);
        arrayList.add(this.mBGMMediaFormat);
        int maxAudioBitRate2 = getMaxAudioBitRate(arrayList);
        return maxAudioBitRate2 != -1 ? maxAudioBitRate2 : DEFAULT_BITRATE;
    }

    private int getDecidedChannels() {
        MediaFormat firstValidMediaFormat = !CollectionUtils.isEmpty(this.mAudioMediaFormatList) ? getFirstValidMediaFormat() : null;
        MediaFormat mediaFormat = this.mBGMMediaFormat;
        if (mediaFormat == null) {
            int intValueFromFormat = getIntValueFromFormat(firstValidMediaFormat, "channel-count", 1);
            if (intValueFromFormat > 2) {
                return 2;
            }
            return intValueFromFormat;
        }
        if (firstValidMediaFormat == null) {
            int intValueFromFormat2 = getIntValueFromFormat(mediaFormat, "channel-count", 1);
            if (intValueFromFormat2 > 2) {
                return 2;
            }
            return intValueFromFormat2;
        }
        int iMax = Math.max(getIntValueFromFormat(firstValidMediaFormat, "channel-count", 1), getIntValueFromFormat(this.mBGMMediaFormat, "channel-count", 1));
        if (iMax > 2) {
            return 2;
        }
        return iMax;
    }

    private int getDecidedSampleRate() {
        MediaFormat mediaFormat = this.mBGMMediaFormat;
        if (mediaFormat == null) {
            return getIntValueFromFormat(CollectionUtils.isEmpty(this.mAudioMediaFormatList) ? null : getFirstValidMediaFormat(), "sample-rate", 48000);
        }
        return getIntValueFromFormat(mediaFormat, "sample-rate", 48000);
    }

    private MediaFormat getFirstValidMediaFormat() {
        for (MediaFormat mediaFormat : this.mAudioMediaFormatList) {
            if (mediaFormat != null) {
                return mediaFormat;
            }
        }
        return null;
    }

    private int getIntValueFromFormat(MediaFormat mediaFormat, String str, int i10) {
        if (mediaFormat == null) {
            return i10;
        }
        try {
            return mediaFormat.getInteger(str);
        } catch (Exception e10) {
            LiteavLog.w(TAG, String.valueOf(e10));
            return i10;
        }
    }

    private int getMaxAudioBitRate(List<MediaFormat> list) {
        int iMax = -1;
        if (list == null) {
            return -1;
        }
        for (MediaFormat mediaFormat : list) {
            if (mediaFormat.containsKey("bitrate")) {
                iMax = Math.max(iMax, mediaFormat.getInteger("bitrate"));
            }
        }
        return iMax;
    }

    public AudioEncodeParams getDecidedEncodeParams() {
        AudioEncodeParams audioEncodeParams = new AudioEncodeParams();
        audioEncodeParams.setSampleRate(getDecidedSampleRate());
        audioEncodeParams.setChannels(getDecidedChannels());
        audioEncodeParams.setBitsPerChannel(16);
        audioEncodeParams.setBitrate(getDecidedBitRate());
        return audioEncodeParams;
    }

    public void setBGMMediaFormat(MediaFormat mediaFormat) {
        this.mBGMMediaFormat = mediaFormat;
    }

    public void setEncodeBitrate(int i10) {
        if (this.mEncodeBitrate == i10) {
            return;
        }
        LiteavLog.i(TAG, "setAudioBitrate ".concat(String.valueOf(i10)));
        this.mEncodeBitrate = i10;
    }

    public void setInputAudioMediaFormat(List<MediaFormat> list) {
        this.mAudioMediaFormatList = list;
    }
}
