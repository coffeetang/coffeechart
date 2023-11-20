package data

import androidx.compose.ui.graphics.Color

data class PieData(
    val name:String,
    val amount:Float,
    val color:String = "ffff0000",
    val lineColor:String = "ff000000",
    val groupName:String = ""
)