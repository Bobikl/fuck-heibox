package com.max.xiaoheihe.module.bbs.utils;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.google.gson.JsonArray;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.k;
import com.max.hbutils.utils.n;
import com.max.hbutils.utils.w;
import com.max.xiaoheihe.app.HeyBoxApplication;
import com.max.xiaoheihe.bean.ResultVerifyInfoObj;
import com.max.xiaoheihe.bean.bbs.BBSLinkVoteObj;
import com.max.xiaoheihe.bean.bbs.BBSTextObj;
import com.max.xiaoheihe.bean.bbs.BBSTopicObj;
import com.max.xiaoheihe.bean.bbs.ConceptPostTagObj;
import com.max.xiaoheihe.bean.bbs.GamesInfoResultObj;
import com.max.xiaoheihe.bean.bbs.HtmlLinkContentObj;
import com.max.xiaoheihe.bean.bbs.LinkDraftObj;
import com.max.xiaoheihe.bean.bbs.LinkImageObj;
import com.max.xiaoheihe.bean.bbs.LinkInfoObj;
import com.max.xiaoheihe.bean.bbs.PictureVideoLinkDraftObj;
import com.max.xiaoheihe.bean.bbs.PostSettingObj;
import com.max.xiaoheihe.bean.game.GameObj;
import com.max.xiaoheihe.bean.mall.MallPriceObj;
import com.max.xiaoheihe.module.bbs.post_edit.PictureVideoEditPostActivity;
import com.max.xiaoheihe.module.bbs.post_edit.PictureVideoEditPostFragment;
import com.max.xiaoheihe.module.bbs.post_edit.PostTabActivity;
import com.max.xiaoheihe.network.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.tencent.open.SocialConstants;
import com.xiaomi.mipush.sdk.Constants;
import io.reactivex.b0;
import io.reactivex.c0;
import io.reactivex.z;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: DraftUtils.java */
/* JADX INFO: loaded from: classes10.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f83477a = "draft_data";
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: compiled from: DraftUtils.java */
    public class a extends io.reactivex.observers.d<Class> {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        public void a(@jh.e Class cls) {
        }

        @Override // io.reactivex.g0
        public void onComplete() {
        }

        @Override // io.reactivex.g0
        public void onError(@jh.e Throwable th2) {
        }

        @Override // io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(@jh.e Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 31302, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            a((Class) obj);
        }
    }

    /* JADX INFO: compiled from: DraftUtils.java */
    public class b implements c0<Class> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f83478a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f83479b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f83480c;

        b(String str, String str2, Object obj) {
            this.f83478a = str;
            this.f83479b = str2;
            this.f83480c = obj;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object[]] */
        /* JADX WARN: Type inference failed for: r1v1 */
        /* JADX WARN: Type inference failed for: r1v10 */
        /* JADX WARN: Type inference failed for: r1v11 */
        /* JADX WARN: Type inference failed for: r1v3 */
        /* JADX WARN: Type inference failed for: r1v4, types: [java.io.FileOutputStream] */
        /* JADX WARN: Type inference failed for: r1v5, types: [java.io.FileOutputStream] */
        /* JADX WARN: Type inference failed for: r1v7, types: [java.io.FileOutputStream, java.io.OutputStream] */
        /* JADX WARN: Type inference failed for: r1v8 */
        /* JADX WARN: Type inference failed for: r1v9, types: [java.io.FileOutputStream] */
        @Override // io.reactivex.c0
        public void a(@jh.e b0<Class> b0Var) throws Exception {
            Exception e10;
            ?? fileOutputStream = {b0Var};
            if (PatchProxy.proxy(fileOutputStream, this, changeQuickRedirect, false, 31303, new Class[]{b0.class}, Void.TYPE).isSupported) {
                return;
            }
            OutputStreamWriter outputStreamWriter = null;
            try {
                try {
                    try {
                        File file = new File(HeyBoxApplication.C().getFilesDir(), this.f83478a);
                        if (file.mkdirs() || (file.exists() && file.isDirectory())) {
                            fileOutputStream = new FileOutputStream(new File(file, this.f83479b));
                            try {
                                OutputStreamWriter outputStreamWriter2 = new OutputStreamWriter(fileOutputStream);
                                try {
                                    String strP = k.p(this.f83480c);
                                    if (!TextUtils.isEmpty(strP)) {
                                        outputStreamWriter2.write(strP);
                                    }
                                    outputStreamWriter = outputStreamWriter2;
                                    fileOutputStream = fileOutputStream;
                                } catch (Exception e11) {
                                    e10 = e11;
                                    outputStreamWriter = outputStreamWriter2;
                                    e10.printStackTrace();
                                    b0Var.onError(e10);
                                    if (outputStreamWriter != null) {
                                        try {
                                            outputStreamWriter.close();
                                        } catch (IOException e12) {
                                            e12.printStackTrace();
                                        }
                                    }
                                    if (fileOutputStream == 0) {
                                        return;
                                    } else {
                                        fileOutputStream.close();
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    outputStreamWriter = outputStreamWriter2;
                                    if (outputStreamWriter != null) {
                                        try {
                                            outputStreamWriter.close();
                                        } catch (IOException e13) {
                                            e13.printStackTrace();
                                        }
                                    }
                                    if (fileOutputStream == 0) {
                                        throw th;
                                    }
                                    try {
                                        fileOutputStream.close();
                                        throw th;
                                    } catch (IOException e14) {
                                        e14.printStackTrace();
                                        throw th;
                                    }
                                }
                            } catch (Exception e15) {
                                e10 = e15;
                            }
                        } else {
                            fileOutputStream = 0;
                        }
                        b0Var.onComplete();
                        if (outputStreamWriter != null) {
                            try {
                                outputStreamWriter.close();
                            } catch (IOException e16) {
                                e16.printStackTrace();
                            }
                        }
                        if (fileOutputStream != 0) {
                            fileOutputStream.close();
                        }
                    } catch (Throwable th3) {
                        th = th3;
                    }
                } catch (Exception e17) {
                    e10 = e17;
                    fileOutputStream = 0;
                } catch (Throwable th4) {
                    th = th4;
                    fileOutputStream = 0;
                }
            } catch (IOException e18) {
                e18.printStackTrace();
            }
        }
    }

    /* JADX INFO: renamed from: com.max.xiaoheihe.module.bbs.utils.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: DraftUtils.java */
    public class C0726c extends com.max.hbcommon.network.d<Result> {
        public static ChangeQuickRedirect changeQuickRedirect;

        C0726c() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 31304, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            super.onError(th2);
        }

        public void onNext(Result result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 31305, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            super.onNext(result);
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 31306, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result) obj);
        }
    }

    /* JADX INFO: compiled from: DraftUtils.java */
    public class d extends com.max.hbcommon.network.d<Result<ResultVerifyInfoObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ h f83481b;

        d(h hVar) {
            this.f83481b = hVar;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 31307, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            super.onError(th2);
            h hVar = this.f83481b;
            if (hVar != null) {
                hVar.onFinish(false);
            }
        }

        public void onNext(Result<ResultVerifyInfoObj> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 31308, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            if (!com.max.hbcommon.utils.c.u(result.getMsg())) {
                com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
                com.max.hbutils.utils.c.f(result.getMsg());
            }
            h hVar = this.f83481b;
            if (hVar != null) {
                hVar.onFinish(true);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 31309, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<ResultVerifyInfoObj>) obj);
        }
    }

    /* JADX INFO: compiled from: DraftUtils.java */
    public class e implements c0<List<LinkDraftObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
        }

        /* JADX WARN: Code duplicated, block: B:107:0x0104 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:114:0x00da A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:116:0x00fa A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:131:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:132:? A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:75:0x00e4 A[Catch: IOException -> 0x00e8, TRY_ENTER, TRY_LEAVE, TryCatch #10 {IOException -> 0x00e8, blocks: (B:51:0x00b5, B:75:0x00e4), top: B:110:0x001e }] */
        /* JADX WARN: Code duplicated, block: B:97:0x00d0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:99:0x00f0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r4v1 */
        /* JADX WARN: Type inference failed for: r4v10 */
        /* JADX WARN: Type inference failed for: r4v11 */
        /* JADX WARN: Type inference failed for: r4v2 */
        /* JADX WARN: Type inference failed for: r4v4 */
        /* JADX WARN: Type inference failed for: r4v5 */
        /* JADX WARN: Type inference failed for: r4v6 */
        /* JADX WARN: Type inference failed for: r4v7 */
        /* JADX WARN: Type inference failed for: r4v8 */
        /* JADX WARN: Type inference failed for: r4v9, types: [java.io.InputStreamReader] */
        /* JADX WARN: Type inference failed for: r5v0 */
        /* JADX WARN: Type inference failed for: r5v1 */
        /* JADX WARN: Type inference failed for: r5v10 */
        /* JADX WARN: Type inference failed for: r5v11 */
        /* JADX WARN: Type inference failed for: r5v12 */
        /* JADX WARN: Type inference failed for: r5v13 */
        /* JADX WARN: Type inference failed for: r5v14, types: [java.io.FileInputStream] */
        /* JADX WARN: Type inference failed for: r5v15 */
        /* JADX WARN: Type inference failed for: r5v16 */
        /* JADX WARN: Type inference failed for: r5v2 */
        /* JADX WARN: Type inference failed for: r5v3 */
        /* JADX WARN: Type inference failed for: r5v4, types: [java.io.InputStreamReader] */
        /* JADX WARN: Type inference failed for: r5v5, types: [java.io.InputStreamReader] */
        /* JADX WARN: Type inference failed for: r5v6 */
        /* JADX WARN: Type inference failed for: r5v7 */
        /* JADX WARN: Type inference failed for: r5v8, types: [java.io.InputStreamReader, java.io.Reader] */
        /* JADX WARN: Type inference failed for: r5v9 */
        /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Class] */
        /* JADX WARN: Type inference failed for: r7v1 */
        /* JADX WARN: Type inference failed for: r7v10 */
        /* JADX WARN: Type inference failed for: r7v2 */
        /* JADX WARN: Type inference failed for: r7v3 */
        /* JADX WARN: Type inference failed for: r7v4, types: [java.io.FileInputStream] */
        /* JADX WARN: Type inference failed for: r7v5, types: [java.io.FileInputStream] */
        /* JADX WARN: Type inference failed for: r7v6, types: [java.io.FileInputStream, java.io.InputStream] */
        /* JADX WARN: Type inference failed for: r7v7 */
        /* JADX WARN: Type inference failed for: r7v8 */
        /* JADX WARN: Type inference failed for: r7v9 */
        @Override // io.reactivex.c0
        public void a(@jh.e b0<List<LinkDraftObj>> b0Var) throws Exception {
            ?? r10;
            ?? r11;
            int i10 = 0;
            Object[] objArr = {b0Var};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class[] clsArr = {b0.class};
            ?? fileInputStream = Void.TYPE;
            ?? inputStreamReader = 31310;
            if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 31310, clsArr, fileInputStream).isSupported) {
                return;
            }
            BufferedReader bufferedReader = null;
            try {
                try {
                    try {
                        File file = new File(HeyBoxApplication.C().getFilesDir(), c.f83477a);
                        ArrayList arrayList = new ArrayList();
                        if (file.mkdirs() || (file.exists() && file.isDirectory())) {
                            File[] fileArrListFiles = file.listFiles();
                            int length = fileArrListFiles.length;
                            r10 = 0;
                            r11 = 0;
                            while (i10 < length) {
                                try {
                                    fileInputStream = new FileInputStream(fileArrListFiles[i10]);
                                    try {
                                        inputStreamReader = new InputStreamReader(fileInputStream);
                                        try {
                                            BufferedReader bufferedReader2 = new BufferedReader(inputStreamReader);
                                            try {
                                                StringBuilder sb2 = new StringBuilder();
                                                while (true) {
                                                    String line = bufferedReader2.readLine();
                                                    if (line == null) {
                                                        break;
                                                    } else {
                                                        sb2.append(line);
                                                    }
                                                }
                                                String string = sb2.toString();
                                                if (!TextUtils.isEmpty(string)) {
                                                    arrayList.add((LinkDraftObj) k.a(string, LinkDraftObj.class));
                                                }
                                                i10++;
                                                bufferedReader = bufferedReader2;
                                                r10 = inputStreamReader;
                                                r11 = fileInputStream;
                                            } catch (Exception e10) {
                                                e = e10;
                                                bufferedReader = bufferedReader2;
                                                e.printStackTrace();
                                                b0Var.onError(e);
                                                if (bufferedReader != null) {
                                                    try {
                                                        bufferedReader.close();
                                                    } catch (IOException e11) {
                                                        e11.printStackTrace();
                                                    }
                                                }
                                                if (inputStreamReader != 0) {
                                                    try {
                                                        inputStreamReader.close();
                                                    } catch (IOException e12) {
                                                        e12.printStackTrace();
                                                    }
                                                }
                                                if (fileInputStream != 0) {
                                                    fileInputStream.close();
                                                }
                                                return;
                                            } catch (Throwable th2) {
                                                th = th2;
                                                bufferedReader = bufferedReader2;
                                                if (bufferedReader != null) {
                                                    try {
                                                        bufferedReader.close();
                                                    } catch (IOException e13) {
                                                        e13.printStackTrace();
                                                    }
                                                }
                                                if (inputStreamReader != 0) {
                                                    try {
                                                        inputStreamReader.close();
                                                    } catch (IOException e14) {
                                                        e14.printStackTrace();
                                                    }
                                                }
                                                if (fileInputStream != 0) {
                                                    throw th;
                                                }
                                                try {
                                                    fileInputStream.close();
                                                    throw th;
                                                } catch (IOException e15) {
                                                    e15.printStackTrace();
                                                    throw th;
                                                }
                                            }
                                        } catch (Exception e16) {
                                            e = e16;
                                        }
                                    } catch (Exception e17) {
                                        e = e17;
                                        inputStreamReader = r10;
                                        e.printStackTrace();
                                        b0Var.onError(e);
                                        if (bufferedReader != null) {
                                            bufferedReader.close();
                                        }
                                        if (inputStreamReader != 0) {
                                            inputStreamReader.close();
                                        }
                                        if (fileInputStream != 0) {
                                            fileInputStream.close();
                                        }
                                        return;
                                    } catch (Throwable th3) {
                                        th = th3;
                                        inputStreamReader = r10;
                                        if (bufferedReader != null) {
                                            bufferedReader.close();
                                        }
                                        if (inputStreamReader != 0) {
                                            inputStreamReader.close();
                                        }
                                        if (fileInputStream != 0) {
                                            throw th;
                                        }
                                        fileInputStream.close();
                                        throw th;
                                    }
                                } catch (Exception e18) {
                                    e = e18;
                                    fileInputStream = r11;
                                } catch (Throwable th4) {
                                    th = th4;
                                    fileInputStream = r11;
                                }
                            }
                            b0Var.onNext(arrayList);
                            r10 = r10;
                            r11 = r11;
                        } else {
                            r10 = 0;
                            r11 = 0;
                        }
                        b0Var.onComplete();
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (IOException e19) {
                                e19.printStackTrace();
                            }
                        }
                        if (r10 != 0) {
                            try {
                                r10.close();
                            } catch (IOException e20) {
                                e20.printStackTrace();
                            }
                        }
                        if (r11 != 0) {
                            r11.close();
                        }
                    } catch (Throwable th5) {
                        th = th5;
                    }
                } catch (Exception e21) {
                    e = e21;
                    inputStreamReader = 0;
                    fileInputStream = 0;
                } catch (Throwable th6) {
                    th = th6;
                    inputStreamReader = 0;
                    fileInputStream = 0;
                }
            } catch (IOException e22) {
                e22.printStackTrace();
            }
        }
    }

    /* JADX INFO: compiled from: DraftUtils.java */
    public class f implements c0<LinkDraftObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f83482a;

        f(String str) {
            this.f83482a = str;
        }

        /* JADX WARN: Code duplicated, block: B:116:0x014f A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:123:0x0145 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:125:0x0125 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:128:0x013b A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:130:0x011b A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:157:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:158:? A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:92:0x012f A[Catch: IOException -> 0x0133, TRY_ENTER, TRY_LEAVE, TryCatch #5 {IOException -> 0x0133, blocks: (B:72:0x0106, B:92:0x012f), top: B:119:0x001e }] */
        @Override // io.reactivex.c0
        public void a(@jh.e b0<LinkDraftObj> b0Var) throws Exception {
            FileInputStream fileInputStream;
            InputStreamReader inputStreamReader;
            int i10 = 0;
            if (PatchProxy.proxy(new Object[]{b0Var}, this, changeQuickRedirect, false, 31311, new Class[]{b0.class}, Void.TYPE).isSupported) {
                return;
            }
            BufferedReader bufferedReader = null;
            bufferedReader = null;
            LinkDraftObj linkDraftObj = null;
            bufferedReader = null;
            try {
                try {
                    File file = new File(HeyBoxApplication.C().getFilesDir(), c.f83477a);
                    ArrayList<LinkDraftObj> arrayList = new ArrayList();
                    if (file.mkdirs() || (file.exists() && file.isDirectory())) {
                        File[] fileArrListFiles = file.listFiles();
                        int length = fileArrListFiles.length;
                        fileInputStream = null;
                        inputStreamReader = null;
                        BufferedReader bufferedReader2 = null;
                        while (i10 < length) {
                            try {
                                FileInputStream fileInputStream2 = new FileInputStream(fileArrListFiles[i10]);
                                try {
                                    InputStreamReader inputStreamReader2 = new InputStreamReader(fileInputStream2);
                                    try {
                                        BufferedReader bufferedReader3 = new BufferedReader(inputStreamReader2);
                                        try {
                                            StringBuilder sb2 = new StringBuilder();
                                            while (true) {
                                                String line = bufferedReader3.readLine();
                                                if (line == null) {
                                                    break;
                                                } else {
                                                    sb2.append(line);
                                                }
                                            }
                                            String string = sb2.toString();
                                            if (!TextUtils.isEmpty(string)) {
                                                arrayList.add((LinkDraftObj) k.a(string, LinkDraftObj.class));
                                            }
                                            i10++;
                                            bufferedReader2 = bufferedReader3;
                                            inputStreamReader = inputStreamReader2;
                                            fileInputStream = fileInputStream2;
                                        } catch (Exception e10) {
                                            e = e10;
                                            bufferedReader = bufferedReader3;
                                            inputStreamReader = inputStreamReader2;
                                            fileInputStream = fileInputStream2;
                                            e.printStackTrace();
                                            b0Var.onError(e);
                                            if (bufferedReader != null) {
                                                try {
                                                    bufferedReader.close();
                                                } catch (IOException e11) {
                                                    e11.printStackTrace();
                                                }
                                            }
                                            if (inputStreamReader != null) {
                                                try {
                                                    inputStreamReader.close();
                                                } catch (IOException e12) {
                                                    e12.printStackTrace();
                                                }
                                            }
                                            if (fileInputStream != null) {
                                                fileInputStream.close();
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                            bufferedReader = bufferedReader3;
                                            inputStreamReader = inputStreamReader2;
                                            fileInputStream = fileInputStream2;
                                            if (bufferedReader != null) {
                                                try {
                                                    bufferedReader.close();
                                                } catch (IOException e13) {
                                                    e13.printStackTrace();
                                                }
                                            }
                                            if (inputStreamReader != null) {
                                                try {
                                                    inputStreamReader.close();
                                                } catch (IOException e14) {
                                                    e14.printStackTrace();
                                                }
                                            }
                                            if (fileInputStream == null) {
                                                throw th;
                                            }
                                            try {
                                                fileInputStream.close();
                                                throw th;
                                            } catch (IOException e15) {
                                                e15.printStackTrace();
                                                throw th;
                                            }
                                        }
                                    } catch (Exception e16) {
                                        e = e16;
                                        inputStreamReader = inputStreamReader2;
                                        bufferedReader = bufferedReader2;
                                        fileInputStream = fileInputStream2;
                                        e.printStackTrace();
                                        b0Var.onError(e);
                                        if (bufferedReader != null) {
                                            bufferedReader.close();
                                        }
                                        if (inputStreamReader != null) {
                                            inputStreamReader.close();
                                        }
                                        if (fileInputStream != null) {
                                            fileInputStream.close();
                                        }
                                    } catch (Throwable th3) {
                                        th = th3;
                                        inputStreamReader = inputStreamReader2;
                                        bufferedReader = bufferedReader2;
                                        fileInputStream = fileInputStream2;
                                        if (bufferedReader != null) {
                                            bufferedReader.close();
                                        }
                                        if (inputStreamReader != null) {
                                            inputStreamReader.close();
                                        }
                                        if (fileInputStream == null) {
                                            throw th;
                                        }
                                        fileInputStream.close();
                                        throw th;
                                    }
                                } catch (Exception e17) {
                                    e = e17;
                                } catch (Throwable th4) {
                                    th = th4;
                                }
                            } catch (Exception e18) {
                                e = e18;
                                bufferedReader = bufferedReader2;
                            } catch (Throwable th5) {
                                th = th5;
                                bufferedReader = bufferedReader2;
                            }
                        }
                        if (arrayList.size() > 0) {
                            for (LinkDraftObj linkDraftObj2 : arrayList) {
                                if (this.f83482a.equals(linkDraftObj2.getLink_tag()) && (linkDraftObj == null || n.r(linkDraftObj.getCreat_time()) < n.r(linkDraftObj2.getCreat_time()))) {
                                    linkDraftObj = linkDraftObj2;
                                }
                            }
                            b0Var.onNext(linkDraftObj);
                        }
                        bufferedReader = bufferedReader2;
                    } else {
                        fileInputStream = null;
                        inputStreamReader = null;
                    }
                    try {
                        try {
                            b0Var.onComplete();
                            if (bufferedReader != null) {
                                try {
                                    bufferedReader.close();
                                } catch (IOException e19) {
                                    e19.printStackTrace();
                                }
                            }
                            if (inputStreamReader != null) {
                                try {
                                    inputStreamReader.close();
                                } catch (IOException e20) {
                                    e20.printStackTrace();
                                }
                            }
                            if (fileInputStream != null) {
                                fileInputStream.close();
                            }
                        } catch (Exception e21) {
                            e = e21;
                            e.printStackTrace();
                            b0Var.onError(e);
                            if (bufferedReader != null) {
                                bufferedReader.close();
                            }
                            if (inputStreamReader != null) {
                                inputStreamReader.close();
                            }
                            if (fileInputStream != null) {
                                fileInputStream.close();
                            }
                        }
                    } catch (Throwable th6) {
                        th = th6;
                        if (bufferedReader != null) {
                            bufferedReader.close();
                        }
                        if (inputStreamReader != null) {
                            inputStreamReader.close();
                        }
                        if (fileInputStream == null) {
                            throw th;
                        }
                        fileInputStream.close();
                        throw th;
                    }
                } catch (IOException e22) {
                    e22.printStackTrace();
                }
            } catch (Exception e23) {
                e = e23;
                fileInputStream = null;
                inputStreamReader = null;
            } catch (Throwable th7) {
                th = th7;
                fileInputStream = null;
                inputStreamReader = null;
            }
        }
    }

    /* JADX INFO: compiled from: DraftUtils.java */
    public class g extends com.max.hbcommon.network.d<Result<GamesInfoResultObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f83483b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ PictureVideoLinkDraftObj f83484c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f83485d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ PictureVideoEditPostFragment.POST_EDIT_TYPE f83486e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ StringBuilder f83487f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f83488g;

        g(Context context, PictureVideoLinkDraftObj pictureVideoLinkDraftObj, String str, PictureVideoEditPostFragment.POST_EDIT_TYPE post_edit_type, StringBuilder sb2, boolean z10) {
            this.f83483b = context;
            this.f83484c = pictureVideoLinkDraftObj;
            this.f83485d = str;
            this.f83486e = post_edit_type;
            this.f83487f = sb2;
            this.f83488g = z10;
        }

        public void onNext(Result<GamesInfoResultObj> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 31312, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            Object obj = this.f83483b;
            if ((obj instanceof com.max.hbcommon.base.f) && ((com.max.hbcommon.base.f) obj).isActive()) {
                if (result.getResult() != null && !com.max.hbcommon.utils.c.w(result.getResult().getBase_infos())) {
                    Iterator<GameObj> it = result.getResult().getBase_infos().iterator();
                    while (it.hasNext()) {
                        this.f83484c.getGameList().add(it.next());
                    }
                }
                Intent intentM1 = PictureVideoEditPostActivity.M1(this.f83483b, null, this.f83484c, this.f83485d, null, this.f83486e);
                intentM1.putExtra(PictureVideoEditPostFragment.f82341j4, this.f83487f.toString());
                intentM1.putExtra(PostTabActivity.G2, this.f83488g);
                intentM1.putExtra("source", "draft_box");
                com.max.xiaoheihe.utils.d.G1(this.f83483b, intentM1);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 31313, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<GamesInfoResultObj>) obj);
        }
    }

    /* JADX INFO: compiled from: DraftUtils.java */
    public interface h {
        void onFinish(boolean z10);
    }

    public static void a(String str) {
        if (PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 31301, new Class[]{String.class}, Void.TYPE).isSupported || com.max.hbcommon.utils.c.u(str)) {
            return;
        }
        File file = new File(HeyBoxApplication.C().getFilesDir(), f83477a);
        if (file.mkdirs() || (file.exists() && file.isDirectory())) {
            File file2 = new File(file, str);
            if (file2.exists()) {
                file2.delete();
            }
        }
    }

    public static int b() {
        return 0;
    }

    public static z<List<LinkDraftObj>> c() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 31297, new Class[0], z.class);
        return patchProxyResultProxy.isSupported ? (z) patchProxyResultProxy.result : z.q1(new e());
    }

    private static String d(List<BBSTopicObj> list) {
        StringBuilder sb2;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{list}, null, changeQuickRedirect, true, 31295, new Class[]{List.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        if (com.max.hbcommon.utils.c.w(list)) {
            sb2 = null;
        } else {
            sb2 = new StringBuilder();
            for (int i10 = 0; i10 < list.size(); i10++) {
                if (i10 != 0) {
                    sb2.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                }
                sb2.append(list.get(i10).getTopic_id());
            }
        }
        if (sb2 != null) {
            return sb2.toString();
        }
        return null;
    }

    public static z<LinkDraftObj> e(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 31298, new Class[]{String.class}, z.class);
        return patchProxyResultProxy.isSupported ? (z) patchProxyResultProxy.result : z.q1(new f(str));
    }

    public static void f(Context context, io.reactivex.disposables.a aVar, LinkInfoObj linkInfoObj, boolean z10, PictureVideoEditPostFragment.POST_EDIT_TYPE post_edit_type, ArrayList<BBSTopicObj> arrayList) {
        if (PatchProxy.proxy(new Object[]{context, aVar, linkInfoObj, new Byte(z10 ? (byte) 1 : (byte) 0), post_edit_type, arrayList}, null, changeQuickRedirect, true, 31299, new Class[]{Context.class, io.reactivex.disposables.a.class, LinkInfoObj.class, Boolean.TYPE, PictureVideoEditPostFragment.POST_EDIT_TYPE.class, ArrayList.class}, Void.TYPE).isSupported) {
            return;
        }
        g(context, aVar, linkInfoObj, z10, post_edit_type, arrayList, false);
    }

    public static void g(Context context, io.reactivex.disposables.a aVar, LinkInfoObj linkInfoObj, boolean z10, PictureVideoEditPostFragment.POST_EDIT_TYPE post_edit_type, ArrayList<BBSTopicObj> arrayList, boolean z11) {
        Object[] objArr = {context, aVar, linkInfoObj, new Byte(z10 ? (byte) 1 : (byte) 0), post_edit_type, arrayList, new Byte(z11 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Boolean.TYPE;
        if (PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 31300, new Class[]{Context.class, io.reactivex.disposables.a.class, LinkInfoObj.class, cls, PictureVideoEditPostFragment.POST_EDIT_TYPE.class, ArrayList.class, cls}, Void.TYPE).isSupported) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = new StringBuilder();
        ArrayList arrayList2 = new ArrayList();
        StringBuilder sb4 = new StringBuilder();
        if (post_edit_type != PictureVideoEditPostFragment.POST_EDIT_TYPE.POST_VIDEO) {
            List<BBSTextObj> listB = k.b(linkInfoObj.getText(), BBSTextObj.class);
            if (!com.max.hbcommon.utils.c.w(listB)) {
                for (BBSTextObj bBSTextObj : listB) {
                    if ("text".equals(bBSTextObj.getType())) {
                        if (sb3.length() > 0) {
                            sb3.append("\n");
                        }
                        sb3.append(bBSTextObj.getText());
                    } else if (SocialConstants.PARAM_IMG_URL.equals(bBSTextObj.getType())) {
                        arrayList2.add(bBSTextObj);
                    } else if ("game_card".equals(bBSTextObj.getType())) {
                        String appid = bBSTextObj.getAppid();
                        if (sb2.length() > 0) {
                            sb2.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                        }
                        sb2.append(appid);
                    } else if ("tool_card".equals(bBSTextObj.getType()) && bBSTextObj.getTool_card() != null) {
                        if (sb4.length() > 0) {
                            sb4.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                        }
                        sb4.append(bBSTextObj.getTool_card().getCard_id());
                    }
                }
            }
        } else {
            sb3.append(linkInfoObj.getText());
            if (!com.max.hbcommon.utils.c.w(linkInfoObj.getGame_tag_appids())) {
                for (String str : linkInfoObj.getGame_tag_appids()) {
                    if (sb2.length() > 0) {
                        sb2.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                    }
                    sb2.append(str);
                }
            }
        }
        PictureVideoLinkDraftObj pictureVideoLinkDraftObj = new PictureVideoLinkDraftObj();
        if (!com.max.hbcommon.utils.c.w(linkInfoObj.getHashtags())) {
            Iterator<ConceptPostTagObj> it = linkInfoObj.getHashtags().iterator();
            while (it.hasNext()) {
                pictureVideoLinkDraftObj.getHashtagList().add(it.next().getName());
            }
        }
        pictureVideoLinkDraftObj.setContent(sb3.toString());
        pictureVideoLinkDraftObj.setTitle(linkInfoObj.getTitle());
        pictureVideoLinkDraftObj.setLink_id(linkInfoObj.getLinkid());
        pictureVideoLinkDraftObj.getImgPathList().addAll(arrayList2);
        pictureVideoLinkDraftObj.setCheckedTopics(arrayList);
        pictureVideoLinkDraftObj.setVideo_local_path(linkInfoObj.getVideo_local_path());
        pictureVideoLinkDraftObj.setVideo_thumb(linkInfoObj.getVideo_thumb());
        pictureVideoLinkDraftObj.setVideo_url(linkInfoObj.getVideo_url());
        pictureVideoLinkDraftObj.setVideo_duration(linkInfoObj.getVideo_duration());
        if (linkInfoObj.getArticle_collection() != null && !ad.a.a(ad.a.I, false)) {
            pictureVideoLinkDraftObj.setOriginCompilationId(linkInfoObj.getArticle_collection().getObj_id());
        }
        PostSettingObj postSettingObj = new PostSettingObj();
        postSettingObj.setView_limit(linkInfoObj.getView_limit());
        postSettingObj.setHeadLine(com.max.hbcommon.utils.c.x(linkInfoObj.getIs_article()));
        postSettingObj.set_edit(z10);
        postSettingObj.setSchedulePostTimeMs((long) (n.o(linkInfoObj.getSchedule_ts()) * 1000.0d));
        if (!com.max.hbcommon.utils.c.u(linkInfoObj.getThumb())) {
            LinkImageObj linkImageObj = new LinkImageObj();
            linkImageObj.setUrl(linkInfoObj.getThumb());
            postSettingObj.setThumbImageObj(linkImageObj);
        }
        if (!com.max.hbcommon.utils.c.w(linkInfoObj.getPlan_tags())) {
            ArrayList arrayList3 = new ArrayList();
            Iterator<ConceptPostTagObj> it2 = linkInfoObj.getPlan_tags().iterator();
            while (it2.hasNext()) {
                arrayList3.add(it2.next().toKeyDescObj());
            }
            postSettingObj.setSelect_post_plan(arrayList3);
        }
        pictureVideoLinkDraftObj.setPostSettingObj(postSettingObj);
        String str2 = z10 ? "edit" : PictureVideoEditPostFragment.Y3;
        if (!com.max.hbcommon.utils.c.u(sb2.toString())) {
            aVar.c((io.reactivex.disposables.b) i.a().O2(sb2.toString()).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new g(context, pictureVideoLinkDraftObj, str2, post_edit_type, sb4, z11)));
            return;
        }
        Intent intentM1 = PictureVideoEditPostActivity.M1(context, null, pictureVideoLinkDraftObj, str2, null, post_edit_type);
        intentM1.putExtra(PictureVideoEditPostFragment.f82341j4, sb4.toString());
        intentM1.putExtra(PostTabActivity.G2, z11);
        intentM1.putExtra("source", "draft_box");
        com.max.xiaoheihe.utils.d.G1(context, intentM1);
    }

    public static <T> io.reactivex.disposables.b h(String str, String str2, T t10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, t10}, null, changeQuickRedirect, true, 31291, new Class[]{String.class, String.class, Object.class}, io.reactivex.disposables.b.class);
        return patchProxyResultProxy.isSupported ? (io.reactivex.disposables.b) patchProxyResultProxy.result : (io.reactivex.disposables.b) z.q1(new b(str, str2, t10)).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new a());
    }

    public static io.reactivex.disposables.b i(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 31294, new Class[]{String.class}, io.reactivex.disposables.b.class);
        return patchProxyResultProxy.isSupported ? (io.reactivex.disposables.b) patchProxyResultProxy.result : (io.reactivex.disposables.b) i.a().b3(str).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new C0726c());
    }

    public static io.reactivex.disposables.b j(LinkDraftObj linkDraftObj, boolean z10, h hVar, boolean z11) {
        Object[] objArr = {linkDraftObj, new Byte(z10 ? (byte) 1 : (byte) 0), hVar, new Byte(z11 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Boolean.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 31292, new Class[]{LinkDraftObj.class, cls, h.class, cls}, io.reactivex.disposables.b.class);
        return patchProxyResultProxy.isSupported ? (io.reactivex.disposables.b) patchProxyResultProxy.result : k(linkDraftObj, z10, hVar, z11, 0L);
    }

    public static io.reactivex.disposables.b k(LinkDraftObj linkDraftObj, boolean z10, h hVar, boolean z11, long j10) {
        Object[] objArr = {linkDraftObj, new Byte(z10 ? (byte) 1 : (byte) 0), hVar, new Byte(z11 ? (byte) 1 : (byte) 0), new Long(j10)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Boolean.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 31293, new Class[]{LinkDraftObj.class, cls, h.class, cls, Long.TYPE}, io.reactivex.disposables.b.class);
        return patchProxyResultProxy.isSupported ? (io.reactivex.disposables.b) patchProxyResultProxy.result : l(linkDraftObj, z10, hVar, z11, j10);
    }

    private static io.reactivex.disposables.b l(LinkDraftObj linkDraftObj, boolean z10, h hVar, boolean z11, long j10) {
        Object[] objArr = {linkDraftObj, new Byte(z10 ? (byte) 1 : (byte) 0), hVar, new Byte(z11 ? (byte) 1 : (byte) 0), new Long(j10)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Boolean.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 31296, new Class[]{LinkDraftObj.class, cls, h.class, cls, Long.TYPE}, io.reactivex.disposables.b.class);
        if (patchProxyResultProxy.isSupported) {
            return (io.reactivex.disposables.b) patchProxyResultProxy.result;
        }
        String strD = d(linkDraftObj.getCheckedTopics());
        String tags = linkDraftObj.getTags();
        HashMap map = new HashMap();
        HashMap map2 = new HashMap(16);
        ArrayList arrayList = new ArrayList();
        if (linkDraftObj.getContent() != null) {
            HtmlLinkContentObj htmlLinkContentObj = (HtmlLinkContentObj) k.a(linkDraftObj.getContent(), HtmlLinkContentObj.class);
            BBSTextObj bBSTextObj = new BBSTextObj();
            bBSTextObj.setType(LinkDraftObj.DRAFT_TYPE_HTML);
            bBSTextObj.setText(htmlLinkContentObj.getContent());
            arrayList.add(bBSTextObj);
            if ("11".equals(linkDraftObj.getLink_tag())) {
                map2.put("words_count", String.valueOf(htmlLinkContentObj.getDesc() != null ? htmlLinkContentObj.getDesc().length() : 0));
            }
            for (BBSTextObj bBSTextObj2 : htmlLinkContentObj.getImgs()) {
                BBSTextObj bBSTextObj3 = new BBSTextObj();
                bBSTextObj3.setUrl(bBSTextObj2.getUrl());
                bBSTextObj3.setType(SocialConstants.PARAM_IMG_URL);
                bBSTextObj3.setWidth(bBSTextObj2.getWidth());
                bBSTextObj3.setHeight(bBSTextObj2.getHeight());
                arrayList.add(bBSTextObj3);
            }
            map2.put("text", k.p(arrayList));
            map2.put(SocialConstants.PARAM_APP_DESC, htmlLinkContentObj.getDesc());
            if (!com.max.hbcommon.utils.c.u(htmlLinkContentObj.getTitle())) {
                map2.put("title", htmlLinkContentObj.getTitle());
            }
            if (!com.max.hbcommon.utils.c.u(htmlLinkContentObj.getSubject_ids())) {
                map2.put("hashtags", htmlLinkContentObj.getSubject_ids());
            }
        }
        JsonArray jsonArray = new JsonArray();
        if (!com.max.hbcommon.utils.c.w(linkDraftObj.getCheckedHashTags())) {
            Iterator<String> it = linkDraftObj.getCheckedHashTags().iterator();
            while (it.hasNext()) {
                jsonArray.add(it.next());
            }
            map2.put("hashtags", jsonArray.toString());
        }
        String link_tag = linkDraftObj.getLink_tag();
        if (!com.max.hbcommon.utils.c.u(link_tag)) {
            map2.put("link_tag", link_tag);
        } else if (linkDraftObj.getCheckedTopics().size() > 0 || z11) {
            map2.put("link_tag", "1");
        } else {
            map2.put("link_tag", "21");
        }
        if ("3".equals(linkDraftObj.getPost_type())) {
            map2.put("post_type", "3");
            if (linkDraftObj.getArticle_img() != null && linkDraftObj.getArticle_img().getUrl() != null) {
                map2.put("thumb", linkDraftObj.getArticle_img().getUrl());
            }
            if (!com.max.hbcommon.utils.c.u(linkDraftObj.getArticle_type())) {
                map2.put(MallPriceObj.TYPE_ORIGINAL, linkDraftObj.getArticle_type());
            }
            if ("1".equals(linkDraftObj.getArticle_type())) {
                if (!com.max.hbcommon.utils.c.u(linkDraftObj.getArticle_reprint_tips())) {
                    map2.put("declaration", linkDraftObj.getArticle_reprint_tips());
                }
            } else if ("0".equals(linkDraftObj.getArticle_type())) {
                if (!com.max.hbcommon.utils.c.u(linkDraftObj.getArticle_reference())) {
                    map2.put("source", linkDraftObj.getArticle_reference());
                }
                if (!com.max.hbcommon.utils.c.u(linkDraftObj.getArticle_auth())) {
                    map2.put("declaration", linkDraftObj.getArticle_auth());
                }
            }
        }
        if ("21".equals(link_tag)) {
            map2.put("topic_ids", BBSTopicObj.TOPIC_ID_TIMELINE);
        } else if (!com.max.hbcommon.utils.c.u(strD)) {
            map2.put("topic_ids", strD);
        }
        if (!com.max.hbcommon.utils.c.u(tags)) {
            map2.put("tags", tags);
        }
        if (z10 && !com.max.hbcommon.utils.c.u(linkDraftObj.getLink_id())) {
            map2.put("edit", "1");
            map2.put("link_id", linkDraftObj.getLink_id());
        }
        if (linkDraftObj.getPost_plan() != null) {
            map2.put("post_plan", linkDraftObj.getPost_plan().getKey());
        }
        BBSLinkVoteObj voteInfo = linkDraftObj.getVoteInfo();
        if (voteInfo != null) {
            if (!com.max.hbcommon.utils.c.w(voteInfo.getOption_list())) {
                if (!com.max.hbcommon.utils.c.u(voteInfo.getVote_title())) {
                    map2.put("vote_title", voteInfo.getVote_title());
                }
                map2.put("vote_type", voteInfo.getVote_type());
                map2.put("vote_choose_limit", voteInfo.getVote_num() + "");
                map2.put("vote_expire_at", w.P(voteInfo.getVote_end_date().getTimeInMillis()) + "");
                StringBuilder sb2 = new StringBuilder();
                StringBuilder sb3 = new StringBuilder();
                for (int i10 = 0; i10 < voteInfo.getOption_list().size(); i10++) {
                    if (i10 != 0) {
                        sb2.append("<option>");
                        if (voteInfo.getOption_mode() != 0) {
                            sb3.append("<opt_img>");
                        }
                    }
                    sb2.append(voteInfo.getOption_list().get(i10).getText());
                    if (voteInfo.getOption_mode() != 0) {
                        sb3.append(voteInfo.getOption_list().get(i10).getImgurl());
                    }
                }
                map2.put("vote_options", sb2.toString());
                if (voteInfo.getOption_mode() != 0) {
                    map2.put("option_imgs", sb3.toString());
                }
            }
        }
        if (j10 > 0) {
            map2.put("schedule_ts", String.valueOf(j10 / 1000));
        }
        if (!com.max.hbcommon.utils.c.u(linkDraftObj.getView_limit())) {
            map2.put("view_limit", linkDraftObj.getView_limit());
        }
        if (linkDraftObj.getExtraParam() != null) {
            map2.putAll(linkDraftObj.getExtraParam());
        }
        return (io.reactivex.disposables.b) i.a().Ba(map, null, "1", map2).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new d(hVar));
    }
}
