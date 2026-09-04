package com.alipay.face.config;

import bb.c;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public class AndroidClientConfig {
    private JSONObject algorithm;
    private JSONObject upload;
    private SceneEnv sceneEnv = new SceneEnv();
    private NavigatePage navi = new NavigatePage();
    private Coll coll = new Coll();
    private FaceTips faceTips = new FaceTips();
    private ArrayList<SDKAction> sdkActionList = new ArrayList<>();
    private DeviceSetting[] deviceSettings = new DeviceSetting[0];
    private int env = 0;

    /* JADX INFO: renamed from: ui, reason: collision with root package name */
    private int f38704ui = c.b.f30591dg;
    private String verifyMode = "normal";

    public JSONObject getAlgorithm() {
        return this.algorithm;
    }

    public Coll getColl() {
        return this.coll;
    }

    public DeviceSetting[] getDeviceSettings() {
        return this.deviceSettings;
    }

    public int getEnv() {
        return this.env;
    }

    public FaceTips getFaceTips() {
        return this.faceTips;
    }

    public NavigatePage getNavi() {
        return this.navi;
    }

    public Upload getPhotinusCfg() {
        JSONObject jSONObject = this.upload;
        if (jSONObject == null) {
            return null;
        }
        return (Upload) JSON.toJavaObject(jSONObject, Upload.class);
    }

    public SceneEnv getSceneEnv() {
        return this.sceneEnv;
    }

    public ArrayList<SDKAction> getSdkActionList() {
        return this.sdkActionList;
    }

    public int getUi() {
        return this.f38704ui;
    }

    public JSONObject getUpload() {
        return this.upload;
    }

    public String getVerifyMode() {
        return this.verifyMode;
    }

    public void setAlgorithm(JSONObject jSONObject) {
        this.algorithm = jSONObject;
    }

    public void setColl(Coll coll) {
        this.coll = coll;
    }

    public void setDeviceSettings(DeviceSetting[] deviceSettingArr) {
        this.deviceSettings = deviceSettingArr;
    }

    public void setEnv(int i10) {
        this.env = i10;
    }

    public void setFaceTips(FaceTips faceTips) {
        this.faceTips = faceTips;
    }

    public void setNavi(NavigatePage navigatePage) {
        this.navi = navigatePage;
    }

    public void setSceneEnv(SceneEnv sceneEnv) {
        this.sceneEnv = sceneEnv;
    }

    public void setSdkActionList(ArrayList<SDKAction> arrayList) {
        this.sdkActionList = arrayList;
    }

    public void setUi(int i10) {
        this.f38704ui = i10;
    }

    public void setUpload(JSONObject jSONObject) {
        this.upload = jSONObject;
    }

    public void setVerifyMode(String str) {
        this.verifyMode = str;
    }
}
