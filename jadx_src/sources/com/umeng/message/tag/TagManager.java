package com.umeng.message.tag;

import android.app.Application;
import android.text.TextUtils;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.umeng.message.MessageSharedPrefs;
import com.umeng.message.PushAgent;
import com.umeng.message.api.UPushTagCallback;
import com.umeng.message.common.UPLog;
import com.umeng.message.common.inter.ITagManager;
import com.umeng.message.proguard.ar;
import com.umeng.message.proguard.av;
import com.umeng.message.proguard.b;
import com.umeng.message.proguard.d;
import com.umeng.message.proguard.e;
import com.umeng.message.proguard.f;
import com.umeng.message.proguard.x;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class TagManager {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile TagManager f105933b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ITagManager f105934a = new ar();

    @Deprecated
    public interface TCallBack extends UPushTagCallback<ITagManager.Result> {
    }

    @Deprecated
    public interface TagListCallBack extends UPushTagCallback<List<String>> {
    }

    private TagManager() {
    }

    static /* synthetic */ boolean a() {
        if (TextUtils.isEmpty(d.o(x.a()))) {
            UPLog.e("TagManager", "utdid empty.");
            return true;
        }
        if (f.b()) {
            UPLog.d("TagManager", "check tag failed, silent mode!");
            return true;
        }
        if (!TextUtils.isEmpty(PushAgent.getInstance(x.a()).getRegistrationId())) {
            return false;
        }
        UPLog.e("TagManager", "deviceToken empty.");
        return true;
    }

    static /* synthetic */ boolean b() {
        boolean z10 = MessageSharedPrefs.getInstance(x.a()).f105562b.b("tag_send_policy", -1) == 1;
        if (z10) {
            UPLog.d("TagManager", "tag server disable!");
        }
        return z10;
    }

    static /* synthetic */ JSONObject d() throws JSONException {
        Application applicationA = x.a();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("header", e.a());
        jSONObject.put("utdid", d.o(applicationA));
        jSONObject.put(RemoteMessageConst.DEVICE_TOKEN, MessageSharedPrefs.getInstance(applicationA).k());
        jSONObject.put("ts", System.currentTimeMillis());
        return jSONObject;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ITagManager.Result e() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("success", ITagManager.SUCCESS);
            jSONObject.put("remain", MessageSharedPrefs.getInstance(x.a()).d());
        } catch (Exception e10) {
            UPLog.e("TagManager", e10);
        }
        return new ITagManager.Result(jSONObject);
    }

    public static TagManager getInstance() {
        if (f105933b == null) {
            synchronized (TagManager.class) {
                if (f105933b == null) {
                    f105933b = new TagManager();
                }
            }
        }
        return f105933b;
    }

    public void addTags(final UPushTagCallback<ITagManager.Result> uPushTagCallback, final String... strArr) {
        b.b(new Runnable() { // from class: com.umeng.message.tag.TagManager.1
            @Override // java.lang.Runnable
            public final void run() {
                ITagManager.Result result = new ITagManager.Result();
                boolean z10 = false;
                try {
                    String[] strArr2 = strArr;
                    if (strArr2 != null && strArr2.length != 0) {
                        if (TagManager.a()) {
                            UPLog.e("TagManager", "No utdid or device_token");
                            result.setErrors("No utdid or device_token");
                            try {
                                uPushTagCallback.onMessage(false, result);
                                return;
                            } catch (Throwable th2) {
                                UPLog.e("TagManager", th2);
                                return;
                            }
                        }
                        if (TagManager.b()) {
                            UPLog.e("TagManager", "Tag api is disabled by the server");
                            result.setErrors("Tag api is disabled by the server");
                            try {
                                uPushTagCallback.onMessage(false, result);
                                return;
                            } catch (Throwable th3) {
                                UPLog.e("TagManager", th3);
                                return;
                            }
                        }
                        Application applicationA = x.a();
                        ArrayList arrayList = new ArrayList();
                        Set<String> setB = MessageSharedPrefs.getInstance(applicationA).f105562b.b("tags", new HashSet());
                        for (String str : strArr) {
                            if (!setB.contains(str) && !arrayList.contains(str)) {
                                byte[] bytes = str.getBytes();
                                if (bytes == null || bytes.length > 128 || bytes.length <= 0) {
                                    UPLog.e("TagManager", "tag length must be 1~128 byte");
                                    result.setErrors("tag length must be 1~128 byte");
                                    try {
                                        uPushTagCallback.onMessage(false, result);
                                        return;
                                    } catch (Throwable th4) {
                                        UPLog.e("TagManager", th4);
                                        return;
                                    }
                                }
                                arrayList.add(str);
                            }
                        }
                        if (arrayList.size() > MessageSharedPrefs.getInstance(applicationA).d()) {
                            UPLog.e("TagManager", "tag count limit");
                            result.setErrors("tag count limit");
                            try {
                                uPushTagCallback.onMessage(false, result);
                                return;
                            } catch (Throwable th5) {
                                UPLog.e("TagManager", th5);
                                return;
                            }
                        }
                        if (!MessageSharedPrefs.getInstance(applicationA).a("tag_add_")) {
                            UPLog.e("TagManager", "interval limit");
                            result.setErrors("interval limit");
                            try {
                                uPushTagCallback.onMessage(false, result);
                                return;
                            } catch (Throwable th6) {
                                UPLog.e("TagManager", th6);
                                return;
                            }
                        }
                        if (arrayList.size() == 0) {
                            try {
                                uPushTagCallback.onMessage(true, TagManager.e());
                                return;
                            } catch (Throwable th7) {
                                UPLog.e("TagManager", th7);
                                return;
                            }
                        }
                        try {
                            JSONObject jSONObjectD = TagManager.d();
                            jSONObjectD.put("tags", av.a(arrayList));
                            result = TagManager.this.f105934a.addTags(jSONObjectD, strArr);
                            z10 = true;
                        } catch (Exception e10) {
                            UPLog.e("TagManager", e10);
                        }
                        try {
                            uPushTagCallback.onMessage(z10, result);
                            return;
                        } catch (Throwable th8) {
                            UPLog.e("TagManager", th8);
                            return;
                        }
                    }
                    UPLog.e("TagManager", "No tags");
                    result.setErrors("No tags");
                    try {
                        uPushTagCallback.onMessage(false, result);
                    } catch (Throwable th9) {
                        UPLog.e("TagManager", th9);
                    }
                } catch (Throwable th10) {
                    try {
                        UPLog.e("TagManager", th10);
                    } finally {
                        try {
                            uPushTagCallback.onMessage(false, result);
                        } catch (Throwable th11) {
                            UPLog.e("TagManager", th11);
                        }
                    }
                }
            }
        });
    }

    public void deleteTags(final UPushTagCallback<ITagManager.Result> uPushTagCallback, final String... strArr) {
        b.b(new Runnable() { // from class: com.umeng.message.tag.TagManager.2
            @Override // java.lang.Runnable
            public final void run() {
                ITagManager.Result result = new ITagManager.Result();
                boolean z10 = false;
                try {
                    Application applicationA = x.a();
                    String[] strArr2 = strArr;
                    if (strArr2 != null && strArr2.length > 0) {
                        for (String str : strArr2) {
                            byte[] bytes = str.getBytes();
                            int i10 = (bytes != null && bytes.length <= 128 && bytes.length > 0) ? i10 + 1 : 0;
                            result.setErrors("tag length must be 1~128 byte.");
                            try {
                                uPushTagCallback.onMessage(false, result);
                                return;
                            } catch (Throwable th2) {
                                UPLog.e("TagManager", th2);
                                return;
                            }
                        }
                    }
                    if (!MessageSharedPrefs.getInstance(applicationA).a("tag_del_")) {
                        UPLog.e("TagManager", "interval limit");
                        result.setErrors("interval limit");
                        try {
                            uPushTagCallback.onMessage(false, result);
                            return;
                        } catch (Throwable th3) {
                            UPLog.e("TagManager", th3);
                            return;
                        }
                    }
                    if (TagManager.b()) {
                        result.setErrors("tag server disable.");
                        try {
                            uPushTagCallback.onMessage(false, result);
                            return;
                        } catch (Throwable th4) {
                            UPLog.e("TagManager", th4);
                            return;
                        }
                    }
                    if (TagManager.a()) {
                        result.setErrors("check request failed.");
                        try {
                            uPushTagCallback.onMessage(false, result);
                            return;
                        } catch (Throwable th5) {
                            UPLog.e("TagManager", th5);
                            return;
                        }
                    }
                    String[] strArr3 = strArr;
                    if (strArr3 == null || strArr3.length == 0) {
                        UPLog.e("TagManager", "No tags.");
                        result.setErrors("No tags.");
                        try {
                            uPushTagCallback.onMessage(true, result);
                            return;
                        } catch (Throwable th6) {
                            UPLog.e("TagManager", th6);
                            return;
                        }
                    }
                    try {
                        JSONObject jSONObjectD = TagManager.d();
                        String[] strArr4 = strArr;
                        jSONObjectD.put("tags", strArr4 == null ? "" : av.a(Arrays.asList(strArr4)));
                        result = TagManager.this.f105934a.deleteTags(jSONObjectD, strArr);
                        z10 = true;
                    } catch (Exception e10) {
                        UPLog.e("TagManager", e10);
                    }
                    try {
                        uPushTagCallback.onMessage(z10, result);
                    } catch (Throwable th7) {
                        UPLog.e("TagManager", th7);
                    }
                } catch (Throwable th8) {
                    try {
                        UPLog.e("TagManager", th8);
                    } finally {
                        try {
                            uPushTagCallback.onMessage(false, result);
                        } catch (Throwable th9) {
                            UPLog.e("TagManager", th9);
                        }
                    }
                }
            }
        });
    }

    public void getTags(final UPushTagCallback<List<String>> uPushTagCallback) {
        b.b(new Runnable() { // from class: com.umeng.message.tag.TagManager.3
            @Override // java.lang.Runnable
            public final void run() {
                ArrayList arrayList = new ArrayList();
                boolean z10 = false;
                try {
                    if (!MessageSharedPrefs.getInstance(x.a()).a("tag_add_")) {
                        UPLog.e("TagManager", "interval limit");
                        try {
                            uPushTagCallback.onMessage(false, arrayList);
                            return;
                        } catch (Throwable th2) {
                            UPLog.e("TagManager", th2);
                            return;
                        }
                    }
                    if (TagManager.b()) {
                        try {
                            uPushTagCallback.onMessage(false, arrayList);
                            return;
                        } catch (Throwable th3) {
                            UPLog.e("TagManager", th3);
                            return;
                        }
                    }
                    if (TagManager.a()) {
                        try {
                            uPushTagCallback.onMessage(false, arrayList);
                            return;
                        } catch (Throwable th4) {
                            UPLog.e("TagManager", th4);
                            return;
                        }
                    }
                    try {
                        List<String> tags = TagManager.this.f105934a.getTags(TagManager.d());
                        if (tags != null && tags.size() > 0) {
                            arrayList.addAll(tags);
                        }
                        z10 = true;
                    } catch (Exception e10) {
                        UPLog.e("TagManager", "getTags error:", e10);
                    }
                    try {
                        uPushTagCallback.onMessage(z10, arrayList);
                    } catch (Throwable th5) {
                        UPLog.e("TagManager", th5);
                    }
                } catch (Throwable th6) {
                    try {
                        UPLog.e("TagManager", th6);
                    } finally {
                        try {
                            uPushTagCallback.onMessage(false, arrayList);
                        } catch (Throwable th7) {
                            UPLog.e("TagManager", th7);
                        }
                    }
                }
            }
        });
    }
}
