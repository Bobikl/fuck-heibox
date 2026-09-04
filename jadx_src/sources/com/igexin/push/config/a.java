package com.igexin.push.config;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.igexin.push.core.a.r;
import com.igexin.push.core.w;
import java.io.File;
import java.util.Iterator;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes.dex */
public class a implements com.igexin.push.core.b.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f63409a = "com.igexin.push.config.a";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static a f63410b;

    public static a a() {
        if (f63410b == null) {
            f63410b = new a();
        }
        return f63410b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(SQLiteDatabase sQLiteDatabase, int i10) {
        sQLiteDatabase.delete("config", "id = ?", new String[]{String.valueOf(i10)});
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(SQLiteDatabase sQLiteDatabase, int i10, String str) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", Integer.valueOf(i10));
        contentValues.put("value", str);
        sQLiteDatabase.replace("config", null, contentValues);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(SQLiteDatabase sQLiteDatabase, int i10, byte[] bArr) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", Integer.valueOf(i10));
        contentValues.put("value", bArr);
        sQLiteDatabase.replace("config", null, contentValues);
    }

    @Override // com.igexin.push.core.b.b
    public void a(SQLiteDatabase sQLiteDatabase) {
    }

    public void a(String str) {
        com.igexin.a.a.b.c.b().a(new g(this, str), true, false);
    }

    public void b() {
        com.igexin.a.a.b.c.b().a(new b(this), false, true);
    }

    /* JADX WARN: Code duplicated, block: B:157:0x027b A[PHI: r12
  0x027b: PHI (r12v3 android.database.Cursor) = (r12v2 android.database.Cursor), (r12v21 android.database.Cursor) binds: [B:156:0x0279, B:153:0x0275] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:160:0x02ad  */
    /* JADX WARN: Code duplicated, block: B:162:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:164:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:167:0x02e5  */
    /* JADX WARN: Code duplicated, block: B:173:0x0313 A[Catch: Exception -> 0x0327, TryCatch #3 {Exception -> 0x0327, blocks: (B:171:0x0305, B:173:0x0313, B:175:0x0321), top: B:188:0x0305 }] */
    /* JADX WARN: Code duplicated, block: B:175:0x0321 A[Catch: Exception -> 0x0327, TRY_LEAVE, TryCatch #3 {Exception -> 0x0327, blocks: (B:171:0x0305, B:173:0x0313, B:175:0x0321), top: B:188:0x0305 }] */
    /* JADX WARN: Code duplicated, block: B:184:0x017c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:188:0x0305 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:193:0x02f7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:195:0x02df A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:199:0x0324 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:203:0x0245 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:204:0x0237 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:205:0x0229 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:206:0x021b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:207:0x020d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:208:0x0203 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:209:0x01fa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:210:0x01ec A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:211:0x01de A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:212:0x01d0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:213:0x01c7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:214:0x01be A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:215:0x01b5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:216:0x01a7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:217:0x018f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:218:0x019d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:219:0x0143 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:220:0x0151 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:221:0x015f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:222:0x016e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:223:0x00a1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:224:0x00aa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:225:0x00b8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:226:0x00c6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:227:0x00d0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:228:0x00de A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:229:0x00f4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:230:0x0102 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:231:0x0110 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:232:0x011e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:233:0x012c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:234:0x013a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:235:0x00b0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:236:0x00be A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:237:0x00cc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:238:0x00d6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:239:0x00eb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:240:0x00fa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:241:0x0108 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:242:0x0116 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:243:0x0124 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:244:0x0132 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:245:0x009c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:246:0x0149 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:247:0x0157 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:248:0x0165 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:249:0x0174 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:250:0x0099 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:251:0x0195 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:252:0x0096 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:253:0x01ad A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:254:0x0092 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:255:0x0090 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:256:0x008e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:257:0x008c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:258:0x01d6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:259:0x0088 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:260:0x01e4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:261:0x01f2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:262:0x0084 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:263:0x0080 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:264:0x0209 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:265:0x007e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:266:0x0213 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:267:0x007a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:268:0x0221 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:269:0x0077 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:270:0x022f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:271:0x0074 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:272:0x023d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:273:0x0071 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:274:0x024b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:275:0x006e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:290:0x0019 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:292:0x0019 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:294:0x0019 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:296:0x0019 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:298:0x0019 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:300:0x0019 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:303:0x0019 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:305:0x0019 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:307:0x0019 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:312:0x0019 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:315:0x0019 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:318:0x0019 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:320:0x0019 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:322:0x0019 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:324:0x0019 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:326:0x0019 A[DONT_GENERATE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:328:0x0019 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:330:0x0019 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:332:0x0019 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:334:0x0019 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:336:0x0019 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:338:0x0019 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:340:0x0019 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:342:0x0019 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:344:0x0019 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:346:0x0019 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:350:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:164:0x02bb, please report this as an issue */
    @Override // com.igexin.push.core.b.b
    public void b(SQLiteDatabase sQLiteDatabase) {
        Cursor cursorQuery;
        String str;
        com.igexin.push.core.bean.e eVar;
        Iterator<Integer> it;
        com.igexin.push.core.bean.d dVar;
        byte[] blob;
        String string;
        String str2;
        try {
            cursorQuery = sQLiteDatabase.query("config", new String[]{"id", "value"}, null, null, null, null, "id");
            if (cursorQuery != null) {
                while (cursorQuery.moveToNext()) {
                    try {
                        int i10 = cursorQuery.getInt(0);
                        if (i10 == 20 || i10 == 21 || i10 == 22 || i10 == 24 || i10 == 26 || i10 == 45 || i10 == 51 || i10 == 56 || i10 == 58 || i10 == 62 || i10 == 64) {
                            blob = cursorQuery.getBlob(1);
                            if (blob != null) {
                                blob = com.igexin.a.a.a.a.c(blob, com.igexin.push.core.d.C);
                            }
                            string = null;
                            if (blob == null || string != null) {
                                if (i10 != 1) {
                                    if (i10 != 2) {
                                        if (i10 != 3) {
                                            if (i10 != 4) {
                                                if (i10 != 7) {
                                                    if (i10 != 28) {
                                                        if (i10 != 64) {
                                                            l.L = new String(blob);
                                                        } else if (i10 != 66) {
                                                            if (i10 != 15) {
                                                                if (i10 != 16) {
                                                                    if (i10 != 21) {
                                                                        l.f63431i = new String(blob);
                                                                    } else if (i10 != 22) {
                                                                        l.f63432j = new String(blob);
                                                                    } else if (i10 != 58) {
                                                                        l.B = new String(blob);
                                                                    } else if (i10 != 59) {
                                                                        switch (i10) {
                                                                            case 24:
                                                                                n.a(new String(blob), false);
                                                                                break;
                                                                            case 25:
                                                                                if (!string.equals("null")) {
                                                                                    l.f63435m = Boolean.parseBoolean(string);
                                                                                }
                                                                                break;
                                                                            case 26:
                                                                                try {
                                                                                    SDKUrlConfig.setIdcConfigUrl(r.a(new JSONArray(new String(blob))));
                                                                                } catch (Exception unused) {
                                                                                }
                                                                                break;
                                                                            default:
                                                                                switch (i10) {
                                                                                    case 40:
                                                                                        if (!string.equals("null")) {
                                                                                            l.f63442t = Integer.parseInt(string);
                                                                                        }
                                                                                        break;
                                                                                    case 41:
                                                                                        if (!string.equals("null")) {
                                                                                            l.f63443u = Integer.parseInt(string);
                                                                                        }
                                                                                        break;
                                                                                    case 42:
                                                                                        if (!string.equals("null")) {
                                                                                            l.f63444v = Integer.parseInt(string);
                                                                                        }
                                                                                        break;
                                                                                    case 43:
                                                                                        if (!string.equals("null")) {
                                                                                            l.f63445w = Integer.parseInt(string);
                                                                                        }
                                                                                        break;
                                                                                    default:
                                                                                        switch (i10) {
                                                                                            case 45:
                                                                                                l.f63446x = new String(blob);
                                                                                                break;
                                                                                            case 46:
                                                                                                if (!string.equals("null")) {
                                                                                                    l.C = Boolean.parseBoolean(string);
                                                                                                }
                                                                                                break;
                                                                                            case 47:
                                                                                                if (!string.equals("null")) {
                                                                                                    l.D = Boolean.parseBoolean(string);
                                                                                                }
                                                                                                break;
                                                                                            case 48:
                                                                                                if (!string.equals("null")) {
                                                                                                    l.E = Boolean.parseBoolean(string);
                                                                                                }
                                                                                                break;
                                                                                            case 49:
                                                                                                if (!string.equals("null")) {
                                                                                                    l.F = Boolean.parseBoolean(string);
                                                                                                }
                                                                                                break;
                                                                                            case 50:
                                                                                                if (!string.equals("null")) {
                                                                                                    l.H = Boolean.parseBoolean(string);
                                                                                                }
                                                                                                break;
                                                                                            case 51:
                                                                                                str2 = new String(blob);
                                                                                                l.f63447y = str2;
                                                                                                if (!TextUtils.isEmpty(str2)) {
                                                                                                    w.a().e();
                                                                                                }
                                                                                                break;
                                                                                            case 52:
                                                                                                if (!string.equals("null")) {
                                                                                                    l.G = Boolean.parseBoolean(string);
                                                                                                }
                                                                                                break;
                                                                                            case 53:
                                                                                                if (!string.equals("null")) {
                                                                                                    l.K = string;
                                                                                                }
                                                                                                break;
                                                                                            case 54:
                                                                                                if (!string.equals("null")) {
                                                                                                    l.I = Boolean.parseBoolean(string);
                                                                                                }
                                                                                                break;
                                                                                            case 55:
                                                                                                if (!string.equals("null")) {
                                                                                                    l.f63448z = Boolean.parseBoolean(string);
                                                                                                }
                                                                                                break;
                                                                                            case 56:
                                                                                                l.A = new String(blob);
                                                                                                break;
                                                                                        }
                                                                                        break;
                                                                                }
                                                                                break;
                                                                        }
                                                                    } else if (!string.equals("null")) {
                                                                        l.M = Long.parseLong(string);
                                                                    }
                                                                } else if (!string.equals("null")) {
                                                                    l.f63427e = Integer.parseInt(string);
                                                                }
                                                            } else if (!string.equals("null")) {
                                                                l.f63426d = Integer.parseInt(string);
                                                            }
                                                        } else if (!string.equals("null")) {
                                                            l.J = Boolean.parseBoolean(string);
                                                        }
                                                    } else if (!string.equals("null")) {
                                                        l.f63441s = string;
                                                    }
                                                } else if (!string.equals("null")) {
                                                    l.f63429g = Boolean.parseBoolean(string);
                                                }
                                            } else if (!string.equals("null")) {
                                                l.f63428f = Boolean.parseBoolean(string);
                                            }
                                        } else if (!string.equals("null")) {
                                            l.f63425c = Long.parseLong(string);
                                        }
                                    } else if (!string.equals("null")) {
                                        l.f63424b = Integer.parseInt(string);
                                    }
                                } else if (!string.equals("null")) {
                                    l.f63423a = Integer.parseInt(string);
                                }
                            }
                        } else {
                            try {
                                string = cursorQuery.getString(1);
                                blob = null;
                                if (blob == null) {
                                }
                                if (i10 != 1) {
                                    if (i10 != 2) {
                                        if (i10 != 3) {
                                            if (i10 != 4) {
                                                if (i10 != 7) {
                                                    if (i10 != 28) {
                                                        if (i10 != 64) {
                                                            l.L = new String(blob);
                                                        } else if (i10 != 66) {
                                                            if (i10 != 15) {
                                                                if (i10 != 16) {
                                                                    if (i10 != 21) {
                                                                        l.f63431i = new String(blob);
                                                                    } else if (i10 != 22) {
                                                                        l.f63432j = new String(blob);
                                                                    } else if (i10 != 58) {
                                                                        l.B = new String(blob);
                                                                    } else if (i10 != 59) {
                                                                        switch (i10) {
                                                                            case 24:
                                                                                n.a(new String(blob), false);
                                                                                break;
                                                                            case 25:
                                                                                if (!string.equals("null")) {
                                                                                    l.f63435m = Boolean.parseBoolean(string);
                                                                                }
                                                                                break;
                                                                            case 26:
                                                                                SDKUrlConfig.setIdcConfigUrl(r.a(new JSONArray(new String(blob))));
                                                                                break;
                                                                            default:
                                                                                switch (i10) {
                                                                                    case 40:
                                                                                        if (!string.equals("null")) {
                                                                                            l.f63442t = Integer.parseInt(string);
                                                                                        }
                                                                                        break;
                                                                                    case 41:
                                                                                        if (!string.equals("null")) {
                                                                                            l.f63443u = Integer.parseInt(string);
                                                                                        }
                                                                                        break;
                                                                                    case 42:
                                                                                        if (!string.equals("null")) {
                                                                                            l.f63444v = Integer.parseInt(string);
                                                                                        }
                                                                                        break;
                                                                                    case 43:
                                                                                        if (!string.equals("null")) {
                                                                                            l.f63445w = Integer.parseInt(string);
                                                                                        }
                                                                                        break;
                                                                                    default:
                                                                                        switch (i10) {
                                                                                            case 45:
                                                                                                l.f63446x = new String(blob);
                                                                                                break;
                                                                                            case 46:
                                                                                                if (!string.equals("null")) {
                                                                                                    l.C = Boolean.parseBoolean(string);
                                                                                                }
                                                                                                break;
                                                                                            case 47:
                                                                                                if (!string.equals("null")) {
                                                                                                    l.D = Boolean.parseBoolean(string);
                                                                                                }
                                                                                                break;
                                                                                            case 48:
                                                                                                if (!string.equals("null")) {
                                                                                                    l.E = Boolean.parseBoolean(string);
                                                                                                }
                                                                                                break;
                                                                                            case 49:
                                                                                                if (!string.equals("null")) {
                                                                                                    l.F = Boolean.parseBoolean(string);
                                                                                                }
                                                                                                break;
                                                                                            case 50:
                                                                                                if (!string.equals("null")) {
                                                                                                    l.H = Boolean.parseBoolean(string);
                                                                                                }
                                                                                                break;
                                                                                            case 51:
                                                                                                str2 = new String(blob);
                                                                                                l.f63447y = str2;
                                                                                                if (!TextUtils.isEmpty(str2)) {
                                                                                                    w.a().e();
                                                                                                }
                                                                                                break;
                                                                                            case 52:
                                                                                                if (!string.equals("null")) {
                                                                                                    l.G = Boolean.parseBoolean(string);
                                                                                                }
                                                                                                break;
                                                                                            case 53:
                                                                                                if (!string.equals("null")) {
                                                                                                    l.K = string;
                                                                                                }
                                                                                                break;
                                                                                            case 54:
                                                                                                if (!string.equals("null")) {
                                                                                                    l.I = Boolean.parseBoolean(string);
                                                                                                }
                                                                                                break;
                                                                                            case 55:
                                                                                                if (!string.equals("null")) {
                                                                                                    l.f63448z = Boolean.parseBoolean(string);
                                                                                                }
                                                                                                break;
                                                                                            case 56:
                                                                                                l.A = new String(blob);
                                                                                                break;
                                                                                        }
                                                                                        break;
                                                                                }
                                                                                break;
                                                                        }
                                                                    } else if (!string.equals("null")) {
                                                                        l.M = Long.parseLong(string);
                                                                    }
                                                                } else if (!string.equals("null")) {
                                                                    l.f63427e = Integer.parseInt(string);
                                                                }
                                                            } else if (!string.equals("null")) {
                                                                l.f63426d = Integer.parseInt(string);
                                                            }
                                                        } else if (!string.equals("null")) {
                                                            l.J = Boolean.parseBoolean(string);
                                                        }
                                                    } else if (!string.equals("null")) {
                                                        l.f63441s = string;
                                                    }
                                                } else if (!string.equals("null")) {
                                                    l.f63429g = Boolean.parseBoolean(string);
                                                }
                                            } else if (!string.equals("null")) {
                                                l.f63428f = Boolean.parseBoolean(string);
                                            }
                                        } else if (!string.equals("null")) {
                                            l.f63425c = Long.parseLong(string);
                                        }
                                    } else if (!string.equals("null")) {
                                        l.f63424b = Integer.parseInt(string);
                                    }
                                } else if (!string.equals("null")) {
                                    l.f63423a = Integer.parseInt(string);
                                }
                            } catch (Throwable th2) {
                                com.igexin.a.a.c.b.a(f63409a + "|" + th2.toString(), new Object[0]);
                            }
                        }
                    } catch (Throwable unused2) {
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                        StringBuilder sb2 = new StringBuilder();
                        str = f63409a;
                        sb2.append(str);
                        sb2.append("|current ver = ");
                        sb2.append("4.4.3.15");
                        sb2.append(", last ver = ");
                        sb2.append(com.igexin.push.core.d.L);
                        com.igexin.a.a.c.b.a(sb2.toString(), new Object[0]);
                        if ("4.4.3.15".equals(com.igexin.push.core.d.L)) {
                        }
                        eVar = l.f63430h;
                        if (eVar != null) {
                            if (!eVar.a().isEmpty()) {
                                com.igexin.a.a.c.b.a(str + "|extMap is empty  = false", new Object[0]);
                                it = l.f63430h.a().keySet().iterator();
                                while (it.hasNext()) {
                                    dVar = l.f63430h.a().get(it.next());
                                    if (dVar != null) {
                                        com.igexin.push.util.d.b(dVar.a());
                                    }
                                }
                            }
                            l.f63430h = null;
                            g();
                        } else {
                            try {
                                for (File file : new File(com.igexin.push.core.d.V).listFiles()) {
                                    if (file.getName().startsWith("tdata_")) {
                                        file.delete();
                                    }
                                }
                            } catch (Exception unused3) {
                            }
                        }
                        com.igexin.push.core.b.i.a().e("4.4.3.15");
                        com.igexin.push.core.b.i.a().c(0L);
                    }
                }
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
        } catch (Throwable unused4) {
            cursorQuery = null;
        }
        StringBuilder sb3 = new StringBuilder();
        str = f63409a;
        sb3.append(str);
        sb3.append("|current ver = ");
        sb3.append("4.4.3.15");
        sb3.append(", last ver = ");
        sb3.append(com.igexin.push.core.d.L);
        com.igexin.a.a.c.b.a(sb3.toString(), new Object[0]);
        if ("4.4.3.15".equals(com.igexin.push.core.d.L)) {
            eVar = l.f63430h;
            if (eVar != null) {
                if (!eVar.a().isEmpty()) {
                    com.igexin.a.a.c.b.a(str + "|extMap is empty  = false", new Object[0]);
                    it = l.f63430h.a().keySet().iterator();
                    while (it.hasNext()) {
                        dVar = l.f63430h.a().get(it.next());
                        if (dVar != null) {
                            com.igexin.push.util.d.b(dVar.a());
                        }
                    }
                }
                l.f63430h = null;
                g();
            } else {
                while (i < r0) {
                    if (file.getName().startsWith("tdata_")) {
                        file.delete();
                    }
                }
            }
            com.igexin.push.core.b.i.a().e("4.4.3.15");
            com.igexin.push.core.b.i.a().c(0L);
        }
    }

    public void b(String str) {
        com.igexin.a.a.b.c.b().a(new h(this, str), true, false);
    }

    public void c() {
        com.igexin.a.a.b.c.b().a(new c(this), false, true);
    }

    @Override // com.igexin.push.core.b.b
    public void c(SQLiteDatabase sQLiteDatabase) {
        a(sQLiteDatabase, 1, String.valueOf(l.f63423a));
        a(sQLiteDatabase, 2, String.valueOf(l.f63424b));
        a(sQLiteDatabase, 3, String.valueOf(l.f63425c));
        a(sQLiteDatabase, 4, String.valueOf(l.f63428f));
        a(sQLiteDatabase, 7, String.valueOf(l.f63429g));
        a(sQLiteDatabase, 15, String.valueOf(l.f63426d));
        a(sQLiteDatabase, 3, String.valueOf(l.f63425c));
        a(sQLiteDatabase, 25, String.valueOf(l.f63435m));
    }

    public void d() {
        com.igexin.a.a.b.c.b().a(new d(this), false, true);
    }

    public void e() {
        com.igexin.a.a.b.c.b().a(new e(this), false, true);
    }

    public void f() {
        com.igexin.a.a.b.c.b().a(new f(this), false, true);
    }

    public void g() {
        com.igexin.a.a.b.c.b().a(new i(this), true, false);
    }
}
