package com.gb.stopwatch.model

interface TimestampProvider {
    fun getMilliseconds(): Long
}