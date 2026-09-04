package com.alipay.zoloz.toyger.face;

import android.text.TextUtils;
import c4.a;
import com.alibaba.fastjson.JSON;
import com.alipay.zoloz.toyger.ToygerAlgorithmConfig;
import com.alipay.zoloz.toyger.ToygerLog;
import com.alipay.zoloz.toyger.algorithm.ToygerCameraConfig;
import com.alipay.zoloz.toyger.algorithm.ToygerConfig;
import com.alipay.zoloz.toyger.algorithm.ToygerLivenessConfig;
import com.alipay.zoloz.toyger.algorithm.ToygerQualityConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class ToygerFaceAlgorithmConfig extends ToygerAlgorithmConfig {
    public static final String BAT_LIVENESS = "BatLiveness";
    public static final String DARK = "dark";
    public static final String DEPTH = "depth";
    public static final String DRAGONFLY_LIVENESS = "DragonflyLiveness";
    public static final String GEMINI_LIVENESS = "GeminiLiveness";
    public static final String NO_LIVENESS = "NoLiveness";
    public static final String PANO = "pano";
    public static final String ZFACE_BLINK_LIVENESS = "zfaceBlinkLiveness";
    public float batLivenessThreshold;
    public float blink_openness = 0.2f;
    public int depth_cache_num;
    public float dragonflyMax;
    public float dragonflyMin;
    public float eyeOcclusion;
    public float eye_openness;
    public float geminiMax;
    public float geminiMin;
    public boolean isMirror;
    public List<String> liveness_combination;
    public int log_level;
    public float max_iod;
    public float min_iod;
    public float pose_gaussian;
    public float pose_integrity;
    public float pose_light;
    public float pose_motion;
    public float pose_pitch;
    public float pose_pitchMin;
    public float pose_rectwidth;
    public float pose_yaw;
    public float pose_yawMin;
    public float quality_depth_min_quality;
    public float quality_min_quality;
    public String secProtocol;
    public float stack_time;
    public Map<String, List<Float>> threshold;

    public ToygerFaceAlgorithmConfig() {
        this.stack_time = 2.0f;
        this.eye_openness = 0.25f;
        this.pose_pitch = 0.2f;
        this.pose_pitchMin = -0.2f;
        this.pose_yaw = 0.2f;
        this.pose_yawMin = -0.2f;
        this.pose_gaussian = 0.15f;
        this.pose_motion = 1.0f;
        this.pose_rectwidth = 0.25f;
        this.pose_integrity = 0.9f;
        this.pose_light = 0.3f;
        this.min_iod = 0.18f;
        this.max_iod = 0.45f;
        Float fValueOf = Float.valueOf(0.0f);
        this.dragonflyMax = 0.0f;
        this.dragonflyMin = 0.0f;
        this.geminiMin = 0.0f;
        this.geminiMax = 0.0f;
        this.quality_min_quality = 20.0f;
        this.eyeOcclusion = 0.8f;
        this.depth_cache_num = 2;
        this.quality_depth_min_quality = 0.5f;
        this.liveness_combination = new ArrayList();
        this.threshold = new HashMap();
        this.secProtocol = "";
        this.isMirror = false;
        if (TextUtils.equals(a.A, "jrcloud")) {
            this.liveness_combination.add(NO_LIVENESS);
            ArrayList arrayList = new ArrayList();
            arrayList.add(fValueOf);
            this.stack_time = 2.0f;
            this.eye_openness = 0.2f;
            this.pose_pitch = 0.2f;
            this.pose_yaw = 0.2f;
            this.pose_gaussian = 0.15f;
            this.pose_motion = 1.0f;
            this.pose_pitchMin = -0.2f;
            this.pose_rectwidth = 0.25f;
            this.pose_integrity = 0.9f;
            this.pose_light = 0.3f;
            this.pose_yawMin = -0.2f;
            this.min_iod = 0.18f;
            this.max_iod = 0.45f;
            this.quality_min_quality = 20.0f;
            this.threshold.put(NO_LIVENESS, arrayList);
            return;
        }
        if (TextUtils.equals(a.f35594z, "jrcloud")) {
            this.liveness_combination.add(BAT_LIVENESS);
            this.batLivenessThreshold = 0.5f;
            this.stack_time = 1.0f;
            this.pose_gaussian = 1.0f;
            this.pose_rectwidth = 0.3f;
            this.pose_light = 0.0f;
            this.min_iod = 0.0f;
            this.max_iod = 1.0f;
            this.quality_depth_min_quality = 0.5f;
            this.depth_cache_num = 2;
            this.secProtocol = "";
            return;
        }
        if (TextUtils.equals("jrcloud", "jrcloud")) {
            this.liveness_combination.add(NO_LIVENESS);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(fValueOf);
            this.threshold.put(NO_LIVENESS, arrayList2);
            return;
        }
        if (TextUtils.equals(a.f35593y, "jrcloud")) {
            this.liveness_combination.add(NO_LIVENESS);
            ArrayList arrayList3 = new ArrayList();
            arrayList3.add(fValueOf);
            this.threshold.put(NO_LIVENESS, arrayList3);
            return;
        }
        this.liveness_combination.add(NO_LIVENESS);
        ArrayList arrayList4 = new ArrayList();
        arrayList4.add(fValueOf);
        this.threshold.put(NO_LIVENESS, arrayList4);
    }

    public static ToygerFaceAlgorithmConfig from(String str) {
        ToygerFaceAlgorithmConfig toygerFaceAlgorithmConfig = (ToygerFaceAlgorithmConfig) JSON.parseObject(str, ToygerFaceAlgorithmConfig.class);
        if (toygerFaceAlgorithmConfig == null) {
            toygerFaceAlgorithmConfig = new ToygerFaceAlgorithmConfig();
            ToygerLog.i("TOYGER", "fail to parse algorithm config, load default config");
        }
        if (toygerFaceAlgorithmConfig.depth_cache_num == 0) {
            toygerFaceAlgorithmConfig.depth_cache_num = 2;
        }
        if (toygerFaceAlgorithmConfig.quality_depth_min_quality == 0.0f) {
            toygerFaceAlgorithmConfig.quality_depth_min_quality = 0.5f;
        }
        return toygerFaceAlgorithmConfig;
    }

    public ToygerConfig toToygerConfig() {
        ToygerQualityConfig toygerQualityConfig = new ToygerQualityConfig(this.pose_light, this.pose_rectwidth, this.pose_integrity, this.pose_pitch, this.pose_yaw, this.pose_gaussian, this.pose_motion, this.quality_min_quality, this.stack_time, this.min_iod, this.max_iod, this.blink_openness, this.eye_openness, this.eyeOcclusion, this.pose_pitchMin, this.pose_yawMin, this.quality_depth_min_quality, this.depth_cache_num);
        String strConcat = "";
        if (this.liveness_combination != null) {
            for (int i10 = 0; i10 < this.liveness_combination.size(); i10++) {
                strConcat = strConcat.length() > 0 ? strConcat.concat("#").concat(this.liveness_combination.get(i10)) : this.liveness_combination.get(i10);
            }
        }
        ToygerLivenessConfig toygerLivenessConfig = new ToygerLivenessConfig(strConcat, this.batLivenessThreshold, this.dragonflyMin, this.dragonflyMax, this.geminiMin, this.geminiMax, false);
        ToygerConfig toygerConfig = new ToygerConfig();
        toygerConfig.qualityConfig = toygerQualityConfig;
        toygerConfig.livenessConfig = toygerLivenessConfig;
        ToygerCameraConfig toygerCameraConfig = new ToygerCameraConfig();
        toygerConfig.cameraConfig = toygerCameraConfig;
        toygerCameraConfig.isMirror = this.isMirror;
        return toygerConfig;
    }
}
