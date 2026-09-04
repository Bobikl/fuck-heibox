package com.max.hbcommon.base.hblifeevent.fragment;

import androidx.fragment.app.FragmentManager;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;
import mh.c;
import mh.d;

/* JADX INFO: compiled from: HBFragmentLifeEvent.kt */
/* JADX INFO: loaded from: classes9.dex */
@Target({ElementType.TYPE})
@c(AnnotationRetention.RUNTIME)
@Retention(RetentionPolicy.RUNTIME)
@d(allowedTargets = {AnnotationTarget.CLASS})
public @interface b {
    Class<? extends FragmentManager.m>[] lifeEvents() default {};
}
