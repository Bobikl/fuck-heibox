package com.max.hbcommon.analytics;

import androidx.room.c0;
import androidx.room.q0;
import com.max.hbcommon.bean.analytics.PageEventEntity;
import java.util.List;

/* JADX INFO: compiled from: EventDao.kt */
/* JADX INFO: loaded from: classes9.dex */
@androidx.room.h
public interface a {
    @c0
    void a(@dl.d PageEventEntity... pageEventEntityArr);

    @q0("DELETE FROM page_event")
    void b();

    @androidx.room.m
    void c(@dl.d PageEventEntity... pageEventEntityArr);

    @c0
    void d(@dl.d PageEventEntity pageEventEntity);

    @androidx.room.m
    void e(@dl.d PageEventEntity[] pageEventEntityArr);

    @dl.d
    @q0("SELECT * FROM page_event")
    kotlinx.coroutines.flow.e<List<PageEventEntity>> f();

    @dl.d
    @q0("SELECT * FROM page_event")
    List<PageEventEntity> getAll();
}
