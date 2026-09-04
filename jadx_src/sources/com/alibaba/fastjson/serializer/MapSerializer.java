package com.alibaba.fastjson.serializer;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes6.dex */
public class MapSerializer extends SerializeFilterable implements ObjectSerializer {
    public static MapSerializer instance = new MapSerializer();
    private static final int NON_STRINGKEY_AS_STRING = SerializerFeature.of(new SerializerFeature[]{SerializerFeature.BrowserCompatible, SerializerFeature.WriteNonStringKeyAsString, SerializerFeature.BrowserSecure});

    @Override // com.alibaba.fastjson.serializer.ObjectSerializer
    public void write(JSONSerializer jSONSerializer, Object obj, Object obj2, Type type, int i10) throws IOException {
        write(jSONSerializer, obj, obj2, type, i10, false);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0154 A[Catch: all -> 0x02fc, TryCatch #0 {all -> 0x02fc, blocks: (B:28:0x0052, B:29:0x0055, B:31:0x0061, B:42:0x0080, B:44:0x0091, B:45:0x00a1, B:47:0x00a7, B:49:0x00b9, B:52:0x00c1, B:55:0x00c6, B:57:0x00d0, B:59:0x00d4, B:62:0x00df, B:65:0x00ec, B:67:0x00f0, B:70:0x00f8, B:73:0x00fd, B:75:0x0107, B:77:0x010b, B:80:0x0116, B:83:0x0120, B:85:0x0124, B:88:0x012c, B:91:0x0131, B:93:0x013b, B:95:0x013f, B:98:0x014a, B:101:0x0154, B:103:0x0158, B:106:0x0160, B:109:0x0165, B:111:0x016f, B:113:0x0173, B:116:0x017f, B:119:0x018a, B:121:0x018e, B:124:0x0196, B:127:0x019b, B:129:0x01a5, B:131:0x01a9, B:132:0x01b2, B:133:0x01b8, B:135:0x01bc, B:138:0x01c4, B:141:0x01c9, B:143:0x01d3, B:145:0x01d7, B:146:0x01e0, B:149:0x01e9, B:152:0x01ee, B:154:0x01f2, B:160:0x01fc, B:165:0x0235, B:168:0x0242, B:170:0x0248, B:172:0x024d, B:173:0x0250, B:175:0x0258, B:176:0x025b, B:187:0x0282, B:189:0x028c, B:191:0x0294, B:193:0x029d, B:195:0x02a7, B:197:0x02ab, B:199:0x02af, B:201:0x02ba, B:203:0x02c0, B:204:0x02ce, B:178:0x0261, B:179:0x0264, B:181:0x026c, B:183:0x0270, B:185:0x027b, B:184:0x0278, B:162:0x021d, B:37:0x0075), top: B:218:0x0052 }] */
    /* JADX WARN: Code duplicated, block: B:103:0x0158 A[Catch: all -> 0x02fc, TryCatch #0 {all -> 0x02fc, blocks: (B:28:0x0052, B:29:0x0055, B:31:0x0061, B:42:0x0080, B:44:0x0091, B:45:0x00a1, B:47:0x00a7, B:49:0x00b9, B:52:0x00c1, B:55:0x00c6, B:57:0x00d0, B:59:0x00d4, B:62:0x00df, B:65:0x00ec, B:67:0x00f0, B:70:0x00f8, B:73:0x00fd, B:75:0x0107, B:77:0x010b, B:80:0x0116, B:83:0x0120, B:85:0x0124, B:88:0x012c, B:91:0x0131, B:93:0x013b, B:95:0x013f, B:98:0x014a, B:101:0x0154, B:103:0x0158, B:106:0x0160, B:109:0x0165, B:111:0x016f, B:113:0x0173, B:116:0x017f, B:119:0x018a, B:121:0x018e, B:124:0x0196, B:127:0x019b, B:129:0x01a5, B:131:0x01a9, B:132:0x01b2, B:133:0x01b8, B:135:0x01bc, B:138:0x01c4, B:141:0x01c9, B:143:0x01d3, B:145:0x01d7, B:146:0x01e0, B:149:0x01e9, B:152:0x01ee, B:154:0x01f2, B:160:0x01fc, B:165:0x0235, B:168:0x0242, B:170:0x0248, B:172:0x024d, B:173:0x0250, B:175:0x0258, B:176:0x025b, B:187:0x0282, B:189:0x028c, B:191:0x0294, B:193:0x029d, B:195:0x02a7, B:197:0x02ab, B:199:0x02af, B:201:0x02ba, B:203:0x02c0, B:204:0x02ce, B:178:0x0261, B:179:0x0264, B:181:0x026c, B:183:0x0270, B:185:0x027b, B:184:0x0278, B:162:0x021d, B:37:0x0075), top: B:218:0x0052 }] */
    /* JADX WARN: Code duplicated, block: B:106:0x0160 A[Catch: all -> 0x02fc, TryCatch #0 {all -> 0x02fc, blocks: (B:28:0x0052, B:29:0x0055, B:31:0x0061, B:42:0x0080, B:44:0x0091, B:45:0x00a1, B:47:0x00a7, B:49:0x00b9, B:52:0x00c1, B:55:0x00c6, B:57:0x00d0, B:59:0x00d4, B:62:0x00df, B:65:0x00ec, B:67:0x00f0, B:70:0x00f8, B:73:0x00fd, B:75:0x0107, B:77:0x010b, B:80:0x0116, B:83:0x0120, B:85:0x0124, B:88:0x012c, B:91:0x0131, B:93:0x013b, B:95:0x013f, B:98:0x014a, B:101:0x0154, B:103:0x0158, B:106:0x0160, B:109:0x0165, B:111:0x016f, B:113:0x0173, B:116:0x017f, B:119:0x018a, B:121:0x018e, B:124:0x0196, B:127:0x019b, B:129:0x01a5, B:131:0x01a9, B:132:0x01b2, B:133:0x01b8, B:135:0x01bc, B:138:0x01c4, B:141:0x01c9, B:143:0x01d3, B:145:0x01d7, B:146:0x01e0, B:149:0x01e9, B:152:0x01ee, B:154:0x01f2, B:160:0x01fc, B:165:0x0235, B:168:0x0242, B:170:0x0248, B:172:0x024d, B:173:0x0250, B:175:0x0258, B:176:0x025b, B:187:0x0282, B:189:0x028c, B:191:0x0294, B:193:0x029d, B:195:0x02a7, B:197:0x02ab, B:199:0x02af, B:201:0x02ba, B:203:0x02c0, B:204:0x02ce, B:178:0x0261, B:179:0x0264, B:181:0x026c, B:183:0x0270, B:185:0x027b, B:184:0x0278, B:162:0x021d, B:37:0x0075), top: B:218:0x0052 }] */
    /* JADX WARN: Code duplicated, block: B:116:0x017f A[Catch: all -> 0x02fc, TryCatch #0 {all -> 0x02fc, blocks: (B:28:0x0052, B:29:0x0055, B:31:0x0061, B:42:0x0080, B:44:0x0091, B:45:0x00a1, B:47:0x00a7, B:49:0x00b9, B:52:0x00c1, B:55:0x00c6, B:57:0x00d0, B:59:0x00d4, B:62:0x00df, B:65:0x00ec, B:67:0x00f0, B:70:0x00f8, B:73:0x00fd, B:75:0x0107, B:77:0x010b, B:80:0x0116, B:83:0x0120, B:85:0x0124, B:88:0x012c, B:91:0x0131, B:93:0x013b, B:95:0x013f, B:98:0x014a, B:101:0x0154, B:103:0x0158, B:106:0x0160, B:109:0x0165, B:111:0x016f, B:113:0x0173, B:116:0x017f, B:119:0x018a, B:121:0x018e, B:124:0x0196, B:127:0x019b, B:129:0x01a5, B:131:0x01a9, B:132:0x01b2, B:133:0x01b8, B:135:0x01bc, B:138:0x01c4, B:141:0x01c9, B:143:0x01d3, B:145:0x01d7, B:146:0x01e0, B:149:0x01e9, B:152:0x01ee, B:154:0x01f2, B:160:0x01fc, B:165:0x0235, B:168:0x0242, B:170:0x0248, B:172:0x024d, B:173:0x0250, B:175:0x0258, B:176:0x025b, B:187:0x0282, B:189:0x028c, B:191:0x0294, B:193:0x029d, B:195:0x02a7, B:197:0x02ab, B:199:0x02af, B:201:0x02ba, B:203:0x02c0, B:204:0x02ce, B:178:0x0261, B:179:0x0264, B:181:0x026c, B:183:0x0270, B:185:0x027b, B:184:0x0278, B:162:0x021d, B:37:0x0075), top: B:218:0x0052 }] */
    /* JADX WARN: Code duplicated, block: B:11:0x0022 A[PHI: r1
  0x0022: PHI (r1v64 java.util.Map<java.lang.String, java.lang.Object>) = 
  (r1v2 java.util.Map<java.lang.String, java.lang.Object>)
  (r1v2 java.util.Map<java.lang.String, java.lang.Object>)
  (r1v2 java.util.Map<java.lang.String, java.lang.Object>)
  (r1v1 java.util.Map<java.lang.String, java.lang.Object>)
 binds: [B:16:0x0030, B:18:0x0034, B:217:0x0022, B:9:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:121:0x018e A[Catch: all -> 0x02fc, TryCatch #0 {all -> 0x02fc, blocks: (B:28:0x0052, B:29:0x0055, B:31:0x0061, B:42:0x0080, B:44:0x0091, B:45:0x00a1, B:47:0x00a7, B:49:0x00b9, B:52:0x00c1, B:55:0x00c6, B:57:0x00d0, B:59:0x00d4, B:62:0x00df, B:65:0x00ec, B:67:0x00f0, B:70:0x00f8, B:73:0x00fd, B:75:0x0107, B:77:0x010b, B:80:0x0116, B:83:0x0120, B:85:0x0124, B:88:0x012c, B:91:0x0131, B:93:0x013b, B:95:0x013f, B:98:0x014a, B:101:0x0154, B:103:0x0158, B:106:0x0160, B:109:0x0165, B:111:0x016f, B:113:0x0173, B:116:0x017f, B:119:0x018a, B:121:0x018e, B:124:0x0196, B:127:0x019b, B:129:0x01a5, B:131:0x01a9, B:132:0x01b2, B:133:0x01b8, B:135:0x01bc, B:138:0x01c4, B:141:0x01c9, B:143:0x01d3, B:145:0x01d7, B:146:0x01e0, B:149:0x01e9, B:152:0x01ee, B:154:0x01f2, B:160:0x01fc, B:165:0x0235, B:168:0x0242, B:170:0x0248, B:172:0x024d, B:173:0x0250, B:175:0x0258, B:176:0x025b, B:187:0x0282, B:189:0x028c, B:191:0x0294, B:193:0x029d, B:195:0x02a7, B:197:0x02ab, B:199:0x02af, B:201:0x02ba, B:203:0x02c0, B:204:0x02ce, B:178:0x0261, B:179:0x0264, B:181:0x026c, B:183:0x0270, B:185:0x027b, B:184:0x0278, B:162:0x021d, B:37:0x0075), top: B:218:0x0052 }] */
    /* JADX WARN: Code duplicated, block: B:124:0x0196 A[Catch: all -> 0x02fc, TryCatch #0 {all -> 0x02fc, blocks: (B:28:0x0052, B:29:0x0055, B:31:0x0061, B:42:0x0080, B:44:0x0091, B:45:0x00a1, B:47:0x00a7, B:49:0x00b9, B:52:0x00c1, B:55:0x00c6, B:57:0x00d0, B:59:0x00d4, B:62:0x00df, B:65:0x00ec, B:67:0x00f0, B:70:0x00f8, B:73:0x00fd, B:75:0x0107, B:77:0x010b, B:80:0x0116, B:83:0x0120, B:85:0x0124, B:88:0x012c, B:91:0x0131, B:93:0x013b, B:95:0x013f, B:98:0x014a, B:101:0x0154, B:103:0x0158, B:106:0x0160, B:109:0x0165, B:111:0x016f, B:113:0x0173, B:116:0x017f, B:119:0x018a, B:121:0x018e, B:124:0x0196, B:127:0x019b, B:129:0x01a5, B:131:0x01a9, B:132:0x01b2, B:133:0x01b8, B:135:0x01bc, B:138:0x01c4, B:141:0x01c9, B:143:0x01d3, B:145:0x01d7, B:146:0x01e0, B:149:0x01e9, B:152:0x01ee, B:154:0x01f2, B:160:0x01fc, B:165:0x0235, B:168:0x0242, B:170:0x0248, B:172:0x024d, B:173:0x0250, B:175:0x0258, B:176:0x025b, B:187:0x0282, B:189:0x028c, B:191:0x0294, B:193:0x029d, B:195:0x02a7, B:197:0x02ab, B:199:0x02af, B:201:0x02ba, B:203:0x02c0, B:204:0x02ce, B:178:0x0261, B:179:0x0264, B:181:0x026c, B:183:0x0270, B:185:0x027b, B:184:0x0278, B:162:0x021d, B:37:0x0075), top: B:218:0x0052 }] */
    /* JADX WARN: Code duplicated, block: B:132:0x01b2 A[Catch: all -> 0x02fc, TryCatch #0 {all -> 0x02fc, blocks: (B:28:0x0052, B:29:0x0055, B:31:0x0061, B:42:0x0080, B:44:0x0091, B:45:0x00a1, B:47:0x00a7, B:49:0x00b9, B:52:0x00c1, B:55:0x00c6, B:57:0x00d0, B:59:0x00d4, B:62:0x00df, B:65:0x00ec, B:67:0x00f0, B:70:0x00f8, B:73:0x00fd, B:75:0x0107, B:77:0x010b, B:80:0x0116, B:83:0x0120, B:85:0x0124, B:88:0x012c, B:91:0x0131, B:93:0x013b, B:95:0x013f, B:98:0x014a, B:101:0x0154, B:103:0x0158, B:106:0x0160, B:109:0x0165, B:111:0x016f, B:113:0x0173, B:116:0x017f, B:119:0x018a, B:121:0x018e, B:124:0x0196, B:127:0x019b, B:129:0x01a5, B:131:0x01a9, B:132:0x01b2, B:133:0x01b8, B:135:0x01bc, B:138:0x01c4, B:141:0x01c9, B:143:0x01d3, B:145:0x01d7, B:146:0x01e0, B:149:0x01e9, B:152:0x01ee, B:154:0x01f2, B:160:0x01fc, B:165:0x0235, B:168:0x0242, B:170:0x0248, B:172:0x024d, B:173:0x0250, B:175:0x0258, B:176:0x025b, B:187:0x0282, B:189:0x028c, B:191:0x0294, B:193:0x029d, B:195:0x02a7, B:197:0x02ab, B:199:0x02af, B:201:0x02ba, B:203:0x02c0, B:204:0x02ce, B:178:0x0261, B:179:0x0264, B:181:0x026c, B:183:0x0270, B:185:0x027b, B:184:0x0278, B:162:0x021d, B:37:0x0075), top: B:218:0x0052 }] */
    /* JADX WARN: Code duplicated, block: B:135:0x01bc A[Catch: all -> 0x02fc, TryCatch #0 {all -> 0x02fc, blocks: (B:28:0x0052, B:29:0x0055, B:31:0x0061, B:42:0x0080, B:44:0x0091, B:45:0x00a1, B:47:0x00a7, B:49:0x00b9, B:52:0x00c1, B:55:0x00c6, B:57:0x00d0, B:59:0x00d4, B:62:0x00df, B:65:0x00ec, B:67:0x00f0, B:70:0x00f8, B:73:0x00fd, B:75:0x0107, B:77:0x010b, B:80:0x0116, B:83:0x0120, B:85:0x0124, B:88:0x012c, B:91:0x0131, B:93:0x013b, B:95:0x013f, B:98:0x014a, B:101:0x0154, B:103:0x0158, B:106:0x0160, B:109:0x0165, B:111:0x016f, B:113:0x0173, B:116:0x017f, B:119:0x018a, B:121:0x018e, B:124:0x0196, B:127:0x019b, B:129:0x01a5, B:131:0x01a9, B:132:0x01b2, B:133:0x01b8, B:135:0x01bc, B:138:0x01c4, B:141:0x01c9, B:143:0x01d3, B:145:0x01d7, B:146:0x01e0, B:149:0x01e9, B:152:0x01ee, B:154:0x01f2, B:160:0x01fc, B:165:0x0235, B:168:0x0242, B:170:0x0248, B:172:0x024d, B:173:0x0250, B:175:0x0258, B:176:0x025b, B:187:0x0282, B:189:0x028c, B:191:0x0294, B:193:0x029d, B:195:0x02a7, B:197:0x02ab, B:199:0x02af, B:201:0x02ba, B:203:0x02c0, B:204:0x02ce, B:178:0x0261, B:179:0x0264, B:181:0x026c, B:183:0x0270, B:185:0x027b, B:184:0x0278, B:162:0x021d, B:37:0x0075), top: B:218:0x0052 }] */
    /* JADX WARN: Code duplicated, block: B:138:0x01c4 A[Catch: all -> 0x02fc, TryCatch #0 {all -> 0x02fc, blocks: (B:28:0x0052, B:29:0x0055, B:31:0x0061, B:42:0x0080, B:44:0x0091, B:45:0x00a1, B:47:0x00a7, B:49:0x00b9, B:52:0x00c1, B:55:0x00c6, B:57:0x00d0, B:59:0x00d4, B:62:0x00df, B:65:0x00ec, B:67:0x00f0, B:70:0x00f8, B:73:0x00fd, B:75:0x0107, B:77:0x010b, B:80:0x0116, B:83:0x0120, B:85:0x0124, B:88:0x012c, B:91:0x0131, B:93:0x013b, B:95:0x013f, B:98:0x014a, B:101:0x0154, B:103:0x0158, B:106:0x0160, B:109:0x0165, B:111:0x016f, B:113:0x0173, B:116:0x017f, B:119:0x018a, B:121:0x018e, B:124:0x0196, B:127:0x019b, B:129:0x01a5, B:131:0x01a9, B:132:0x01b2, B:133:0x01b8, B:135:0x01bc, B:138:0x01c4, B:141:0x01c9, B:143:0x01d3, B:145:0x01d7, B:146:0x01e0, B:149:0x01e9, B:152:0x01ee, B:154:0x01f2, B:160:0x01fc, B:165:0x0235, B:168:0x0242, B:170:0x0248, B:172:0x024d, B:173:0x0250, B:175:0x0258, B:176:0x025b, B:187:0x0282, B:189:0x028c, B:191:0x0294, B:193:0x029d, B:195:0x02a7, B:197:0x02ab, B:199:0x02af, B:201:0x02ba, B:203:0x02c0, B:204:0x02ce, B:178:0x0261, B:179:0x0264, B:181:0x026c, B:183:0x0270, B:185:0x027b, B:184:0x0278, B:162:0x021d, B:37:0x0075), top: B:218:0x0052 }] */
    /* JADX WARN: Code duplicated, block: B:146:0x01e0 A[Catch: all -> 0x02fc, TryCatch #0 {all -> 0x02fc, blocks: (B:28:0x0052, B:29:0x0055, B:31:0x0061, B:42:0x0080, B:44:0x0091, B:45:0x00a1, B:47:0x00a7, B:49:0x00b9, B:52:0x00c1, B:55:0x00c6, B:57:0x00d0, B:59:0x00d4, B:62:0x00df, B:65:0x00ec, B:67:0x00f0, B:70:0x00f8, B:73:0x00fd, B:75:0x0107, B:77:0x010b, B:80:0x0116, B:83:0x0120, B:85:0x0124, B:88:0x012c, B:91:0x0131, B:93:0x013b, B:95:0x013f, B:98:0x014a, B:101:0x0154, B:103:0x0158, B:106:0x0160, B:109:0x0165, B:111:0x016f, B:113:0x0173, B:116:0x017f, B:119:0x018a, B:121:0x018e, B:124:0x0196, B:127:0x019b, B:129:0x01a5, B:131:0x01a9, B:132:0x01b2, B:133:0x01b8, B:135:0x01bc, B:138:0x01c4, B:141:0x01c9, B:143:0x01d3, B:145:0x01d7, B:146:0x01e0, B:149:0x01e9, B:152:0x01ee, B:154:0x01f2, B:160:0x01fc, B:165:0x0235, B:168:0x0242, B:170:0x0248, B:172:0x024d, B:173:0x0250, B:175:0x0258, B:176:0x025b, B:187:0x0282, B:189:0x028c, B:191:0x0294, B:193:0x029d, B:195:0x02a7, B:197:0x02ab, B:199:0x02af, B:201:0x02ba, B:203:0x02c0, B:204:0x02ce, B:178:0x0261, B:179:0x0264, B:181:0x026c, B:183:0x0270, B:185:0x027b, B:184:0x0278, B:162:0x021d, B:37:0x0075), top: B:218:0x0052 }] */
    /* JADX WARN: Code duplicated, block: B:149:0x01e9 A[Catch: all -> 0x02fc, TryCatch #0 {all -> 0x02fc, blocks: (B:28:0x0052, B:29:0x0055, B:31:0x0061, B:42:0x0080, B:44:0x0091, B:45:0x00a1, B:47:0x00a7, B:49:0x00b9, B:52:0x00c1, B:55:0x00c6, B:57:0x00d0, B:59:0x00d4, B:62:0x00df, B:65:0x00ec, B:67:0x00f0, B:70:0x00f8, B:73:0x00fd, B:75:0x0107, B:77:0x010b, B:80:0x0116, B:83:0x0120, B:85:0x0124, B:88:0x012c, B:91:0x0131, B:93:0x013b, B:95:0x013f, B:98:0x014a, B:101:0x0154, B:103:0x0158, B:106:0x0160, B:109:0x0165, B:111:0x016f, B:113:0x0173, B:116:0x017f, B:119:0x018a, B:121:0x018e, B:124:0x0196, B:127:0x019b, B:129:0x01a5, B:131:0x01a9, B:132:0x01b2, B:133:0x01b8, B:135:0x01bc, B:138:0x01c4, B:141:0x01c9, B:143:0x01d3, B:145:0x01d7, B:146:0x01e0, B:149:0x01e9, B:152:0x01ee, B:154:0x01f2, B:160:0x01fc, B:165:0x0235, B:168:0x0242, B:170:0x0248, B:172:0x024d, B:173:0x0250, B:175:0x0258, B:176:0x025b, B:187:0x0282, B:189:0x028c, B:191:0x0294, B:193:0x029d, B:195:0x02a7, B:197:0x02ab, B:199:0x02af, B:201:0x02ba, B:203:0x02c0, B:204:0x02ce, B:178:0x0261, B:179:0x0264, B:181:0x026c, B:183:0x0270, B:185:0x027b, B:184:0x0278, B:162:0x021d, B:37:0x0075), top: B:218:0x0052 }] */
    /* JADX WARN: Code duplicated, block: B:162:0x021d A[Catch: all -> 0x02fc, TryCatch #0 {all -> 0x02fc, blocks: (B:28:0x0052, B:29:0x0055, B:31:0x0061, B:42:0x0080, B:44:0x0091, B:45:0x00a1, B:47:0x00a7, B:49:0x00b9, B:52:0x00c1, B:55:0x00c6, B:57:0x00d0, B:59:0x00d4, B:62:0x00df, B:65:0x00ec, B:67:0x00f0, B:70:0x00f8, B:73:0x00fd, B:75:0x0107, B:77:0x010b, B:80:0x0116, B:83:0x0120, B:85:0x0124, B:88:0x012c, B:91:0x0131, B:93:0x013b, B:95:0x013f, B:98:0x014a, B:101:0x0154, B:103:0x0158, B:106:0x0160, B:109:0x0165, B:111:0x016f, B:113:0x0173, B:116:0x017f, B:119:0x018a, B:121:0x018e, B:124:0x0196, B:127:0x019b, B:129:0x01a5, B:131:0x01a9, B:132:0x01b2, B:133:0x01b8, B:135:0x01bc, B:138:0x01c4, B:141:0x01c9, B:143:0x01d3, B:145:0x01d7, B:146:0x01e0, B:149:0x01e9, B:152:0x01ee, B:154:0x01f2, B:160:0x01fc, B:165:0x0235, B:168:0x0242, B:170:0x0248, B:172:0x024d, B:173:0x0250, B:175:0x0258, B:176:0x025b, B:187:0x0282, B:189:0x028c, B:191:0x0294, B:193:0x029d, B:195:0x02a7, B:197:0x02ab, B:199:0x02af, B:201:0x02ba, B:203:0x02c0, B:204:0x02ce, B:178:0x0261, B:179:0x0264, B:181:0x026c, B:183:0x0270, B:185:0x027b, B:184:0x0278, B:162:0x021d, B:37:0x0075), top: B:218:0x0052 }] */
    /* JADX WARN: Code duplicated, block: B:165:0x0235 A[Catch: all -> 0x02fc, TryCatch #0 {all -> 0x02fc, blocks: (B:28:0x0052, B:29:0x0055, B:31:0x0061, B:42:0x0080, B:44:0x0091, B:45:0x00a1, B:47:0x00a7, B:49:0x00b9, B:52:0x00c1, B:55:0x00c6, B:57:0x00d0, B:59:0x00d4, B:62:0x00df, B:65:0x00ec, B:67:0x00f0, B:70:0x00f8, B:73:0x00fd, B:75:0x0107, B:77:0x010b, B:80:0x0116, B:83:0x0120, B:85:0x0124, B:88:0x012c, B:91:0x0131, B:93:0x013b, B:95:0x013f, B:98:0x014a, B:101:0x0154, B:103:0x0158, B:106:0x0160, B:109:0x0165, B:111:0x016f, B:113:0x0173, B:116:0x017f, B:119:0x018a, B:121:0x018e, B:124:0x0196, B:127:0x019b, B:129:0x01a5, B:131:0x01a9, B:132:0x01b2, B:133:0x01b8, B:135:0x01bc, B:138:0x01c4, B:141:0x01c9, B:143:0x01d3, B:145:0x01d7, B:146:0x01e0, B:149:0x01e9, B:152:0x01ee, B:154:0x01f2, B:160:0x01fc, B:165:0x0235, B:168:0x0242, B:170:0x0248, B:172:0x024d, B:173:0x0250, B:175:0x0258, B:176:0x025b, B:187:0x0282, B:189:0x028c, B:191:0x0294, B:193:0x029d, B:195:0x02a7, B:197:0x02ab, B:199:0x02af, B:201:0x02ba, B:203:0x02c0, B:204:0x02ce, B:178:0x0261, B:179:0x0264, B:181:0x026c, B:183:0x0270, B:185:0x027b, B:184:0x0278, B:162:0x021d, B:37:0x0075), top: B:218:0x0052 }] */
    /* JADX WARN: Code duplicated, block: B:170:0x0248 A[Catch: all -> 0x02fc, TryCatch #0 {all -> 0x02fc, blocks: (B:28:0x0052, B:29:0x0055, B:31:0x0061, B:42:0x0080, B:44:0x0091, B:45:0x00a1, B:47:0x00a7, B:49:0x00b9, B:52:0x00c1, B:55:0x00c6, B:57:0x00d0, B:59:0x00d4, B:62:0x00df, B:65:0x00ec, B:67:0x00f0, B:70:0x00f8, B:73:0x00fd, B:75:0x0107, B:77:0x010b, B:80:0x0116, B:83:0x0120, B:85:0x0124, B:88:0x012c, B:91:0x0131, B:93:0x013b, B:95:0x013f, B:98:0x014a, B:101:0x0154, B:103:0x0158, B:106:0x0160, B:109:0x0165, B:111:0x016f, B:113:0x0173, B:116:0x017f, B:119:0x018a, B:121:0x018e, B:124:0x0196, B:127:0x019b, B:129:0x01a5, B:131:0x01a9, B:132:0x01b2, B:133:0x01b8, B:135:0x01bc, B:138:0x01c4, B:141:0x01c9, B:143:0x01d3, B:145:0x01d7, B:146:0x01e0, B:149:0x01e9, B:152:0x01ee, B:154:0x01f2, B:160:0x01fc, B:165:0x0235, B:168:0x0242, B:170:0x0248, B:172:0x024d, B:173:0x0250, B:175:0x0258, B:176:0x025b, B:187:0x0282, B:189:0x028c, B:191:0x0294, B:193:0x029d, B:195:0x02a7, B:197:0x02ab, B:199:0x02af, B:201:0x02ba, B:203:0x02c0, B:204:0x02ce, B:178:0x0261, B:179:0x0264, B:181:0x026c, B:183:0x0270, B:185:0x027b, B:184:0x0278, B:162:0x021d, B:37:0x0075), top: B:218:0x0052 }] */
    /* JADX WARN: Code duplicated, block: B:172:0x024d A[Catch: all -> 0x02fc, TryCatch #0 {all -> 0x02fc, blocks: (B:28:0x0052, B:29:0x0055, B:31:0x0061, B:42:0x0080, B:44:0x0091, B:45:0x00a1, B:47:0x00a7, B:49:0x00b9, B:52:0x00c1, B:55:0x00c6, B:57:0x00d0, B:59:0x00d4, B:62:0x00df, B:65:0x00ec, B:67:0x00f0, B:70:0x00f8, B:73:0x00fd, B:75:0x0107, B:77:0x010b, B:80:0x0116, B:83:0x0120, B:85:0x0124, B:88:0x012c, B:91:0x0131, B:93:0x013b, B:95:0x013f, B:98:0x014a, B:101:0x0154, B:103:0x0158, B:106:0x0160, B:109:0x0165, B:111:0x016f, B:113:0x0173, B:116:0x017f, B:119:0x018a, B:121:0x018e, B:124:0x0196, B:127:0x019b, B:129:0x01a5, B:131:0x01a9, B:132:0x01b2, B:133:0x01b8, B:135:0x01bc, B:138:0x01c4, B:141:0x01c9, B:143:0x01d3, B:145:0x01d7, B:146:0x01e0, B:149:0x01e9, B:152:0x01ee, B:154:0x01f2, B:160:0x01fc, B:165:0x0235, B:168:0x0242, B:170:0x0248, B:172:0x024d, B:173:0x0250, B:175:0x0258, B:176:0x025b, B:187:0x0282, B:189:0x028c, B:191:0x0294, B:193:0x029d, B:195:0x02a7, B:197:0x02ab, B:199:0x02af, B:201:0x02ba, B:203:0x02c0, B:204:0x02ce, B:178:0x0261, B:179:0x0264, B:181:0x026c, B:183:0x0270, B:185:0x027b, B:184:0x0278, B:162:0x021d, B:37:0x0075), top: B:218:0x0052 }] */
    /* JADX WARN: Code duplicated, block: B:175:0x0258 A[Catch: all -> 0x02fc, TryCatch #0 {all -> 0x02fc, blocks: (B:28:0x0052, B:29:0x0055, B:31:0x0061, B:42:0x0080, B:44:0x0091, B:45:0x00a1, B:47:0x00a7, B:49:0x00b9, B:52:0x00c1, B:55:0x00c6, B:57:0x00d0, B:59:0x00d4, B:62:0x00df, B:65:0x00ec, B:67:0x00f0, B:70:0x00f8, B:73:0x00fd, B:75:0x0107, B:77:0x010b, B:80:0x0116, B:83:0x0120, B:85:0x0124, B:88:0x012c, B:91:0x0131, B:93:0x013b, B:95:0x013f, B:98:0x014a, B:101:0x0154, B:103:0x0158, B:106:0x0160, B:109:0x0165, B:111:0x016f, B:113:0x0173, B:116:0x017f, B:119:0x018a, B:121:0x018e, B:124:0x0196, B:127:0x019b, B:129:0x01a5, B:131:0x01a9, B:132:0x01b2, B:133:0x01b8, B:135:0x01bc, B:138:0x01c4, B:141:0x01c9, B:143:0x01d3, B:145:0x01d7, B:146:0x01e0, B:149:0x01e9, B:152:0x01ee, B:154:0x01f2, B:160:0x01fc, B:165:0x0235, B:168:0x0242, B:170:0x0248, B:172:0x024d, B:173:0x0250, B:175:0x0258, B:176:0x025b, B:187:0x0282, B:189:0x028c, B:191:0x0294, B:193:0x029d, B:195:0x02a7, B:197:0x02ab, B:199:0x02af, B:201:0x02ba, B:203:0x02c0, B:204:0x02ce, B:178:0x0261, B:179:0x0264, B:181:0x026c, B:183:0x0270, B:185:0x027b, B:184:0x0278, B:162:0x021d, B:37:0x0075), top: B:218:0x0052 }] */
    /* JADX WARN: Code duplicated, block: B:177:0x025f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:178:0x0261 A[Catch: all -> 0x02fc, TryCatch #0 {all -> 0x02fc, blocks: (B:28:0x0052, B:29:0x0055, B:31:0x0061, B:42:0x0080, B:44:0x0091, B:45:0x00a1, B:47:0x00a7, B:49:0x00b9, B:52:0x00c1, B:55:0x00c6, B:57:0x00d0, B:59:0x00d4, B:62:0x00df, B:65:0x00ec, B:67:0x00f0, B:70:0x00f8, B:73:0x00fd, B:75:0x0107, B:77:0x010b, B:80:0x0116, B:83:0x0120, B:85:0x0124, B:88:0x012c, B:91:0x0131, B:93:0x013b, B:95:0x013f, B:98:0x014a, B:101:0x0154, B:103:0x0158, B:106:0x0160, B:109:0x0165, B:111:0x016f, B:113:0x0173, B:116:0x017f, B:119:0x018a, B:121:0x018e, B:124:0x0196, B:127:0x019b, B:129:0x01a5, B:131:0x01a9, B:132:0x01b2, B:133:0x01b8, B:135:0x01bc, B:138:0x01c4, B:141:0x01c9, B:143:0x01d3, B:145:0x01d7, B:146:0x01e0, B:149:0x01e9, B:152:0x01ee, B:154:0x01f2, B:160:0x01fc, B:165:0x0235, B:168:0x0242, B:170:0x0248, B:172:0x024d, B:173:0x0250, B:175:0x0258, B:176:0x025b, B:187:0x0282, B:189:0x028c, B:191:0x0294, B:193:0x029d, B:195:0x02a7, B:197:0x02ab, B:199:0x02af, B:201:0x02ba, B:203:0x02c0, B:204:0x02ce, B:178:0x0261, B:179:0x0264, B:181:0x026c, B:183:0x0270, B:185:0x027b, B:184:0x0278, B:162:0x021d, B:37:0x0075), top: B:218:0x0052 }] */
    /* JADX WARN: Code duplicated, block: B:181:0x026c A[Catch: all -> 0x02fc, TryCatch #0 {all -> 0x02fc, blocks: (B:28:0x0052, B:29:0x0055, B:31:0x0061, B:42:0x0080, B:44:0x0091, B:45:0x00a1, B:47:0x00a7, B:49:0x00b9, B:52:0x00c1, B:55:0x00c6, B:57:0x00d0, B:59:0x00d4, B:62:0x00df, B:65:0x00ec, B:67:0x00f0, B:70:0x00f8, B:73:0x00fd, B:75:0x0107, B:77:0x010b, B:80:0x0116, B:83:0x0120, B:85:0x0124, B:88:0x012c, B:91:0x0131, B:93:0x013b, B:95:0x013f, B:98:0x014a, B:101:0x0154, B:103:0x0158, B:106:0x0160, B:109:0x0165, B:111:0x016f, B:113:0x0173, B:116:0x017f, B:119:0x018a, B:121:0x018e, B:124:0x0196, B:127:0x019b, B:129:0x01a5, B:131:0x01a9, B:132:0x01b2, B:133:0x01b8, B:135:0x01bc, B:138:0x01c4, B:141:0x01c9, B:143:0x01d3, B:145:0x01d7, B:146:0x01e0, B:149:0x01e9, B:152:0x01ee, B:154:0x01f2, B:160:0x01fc, B:165:0x0235, B:168:0x0242, B:170:0x0248, B:172:0x024d, B:173:0x0250, B:175:0x0258, B:176:0x025b, B:187:0x0282, B:189:0x028c, B:191:0x0294, B:193:0x029d, B:195:0x02a7, B:197:0x02ab, B:199:0x02af, B:201:0x02ba, B:203:0x02c0, B:204:0x02ce, B:178:0x0261, B:179:0x0264, B:181:0x026c, B:183:0x0270, B:185:0x027b, B:184:0x0278, B:162:0x021d, B:37:0x0075), top: B:218:0x0052 }] */
    /* JADX WARN: Code duplicated, block: B:184:0x0278 A[Catch: all -> 0x02fc, TryCatch #0 {all -> 0x02fc, blocks: (B:28:0x0052, B:29:0x0055, B:31:0x0061, B:42:0x0080, B:44:0x0091, B:45:0x00a1, B:47:0x00a7, B:49:0x00b9, B:52:0x00c1, B:55:0x00c6, B:57:0x00d0, B:59:0x00d4, B:62:0x00df, B:65:0x00ec, B:67:0x00f0, B:70:0x00f8, B:73:0x00fd, B:75:0x0107, B:77:0x010b, B:80:0x0116, B:83:0x0120, B:85:0x0124, B:88:0x012c, B:91:0x0131, B:93:0x013b, B:95:0x013f, B:98:0x014a, B:101:0x0154, B:103:0x0158, B:106:0x0160, B:109:0x0165, B:111:0x016f, B:113:0x0173, B:116:0x017f, B:119:0x018a, B:121:0x018e, B:124:0x0196, B:127:0x019b, B:129:0x01a5, B:131:0x01a9, B:132:0x01b2, B:133:0x01b8, B:135:0x01bc, B:138:0x01c4, B:141:0x01c9, B:143:0x01d3, B:145:0x01d7, B:146:0x01e0, B:149:0x01e9, B:152:0x01ee, B:154:0x01f2, B:160:0x01fc, B:165:0x0235, B:168:0x0242, B:170:0x0248, B:172:0x024d, B:173:0x0250, B:175:0x0258, B:176:0x025b, B:187:0x0282, B:189:0x028c, B:191:0x0294, B:193:0x029d, B:195:0x02a7, B:197:0x02ab, B:199:0x02af, B:201:0x02ba, B:203:0x02c0, B:204:0x02ce, B:178:0x0261, B:179:0x0264, B:181:0x026c, B:183:0x0270, B:185:0x027b, B:184:0x0278, B:162:0x021d, B:37:0x0075), top: B:218:0x0052 }] */
    /* JADX WARN: Code duplicated, block: B:187:0x0282 A[Catch: all -> 0x02fc, TryCatch #0 {all -> 0x02fc, blocks: (B:28:0x0052, B:29:0x0055, B:31:0x0061, B:42:0x0080, B:44:0x0091, B:45:0x00a1, B:47:0x00a7, B:49:0x00b9, B:52:0x00c1, B:55:0x00c6, B:57:0x00d0, B:59:0x00d4, B:62:0x00df, B:65:0x00ec, B:67:0x00f0, B:70:0x00f8, B:73:0x00fd, B:75:0x0107, B:77:0x010b, B:80:0x0116, B:83:0x0120, B:85:0x0124, B:88:0x012c, B:91:0x0131, B:93:0x013b, B:95:0x013f, B:98:0x014a, B:101:0x0154, B:103:0x0158, B:106:0x0160, B:109:0x0165, B:111:0x016f, B:113:0x0173, B:116:0x017f, B:119:0x018a, B:121:0x018e, B:124:0x0196, B:127:0x019b, B:129:0x01a5, B:131:0x01a9, B:132:0x01b2, B:133:0x01b8, B:135:0x01bc, B:138:0x01c4, B:141:0x01c9, B:143:0x01d3, B:145:0x01d7, B:146:0x01e0, B:149:0x01e9, B:152:0x01ee, B:154:0x01f2, B:160:0x01fc, B:165:0x0235, B:168:0x0242, B:170:0x0248, B:172:0x024d, B:173:0x0250, B:175:0x0258, B:176:0x025b, B:187:0x0282, B:189:0x028c, B:191:0x0294, B:193:0x029d, B:195:0x02a7, B:197:0x02ab, B:199:0x02af, B:201:0x02ba, B:203:0x02c0, B:204:0x02ce, B:178:0x0261, B:179:0x0264, B:181:0x026c, B:183:0x0270, B:185:0x027b, B:184:0x0278, B:162:0x021d, B:37:0x0075), top: B:218:0x0052 }] */
    /* JADX WARN: Code duplicated, block: B:189:0x028c A[Catch: all -> 0x02fc, TryCatch #0 {all -> 0x02fc, blocks: (B:28:0x0052, B:29:0x0055, B:31:0x0061, B:42:0x0080, B:44:0x0091, B:45:0x00a1, B:47:0x00a7, B:49:0x00b9, B:52:0x00c1, B:55:0x00c6, B:57:0x00d0, B:59:0x00d4, B:62:0x00df, B:65:0x00ec, B:67:0x00f0, B:70:0x00f8, B:73:0x00fd, B:75:0x0107, B:77:0x010b, B:80:0x0116, B:83:0x0120, B:85:0x0124, B:88:0x012c, B:91:0x0131, B:93:0x013b, B:95:0x013f, B:98:0x014a, B:101:0x0154, B:103:0x0158, B:106:0x0160, B:109:0x0165, B:111:0x016f, B:113:0x0173, B:116:0x017f, B:119:0x018a, B:121:0x018e, B:124:0x0196, B:127:0x019b, B:129:0x01a5, B:131:0x01a9, B:132:0x01b2, B:133:0x01b8, B:135:0x01bc, B:138:0x01c4, B:141:0x01c9, B:143:0x01d3, B:145:0x01d7, B:146:0x01e0, B:149:0x01e9, B:152:0x01ee, B:154:0x01f2, B:160:0x01fc, B:165:0x0235, B:168:0x0242, B:170:0x0248, B:172:0x024d, B:173:0x0250, B:175:0x0258, B:176:0x025b, B:187:0x0282, B:189:0x028c, B:191:0x0294, B:193:0x029d, B:195:0x02a7, B:197:0x02ab, B:199:0x02af, B:201:0x02ba, B:203:0x02c0, B:204:0x02ce, B:178:0x0261, B:179:0x0264, B:181:0x026c, B:183:0x0270, B:185:0x027b, B:184:0x0278, B:162:0x021d, B:37:0x0075), top: B:218:0x0052 }] */
    /* JADX WARN: Code duplicated, block: B:191:0x0294 A[Catch: all -> 0x02fc, TryCatch #0 {all -> 0x02fc, blocks: (B:28:0x0052, B:29:0x0055, B:31:0x0061, B:42:0x0080, B:44:0x0091, B:45:0x00a1, B:47:0x00a7, B:49:0x00b9, B:52:0x00c1, B:55:0x00c6, B:57:0x00d0, B:59:0x00d4, B:62:0x00df, B:65:0x00ec, B:67:0x00f0, B:70:0x00f8, B:73:0x00fd, B:75:0x0107, B:77:0x010b, B:80:0x0116, B:83:0x0120, B:85:0x0124, B:88:0x012c, B:91:0x0131, B:93:0x013b, B:95:0x013f, B:98:0x014a, B:101:0x0154, B:103:0x0158, B:106:0x0160, B:109:0x0165, B:111:0x016f, B:113:0x0173, B:116:0x017f, B:119:0x018a, B:121:0x018e, B:124:0x0196, B:127:0x019b, B:129:0x01a5, B:131:0x01a9, B:132:0x01b2, B:133:0x01b8, B:135:0x01bc, B:138:0x01c4, B:141:0x01c9, B:143:0x01d3, B:145:0x01d7, B:146:0x01e0, B:149:0x01e9, B:152:0x01ee, B:154:0x01f2, B:160:0x01fc, B:165:0x0235, B:168:0x0242, B:170:0x0248, B:172:0x024d, B:173:0x0250, B:175:0x0258, B:176:0x025b, B:187:0x0282, B:189:0x028c, B:191:0x0294, B:193:0x029d, B:195:0x02a7, B:197:0x02ab, B:199:0x02af, B:201:0x02ba, B:203:0x02c0, B:204:0x02ce, B:178:0x0261, B:179:0x0264, B:181:0x026c, B:183:0x0270, B:185:0x027b, B:184:0x0278, B:162:0x021d, B:37:0x0075), top: B:218:0x0052 }] */
    /* JADX WARN: Code duplicated, block: B:192:0x029b  */
    /* JADX WARN: Code duplicated, block: B:195:0x02a7 A[Catch: all -> 0x02fc, TryCatch #0 {all -> 0x02fc, blocks: (B:28:0x0052, B:29:0x0055, B:31:0x0061, B:42:0x0080, B:44:0x0091, B:45:0x00a1, B:47:0x00a7, B:49:0x00b9, B:52:0x00c1, B:55:0x00c6, B:57:0x00d0, B:59:0x00d4, B:62:0x00df, B:65:0x00ec, B:67:0x00f0, B:70:0x00f8, B:73:0x00fd, B:75:0x0107, B:77:0x010b, B:80:0x0116, B:83:0x0120, B:85:0x0124, B:88:0x012c, B:91:0x0131, B:93:0x013b, B:95:0x013f, B:98:0x014a, B:101:0x0154, B:103:0x0158, B:106:0x0160, B:109:0x0165, B:111:0x016f, B:113:0x0173, B:116:0x017f, B:119:0x018a, B:121:0x018e, B:124:0x0196, B:127:0x019b, B:129:0x01a5, B:131:0x01a9, B:132:0x01b2, B:133:0x01b8, B:135:0x01bc, B:138:0x01c4, B:141:0x01c9, B:143:0x01d3, B:145:0x01d7, B:146:0x01e0, B:149:0x01e9, B:152:0x01ee, B:154:0x01f2, B:160:0x01fc, B:165:0x0235, B:168:0x0242, B:170:0x0248, B:172:0x024d, B:173:0x0250, B:175:0x0258, B:176:0x025b, B:187:0x0282, B:189:0x028c, B:191:0x0294, B:193:0x029d, B:195:0x02a7, B:197:0x02ab, B:199:0x02af, B:201:0x02ba, B:203:0x02c0, B:204:0x02ce, B:178:0x0261, B:179:0x0264, B:181:0x026c, B:183:0x0270, B:185:0x027b, B:184:0x0278, B:162:0x021d, B:37:0x0075), top: B:218:0x0052 }] */
    /* JADX WARN: Code duplicated, block: B:202:0x02be  */
    /* JADX WARN: Code duplicated, block: B:204:0x02ce A[Catch: all -> 0x02fc, TRY_LEAVE, TryCatch #0 {all -> 0x02fc, blocks: (B:28:0x0052, B:29:0x0055, B:31:0x0061, B:42:0x0080, B:44:0x0091, B:45:0x00a1, B:47:0x00a7, B:49:0x00b9, B:52:0x00c1, B:55:0x00c6, B:57:0x00d0, B:59:0x00d4, B:62:0x00df, B:65:0x00ec, B:67:0x00f0, B:70:0x00f8, B:73:0x00fd, B:75:0x0107, B:77:0x010b, B:80:0x0116, B:83:0x0120, B:85:0x0124, B:88:0x012c, B:91:0x0131, B:93:0x013b, B:95:0x013f, B:98:0x014a, B:101:0x0154, B:103:0x0158, B:106:0x0160, B:109:0x0165, B:111:0x016f, B:113:0x0173, B:116:0x017f, B:119:0x018a, B:121:0x018e, B:124:0x0196, B:127:0x019b, B:129:0x01a5, B:131:0x01a9, B:132:0x01b2, B:133:0x01b8, B:135:0x01bc, B:138:0x01c4, B:141:0x01c9, B:143:0x01d3, B:145:0x01d7, B:146:0x01e0, B:149:0x01e9, B:152:0x01ee, B:154:0x01f2, B:160:0x01fc, B:165:0x0235, B:168:0x0242, B:170:0x0248, B:172:0x024d, B:173:0x0250, B:175:0x0258, B:176:0x025b, B:187:0x0282, B:189:0x028c, B:191:0x0294, B:193:0x029d, B:195:0x02a7, B:197:0x02ab, B:199:0x02af, B:201:0x02ba, B:203:0x02c0, B:204:0x02ce, B:178:0x0261, B:179:0x0264, B:181:0x026c, B:183:0x0270, B:185:0x027b, B:184:0x0278, B:162:0x021d, B:37:0x0075), top: B:218:0x0052 }] */
    /* JADX WARN: Code duplicated, block: B:223:0x0242 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:232:0x0188 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x0090  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ec A[Catch: all -> 0x02fc, TryCatch #0 {all -> 0x02fc, blocks: (B:28:0x0052, B:29:0x0055, B:31:0x0061, B:42:0x0080, B:44:0x0091, B:45:0x00a1, B:47:0x00a7, B:49:0x00b9, B:52:0x00c1, B:55:0x00c6, B:57:0x00d0, B:59:0x00d4, B:62:0x00df, B:65:0x00ec, B:67:0x00f0, B:70:0x00f8, B:73:0x00fd, B:75:0x0107, B:77:0x010b, B:80:0x0116, B:83:0x0120, B:85:0x0124, B:88:0x012c, B:91:0x0131, B:93:0x013b, B:95:0x013f, B:98:0x014a, B:101:0x0154, B:103:0x0158, B:106:0x0160, B:109:0x0165, B:111:0x016f, B:113:0x0173, B:116:0x017f, B:119:0x018a, B:121:0x018e, B:124:0x0196, B:127:0x019b, B:129:0x01a5, B:131:0x01a9, B:132:0x01b2, B:133:0x01b8, B:135:0x01bc, B:138:0x01c4, B:141:0x01c9, B:143:0x01d3, B:145:0x01d7, B:146:0x01e0, B:149:0x01e9, B:152:0x01ee, B:154:0x01f2, B:160:0x01fc, B:165:0x0235, B:168:0x0242, B:170:0x0248, B:172:0x024d, B:173:0x0250, B:175:0x0258, B:176:0x025b, B:187:0x0282, B:189:0x028c, B:191:0x0294, B:193:0x029d, B:195:0x02a7, B:197:0x02ab, B:199:0x02af, B:201:0x02ba, B:203:0x02c0, B:204:0x02ce, B:178:0x0261, B:179:0x0264, B:181:0x026c, B:183:0x0270, B:185:0x027b, B:184:0x0278, B:162:0x021d, B:37:0x0075), top: B:218:0x0052 }] */
    /* JADX WARN: Code duplicated, block: B:67:0x00f0 A[Catch: all -> 0x02fc, TryCatch #0 {all -> 0x02fc, blocks: (B:28:0x0052, B:29:0x0055, B:31:0x0061, B:42:0x0080, B:44:0x0091, B:45:0x00a1, B:47:0x00a7, B:49:0x00b9, B:52:0x00c1, B:55:0x00c6, B:57:0x00d0, B:59:0x00d4, B:62:0x00df, B:65:0x00ec, B:67:0x00f0, B:70:0x00f8, B:73:0x00fd, B:75:0x0107, B:77:0x010b, B:80:0x0116, B:83:0x0120, B:85:0x0124, B:88:0x012c, B:91:0x0131, B:93:0x013b, B:95:0x013f, B:98:0x014a, B:101:0x0154, B:103:0x0158, B:106:0x0160, B:109:0x0165, B:111:0x016f, B:113:0x0173, B:116:0x017f, B:119:0x018a, B:121:0x018e, B:124:0x0196, B:127:0x019b, B:129:0x01a5, B:131:0x01a9, B:132:0x01b2, B:133:0x01b8, B:135:0x01bc, B:138:0x01c4, B:141:0x01c9, B:143:0x01d3, B:145:0x01d7, B:146:0x01e0, B:149:0x01e9, B:152:0x01ee, B:154:0x01f2, B:160:0x01fc, B:165:0x0235, B:168:0x0242, B:170:0x0248, B:172:0x024d, B:173:0x0250, B:175:0x0258, B:176:0x025b, B:187:0x0282, B:189:0x028c, B:191:0x0294, B:193:0x029d, B:195:0x02a7, B:197:0x02ab, B:199:0x02af, B:201:0x02ba, B:203:0x02c0, B:204:0x02ce, B:178:0x0261, B:179:0x0264, B:181:0x026c, B:183:0x0270, B:185:0x027b, B:184:0x0278, B:162:0x021d, B:37:0x0075), top: B:218:0x0052 }] */
    /* JADX WARN: Code duplicated, block: B:83:0x0120 A[Catch: all -> 0x02fc, TryCatch #0 {all -> 0x02fc, blocks: (B:28:0x0052, B:29:0x0055, B:31:0x0061, B:42:0x0080, B:44:0x0091, B:45:0x00a1, B:47:0x00a7, B:49:0x00b9, B:52:0x00c1, B:55:0x00c6, B:57:0x00d0, B:59:0x00d4, B:62:0x00df, B:65:0x00ec, B:67:0x00f0, B:70:0x00f8, B:73:0x00fd, B:75:0x0107, B:77:0x010b, B:80:0x0116, B:83:0x0120, B:85:0x0124, B:88:0x012c, B:91:0x0131, B:93:0x013b, B:95:0x013f, B:98:0x014a, B:101:0x0154, B:103:0x0158, B:106:0x0160, B:109:0x0165, B:111:0x016f, B:113:0x0173, B:116:0x017f, B:119:0x018a, B:121:0x018e, B:124:0x0196, B:127:0x019b, B:129:0x01a5, B:131:0x01a9, B:132:0x01b2, B:133:0x01b8, B:135:0x01bc, B:138:0x01c4, B:141:0x01c9, B:143:0x01d3, B:145:0x01d7, B:146:0x01e0, B:149:0x01e9, B:152:0x01ee, B:154:0x01f2, B:160:0x01fc, B:165:0x0235, B:168:0x0242, B:170:0x0248, B:172:0x024d, B:173:0x0250, B:175:0x0258, B:176:0x025b, B:187:0x0282, B:189:0x028c, B:191:0x0294, B:193:0x029d, B:195:0x02a7, B:197:0x02ab, B:199:0x02af, B:201:0x02ba, B:203:0x02c0, B:204:0x02ce, B:178:0x0261, B:179:0x0264, B:181:0x026c, B:183:0x0270, B:185:0x027b, B:184:0x0278, B:162:0x021d, B:37:0x0075), top: B:218:0x0052 }] */
    /* JADX WARN: Code duplicated, block: B:85:0x0124 A[Catch: all -> 0x02fc, TryCatch #0 {all -> 0x02fc, blocks: (B:28:0x0052, B:29:0x0055, B:31:0x0061, B:42:0x0080, B:44:0x0091, B:45:0x00a1, B:47:0x00a7, B:49:0x00b9, B:52:0x00c1, B:55:0x00c6, B:57:0x00d0, B:59:0x00d4, B:62:0x00df, B:65:0x00ec, B:67:0x00f0, B:70:0x00f8, B:73:0x00fd, B:75:0x0107, B:77:0x010b, B:80:0x0116, B:83:0x0120, B:85:0x0124, B:88:0x012c, B:91:0x0131, B:93:0x013b, B:95:0x013f, B:98:0x014a, B:101:0x0154, B:103:0x0158, B:106:0x0160, B:109:0x0165, B:111:0x016f, B:113:0x0173, B:116:0x017f, B:119:0x018a, B:121:0x018e, B:124:0x0196, B:127:0x019b, B:129:0x01a5, B:131:0x01a9, B:132:0x01b2, B:133:0x01b8, B:135:0x01bc, B:138:0x01c4, B:141:0x01c9, B:143:0x01d3, B:145:0x01d7, B:146:0x01e0, B:149:0x01e9, B:152:0x01ee, B:154:0x01f2, B:160:0x01fc, B:165:0x0235, B:168:0x0242, B:170:0x0248, B:172:0x024d, B:173:0x0250, B:175:0x0258, B:176:0x025b, B:187:0x0282, B:189:0x028c, B:191:0x0294, B:193:0x029d, B:195:0x02a7, B:197:0x02ab, B:199:0x02af, B:201:0x02ba, B:203:0x02c0, B:204:0x02ce, B:178:0x0261, B:179:0x0264, B:181:0x026c, B:183:0x0270, B:185:0x027b, B:184:0x0278, B:162:0x021d, B:37:0x0075), top: B:218:0x0052 }] */
    public void write(JSONSerializer jSONSerializer, Object obj, Object obj2, Type type, int i10, boolean z10) throws IOException {
        Map<String, Object> treeMap;
        boolean z11;
        List<PropertyPreFilter> list;
        List<PropertyFilter> list2;
        List<PropertyFilter> list3;
        List<NameFilter> list4;
        List<NameFilter> list5;
        String str;
        String str2;
        Object objProcessValue;
        Object obj3;
        Class<?> cls;
        Class<?> cls2;
        Class<?> cls3;
        ObjectSerializer objectSerializer;
        Type type2;
        SerializeWriter serializeWriter = jSONSerializer.out;
        if (obj == null) {
            serializeWriter.writeNull();
            return;
        }
        Map<String, Object> innerMap = (Map) obj;
        int i11 = SerializerFeature.MapSortField.mask;
        if ((serializeWriter.features & i11) == 0 && (i11 & i10) == 0) {
            treeMap = innerMap;
        } else {
            if (innerMap instanceof JSONObject) {
                innerMap = ((JSONObject) innerMap).getInnerMap();
            }
            if ((innerMap instanceof SortedMap) || (innerMap instanceof LinkedHashMap)) {
                treeMap = innerMap;
            } else {
                try {
                    treeMap = new TreeMap(innerMap);
                } catch (Exception unused) {
                    treeMap = innerMap;
                }
            }
        }
        if (jSONSerializer.containsReference(obj)) {
            jSONSerializer.writeReference(obj);
            return;
        }
        SerialContext serialContext = jSONSerializer.context;
        boolean z12 = false;
        jSONSerializer.setContext(serialContext, obj, obj2, 0);
        if (!z10) {
            try {
                serializeWriter.write(123);
            } catch (Throwable th2) {
                jSONSerializer.context = serialContext;
                throw th2;
            }
        }
        jSONSerializer.incrementIndent();
        if (serializeWriter.isEnabled(SerializerFeature.WriteClassName)) {
            String str3 = jSONSerializer.config.typeKey;
            Class<?> cls4 = treeMap.getClass();
            if ((cls4 == JSONObject.class || cls4 == HashMap.class || cls4 == LinkedHashMap.class) && treeMap.containsKey(str3)) {
                z11 = true;
            } else {
                serializeWriter.writeFieldName(str3);
                serializeWriter.writeString(obj.getClass().getName());
                z11 = false;
            }
        } else {
            z11 = true;
        }
        boolean z13 = z11;
        Class<?> cls5 = null;
        ObjectSerializer objectWriter = null;
        for (Map.Entry<String, Object> entry : treeMap.entrySet()) {
            Object value = entry.getValue();
            String key = entry.getKey();
            List<PropertyPreFilter> list6 = jSONSerializer.propertyPreFilters;
            if (list6 == null || list6.size() <= 0) {
                list = this.propertyPreFilters;
                if (list != null || list.size() <= 0) {
                    list2 = jSONSerializer.propertyFilters;
                    if (list2 != null || list2.size() <= 0) {
                        list3 = this.propertyFilters;
                        if (list3 != null && list3.size() > 0) {
                            if (key != null || (key instanceof String)) {
                                if (!apply(jSONSerializer, obj, key, value)) {
                                    cls5 = cls5;
                                    cls5 = cls5;
                                    z12 = false;
                                }
                            } else if ((key.getClass().isPrimitive() || (key instanceof Number)) && !apply(jSONSerializer, obj, JSON.toJSONString(key), value)) {
                                cls5 = cls5;
                                cls5 = cls5;
                                z12 = false;
                            }
                        }
                        list4 = jSONSerializer.nameFilters;
                        if (list4 != null && list4.size() > 0) {
                            if (key != null || (key instanceof String)) {
                                key = processKey(jSONSerializer, obj, key, value);
                            } else if (key.getClass().isPrimitive() || (key instanceof Number)) {
                                key = processKey(jSONSerializer, obj, JSON.toJSONString(key), value);
                            }
                        }
                        list5 = this.nameFilters;
                        if (list5 != null && list5.size() > 0) {
                            if (key != null || (key instanceof String)) {
                                key = processKey(jSONSerializer, obj, key, value);
                            } else if (key.getClass().isPrimitive() || (key instanceof Number)) {
                                key = processKey(jSONSerializer, obj, JSON.toJSONString(key), value);
                            }
                        }
                        str = key;
                        if (str != null || (str instanceof String)) {
                            str2 = str;
                            objProcessValue = processValue(jSONSerializer, null, obj, str2, value);
                        } else {
                            if (((str instanceof Map) || (str instanceof Collection)) ? true : z12) {
                                str2 = str;
                                cls5 = cls5;
                                obj3 = value;
                            } else {
                                str2 = str;
                                objProcessValue = processValue(jSONSerializer, null, obj, JSON.toJSONString(str), value);
                            }
                            if (obj3 == null || serializeWriter.isEnabled(SerializerFeature.WRITE_MAP_NULL_FEATURES)) {
                                if (str2 instanceof String) {
                                    String str4 = str2;
                                    if (!z13) {
                                        serializeWriter.write(44);
                                    }
                                    if (serializeWriter.isEnabled(SerializerFeature.PrettyFormat)) {
                                        jSONSerializer.println();
                                    }
                                    serializeWriter.writeFieldName(str4, true);
                                } else {
                                    if (!z13) {
                                        serializeWriter.write(44);
                                    }
                                    if (serializeWriter.isEnabled(NON_STRINGKEY_AS_STRING) || (str2 instanceof Enum)) {
                                        jSONSerializer.write((Object) str2);
                                    } else {
                                        jSONSerializer.write(JSON.toJSONString(str2));
                                    }
                                    serializeWriter.write(58);
                                }
                                if (obj3 == null) {
                                    serializeWriter.writeNull();
                                    cls5 = cls5;
                                } else {
                                    cls = obj3.getClass();
                                    cls2 = cls5;
                                    if (cls != cls2) {
                                        objectWriter = jSONSerializer.getObjectWriter(cls);
                                        cls3 = cls;
                                    } else {
                                        cls3 = cls2;
                                    }
                                    objectSerializer = objectWriter;
                                    if (SerializerFeature.isEnabled(i10, SerializerFeature.WriteClassName) || !(objectSerializer instanceof JavaBeanSerializer)) {
                                        objectWriter = objectSerializer;
                                        objectWriter.write(jSONSerializer, obj3, str2, null, i10);
                                    } else {
                                        if (type instanceof ParameterizedType) {
                                            Type[] actualTypeArguments = ((ParameterizedType) type).getActualTypeArguments();
                                            if (actualTypeArguments.length == 2) {
                                                type2 = actualTypeArguments[1];
                                            } else {
                                                type2 = null;
                                            }
                                        } else {
                                            type2 = null;
                                        }
                                        objectWriter = objectSerializer;
                                        ((JavaBeanSerializer) objectSerializer).writeNoneASM(jSONSerializer, obj3, str2, type2, i10);
                                    }
                                    cls5 = cls3;
                                }
                                z12 = false;
                                z13 = false;
                            } else {
                                cls5 = cls5;
                                z12 = false;
                            }
                        }
                        obj3 = objProcessValue;
                        if (obj3 == null) {
                        }
                        if (str2 instanceof String) {
                            String str5 = str2;
                            if (!z13) {
                                serializeWriter.write(44);
                            }
                            if (serializeWriter.isEnabled(SerializerFeature.PrettyFormat)) {
                                jSONSerializer.println();
                            }
                            serializeWriter.writeFieldName(str5, true);
                        } else {
                            if (!z13) {
                                serializeWriter.write(44);
                            }
                            if (serializeWriter.isEnabled(NON_STRINGKEY_AS_STRING)) {
                                jSONSerializer.write((Object) str2);
                            } else {
                                jSONSerializer.write((Object) str2);
                            }
                            serializeWriter.write(58);
                        }
                        if (obj3 == null) {
                            serializeWriter.writeNull();
                            cls5 = cls5;
                        } else {
                            cls = obj3.getClass();
                            cls2 = cls5;
                            if (cls != cls2) {
                                objectWriter = jSONSerializer.getObjectWriter(cls);
                                cls3 = cls;
                            } else {
                                cls3 = cls2;
                            }
                            objectSerializer = objectWriter;
                            if (SerializerFeature.isEnabled(i10, SerializerFeature.WriteClassName)) {
                                objectWriter = objectSerializer;
                                objectWriter.write(jSONSerializer, obj3, str2, null, i10);
                            } else {
                                objectWriter = objectSerializer;
                                objectWriter.write(jSONSerializer, obj3, str2, null, i10);
                            }
                            cls5 = cls3;
                        }
                        z12 = false;
                        z13 = false;
                    } else {
                        if (key == null || (key instanceof String)) {
                            if (apply(jSONSerializer, obj, key, value)) {
                                list3 = this.propertyFilters;
                                if (list3 != null) {
                                    if (key != null) {
                                        if (!apply(jSONSerializer, obj, key, value)) {
                                        }
                                    } else if (!apply(jSONSerializer, obj, key, value)) {
                                    }
                                }
                                list4 = jSONSerializer.nameFilters;
                                if (list4 != null) {
                                    if (key != null) {
                                        key = processKey(jSONSerializer, obj, key, value);
                                    } else {
                                        key = processKey(jSONSerializer, obj, key, value);
                                    }
                                }
                                list5 = this.nameFilters;
                                if (list5 != null) {
                                    if (key != null) {
                                        key = processKey(jSONSerializer, obj, key, value);
                                    } else {
                                        key = processKey(jSONSerializer, obj, key, value);
                                    }
                                }
                                str = key;
                                if (str != null) {
                                    str2 = str;
                                    objProcessValue = processValue(jSONSerializer, null, obj, str2, value);
                                    obj3 = objProcessValue;
                                } else {
                                    str2 = str;
                                    objProcessValue = processValue(jSONSerializer, null, obj, str2, value);
                                    obj3 = objProcessValue;
                                }
                                if (obj3 == null) {
                                }
                                if (str2 instanceof String) {
                                    String str6 = str2;
                                    if (!z13) {
                                        serializeWriter.write(44);
                                    }
                                    if (serializeWriter.isEnabled(SerializerFeature.PrettyFormat)) {
                                        jSONSerializer.println();
                                    }
                                    serializeWriter.writeFieldName(str6, true);
                                } else {
                                    if (!z13) {
                                        serializeWriter.write(44);
                                    }
                                    if (serializeWriter.isEnabled(NON_STRINGKEY_AS_STRING)) {
                                        jSONSerializer.write((Object) str2);
                                    } else {
                                        jSONSerializer.write((Object) str2);
                                    }
                                    serializeWriter.write(58);
                                }
                                if (obj3 == null) {
                                    serializeWriter.writeNull();
                                    cls5 = cls5;
                                } else {
                                    cls = obj3.getClass();
                                    cls2 = cls5;
                                    if (cls != cls2) {
                                        objectWriter = jSONSerializer.getObjectWriter(cls);
                                        cls3 = cls;
                                    } else {
                                        cls3 = cls2;
                                    }
                                    objectSerializer = objectWriter;
                                    if (SerializerFeature.isEnabled(i10, SerializerFeature.WriteClassName)) {
                                        objectWriter = objectSerializer;
                                        objectWriter.write(jSONSerializer, obj3, str2, null, i10);
                                    } else {
                                        objectWriter = objectSerializer;
                                        objectWriter.write(jSONSerializer, obj3, str2, null, i10);
                                    }
                                    cls5 = cls3;
                                }
                                z12 = false;
                                z13 = false;
                            }
                        } else if ((!key.getClass().isPrimitive() && !(key instanceof Number)) || apply(jSONSerializer, obj, JSON.toJSONString(key), value)) {
                            list3 = this.propertyFilters;
                            if (list3 != null) {
                                if (key != null) {
                                    if (!apply(jSONSerializer, obj, key, value)) {
                                    }
                                } else if (!apply(jSONSerializer, obj, key, value)) {
                                }
                            }
                            list4 = jSONSerializer.nameFilters;
                            if (list4 != null) {
                                if (key != null) {
                                    key = processKey(jSONSerializer, obj, key, value);
                                } else {
                                    key = processKey(jSONSerializer, obj, key, value);
                                }
                            }
                            list5 = this.nameFilters;
                            if (list5 != null) {
                                if (key != null) {
                                    key = processKey(jSONSerializer, obj, key, value);
                                } else {
                                    key = processKey(jSONSerializer, obj, key, value);
                                }
                            }
                            str = key;
                            if (str != null) {
                                str2 = str;
                                objProcessValue = processValue(jSONSerializer, null, obj, str2, value);
                                obj3 = objProcessValue;
                            } else {
                                str2 = str;
                                objProcessValue = processValue(jSONSerializer, null, obj, str2, value);
                                obj3 = objProcessValue;
                            }
                            if (obj3 == null) {
                            }
                            if (str2 instanceof String) {
                                String str7 = str2;
                                if (!z13) {
                                    serializeWriter.write(44);
                                }
                                if (serializeWriter.isEnabled(SerializerFeature.PrettyFormat)) {
                                    jSONSerializer.println();
                                }
                                serializeWriter.writeFieldName(str7, true);
                            } else {
                                if (!z13) {
                                    serializeWriter.write(44);
                                }
                                if (serializeWriter.isEnabled(NON_STRINGKEY_AS_STRING)) {
                                    jSONSerializer.write((Object) str2);
                                } else {
                                    jSONSerializer.write((Object) str2);
                                }
                                serializeWriter.write(58);
                            }
                            if (obj3 == null) {
                                serializeWriter.writeNull();
                                cls5 = cls5;
                            } else {
                                cls = obj3.getClass();
                                cls2 = cls5;
                                if (cls != cls2) {
                                    objectWriter = jSONSerializer.getObjectWriter(cls);
                                    cls3 = cls;
                                } else {
                                    cls3 = cls2;
                                }
                                objectSerializer = objectWriter;
                                if (SerializerFeature.isEnabled(i10, SerializerFeature.WriteClassName)) {
                                    objectWriter = objectSerializer;
                                    objectWriter.write(jSONSerializer, obj3, str2, null, i10);
                                } else {
                                    objectWriter = objectSerializer;
                                    objectWriter.write(jSONSerializer, obj3, str2, null, i10);
                                }
                                cls5 = cls3;
                            }
                            z12 = false;
                            z13 = false;
                        }
                        cls5 = cls5;
                        cls5 = cls5;
                        z12 = false;
                    }
                } else {
                    if (key == null || (key instanceof String)) {
                        if (applyName(jSONSerializer, obj, key)) {
                            list2 = jSONSerializer.propertyFilters;
                            if (list2 != null) {
                                list3 = this.propertyFilters;
                                if (list3 != null) {
                                    if (key != null) {
                                        if (!apply(jSONSerializer, obj, key, value)) {
                                        }
                                    } else if (!apply(jSONSerializer, obj, key, value)) {
                                    }
                                }
                                list4 = jSONSerializer.nameFilters;
                                if (list4 != null) {
                                    if (key != null) {
                                        key = processKey(jSONSerializer, obj, key, value);
                                    } else {
                                        key = processKey(jSONSerializer, obj, key, value);
                                    }
                                }
                                list5 = this.nameFilters;
                                if (list5 != null) {
                                    if (key != null) {
                                        key = processKey(jSONSerializer, obj, key, value);
                                    } else {
                                        key = processKey(jSONSerializer, obj, key, value);
                                    }
                                }
                                str = key;
                                if (str != null) {
                                    str2 = str;
                                    objProcessValue = processValue(jSONSerializer, null, obj, str2, value);
                                    obj3 = objProcessValue;
                                } else {
                                    str2 = str;
                                    objProcessValue = processValue(jSONSerializer, null, obj, str2, value);
                                    obj3 = objProcessValue;
                                }
                                if (obj3 == null) {
                                }
                                if (str2 instanceof String) {
                                    String str8 = str2;
                                    if (!z13) {
                                        serializeWriter.write(44);
                                    }
                                    if (serializeWriter.isEnabled(SerializerFeature.PrettyFormat)) {
                                        jSONSerializer.println();
                                    }
                                    serializeWriter.writeFieldName(str8, true);
                                } else {
                                    if (!z13) {
                                        serializeWriter.write(44);
                                    }
                                    if (serializeWriter.isEnabled(NON_STRINGKEY_AS_STRING)) {
                                        jSONSerializer.write((Object) str2);
                                    } else {
                                        jSONSerializer.write((Object) str2);
                                    }
                                    serializeWriter.write(58);
                                }
                                if (obj3 == null) {
                                    serializeWriter.writeNull();
                                    cls5 = cls5;
                                } else {
                                    cls = obj3.getClass();
                                    cls2 = cls5;
                                    if (cls != cls2) {
                                        objectWriter = jSONSerializer.getObjectWriter(cls);
                                        cls3 = cls;
                                    } else {
                                        cls3 = cls2;
                                    }
                                    objectSerializer = objectWriter;
                                    if (SerializerFeature.isEnabled(i10, SerializerFeature.WriteClassName)) {
                                        objectWriter = objectSerializer;
                                        objectWriter.write(jSONSerializer, obj3, str2, null, i10);
                                    } else {
                                        objectWriter = objectSerializer;
                                        objectWriter.write(jSONSerializer, obj3, str2, null, i10);
                                    }
                                    cls5 = cls3;
                                }
                                z12 = false;
                                z13 = false;
                            } else {
                                list3 = this.propertyFilters;
                                if (list3 != null) {
                                    if (key != null) {
                                        if (!apply(jSONSerializer, obj, key, value)) {
                                        }
                                    } else if (!apply(jSONSerializer, obj, key, value)) {
                                    }
                                }
                                list4 = jSONSerializer.nameFilters;
                                if (list4 != null) {
                                    if (key != null) {
                                        key = processKey(jSONSerializer, obj, key, value);
                                    } else {
                                        key = processKey(jSONSerializer, obj, key, value);
                                    }
                                }
                                list5 = this.nameFilters;
                                if (list5 != null) {
                                    if (key != null) {
                                        key = processKey(jSONSerializer, obj, key, value);
                                    } else {
                                        key = processKey(jSONSerializer, obj, key, value);
                                    }
                                }
                                str = key;
                                if (str != null) {
                                    str2 = str;
                                    objProcessValue = processValue(jSONSerializer, null, obj, str2, value);
                                    obj3 = objProcessValue;
                                } else {
                                    str2 = str;
                                    objProcessValue = processValue(jSONSerializer, null, obj, str2, value);
                                    obj3 = objProcessValue;
                                }
                                if (obj3 == null) {
                                }
                                if (str2 instanceof String) {
                                    String str9 = str2;
                                    if (!z13) {
                                        serializeWriter.write(44);
                                    }
                                    if (serializeWriter.isEnabled(SerializerFeature.PrettyFormat)) {
                                        jSONSerializer.println();
                                    }
                                    serializeWriter.writeFieldName(str9, true);
                                } else {
                                    if (!z13) {
                                        serializeWriter.write(44);
                                    }
                                    if (serializeWriter.isEnabled(NON_STRINGKEY_AS_STRING)) {
                                        jSONSerializer.write((Object) str2);
                                    } else {
                                        jSONSerializer.write((Object) str2);
                                    }
                                    serializeWriter.write(58);
                                }
                                if (obj3 == null) {
                                    serializeWriter.writeNull();
                                    cls5 = cls5;
                                } else {
                                    cls = obj3.getClass();
                                    cls2 = cls5;
                                    if (cls != cls2) {
                                        objectWriter = jSONSerializer.getObjectWriter(cls);
                                        cls3 = cls;
                                    } else {
                                        cls3 = cls2;
                                    }
                                    objectSerializer = objectWriter;
                                    if (SerializerFeature.isEnabled(i10, SerializerFeature.WriteClassName)) {
                                        objectWriter = objectSerializer;
                                        objectWriter.write(jSONSerializer, obj3, str2, null, i10);
                                    } else {
                                        objectWriter = objectSerializer;
                                        objectWriter.write(jSONSerializer, obj3, str2, null, i10);
                                    }
                                    cls5 = cls3;
                                }
                                z12 = false;
                                z13 = false;
                            }
                        }
                    } else if ((!key.getClass().isPrimitive() && !(key instanceof Number)) || applyName(jSONSerializer, obj, JSON.toJSONString(key))) {
                        list2 = jSONSerializer.propertyFilters;
                        if (list2 != null) {
                            list3 = this.propertyFilters;
                            if (list3 != null) {
                                if (key != null) {
                                    if (!apply(jSONSerializer, obj, key, value)) {
                                    }
                                } else if (!apply(jSONSerializer, obj, key, value)) {
                                }
                            }
                            list4 = jSONSerializer.nameFilters;
                            if (list4 != null) {
                                if (key != null) {
                                    key = processKey(jSONSerializer, obj, key, value);
                                } else {
                                    key = processKey(jSONSerializer, obj, key, value);
                                }
                            }
                            list5 = this.nameFilters;
                            if (list5 != null) {
                                if (key != null) {
                                    key = processKey(jSONSerializer, obj, key, value);
                                } else {
                                    key = processKey(jSONSerializer, obj, key, value);
                                }
                            }
                            str = key;
                            if (str != null) {
                                str2 = str;
                                objProcessValue = processValue(jSONSerializer, null, obj, str2, value);
                                obj3 = objProcessValue;
                            } else {
                                str2 = str;
                                objProcessValue = processValue(jSONSerializer, null, obj, str2, value);
                                obj3 = objProcessValue;
                            }
                            if (obj3 == null) {
                            }
                            if (str2 instanceof String) {
                                String str10 = str2;
                                if (!z13) {
                                    serializeWriter.write(44);
                                }
                                if (serializeWriter.isEnabled(SerializerFeature.PrettyFormat)) {
                                    jSONSerializer.println();
                                }
                                serializeWriter.writeFieldName(str10, true);
                            } else {
                                if (!z13) {
                                    serializeWriter.write(44);
                                }
                                if (serializeWriter.isEnabled(NON_STRINGKEY_AS_STRING)) {
                                    jSONSerializer.write((Object) str2);
                                } else {
                                    jSONSerializer.write((Object) str2);
                                }
                                serializeWriter.write(58);
                            }
                            if (obj3 == null) {
                                serializeWriter.writeNull();
                                cls5 = cls5;
                            } else {
                                cls = obj3.getClass();
                                cls2 = cls5;
                                if (cls != cls2) {
                                    objectWriter = jSONSerializer.getObjectWriter(cls);
                                    cls3 = cls;
                                } else {
                                    cls3 = cls2;
                                }
                                objectSerializer = objectWriter;
                                if (SerializerFeature.isEnabled(i10, SerializerFeature.WriteClassName)) {
                                    objectWriter = objectSerializer;
                                    objectWriter.write(jSONSerializer, obj3, str2, null, i10);
                                } else {
                                    objectWriter = objectSerializer;
                                    objectWriter.write(jSONSerializer, obj3, str2, null, i10);
                                }
                                cls5 = cls3;
                            }
                            z12 = false;
                            z13 = false;
                        } else {
                            list3 = this.propertyFilters;
                            if (list3 != null) {
                                if (key != null) {
                                    if (!apply(jSONSerializer, obj, key, value)) {
                                    }
                                } else if (!apply(jSONSerializer, obj, key, value)) {
                                }
                            }
                            list4 = jSONSerializer.nameFilters;
                            if (list4 != null) {
                                if (key != null) {
                                    key = processKey(jSONSerializer, obj, key, value);
                                } else {
                                    key = processKey(jSONSerializer, obj, key, value);
                                }
                            }
                            list5 = this.nameFilters;
                            if (list5 != null) {
                                if (key != null) {
                                    key = processKey(jSONSerializer, obj, key, value);
                                } else {
                                    key = processKey(jSONSerializer, obj, key, value);
                                }
                            }
                            str = key;
                            if (str != null) {
                                str2 = str;
                                objProcessValue = processValue(jSONSerializer, null, obj, str2, value);
                                obj3 = objProcessValue;
                            } else {
                                str2 = str;
                                objProcessValue = processValue(jSONSerializer, null, obj, str2, value);
                                obj3 = objProcessValue;
                            }
                            if (obj3 == null) {
                            }
                            if (str2 instanceof String) {
                                String str11 = str2;
                                if (!z13) {
                                    serializeWriter.write(44);
                                }
                                if (serializeWriter.isEnabled(SerializerFeature.PrettyFormat)) {
                                    jSONSerializer.println();
                                }
                                serializeWriter.writeFieldName(str11, true);
                            } else {
                                if (!z13) {
                                    serializeWriter.write(44);
                                }
                                if (serializeWriter.isEnabled(NON_STRINGKEY_AS_STRING)) {
                                    jSONSerializer.write((Object) str2);
                                } else {
                                    jSONSerializer.write((Object) str2);
                                }
                                serializeWriter.write(58);
                            }
                            if (obj3 == null) {
                                serializeWriter.writeNull();
                                cls5 = cls5;
                            } else {
                                cls = obj3.getClass();
                                cls2 = cls5;
                                if (cls != cls2) {
                                    objectWriter = jSONSerializer.getObjectWriter(cls);
                                    cls3 = cls;
                                } else {
                                    cls3 = cls2;
                                }
                                objectSerializer = objectWriter;
                                if (SerializerFeature.isEnabled(i10, SerializerFeature.WriteClassName)) {
                                    objectWriter = objectSerializer;
                                    objectWriter.write(jSONSerializer, obj3, str2, null, i10);
                                } else {
                                    objectWriter = objectSerializer;
                                    objectWriter.write(jSONSerializer, obj3, str2, null, i10);
                                }
                                cls5 = cls3;
                            }
                            z12 = false;
                            z13 = false;
                        }
                    }
                    cls5 = cls5;
                    cls5 = cls5;
                    z12 = false;
                }
            } else {
                if (key == null || (key instanceof String)) {
                    if (applyName(jSONSerializer, obj, key)) {
                        list = this.propertyPreFilters;
                        if (list != null) {
                            list2 = jSONSerializer.propertyFilters;
                            if (list2 != null) {
                                list3 = this.propertyFilters;
                                if (list3 != null) {
                                    if (key != null) {
                                        if (!apply(jSONSerializer, obj, key, value)) {
                                        }
                                    } else if (!apply(jSONSerializer, obj, key, value)) {
                                    }
                                }
                                list4 = jSONSerializer.nameFilters;
                                if (list4 != null) {
                                    if (key != null) {
                                        key = processKey(jSONSerializer, obj, key, value);
                                    } else {
                                        key = processKey(jSONSerializer, obj, key, value);
                                    }
                                }
                                list5 = this.nameFilters;
                                if (list5 != null) {
                                    if (key != null) {
                                        key = processKey(jSONSerializer, obj, key, value);
                                    } else {
                                        key = processKey(jSONSerializer, obj, key, value);
                                    }
                                }
                                str = key;
                                if (str != null) {
                                    str2 = str;
                                    objProcessValue = processValue(jSONSerializer, null, obj, str2, value);
                                    obj3 = objProcessValue;
                                } else {
                                    str2 = str;
                                    objProcessValue = processValue(jSONSerializer, null, obj, str2, value);
                                    obj3 = objProcessValue;
                                }
                                if (obj3 == null) {
                                }
                                if (str2 instanceof String) {
                                    String str12 = str2;
                                    if (!z13) {
                                        serializeWriter.write(44);
                                    }
                                    if (serializeWriter.isEnabled(SerializerFeature.PrettyFormat)) {
                                        jSONSerializer.println();
                                    }
                                    serializeWriter.writeFieldName(str12, true);
                                } else {
                                    if (!z13) {
                                        serializeWriter.write(44);
                                    }
                                    if (serializeWriter.isEnabled(NON_STRINGKEY_AS_STRING)) {
                                        jSONSerializer.write((Object) str2);
                                    } else {
                                        jSONSerializer.write((Object) str2);
                                    }
                                    serializeWriter.write(58);
                                }
                                if (obj3 == null) {
                                    serializeWriter.writeNull();
                                    cls5 = cls5;
                                } else {
                                    cls = obj3.getClass();
                                    cls2 = cls5;
                                    if (cls != cls2) {
                                        objectWriter = jSONSerializer.getObjectWriter(cls);
                                        cls3 = cls;
                                    } else {
                                        cls3 = cls2;
                                    }
                                    objectSerializer = objectWriter;
                                    if (SerializerFeature.isEnabled(i10, SerializerFeature.WriteClassName)) {
                                        objectWriter = objectSerializer;
                                        objectWriter.write(jSONSerializer, obj3, str2, null, i10);
                                    } else {
                                        objectWriter = objectSerializer;
                                        objectWriter.write(jSONSerializer, obj3, str2, null, i10);
                                    }
                                    cls5 = cls3;
                                }
                                z12 = false;
                                z13 = false;
                            } else {
                                list3 = this.propertyFilters;
                                if (list3 != null) {
                                    if (key != null) {
                                        if (!apply(jSONSerializer, obj, key, value)) {
                                        }
                                    } else if (!apply(jSONSerializer, obj, key, value)) {
                                    }
                                }
                                list4 = jSONSerializer.nameFilters;
                                if (list4 != null) {
                                    if (key != null) {
                                        key = processKey(jSONSerializer, obj, key, value);
                                    } else {
                                        key = processKey(jSONSerializer, obj, key, value);
                                    }
                                }
                                list5 = this.nameFilters;
                                if (list5 != null) {
                                    if (key != null) {
                                        key = processKey(jSONSerializer, obj, key, value);
                                    } else {
                                        key = processKey(jSONSerializer, obj, key, value);
                                    }
                                }
                                str = key;
                                if (str != null) {
                                    str2 = str;
                                    objProcessValue = processValue(jSONSerializer, null, obj, str2, value);
                                    obj3 = objProcessValue;
                                } else {
                                    str2 = str;
                                    objProcessValue = processValue(jSONSerializer, null, obj, str2, value);
                                    obj3 = objProcessValue;
                                }
                                if (obj3 == null) {
                                }
                                if (str2 instanceof String) {
                                    String str13 = str2;
                                    if (!z13) {
                                        serializeWriter.write(44);
                                    }
                                    if (serializeWriter.isEnabled(SerializerFeature.PrettyFormat)) {
                                        jSONSerializer.println();
                                    }
                                    serializeWriter.writeFieldName(str13, true);
                                } else {
                                    if (!z13) {
                                        serializeWriter.write(44);
                                    }
                                    if (serializeWriter.isEnabled(NON_STRINGKEY_AS_STRING)) {
                                        jSONSerializer.write((Object) str2);
                                    } else {
                                        jSONSerializer.write((Object) str2);
                                    }
                                    serializeWriter.write(58);
                                }
                                if (obj3 == null) {
                                    serializeWriter.writeNull();
                                    cls5 = cls5;
                                } else {
                                    cls = obj3.getClass();
                                    cls2 = cls5;
                                    if (cls != cls2) {
                                        objectWriter = jSONSerializer.getObjectWriter(cls);
                                        cls3 = cls;
                                    } else {
                                        cls3 = cls2;
                                    }
                                    objectSerializer = objectWriter;
                                    if (SerializerFeature.isEnabled(i10, SerializerFeature.WriteClassName)) {
                                        objectWriter = objectSerializer;
                                        objectWriter.write(jSONSerializer, obj3, str2, null, i10);
                                    } else {
                                        objectWriter = objectSerializer;
                                        objectWriter.write(jSONSerializer, obj3, str2, null, i10);
                                    }
                                    cls5 = cls3;
                                }
                                z12 = false;
                                z13 = false;
                            }
                        } else {
                            list2 = jSONSerializer.propertyFilters;
                            if (list2 != null) {
                                list3 = this.propertyFilters;
                                if (list3 != null) {
                                    if (key != null) {
                                        if (!apply(jSONSerializer, obj, key, value)) {
                                        }
                                    } else if (!apply(jSONSerializer, obj, key, value)) {
                                    }
                                }
                                list4 = jSONSerializer.nameFilters;
                                if (list4 != null) {
                                    if (key != null) {
                                        key = processKey(jSONSerializer, obj, key, value);
                                    } else {
                                        key = processKey(jSONSerializer, obj, key, value);
                                    }
                                }
                                list5 = this.nameFilters;
                                if (list5 != null) {
                                    if (key != null) {
                                        key = processKey(jSONSerializer, obj, key, value);
                                    } else {
                                        key = processKey(jSONSerializer, obj, key, value);
                                    }
                                }
                                str = key;
                                if (str != null) {
                                    str2 = str;
                                    objProcessValue = processValue(jSONSerializer, null, obj, str2, value);
                                    obj3 = objProcessValue;
                                } else {
                                    str2 = str;
                                    objProcessValue = processValue(jSONSerializer, null, obj, str2, value);
                                    obj3 = objProcessValue;
                                }
                                if (obj3 == null) {
                                }
                                if (str2 instanceof String) {
                                    String str14 = str2;
                                    if (!z13) {
                                        serializeWriter.write(44);
                                    }
                                    if (serializeWriter.isEnabled(SerializerFeature.PrettyFormat)) {
                                        jSONSerializer.println();
                                    }
                                    serializeWriter.writeFieldName(str14, true);
                                } else {
                                    if (!z13) {
                                        serializeWriter.write(44);
                                    }
                                    if (serializeWriter.isEnabled(NON_STRINGKEY_AS_STRING)) {
                                        jSONSerializer.write((Object) str2);
                                    } else {
                                        jSONSerializer.write((Object) str2);
                                    }
                                    serializeWriter.write(58);
                                }
                                if (obj3 == null) {
                                    serializeWriter.writeNull();
                                    cls5 = cls5;
                                } else {
                                    cls = obj3.getClass();
                                    cls2 = cls5;
                                    if (cls != cls2) {
                                        objectWriter = jSONSerializer.getObjectWriter(cls);
                                        cls3 = cls;
                                    } else {
                                        cls3 = cls2;
                                    }
                                    objectSerializer = objectWriter;
                                    if (SerializerFeature.isEnabled(i10, SerializerFeature.WriteClassName)) {
                                        objectWriter = objectSerializer;
                                        objectWriter.write(jSONSerializer, obj3, str2, null, i10);
                                    } else {
                                        objectWriter = objectSerializer;
                                        objectWriter.write(jSONSerializer, obj3, str2, null, i10);
                                    }
                                    cls5 = cls3;
                                }
                                z12 = false;
                                z13 = false;
                            } else {
                                list3 = this.propertyFilters;
                                if (list3 != null) {
                                    if (key != null) {
                                        if (!apply(jSONSerializer, obj, key, value)) {
                                        }
                                    } else if (!apply(jSONSerializer, obj, key, value)) {
                                    }
                                }
                                list4 = jSONSerializer.nameFilters;
                                if (list4 != null) {
                                    if (key != null) {
                                        key = processKey(jSONSerializer, obj, key, value);
                                    } else {
                                        key = processKey(jSONSerializer, obj, key, value);
                                    }
                                }
                                list5 = this.nameFilters;
                                if (list5 != null) {
                                    if (key != null) {
                                        key = processKey(jSONSerializer, obj, key, value);
                                    } else {
                                        key = processKey(jSONSerializer, obj, key, value);
                                    }
                                }
                                str = key;
                                if (str != null) {
                                    str2 = str;
                                    objProcessValue = processValue(jSONSerializer, null, obj, str2, value);
                                    obj3 = objProcessValue;
                                } else {
                                    str2 = str;
                                    objProcessValue = processValue(jSONSerializer, null, obj, str2, value);
                                    obj3 = objProcessValue;
                                }
                                if (obj3 == null) {
                                }
                                if (str2 instanceof String) {
                                    String str15 = str2;
                                    if (!z13) {
                                        serializeWriter.write(44);
                                    }
                                    if (serializeWriter.isEnabled(SerializerFeature.PrettyFormat)) {
                                        jSONSerializer.println();
                                    }
                                    serializeWriter.writeFieldName(str15, true);
                                } else {
                                    if (!z13) {
                                        serializeWriter.write(44);
                                    }
                                    if (serializeWriter.isEnabled(NON_STRINGKEY_AS_STRING)) {
                                        jSONSerializer.write((Object) str2);
                                    } else {
                                        jSONSerializer.write((Object) str2);
                                    }
                                    serializeWriter.write(58);
                                }
                                if (obj3 == null) {
                                    serializeWriter.writeNull();
                                    cls5 = cls5;
                                } else {
                                    cls = obj3.getClass();
                                    cls2 = cls5;
                                    if (cls != cls2) {
                                        objectWriter = jSONSerializer.getObjectWriter(cls);
                                        cls3 = cls;
                                    } else {
                                        cls3 = cls2;
                                    }
                                    objectSerializer = objectWriter;
                                    if (SerializerFeature.isEnabled(i10, SerializerFeature.WriteClassName)) {
                                        objectWriter = objectSerializer;
                                        objectWriter.write(jSONSerializer, obj3, str2, null, i10);
                                    } else {
                                        objectWriter = objectSerializer;
                                        objectWriter.write(jSONSerializer, obj3, str2, null, i10);
                                    }
                                    cls5 = cls3;
                                }
                                z12 = false;
                                z13 = false;
                            }
                        }
                    }
                } else if ((!key.getClass().isPrimitive() && !(key instanceof Number)) || applyName(jSONSerializer, obj, JSON.toJSONString(key))) {
                    list = this.propertyPreFilters;
                    if (list != null) {
                        list2 = jSONSerializer.propertyFilters;
                        if (list2 != null) {
                            list3 = this.propertyFilters;
                            if (list3 != null) {
                                if (key != null) {
                                    if (!apply(jSONSerializer, obj, key, value)) {
                                    }
                                } else if (!apply(jSONSerializer, obj, key, value)) {
                                }
                            }
                            list4 = jSONSerializer.nameFilters;
                            if (list4 != null) {
                                if (key != null) {
                                    key = processKey(jSONSerializer, obj, key, value);
                                } else {
                                    key = processKey(jSONSerializer, obj, key, value);
                                }
                            }
                            list5 = this.nameFilters;
                            if (list5 != null) {
                                if (key != null) {
                                    key = processKey(jSONSerializer, obj, key, value);
                                } else {
                                    key = processKey(jSONSerializer, obj, key, value);
                                }
                            }
                            str = key;
                            if (str != null) {
                                str2 = str;
                                objProcessValue = processValue(jSONSerializer, null, obj, str2, value);
                                obj3 = objProcessValue;
                            } else {
                                str2 = str;
                                objProcessValue = processValue(jSONSerializer, null, obj, str2, value);
                                obj3 = objProcessValue;
                            }
                            if (obj3 == null) {
                            }
                            if (str2 instanceof String) {
                                String str16 = str2;
                                if (!z13) {
                                    serializeWriter.write(44);
                                }
                                if (serializeWriter.isEnabled(SerializerFeature.PrettyFormat)) {
                                    jSONSerializer.println();
                                }
                                serializeWriter.writeFieldName(str16, true);
                            } else {
                                if (!z13) {
                                    serializeWriter.write(44);
                                }
                                if (serializeWriter.isEnabled(NON_STRINGKEY_AS_STRING)) {
                                    jSONSerializer.write((Object) str2);
                                } else {
                                    jSONSerializer.write((Object) str2);
                                }
                                serializeWriter.write(58);
                            }
                            if (obj3 == null) {
                                serializeWriter.writeNull();
                                cls5 = cls5;
                            } else {
                                cls = obj3.getClass();
                                cls2 = cls5;
                                if (cls != cls2) {
                                    objectWriter = jSONSerializer.getObjectWriter(cls);
                                    cls3 = cls;
                                } else {
                                    cls3 = cls2;
                                }
                                objectSerializer = objectWriter;
                                if (SerializerFeature.isEnabled(i10, SerializerFeature.WriteClassName)) {
                                    objectWriter = objectSerializer;
                                    objectWriter.write(jSONSerializer, obj3, str2, null, i10);
                                } else {
                                    objectWriter = objectSerializer;
                                    objectWriter.write(jSONSerializer, obj3, str2, null, i10);
                                }
                                cls5 = cls3;
                            }
                            z12 = false;
                            z13 = false;
                        } else {
                            list3 = this.propertyFilters;
                            if (list3 != null) {
                                if (key != null) {
                                    if (!apply(jSONSerializer, obj, key, value)) {
                                    }
                                } else if (!apply(jSONSerializer, obj, key, value)) {
                                }
                            }
                            list4 = jSONSerializer.nameFilters;
                            if (list4 != null) {
                                if (key != null) {
                                    key = processKey(jSONSerializer, obj, key, value);
                                } else {
                                    key = processKey(jSONSerializer, obj, key, value);
                                }
                            }
                            list5 = this.nameFilters;
                            if (list5 != null) {
                                if (key != null) {
                                    key = processKey(jSONSerializer, obj, key, value);
                                } else {
                                    key = processKey(jSONSerializer, obj, key, value);
                                }
                            }
                            str = key;
                            if (str != null) {
                                str2 = str;
                                objProcessValue = processValue(jSONSerializer, null, obj, str2, value);
                                obj3 = objProcessValue;
                            } else {
                                str2 = str;
                                objProcessValue = processValue(jSONSerializer, null, obj, str2, value);
                                obj3 = objProcessValue;
                            }
                            if (obj3 == null) {
                            }
                            if (str2 instanceof String) {
                                String str17 = str2;
                                if (!z13) {
                                    serializeWriter.write(44);
                                }
                                if (serializeWriter.isEnabled(SerializerFeature.PrettyFormat)) {
                                    jSONSerializer.println();
                                }
                                serializeWriter.writeFieldName(str17, true);
                            } else {
                                if (!z13) {
                                    serializeWriter.write(44);
                                }
                                if (serializeWriter.isEnabled(NON_STRINGKEY_AS_STRING)) {
                                    jSONSerializer.write((Object) str2);
                                } else {
                                    jSONSerializer.write((Object) str2);
                                }
                                serializeWriter.write(58);
                            }
                            if (obj3 == null) {
                                serializeWriter.writeNull();
                                cls5 = cls5;
                            } else {
                                cls = obj3.getClass();
                                cls2 = cls5;
                                if (cls != cls2) {
                                    objectWriter = jSONSerializer.getObjectWriter(cls);
                                    cls3 = cls;
                                } else {
                                    cls3 = cls2;
                                }
                                objectSerializer = objectWriter;
                                if (SerializerFeature.isEnabled(i10, SerializerFeature.WriteClassName)) {
                                    objectWriter = objectSerializer;
                                    objectWriter.write(jSONSerializer, obj3, str2, null, i10);
                                } else {
                                    objectWriter = objectSerializer;
                                    objectWriter.write(jSONSerializer, obj3, str2, null, i10);
                                }
                                cls5 = cls3;
                            }
                            z12 = false;
                            z13 = false;
                        }
                    } else {
                        list2 = jSONSerializer.propertyFilters;
                        if (list2 != null) {
                            list3 = this.propertyFilters;
                            if (list3 != null) {
                                if (key != null) {
                                    if (!apply(jSONSerializer, obj, key, value)) {
                                    }
                                } else if (!apply(jSONSerializer, obj, key, value)) {
                                }
                            }
                            list4 = jSONSerializer.nameFilters;
                            if (list4 != null) {
                                if (key != null) {
                                    key = processKey(jSONSerializer, obj, key, value);
                                } else {
                                    key = processKey(jSONSerializer, obj, key, value);
                                }
                            }
                            list5 = this.nameFilters;
                            if (list5 != null) {
                                if (key != null) {
                                    key = processKey(jSONSerializer, obj, key, value);
                                } else {
                                    key = processKey(jSONSerializer, obj, key, value);
                                }
                            }
                            str = key;
                            if (str != null) {
                                str2 = str;
                                objProcessValue = processValue(jSONSerializer, null, obj, str2, value);
                                obj3 = objProcessValue;
                            } else {
                                str2 = str;
                                objProcessValue = processValue(jSONSerializer, null, obj, str2, value);
                                obj3 = objProcessValue;
                            }
                            if (obj3 == null) {
                            }
                            if (str2 instanceof String) {
                                String str18 = str2;
                                if (!z13) {
                                    serializeWriter.write(44);
                                }
                                if (serializeWriter.isEnabled(SerializerFeature.PrettyFormat)) {
                                    jSONSerializer.println();
                                }
                                serializeWriter.writeFieldName(str18, true);
                            } else {
                                if (!z13) {
                                    serializeWriter.write(44);
                                }
                                if (serializeWriter.isEnabled(NON_STRINGKEY_AS_STRING)) {
                                    jSONSerializer.write((Object) str2);
                                } else {
                                    jSONSerializer.write((Object) str2);
                                }
                                serializeWriter.write(58);
                            }
                            if (obj3 == null) {
                                serializeWriter.writeNull();
                                cls5 = cls5;
                            } else {
                                cls = obj3.getClass();
                                cls2 = cls5;
                                if (cls != cls2) {
                                    objectWriter = jSONSerializer.getObjectWriter(cls);
                                    cls3 = cls;
                                } else {
                                    cls3 = cls2;
                                }
                                objectSerializer = objectWriter;
                                if (SerializerFeature.isEnabled(i10, SerializerFeature.WriteClassName)) {
                                    objectWriter = objectSerializer;
                                    objectWriter.write(jSONSerializer, obj3, str2, null, i10);
                                } else {
                                    objectWriter = objectSerializer;
                                    objectWriter.write(jSONSerializer, obj3, str2, null, i10);
                                }
                                cls5 = cls3;
                            }
                            z12 = false;
                            z13 = false;
                        } else {
                            list3 = this.propertyFilters;
                            if (list3 != null) {
                                if (key != null) {
                                    if (!apply(jSONSerializer, obj, key, value)) {
                                    }
                                } else if (!apply(jSONSerializer, obj, key, value)) {
                                }
                            }
                            list4 = jSONSerializer.nameFilters;
                            if (list4 != null) {
                                if (key != null) {
                                    key = processKey(jSONSerializer, obj, key, value);
                                } else {
                                    key = processKey(jSONSerializer, obj, key, value);
                                }
                            }
                            list5 = this.nameFilters;
                            if (list5 != null) {
                                if (key != null) {
                                    key = processKey(jSONSerializer, obj, key, value);
                                } else {
                                    key = processKey(jSONSerializer, obj, key, value);
                                }
                            }
                            str = key;
                            if (str != null) {
                                str2 = str;
                                objProcessValue = processValue(jSONSerializer, null, obj, str2, value);
                                obj3 = objProcessValue;
                            } else {
                                str2 = str;
                                objProcessValue = processValue(jSONSerializer, null, obj, str2, value);
                                obj3 = objProcessValue;
                            }
                            if (obj3 == null) {
                            }
                            if (str2 instanceof String) {
                                String str19 = str2;
                                if (!z13) {
                                    serializeWriter.write(44);
                                }
                                if (serializeWriter.isEnabled(SerializerFeature.PrettyFormat)) {
                                    jSONSerializer.println();
                                }
                                serializeWriter.writeFieldName(str19, true);
                            } else {
                                if (!z13) {
                                    serializeWriter.write(44);
                                }
                                if (serializeWriter.isEnabled(NON_STRINGKEY_AS_STRING)) {
                                    jSONSerializer.write((Object) str2);
                                } else {
                                    jSONSerializer.write((Object) str2);
                                }
                                serializeWriter.write(58);
                            }
                            if (obj3 == null) {
                                serializeWriter.writeNull();
                                cls5 = cls5;
                            } else {
                                cls = obj3.getClass();
                                cls2 = cls5;
                                if (cls != cls2) {
                                    objectWriter = jSONSerializer.getObjectWriter(cls);
                                    cls3 = cls;
                                } else {
                                    cls3 = cls2;
                                }
                                objectSerializer = objectWriter;
                                if (SerializerFeature.isEnabled(i10, SerializerFeature.WriteClassName)) {
                                    objectWriter = objectSerializer;
                                    objectWriter.write(jSONSerializer, obj3, str2, null, i10);
                                } else {
                                    objectWriter = objectSerializer;
                                    objectWriter.write(jSONSerializer, obj3, str2, null, i10);
                                }
                                cls5 = cls3;
                            }
                            z12 = false;
                            z13 = false;
                        }
                    }
                }
                cls5 = cls5;
                cls5 = cls5;
                z12 = false;
            }
        }
        jSONSerializer.context = serialContext;
        jSONSerializer.decrementIdent();
        if (serializeWriter.isEnabled(SerializerFeature.PrettyFormat) && treeMap.size() > 0) {
            jSONSerializer.println();
        }
        if (z10) {
            return;
        }
        serializeWriter.write(125);
    }
}
