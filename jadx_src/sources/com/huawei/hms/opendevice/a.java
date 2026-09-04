package com.huawei.hms.opendevice;

import android.content.Context;
import com.huawei.hms.aaid.constant.ErrorEnum;
import com.huawei.hms.aaid.entity.AAIDResult;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: AAIDCallable.java */
/* JADX INFO: loaded from: classes7.dex */
public class a implements Callable<AAIDResult> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f61144a;

    public a(Context context) {
        this.f61144a = context;
    }

    @Override // java.util.concurrent.Callable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public AAIDResult call() throws Exception {
        Context context = this.f61144a;
        if (context == null) {
            throw ErrorEnum.ERROR_ARGUMENTS_INVALID.toApiException();
        }
        String strC = b.c(context);
        AAIDResult aAIDResult = new AAIDResult();
        aAIDResult.setId(strC);
        return aAIDResult;
    }
}
