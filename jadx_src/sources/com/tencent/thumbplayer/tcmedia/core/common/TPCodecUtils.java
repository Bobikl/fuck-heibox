package com.tencent.thumbplayer.tcmedia.core.common;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.exoplayer2.util.y;
import com.tencent.thumbplayer.tcmedia.core.thirdparties.LocalCache;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public class TPCodecUtils {
    public static final int CAP_AUDIO_AAC = 8;
    public static final int CAP_AUDIO_DD = 16;
    public static final int CAP_AUDIO_DDP = 32;
    public static final int CAP_AUDIO_DTS = 128;
    public static final int CAP_AUDIO_FLAC = 64;
    public static final int CAP_VIDEO_AVC = 1;
    public static final int CAP_VIDEO_HEVC = 2;
    public static final int CAP_VIDEO_VP8 = 256;
    public static final int CAP_VIDEO_VP9 = 4;
    public static final int PLAYER_LEVEL_0 = 0;
    public static final int PLAYER_LEVEL_1 = 1;
    public static final int PLAYER_LEVEL_11 = 11;
    public static final int PLAYER_LEVEL_16 = 16;
    public static final int PLAYER_LEVEL_21 = 21;
    public static final int PLAYER_LEVEL_26 = 26;
    public static final int PLAYER_LEVEL_28 = 28;
    public static final int PLAYER_LEVEL_33 = 33;
    public static final int PLAYER_LEVEL_6 = 6;
    public static final int PLAYER_LEVEL_UNKNOWN = -1;
    private static final String TAG = "TPCodecUtils";
    private static final String VVC_SHD_HISI_CPU_NAME = "Kirin9000E";
    private static final String VVC_SHD_MTK_CPU_NAME = "MT6893";
    private static final String VVC_SHD_QUALCOMMN_CPU_NAME = "SM8250";
    private static final String VVC_SHD_SAMSUNG_CPU_NAME = "Exynos2100";
    private static int mAACMaxSupportedBitrate = 510000;
    private static int mAACMaxSupportedChannels = 8;
    private static int mAACMaxSupportedSamplerate = 96000;
    private static TPCodecCapability.TPCodecMaxCapability mAV1SWMaxCapability = null;
    private static TPCodecCapability.TPCodecMaxCapability mAVCSWMaxCapability = null;
    private static TPCodecCapability.TPCodecMaxCapability mAVS3WMaxCapability = null;
    private static int mAvs3DeviceLevel = -1;
    private static HashMap<String, Integer> mCodecCapBlackList = null;
    private static HashMap<String, Integer> mCodecCapWhiteList = null;
    private static Context mContext = null;
    private static int mDDPMaxSupportedBitrate = 6144000;
    private static int mDDPMaxSupportedChannels = 8;
    private static int mDDPMaxSupportedSamplerate = 48000;
    private static int mFLACMaxSupportedBitrate = 21000000;
    private static int mFLACMaxSupportedChannels = 8;
    private static int mFLACMaxSupportedSamplerate = 192000;
    private static TPCodecCapability.TPCodecMaxCapability mHEVCSWMaxCapability = null;
    private static int mHevcDeviceLevel = -1;
    private static boolean mIsFFmpegCapGot = false;
    private static LocalCache mLocalCache = null;
    private static HashMap<Integer, TPCodecCapability.TPCodecMaxCapability> mMaxACodecHwCapabilityMap = null;
    private static HashMap<Integer, TPCodecCapability.TPCodecMaxCapability> mMaxACodecSwCapabilityMap = null;
    private static HashMap<Integer, TPCodecCapability.TPCodecMaxCapability> mMaxVCodecHwCapabilityMap = null;
    private static HashMap<Integer, TPCodecCapability.TPCodecMaxCapability> mMaxVCodecSwCapabilityMap = null;
    private static TPCodecCapability.TPCodecMaxCapability mVP8SWMaxCapability = null;
    private static TPCodecCapability.TPCodecMaxCapability mVP9SWMaxCapability = null;
    private static TPCodecCapability.TPCodecMaxCapability mVVCSWMaxCapability = null;
    private static int mVvcDeviceLevel = -1;
    protected static ArrayList<String> mVMediaCodecCapList = new ArrayList<>();
    protected static ArrayList<String> mAMediaCodecCapList = new ArrayList<>();
    private static ArrayList<String> mVMediaCodecBlackListModel = new ArrayList<>();
    private static ArrayList<String> mAMediaCodecBlackListModel = new ArrayList<>();
    private static ArrayList<String> mAMediaCodecBlackListInstance = new ArrayList<>();
    private static ArrayList<String> mSupportedMediaCodec = new ArrayList<>();
    private static HashMap<Integer, HashMap<String, TPCodecCapability.TPHdrSupportVersionRange>> mHdrWhiteMap = new HashMap<>();
    private static HashMap<Integer, HashMap<String, TPCodecCapability.TPHdrSupportVersionRange>> mHdrBlackMap = new HashMap<>();
    private static HashMap<String, TPCodecCapability.TPHdrSupportVersionRange> mHDRVividSupportVersionMap = new HashMap<>();
    private static HashMap<Integer, ArrayList<TPCodecCapability.TPHdrSupportVersionRange>> mHDRTypeToHDRSoftwareCodecWhiteListMap = new HashMap<>();
    private static HashMap<Integer, ArrayList<TPCodecCapability.TPHdrSupportVersionRange>> mHDRTypeToHDRHardwareCodecWhiteListMap = new HashMap<>();
    private static HashMap<String, String> mAudioMaxCapCodecInstance = new HashMap<>();
    private static ArrayList<String> mWideVineBlackListModel = new ArrayList<>();
    private static HashMap<Integer, ArrayList<String>> mDrmL1BlackList = new HashMap<>();
    private static boolean mIsInitDone = false;
    private static boolean mPreferredSoftwareComponent = false;
    private static int mShdHevcQualcommIndex = 32;
    private static int mHdHevcQualcommIndex = 20;
    private static int mShdHevcMtkIndex = 12;
    private static int mHdHevcMtkIndex = 8;
    private static int mShdHevcHisiIndex = 8;
    private static int mHdHevcHisiIndex = 3;
    private static int mShdHevcSamsungIndex = 8;
    private static int mHdHevcSamsungIndex = 5;
    private static int mFhdAvs3QualcommIndex = 58;
    private static int mShdAvs3QualcommIndex = 55;
    private static int mFhdAvs3HisiIndex = 14;
    private static SparseArray<VideoSwCapabilityModel> mVideoCodecIdToSwCapabilityModel = new SparseArray<>();
    private static HashMap<DefinitionName, Integer> mDefinitionNameToDecodeLevelTable = new HashMap<>();

    public enum DefinitionName {
        DEFINITION_720P
    }

    public static class VideoSwCapabilityModel {
        SparseArray<HashMap<DefinitionName, String>> mCpuProducerToAllDefinitionDecTable;

        public static class Builder {
            private SparseArray<HashMap<DefinitionName, String>> mCpuProducerToAllDefinitionDecCapabilities = new SparseArray<>();

            Builder() {
            }

            Builder addVideoDecCap(int i10, DefinitionName definitionName, String str) {
                HashMap<DefinitionName, String> map = this.mCpuProducerToAllDefinitionDecCapabilities.get(i10);
                if (map == null) {
                    map = new HashMap<>();
                    this.mCpuProducerToAllDefinitionDecCapabilities.put(i10, map);
                }
                map.put(definitionName, str);
                return this;
            }

            VideoSwCapabilityModel build() {
                VideoSwCapabilityModel videoSwCapabilityModel = new VideoSwCapabilityModel();
                videoSwCapabilityModel.mCpuProducerToAllDefinitionDecTable = this.mCpuProducerToAllDefinitionDecCapabilities;
                return videoSwCapabilityModel;
            }
        }

        private VideoSwCapabilityModel() {
            this.mCpuProducerToAllDefinitionDecTable = new SparseArray<>();
        }
    }

    static {
        HashMap<String, Integer> map = new HashMap<>();
        mCodecCapWhiteList = map;
        map.put("NX511J", 11);
        mCodecCapWhiteList.put("Hi3798MV100", 11);
        mCodecCapWhiteList.put("长虹智能电视", 11);
        mCodecCapWhiteList.put("Android TV on Tcl 901", 11);
        mCodecCapWhiteList.put("xt880b", 11);
        TPNativeLog.printLog(2, TAG, "white list init");
        mSupportedMediaCodec.add("video/avc");
        mSupportedMediaCodec.add("video/hevc");
        mSupportedMediaCodec.add("video/x-vnd.on2.vp8");
        mSupportedMediaCodec.add("video/x-vnd.on2.vp9");
        mSupportedMediaCodec.add("video/av01");
        mSupportedMediaCodec.add(y.A);
        mSupportedMediaCodec.add(y.L);
        mSupportedMediaCodec.add(y.M);
        mSupportedMediaCodec.add(y.N);
        mSupportedMediaCodec.add(y.Z);
        mSupportedMediaCodec.add(y.Q);
        mAMediaCodecBlackListInstance.add("OMX.qti.audio.decoder.flac");
        mVMediaCodecBlackListModel.add("SM-J7008");
        mVMediaCodecBlackListModel.add("SM-J5008");
        mVMediaCodecBlackListModel.add("TCL i806");
        mVMediaCodecBlackListModel.add("NX511J");
        mVMediaCodecBlackListModel.add("vivo Y11i T");
        mVMediaCodecBlackListModel.add("长虹智能电视");
        mVMediaCodecBlackListModel.add("MI 1S");
        mVMediaCodecBlackListModel.add("SP9832A");
        mVMediaCodecBlackListModel.add("SP9830A");
        mVMediaCodecBlackListModel.add("VOTO GT17");
        mVMediaCodecBlackListModel.add("EVA-AL10");
        mHDRVividSupportVersionMap.put("TAS-AL00", new TPCodecCapability.TPHdrSupportVersionRange(9999999, 1100165, 99, 3));
        mHDRVividSupportVersionMap.put("TAS-TL00", new TPCodecCapability.TPHdrSupportVersionRange(9999999, 1100165, 99, 3));
        mHDRVividSupportVersionMap.put("TAS-AN00", new TPCodecCapability.TPHdrSupportVersionRange(9999999, 1100165, 99, 3));
        mHDRVividSupportVersionMap.put("LIO-AN00", new TPCodecCapability.TPHdrSupportVersionRange(9999999, 1100165, 99, 3));
        mHDRVividSupportVersionMap.put("LIO-AN00P", new TPCodecCapability.TPHdrSupportVersionRange(9999999, 1100165, 99, 3));
        mHDRVividSupportVersionMap.put("LIO-AN00m", new TPCodecCapability.TPHdrSupportVersionRange(9999999, 1100165, 99, 3));
        mHDRVividSupportVersionMap.put("LIO-TL00", new TPCodecCapability.TPHdrSupportVersionRange(9999999, 1100165, 99, 3));
        mHDRVividSupportVersionMap.put("LIO-AL00", new TPCodecCapability.TPHdrSupportVersionRange(9999999, 1100165, 99, 3));
        mHDRVividSupportVersionMap.put("ANA-AN00", new TPCodecCapability.TPHdrSupportVersionRange(9999999, 1100165, 99, 3));
        mHDRVividSupportVersionMap.put("ANA-TN00", new TPCodecCapability.TPHdrSupportVersionRange(9999999, 1100165, 99, 3));
        mHDRVividSupportVersionMap.put("ELS-AN00", new TPCodecCapability.TPHdrSupportVersionRange(9999999, 1100165, 99, 3));
        mHDRVividSupportVersionMap.put("ELS-TN00", new TPCodecCapability.TPHdrSupportVersionRange(9999999, 1100165, 99, 3));
        mHDRVividSupportVersionMap.put("ELS-AN10", new TPCodecCapability.TPHdrSupportVersionRange(9999999, 1100166, 99, 3));
        mHDRVividSupportVersionMap.put("MRX-AL09", new TPCodecCapability.TPHdrSupportVersionRange(9999999, 1100150, 99, 5));
        mHDRVividSupportVersionMap.put("MRX-AL19", new TPCodecCapability.TPHdrSupportVersionRange(9999999, 1100150, 99, 5));
        mHDRVividSupportVersionMap.put("MRX-W09", new TPCodecCapability.TPHdrSupportVersionRange(9999999, 1100150, 99, 5));
        mHDRVividSupportVersionMap.put("MRX-W19", new TPCodecCapability.TPHdrSupportVersionRange(9999999, 1100150, 99, 5));
        mHDRVividSupportVersionMap.put("MRX-AN19", new TPCodecCapability.TPHdrSupportVersionRange(9999999, 1100150, 99, 5));
        mHDRVividSupportVersionMap.put("MRX-W29", new TPCodecCapability.TPHdrSupportVersionRange(9999999, 1100150, 99, 5));
        mHDRVividSupportVersionMap.put("MRX-W39", new TPCodecCapability.TPHdrSupportVersionRange(9999999, 1100150, 99, 5));
        mHDRVividSupportVersionMap.put("OCE-AN00", new TPCodecCapability.TPHdrSupportVersionRange(9999999, 0, 99, 0));
        mHDRVividSupportVersionMap.put("OCE-AN10", new TPCodecCapability.TPHdrSupportVersionRange(9999999, 0, 99, 0));
        mHDRVividSupportVersionMap.put("OCE-AL50", new TPCodecCapability.TPHdrSupportVersionRange(9999999, 0, 99, 0));
        mHDRVividSupportVersionMap.put("OCE-AN50", new TPCodecCapability.TPHdrSupportVersionRange(9999999, 0, 99, 0));
        mHDRVividSupportVersionMap.put("NOH-NX9", new TPCodecCapability.TPHdrSupportVersionRange(9999999, 0, 99, 0));
        mHDRVividSupportVersionMap.put("NOH-AN00", new TPCodecCapability.TPHdrSupportVersionRange(9999999, 0, 99, 0));
        mHDRVividSupportVersionMap.put("NOH-AN01", new TPCodecCapability.TPHdrSupportVersionRange(9999999, 0, 99, 0));
        mHDRVividSupportVersionMap.put("NOH-AL00", new TPCodecCapability.TPHdrSupportVersionRange(9999999, 0, 99, 0));
        mHDRVividSupportVersionMap.put("NOP-AN00", new TPCodecCapability.TPHdrSupportVersionRange(9999999, 0, 99, 0));
        mHDRVividSupportVersionMap.put("JAD-AN00", new TPCodecCapability.TPHdrSupportVersionRange(9999999, 0, 99, 0));
        mHDRVividSupportVersionMap.put("JAD-AN10", new TPCodecCapability.TPHdrSupportVersionRange(9999999, 0, 99, 0));
        mHDRVividSupportVersionMap.put("JAD-AL50", new TPCodecCapability.TPHdrSupportVersionRange(9999999, 0, 99, 0));
        mHDRVividSupportVersionMap.put("JAD-AL60", new TPCodecCapability.TPHdrSupportVersionRange(9999999, 0, 99, 0));
        mHDRVividSupportVersionMap.put("JAD-N29", new TPCodecCapability.TPHdrSupportVersionRange(9999999, 0, 99, 0));
        mHDRVividSupportVersionMap.put("JAD-N09", new TPCodecCapability.TPHdrSupportVersionRange(9999999, 0, 99, 0));
        mHDRVividSupportVersionMap.put("HEGE-550", new TPCodecCapability.TPHdrSupportVersionRange(9999999, 200187, 99, 0));
        mHDRVividSupportVersionMap.put("HEGE-550B", new TPCodecCapability.TPHdrSupportVersionRange(9999999, 200187, 99, 0));
        mHDRVividSupportVersionMap.put("HEGE-550C", new TPCodecCapability.TPHdrSupportVersionRange(9999999, 200187, 99, 0));
        mHDRVividSupportVersionMap.put("HEGE-550X", new TPCodecCapability.TPHdrSupportVersionRange(9999999, 200187, 99, 0));
        mHDRVividSupportVersionMap.put("HEGE-550AX", new TPCodecCapability.TPHdrSupportVersionRange(9999999, 200187, 99, 0));
        mHDRVividSupportVersionMap.put("HEGE-560", new TPCodecCapability.TPHdrSupportVersionRange(9999999, 200187, 99, 0));
        mHDRVividSupportVersionMap.put("HEGE-560B", new TPCodecCapability.TPHdrSupportVersionRange(9999999, 200187, 99, 0));
        mHDRVividSupportVersionMap.put("HEGE-570", new TPCodecCapability.TPHdrSupportVersionRange(9999999, 200187, 99, 0));
        mHDRVividSupportVersionMap.put("PLAT-760", new TPCodecCapability.TPHdrSupportVersionRange(9999999, 200172, 99, 0));
        mHDRVividSupportVersionMap.put("KANT-350", new TPCodecCapability.TPHdrSupportVersionRange(9999999, 200185, 99, 0));
        mHDRVividSupportVersionMap.put("KANT-350B", new TPCodecCapability.TPHdrSupportVersionRange(9999999, 200185, 99, 0));
        mHDRVividSupportVersionMap.put("KANT-350C", new TPCodecCapability.TPHdrSupportVersionRange(9999999, 200185, 99, 0));
        mHDRVividSupportVersionMap.put("KANT-350S", new TPCodecCapability.TPHdrSupportVersionRange(9999999, 200185, 99, 0));
        mHDRVividSupportVersionMap.put("KANT-360", new TPCodecCapability.TPHdrSupportVersionRange(9999999, 200185, 99, 0));
        mHDRVividSupportVersionMap.put("KANT-360S", new TPCodecCapability.TPHdrSupportVersionRange(9999999, 200185, 99, 0));
        mHDRVividSupportVersionMap.put("KANT-370", new TPCodecCapability.TPHdrSupportVersionRange(9999999, 200185, 99, 0));
        mHDRVividSupportVersionMap.put("KANT-370S", new TPCodecCapability.TPHdrSupportVersionRange(9999999, 200185, 99, 0));
        mHDRVividSupportVersionMap.put("KANT-359", new TPCodecCapability.TPHdrSupportVersionRange(9999999, 200183, 99, 0));
        mHDRVividSupportVersionMap.put("KANT-369", new TPCodecCapability.TPHdrSupportVersionRange(9999999, 200183, 99, 0));
        mHDRVividSupportVersionMap.put("THAL-550", new TPCodecCapability.TPHdrSupportVersionRange(9999999, 0, 99, 0));
        mHDRVividSupportVersionMap.put("THAL-560", new TPCodecCapability.TPHdrSupportVersionRange(9999999, 0, 99, 0));
        mHDRVividSupportVersionMap.put("THAL-570", new TPCodecCapability.TPHdrSupportVersionRange(9999999, 0, 99, 0));
        mHDRVividSupportVersionMap.put("THAL-580", new TPCodecCapability.TPHdrSupportVersionRange(9999999, 0, 99, 0));
        mHDRVividSupportVersionMap.put("FREG-770", new TPCodecCapability.TPHdrSupportVersionRange(9999999, 0, 99, 0));
        mHDRVividSupportVersionMap.put("DESC-220", new TPCodecCapability.TPHdrSupportVersionRange(9999999, 0, 99, 0));
        mHDRVividSupportVersionMap.put("DESC-250SY", new TPCodecCapability.TPHdrSupportVersionRange(9999999, 10200557, 99, 0));
        mHDRVividSupportVersionMap.put("DESC-250S", new TPCodecCapability.TPHdrSupportVersionRange(9999999, 10200557, 99, 0));
        mHDRVividSupportVersionMap.put("DESC-250SZ", new TPCodecCapability.TPHdrSupportVersionRange(9999999, 10200557, 99, 0));
        mHDRVividSupportVersionMap.put("DESC-250", new TPCodecCapability.TPHdrSupportVersionRange(9999999, 10200557, 99, 0));
        mHDRVividSupportVersionMap.put("DESC-260SY", new TPCodecCapability.TPHdrSupportVersionRange(9999999, 10200557, 99, 0));
        mHDRVividSupportVersionMap.put("DESC-260S", new TPCodecCapability.TPHdrSupportVersionRange(9999999, 10200557, 99, 0));
        mHDRVividSupportVersionMap.put("DESC-260SZ", new TPCodecCapability.TPHdrSupportVersionRange(9999999, 10200557, 99, 0));
        mHDRVividSupportVersionMap.put("DESC-260", new TPCodecCapability.TPHdrSupportVersionRange(9999999, 10200557, 99, 0));
        mHDRVividSupportVersionMap.put("DESC-270", new TPCodecCapability.TPHdrSupportVersionRange(9999999, 10200547, 99, 0));
        mHDRVividSupportVersionMap.put("SOKR-790A", new TPCodecCapability.TPHdrSupportVersionRange(9999999, 0, 99, 0));
        mHDRVividSupportVersionMap.put("VOLT-350S", new TPCodecCapability.TPHdrSupportVersionRange(9999999, 0, 99, 0));
        mWideVineBlackListModel.add("RVL-AL09");
        mWideVineBlackListModel.add("CLT-L29");
        mWideVineBlackListModel.add("ASUS_Z00AD");
        mDrmL1BlackList.put(0, mWideVineBlackListModel);
        SparseArray<VideoSwCapabilityModel> sparseArray = mVideoCodecIdToSwCapabilityModel;
        VideoSwCapabilityModel.Builder builder = new VideoSwCapabilityModel.Builder();
        DefinitionName definitionName = DefinitionName.DEFINITION_720P;
        sparseArray.put(193, builder.addVideoDecCap(0, definitionName, VVC_SHD_QUALCOMMN_CPU_NAME).addVideoDecCap(1, definitionName, VVC_SHD_MTK_CPU_NAME).addVideoDecCap(2, definitionName, VVC_SHD_HISI_CPU_NAME).addVideoDecCap(3, definitionName, VVC_SHD_SAMSUNG_CPU_NAME).build());
        mDefinitionNameToDecodeLevelTable.put(definitionName, 21);
        mIsFFmpegCapGot = false;
        mAVCSWMaxCapability = new TPCodecCapability.TPCodecMaxCapability(0, 0, 0, 30);
        mHEVCSWMaxCapability = new TPCodecCapability.TPCodecMaxCapability(0, 0, 0, 30);
        mVP9SWMaxCapability = new TPCodecCapability.TPCodecMaxCapability(0, 0, 0, 30);
        mAVS3WMaxCapability = new TPCodecCapability.TPCodecMaxCapability(0, 0, 0, 30);
        mAV1SWMaxCapability = new TPCodecCapability.TPCodecMaxCapability(0, 0, 0, 30);
        mVP8SWMaxCapability = new TPCodecCapability.TPCodecMaxCapability(0, 0, 0, 30);
        mVVCSWMaxCapability = new TPCodecCapability.TPCodecMaxCapability(0, 0, 0, 30);
        mMaxVCodecHwCapabilityMap = new HashMap<>();
        mMaxVCodecSwCapabilityMap = new HashMap<>();
        mMaxACodecHwCapabilityMap = new HashMap<>();
        mMaxACodecSwCapabilityMap = new HashMap<>();
    }

    public static boolean addDRMLevel1Blacklist(int i10) {
        if (!mDrmL1BlackList.containsKey(Integer.valueOf(i10))) {
            return true;
        }
        ArrayList<String> arrayList = mDrmL1BlackList.get(Integer.valueOf(i10));
        if (!arrayList.contains(TPSystemInfo.getDeviceName())) {
            arrayList.add(TPSystemInfo.getDeviceName());
        }
        mDrmL1BlackList.remove(Integer.valueOf(i10));
        mDrmL1BlackList.put(Integer.valueOf(i10), arrayList);
        return true;
    }

    public static boolean addHDRBlackList(int i10, String str, TPCodecCapability.TPHdrSupportVersionRange tPHdrSupportVersionRange) {
        HashMap<String, TPCodecCapability.TPHdrSupportVersionRange> map;
        if (tPHdrSupportVersionRange == null) {
            return false;
        }
        if (mHdrBlackMap.containsKey(Integer.valueOf(i10))) {
            map = mHdrBlackMap.get(Integer.valueOf(i10));
            mHdrBlackMap.remove(Integer.valueOf(i10));
            if (!map.containsKey(str)) {
                map.put(str, tPHdrSupportVersionRange);
            }
            map.remove(str);
        } else {
            map = new HashMap<>();
        }
        map.put(str, tPHdrSupportVersionRange);
        mHdrBlackMap.put(Integer.valueOf(i10), map);
        return true;
    }

    private static void addHDRVersionRangeToWhiteList(int i10, TPCodecCapability.TPHdrSupportVersionRange tPHdrSupportVersionRange, HashMap<Integer, ArrayList<TPCodecCapability.TPHdrSupportVersionRange>> map) {
        ArrayList<TPCodecCapability.TPHdrSupportVersionRange> arrayList = map.containsKey(Integer.valueOf(i10)) ? map.get(Integer.valueOf(i10)) : new ArrayList<>();
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            if (isTheSameVersionRange(tPHdrSupportVersionRange, arrayList.get(i11))) {
                return;
            }
        }
        arrayList.add(tPHdrSupportVersionRange);
        map.put(Integer.valueOf(i10), arrayList);
    }

    public static boolean addHDRVideoDecoderTypeWhiteList(int i10, int i11, TPCodecCapability.TPHdrSupportVersionRange tPHdrSupportVersionRange) {
        HashMap<Integer, ArrayList<TPCodecCapability.TPHdrSupportVersionRange>> map;
        if (i11 == 101) {
            map = mHDRTypeToHDRSoftwareCodecWhiteListMap;
        } else {
            if (i11 != 102) {
                TPNativeLog.printLog(3, TAG, "addHDRVideoDecoderTypeWhiteList, decoder not support.");
                return false;
            }
            map = mHDRTypeToHDRHardwareCodecWhiteListMap;
        }
        addHDRVersionRangeToWhiteList(i10, tPHdrSupportVersionRange, map);
        return true;
    }

    public static boolean addHDRWhiteList(int i10, String str, TPCodecCapability.TPHdrSupportVersionRange tPHdrSupportVersionRange) {
        HashMap<String, TPCodecCapability.TPHdrSupportVersionRange> map;
        if (tPHdrSupportVersionRange == null) {
            return false;
        }
        if (mHdrWhiteMap.containsKey(Integer.valueOf(i10))) {
            map = mHdrWhiteMap.get(Integer.valueOf(i10));
            mHdrWhiteMap.remove(Integer.valueOf(i10));
            if (!map.containsKey(str)) {
                map.put(str, tPHdrSupportVersionRange);
            }
            map.remove(str);
        } else {
            map = new HashMap<>();
        }
        map.put(str, tPHdrSupportVersionRange);
        mHdrWhiteMap.put(Integer.valueOf(i10), map);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:57:0x00be  */
    /* JADX WARN: Code duplicated, block: B:73:0x00ff  */
    public static boolean checkHDRVividSupportByVersion(String str, String str2, String str3) {
        int i10;
        int valueFromSubstring;
        String str4;
        boolean z10;
        int valueFromSubstring2;
        int valueFromSubstring3;
        int valueFromSubstring4;
        int valueFromSubstring5;
        String str5;
        String str6;
        int[] iArr = {2, 1, 1, 3};
        if (TextUtils.isEmpty(str2)) {
            i10 = 0;
        } else {
            String[] strArrSplit = str2.split("\\.");
            if (strArrSplit.length == 4) {
                String[] strArrSplit2 = strArrSplit[0].split(" ");
                if (strArrSplit2.length == 2 && (str6 = strArrSplit2[1]) != null) {
                    strArrSplit[0] = str6;
                }
                String[] strArrSplit3 = strArrSplit[3].split("\\(");
                if (strArrSplit3.length == 2 && (str5 = strArrSplit3[0]) != null) {
                    strArrSplit[3] = str5;
                }
                int i11 = 0;
                while (true) {
                    if (i11 >= 4) {
                        z10 = true;
                        break;
                    }
                    String str7 = strArrSplit[i11];
                    if (str7 == null || str7.length() != iArr[i11]) {
                        z10 = false;
                        break;
                    }
                    i11++;
                }
                if (z10) {
                    try {
                        int iIndexOf = str2.indexOf(".");
                        valueFromSubstring3 = iIndexOf == -1 ? 0 : getValueFromSubstring(str2, iIndexOf - 2, iIndexOf);
                        try {
                            int iIndexOf2 = str2.indexOf(".", iIndexOf + 1);
                            valueFromSubstring4 = iIndexOf2 == -1 ? 0 : getValueFromSubstring(str2, iIndexOf2 - 1, iIndexOf2);
                            try {
                                int iIndexOf3 = str2.indexOf(".", iIndexOf2 + 1);
                                valueFromSubstring2 = iIndexOf3 == -1 ? 0 : getValueFromSubstring(str2, iIndexOf3 - 1, iIndexOf3);
                                if (iIndexOf3 == -1) {
                                    valueFromSubstring5 = 0;
                                } else {
                                    try {
                                        valueFromSubstring5 = getValueFromSubstring(str2, iIndexOf3 + 1, iIndexOf3 + 4);
                                    } catch (NumberFormatException e10) {
                                        e = e10;
                                        TPNativeLog.printLog(4, TAG, "checkHDRVividSupportByVersion failed(versionValue):" + e.getMessage());
                                        valueFromSubstring5 = 0;
                                    }
                                }
                            } catch (NumberFormatException e11) {
                                e = e11;
                                valueFromSubstring2 = 0;
                            }
                        } catch (NumberFormatException e12) {
                            e = e12;
                            valueFromSubstring2 = 0;
                            valueFromSubstring4 = 0;
                        }
                    } catch (NumberFormatException e13) {
                        e = e13;
                        valueFromSubstring2 = 0;
                        valueFromSubstring3 = 0;
                        valueFromSubstring4 = 0;
                    }
                    i10 = (valueFromSubstring3 * 100000) + (valueFromSubstring4 * 10000) + (valueFromSubstring2 * 1000) + valueFromSubstring5;
                } else {
                    i10 = 0;
                }
            } else {
                i10 = 0;
            }
        }
        if (TextUtils.isEmpty(str3)) {
            valueFromSubstring = 0;
        } else {
            String[] strArrSplit4 = str3.split("patch");
            if (strArrSplit4.length == 2 && (str4 = strArrSplit4[1]) != null && str4.length() == 3) {
                try {
                    int iIndexOf4 = str3.indexOf("patch");
                    if (iIndexOf4 == -1) {
                        valueFromSubstring = 0;
                    } else {
                        valueFromSubstring = getValueFromSubstring(str3, iIndexOf4 + 5, iIndexOf4 + 7);
                    }
                } catch (NumberFormatException e14) {
                    TPNativeLog.printLog(4, TAG, "checkHDRVividSupportByVersion failed(patchValue):" + e14.getMessage());
                }
            } else {
                valueFromSubstring = 0;
            }
        }
        if (isInHDRVividWhiteList(str, i10, valueFromSubstring)) {
            TPNativeLog.printLog(2, TAG, "checkHDRVividSupportByVersion in HDRVivid whitelist, model:" + str + " version:" + i10 + " patch:" + str3);
            return true;
        }
        if (isInHDRVividBlackList(str, i10, valueFromSubstring)) {
            TPNativeLog.printLog(2, TAG, "checkHDRVividSupportByVersion in HDRVivid blacklist, model:" + str + " version:" + i10 + " patch:" + str3);
            return false;
        }
        if (mHDRVividSupportVersionMap.containsKey(str)) {
            TPCodecCapability.TPHdrSupportVersionRange tPHdrSupportVersionRange = mHDRVividSupportVersionMap.get(str);
            if (i10 <= tPHdrSupportVersionRange.upperboundSystemVersion) {
                int i12 = tPHdrSupportVersionRange.lowerboundSystemVersion;
                if (i10 > i12) {
                    return true;
                }
                if (i10 == i12 && valueFromSubstring <= tPHdrSupportVersionRange.upperboundPatchVersion && valueFromSubstring >= tPHdrSupportVersionRange.lowerboundPatchVersion) {
                    return true;
                }
            }
        }
        return false;
    }

    private static int convertDefinitionNameToDecodeLevel(DefinitionName definitionName) {
        Integer num = mDefinitionNameToDecodeLevelTable.get(definitionName);
        if (num != null) {
            return num.intValue();
        }
        return -1;
    }

    public static int convertDolbyVisionToOmxLevel(int i10) {
        int i11 = 1 << i10;
        if (i11 <= 0 || i11 > 256) {
            TPNativeLog.printLog(2, TAG, "convertDolbyVisionToOmxLevel Unsupported level".concat(String.valueOf(i10)));
            return i10;
        }
        TPNativeLog.printLog(2, TAG, "convertDolbyVisionToOmxLevel dolbyVisionLevel:" + i10 + " omxLevel:" + i11);
        return i11;
    }

    public static int convertDolbyVisionToOmxProfile(int i10) {
        int i11 = 1 << i10;
        if (i10 <= 0 || i10 > 512) {
            TPNativeLog.printLog(2, TAG, "convertDolbyVisionToOmxProfile Unsupported profile".concat(String.valueOf(i10)));
            return i10;
        }
        TPNativeLog.printLog(2, TAG, "convertDolbyVisionToOmxProfile dolbyVisionProfile:" + i10 + " omxProfile:" + i11);
        return i11;
    }

    public static synchronized HashMap<Integer, TPCodecCapability.TPCodecMaxCapability> getACodecSWMaxCapabilityMap() {
        TPNativeLog.printLog(2, TAG, "getACodecSWMaxCapabilityMap func in");
        if (!mMaxACodecSwCapabilityMap.isEmpty()) {
            return mMaxACodecSwCapabilityMap;
        }
        try {
            TPCodecCapability.TPCodecMaxCapability tPCodecMaxCapability = new TPCodecCapability.TPCodecMaxCapability(0, 0, mAACMaxSupportedSamplerate, mAACMaxSupportedBitrate, mAACMaxSupportedChannels);
            TPCodecCapability.TPCodecMaxCapability tPCodecMaxCapability2 = new TPCodecCapability.TPCodecMaxCapability(0, 0, mFLACMaxSupportedSamplerate, mFLACMaxSupportedBitrate, mFLACMaxSupportedChannels);
            TPCodecCapability.TPCodecMaxCapability tPCodecMaxCapability3 = new TPCodecCapability.TPCodecMaxCapability(0, 0, mDDPMaxSupportedSamplerate, mDDPMaxSupportedBitrate, mDDPMaxSupportedChannels);
            TPCodecCapability.TPCodecMaxCapability tPCodecMaxCapability4 = new TPCodecCapability.TPCodecMaxCapability(0, 0, mDDPMaxSupportedSamplerate, mDDPMaxSupportedBitrate, mDDPMaxSupportedChannels);
            mMaxACodecSwCapabilityMap.put(5002, tPCodecMaxCapability);
            mMaxACodecSwCapabilityMap.put(5012, tPCodecMaxCapability2);
            mMaxACodecSwCapabilityMap.put(5003, tPCodecMaxCapability3);
            mMaxACodecSwCapabilityMap.put(5040, tPCodecMaxCapability4);
            TPNativeLog.printLog(2, "getACodecSWMaxCapabilityMap success.");
            return mMaxACodecSwCapabilityMap;
        } catch (Exception unused) {
            TPNativeLog.printLog(4, TAG, "getACodecSWMaxCapabilityMap exception");
            return null;
        }
    }

    public static synchronized HashMap<Integer, TPCodecCapability.TPCodecMaxCapability> getAMediaCodecMaxCapabilityMap() {
        if (!mMaxACodecHwCapabilityMap.isEmpty()) {
            return mMaxACodecHwCapabilityMap;
        }
        try {
            for (TPMediaDecoderInfo tPMediaDecoderInfo : TPMediaDecoderList.getTPMediaDecoderInfos(mLocalCache)) {
                String decoderMimeType = tPMediaDecoderInfo.getDecoderMimeType();
                if (tPMediaDecoderInfo.isAudio() && isSupportedMediaCodec(decoderMimeType) && !isInMediaCodecBlackList(decoderMimeType) && !isAMediaCodecBlackListInstance(tPMediaDecoderInfo.getDecoderName())) {
                    TPNativeLog.printLog(1, TAG, "Audio MimeType: " + decoderMimeType + " codecName: " + tPMediaDecoderInfo.getDecoderName());
                    TPMediaDecoderInfo.DecoderProfileLevel maxProfileLevel = tPMediaDecoderInfo.getMaxProfileLevel();
                    TPCodecCapability.TPCodecMaxCapability tPCodecMaxCapability = new TPCodecCapability.TPCodecMaxCapability(maxProfileLevel.profile, maxProfileLevel.level, tPMediaDecoderInfo.getMaxAudioSampleRate(), tPMediaDecoderInfo.getMaxAudioBitRate(), tPMediaDecoderInfo.getMaxAudioChannels());
                    if (!mMaxACodecHwCapabilityMap.containsKey(Integer.valueOf(getSupportedCodecId(decoderMimeType)))) {
                        TPNativeLog.printLog(1, TAG, "audio codecName: " + tPMediaDecoderInfo.getDecoderName() + " maxSamplerate: " + tPMediaDecoderInfo.getMaxAudioSampleRate() + " maxChannels: " + tPMediaDecoderInfo.getMaxAudioChannels());
                        replace(Integer.valueOf(getSupportedCodecId(decoderMimeType)), tPCodecMaxCapability, mMaxACodecHwCapabilityMap);
                        replace(decoderMimeType, tPMediaDecoderInfo.getDecoderName(), mAudioMaxCapCodecInstance);
                        mAMediaCodecCapList.add(decoderMimeType);
                    } else if (tPMediaDecoderInfo.getMaxAudioSampleRate() > mMaxACodecHwCapabilityMap.get(Integer.valueOf(getSupportedCodecId(decoderMimeType))).maxSampleRate || TextUtils.equals(decoderMimeType, y.N)) {
                        TPNativeLog.printLog(1, TAG, "audio codecName: " + tPMediaDecoderInfo.getDecoderName() + " maxSamplerate: " + tPMediaDecoderInfo.getMaxAudioSampleRate() + " maxChannels: " + tPMediaDecoderInfo.getMaxAudioChannels());
                        replace(Integer.valueOf(getSupportedCodecId(decoderMimeType)), tPCodecMaxCapability, mMaxACodecHwCapabilityMap);
                        replace(decoderMimeType, tPMediaDecoderInfo.getDecoderName(), mAudioMaxCapCodecInstance);
                    }
                }
            }
        } catch (Exception e10) {
            TPNativeLog.printLog(4, TAG, "getAMediaCodecMaxCapabilityMap failed:" + e10.getMessage());
        }
        return mMaxACodecHwCapabilityMap;
    }

    public static int getAV1SWDecodeLevel() {
        return getDecodeLevelByCoresAndFreq();
    }

    public static boolean getAudioMediaCodecPassThroughCap(int i10, int i11, int i12) {
        if (i10 != 5004) {
            return false;
        }
        int i13 = 1;
        if (i11 == 20) {
            i13 = 7;
        } else if (i11 == 50 || i11 == 60) {
            i13 = 8;
        }
        return TPAudioPassThroughPluginDetector.isAudioPassThroughSupport(i13, i12);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0071  */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x005d, code lost:
    
        if (r1 != 3) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int getAvs3SWDecodeLevel() {
        /*
            java.lang.String r0 = com.tencent.thumbplayer.tcmedia.core.common.TPSystemInfo.getCpuHarewareName()
            int r1 = com.tencent.thumbplayer.tcmedia.core.common.TPSystemInfo.getCpuHWProducter(r0)
            int r2 = com.tencent.thumbplayer.tcmedia.core.common.TPSystemInfo.getCpuHWProductIndex(r0)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "[getAvs3SWDecodeLevel], mCpuHWProducter = "
            r3.<init>(r4)
            r3.append(r1)
            java.lang.String r4 = ", getMaxCpuFreq() = "
            r3.append(r4)
            long r4 = com.tencent.thumbplayer.tcmedia.core.common.TPSystemInfo.getMaxCpuFreq()
            r3.append(r4)
            java.lang.String r4 = ", numCores = "
            r3.append(r4)
            int r4 = com.tencent.thumbplayer.tcmedia.core.common.TPSystemInfo.getNumCores()
            r3.append(r4)
            java.lang.String r4 = ", mCpuHWProductIdx="
            r3.append(r4)
            r3.append(r2)
            java.lang.String r4 = ", hardware="
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r3 = 2
            java.lang.String r4 = "TPCodecUtils"
            com.tencent.thumbplayer.tcmedia.core.common.TPNativeLog.printLog(r3, r4, r0)
            int r0 = com.tencent.thumbplayer.tcmedia.core.common.TPCodecUtils.mAvs3DeviceLevel
            r4 = -1
            if (r4 == r0) goto L4e
            return r0
        L4e:
            r0 = 0
            com.tencent.thumbplayer.tcmedia.core.common.TPCodecUtils.mAvs3DeviceLevel = r0
            if (r4 == r1) goto L71
            r0 = 26
            if (r1 == 0) goto L65
            r4 = 1
            if (r1 == r4) goto L71
            if (r1 == r3) goto L60
            r0 = 3
            if (r1 == r0) goto L71
            goto L77
        L60:
            int r1 = com.tencent.thumbplayer.tcmedia.core.common.TPCodecUtils.mFhdAvs3HisiIndex
            if (r2 < r1) goto L71
            goto L69
        L65:
            int r1 = com.tencent.thumbplayer.tcmedia.core.common.TPCodecUtils.mFhdAvs3QualcommIndex
            if (r2 < r1) goto L6a
        L69:
            goto L75
        L6a:
            int r0 = com.tencent.thumbplayer.tcmedia.core.common.TPCodecUtils.mShdAvs3QualcommIndex
            if (r2 < r0) goto L71
            r0 = 21
            goto L75
        L71:
            int r0 = getDecodeLevelByCoresAndFreq()
        L75:
            com.tencent.thumbplayer.tcmedia.core.common.TPCodecUtils.mAvs3DeviceLevel = r0
        L77:
            int r0 = com.tencent.thumbplayer.tcmedia.core.common.TPCodecUtils.mAvs3DeviceLevel
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.thumbplayer.tcmedia.core.common.TPCodecUtils.getAvs3SWDecodeLevel():int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002d, code lost:
    
        if ((com.tencent.thumbplayer.tcmedia.core.common.TPSystemInfo.getMaxCpuFreq() / 1000) >= 1400) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0040, code lost:
    
        if ((com.tencent.thumbplayer.tcmedia.core.common.TPSystemInfo.getMaxCpuFreq() / 1000) >= 1600) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0043, code lost:
    
        return 21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:?, code lost:
    
        return 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0018, code lost:
    
        if ((com.tencent.thumbplayer.tcmedia.core.common.TPSystemInfo.getMaxCpuFreq() / 1000) >= 1200) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static int getDecodeLevelByCoresAndFreq() {
        /*
            int r0 = com.tencent.thumbplayer.tcmedia.core.common.TPSystemInfo.getNumCores()
            r1 = 6
            r2 = 21
            r3 = 16
            r4 = 1000(0x3e8, double:4.94E-321)
            r6 = 8
            if (r0 < r6) goto L1e
            long r0 = com.tencent.thumbplayer.tcmedia.core.common.TPSystemInfo.getMaxCpuFreq()
            long r0 = r0 / r4
            r4 = 1200(0x4b0, double:5.93E-321)
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 < 0) goto L1c
        L1a:
            r1 = r2
            goto L43
        L1c:
            r1 = r3
            goto L43
        L1e:
            int r0 = com.tencent.thumbplayer.tcmedia.core.common.TPSystemInfo.getNumCores()
            if (r0 < r1) goto L30
            long r0 = com.tencent.thumbplayer.tcmedia.core.common.TPSystemInfo.getMaxCpuFreq()
            long r0 = r0 / r4
            r4 = 1400(0x578, double:6.917E-321)
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 < 0) goto L1c
            goto L1a
        L30:
            int r0 = com.tencent.thumbplayer.tcmedia.core.common.TPSystemInfo.getNumCores()
            r6 = 4
            if (r0 < r6) goto L43
            long r0 = com.tencent.thumbplayer.tcmedia.core.common.TPSystemInfo.getMaxCpuFreq()
            long r0 = r0 / r4
            r4 = 1600(0x640, double:7.905E-321)
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 < 0) goto L1c
            goto L1a
        L43:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.thumbplayer.tcmedia.core.common.TPCodecUtils.getDecodeLevelByCoresAndFreq():int");
    }

    public static synchronized void getDecoderMaxCapabilityMapAsync() {
        if (mIsInitDone) {
            TPNativeLog.printLog(2, TAG, "decoder capability already init,return directly!");
            return;
        }
        TPNativeLog.printLog(2, TAG, "decoder capability not init,acquire async with create thread!");
        Thread thread = new Thread(new Runnable() { // from class: com.tencent.thumbplayer.tcmedia.core.common.TPCodecUtils.1
            @Override // java.lang.Runnable
            public final void run() {
                TPCodecUtils.getVMediaCodecMaxCapabilityMap();
                TPCodecUtils.getAMediaCodecMaxCapabilityMap();
                TPCodecUtils.getVCodecSWMaxCapabilityMap();
                TPCodecUtils.getACodecSWMaxCapabilityMap();
                boolean unused = TPCodecUtils.mIsInitDone = true;
                TPNativeLog.printLog(2, TPCodecUtils.TAG, "new thread getDecoderMaxCapabilityMap done");
            }
        });
        thread.setName("TP_codec_init_thread");
        thread.start();
    }

    public static String getDecoderName(String str, boolean z10) {
        if (str.contains("audio")) {
            if (TextUtils.equals(str, y.M) && mAudioMaxCapCodecInstance.containsKey(y.N)) {
                return mAudioMaxCapCodecInstance.get(y.N);
            }
            if (mAudioMaxCapCodecInstance.containsKey(str)) {
                return mAudioMaxCapCodecInstance.get(str);
            }
            return null;
        }
        ArrayList<TPMediaDecoderInfo> arrayList = new ArrayList();
        for (TPMediaDecoderInfo tPMediaDecoderInfo : TPMediaDecoderList.getTPMediaDecoderInfos(mLocalCache)) {
            if (TextUtils.equals(str, tPMediaDecoderInfo.getDecoderMimeType()) && tPMediaDecoderInfo.isSecureDecoder() == z10) {
                TPNativeLog.printLog(1, TAG, "getDecoderName:" + tPMediaDecoderInfo.getDecoderName());
                arrayList.add(tPMediaDecoderInfo);
            }
        }
        for (TPMediaDecoderInfo tPMediaDecoderInfo2 : arrayList) {
            if ((tPMediaDecoderInfo2.isVideo() && tPMediaDecoderInfo2.isVideoSofwareDecoder() == mPreferredSoftwareComponent) || (tPMediaDecoderInfo2.isAudio() && tPMediaDecoderInfo2.isAudioSofwareDecoder() == mPreferredSoftwareComponent)) {
                return tPMediaDecoderInfo2.getDecoderName();
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((TPMediaDecoderInfo) arrayList.get(0)).getDecoderName();
    }

    public static String getDisplayVersion() {
        return null;
    }

    public static String getDolbyVisionDecoderName(String str, int i10, int i11, boolean z10) {
        if (!TextUtils.equals("video/dolby-vision", str)) {
            return null;
        }
        int iConvertDolbyVisionToOmxProfile = convertDolbyVisionToOmxProfile(i10);
        for (TPMediaDecoderInfo tPMediaDecoderInfo : TPMediaDecoderList.getTPMediaDecoderInfos(mLocalCache)) {
            TPMediaDecoderInfo.DecoderProfileLevel[] profileLevels = tPMediaDecoderInfo.getProfileLevels();
            if (TextUtils.equals(tPMediaDecoderInfo.getDecoderMimeType(), str)) {
                for (TPMediaDecoderInfo.DecoderProfileLevel decoderProfileLevel : profileLevels) {
                    if (decoderProfileLevel.profile == iConvertDolbyVisionToOmxProfile) {
                        TPNativeLog.printLog(1, TAG, "getDolbyVisionDecoderName  profile:" + decoderProfileLevel.profile + " dvProfile:" + i10 + " bSecure:" + z10 + " name:" + tPMediaDecoderInfo.getDecoderName());
                        if (tPMediaDecoderInfo.isSecureDecoder() == z10) {
                            return tPMediaDecoderInfo.getDecoderName();
                        }
                    }
                }
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0084  */
    /* JADX WARN: Code duplicated, block: B:39:0x008c  */
    public static int getHevcSWDecodeLevel() {
        int decodeLevelByCoresAndFreq;
        String cpuHarewareName = TPSystemInfo.getCpuHarewareName();
        int cpuHWProducter = TPSystemInfo.getCpuHWProducter(cpuHarewareName);
        int cpuHWProductIndex = TPSystemInfo.getCpuHWProductIndex(cpuHarewareName);
        TPNativeLog.printLog(2, TAG, "[getHevcSWDecodeLevel], mCpuHWProducter = " + cpuHWProducter + ", getMaxCpuFreq() = " + TPSystemInfo.getMaxCpuFreq() + ", numCores = " + TPSystemInfo.getNumCores() + ", mCpuHWProductIdx=" + cpuHWProductIndex + ", hardware=" + cpuHarewareName);
        int i10 = mHevcDeviceLevel;
        if (-1 != i10) {
            return i10;
        }
        mHevcDeviceLevel = 0;
        if (-1 != cpuHWProducter) {
            decodeLevelByCoresAndFreq = 16;
            if (cpuHWProducter != 0) {
                if (cpuHWProducter != 1) {
                    if (cpuHWProducter != 2) {
                        if (cpuHWProducter == 3) {
                            if (cpuHWProductIndex >= mShdHevcSamsungIndex) {
                                mHevcDeviceLevel = 21;
                            } else {
                                if (cpuHWProductIndex < mHdHevcSamsungIndex) {
                                    decodeLevelByCoresAndFreq = getDecodeLevelByCoresAndFreq();
                                }
                                mHevcDeviceLevel = decodeLevelByCoresAndFreq;
                            }
                        }
                    } else if (cpuHWProductIndex >= mShdHevcHisiIndex) {
                        mHevcDeviceLevel = 21;
                    } else {
                        if (cpuHWProductIndex < mHdHevcHisiIndex) {
                            decodeLevelByCoresAndFreq = getDecodeLevelByCoresAndFreq();
                        }
                        mHevcDeviceLevel = decodeLevelByCoresAndFreq;
                    }
                } else if (cpuHWProductIndex >= mShdHevcMtkIndex) {
                    mHevcDeviceLevel = 21;
                } else {
                    if (cpuHWProductIndex < mHdHevcMtkIndex) {
                        decodeLevelByCoresAndFreq = getDecodeLevelByCoresAndFreq();
                    }
                    mHevcDeviceLevel = decodeLevelByCoresAndFreq;
                }
            } else if (cpuHWProductIndex >= mShdHevcQualcommIndex) {
                mHevcDeviceLevel = 21;
            } else {
                if (cpuHWProductIndex < mHdHevcQualcommIndex) {
                    decodeLevelByCoresAndFreq = getDecodeLevelByCoresAndFreq();
                }
                mHevcDeviceLevel = decodeLevelByCoresAndFreq;
            }
        } else {
            decodeLevelByCoresAndFreq = getDecodeLevelByCoresAndFreq();
            mHevcDeviceLevel = decodeLevelByCoresAndFreq;
        }
        return mHevcDeviceLevel;
    }

    public static int getMaxLumaSample(String str, int i10) {
        if (TextUtils.equals(str, "video/avc")) {
            return TPMediaCodecProfileLevel.getAVCMaxLumaSample(i10);
        }
        if (TextUtils.equals(str, "video/hevc")) {
            return TPMediaCodecProfileLevel.getHEVCMaxLumaSample(i10);
        }
        if (TextUtils.equals(str, "video/x-vnd.on2.vp8")) {
            return TPMediaCodecProfileLevel.getVP8MaxLumaSample(i10);
        }
        if (TextUtils.equals(str, "video/x-vnd.on2.vp9")) {
            return TPMediaCodecProfileLevel.getVP9MaxLumaSample(i10);
        }
        if (TextUtils.equals(str, "video/av01")) {
            return TPMediaCodecProfileLevel.getAV1MaxLumaSample(i10);
        }
        return 0;
    }

    public static synchronized int getMaxSupportedFrameRatesFor(int i10, int i11, int i12, int i13) {
        if (i10 == 101 || i10 == -1) {
            return 30;
        }
        String supportedHWMimeType = getSupportedHWMimeType(i11);
        if (supportedHWMimeType.isEmpty()) {
            return 30;
        }
        Integer numValueOf = 30;
        try {
            for (TPMediaDecoderInfo tPMediaDecoderInfo : TPMediaDecoderList.getTPMediaDecoderInfos(mLocalCache)) {
                if (supportedHWMimeType.equals(tPMediaDecoderInfo.getDecoderMimeType())) {
                    int decoderMaxWidth = tPMediaDecoderInfo.getDecoderMaxWidth();
                    int decoderMaxHeight = tPMediaDecoderInfo.getDecoderMaxHeight();
                    int decoderLumaWidth = tPMediaDecoderInfo.getDecoderLumaWidth();
                    int decoderLumaHeight = tPMediaDecoderInfo.getDecoderLumaHeight();
                    int decoderMaxFrameRateForMaxLuma = tPMediaDecoderInfo.getDecoderMaxFrameRateForMaxLuma();
                    int decoderMaxFrameRate = tPMediaDecoderInfo.getDecoderMaxFrameRate();
                    if (!isLimitMaxWidthOrMaxHeight(decoderMaxWidth, decoderMaxHeight, decoderLumaWidth, decoderLumaHeight, i12, i13)) {
                        numValueOf = Integer.valueOf(Math.min(decoderMaxFrameRate, Math.max(1, ((int) ((((long) (decoderMaxWidth * decoderLumaHeight)) * 1) / Math.max(((long) (i12 * i13)) * 1, 1L))) * decoderMaxFrameRateForMaxLuma)));
                        TPNativeLog.printLog(2, TAG, "getSupportedFrameRatesFor max width:" + decoderMaxWidth + " max height:" + decoderLumaHeight + " max framerate for max resolution:" + decoderMaxFrameRateForMaxLuma + " current width:" + i12 + " height:" + i13 + " max support framerate:" + numValueOf);
                        break;
                    }
                    return 0;
                }
            }
        } catch (Exception e10) {
            TPNativeLog.printLog(4, TAG, "getMaxSupportedFrameRatesFor failed:" + e10.getMessage());
        }
        return numValueOf.intValue();
    }

    private static int getSoftMaxSamples(int i10) {
        if (i10 == 1) {
            return 129600;
        }
        if (i10 == 6) {
            return 307200;
        }
        if (i10 == 11) {
            return 407040;
        }
        if (i10 == 16) {
            return 480000;
        }
        if (i10 == 21) {
            return 921600;
        }
        if (i10 == 26) {
            return 2073600;
        }
        if (i10 != 28) {
            return i10 != 33 ? 0 : 8847360;
        }
        return 8294400;
    }

    private static int getSupportedCodecId(String str) {
        if (TextUtils.equals(str, "video/avc")) {
            return 26;
        }
        if (TextUtils.equals(str, "video/hevc")) {
            return 172;
        }
        if (TextUtils.equals(str, "video/x-vnd.on2.vp8")) {
            return 138;
        }
        if (TextUtils.equals(str, "video/x-vnd.on2.vp9")) {
            return 166;
        }
        if (TextUtils.equals(str, "video/av01")) {
            return 1029;
        }
        if (TextUtils.equals(str, y.A)) {
            return 5002;
        }
        if (TextUtils.equals(str, y.L)) {
            return 5003;
        }
        if (TextUtils.equals(str, y.M) || TextUtils.equals(str, y.N)) {
            return 5040;
        }
        if (TextUtils.equals(str, y.Z)) {
            return 5012;
        }
        return TextUtils.equals(str, y.Q) ? 5004 : -1;
    }

    private static String getSupportedHWMimeType(int i10) {
        if (i10 == 26) {
            return "video/avc";
        }
        if (i10 == 138) {
            return "video/x-vnd.on2.vp8";
        }
        if (i10 == 166) {
            return "video/x-vnd.on2.vp9";
        }
        if (i10 != 172) {
            return i10 != 1029 ? "" : "video/av01";
        }
        return "video/hevc";
    }

    public static String getSystemPatchVersion() {
        return null;
    }

    public static synchronized HashMap<Integer, TPCodecCapability.TPCodecMaxCapability> getVCodecSWMaxCapabilityMap() {
        TPNativeLog.printLog(2, TAG, "getVCodecSWMaxCapabilityMap func in");
        if (mIsFFmpegCapGot) {
            return mMaxVCodecSwCapabilityMap;
        }
        try {
            int hevcSWDecodeLevel = getHevcSWDecodeLevel();
            int softMaxSamples = getSoftMaxSamples(hevcSWDecodeLevel);
            int avs3SWDecodeLevel = getAvs3SWDecodeLevel();
            int aV1SWDecodeLevel = getAV1SWDecodeLevel();
            int vvcSWDecodeLevel = getVvcSWDecodeLevel();
            int softMaxSamples2 = getSoftMaxSamples(avs3SWDecodeLevel);
            int softMaxSamples3 = getSoftMaxSamples(aV1SWDecodeLevel);
            int softMaxSamples4 = getSoftMaxSamples(vvcSWDecodeLevel);
            TPNativeLog.printLog(2, "getVCodecSWMaxCapabilityMap, hevcDecodeLevel:" + hevcSWDecodeLevel + ", avs3DecodeLevel:" + avs3SWDecodeLevel + ", AV1DecodeLevel:" + aV1SWDecodeLevel + ", vvcDecodeLevel:" + vvcSWDecodeLevel);
            TPCodecCapability.TPCodecMaxCapability tPCodecMaxCapability = mAVCSWMaxCapability;
            tPCodecMaxCapability.maxLumaSamples = softMaxSamples;
            tPCodecMaxCapability.maxProfile = 64;
            tPCodecMaxCapability.maxLevel = 65536;
            mMaxVCodecSwCapabilityMap.put(26, mAVCSWMaxCapability);
            TPCodecCapability.TPCodecMaxCapability tPCodecMaxCapability2 = mHEVCSWMaxCapability;
            tPCodecMaxCapability2.maxLumaSamples = softMaxSamples;
            tPCodecMaxCapability2.maxProfile = 2;
            tPCodecMaxCapability2.maxLevel = 33554432;
            mMaxVCodecSwCapabilityMap.put(172, mHEVCSWMaxCapability);
            TPCodecCapability.TPCodecMaxCapability tPCodecMaxCapability3 = mVP9SWMaxCapability;
            tPCodecMaxCapability3.maxLumaSamples = softMaxSamples;
            tPCodecMaxCapability3.maxProfile = 8;
            tPCodecMaxCapability3.maxLevel = 8192;
            mMaxVCodecSwCapabilityMap.put(166, mVP9SWMaxCapability);
            TPCodecCapability.TPCodecMaxCapability tPCodecMaxCapability4 = mVP8SWMaxCapability;
            tPCodecMaxCapability4.maxLumaSamples = softMaxSamples;
            tPCodecMaxCapability4.maxProfile = 1;
            tPCodecMaxCapability4.maxLevel = 8;
            mMaxVCodecSwCapabilityMap.put(138, mVP8SWMaxCapability);
            TPCodecCapability.TPCodecMaxCapability tPCodecMaxCapability5 = mAVS3WMaxCapability;
            tPCodecMaxCapability5.maxLumaSamples = softMaxSamples2;
            tPCodecMaxCapability5.maxProfile = 0;
            tPCodecMaxCapability5.maxLevel = 0;
            mMaxVCodecSwCapabilityMap.put(192, mAVS3WMaxCapability);
            TPCodecCapability.TPCodecMaxCapability tPCodecMaxCapability6 = mAV1SWMaxCapability;
            tPCodecMaxCapability6.maxLumaSamples = softMaxSamples3;
            tPCodecMaxCapability6.maxProfile = 0;
            tPCodecMaxCapability6.maxLevel = 0;
            mMaxVCodecSwCapabilityMap.put(1029, mAV1SWMaxCapability);
            TPCodecCapability.TPCodecMaxCapability tPCodecMaxCapability7 = mVVCSWMaxCapability;
            tPCodecMaxCapability7.maxLumaSamples = softMaxSamples4;
            tPCodecMaxCapability7.maxProfile = 0;
            tPCodecMaxCapability7.maxLevel = 0;
            mMaxVCodecSwCapabilityMap.put(193, mVVCSWMaxCapability);
            TPNativeLog.printLog(2, "getVCodecSWMaxCapabilityMap success, maxHevcLumaSamples:" + softMaxSamples + ", maxAvs3LumaSamples:" + softMaxSamples2 + ", maxAV1LumaSamples:" + softMaxSamples3 + ", maxVvcLumaSamples:" + softMaxSamples4);
            mIsFFmpegCapGot = true;
            return mMaxVCodecSwCapabilityMap;
        } catch (Exception unused) {
            TPNativeLog.printLog(4, TAG, "getVCodecSWMaxCapabilityMap exception");
            return null;
        }
    }

    public static synchronized HashMap<Integer, TPCodecCapability.TPCodecMaxCapability> getVMediaCodecMaxCapabilityMap() {
        TPNativeLog.printLog(2, TAG, "getVMediaCodecMaxCapabilityMap func in");
        if (!mMaxVCodecHwCapabilityMap.isEmpty()) {
            TPNativeLog.printLog(2, TAG, "return memory stored video max cap map");
            return mMaxVCodecHwCapabilityMap;
        }
        try {
            for (TPMediaDecoderInfo tPMediaDecoderInfo : TPMediaDecoderList.getTPMediaDecoderInfos(mLocalCache)) {
                String decoderMimeType = tPMediaDecoderInfo.getDecoderMimeType();
                if (tPMediaDecoderInfo.isVideo()) {
                    mVMediaCodecCapList.add(decoderMimeType);
                    TPNativeLog.printLog(1, TAG, "Video MimeType: " + decoderMimeType + " codecName: " + tPMediaDecoderInfo.getDecoderName());
                    if (isSupportedMediaCodec(decoderMimeType) && !tPMediaDecoderInfo.isSecureDecoder()) {
                        TPMediaDecoderInfo.DecoderProfileLevel maxProfileLevel = tPMediaDecoderInfo.getMaxProfileLevel();
                        TPCodecCapability.TPCodecMaxCapability tPCodecMaxCapability = new TPCodecCapability.TPCodecMaxCapability(getMaxLumaSample(decoderMimeType, maxProfileLevel.level), maxProfileLevel.profile, maxProfileLevel.level, tPMediaDecoderInfo.getDecoderMaxFrameRateForMaxLuma());
                        TPNativeLog.printLog(1, TAG, "video codecName: " + tPMediaDecoderInfo.getDecoderName() + " lumasample: " + getMaxLumaSample(decoderMimeType, maxProfileLevel.level) + " framerate: " + tPMediaDecoderInfo.getDecoderMaxFrameRateForMaxLuma());
                        if (!mMaxVCodecHwCapabilityMap.containsKey(Integer.valueOf(getSupportedCodecId(decoderMimeType))) || maxProfileLevel.level > mMaxVCodecHwCapabilityMap.get(Integer.valueOf(getSupportedCodecId(decoderMimeType))).maxLevel) {
                            replace(Integer.valueOf(getSupportedCodecId(decoderMimeType)), tPCodecMaxCapability, mMaxVCodecHwCapabilityMap);
                        }
                    }
                }
            }
        } catch (Exception e10) {
            TPNativeLog.printLog(4, TAG, "getVMediaCodecMaxCapabilityMap failed:" + Log.getStackTraceString(e10));
        }
        return mMaxVCodecHwCapabilityMap;
    }

    private static int getValueFromSubstring(String str, int i10, int i11) {
        if (i10 < 0) {
            i10 = 0;
        }
        if (i11 >= str.length()) {
            i11 = str.length() - 1;
        }
        if (i10 > i11) {
            i10 = i11;
        }
        return Integer.parseInt(str.substring(i10, i11));
    }

    private static int getVvcSWDecodeLevel() {
        String strValueOf;
        String str;
        int i10 = mVvcDeviceLevel;
        if (i10 != -1) {
            return i10;
        }
        String cpuHarewareName = TPSystemInfo.getCpuHarewareName();
        int cpuHWProducter = TPSystemInfo.getCpuHWProducter(cpuHarewareName);
        int cpuHWProductIndex = TPSystemInfo.getCpuHWProductIndex(cpuHarewareName);
        TPNativeLog.printLog(2, TAG, "[getVvcSWDecodeLevel], mCpuHWProducer = " + cpuHWProducter + ", getMaxCpuFreq() = " + TPSystemInfo.getMaxCpuFreq() + ", numCores = " + TPSystemInfo.getNumCores() + ", mCpuHWProductIdx = " + cpuHWProductIndex + ", hardware = " + cpuHarewareName);
        if (cpuHWProducter == -1) {
            strValueOf = String.valueOf(cpuHWProducter);
            str = "current cpu manufacturer is not listed in the performance list, cpuHwProducer:";
        } else {
            if (cpuHWProductIndex != -1) {
                int iSelectBestDecodeLevelFromCapabilityTable = selectBestDecodeLevelFromCapabilityTable(193, cpuHWProducter, cpuHWProductIndex);
                int i11 = iSelectBestDecodeLevelFromCapabilityTable != -1 ? iSelectBestDecodeLevelFromCapabilityTable : 0;
                mVvcDeviceLevel = i11;
                return i11;
            }
            strValueOf = String.valueOf(cpuHWProductIndex);
            str = "current cpu model is not listed in the performance list, cpuHwProductIdx:";
        }
        TPNativeLog.printLog(3, TAG, str.concat(strValueOf));
        mVvcDeviceLevel = 0;
        return 0;
    }

    public static synchronized void init(Context context, boolean z10) {
        TPNativeLog.printLog(2, TAG, "is local cache enabled:".concat(String.valueOf(z10)));
        Context applicationContext = context.getApplicationContext();
        mContext = applicationContext;
        if (z10) {
            mLocalCache = LocalCache.get(applicationContext);
        }
        getDecoderMaxCapabilityMapAsync();
    }

    public static boolean isAMediaCodecBlackListInstance(String str) {
        return mAMediaCodecBlackListInstance.contains(str);
    }

    public static boolean isAMediaCodecBlackListModel() {
        return mAMediaCodecBlackListModel.contains(TPSystemInfo.getDeviceName());
    }

    public static boolean isBlackListType(String str) {
        return Arrays.asList("PRO 7 Plus", "PRO 7-H", "PRO+7+Plus").contains(TPSystemInfo.getDeviceName()) && TextUtils.equals(str, "video/hevc");
    }

    private static synchronized boolean isHDR10Support(int i10) {
        for (TPMediaDecoderInfo tPMediaDecoderInfo : TPMediaDecoderList.getTPMediaDecoderInfos(mLocalCache)) {
            if (TextUtils.equals(tPMediaDecoderInfo.getDecoderMimeType(), "video/hevc")) {
                for (TPMediaDecoderInfo.DecoderProfileLevel decoderProfileLevel : tPMediaDecoderInfo.getProfileLevels()) {
                    if (decoderProfileLevel.profile == i10) {
                        TPNativeLog.printLog(2, TAG, "support hdr10 ".concat(String.valueOf(i10)));
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private static synchronized boolean isHDRDVSupport(int i10, int i11) {
        try {
            if (i10 == 0 && i11 == 0) {
                return mVMediaCodecCapList.contains("video/dolby-vision");
            }
            for (TPMediaDecoderInfo tPMediaDecoderInfo : TPMediaDecoderList.getTPMediaDecoderInfos(mLocalCache)) {
                if (TextUtils.equals(tPMediaDecoderInfo.getDecoderMimeType(), "video/dolby-vision")) {
                    for (TPMediaDecoderInfo.DecoderProfileLevel decoderProfileLevel : tPMediaDecoderInfo.getProfileLevels()) {
                        if (decoderProfileLevel.profile == i10 && decoderProfileLevel.level == i11) {
                            TPNativeLog.printLog(2, TAG, "support dolbyvision");
                            return true;
                        }
                    }
                }
            }
            return false;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public static boolean isHDRDecoderTypeSupport(int i10, int i11) {
        String strValueOf;
        String str;
        if (i11 == 102 || i11 == 101) {
            HashMap<Integer, ArrayList<TPCodecCapability.TPHdrSupportVersionRange>> map = i11 == 102 ? mHDRTypeToHDRHardwareCodecWhiteListMap : mHDRTypeToHDRSoftwareCodecWhiteListMap;
            if (map.containsKey(Integer.valueOf(i10))) {
                return isInHDRVersionRangeWhiteList(map.get(Integer.valueOf(i10)));
            }
            strValueOf = String.valueOf(i10);
            str = "isHDRDecodeTypeSupport, not config hdrType whiteList, hdrType = ";
        } else {
            strValueOf = String.valueOf(i11);
            str = "isHDRDecodeTypeSupport, not support decoderType, decoderType = ";
        }
        TPNativeLog.printLog(3, TAG, str.concat(strValueOf));
        return false;
    }

    public static boolean isHDRsupport(int i10, int i11, int i12) {
        if (i10 == 2) {
            return isHDRDVSupport(i11, i12);
        }
        if (i10 == 0) {
            return isHDR10Support(4096);
        }
        if (i10 == 1) {
            return isHDR10Support(8192);
        }
        if (i10 != 4) {
            return false;
        }
        String displayVersion = getDisplayVersion();
        String systemPatchVersion = getSystemPatchVersion();
        TPNativeLog.printLog(2, TAG, "isHDRsupport(HDRVivid):display version:".concat(String.valueOf(displayVersion)));
        TPNativeLog.printLog(2, TAG, "isHDRsupport(HDRVivid):patch version:".concat(String.valueOf(systemPatchVersion)));
        return checkHDRVividSupportByVersion(TPSystemInfo.getDeviceName(), displayVersion, systemPatchVersion);
    }

    public static boolean isInDRMLevel1Blacklist(int i10) {
        if (mDrmL1BlackList.containsKey(Integer.valueOf(i10))) {
            return mDrmL1BlackList.get(Integer.valueOf(i10)).contains(TPSystemInfo.getDeviceName());
        }
        return false;
    }

    private static boolean isInHDRVersionRangeWhiteList(ArrayList<TPCodecCapability.TPHdrSupportVersionRange> arrayList) {
        if (arrayList == null) {
            return false;
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            TPCodecCapability.TPHdrSupportVersionRange tPHdrSupportVersionRange = arrayList.get(i10);
            int i11 = Build.VERSION.SDK_INT;
            if (i11 <= tPHdrSupportVersionRange.upperboundAndroidAPILevel && i11 >= tPHdrSupportVersionRange.lowerboundAndroidAPILevel) {
                TPNativeLog.printLog(2, TAG, "inHDRVersionRangeWhiteList!");
                return true;
            }
        }
        return false;
    }

    public static boolean isInHDRVividBlackList(String str, int i10, int i11) {
        if (mHdrBlackMap.containsKey(4)) {
            HashMap<String, TPCodecCapability.TPHdrSupportVersionRange> map = mHdrBlackMap.get(4);
            if (map.containsKey(str)) {
                TPCodecCapability.TPHdrSupportVersionRange tPHdrSupportVersionRange = map.get(str);
                if (i10 <= tPHdrSupportVersionRange.upperboundSystemVersion && i10 >= tPHdrSupportVersionRange.lowerboundSystemVersion && i11 <= tPHdrSupportVersionRange.upperboundPatchVersion && i11 >= tPHdrSupportVersionRange.lowerboundPatchVersion) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isInHDRVividWhiteList(String str, int i10, int i11) {
        if (mHdrWhiteMap.containsKey(4)) {
            HashMap<String, TPCodecCapability.TPHdrSupportVersionRange> map = mHdrWhiteMap.get(4);
            if (map.containsKey(str)) {
                TPCodecCapability.TPHdrSupportVersionRange tPHdrSupportVersionRange = map.get(str);
                if (i10 <= tPHdrSupportVersionRange.upperboundSystemVersion && i10 >= tPHdrSupportVersionRange.lowerboundSystemVersion && i11 <= tPHdrSupportVersionRange.upperboundPatchVersion && i11 >= tPHdrSupportVersionRange.lowerboundPatchVersion) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isInMediaCodecBlackList(String str) {
        HashMap<String, Integer> map;
        String deviceName = TPSystemInfo.getDeviceName();
        if (TextUtils.isEmpty(deviceName) || (map = mCodecCapBlackList) == null || !map.containsKey(deviceName)) {
            return false;
        }
        Integer num = mCodecCapBlackList.get(deviceName);
        if (TextUtils.equals(str, "video/avc")) {
            if ((num.intValue() & 1) == 0) {
                return false;
            }
        } else if (TextUtils.equals(str, "video/hevc")) {
            if ((num.intValue() & 2) == 0) {
                return false;
            }
        } else if (TextUtils.equals(str, "video/x-vnd.on2.vp8")) {
            if ((num.intValue() & 256) == 0) {
                return false;
            }
        } else if (TextUtils.equals(str, "video/x-vnd.on2.vp9")) {
            if ((num.intValue() & 4) == 0) {
                return false;
            }
        } else if (TextUtils.equals(str, y.A)) {
            if ((num.intValue() & 8) == 0) {
                return false;
            }
        } else if (TextUtils.equals(str, y.L)) {
            if ((num.intValue() & 16) == 0) {
                return false;
            }
        } else if (TextUtils.equals(str, y.M)) {
            if ((num.intValue() & 32) == 0) {
                return false;
            }
        } else if (TextUtils.equals(str, y.Z)) {
            if ((num.intValue() & 64) == 0) {
                return false;
            }
        } else if (TextUtils.equals(str, y.Q)) {
            if ((num.intValue() & 128) == 0) {
                return false;
            }
        } else if (!TextUtils.equals(str, y.N) || (num.intValue() & 32) == 0) {
            return false;
        }
        return true;
    }

    public static boolean isInMediaCodecWhiteList(String str) {
        HashMap<String, Integer> map;
        String deviceName = TPSystemInfo.getDeviceName();
        if (TextUtils.isEmpty(deviceName) || (map = mCodecCapWhiteList) == null || !map.containsKey(deviceName)) {
            return false;
        }
        Integer num = mCodecCapWhiteList.get(deviceName);
        if (TextUtils.equals(str, "video/avc")) {
            if ((num.intValue() & 1) == 0) {
                return false;
            }
        } else if (TextUtils.equals(str, "video/hevc")) {
            if ((num.intValue() & 2) == 0) {
                return false;
            }
        } else if (TextUtils.equals(str, "video/x-vnd.on2.vp8")) {
            if ((num.intValue() & 256) == 0) {
                return false;
            }
        } else if (TextUtils.equals(str, "video/x-vnd.on2.vp9")) {
            if ((num.intValue() & 4) == 0) {
                return false;
            }
        } else if (TextUtils.equals(str, y.A)) {
            if ((num.intValue() & 8) == 0) {
                return false;
            }
        } else if (TextUtils.equals(str, y.L)) {
            if ((num.intValue() & 16) == 0) {
                return false;
            }
        } else if (TextUtils.equals(str, y.M)) {
            if ((num.intValue() & 32) == 0) {
                return false;
            }
        } else if (TextUtils.equals(str, y.Z)) {
            if ((num.intValue() & 64) == 0) {
                return false;
            }
        } else if (!TextUtils.equals(str, y.Q) || (num.intValue() & 128) == 0) {
            return false;
        }
        return true;
    }

    private static boolean isLimitMaxWidthOrMaxHeight(int i10, int i11, int i12, int i13, int i14, int i15) {
        if ((i14 <= i15 || (i14 <= i10 && i15 <= i13)) && (i14 >= i15 || (i14 <= i12 && i15 <= i11))) {
            return false;
        }
        int i16 = i14 > i15 ? i13 * i10 : i12 * i11;
        if (i10 < i14 || i11 < i15 || i16 < i14 * i15) {
            TPNativeLog.printLog(4, TAG, "getSupportedFrameRatesFor width:" + i14 + " height:" + i15 + " do not support! maxWidth:" + i10 + " maxHeight:" + i11);
            return true;
        }
        TPNativeLog.printLog(2, TAG, "getSupportedFrameRatesFor width:" + i14 + " height:" + i15 + " limit maxLumaWidth or maxLumaHeight, but not limit maxLumaSamples, do support! maxWidth:" + i10 + " maxHeight:" + i11 + " maxLumaSamples:" + i16);
        return false;
    }

    public static synchronized boolean isMediaCodecDDPlusSupported() {
        if (isAMediaCodecBlackListModel()) {
            return false;
        }
        return mAMediaCodecCapList.contains(y.M) || mAMediaCodecCapList.contains(y.N);
    }

    public static synchronized boolean isMediaCodecDolbyDSSupported() {
        if (isAMediaCodecBlackListModel()) {
            return false;
        }
        return mAMediaCodecCapList.contains(y.L);
    }

    private static boolean isSupportedMediaCodec(String str) {
        return mSupportedMediaCodec.contains(str);
    }

    private static boolean isTheSameVersionRange(TPCodecCapability.TPHdrSupportVersionRange tPHdrSupportVersionRange, TPCodecCapability.TPHdrSupportVersionRange tPHdrSupportVersionRange2) {
        return tPHdrSupportVersionRange.lowerboundPatchVersion == tPHdrSupportVersionRange2.lowerboundPatchVersion && tPHdrSupportVersionRange.lowerboundSystemVersion == tPHdrSupportVersionRange2.lowerboundSystemVersion && tPHdrSupportVersionRange.upperboundPatchVersion == tPHdrSupportVersionRange2.upperboundPatchVersion && tPHdrSupportVersionRange.upperboundSystemVersion == tPHdrSupportVersionRange2.upperboundSystemVersion;
    }

    public static boolean isVMediaCodecBlackListModel() {
        return mVMediaCodecBlackListModel.contains(TPSystemInfo.getDeviceName());
    }

    private static <K, T> void replace(K k10, T t10, HashMap<K, T> map) {
        if (!map.containsKey(k10)) {
            map.put(k10, t10);
        } else {
            map.remove(k10);
            map.put(k10, t10);
        }
    }

    private static int selectBestDecodeLevelFromCapabilityTable(int i10, int i11, int i12) {
        String strValueOf;
        String str;
        VideoSwCapabilityModel videoSwCapabilityModel = mVideoCodecIdToSwCapabilityModel.get(i10);
        if (videoSwCapabilityModel == null) {
            strValueOf = String.valueOf(i10);
            str = "No corresponding codec id found, codecId:";
        } else {
            HashMap<DefinitionName, String> map = videoSwCapabilityModel.mCpuProducerToAllDefinitionDecTable.get(i11);
            if (map != null && !map.isEmpty()) {
                for (DefinitionName definitionName : DefinitionName.values()) {
                    String str2 = map.get(definitionName);
                    if (!TextUtils.isEmpty(str2) && i12 >= TPSystemInfo.getCpuHWProductIndex(i11, str2)) {
                        return convertDefinitionNameToDecodeLevel(definitionName);
                    }
                }
                return -1;
            }
            strValueOf = String.valueOf(i11);
            str = "No corresponding cpu producer found, cpuHwProducer:";
        }
        TPNativeLog.printLog(3, TAG, str.concat(strValueOf));
        return -1;
    }

    public static void setMediaCodecPreferredSoftwareComponent(boolean z10) {
        mPreferredSoftwareComponent = z10;
    }
}
