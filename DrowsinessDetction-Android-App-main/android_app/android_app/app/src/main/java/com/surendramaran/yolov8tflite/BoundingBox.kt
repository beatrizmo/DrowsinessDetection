package com.surendramaran.yolov8tflite

data class BoundingBox(
    val x1: Float,
    val y1: Float,
    val x2: Float,
    val y2: Float,
    val cx: Float,
    val cy: Float,
    val w: Float,
    val h: Float,
    val cnf: Float, //confiança
    val cls: Int,   //drowsy, awake
    val clsName: String //DROWSY OR AWAKE
)