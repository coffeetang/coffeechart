import androidx.compose.ui.Alignment
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.WindowPosition
import androidx.compose.ui.window.WindowState
import androidx.compose.ui.window.application
import data.PieData
import widget.PieChart

val screenWidth = 800.dp
val screenHeight = 800.dp


fun main() = application {
    Window(
        onCloseRequest = ::exitApplication, state = WindowState(
            size = DpSize(screenWidth, screenHeight),
            position = WindowPosition(Alignment.BottomCenter)
        )
    ) {
        val dataList = listOf(
            PieData("item1",1065.33f,"ffF2C371"),
            PieData("item2",844.18f,"ffEF5E47"),
            PieData("item3",241.96f,"ff4E6FD7"),
            PieData("item4",451.16f,"ff43B988"),
            PieData("item5",641.96f,"ffFF2BE7")
        )
        val dataList1 = listOf(
            PieData("item1",765.33f,"ffF2C371"),
            PieData("item2",944.18f,"ffEF5E47"),
            PieData("item3",341.96f,"ff4E6FD7"),
            PieData("item4",1051.16f,"ff43B988"),
            PieData("item5",441.96f,"ffC0C0C0"),
            PieData("item6",141.96f,"ffFF2BE7")
        )
        val dataList2 = listOf(
            PieData("item1",365.33f,"ffF2C371"),
            PieData("item2",244.18f,"ffEF5E47"),
            PieData("item3",541.96f,"ff4E6FD7"),
            PieData("item4",952.16f,"ff43B988"),
            PieData("item5",1141.96f,"ffFF2BE7"),
            PieData("item6",441.96f,"ffC0C0C0")

        )
        val dataList3 = listOf(
            PieData("item1",1065.33f,"ffF2C371"),
            PieData("item2",1844.18f,"ffEF5E47"),
            PieData("item3",541.96f,"ff4E6FD7"),
            PieData("item4",752.16f,"ff43B988"),
            PieData("item5",241.96f,"ffFF2BE7")
        )

        PieChart(listOf(dataList,dataList1,dataList2,dataList3))
    }
}
