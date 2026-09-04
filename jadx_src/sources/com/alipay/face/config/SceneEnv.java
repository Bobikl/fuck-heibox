package com.alipay.face.config;

/* JADX INFO: loaded from: classes6.dex */
public class SceneEnv {
    private String sceneCode = "";
    private String sceneType = "normal";

    public String getSceneCode() {
        return this.sceneCode;
    }

    public String getSceneType() {
        return this.sceneType;
    }

    public void setSceneCode(String str) {
        this.sceneCode = str;
    }

    public void setSceneType(String str) {
        this.sceneType = str;
    }

    public String toString() {
        return "SceneEnv{sceneCode='" + this.sceneCode + "', sceneType='" + this.sceneType + "'}";
    }
}
