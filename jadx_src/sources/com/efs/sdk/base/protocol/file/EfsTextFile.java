package com.efs.sdk.base.protocol.file;

import android.text.TextUtils;
import com.efs.sdk.base.Constants;
import com.efs.sdk.base.core.config.GlobalInfo;
import com.efs.sdk.base.core.controller.ControllerCenter;
import com.efs.sdk.base.core.util.Log;
import com.efs.sdk.base.protocol.file.section.AbsSection;
import com.efs.sdk.base.protocol.file.section.JSONSection;
import com.efs.sdk.base.protocol.file.section.KVSection;
import com.efs.sdk.base.protocol.file.section.TextSection;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class EfsTextFile extends AbsFileLog {
    private static final String FILE_START = "*** *** *** *** *** *** *** *** *** *** *** *** *** *** *** ***";
    private static final String SECTION_START = "--- --- --- --- --- --- --- --- --- --- --- --- --- --- --- ---";
    private boolean mHasInitLinkInfo;
    private String mLinkID;
    private String mLinkKey;
    private List<AbsSection> sectionList;

    public EfsTextFile(String str) {
        super(str);
        this.sectionList = new ArrayList();
        this.mLinkKey = null;
        this.mLinkID = null;
        this.mHasInitLinkInfo = false;
    }

    private String changeToStr() {
        StringBuilder sb2 = new StringBuilder(FILE_START);
        sb2.append("\n");
        int i10 = 0;
        for (AbsSection absSection : this.sectionList) {
            if (i10 > 0) {
                sb2.append("--- --- --- --- --- --- --- --- --- --- --- --- --- --- --- ---\n");
            }
            sb2.append(absSection.changeToStr());
            i10++;
        }
        return sb2.toString();
    }

    private void initLinkInfo() {
        if ((TextUtils.isEmpty(this.mLinkID) || TextUtils.isEmpty(this.mLinkKey)) && !this.mHasInitLinkInfo) {
            for (AbsSection absSection : this.sectionList) {
                if (absSection instanceof KVSection) {
                    Map<String, Object> dataMap = ((KVSection) absSection).getDataMap();
                    if (TextUtils.isEmpty(this.mLinkID) && dataMap.containsKey(Constants.LOG_KEY_LINK_ID)) {
                        this.mLinkID = String.valueOf(dataMap.get(Constants.LOG_KEY_LINK_ID));
                    }
                    if (TextUtils.isEmpty(this.mLinkKey) && dataMap.containsKey(Constants.LOG_KEY_LINK_KEY)) {
                        this.mLinkKey = String.valueOf(dataMap.get(Constants.LOG_KEY_LINK_KEY));
                    }
                }
            }
            this.mHasInitLinkInfo = true;
        }
    }

    private void insertCustomInfoSection() {
        KVSection kVSection = new KVSection("custom_info");
        for (Map.Entry<String, String> entry : ControllerCenter.getGlobalEnvStruct().getPublicParamMap().entrySet()) {
            kVSection.put(entry.getKey(), entry.getValue());
        }
        this.sectionList.add(0, kVSection);
    }

    public JSONSection createAndAddJSONSection(String str) {
        JSONSection jSONSection = new JSONSection(str);
        this.sectionList.add(jSONSection);
        return jSONSection;
    }

    public KVSection createAndAddKVSection(String str) {
        KVSection kVSection = new KVSection(str);
        this.sectionList.add(kVSection);
        return kVSection;
    }

    public TextSection createAndAddTextSection(String str) {
        TextSection textSection = new TextSection(str);
        this.sectionList.add(textSection);
        return textSection;
    }

    @Override // com.efs.sdk.base.protocol.ILogProtocol
    public byte[] generate() {
        String strChangeToStr = changeToStr();
        if (ControllerCenter.getGlobalEnvStruct().isPrintLogDetail()) {
            Log.i("efs.base", strChangeToStr);
        }
        return strChangeToStr.getBytes();
    }

    @Override // com.efs.sdk.base.protocol.ILogProtocol
    public String generateString() {
        return changeToStr();
    }

    @Override // com.efs.sdk.base.protocol.ILogProtocol
    public String getLinkId() {
        initLinkInfo();
        return this.mLinkID;
    }

    @Override // com.efs.sdk.base.protocol.ILogProtocol
    public String getLinkKey() {
        initLinkInfo();
        return this.mLinkKey;
    }

    @Override // com.efs.sdk.base.protocol.ILogProtocol
    public void insertGlobal(GlobalInfo globalInfo) {
        insertCustomInfoSection();
        this.sectionList.addAll(0, globalInfo.getGlobalSectionList(getLogType()));
    }
}
