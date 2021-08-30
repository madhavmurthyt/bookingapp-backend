/*
 * Copyright 2018-2019, https://beingtechie.io.
 *
 * File: CommonEntity.java
 * Date: May 5, 2018
 * Author: Thribhuvan Krishnamurthy
 */
package com.rudra.BookingApp.service.common.entity;

/**
 * Interface that need to be implemented by the entity classes.
 */
public interface CommonEntity {

    String SCHEMA = "vriddhi";

    @Override
    boolean equals(Object that);

    @Override
    int hashCode();

    @Override
    String toString();

}