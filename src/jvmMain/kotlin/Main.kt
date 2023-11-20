import androidx.compose.foundation.layout.*
import androidx.compose.material.Checkbox
import androidx.compose.material.CheckboxDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.WindowPosition
import androidx.compose.ui.window.WindowState
import androidx.compose.ui.window.application
import data.PieData
import widget.LineChart
import widget.PieChart

val screenWidth = 600.dp
val screenHeight = 600.dp


fun main() = application {
    Window(
        onCloseRequest = ::exitApplication, state = WindowState(
            size = DpSize(screenWidth, screenHeight),
            position = WindowPosition(Alignment.BottomCenter)
        )
    ) {
        val dataList = listOf(
            PieData("2019",1065.33f, lineColor = "ffF2C371", groupName = "公司A"),
            PieData("2020",844.18f,lineColor = "ffF2C371", groupName = "公司A"),
            PieData("2021",241.96f,lineColor = "ffF2C371", groupName = "公司A"),
            PieData("2022",451.16f,lineColor = "ffF2C371", groupName = "公司A"),
            PieData("2023",641.96f,lineColor = "ffF2C371", groupName = "公司A")
        )
        val dataList1 = listOf(
            PieData("2019",765.33f,lineColor = "ff4E6FD7", groupName = "公司B"),
            PieData("2020",944.18f,lineColor = "ff4E6FD7",groupName = "公司B"),
            PieData("2021",441.96f,lineColor = "ff4E6FD7", groupName = "公司B"),
            PieData("2022",1051.16f,lineColor = "ff4E6FD7", groupName = "公司B"),
            PieData("2023",441.96f,lineColor = "ff4E6FD7", groupName = "公司B"),
        )
        val dataList2 = listOf(
            PieData("2019",365.33f,lineColor = "ffFF2BE7", groupName = "公司C"),
            PieData("2020",244.18f,lineColor = "ffFF2BE7", groupName = "公司C"),
            PieData("2021",541.96f,lineColor = "ffFF2BE7", groupName = "公司C"),
            PieData("2022",952.16f,lineColor = "ffFF2BE7", groupName = "公司C"),
            PieData("2023",1141.96f,lineColor = "ffFF2BE7", groupName = "公司C"),

            )
        val dataList3 = listOf(
            PieData("2019",1455.33f,lineColor = "ff43B988", groupName = "公司D"),
            PieData("2020",1844.18f,lineColor = "ff43B988", groupName = "公司D"),
            PieData("2021",941.96f,lineColor = "ff43B988", groupName = "公司D"),
            PieData("2022",752.16f,lineColor = "ff43B988", groupName = "公司D"),
            PieData("2023",241.96f,lineColor = "ff43B988", groupName = "公司D")
        )

        var checkState2 by remember { mutableStateOf(false) }
        var checkState3 by remember { mutableStateOf(false) }
        var checkState4 by remember { mutableStateOf(false) }
        Column(modifier = Modifier.fillMaxSize()) {
            Row(modifier = Modifier.fillMaxWidth(0.6f).height(50.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceAround) {
                Row(verticalAlignment = Alignment.CenterVertically){
                    Text(text="公司B")
                    Checkbox(checked = checkState2, onCheckedChange = {
                        checkState2 = it
                    }, modifier = Modifier.padding(5.dp).size(30.dp),colors = CheckboxDefaults.colors())
                }
                Row(verticalAlignment = Alignment.CenterVertically){
                    Text(text="公司C")
                    Checkbox(checked = checkState3, onCheckedChange = {
                        checkState3 = it
                    }, modifier = Modifier.padding(5.dp).size(30.dp),colors = CheckboxDefaults.colors())
                }
                Row(verticalAlignment = Alignment.CenterVertically){
                    Text(text="公司D")
                    Checkbox(checked = checkState4, onCheckedChange = {
                        checkState4 = it
                    }, modifier = Modifier.padding(5.dp).size(30.dp),colors = CheckboxDefaults.colors())
                }

            }
            val payloads = mutableListOf( dataList)
            if(checkState2)payloads.add(dataList1)
            if(checkState3)payloads.add(dataList2)
            if(checkState4)payloads.add(dataList3)
            LineChart(payloads, modifier = Modifier.fillMaxSize())
        }
    }
}
