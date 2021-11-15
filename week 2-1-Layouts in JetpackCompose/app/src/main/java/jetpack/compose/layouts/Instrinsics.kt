package jetpack.compose.layouts

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Divider
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import jetpack.compose.layouts.ui.theme.LayoutsTheme

@Composable
fun TwoTexts(modifier: Modifier = Modifier, text1: String, text2: String) {
    Row(modifier = modifier.height(IntrinsicSize.Max)) {
        Text(
            modifier = Modifier
                .weight(1f)
                .padding(start = 4.dp),
            text = text1
        )

        Divider(
            color = Color.Black, modifier = Modifier
                .fillMaxHeight()
                .width(1.dp)
        )
        Text(
            modifier = Modifier
                .background(Color.Red.copy(0.3f))
                .weight(1f)
                .height(50.dp)
                .padding(end = 4.dp)
                .wrapContentWidth(Alignment.Start, true),

            text = text2
        )
    }
}

@Preview
@Composable
fun TwoTextsPreview() {
    LayoutsTheme() {
        Surface {
            TwoTexts(text1 = "Hi", text2 = "there is skfjaslkfjkalsfjkasljflaksjfklasjfklasjflajslkfjaslfjlasdjflaksjflkasjflaskjfas")
        }
    }
}