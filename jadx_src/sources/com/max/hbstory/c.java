package com.max.hbstory;

import android.content.Context;
import androidx.lifecycle.y;
import com.max.hbstory.bean.StoryPageItemInfoObj;
import java.util.Map;
import kotlin.b2;
import yh.l;

/* JADX INFO: compiled from: IStoryService.kt */
/* JADX INFO: loaded from: classes13.dex */
public interface c {
    @dl.e
    io.reactivex.disposables.a a();

    void b(@dl.d Context context, @dl.e String str, @dl.e String str2, @dl.d yh.a<b2> aVar, @dl.d l<? super Throwable, b2> lVar);

    void c(@dl.e String str, @dl.e String str2, @dl.d yh.a<b2> aVar, @dl.d l<? super Throwable, b2> lVar);

    void d(@dl.e String str, @dl.e String str2, @dl.d yh.a<b2> aVar, @dl.d l<? super Throwable, b2> lVar);

    void e(@dl.d Context context, @dl.e String str, @dl.e String str2, @dl.e String str3, @dl.d yh.a<b2> aVar, @dl.d l<? super Throwable, b2> lVar);

    void f(@dl.e String str, @dl.e String str2, @dl.e String str3, @dl.e Map<String, String> map, @dl.d yh.a<b2> aVar, @dl.d l<? super Throwable, b2> lVar);

    void g(@dl.e String str, @dl.e String str2, @dl.d yh.a<b2> aVar, @dl.d l<? super Throwable, b2> lVar);

    void h(@dl.e e eVar, @dl.d l<? super StoryPageItemInfoObj, b2> lVar, @dl.d l<? super Throwable, b2> lVar2);

    void i(@dl.d y yVar);

    void j(@dl.d Context context, @dl.e String str, @dl.e String str2, @dl.d yh.a<b2> aVar, @dl.d l<? super Throwable, b2> lVar);
}
