package com.max.hbcoco.room.dao;

import androidx.room.c0;
import androidx.room.h;
import androidx.room.m;
import androidx.room.q0;
import dl.d;
import java.util.List;

/* JADX INFO: compiled from: ClassNameDao.kt */
/* JADX INFO: loaded from: classes9.dex */
@h
public interface a {
    @m
    void a(@d za.a... aVarArr);

    @d
    @q0("SELECT * FROM classnamedata WHERE name IN (:names)")
    List<za.a> b(@d int[] iArr);

    @c0(onConflict = 5)
    void c(@d List<za.a> list);

    @q0("DELETE FROM classnamedata")
    void clear();

    @c0(onConflict = 5)
    void d(@d za.a... aVarArr);

    @d
    @q0("SELECT * FROM classnamedata")
    List<za.a> getAll();
}
