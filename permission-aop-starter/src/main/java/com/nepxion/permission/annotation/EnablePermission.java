package com.nepxion.permission.annotation;

/**
 * <p>Title: Nepxion Permission</p>
 * <p>Description: Nepxion Permission</p>
 * <p>Copyright: Copyright (c) 2017-2050</p>
 * <p>Company: Nepxion</p>
 * @author Haojun Ren
 * @version 1.0
 */

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.springframework.context.annotation.Import;

import com.nepxion.permission.aop.PermissionImportSelector;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@Import(PermissionImportSelector.class)
public @interface EnablePermission {

}