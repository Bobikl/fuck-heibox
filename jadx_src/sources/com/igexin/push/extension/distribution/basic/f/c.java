package com.igexin.push.extension.distribution.basic.f;

import android.content.ContentValues;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.igexin.push.core.bean.BaseAction;
import java.io.File;
import java.io.FileOutputStream;

/* JADX INFO: loaded from: classes6.dex */
public class c extends d {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f63989g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private BaseAction f63990h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f63991i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private e f63992j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f63993k;

    public c(String str, String str2, String str3, BaseAction baseAction, int i10, e eVar) {
        super(str);
        this.f63990h = baseAction;
        this.f63989g = str3;
        this.f63991i = i10;
        this.f63992j = eVar;
        this.f63993k = str2;
    }

    private void a(String str) {
        File file = new File(com.igexin.push.extension.distribution.basic.c.e.f63971k);
        if (!file.exists()) {
            file.mkdirs();
        }
        File file2 = new File(com.igexin.push.extension.distribution.basic.c.e.f63971k + str + "/");
        if (file2.exists()) {
            return;
        }
        file2.mkdirs();
    }

    private void b(String str) {
        int i10 = this.f63991i;
        if (i10 == 2) {
            ((com.igexin.push.extension.distribution.basic.b.a) this.f63990h).n(str);
        } else {
            if (i10 != 8) {
                return;
            }
            ((com.igexin.push.extension.distribution.basic.b.a) this.f63990h).h(str);
        }
    }

    @Override // com.igexin.push.extension.distribution.basic.f.d
    public void a(Exception exc) {
        e eVar = this.f63992j;
        if (eVar != null) {
            eVar.a(exc);
        }
    }

    @Override // com.igexin.push.extension.distribution.basic.f.d
    public void a(byte[] bArr) throws Exception {
        this.f63999f = false;
        int i10 = Integer.parseInt(this.f63990h.getActionId());
        a(this.f63989g);
        String str = com.igexin.push.extension.distribution.basic.c.e.f63971k + this.f63989g + "/" + i10 + lg.a.f131412e + this.f63991i + ".bin";
        FileOutputStream fileOutputStream = new FileOutputStream(str);
        Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.PNG;
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
        if (bitmapDecodeByteArray != null) {
            bitmapDecodeByteArray.compress(compressFormat, 100, fileOutputStream);
            fileOutputStream.close();
            bitmapDecodeByteArray.recycle();
            b(str);
            this.f63999f = true;
            ContentValues contentValues = new ContentValues();
            contentValues.put("imageurl", this.f63993k);
            contentValues.put("imagesrc", str);
            contentValues.put("taskid", this.f63989g);
            contentValues.put("createtime", Long.valueOf(System.currentTimeMillis()));
            com.igexin.push.extension.distribution.basic.c.c.a().b().a("image", contentValues);
        } else {
            fileOutputStream.close();
            this.f63999f = false;
        }
        e eVar = this.f63992j;
        if (eVar != null) {
            if (this.f63999f) {
                eVar.a(this.f63990h);
            } else {
                eVar.a(new Exception("no target existed or downloading bitmap failed!"));
            }
        }
    }

    @Override // com.igexin.a.a.d.a.e
    public final int b_() {
        return 65557;
    }
}
