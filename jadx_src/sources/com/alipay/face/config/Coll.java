package com.alipay.face.config;

import java.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
public class Coll {
    private int retry = 3;
    private float minangle = -0.6f;
    private float maxangle = 0.6f;
    private float near = 0.5f;
    private float far = 0.28f;
    private int minlight = 50;
    private int time = 20;
    private int light = 178;
    private int imageIndex = 1;
    private int mineDscore = 1;
    private int mineVideo = 5;
    private String topText = "";
    private String bottomText = "";
    private String topText_noface = "";
    private String topText_light = "";
    private String topText_rectwidth = "";
    private String topText_integrity = "";
    private String topText_angle = "";
    private String topText_blur = "";
    private String topText_quality = "";
    private String topText_blink = "";
    private String topText_stay = "";
    private String topText_max_rectwidth = "";
    private int uploadMonitorPic = 0;
    private boolean uploadLivePic = false;
    private boolean progressbar = false;
    private boolean uploadBestPic = true;
    private boolean uploadPoseOkPic = false;
    private boolean uploadBigPic = true;
    private boolean uploadDepthData = false;
    private boolean authorization = false;
    private String[] actionMode = {"7"};
    private boolean asyncUp = true;
    private boolean encUp = true;

    public String[] getActionMode() {
        return this.actionMode;
    }

    public String getBottomText() {
        return this.bottomText;
    }

    public float getFar() {
        return this.far;
    }

    public int getImageIndex() {
        return this.imageIndex;
    }

    public int getLight() {
        return this.light;
    }

    public float getMaxangle() {
        return this.maxangle;
    }

    public float getMinangle() {
        return this.minangle;
    }

    public int getMineDscore() {
        return this.mineDscore;
    }

    public int getMineVideo() {
        return this.mineVideo;
    }

    public int getMinlight() {
        return this.minlight;
    }

    public float getNear() {
        return this.near;
    }

    public int getRetry() {
        return this.retry;
    }

    public int getTime() {
        return this.time;
    }

    public String getTopText() {
        return this.topText;
    }

    public String getTopText_angle() {
        return this.topText_angle;
    }

    public String getTopText_blink() {
        return this.topText_blink;
    }

    public String getTopText_blur() {
        return this.topText_blur;
    }

    public String getTopText_integrity() {
        return this.topText_integrity;
    }

    public String getTopText_light() {
        return this.topText_light;
    }

    public String getTopText_max_rectwidth() {
        return this.topText_max_rectwidth;
    }

    public String getTopText_noface() {
        return this.topText_noface;
    }

    public String getTopText_quality() {
        return this.topText_quality;
    }

    public String getTopText_rectwidth() {
        return this.topText_rectwidth;
    }

    public String getTopText_stay() {
        return this.topText_stay;
    }

    public int getUploadMonitorPic() {
        return this.uploadMonitorPic;
    }

    public boolean isAsyncUp() {
        return this.asyncUp;
    }

    public boolean isAuthorization() {
        return this.authorization;
    }

    public boolean isEncUp() {
        return this.encUp;
    }

    public boolean isProgressbar() {
        return this.progressbar;
    }

    public boolean isUploadBestPic() {
        return this.uploadBestPic;
    }

    public boolean isUploadBigPic() {
        return this.uploadBigPic;
    }

    public boolean isUploadDepthData() {
        return this.uploadDepthData;
    }

    public boolean isUploadLivePic() {
        return this.uploadLivePic;
    }

    public boolean isUploadPoseOkPic() {
        return this.uploadPoseOkPic;
    }

    public void setActionMode(String[] strArr) {
        this.actionMode = strArr;
    }

    public void setAsyncUp(boolean z10) {
        this.asyncUp = z10;
    }

    public void setAuthorization(boolean z10) {
        this.authorization = z10;
    }

    public void setBottomText(String str) {
        this.bottomText = str;
    }

    public void setEncUp(boolean z10) {
        this.encUp = z10;
    }

