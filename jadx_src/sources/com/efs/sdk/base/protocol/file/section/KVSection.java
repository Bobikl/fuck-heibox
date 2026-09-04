package com.efs.sdk.base.protocol.file.section;

import com.efs.sdk.base.protocol.ILogProtocol;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class KVSection extends AbsSection {
    private Map<String, Object> dataMap;

    public KVSection(String str) {
        super("kv");
        this.dataMap = new HashMap();
        this.name = str;
        this.sep = AbsSection.SEP_LINE_BREAK;
    }

    @Override // com.efs.sdk.base.protocol.file.section.AbsSection
    public String changeToStr() {
        StringBuilder sb2 = new StringBuilder(getDeclarationLine());
        sb2.append("\n");
        for (Map.Entry<String, Object> entry : this.dataMap.entrySet()) {
            sb2.append(entry.getKey());
            sb2.append(":");
            sb2.append(entry.getValue());
            sb2.append("\n");
        }
        return sb2.toString();
    }

    public Map<String, Object> getDataMap() {
        return this.dataMap;
    }

    public KVSection put(String str, Object obj) {
        this.dataMap.put(str, String.valueOf(obj));
        return this;
    }

    public KVSection putMap(Map<String, Object> map) {
        this.dataMap.putAll(map);
        return this;
    }

    public KVSection putNum(String str, long j10) {
        this.dataMap.put(ILogProtocol.KEY_PREFIX_NUM.concat(String.valueOf(str)), Long.valueOf(j10));
        return this;
    }

    public KVSection putString(String str, String str2) {
        this.dataMap.put(ILogProtocol.KEY_PREFIX_STRING.concat(String.valueOf(str)), str2);
        return this;
    }

    public KVSection putTimestamp(String str, long j10) {
        this.dataMap.put(ILogProtocol.KEY_PREFIX_TIMESTAMP.concat(String.valueOf(str)), Long.valueOf(j10));
        return this;
    }
}
