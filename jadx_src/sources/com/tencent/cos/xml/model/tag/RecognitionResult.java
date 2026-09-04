package com.tencent.cos.xml.model.tag;

import com.tencent.qcloud.qcloudxml.annoation.XmlBean;
import com.tencent.qcloud.qcloudxml.annoation.XmlElement;

/* JADX INFO: loaded from: classes4.dex */
@XmlBean(name = "RecognitionResult")
public class RecognitionResult {

    @XmlElement(name = "AdsInfo")
    public AdsInfo adsInfo;

    @XmlElement(name = "PoliticsInfo")
    public PoliticsInfo politicsInfo;

    @XmlElement(name = "PornInfo")
    public PornInfo pornInfo;

    @XmlElement(name = "TerroristInfo")
    public TerroristInfo terroristInfo;

    @XmlBean(name = "AdsInfo")
    public static class AdsInfo {

        @XmlElement(name = "Code")
        public int code;

        @XmlElement(name = "HitFlag")
        public int hitFlag;

        @XmlElement(name = "Label")
        public String label;

        @XmlElement(name = "Msg")
        public String msg;

        @XmlElement(name = "Score")
        public int score;
    }

    @XmlBean(name = "PoliticsInfo")
    public static class PoliticsInfo {

        @XmlElement(name = "Code")
        public int code;

        @XmlElement(name = "HitFlag")
        public int hitFlag;

        @XmlElement(name = "Label")
        public String label;

        @XmlElement(name = "Msg")
        public String msg;

        @XmlElement(name = "Score")
        public int score;
    }

    @XmlBean(name = "PornInfo")
    public static class PornInfo {

        @XmlElement(name = "Code")
        public int code;

        @XmlElement(name = "HitFlag")
        public int hitFlag;

        @XmlElement(name = "Label")
        public String label;

        @XmlElement(name = "Msg")
        public String msg;

        @XmlElement(name = "Score")
        public int score;
    }

    @XmlBean(name = "TerroristInfo")
    public static class TerroristInfo {

        @XmlElement(name = "Code")
        public int code;

        @XmlElement(name = "HitFlag")
        public int hitFlag;

        @XmlElement(name = "Label")
        public String label;

        @XmlElement(name = "Msg")
        public String msg;

        @XmlElement(name = "Score")
        public int score;
    }
}