    public void setFar(float f10) {
        this.far = f10;
    }

    public void setImageIndex(int i10) {
        this.imageIndex = i10;
    }

    public void setLight(int i10) {
        this.light = i10;
    }

    public void setMaxangle(float f10) {
        this.maxangle = f10;
    }

    public void setMinangle(float f10) {
        this.minangle = f10;
    }

    public void setMineDscore(int i10) {
        this.mineDscore = i10;
    }

    public void setMineVideo(int i10) {
        this.mineVideo = i10;
    }

    public void setMinlight(int i10) {
        this.minlight = i10;
    }

    public void setNear(float f10) {
        this.near = f10;
    }

    public void setProgressbar(boolean z10) {
        this.progressbar = z10;
    }

    public void setRetry(int i10) {
        this.retry = i10;
    }

    public void setTime(int i10) {
        this.time = i10;
    }

    public void setTopText(String str) {
        this.topText = str;
    }

    public void setTopText_angle(String str) {
        this.topText_angle = str;
    }

    public void setTopText_blink(String str) {
        this.topText_blink = str;
    }

    public void setTopText_blur(String str) {
        this.topText_blur = str;
    }

    public void setTopText_integrity(String str) {
        this.topText_integrity = str;
    }

    public void setTopText_light(String str) {
        this.topText_light = str;
    }

    public void setTopText_max_rectwidth(String str) {
        this.topText_max_rectwidth = str;
    }

    public void setTopText_noface(String str) {
        this.topText_noface = str;
    }

    public void setTopText_quality(String str) {
        this.topText_quality = str;
    }

    public void setTopText_rectwidth(String str) {
        this.topText_rectwidth = str;
    }

    public void setTopText_stay(String str) {
        this.topText_stay = str;
    }

    public void setUploadBestPic(boolean z10) {
        this.uploadBestPic = z10;
    }

    public void setUploadBigPic(boolean z10) {
        this.uploadBigPic = z10;
    }

    public void setUploadDepthData(boolean z10) {
        this.uploadDepthData = z10;
    }

    public void setUploadLivePic(boolean z10) {
        this.uploadLivePic = z10;
    }

    public void setUploadMonitorPic(int i10) {
        this.uploadMonitorPic = i10;
    }

    public void setUploadPoseOkPic(boolean z10) {
        this.uploadPoseOkPic = z10;
    }

    public String toString() {
        return "Coll{retry=" + this.retry + ", minangle=" + this.minangle + ", maxangle=" + this.maxangle + ", near=" + this.near + ", far=" + this.far + ", minlight=" + this.minlight + ", time=" + this.time + ", light=" + this.light + ", imageIndex=" + this.imageIndex + ", mineDscore=" + this.mineDscore + ", mineVideo=" + this.mineVideo + ", topText='" + this.topText + "', bottomText='" + this.bottomText + "', topText_noface='" + this.topText_noface + "', topText_light='" + this.topText_light + "', topText_rectwidth='" + this.topText_rectwidth + "', topText_integrity='" + this.topText_integrity + "', topText_angle='" + this.topText_angle + "', topText_blur='" + this.topText_blur + "', topText_quality='" + this.topText_quality + "', topText_blink='" + this.topText_blink + "', topText_stay='" + this.topText_stay + "', topText_max_rectwidth='" + this.topText_max_rectwidth + "', uploadMonitorPic=" + this.uploadMonitorPic + ", uploadLivePic=" + this.uploadLivePic + ", progressbar=" + this.progressbar + ", uploadBestPic=" + this.uploadBestPic + ", uploadPoseOkPic=" + this.uploadPoseOkPic + ", uploadBigPic=" + this.uploadBigPic + ", uploadDepthData=" + this.uploadDepthData + ", actionMode=" + Arrays.toString(this.actionMode) + ", asyncUp=" + this.asyncUp + ", encUp=" + this.encUp + '}';
    }
}
